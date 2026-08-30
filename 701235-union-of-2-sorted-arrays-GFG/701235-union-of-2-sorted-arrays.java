import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] > b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
            }
        }

        // Add remaining elements from a[]
        while (i < a.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }

        // Add remaining elements from b[]
        while (j < b.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }

        return list;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna