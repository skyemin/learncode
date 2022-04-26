package com.wei.learncode.spi;

import java.sql.*;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author skye
 * @version 1.0
 * @date Created in 2022年04月24日 14:56
 * @since 1.0
 */
public class JdbcDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
        }
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user where id = 1");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(2));
        }
    }
}
