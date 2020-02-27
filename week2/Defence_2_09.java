package JavaMind.week2;

import java.util.Scanner;

/**
 *      此代码有问题
 *      没问题了
 * */
public class Defence_2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] heights = new int[count];
        for (int i = 0;i<count;i++){
            heights[i] = scanner.nextInt();
        }
        int[] clause = new int[count];
        clause[0] = heights[0];
        int end = 0;
        for (int i = 0;i<heights.length;i++){
            int left = 0;
            int right = end+1;
            while (left<right){
                int mid = (left+right) >>> 1;
                if (clause[mid] >= heights[i] )
                    left = mid+1;
                else
                    right = mid;
            }
            clause[left] = heights[i];
            if (left == end+1){
                end++;
            }
        }
        System.out.println(end);
    }
}
