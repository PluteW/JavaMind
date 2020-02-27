package JavaMind.week1;

import java.util.Arrays;
import java.util.Scanner;

public class BottomN_1_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int count = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
            if (i!=n-1)
                System.out.print(" ");
        }
    }
}
