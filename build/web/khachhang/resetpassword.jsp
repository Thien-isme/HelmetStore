<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
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
        <!-- Header -->
        <%@include file="../header.jsp" %>

        <!-- Phần chính (Login form) sẽ căn giữa -->
        <div class="main-content">
            <div class="container">
                <form class="p-4 border rounded shadow bg-light" method="post">
                    <h1 class="text-center">Register Account</h1>
                    <!-- Username or Email input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="form2Example1">Username or Email</label>
                        <input type="email" id="form2Example1" class="form-control" />
                    </div>

                    <!-- password hiện tại input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="form2Example2">Password</label>
                        <input type="text" id="form2Example2" class="form-control" />
                    </div>
                    
                    <!-- NewPassword input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="form2Example2">New Password</label>
                        <input type="password" id="form2Example2" class="form-control" />
                    </div>
                    
                    <!-- NewPassword input -->
                    <div data-mdb-input-init class="form-outline mb-2">
                        <label class="form-label" for="form2Example2">New Password</label>
                        <input type="password" id="form2Example2" class="form-control" />
                    </div>

                    <div class="row mb-2">
                        <input type="submit" class="btn btn-primary" value="Reset Password" />
                    </div>
                </form>
            </div>
        </div>

        <!-- Footer -->
        <%--<%@include file="../header.jsp" %>--%>
        <jsp:include page="../header.jsp"></jsp:include>
    </div>

</body>
</html>
