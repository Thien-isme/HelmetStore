package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .notification_icon{\n");
      out.write("            width: 22px; \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .accountprofile_icon{\n");
      out.write("            width:36px ;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");

            String url = request.getScheme()+ "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"header row\">\n");
      out.write("            <div class=\"col-3\">\n");
      out.write("                <a href=\"");
      out.print(url);
      out.write("/header.jsp\" target=\"_self\"> <img src=\"");
      out.print(url);
      out.write("/img/logo.png\"></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-6 pt-3\">\n");
      out.write("                <form class=\"row\" action=\"https://www.w3schools.com/tags/tag_a.asp\">\n");
      out.write("                    <input class=\"form-control rounded-pill\" type=\"search\" placeholder=\"Search\">\n");
      out.write("                </form>\n");
      out.write("                <div class=\"row pt-2 d-flex flex-row justify-content-between mt-auto\">\n");
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none\" href=\"");
      out.print(url);
      out.write("/index.jsp\" target=\"_self\"> Home</a>\n");
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none no-wrap\" href=\"");
      out.print(url);
      out.write("/header.jsp\" target=\"_self\"> Best Sellers</a>\n");
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none\" href=\"");
      out.print(url);
      out.write("/header.jsp\" target=\"_self\"> Product</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 row d-flex flex-row justify-content-between align-items-center\">\n");
      out.write("                \n");
      out.write("                <!-- Code lấy session -->\n");
      out.write("                ");

                    Object obj = session.getAttribute("khachHang");
                    KhachHang khachHang = null;
                    if(obj!=null){
                        khachHang = (KhachHang) obj;
                    }
                
      out.write("\n");
      out.write("                \n");
      out.write("                ");

                    if(khachHang==null){     
                
      out.write("\n");
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none\" href=\"");
      out.print(url);
      out.write("/khachhang/login.jsp\" target=\"_self\"> Login</a>\n");
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none\" href=\"");
      out.print(url);
      out.write("/khachhang/register.jsp\" target=\"_self\"> Register</a>\n");
      out.write("                ");

                    } else { 
                
      out.write("\n");
      out.write("                <div class=\"col-8 text-center\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto bg-infor \">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a style=\"font-size: 20px;\"  class=\"nav-link dropdown-toggle text-center\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> \n");
      out.write("                                <img class=\"accountprofile_icon\" src=\"");
      out.print(url);
      out.write("/GUI-icons/accountprofile_icon.png\"  alt=\"Ảnh Avatar\"> ");
      out.print(khachHang.getHoVaTen() );
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu \" style=\" width: 100%\">\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\">My Order</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\">Notification <img class=\"notification_icon\" src=\"");
      out.print(url);
      out.write("/GUI-icons/notification_icon.png\"  alt=\"Ảnh Avatar\"></a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"");
      out.print(url );
      out.write("/khachhang/updateprofile.jsp\">Update Information</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"");
      out.print(url );
      out.write("/khachhang/doimatkhau.jsp\">Change Password</a></li>\n");
      out.write("                                    <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"");
      out.print(url );
      out.write("/khach-hang?hanhDong=dang-xuat\">Log-out</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\t\n");
      out.write("                                                        </div>\n");
      out.write("                ");
 
                }
                
      out.write("\n");
      out.write("\n");
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none no-wrap\" href=\"");
      out.print(url);
      out.write("/header.jsp\" target=\"_self\"> Giỏ Hàng</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        $('#myDropdown').on('show.bs.dropdown', function () {\n");
      out.write("  // do something…\n");
      out.write("})\n");
      out.write("    </script>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
