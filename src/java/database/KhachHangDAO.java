package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.KhachHang;
import utils.JDBCUtil;


public class KhachHangDAO implements DAOInterface<KhachHang>{

    @Override
    public ArrayList<KhachHang> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public KhachHang selectById(KhachHang t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(KhachHang t) {
        int ketQua = 0;
        System.out.println("Dòng 25 insert");
        try {
            // B1: Tạo connection
            Connection c = JDBCUtil.getConnection();
            
            // B2: Tạo câu SQL
            String sql = "INSERT INTO khachhang(makhachhang, tendangnhap, matkhau,email) VALUES(?,?,?,?) ";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, t.getMaKhachHang());
            ps.setString(2, t.getTenDangNhap());
            ps.setString(3, t.getMatKhau());
            ps.setString(4, t.getEmail());

            // B3: Chạy câu lệnh SQL
            ketQua = ps.executeUpdate();
            
            //B4: Xử lý dữ liệu (nếu cần)
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!");
            
            // B5: Đóng Connection
            JDBCUtil.close(c);

        } catch (SQLException e) {
            System.out.println("Insert thất bại");
            e.printStackTrace();
            e.getErrorCode();
            e.getSQLState();
        }
        
        
        return ketQua;
    }

    @Override
    public int insertAll(ArrayList<KhachHang> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(KhachHang t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteAll(ArrayList<KhachHang> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(KhachHang t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
