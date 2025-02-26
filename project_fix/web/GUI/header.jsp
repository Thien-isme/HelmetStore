
<%@page import="model.KhachHang"%>
<%
            String url = request.getScheme()+ "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
           
        %>




<!-- header section strats -->
    <header class="header_section">
      <nav class="navbar navbar-expand-lg custom_nav-container ">
        <a class="navbar-brand" href="<%=url%>/GUI/index.jsp">
          <span>
            THT Helmet Store
          </span>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class=""></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav  ">
            <li class="nav-item active">
              <a class="nav-link" href="<%=url%>/GUI/index.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="<%=url%>/GUI/shop.jsp">
                Shops
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="<%=url%>/GUI/contact.jsp">Contact Us</a>
            </li>
          </ul>
          <div class="user_option">
              
              <%
                    Object obj = session.getAttribute("khachHang");
                    KhachHang khachHang = null;
                    if(obj!=null){
                        khachHang = (KhachHang) obj;
                    }
                %>
               <%
                    if(khachHang==null){     
                %> 
                
              <a href="../khachhang/login.jsp">
              <i class="fa fa-user" aria-hidden="true"></i>
              <span>
                Login
              </span>
            </a>
                <%
                    } else { 
                %>
                
              <div class="col-8 text-center">
                    <ul class="navbar-nav me-auto bg-infor ">
                        <li class="nav-item dropdown">
                            <a style="font-size: 20px;"  class="nav-link dropdown-toggle text-center" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"> 
                                
                                <img style="width: 30px; border-radius: 50%" src="<%=url%>/GUI/imgsanpham/2.png"  alt="?nh Avatar">  <%=khachHang.getHoVaTen()%>
                                
                            </a>
                            <ul class="dropdown-menu " style=" width: 126%">
                                    <li><a class="dropdown-item" href="#">My Order</a></li>
                                    <li><a class="dropdown-item" href="#">Notification <img style="width: 22px; " src="<%=url%>/GUI/images/notification_icon.png"  alt="?nh Avatar"></a></li>
                                    <li><a class="dropdown-item" href="<%=url %>/khachhang/updateprofile.jsp">Update Information</a></li>
                                    <li><a class="dropdown-item" href="<%=url %>/khachhang/resetpassword.jsp">Change Password</a></li>
                                    <li><a class="dropdown-item" href="<%=url %>/khachhang/upload.jsp">Update Avatar</a></li>
                                    <li><a class="dropdown-item" href="<%=url %>/GUI/getvoucher.jsp">Get Voucher</a></li>
                                    <li><hr class="dropdown-divider"></li>
                                    <li><a class="dropdown-item" href="<%=url %>/khach-hang?hanhdong=logout">Log-out</a></li>
                                </ul>
                        </li>
                    </ul>	
                                                        </div>
            <% 
                }
                %>                    
            <a href="">
              <i class="fa fa-shopping-bag" aria-hidden="true"></i>
            </a>
            <form class="form-inline ">
              <button class="btn nav_search-btn" type="submit">
                <i class="fa fa-search" aria-hidden="true"></i>
              </button>
            </form>
          </div>
        </div>
      </nav>
    </header>
    <!-- end header section -->
