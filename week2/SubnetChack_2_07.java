package JavaMind.week2;

import java.util.Scanner;

public class SubnetChack_2_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maskCode = scanner.nextLine();
        String id1 = scanner.nextLine();
        String id2 = scanner.nextLine();
        String[] maskCodes = maskCode.trim().split("\\.");
        String[] id1s = id1.trim().split("\\." );
        String[] id2s = id2.trim().split("\\.");

        for (int i = 0;i< maskCodes.length;i++){
            id1s[i] = String.valueOf(Integer.parseInt(id1s[i]) & Integer.parseInt(maskCodes[i]));
            id2s[i] = String.valueOf(Integer.parseInt(id2s[i]) & Integer.parseInt(maskCodes[i]));
            if ( !id1s[i].equals(id2s[i]) ){
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
        return;
    }
}
