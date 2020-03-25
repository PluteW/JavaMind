package JavaMind.week3;

import java.util.HashMap;
import java.util.Scanner;

public class scaleTurn_3_06 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s;
//        HashMap<Character,Integer> map = new HashMap<>();
//        for (int i = 0;i<6;i++){
//            map.put((char) ('A'+i),10+i);
//        }
//
//        while (scanner.hasNextLine()){
//            s = scanner.nextLine();
//            System.out.println(s);
//            StringBuilder stringBuilder = new StringBuilder();
//            int add = 0;
//            int t = 0;
//            int u = 0;
//            char c;
//            for (int i = s.length()-1;i>1;i--){
//                c = s.charAt(i);
//                if (map.containsKey(c)){
//                    t = map.get(c)+add;
//                    add = t/10;
//                    u = t%10;
//                }else {
//                    t = c-'0'+add;
//                    add = t/10;
//                    u = t%10;
//                }
//                c = (char) ('0'+u);
//                stringBuilder = stringBuilder.insert(0,c);
//            }
//            if (add != 0){
//                c = (char)('0'+add);
//                stringBuilder = stringBuilder.insert(0,c);
//            }
//            System.out.println(stringBuilder.toString());
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<6;i++){
            map.put((char) ('A'+i),10+i);
        }

        while (scanner.hasNextLine()){
            s = scanner.nextLine();
            int ret = 0;
            int t = 0;
            int d = -1;
            for (int i = s.length()-1;i>1;i--){
                char c = s.charAt(i);
                d++;
                if (map.containsKey(c)) {
                    t = map.get(c);
                }else {
                    t = c-'0';
                }
                ret += Math.pow(16,d)*t;
            }
            System.out.println(ret);
        }
    }
}
