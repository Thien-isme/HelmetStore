package controller;

import database.KhachHangDAO;
import java.io.IOException;
import java.sql.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.KhachHang;

@WebServlet(name = "KhachHangController", urlPatterns = {"/khach-hang"})
public class KhachHangController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hanhdong = request.getParameter("hanhdong");
        System.out.println(hanhdong);
        if (hanhdong.equals("register")) {
            register(request, response);
        } else if (hanhdong.equals("login")){
            login(request, response);
        }else if (hanhdong.equals("updateProfile")) {
            updateProfile(request, response);
        }

    }

    private void register(HttpServletRequest request, HttpServletResponse response) {
        String error = "";

        String url = "";
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String confirmpassword = request.getParameter("confirmpassword");
            String email = request.getParameter("email");

            // set attribute trả về để không phải nhập lại từng cái nếu sai
            request.setAttribute("username", username);
            request.setAttribute("email", email);

            // Kiểm tra khách hàng có nhập thông tin hay chưa
            if (username.length() == 0) {
                error += "Tên đăng nhập không được để trống";
            }
            if (password.length() == 0) {
                error += "Password không được để trống";
            }
            if (confirmpassword.length() == 0) {
                error += "Confirm Password không được để trống";
            }
            if (email.length() == 0) {
                error += "Email không được để trống";
            }

            // Nếu tên đăng nhập bị trùng (chưa làm)
            // Nếu email bị trùng (chưa làm)
            // Kiểm tra regex coi có phải là dạng email hay không (chưa làm)
            // Kiểm tra password và confirmpassword 
            if (password.equals(confirmpassword) == false) {
                error += "Mật khẩu và mật khẩu nhập lại KHÔNG TRÙNG KHỚP. Vui lòng kiểm tra lại!";
            }

            // mã hóa mật khẩu (chưa làm)
            //Trả về báo lỗi nếu có
            if (error.length() > 0) {
                request.setAttribute("error", error);
                // Quay lại trang đăng nhập
                url = "/khachhang/register.jsp";
            } else { // nếu không có lỗi thì tạo đối tượng Khách Hàng lưu xuống
                // Tạo ra mã khách hàng
                Random rd = new Random();
                String maKhachHang = System.currentTimeMillis() + rd.nextInt(1000) + "";
                KhachHang kh = new KhachHang(maKhachHang, username, password, email);

                KhachHangDAO khachHangDao = new KhachHangDAO();
                khachHangDao.insert(kh);
                url = "/khachhang/registersuccess.jsp";
                
            }

            // Tạo KhachHang lưu xuống CSDL
        } catch (Exception e) {

            e.printStackTrace();
        }

        try {
            System.out.println(url);
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    private void login(HttpServletRequest request, HttpServletResponse response) {
        String error = "";

        String url = "";
        try {
            String username_or_email = request.getParameter("username_or_email");
            String password = request.getParameter("password");


            // set attribute trả về để không phải nhập lại từng cái nếu sai
            request.setAttribute("username_or_email", username_or_email);

            // Kiểm tra khách hàng có nhập thông tin hay chưa
            if (username_or_email.length() == 0) {
                error += "Bạn chưa nhập tên đăng nhập";
            }
            if (password.length() == 0) {
                error += "Bạn chưa nhập Password";
            }

            // mã hóa mật khẩu (chưa làm)
            
            
            //Trả về báo lỗi nếu có
            if (error.length() > 0) {
                request.setAttribute("error", error);
                // Quay lại trang đăng nhập
                url = "/khachhang/loginsuccess.jsp";
            } else { // nếu không có lỗi thì Chuyển sang trang chính              
                KhachHang khachHang  = new KhachHang(username_or_email, password);
                KhachHangDAO khachHangDAO = new KhachHangDAO();
                khachHang = khachHangDAO.selectByUsernameAndPassword(khachHang);
                
                // Kiểm tra kh được lấy lên từ CSDL có đúng hay không
                if(khachHang!=null){
                    HttpSession session = request.getSession();
                    session.setAttribute("khachHang", khachHang);
                    url = "/khachhang/loginsuccess.jsp";
                }else{
                    url = "/khachhang/login.jsp";
                }
                
            }

            // Tạo KhachHang lưu xuống CSDL
        } catch (Exception e) {

            e.printStackTrace();
        }
        
        // Điều hướng chương trình đừng sửa gì phần này
        System.out.println("url="+url);
        try {
            RequestDispatcher rdd = getServletContext().getRequestDispatcher(url);
            rdd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    
    private void updateProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maKhachHang = request.getParameter("maKhachHang");
        try {
            if (maKhachHang == null || maKhachHang.isEmpty()) {
                request.getRequestDispatcher("khachhang/updateprofile.jsp").forward(request, response);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace(); // Ghi log lỗi để kiểm tra nếu cần
        }

        String hoVaTen = request.getParameter("hoVaTen");
        String gioiTinh = request.getParameter("gioiTinh");
        String ngaySinhStr = request.getParameter("ngaySinh");
        String soDienThoai = request.getParameter("soDienThoai");
        String email = request.getParameter("email");
        String diaChiKhachHang = request.getParameter("diaChiKhachHang");
        String diaChiNhanHang = request.getParameter("diaChiNhanHang");
        String dangKyNhanBangTinStr = request.getParameter("dangKyNhanBangTin");

        boolean dangKyNhanBangTin = "on".equals(dangKyNhanBangTinStr) || "yes".equals(dangKyNhanBangTinStr);
        Date ngaySinh = null;
        try {
            ngaySinh = Date.valueOf(ngaySinhStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String quocGia = request.getParameter("quocGia");
        request.setAttribute("hoVaTen", hoVaTen);
        request.setAttribute("gioiTinh", gioiTinh);
        request.setAttribute("ngaySinh", ngaySinh);
        request.setAttribute("soDienThoai", soDienThoai);
        request.setAttribute("email", email);
        request.setAttribute("diaChiKhachHang", diaChiKhachHang);
        request.setAttribute("diaChiNhanHang", diaChiNhanHang);
        request.setAttribute("dangKyNhanBangTin", dangKyNhanBangTin);
        request.setAttribute("quocGia", quocGia);
        System.out.println(gioiTinh);
        KhachHang kh = new KhachHang(maKhachHang, hoVaTen, gioiTinh, ngaySinh, soDienThoai, email, quocGia, diaChiKhachHang, diaChiNhanHang, dangKyNhanBangTin);
        KhachHangDAO khachHangDao = new KhachHangDAO();
        int isUpdate = khachHangDao.update(kh);

        String url = "./khachhang/registersuccess.jsp";
        try {
            response.sendRedirect(url);
        } catch (IOException ex) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}
