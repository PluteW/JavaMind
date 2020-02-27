package JavaMind.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encrypt1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        List<String> strings = new ArrayList<>();
        while (num>0){
            String s = sc.nextLine();
            strings.add(s);
            num--;
        }
        for (String s : strings){
            char[] chars = s.toCharArray();
            for (int i = 0;i<chars.length;i++){
                char c = chars[i];
                if (65<= c && c<=90){
                    chars[i] = (char) ('A' + ((c +1 - 'A') % 26));
                } else if (97<= c && c<=122){
                    chars[i] = (char) ('a' + ((c +1 - 'a') %  26));
                }
            }
            String ret = new String(chars);
            System.out.println(ret);
        }
    }
}
