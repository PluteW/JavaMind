package JavaMind.week2;

import java.util.Arrays;
import java.util.Scanner;

public class FindSum_2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] nums = new int[n];
        while (--n>-1){
            nums[n] = scanner.nextInt();
        }
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length-1;i++){
            int left = 0;
            int right = nums.length-1;
            if (sum == 3*nums[i]){
                System.out.print("Y");
                return;
            }
            while (left < i && right>i){
                if (nums[i] + nums[left] + nums[right] == sum){
                    System.out.print("Y");
                    return;
                }else if (right>left && nums[i] + nums[left] + nums[right] > sum){
                    right--;
                }else if (left<right && nums[i] + nums[left] + nums[right] <sum) {
                    left++;
                }
            }
        }
        System.out.print("N");
    }
}
