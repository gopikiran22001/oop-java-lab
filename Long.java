import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Scratch {

    public static List<Integer> findLIS(ArrayList<Integer> nums) {
        int n = nums.size();
        int[] dp = new int[n];
        int[] prev = new int[n];
        int maxLength = 1;
        int endIndex = 0;
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums.get(i) > nums.get(j) && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                endIndex = i;
            }
        }

        List<Integer> lis = new ArrayList<>();
        for (int i = endIndex; i >= 0; i = prev[i]) {
            lis.add(nums.get(i));
            if (prev[i] == -1) break;
        }


        Collections.reverse(lis);
        return lis;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 10, 22, 9, 33, 21, 50, 41, 60, 80);
        System.out.println("Longest Increasing Subsequence: " + findLIS(nums));
    }
}
