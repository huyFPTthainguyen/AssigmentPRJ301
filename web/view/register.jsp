<%-- 
    Document   : register
    Created on : Feb 20, 2022, 4:23:08 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
                background-color: rgba(255, 0, 0, 0.123);
                color: rgba(255, 0, 0, 0.822);
            }

            .form-register{
                width: 50%;
                margin: 3% auto;
            }

            .form-register h1{
                text-align: center;
                font-size: 40px;
            }

            * {
                box-sizing: border-box;
            }

            .container {
                padding: 40px;
                background-color: rgba(255, 0, 0, 0.123);
            }

            input[type=text],
            input[type=password] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                display: inline-block;
                border: none;
                background: #f1f1f1;
            }

            input[type=text]:focus,
            input[type=password]:focus {
                background-color: #ddd;
                outline: none;
            }

            hr {
                border: 1px solid #f1f1f1;
                margin-bottom: 25px;
            }

            .registerbtn {
                background-color: rgba(255, 0, 0, 0.842);
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            .registerbtn:hover {
                opacity: 1;
            }

            a {
                color: red;
            }

            .signin {
                background-color: #f1f1f1;
                text-align: center;
            }
        </style>

        <title>Register</title>
    </head>
    <body>
        <div class="form-register">
            <form action="">
                <div class="container">
                    <h1>Register</h1>
                    <hr>

                    <label for="user"><b>User Name</b></label>
                    <input type="text" placeholder="Enter User Name" name="user" id="user" required>

                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="pass" id="psw" required>

                    <label for="psw-repeat"><b>Repeat Password</b></label>
                    <input type="password" placeholder="Repeat Password" name="re-pass" id="psw-repeat" required>
                    <hr>

                    <button type="submit" class="registerbtn">Register</button>
                </div>

                <div class="container signin">
                    <p>Already have an account? <a href="login.jsp">Login</a>.</p>
                </div>
            </form>
        </div>
    </body>
</html>
