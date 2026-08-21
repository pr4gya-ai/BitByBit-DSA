# Fibonacci Number
 
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)](https://leetcode.com/problems/fibonacci-number)
 
**LeetCode Link:** [https://leetcode.com/problems/fibonacci-number](https://leetcode.com/problems/fibonacci-number)
 
## Problem
 
The **Fibonacci numbers**, commonly denoted `F(n)`, form a sequence called the **Fibonacci sequence**, such that each number is the sum of the two preceding ones, starting from `0` and `1`. That is:
 
```
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
```
 
Given `n`, calculate `F(n)`.
 
## Examples
 
**Example 1:**
```
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```
 
**Example 2:**
```
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
```
 
**Example 3:**
```
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
```
 
## Constraints
 
- `0 <= n <= 30`
## Solution
 
```javascript
/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    // Base case: F(0) = 0, F(1) = 1
    if (n <= 1) return n;
 
    // Iteratively build up the sequence using two variables
    // instead of storing the whole array — O(1) space
    let prev = 0;   // F(i-2)
    let curr = 1;   // F(i-1)
 
    for (let i = 2; i <= n; i++) {
        let next = prev + curr;  // F(i) = F(i-1) + F(i-2)
        prev = curr;
        curr = next;
    }
 
    return curr;
};
```
 
### Explanation
 
Since `F(n)` only depends on the previous two values, there's no need for recursion or an array — just two rolling variables (`prev` and `curr`) updated as we iterate from `i = 2` up to `n`. At each step, `curr` becomes the new Fibonacci number, and `prev` shifts up to what `curr` used to be.
 
**Walkthrough for n = 4:**
```
i=2: next = 0+1 = 1 → prev=1, curr=1
i=3: next = 1+1 = 2 → prev=1, curr=2
i=4: next = 1+2 = 3 → prev=2, curr=3
return curr → 3 ✅
```
 
### Complexity
 
| Metric | Complexity | Notes |
|--------|-----------|-------|
| Time   | `O(n)`    | Single loop from `2` to `n` |
| Space  | `O(1)`    | Only two variables tracked, no recursion stack or array |
