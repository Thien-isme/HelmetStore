<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>

  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">

  <title>
    THT Helmet Store

  </title>

  <!-- slider stylesheet -->
  <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />

  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="../GUI/css/bootstrap.css" />

  <!-- Custom styles for this template -->
  <link href="../GUI/css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="../GUI/css/responsive.css" rel="stylesheet" />

    <style>
        /* Đảm bảo toàn bộ trang có chiều cao 100% */
        html, body {
            height: 100%;
            margin: 0;
            padding: 0;
        }

        /* Sử dụng Flexbox để căn chỉnh layout */
        .full-height {
            display: flex;
            flex-direction: column;
            height: 100vh;
        }

        /* Nội dung chính chiếm phần còn lại của màn hình */
        .main-content {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body>

    <div class="full-height">
    <!-- header-->
    <%@include file="../GUI/header.jsp" %>
    <!-- End header-->
        
        <!-- Phần chính (Login form) sẽ căn giữa -->
        <div class="main-content">
            <div class="container">
                <%
		 String url1 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
		 %>
                <form class="p-4 border rounded shadow bg-light" method="post" action="<%=url1%>/khach-hang">
                    <!-- hành động của form  -->
                    <input class="form-control" name="hanhdong" value="login" type="hidden">
                    
                    <!-- Username or email input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="username_or_email">Username or email</label>
                        <input type="text" id="username_or_email" class="form-control" name="username_or_email" />
                    </div>

                    <!-- Password input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="password">Password</label>
                        <input type="password" id="password" class="form-control" name="password" />
                    </div>

                    <div class="row mb-2">
                        <a class="col-6 " href="#!">Forgot password?</a>
                        <a class="col-6 text-end">Đăng ký tài khoản</a>
                    </div>

                    <div class="row mb-2">
                        <input type="submit" class="btn btn-primary"/>
                    </div>
                </form>
            </div>
        </div>

        <!-- Footer -->
        
        
    </div>
                    
  <script src="../GUI/js/jquery-3.4.1.min.js"></script>
  <script src="../GUI/js/bootstrap.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
  </script>
  <script src="../GUI/js/custom.js"></script>

</body>
</html>