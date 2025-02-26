package org.apache.jsp.GUI;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/GUI/header.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Basic -->\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <!-- Mobile Metas -->\r\n");
      out.write("    <meta\r\n");
      out.write("      name=\"viewport\"\r\n");
      out.write("      content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\r\n");
      out.write("    />\r\n");
      out.write("    <!-- Site Metas -->\r\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <meta name=\"author\" content=\"\" />\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"image/x-icon\" />\r\n");
      out.write("\r\n");
      out.write("    <title>THT Helmet Store</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- slider stylesheet -->\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      type=\"text/css\"\r\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("\r\n");
      out.write("    <!-- bootstrap core css -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- responsive style -->\r\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\" />\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"hero_area\">\r\n");
      out.write("      <!-- header section strats -->\r\n");
      out.write("      ");
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
      out.write("              <a href=\"../khachhang/login.jsp\">\n");
      out.write("              <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("              <span>\n");
      out.write("                Login\n");
      out.write("              </span>\n");
      out.write("            </a>\n");
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
      out.write("\r\n");
      out.write("      <!-- end header section -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end hero area -->\r\n");
      out.write("\r\n");
      out.write("    <!-- shop section -->\r\n");
      out.write("\r\n");
      out.write("    <section class=\"shop_section layout_padding\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"heading_container heading_center\">\r\n");
      out.write("          <h2>Products</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"filter-container\">\r\n");
      out.write("          <div class=\"filter-group\">\r\n");
      out.write("            <select class=\"filter\" id=\"category-filter\">\r\n");
      out.write("              <option value=\"\">Category</option>\r\n");
      out.write("              <option value=\"rings\">Rings</option>\r\n");
      out.write("              <option value=\"watches\">Watches</option>\r\n");
      out.write("              <option value=\"flowers\">Flowers</option>\r\n");
      out.write("              <option value=\"teddy-bears\">Teddy Bears</option>\r\n");
      out.write("            </select>\r\n");
      out.write("\r\n");
      out.write("            <select class=\"filter\" id=\"price-filter\">\r\n");
      out.write("              <option value=\"\">Price</option>\r\n");
      out.write("              <option value=\"0-100\">$0 - $100</option>\r\n");
      out.write("              <option value=\"100-300\">$100 - $300</option>\r\n");
      out.write("              <option value=\"300-500\">$300 - $500</option>\r\n");
      out.write("            </select>\r\n");
      out.write("\r\n");
      out.write("            <select class=\"filter\" id=\"status-filter\">\r\n");
      out.write("              <option value=\"\">Status</option>\r\n");
      out.write("              <option value=\"new\">New</option>\r\n");
      out.write("              <option value=\"used\">Used</option>\r\n");
      out.write("            </select>\r\n");
      out.write("\r\n");
      out.write("            <select class=\"filter\" id=\"brand-filter\">\r\n");
      out.write("              <option value=\"\">Brand</option>\r\n");
      out.write("              <option value=\"brand-a\">Brand A</option>\r\n");
      out.write("              <option value=\"brand-b\">Brand B</option>\r\n");
      out.write("              <option value=\"brand-c\">Brand C</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <select class=\"filter\" id=\"sort-filter\">\r\n");
      out.write("            <option value=\"\">Sort By</option>\r\n");
      out.write("            <option value=\"price-asc\">Price: Low to High</option>\r\n");
      out.write("            <option value=\"price-desc\">Price: High to Low</option>\r\n");
      out.write("            <option value=\"newest\">Newest Arrivals</option>\r\n");
      out.write("          </select>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-sm-6 col-md-4 col-lg-3\">\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("              <a href=\"\">\r\n");
      out.write("                <div class=\"img-name\">\r\n");
      out.write("                    <h6 class=\"col-12 text-center\">Tên S?n ph?m</h6>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"img-box\">\r\n");
      out.write("                    <img src=\"../GUI/imgsanpham/1.png\" alt=\"\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"detail-box row\">\r\n");
      out.write("                    <h6 class=\"col-12 text-center\">\r\n");
      out.write("                    Price\r\n");
      out.write("                    <span> $200 </span>\r\n");
      out.write("                  </h6>\r\n");
      out.write("                </div>\r\n");
      out.write("                  <div class=\"text-center\">\r\n");
      out.write("                      <button class=\"img-name \">\r\n");
      out.write("                    <h6 class=\"col-12 text-center\">Add to card</h6>\r\n");
      out.write("                </button>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                <div class=\"new\">\r\n");
      out.write("                  <span> New </span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </a>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"btn-box\">\r\n");
      out.write("          <a href=\"\"> View All Products </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <!-- end shop section -->\r\n");
      out.write("\r\n");
      out.write("    <!-- info section -->\r\n");
      out.write("    <section class=\"info_section layout_padding2-top\">\r\n");
      out.write("      <div class=\"social_container\">\r\n");
      out.write("        <div class=\"social_box\">\r\n");
      out.write("          <a href=\"\">\r\n");
      out.write("            <i class=\"fa fa-facebook\" aria-hidden=\"true\"></i>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"info_container\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("              <h6>Text</h6>\r\n");
      out.write("              <p>text</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("              <h6>Text</h6>\r\n");
      out.write("              <p>Text</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6 col-lg-4\">\r\n");
      out.write("              <h6>Text</h6>\r\n");
      out.write("              <div class=\"info_link-box\">\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                  <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\r\n");
      out.write("                  <span> text </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                  <i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\r\n");
      out.write("                  <span>text</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                  <i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\r\n");
      out.write("                  <span>text</span>\r\n");
      out.write("                </a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- footer section -->\r\n");
      out.write("      <footer class=\"footer_section\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <p>&copy; <span id=\"displayYear\"></span> All Rights Reserved By</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("      <!-- footer section -->\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- end info section -->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/custom.js\"></script>\r\n");
      out.write("  </body>\r\n");
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
