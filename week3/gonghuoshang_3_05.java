package JavaMind.week3;

import java.util.*;

public class gonghuoshang_3_05 {
    public static void main(String[] args) {
        gonghuoshang_3_05 Solution = new gonghuoshang_3_05();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.trim().split(" ");
        int N = Integer.parseInt(strings[0]);
        int M = Integer.parseInt(strings[1]);
        List<Provider> providers = new LinkedList<>();
        Shop[] shops = new Shop[M];
        List<List<Integer>> ret = new LinkedList<>();
        for (int i = 0 ;i<N;i++){
            s = scanner.nextLine();
            strings = s.trim().split(" ");
            Provider p = Solution.new Provider(strings[0],strings[1],strings[2]);
            providers.add(p);
        }
        Collections.sort(providers, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Provider)(o1)).cost-((Provider)(o2)).cost;
            }
        });
        for (int i = 0;i<M;i++){
            s = scanner.nextLine();
            strings = s.trim().split(" ");
            shops[i] = Solution.new Shop(strings[0],strings[1]);
        }
        Provider provider;
        Shop shop;
        int supply;
        List<Integer> list;
        for (int i = 0;i<M;i++){
            shop = shops[i];
            if (shop.need > 0)
                for (int j = 0;j<N;j++){
                    provider = providers.get(j);
                    if (provider.supply>0){
                        supply = Math.min(provider.supply,shop.need);
                        provider.supply -= supply;
                        shop.need -= supply;
                        list = new LinkedList<>();
                        list.add(provider.id);
                        list.add(shop.id);
                        list.add(supply);
                        ret.add(list);
                    }
                    if (shop.need == 0){
                        break;
                    }
                }
        }
        if (shops[M-1].need != 0)
            System.out.println(-1);
        else{
         for (List l : ret){
             System.out.println(l.get(0)+ " "+ l.get(1) + " " + l.get(2));
         }
        }
    }

    class Provider{
        int id;
        int supply;
        int cost;
        Provider(String id,String supply,String cost){
            this.cost = Integer.parseInt(cost);
            this.id = Integer.parseInt(id);
            this.supply = Integer.parseInt(supply);
        }

    }
    class Shop{
        int id;
        int need;
        Shop(String id,String need){
            this.id = Integer.parseInt(id);
            this.need = Integer.parseInt(need);
        }
    }
}
