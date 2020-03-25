package JavaMind.week3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class deEmphasisAndSort_3_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0;i<n;i++){
            nums = scanner.nextInt();
            set.add(nums);
        }
        for (int i : set){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
