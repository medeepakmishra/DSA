class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i =0;i<n-1;i++){

            for(int j =0; j<n-1-i;j++){
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]= temp;

                }
            }


           
        }

        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna