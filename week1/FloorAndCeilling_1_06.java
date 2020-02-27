package JavaMind.week1;

import java.util.Scanner;

public class FloorAndCeilling_1_06 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            double d = Double.parseDouble(s);
            double t = d*10;
            if (d%10>=5){
                System.out.println((int)d+1);
            }else {
                System.out.println((int)d);
            }
    }
}
