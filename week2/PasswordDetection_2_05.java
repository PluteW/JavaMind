package JavaMind.week2;

import java.util.Scanner;

public class PasswordDetection_2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordDetection_2_05 detection = new PasswordDetection_2_05();
        String string;
        while (scanner.hasNextLine()){
            string = scanner.nextLine();
            if (detection.lenghQualified(string)){
                if (detection.trickQualified(string)){
                    if (detection.repeatQualified(string)){
                        System.out.println("OK");
                        continue;
                    }
                    System.out.println("NG");
                    continue;
                }
                System.out.println("NG");
                continue;
            }
            System.out.println("NG");
        }
    }
    private boolean lenghQualified(String pass){
        if (pass.length()>=8)
            return true;
        return false;
    }
    private boolean trickQualified(String pass){
        int numCount = 0;
        int lowerCount = 0;
        int uperCount = 0;
        int other = 0;
        for (char c :pass.toCharArray()){
            if ( numCount == 0 && Character.isDigit(c)){
                numCount = 1;
                continue;
            }else if ( uperCount == 0 && Character.isUpperCase(c)){
                uperCount = 1;
                continue;
            }else if ((lowerCount == 0 && Character.isLowerCase(c))){
                lowerCount = 1;
                continue;
            }else if (other == 0){
                other = 1;
            }

            if (numCount + lowerCount + uperCount + other >2)
                return true;
        }
        return false;
    }
    private boolean repeatQualified(String pass){
        int len = pass.length();
        String s1;
        String s2;
        for (int i = 0;i<len-2;i++){
            s1 = pass.substring(i,i+2);
            s2 = pass.substring(i+2,len);
            if (s2.contains(s1))
                return false;
        }
        return true;
    }
}
