package org.apache.jsp.GUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class getvoucher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/GUI/../GUI/header.jsp");
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

      out.write('\n');

    String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(url1);
      out.write("/GUI/css/voucher.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("            <!-- slider stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\" />\n");
      out.write("\n");
      out.write("    <!-- bootstrap core css -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( url1);
      out.write("/GUI/css/bootstrap.css\" />\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"");
      out.print( url1);
      out.write("/GUI/css/style.css\" rel=\"stylesheet\" />\n");
      out.write("    <!-- responsive style -->\n");
      out.write("    <link href=\"");
      out.print( url1);
      out.write("/GUI/css/responsive.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write('\n');
      out.write('\n');

            String url = request.getScheme()+ "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
           
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- header section strats -->\n");
      out.write("    <header class=\"header_section\">\n");
      out.write("      <nav class=\"navbar navbar-expand-lg custom_nav-container \">\n");
      out.write("        <a class=\"navbar-brand\" href=\"");
      out.print(url);
      out.write("/GUI/index.jsp\">\n");
      out.write("          <span>\n");
      out.write("            THT Helmet Store\n");
      out.write("          </span>\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("          <ul class=\"navbar-nav  \">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/shop.jsp\">\n");
      out.write("                Shops\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/GUI/contact.jsp\">Contact Us</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <div class=\"user_option\">\n");
      out.write("              \n");
      out.write("              ");

                    Object obj = session.getAttribute("khachHang");
                    KhachHang khachHang = null;
                    if(obj!=null){
                        khachHang = (KhachHang) obj;
                    }
                
      out.write("\n");
      out.write("               ");

                    if(khachHang==null){     
                
      out.write(" \n");
      out.write("                \n");
      out.write("              <a href=\"../khachhang/login.jsp\">\n");
      out.write("              <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("              <span>\n");
      out.write("                Login\n");
      out.write("              </span>\n");
      out.write("            </a>\n");
      out.write("                ");

                    } else { 
                
      out.write("\n");
      out.write("                \n");
      out.write("              <div class=\"col-8 text-center\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto bg-infor \">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a style=\"font-size: 20px;\"  class=\"nav-link dropdown-toggle text-center\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> \n");
      out.write("                                \n");
      out.write("                                <img style=\"width: 30px; border-radius: 50%\" src=\"");
      out.print(url);
      out.write("/GUI/imgsanpham/");
      out.print(khachHang.getHinhAvatar());
      out.write("\"  alt=\"?nh Avatar\">  ");
      out.print(khachHang.getHoVaTen() );
      out.write("\n");
      out.write("                                \n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu \" style=\" width: 126%\">\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\">My Order</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"#\">Notification <img style=\"width: 22px; \" src=\"");
      out.print(url);
      out.write("/GUI/images/notification_icon.png\"  alt=\"?nh Avatar\"></a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"");
      out.print(url );
      out.write("/khachhang/updateprofile.jsp\">Update Information</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"");
      out.print(url );
      out.write("/khachhang/resetpassword.jsp\">Change Password</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"");
      out.print(url );
      out.write("/khachhang/upload.jsp\">Update Avatar</a></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"");
      out.print(url );
      out.write("/GUI/getvoucher.jsp\">Get Voucher</a></li>\n");
      out.write("                                    <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                                    <li><a class=\"dropdown-item\" href=\"");
      out.print(url );
      out.write("/khach-hang?hanhdong=logout\">Log-out</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\t\n");
      out.write("                                                        </div>\n");
      out.write("            ");
 
                }
                
      out.write("                    \n");
      out.write("            <a href=\"\">\n");
      out.write("              <i class=\"fa fa-shopping-bag\" aria-hidden=\"true\"></i>\n");
      out.write("            </a>\n");
      out.write("            <form class=\"form-inline \">\n");
      out.write("              <button class=\"btn nav_search-btn\" type=\"submit\">\n");
      out.write("                <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("              </button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <!-- end header section -->\n");
      out.write("\n");
      out.write("            <h1 style=\"text-align: center\">Voucher for you</h1>\n");
      out.write("            <div card-container>\n");
      out.write("                <div class=\"card-item \">\n");
      out.write("                    <img class=\"card-img\" alt=\"anh voucher\" src=\"");
      out.print(url1);
      out.write("/GUI/imgvoucher/voucher.png\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <p style=\"font-size: 24px;font-weight: 500 \" class=\"card-title\">Giảm 25% cho đơn hàng từ 100k</p>\n");
      out.write("                        <p class=\"card-text\"> <h5>EXP: <small class=\"text-muted\">15-02-2025</small></h5> </p>\n");
      out.write("                    </div>\n");
      out.write("                    <form class=\"card-getvalue\" action=\"\">\n");
      out.write("                        <button class=\"btn btn-primary getValue\">Get</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("<!--            <div class=\"card-content\">\n");
      out.write("                \n");
      out.write("                <div class=\"card-item\" style=\"\">\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                        <div class=\"row g-0\">\n");
      out.write("                            <div class=\"col-md-3\">\n");
      out.write("                                <img src=\"../uploads/1.jpeg\" class=\"img-fluid rounded-start\" alt=\"...\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-7\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <h5 class=\"card-title\">Discount xx%</h5>\n");
      out.write("\n");
      out.write("                                    <p class=\"card-text\"> <h5>EXP: <small class=\"text-muted\">15-02-2025</small></h5> </p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <form action=\"");
      out.print(url);
      out.write("/ma-giam-gia\" method=\"get\">\n");
      out.write("                                    <input class=\"form-control\" type=\"hidden\"  name=\"hanhdong\" value=\"get\">\n");
      out.write("                                    <input class=\"form-control\" type=\"hidden\"  name=\"idmagiamgia\" value=\"1\">\n");
      out.write("                                    <button class=\"form-control\" > Get </button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>-->\n");
      out.write("    \n");
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
