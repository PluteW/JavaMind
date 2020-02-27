package JavaMind.week2;

import java.util.Arrays;
import java.util.Scanner;

public class BeautyContest_2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] beautysScore = new int[num];
        for (int i = 0; i<num; i++){
            beautysScore[i] = scanner.nextInt();
        }
        int[] copybeautysScore = Arrays.copyOf(beautysScore,beautysScore.length);
        Arrays.sort(copybeautysScore);
        int max = copybeautysScore[copybeautysScore.length-1];
        int[] scores = new int[max+1];
        for (int i : beautysScore){
            scores[i] = 1;
        }
        for (int i = scores.length-2;i>0;i--){
            scores[i] += scores[i+1];
        }
        for (int i:beautysScore){
            System.out.print(scores[i]+" ");
        }
    }
}
