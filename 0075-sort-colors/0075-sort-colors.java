class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int l =0, m=0;
        int h = n-1;

        while(m<=h){
            if(nums[m] ==0){
                // swap with low
                int temp = nums[l];
                nums[l]= nums[m];
                nums[m]= temp;
                l++;
                m++;
            }else if( nums[m]==2){
                // swap with high
                int temp = nums[h];
                nums[h]= nums[m];
                nums[m]=temp;
                h--;
            }else{
                m++;

            }
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna