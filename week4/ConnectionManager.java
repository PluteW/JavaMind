package JavaMind.week4;

public class ConnectionManager {

    private static Connection connections[] = new Connection[10];
    private static boolean busy[] = new boolean[10];

    public static Connection getConnection(){
        for (int i = 0;i<busy.length;i++){
            if (!busy[i]){
                System.out.println("已成功申请到连接对象"+(i+1));
                busy[i] = true;
                return connections[i];
            }
        }
        System.out.println("目前没有空闲连接对象，请稍后再试！");
        return null;
    }
}
//  Connection类，也可单独设置一个类，由于具体实现省略，此处略过
class Connection{

    Connection(){
//        这里进行Connection的配置，配置后调用类内的函数进行连接，等待被调用执行
    }
}