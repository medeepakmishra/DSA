class Solution {
    public boolean isPalindrome(int x) {

        int reverse = 0;
        int original = x;



        while(x>0){
            reverse = reverse*10;
            reverse = reverse + x%10;
            x = x/10;

        };

       if(original == reverse){
            return true;
        }else{
            return false;
        }
        
    }
}