/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function(nums) {
    const n = nums.length;
    const v = new Array(n+1).fill(0);
    let m = 0 , d =0;
    for(const num of nums)
    {
        v[num]++;
    }
    for(let i =0;i<v.length;i++)
    {
        if(v[i]==2)
        d=i
        if(v[i]==0)
        m=i
    }
    return [d, m];

};