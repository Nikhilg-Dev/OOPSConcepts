import java.sql.*;

public class Database {
    public static void main(String[] args) {
        Pojo pojo=new Pojo();
        String url="jdbc:mysql://localhost:3306/mydatabase";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,"root","");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from Info");
            while(resultSet.next()){
                pojo.setName(resultSet.getString(2));
                pojo.setNumber(resultSet.getLong(4));
                pojo.setAge(resultSet.getInt(3));
                System.out.println("Name= "+pojo.getName()+", Mobile Number= "+pojo.getNumber()+", Age= "+pojo.getAge());

            }
            System.out.println(pojo.getName());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
