class Solution {
    public int maxArea(int[] height) {

        int i = 0, j=height.length-1, area = 0,currentArea =0;

        while(i<j){

            if(height[i]>height[j]){

                currentArea= height[j]*(j-i);
                area = Math.max(area, currentArea);
                j--;

            }else{
                
                currentArea= height[i]*(j-i);
                area = Math.max(area, currentArea);
                i++;

            }

        }

        return area;




        
    }
}