
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
              <a href="../khachhang/login.jsp">
              <i class="fa fa-user" aria-hidden="true"></i>
              <span>
                Login
              </span>
            </a>
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
