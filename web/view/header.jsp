<%-- 
    Document   : header
    Created on : Feb 20, 2022, 3:51:39 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            header {
                background-image: url('images/background-champions-league.jpg');
                background-color: #231F20;
                width: 100%;
            }

            header ul {
                list-style: none;
                padding-left: 0;
                display: inline-block;
            }

            header li {
                display: inline-block;
            }

            .top-header {
                width: 100%;
            }

            .top-header .logo {
                width: 100%;
                text-align: center;
            }

            .top-header .logo-team img {
                margin: 5px 10px;
                width: 30%;
                height: 30%;
                margin-top: 8%;

            }

            .top-header .list-icons {
                width: 100%;
                text-align: center;
            }

            .top-header .list-icons ul {
                margin: 5px;
                margin-top: 35px;
            }
            .top-header .icons-social-media li {
                margin: 10px 10px;
            }

            .top-header .icons-social-media .fa {
                padding: 5px;
                width: 45px;
                font-size: 30px;
                color: #fff;
                border: 1px solid #fff;
                text-align: center;
                border-radius: 60%;
                margin-left: 15px;
            }

            .top-header .icons-social-media .fa:hover {
                background-color: red;
                color: white;
                border: 1px solid white;
            }

            .top-header .icons-login li {
                margin: 5px 5px;
            }

            .top-header .icons-login .fa {
                padding: 15px 30px;
                color: #fff;
                font-size: 20px;
                background: #d8302f;
                border-radius: 50px;
                border: 1px solid white;

            }

            .top-header .icons-login .fa:hover {
                color: white;
                background-color: red;
            }

            .top-header .icons-login .fa:focus {
                color: white;
                background-color: red;
            }
            .middle-header{
                width: 100%;
            }

            .middle-header .list-manager{
                width: 100%;
                text-align: center;
            }

            .middle-header .list-manager li{
                margin: 10px 20px;
                border: 1px solid #fff;
                padding: 10px;
            }

            .middle-header .list-manager a{
                font-size: 20px;
                color: #fff;
                text-decoration: none;
            }
            .middle-header .list-manager li:hover {           
                color: #d8302f;
                background-color: #c70101;
            }

            .middle-header .list-manager li:focus {             
                color: #d8302f;
                background-color: #c70101;
            }

            .bottom-header {
                background-color: #fff;
                width: 100%;
                border: 1px solid grey;
            }

            .bottom-header .list-menu {
                width: 100%;
                margin: 20px;
            }
            .bottom-header .list-menu a {
                font-size: 20px;
                font-weight: bold;
                text-transform: uppercase;
                text-decoration: none;
                color: red;
            }

            .bottom-header .list-menu a:hover {
                text-decoration: none;
                color: #d8302f;
            }

            .bottom-header .list-menu a:focus {
                text-decoration: none;
                color: #d8302f;
            }

            .bottom-header .input-search {
                width: 100%;
            }

            .bottom-header .input-group {
                width: 100%;
                margin: 10px 20px;
                text-align: center;
            }

            .bottom-header .text-input {
                width: 300px;
                height: 50px;
                font-size: 20px;
                padding: 10px 20px;
                outline: none;
                border: 2px solid #d8302f;
            }

            .bottom-header .btn-search .fa {
                font-size: 20px;
                color: #140A47;
                text-align: center;
                outline: none;
                background-color: #d8302f;
            }

            .bottom-header .btn-search {
                width: 70px;
                height: 50px;
                padding: 10px;
                outline: none;
                border: 2px solid #d8302f;
                background-color: #d8302f;
            }

            .bottom-header .btn-search:hover {
                outline: none;
            }

            .bottom-header .btn-search:focus {
                outline: none;
            }

            .bottom-header .list-menu li {
                margin: 0 20px;
            }
            .top-header .list-icons .name-login{
                font-size: 30px;             
                color: red;
                margin-left: 70px;
                text-decoration: none;
            }
            .top-header .name-login li{
                margin: 36px 10px;
            }

            .top-header .name-login a{
                font-size: 20px;
                color: #fff;
                text-decoration: none;
            }

            .top-header .name-login .fa{
                padding: 15px 15px;
                color: #fff;
                font-size: 15px;
                border: 1px solid white;
            }

            .top-header .name-login .fa:hover{
                color: #001489;
                background-color: #fff;
                border: 1px solid #001489;
            }

            .top-header .name-login .fa:focus{
                color: #001489;
                background-color: #fff;
                border: 1px solid #001489;
            }
        </style>
        <title>Document</title>
    </head>

    <body>
        <header>
            <div class="container">
                <div class="top-header">
                    <div class="row">
                        <div class="col-md-4">
                            <div class="logo">
                                <ul class="logo-team">
                                    <li><a href=""><img
                                                src="https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/1200px-Man_Utd_FC_.svg.png"
                                                alt="" width="100px" height="100px"></a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-8">
                            <div class="list-icons">
                                <ul class="icons-social-media">
                                    <li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#" class="instagram"><i class="fa fa-instagram"></i></a></li>
                                    <li><a href="#" class="youtube"><i class="fa fa-youtube"></i></a></li>
                                </ul>
                                <c:if test="${account== null}">
                                    <ul class="icons-login">
                                        <li><a href="login.jsp" class="user"><i class="fa fa-user">&nbspLogin</i></a></li>
                                        <li><a href="register.jsp" class="register"><i class="fa fa-registered">&nbspRegister</i></a></li>
                                    </ul>
                                </c:if>
                                <c:if test="${account != null}">
                                    <ul class="name-login">
                                        <li><a href="#">Hello ${account.userName}</a></li>
                                        <li><a href="Logout"><i class="fa fa-sign-out">Logout</i></a></li>
                                    </ul>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="middle-header">
                    <ul class="list-manager">
                        <c:if test="${account.isAdmin}">
                            <li><a href="ManagerA">Manager Account</a></li>                            
                            <li><a href="ManagerN">Manager News</a></li> 
                            <li><a href="ManagerC">Manager Coach</a></li>
                            <li><a href="ManagerP">Manager Team</a></li>
                            </c:if>
                    </ul>
                </div>
                <div class="bottom-header">
                    <div class="row">
                        <div class="col-md-7">
                            <div class="menu">
                                <ul class="list-menu">
                                    <li><a href="HomeC">Home</a></li>
                                    <li><a href="ViewN">News</a></li>                                 
                                    <li><a href="viewP">Teams</a></li>
                                    <li><a href="view/about.jsp">About</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-5">
                            <div class="input-search">
                                <form action="SearchC" method="post">
                                    <div class="input-group">
                                        <input class="text-input" value="" type="${listNews}" name="text-input" placeholder="Search">
                                        <button class="btn-search" type="submit"><i class="fa fa-search"></i></button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </header>

    </body>

</html>
