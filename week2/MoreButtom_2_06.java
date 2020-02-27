package JavaMind.week2;

import java.util.Scanner;

public class MoreButtom_2_06 {
    public static void main(String[] args) {
        Scanner scnner = new Scanner(System.in);
        while (scnner.hasNextInt()){
            int countEmpty = scnner.nextInt();
            int countBuy = countEmpty/3;
            countEmpty = countEmpty - 2*countBuy;
            while (countEmpty>=3){
                int change = countEmpty/3;
                countBuy += change;
                countEmpty -= 2*change;
            }
            if (countEmpty == 2)
                countBuy++;
            if (countBuy != 0)
                System.out.print(countBuy+" ");
        }
    }
}
