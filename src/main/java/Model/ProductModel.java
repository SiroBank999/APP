/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ProductModel {
    private int id;
    private String tensp;
    private int soluong;
    private double dongia;
    private int sum;

    public ProductModel(int sum) {
        this.sum = sum;
    }

    public ProductModel() {
    }

    public ProductModel(String tensp, int soluong, double dongia) {
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public ProductModel(int id, String tensp, int soluong, double dongia) {
        this.id = id;
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    public List<ProductModel> layDanhSach(){
        List<ProductModel> listProduct = new ArrayList<>();
        Connection conn=null;
        Statement  st=null;
        try {
            conn = Database.ketNoi();
            st =conn.createStatement();
            String query = "select * from product";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
            ProductModel product = new ProductModel(rs.getInt("id"),rs.getString("tensp"),rs.getInt("soluong"),rs.getDouble("dongia"));
            
             listProduct.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listProduct;
   }
    public ProductModel getProductPro(){
      ProductModel product = new ProductModel();
      Connection conn=Database.ketNoi();
      String sql="SELECT SUM(soluong) FROM product";
        try {
            PreparedStatement ps =conn.prepareCall(sql);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
                
                product.setSum(rs.getInt("SUM(soluong)"));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductModel.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      return product;
  }
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "ProductModel{" + "id=" + id + ", tensp=" + tensp + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }
    
    
}
