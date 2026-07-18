class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int k = 0;

        for( int i=0; i<n; i++){
            
            if(nums[i]==0){
                k = i+1;


                 for(int  j=k; j<n; j++){

            if( nums[j] != 0){
            int temp = nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            break;
            }


           }
            }
           
          
        }
        
    }
}