package org.apache.jsp.khachhang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/khachhang/../GUI/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <!-- slider stylesheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- bootstrap core css -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( url1);
      out.write("/GUI/css/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"");
      out.print( url1);
      out.write("/GUI/css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- responsive style -->\r\n");
      out.write("        <link href=\"");
      out.print( url1);
      out.write("/GUI/css/responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
 String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath(); 
      out.write('\r');
      out.write('\n');
 String currentUrl = request.getRequestURI();
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- header section strats -->\r\n");
      out.write("<header class=\"header_section\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg custom_nav-container \">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.print(url);
      out.write("/GUI/index.jsp\">\r\n");
      out.write("            <span>\r\n");
      out.write("                THT Helmet Store\r\n");
      out.write("            </span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse d-flex align-items-center\" id=\"navbarSupportedContent\">\r\n");
      out.write("            <ul class=\"navbar-nav  \">\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("index.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("shop.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/shop.jsp\">\r\n");
      out.write("                        Shops\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item ");
      out.print( currentUrl.contains("contact.jsp") ? "active" : "");
      out.write("\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/contact.jsp\">Contact Us</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"user_option\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    Object obj = session.getAttribute("khachHang");
                    KhachHang khachHang = null;
                    if (obj != null) {
                        khachHang = (KhachHang) obj;
                    }
                
      out.write("\r\n");
      out.write("                ");

                    if (khachHang == null) {
                
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                <a href=\"../khachhang/login.jsp\">\r\n");
      out.write("                    <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    <span ");
      out.print( currentUrl.contains("index.jsp") ? "active" : "");
      out.write(">\r\n");
      out.write("                        Login\r\n");
      out.write("                    </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                ");

                } else {
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-8 text-center\">\r\n");
      out.write("                    <ul class=\"navbar-nav me-auto bg-infor \">\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a style=\"font-size: 20px;\"  class=\"nav-link dropdown-toggle text-center\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> \r\n");
      out.write("\r\n");
      out.write("                                <img style=\"width: 30px; border-radius: 50%\" src=\"");
      out.print(url);
      out.write("/uploads/");
      out.print(khachHang.getHinhAvatar());
      out.write("\"  alt=\"?nh Avatar\">  ");
      out.print(khachHang.getHoVaTen());
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu \" style=\" width: 126%\">\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">My Order</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"#\">Notification <img style=\"width: 22px; \" src=\"");
      out.print(url);
      out.write("/GUI/images/notification_icon.png\"  alt=\"?nh Avatar\"></a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/update.jsp\">Update Information</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/resetpassword.jsp\">Change Password</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khachhang/upload.jsp\">Update Avatar</a></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/GUI/getvoucher.jsp\">Get Voucher</a></li>\r\n");
      out.write("                                <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khach-hang?hanhdong=logout\">Log-out</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\t\r\n");
      out.write("                </div>\r\n");
      out.write("                ");

                    }
                
      out.write("                    \r\n");
      out.write("                <a href=\"../khachhang/cart.jsp\">\r\n");
      out.write("                    <i class=\"fa fa-shopping-bag\" aria-hidden=\"true\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("                <form class=\"d-flex ms-auto\" role=\"search\">\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <input type=\"search\" class=\"form-control text-dark border-0\" placeholder=\"Searching\" aria-label=\"Search\" style=\"outline: none;\">\r\n");
      out.write("                        <button class=\"btn btn-dark\" type=\"submit\">\r\n");
      out.write("                            <i class=\"fa fa-search\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- end header section -->\r\n");
      out.write("\r\n");
      out.write("        ");

                 
                   
            if (khachHang == null) {
        
      out.write("\r\n");
      out.write("        <h1 class=\"red\">Bạn chưa đăng nhập</h1>\r\n");
      out.write("        ");

        } else {
        
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <!-- Page title -->\r\n");
      out.write("                <div class=\"my-5 d-flex justify-content-center\">\r\n");
      out.write("                    <h3>My Profile</h3>\r\n");
      out.write("                    <hr>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Form START -->\r\n");
      out.write("                <form class=\"file-upload\" method=\"post\" action=\"");
      out.print(url);
      out.write("/khach-hang\" enctype=\"multipart/form-data\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"hanhdong\" value=\"updateProfile\"> \r\n");
      out.write("                    <input type=\"text\" name=\"maKhachHang\" value=\"");
      out.print( khachHang.getMaKhachHang());
      out.write("\"> \r\n");
      out.write("                    <div class=\"container-xl px-4 mt-4\">\r\n");
      out.write("                        <hr class=\"mt-0 mb-4\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xl-4\">\r\n");
      out.write("                                <!-- Profile picture card-->\r\n");
      out.write("                                <div class=\"card mb-4 mb-xl-0\">\r\n");
      out.write("                                    <div class=\"card-header\">Profile Picture</div>\r\n");
      out.write("                                    <div class=\"card-body text-center\">\r\n");
      out.write("                                        <!-- Profile picture image-->\r\n");
      out.write("                                        <img class=\"img-account-profile rounded-circle mb-2\" src=\"");
      out.print( url);
      out.write("/uploads/");
      out.print(khachHang.getHinhAvatar());
      out.write("\" alt=\"\">\r\n");
      out.write("                                        \r\n");
      out.write("\r\n");
      out.write("                                        <!-- Profile picture help block-->\r\n");
      out.write("                                        <div class=\"small font-italic text-muted mb-4\">JPG or PNG no larger than 5 MB</div>\r\n");
      out.write("                                        <!-- Profile picture upload button-->\r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class=\"gap-3 d-md-flex justify-content-md-center text-center\">\r\n");
      out.write("                                            \r\n");
      out.write("                                               <input type=\"file\" name=\"file\" id=\"avatar\" hidden=\"\"> \r\n");
      out.write("                                               <button type=\"button\" class=\"btn btn-outline-danger\">Remove</button>\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-dark\">\r\n");
      out.write("                                                <label class=\"text-white m-0\" for=\"customFile\" style=\"cursor: pointer;\">Upload</label>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                               <button type=\"button\" class=\"btn btn-dark\">\r\n");
      out.write("                                                <label class=\"text-white m-0\" for=\"customFile\" style=\"cursor: pointer;\">Save</label>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xl-8\">\r\n");
      out.write("                                <div class=\"card mb-4\">\r\n");
      out.write("                                    <div class=\"card-header\">Account Details</div>\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row gx-3 mb-3\">\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <label class=\"small mb-1\" for=\"hoVaTen\">Full name</label>\r\n");
      out.write("                                                <input class=\"form-control\" id=\"hoVaTen\" type=\"text\" placeholder=\"Enter full name\" name=\"hoVaTen\" value=\"");
      out.print(khachHang.getHoVaTen());
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <label class=\"form-label\">Phone number</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Enter phone number\" name=\"soDienThoai\" value=\"");
      out.print( khachHang.getSoDienThoai() );
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"row gx-3 mb-3\">\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <label class=\"form-label\">Birthdate</label>\r\n");
      out.write("                                                <input type=\"date\" class=\"form-control\" placeholder=\"\" name=\"ngaySinh\" value=\"");
      out.print(khachHang.getNgaySinh() );
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <label class=\"form-label\">Gender</label>\r\n");
      out.write("                                                <select class=\"form-control\" name=\"gioiTinh\">\r\n");
      out.write("                                                    <option value=\"male\"> ");
      out.print( khachHang.getGioiTinh() );
      out.write("</option>\r\n");
      out.write("                                                    <option value=\"male\">Male</option>\r\n");
      out.write("                                                    <option value=\"female\">Female</option>\r\n");
      out.write("                                                    <option value=\"other\">Other</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"row gx-3 mb-3\">\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <label for=\"inputEmail4\" class=\"form-label\">Email *</label>\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"Enter email address\" name=\"email\" value=\"");
      out.print( khachHang.getEmail() );
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-md-6\">\r\n");
      out.write("                                                <label class=\"form-label\">Country</label>\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Enter country\" name=\"quocGia\" value=\"");
      out.print( khachHang.getQuocTich() );
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"mb-3\">\r\n");
      out.write("                                            <label class=\"form-label\">Customer address</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter address\" name=\"diaChiKhachHang\" value=\"");
      out.print( khachHang.getDiaChiKhachHang() );
      out.write("\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"mb-3\">\r\n");
      out.write("                                            <label class=\"form-label\">Delivery address</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter delivery address\" name=\"diaChiNhanHang\" value=\"");
      out.print( khachHang.getDiaChiNhanHang() );
      out.write("\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"mb-3 d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                            <div class=\"form-check\">\r\n");
      out.write("                                                <input class=\"form-check-input\" type=\"checkbox\" value=\"\" name=\"dangKyNhanBangTin\" id=\"dangKyNhanBangTin\">\r\n");
      out.write("                                                <label class=\"form-check-label text-secondary\" for=\"dangKyNhanBangTin\">\r\n");
      out.write("                                                    Sign up for email newsletter\r\n");
      out.write("                                                </label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <!-- button -->\r\n");
      out.write("                                            <div class=\"gap-3 d-md-flex justify-content-md-end text-center\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-danger\">Delete profile</button>\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-dark\">\r\n");
      out.write("                                                    <label class=\"text-white m-0\" for=\"\" style=\"cursor: pointer;\">Update profile</label>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form> <!-- Form END -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 }
      out.write("    \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
