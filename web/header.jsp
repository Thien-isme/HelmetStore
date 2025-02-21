<%-- 
    Document   : header
    Created on : Feb 13, 2025, 10:17:42 PM
    Author     : Thien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

    </head>
    <body>
        <%
            String url = request.getScheme()+ "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
        %>
        
        <div class="header row">
            <div class="col-3">
                <a href="<%=url%>/header.jsp" target="_self"> <img src="<%=url%>/img/logo.png"></a>
            </div>
            <div class="col-6 pt-3">
                <form class="row" action="https://www.w3schools.com/tags/tag_a.asp">
                    <input class="form-control rounded-pill" type="search" placeholder="Search">
                </form>
                <div class="row pt-2 d-flex flex-row justify-content-between mt-auto">
                    <a class="col-4 text-center fs-4 text-decoration-none" href="<%=url%>/index.jsp" target="_self"> Home</a>
                    <a class="col-4 text-center fs-4 text-decoration-none no-wrap" href="<%=url%>/header.jsp" target="_self"> Best Sellers</a>
                    <a class="col-4 text-center fs-4 text-decoration-none" href="<%=url%>/header.jsp" target="_self"> Product</a>
                </div>
            </div>
            <div class="col-3 row d-flex flex-row justify-content-between align-items-center">
                    <a class="col-4 text-center fs-4 text-decoration-none" href="<%=url%>/khachhang/login.jsp" target="_self"> Login</a>
                    <a class="col-4 text-center fs-4 text-decoration-none" href="<%=url%>/khachhang/register.jsp" target="_self"> Register</a>
                    <a class="col-4 text-center fs-4 text-decoration-none no-wrap" href="<%=url%>/header.jsp" target="_self"> Giỏ Hàng</a>
            </div>
        </div>
    </body>
</html>
