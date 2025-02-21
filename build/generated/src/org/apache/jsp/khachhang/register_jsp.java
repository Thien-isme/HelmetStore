package org.apache.jsp.khachhang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/khachhang/../header.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            /* Đảm bảo toàn bộ trang có chiều cao 100% */\n");
      out.write("            html, body {\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Sử dụng Flexbox để căn chỉnh layout */\n");
      out.write("            .full-height {\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Nội dung chính chiếm phần còn lại của màn hình */\n");
      out.write("            .main-content {\n");
      out.write("                flex: 1;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"full-height\">\n");
      out.write("            <!-- Header -->\n");
      out.write("            ");
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
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none\" href=\"");
      out.print(url);
      out.write("/khachhang/login.jsp\" target=\"_self\"> Login</a>\n");
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none\" href=\"");
      out.print(url);
      out.write("/khachhang/register.jsp\" target=\"_self\"> Register</a>\n");
      out.write("                    <a class=\"col-4 text-center fs-4 text-decoration-none no-wrap\" href=\"");
      out.print(url);
      out.write("/header.jsp\" target=\"_self\"> Giỏ Hàng</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            ");
            String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                        + request.getContextPath();
            
      out.write("\n");
      out.write("            <!-- Phần chính (Login form) sẽ căn giữa -->\n");
      out.write("            <div class=\"main-content\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <form class=\"p-4 border rounded shadow bg-light\" method=\"get\" action=\"../khach-hang\">\n");
      out.write("                        <h1>");
      out.print(url1);
      out.write("</h1>\n");
      out.write("                        <input type=\"hidden\" name=\"hanhdong\" value=\"register\"> \n");
      out.write("                        <h1 class=\"text-center\">Register Account</h1>\n");
      out.write("\n");
      out.write("                        <!-- Username input -->\n");
      out.write("                        <div data-mdb-input-init class=\"form-outline mb-2\">\n");
      out.write("                            <label class=\"form-label\" for=\"username\">Username</label>\n");
      out.write("                            <input type=\"text\" id=\"username\" class=\"form-control\" name=\"username\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Password input -->\n");
      out.write("                        <div data-mdb-input-init class=\"form-outline mb-2\">\n");
      out.write("                            <label class=\"form-label\" for=\"password\">Password</label>\n");
      out.write("                            <input type=\"password\" id=\"password\" class=\"form-control\" name=\"password\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Confirm Password input -->\n");
      out.write("                        <div data-mdb-input-init class=\"form-outline mb-2\">\n");
      out.write("                            <label class=\"form-label\" for=\"confirmpassword\">Confirm Password</label>\n");
      out.write("                            <input type=\"password\" id=\"confirmpassword\" class=\"form-control\" name=\"confirmpassword\" />\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                                                <!-- Email input -->\n");
      out.write("                        <div data-mdb-input-init class=\"form-outline mb-2\">\n");
      out.write("                            <label class=\"form-label\" for=\"email\">Email</label>\n");
      out.write("                            <input type=\"text\" id=\"email\" class=\"form-control\" name=\"email\" />\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"row mb-2\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
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
