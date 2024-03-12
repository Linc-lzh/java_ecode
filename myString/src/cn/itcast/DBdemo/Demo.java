package cn.itcast.DBdemo;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql:///db5?useUnicode=true&characterEncoding=UTF8", "root", "123");
       /* PreparedStatement preparedStatement = connection.prepareStatement("select * from test");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        String string = resultSet.getString(1);
        System.out.println(string);
        resultSet.close();
        preparedStatement.close();
        connection.close();*/

        PreparedStatement preparedStatement = connection.prepareStatement("insert into test values('张三')");
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        preparedStatement.close();
        connection.close();

    }
}
