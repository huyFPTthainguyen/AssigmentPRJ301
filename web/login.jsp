<%-- 
    Document   : login
    Created on : Feb 20, 2022, 4:22:25 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
                color: #9f0000;
                background-color: #fff;
            }

            .form-login {
                width: 50%;
                margin: 5% auto;
            }

            .form-login h2 {
                font-size: 40px;
                text-align: center;
                color: #9f0000;
            }

            form {
                border: 3px solid #f1f1f1;
            }

            input[type=text],
            input[type=password] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid rgb(204, 204, 204);
                box-sizing: border-box;
            }

            button {
                background-color: #9f0000;
                color: #fff;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            button:hover {
                opacity: 0.8;
            }

            .cancelbtn {
                width: auto;
                padding: 10px 18px;
                background-color: #9f0000;
            }

            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
            }

            .container {
                padding: 16px;
            }

            span.psw {
                float: right;
                padding-top: 16px;
            }
            a{
                color: #9f0000;
            }

            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }

                .cancelbtn {
                    width: 100%;
                }
            }
        </style>

        <title>Login</title>
    </head>

    <body>

        <div class="form-login">
            <h2>Login</h2>

            <form action="login" method="POST">
                <div class="imgcontainer">
                    <img src="https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/1200px-Man_Utd_FC_.svg.png"
                         alt="" class="logo" width="100px" height="100px">
                </div>

                <div class="container">
                    <label for="uname"><b>Username</b></label>
                    <input type="text" placeholder="Enter Username" name="user" required>
                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="pass" required>

                    <button type="submit">Login</button>
                    <label>
                        <input type="checkbox" name="remember"> Remember me
                    </label>
                </div>

                <div class="container" style="background-color:#f1f1f1">
                    <button type="button" class="cancelbtn">Cancel</button>
                    <span class="psw">Don't have an account yet? <a href="register.jsp">Register</a></span>
                </div>
            </form>
        </div>

    </body>

</html>