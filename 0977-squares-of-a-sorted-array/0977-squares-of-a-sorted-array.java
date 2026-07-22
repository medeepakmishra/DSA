class Solution {
    public int[] sortedSquares(int[] nums) {

        int i = 0;
        int j = nums.length-1;
        int k =j;
        int []result = new int[j+1];

        while(i<=j){
            if( Math.abs(nums[i]) >= Math.abs(nums[j])){
                result[k]= nums[i]*nums[i];
                i++;
                k--;
                
            }else{
                result[k] = nums[j]*nums[j];
                k--;
                j--;
            }
        }
        
        return result;
    }
}