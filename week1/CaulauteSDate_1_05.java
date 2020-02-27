package JavaMind.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaulauteSDate_1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        List<String> datas = new ArrayList<>();
        while (true){
            if (!sc.hasNextInt())
                break;
            string = sc.nextLine();
            datas.add(string);
        }
        int[] days = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        StringBuilder stringBuilder;
        for (String s: datas){
            String[] strings = s.split(" ");
            int year = Integer.parseInt(strings[0]);
            int month = 1;
            int day = Integer.parseInt(strings[1]);
            if ((((year%4 == 0) && (year%100 != 0)) || (year%400 == 0))) days[2] = 29;
            else days[2] = 28;

            for (int i = 1;i<13;i++){
                if (day>days[i]){
                    day -= days[i];
                }else {
                    month = i;
                    break;
                }
            }
            stringBuilder = new StringBuilder(year+"-");
            if (month<10){
                stringBuilder.append("0");
            }
            stringBuilder.append(month);
            stringBuilder.append("-");
            if (day<10){
                stringBuilder.append(0);
            }
            stringBuilder.append(day);
            System.out.println(stringBuilder.toString());
        }
    }
}
