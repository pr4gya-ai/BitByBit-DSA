/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumDifference = function(nums) {
    let maxProfit=0;

    for(let i=0; i<nums.length; i++){
        for(let j=i+1; j<nums.length; j++){
            let findProfit= nums[j]-nums[i]
            if(findProfit > maxProfit){
                maxProfit = findProfit;
            }
        }
    }
    return maxProfit === 0 ? -1 : maxProfit;
};