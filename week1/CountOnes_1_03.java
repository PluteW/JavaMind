package JavaMind.week1;

import java.util.Scanner;

public class CountOnes_1_03 {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        int n = scnner.nextInt();
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int ret = 0;
        for (char c : chars){
            if (c == '1'){
                ret++;
            }
        }
        System.out.print(ret);
    }
}
