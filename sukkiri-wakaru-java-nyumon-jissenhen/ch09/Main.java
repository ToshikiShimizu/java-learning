import java.sql.*;
public class Main{
    public static void main(String[] args) {
        try{
            Class.forName("org.h2.Driver");
            
        }
        catch (ClassNotFoundException e){
            throw new IllegalStateException("ドライバのロードに失敗しました");
            
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:~/rpgdb");

            // code9-2
            // PreparedStatement pstmt = con.prepareStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
            // pstmt.setInt(1, 10);
            // pstmt.setString(2, "ゾンビ");
            // int r = pstmt.executeUpdate();
            // if (r!=0){
            //     System.out.println(r + "件のモンスターを削除しました");
            // }else{
            //     System.out.println("該当するモンスターはありませんでした");
            // }
            // pstmt.close();
            //

            // code9-3
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");
            pstmt.setInt(1, 10);
            ResultSet rs = pstmt.executeQuery();
            rs.close();
            pstmt.close();

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if ( con!=null){
                try {
                    con.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}