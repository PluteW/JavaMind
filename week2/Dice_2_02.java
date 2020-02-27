package JavaMind.week2;

import java.util.Scanner;

public class Dice_2_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int[] d = {1,2,3,4,5,6};
        int tem;
        for (char c: chars){
            if(c == 'L'){
                tem = d[4];
                d[4] = d[1];
                d[1] = d[5];
                d[5] = d[0];
                d[0] = tem;
            }else if ( c == 'R'){
                tem = d[4];
                d[4] = d[0];
                d[0] = d[5];
                d[5] = d[1];
                d[1] = tem;
            }else if ( c == 'F'){
                tem = d[4];
                d[4] = d[3];
                d[3] = d[5];
                d[5] = d[2];
                d[2] = tem;
            }else if ( c == 'B'){
                tem = d[4];
                d[4] = d[2];
                d[2] = d[5];
                d[5] = d[3];
                d[3] = tem;
            }else if ( c == 'A'){
                tem = d[2];
                d[2] = d[0];
                d[0] = d[3];
                d[3] = d[1];
                d[1] = tem;
            }else if ( c == 'C'){
                tem = d[2];
                d[2] = d[1];
                d[1] = d[3];
                d[3] = d[0];
                d[0] = tem;
            }
        }
        for (int i = 0; i<d.length;i++) {
            System.out.print(d[i]);
            if (i != 5)
                System.out.print(" ");
        }
    }
}
