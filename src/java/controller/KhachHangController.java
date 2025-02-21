
package controller;

import database.KhachHangDAO;
import java.io.IOException;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.KhachHang;

@WebServlet(name = "KhachHangController", urlPatterns = {"/khach-hang"})
public class KhachHangController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hanhdong = request.getParameter("hanhdong");
        if(hanhdong.equals("register")){
            register(request, response);
        }
        
        
        
        
        
        
    }
    
    private void register(HttpServletRequest request, HttpServletResponse response) {
        try {
            String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmpassword = request.getParameter("confirmpassword");
        String email = request.getParameter("email");

        // set attribute trả về để không phải nhập lại từng cái nếu sai
        request.setAttribute("username", username);
        request.setAttribute("email", email);
        
        
        
        String error = "";
        
        String url = "";
        
        // Kiểm tra khách hàng có nhập thông tin hay chưa
        if(username.length()==0){
            error += "Tên đăng nhập không được để trống";
        }
        if(password.length()==0){
            error += "Password không được để trống";
        }
        if(confirmpassword.length()==0){
            error += "Confirm Password không được để trống";
        }
        if(email.length()==0){
            error += "Email không được để trống";
        }
        
        // Nếu tên đăng nhập bị trùng (chưa làm)
        
        // Nếu email bị trùng (chưa làm)
        
        // Kiểm tra regex coi có phải là dạng email hay không (chưa làm)
        
        // Kiểm tra password và confirmpassword 
        if(password.equals(confirmpassword)==false){
            error += "Mật khẩu và mật khẩu nhập lại KHÔNG TRÙNG KHỚP. Vui lòng kiểm tra lại!";
        }
        
        // mã hóa mật khẩu (chưa làm)
        
        //Trả về báo lỗi nếu có
        if(error.length()>0){
            request.setAttribute("error", error);
            // Quay lại trang đăng nhập
            url = "./khachhang/register.jsp";
        } else{ // nếu không có lỗi thì tạo đối tượng Khách Hàng lưu xuống
            // Tạo ra mã khách hàng
            Random rd = new Random();
            String maKhachHang = System.currentTimeMillis() + rd.nextInt(1000)+"";
            KhachHang kh = new KhachHang(maKhachHang, username, password, email);
            
            KhachHangDAO khachHangDao = new KhachHangDAO();
            khachHangDao.insert(kh);
            url = "./khachhang/registersuccess.jsp";
           // response.sendRedirect(url);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("./khachhang/registersuccess.jsp");
            rd.forward(request, response);
        }
        
        // Tạo KhachHang lưu xuống CSDL
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        try {
            response.sendRedirect("./khachhang/register.jsp");
        } catch (Exception e) {
            
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
