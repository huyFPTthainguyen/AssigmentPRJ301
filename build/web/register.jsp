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
        
        <link href="css/register.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
                background-color: white;
            }

            .form-register {
                width: 50%;
                margin: 3% auto;
            }

            .form-register h1 {
                text-align: center;
                font-size: 40px;
                color: #c70101;
            }

            .form-register * {
                box-sizing: border-box;
            }

            .form-register .container {
                padding: 16px;
                background-color: white;
            }

            .form-register input[type=text],
            .form-register input[type=password] {
                width: 100%;
                padding: 15px;
                margin: 5px 0 22px 0;
                display: inline-block;
                border: none;
                background: #f1f1f1;
            }

            .form-register input[type=text]:focus,
            .form-register input[type=password]:focus {
                background-color: #ddd;
                outline: none;
            }

            .form-register hr {
                border: 1px solid #f1f1f1;
                margin-bottom: 25px;
            }

            .form-register .registerbtn {
                background-color: #c70101;
                color: white;
                padding: 16px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
                opacity: 0.9;
            }

            .form-register .registerbtn:hover {
                opacity: 1;
            }

            .form-register a {
                color: dodgerblue;
            }

            .form-register .signin {
                background-color: #f1f1f1;
                text-align: center;
            }

        </style>
    </head>
    <body>
        <div class="form-register">
            <form action="register" method="post">
                <div class="container">
                    <h1>Register</h1>
                    <hr>
                    <label for="user"><b>User Name</b></label>
                    <input type="text" placeholder="Enter User Name" name="user" id="user" required>

                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="pass" id="psw" required>

                    <label for="psw-repeat"><b>Repeat Password</b></label>
                    <input type="password" placeholder="Repeat Password" name="repass" id="psw-repeat" required>
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
