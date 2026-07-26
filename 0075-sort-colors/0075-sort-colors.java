class Solution {
    public void sortColors(int[] nums) {
        int zero =0, one =0, two =0;

        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==0){
                zero= zero+1;
            }else if(nums[i]==1){
                one = one+1;
            }else{
                two = two +1;
            }
        }

        int i = 0;

while (zero > 0) {
    nums[i++] = 0;
    zero--;
}

while (one > 0) {
    nums[i++] = 1;
    one--;
}

while (two > 0) {
    nums[i++] = 2;
    two--;
}


        
    }
}