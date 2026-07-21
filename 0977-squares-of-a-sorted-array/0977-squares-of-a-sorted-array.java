class Solution {
    public int[] sortedSquares(int[] nums) {
        

        int j = nums.length-1;
        int i=0;
        int [] result = new int[nums.length];
        int k = nums.length-1;
        while(i<=j){
            if(Math.abs(nums[i]) >Math.abs(nums[j])){
                result[k]=nums[i] * nums[i];
                i++;
              
                k--;
            }else{
              result[k] = nums[j]*nums[j];
                j--;
                k--;

            }

        }

        return result;


    }
}