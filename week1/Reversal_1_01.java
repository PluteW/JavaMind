package JavaMind.week1;

import java.util.Scanner;

public class Reversal_1_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String ret = new StringBuffer(s).reverse().toString();
        System.out.println(ret);
    }
}
