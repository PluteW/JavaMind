package JavaMind.week1;

import java.util.Arrays;
import java.util.Scanner;

public class FindFriends_1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] d = new int[m][n];
        for (int i = 0;i<n;i++){
            int t = sc.nextInt();
            d[t-1][i] = 1;
        }
        int[] N = new int[n];
        int[] M = new int[m];
        Arrays.fill(N,-1);
        Arrays.fill(M,-1);
        for (int i = 0; i<m;i++){
            for (int j = 0;j<n;j++){
                if (d[i][j] == 1){
                    N[j] = i;
                    M[i]++;
                }
            }
        }
        for (int i : N){
            if (M[i] <=0 ){
                System.out.println("BeiJu");
            }else {
                System.out.println(1);
            }
        }
    }
}
