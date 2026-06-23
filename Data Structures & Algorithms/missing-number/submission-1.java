class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int temp=0;
        for(int i=0;i<len+1;i++){
            temp = temp^i;
        }
        for(int i=0;i<len;i++){
            temp = temp^nums[i];
        }

        return temp;   
    }
}
