import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;   // ✅ must declare before while loop

        
        
       while(i<a.length&& j<b.length){
           
           if(a[i]==b[j]){
               list.add(a[i]);
               i++;
               j++;

           }else if(a[i]>b[j]){
               j++;
               
           }else {
               i++;
           }
       }
       
       return list;






    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna