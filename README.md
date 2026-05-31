# DSA Solutions — Java

> LeetCode problem solutions written in Java, organised by topic.
> Clean code with inline comments explaining the thought process and complexity.

[![LeetCode](https://img.shields.io/badge/LeetCode-pragya__singh21-FFA116?style=flat&logo=leetcode&logoColor=white)](https://leetcode.com/u/pragya_singh21/)
[![Solved](https://img.shields.io/badge/Solved-107%2F3944-brightgreen?style=flat)](https://leetcode.com/u/pragya_singh21/)
[![Max Streak](https://img.shields.io/badge/Max%20Streak-19%20days-blue?style=flat)](https://leetcode.com/u/pragya_singh21/)

---

## LeetCode stats

| Metric | Count |
|--------|-------|
| Total solved | **107** |
| Easy | 70 |
| Medium | 36 |
| Hard | 1 |
| Active days (past year) | 79 |
| Max streak | 19 days |
| Submissions (past year) | 205 |

> 50 Days Badge 2026 earned — consistent daily problem solving habit.

---

## Progress by topic

| Topic | Solved | Difficulty range |
|-------|--------|-----------------|
| Arrays & Hashing | 20+ | Easy – Medium |
| Strings | 15+ | Easy – Medium |
| Two Pointers | 8+ | Easy – Medium |
| Sliding Window | 6+ | Medium |
| Linked Lists | 8+ | Easy – Medium |
| Binary Search | 6+ | Medium |
| Trees & BST | 10+ | Medium |
| Dynamic Programming | 8+ | Medium – Hard |
| Stack & Queue | 6+ | Easy – Medium |

---

## Repo structure

```
/arrays
  - two-sum.java
  - best-time-to-buy-stock.java
  - contains-duplicate.java
  - maximum-subarray.java

/strings
  - valid-anagram.java
  - longest-common-prefix.java
  - reverse-string.java

/linked-lists
  - reverse-linked-list.java
  - merge-two-sorted-lists.java

/trees
  - binary-tree-inorder.java
  - maximum-depth-binary-tree.java

/dynamic-programming
  - climbing-stairs.java
  - coin-change.java
```

---

## How I approach each problem

1. **Understand constraints** — read time/space complexity requirements before touching code
2. **Brute force first** — get a working solution, understand why it's slow
3. **Optimise** — identify the right data structure (HashMap, stack, sliding window etc.)
4. **Complexity analysis** — write Big-O time and space in comments above every solution
5. **Edge cases** — empty input, single element, negative numbers, duplicates

---

## Example solution format

```java
// Problem: Two Sum
// Approach: HashMap for O(n) lookup instead of nested loops
// Time: O(n) | Space: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## Goals

- [ ] Reach 150 solved problems
- [ ] Complete NeetCode 150 roadmap
- [ ] Solve 1 Medium problem every day
- [ ] Beat rank 1,000,000 on LeetCode

---

Pragya Singh · MERN Stack Developer · [LinkedIn](https://linkedin.com/in/pragya-singh-44a91b325) · [LeetCode](https://leetcode.com/u/pragya_singh21/) · [GitHub](https://github.com/pr4gya-ai)
