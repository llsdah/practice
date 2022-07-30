package train202207.oracle;

import java.sql.*;

public class OracleTest {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String id = "oracle";
        String pw = "1234";

        Connection cn = connect(url, id, pw);

//        check(createTable(cn));
//        check(insert_value(cn,id,pw));
//        check(select_value(cn));

        System.out.println("성공!");
    }

    private static int select_value(Connection cn) {
        String sql = "select * from test_temp";
        String seq ="";
        String id ="";
        String pw ="";
        int num = 0;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                seq = rs.getString("seq");
                id = rs.getString("id");
                pw = rs.getString("password");
                num = Math.max(num,Integer.parseInt(seq));
                System.out.println("결과물 = "+ "seq : "+seq +", id : " + id+", pw : " + pw);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return num+1;
    }

    public static void check(int cnt){
        if (cnt==1) System.out.println("성공");
        else System.out.println("실패");
    }

    public static Connection connect(String url, String id, String pw){
        Connection conn = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,id,pw);

        }catch (Exception exception){
            exception.printStackTrace();
        }

        return conn;

    }

    // 테이블생성
    public static int createTable(Connection cn){
        int cnt = 0;
        try{
            String sql = "create table test_temp( seq number not null, id varchar(200)," +
                    "password varchar(200))";
            PreparedStatement psmt = cn.prepareStatement(sql);
            cnt = psmt.executeUpdate();

        }catch (Exception e ){
            e.printStackTrace();
        }

        return cnt;
    }

    public static int insert_value(Connection cn,String id, String pw){
        int cnt =0;

        int num = select_value(cn);
        try{
            PreparedStatement psmt = cn.prepareStatement("insert into test_temp values(?,?,?)");
            psmt.setString(1,""+num);
            psmt.setString(2,id);
            psmt.setString(3,pw);
            cnt = psmt.executeUpdate();
        }catch (Exception exception){
            exception.printStackTrace();
        }

        return cnt;
    }

}
