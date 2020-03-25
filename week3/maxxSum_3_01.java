package JavaMind.week3;

import java.util.Scanner;

public class maxxSum_3_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        int max = nums[0];
        int currMax = nums[0];
        int[] ret =  new int[n];
        for (int i = 1; i<n;i++){
            currMax = Math.max(nums[i],currMax+nums[i]);
            max = Math.max(currMax,max);
        }
        System.out.println(max);
    }
}
