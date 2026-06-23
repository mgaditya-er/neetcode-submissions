class Solution {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        int res=0;
        for(int i=0;i<size;i++){
            res = res^nums[i];
        }

        return res;
    }
}
