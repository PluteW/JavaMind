package JavaMind.week4;

public class test {

    public static void main(String[] args) {
        Connection connection = ConnectionManager.getConnection();
        for (int i = 0;i<12;i++){
            connection = ConnectionManager.getConnection();
        }
    }
}
