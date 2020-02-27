package JavaMind.week2;

import java.util.Scanner;

public class DNAList_2_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=sc.nextInt();
        int sz=str.length();//字符串总长度
        int[] count=new int[sz-len];
        int max=0;
        for(int i=0;i<sz-len;i++){
            String substr=str.substring(i,i+len);
            for(int j=0;j<len;j++){
                if(substr.charAt(j)=='C'||substr.charAt(j)=='G'){
                    count[i]++;
                }
            }
            if(count[max]<count[i]){
                max=i;
            }
        }
        String res=str.substring(max,max+len);
        System.out.println(res);
    }
}
