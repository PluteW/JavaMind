package JavaMind.week3;

import java.util.Scanner;

public class studentScore_3_04 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//            String s = scanner.nextLine();
//            String[] strs = s.trim().split(" ");
//            int N = Integer.parseInt(strs[0]);
//            int M = Integer.parseInt(strs[1]);
//            int[] nums = new int[N];
//            s = scanner.nextLine();
//            strs = s.trim().split(" ");
//            for (int i = 0;i<N;i++){
//                nums[i] = Integer.parseInt(strs[i]);
//            }
//            int index;
//            int begin;
//            int end;
//            int max = 0;
//            for (int i = 0;i<M;i++){
//                s = scanner.nextLine();
//                strs = s.trim().split(" ");
//                if (strs[0].equals("Q")){
//                    max = 0;
//                    begin = Integer.parseInt(strs[1]);
//                    end = Integer.parseInt(strs[2]);
//                    for (int j = begin;j<end+1;j++){
//                        if (nums[j-1] > max)
//                            max = nums[j-1];
//                    }
//                    System.out.print(max);
//                }else {
//                    index = Integer.parseInt(strs[1])-1;
//                    nums[index] = Integer.parseInt(strs[2]);
//                }
//            }
//    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ns=scan.nextInt();
        int m=scan.nextInt();
        int[] sscore=new int[ns];
        for(int i=0;i<ns;i++){
            sscore[i]=scan.nextInt();
        }

        for(int j=0;j<m;j++){
            char option;
            int a,b=0;
            option=scan.next().charAt(0);
            a=scan.nextInt();
            b=scan.nextInt();
            int temp=0;
            if(a>b){
                temp=a;
                a=b;
                b=temp;
            }
            switch(option){
                case 'Q':
                    int max=0;
                    for(int i=a-1;i<b;i++)
                    {
                        if(max<sscore[i])
                            max=sscore[i];
                    }
                    System.out.print(max+" ");
                    break;
                case 'U':
                    sscore[a-1]=b;
                    break;
            }
        }
    }
}
