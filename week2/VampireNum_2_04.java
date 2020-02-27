package JavaMind.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VampireNum_2_04 {
    public static void main(String[] args) {
        String[] strings_1 = null;
        String[] strings_2 = null;
        List <Integer> list = new ArrayList();
        int tem;
        for (int i = 10;i<100;i++){
            for (int j = i+1; j< 100;j++) {
                tem = i*j;
                if ( tem >= 10000 || tem < 1000)
                    continue;
                strings_1 = (String.valueOf(i)+String.valueOf(j)).split("");
                strings_2 = String.valueOf(tem).split("");
                Arrays.sort(strings_1);
                Arrays.sort(strings_2);
                if (Arrays.equals(strings_1,strings_2))
                    list.add(tem);
            }
        }
        Collections.sort(list);
        for (int k : list){
            System.out.print(k);
            System.out.print(" ");
        }
    }
}
