/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author USER
 */
public class Database {
  //Khai báo báo driver để làm việc với mysql
    private final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //Khai báo tên db cần làm việc
    private final static String DATABASE_LINK = "jdbc:mysql://localhost:3306/quanlynhansu";
    
    /**
     * Hàm kết nối đến db trong MySQL cần làm việc
     * @return 
     */
    public static Connection ketNoi()
    {
        //Khai báo đối tượng kết nối
        Connection conn = null;
            
        try {
 
            //Nạp driver của mysql vào để sử dụng
            Class.forName(JDBC_DRIVER);
            
            //Thực hiện kết nối đến db
            conn = DriverManager.getConnection(DATABASE_LINK, "root", "Kothequen");
            
        } catch (ClassNotFoundException ex) {
            System.err.println("Không tìm thấy driver. Chi tiết: " + ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("Không kết nối được đến MySQL. Chi tiết: " + ex.getMessage());
        }
        
        //Trả về kết nối
        return conn;
    }
}
