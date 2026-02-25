/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map = new Map();
    for (let i = 0; i < nums.length; i++) {
        map.set(nums[i], i);
    }
    for (let i = 0; i < nums.length; i++) {
        const needed = target - nums[i];
        if (map.has(needed) && map.get(needed) != i) {
            return [i, map.get(needed)]
        }
    }
    return [];    
};