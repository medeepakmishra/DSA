class Solution {
    public int maxArea(int[] height) {

        int max = 0;
        int i=0, j=height.length-1;

        while(i<j){
           int width = j-i;
           int ht = Math.min(height[i],height[j]);
           int currentWater = width*ht;
           max = Math.max(max, currentWater);
           
           if(height[i]<height[j]){
            i++;
           }else{
            j--;
           }




        }

        return max;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna