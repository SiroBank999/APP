/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author Admin
 */
public class StaffModel {
    private int id;
    private String fullname;
    private String ngaysinh;
    private float hsl;
    private byte[] hinh;
    private int count;

    public StaffModel() {
    }

    public StaffModel(String fullname, String ngaysinh, float hsl) {
        this.fullname = fullname;
        this.ngaysinh = ngaysinh;
        this.hsl = hsl;
    }

    public StaffModel(int id, String fullname, String ngaysinh, float hsl) {
        this.id = id;
        this.fullname = fullname;
        this.ngaysinh = ngaysinh;
        this.hsl = hsl;
    }

    public StaffModel(int id, String fullname, String ngaysinh, float hsl, byte[] hinh) {
        this.id = id;
        this.fullname = fullname;
        this.ngaysinh = ngaysinh;
        this.hsl = hsl;
        this.hinh = hinh;
    }

    public StaffModel(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public byte[] getHinh() {
        return hinh;
    }

    public void setHinh(byte[] hinh) {
        this.hinh = hinh;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }
   public List<StaffModel> layDanhSach(){
        List<StaffModel> listStaff = new ArrayList<>();
        Connection conn=null;
        Statement  st=null;
        try {
            conn = Database.ketNoi();
            st =conn.createStatement();
            String query = "select * from staff";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
             StaffModel staff = new StaffModel(rs.getInt("idstaff"), rs.getString("fullname"),rs.getString("ngaysinh"), rs.getFloat("hsl"));
             listStaff.add(staff);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStaff;
   }
   public void Insert(StaffModel staff){
        Connection conn=null;
       
        try {
            conn=Database.ketNoi();
            String sql ="INSERT INTO staff (fullname,ngaysinh,hsl,image)VALUES(?,?,?,?)";
            PreparedStatement ps =conn.prepareCall(sql);
            ps.setString(1, staff.getFullname());
            ps.setString(2, staff.getNgaysinh());
            ps.setFloat(3,staff.getHsl());
            if(staff.getHinh() != null){
                Blob image = new SerialBlob(staff.getHinh());
                ps.setBlob(4, image);
            }else{
                Blob image =null;
                ps.setBlob(4, image);
            }
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StaffModel.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   public void Update(StaffModel staff){
       Connection conn = null;
       String sql="UPDATE staff SET fullname =?,ngaysinh=?,hsl=? ,image=? WHERE idstaff =?";
        try {
            conn =Database.ketNoi();
            PreparedStatement ps =conn.prepareCall(sql);
            ps.setString(1, staff.getFullname());
            ps.setString(2, staff.getNgaysinh());
            ps.setFloat(3,staff.getHsl());
            File input =null;
            if(staff.getHinh() != null){
                Blob image = new SerialBlob(staff.getHinh());
                ps.setBlob(4, image);
            }else{
                Blob image =null;
                ps.setBlob(4, image);
            }
            ps.setInt(5, staff.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StaffModel.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   public void  Drop(int id){
       Connection conn =Database.ketNoi();
       String sql ="DELETE FROM staff WHERE idstaff =?";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StaffModel.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  public List<StaffModel> findByName(String name){
        List<StaffModel> listStaff = new ArrayList<>();
        Connection conn=null;
         Statement  st=null;
        try {
            conn = Database.ketNoi();
            st =conn.createStatement();
            String query = "select * from staff where fullname like '%"+name+"%' ";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
             StaffModel staff = new StaffModel(rs.getInt("idstaff"), rs.getString("fullname"),rs.getString("ngaysinh"), rs.getFloat("hsl"));
             listStaff.add(staff);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listStaff;
   }
 
  public StaffModel getStaff(int id){
      StaffModel staff = new StaffModel();
      Connection conn=Database.ketNoi();
      String sql="SELECT * FROM staff WHERE idstaff = ?";
        try {
            PreparedStatement ps =conn.prepareCall(sql);
            ps.setInt(1, id);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
                staff.setId(id);
                staff.setFullname(rs.getString("fullname"));
                staff.setNgaysinh(rs.getString("ngaysinh"));
                staff.setHsl(rs.getFloat("hsl"));
                Blob blob =rs.getBlob("image");
                if(blob != null){
                    staff.setHinh(blob.getBytes(1, (int)blob.length()));
                }
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StaffModel.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      return  staff;
  }
  public StaffModel getStaffPro(){
      StaffModel staff = new StaffModel();
      Connection conn=Database.ketNoi();
      String sql="SELECT count(idstaff) FROM staff";
        try {
            PreparedStatement ps =conn.prepareCall(sql);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
                
                staff.setCount(rs.getInt("count(idstaff)"));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StaffModel.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      return  staff;
  }
}

