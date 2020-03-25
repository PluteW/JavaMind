package JavaMind.week3;

import java.util.Scanner;

public class jumpMax_3_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0 || n == 1){
            System.out.println("true");
            return;
        }
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        boolean[] ret = new boolean[n];
        int minLen = n-1;
        for (int i = n-2;i>-1;i--){
            if (i+nums[i]>=minLen){
                ret[i] = true;
                minLen = i;
            }
        }
        System.out.println(ret[0]);
    }
}
