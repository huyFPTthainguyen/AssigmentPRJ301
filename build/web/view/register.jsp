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
            color: #9f0000;
            background-color: #fff;
        }

        .form-register {
            width: 50%;
            margin: 5% auto;
        }

        .form-register h2 {
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
            padding: 25px;
        }

        span.psw {
            float: right;
            padding-bottom: 16px;
            
        }

        a {
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

    <title>Register</title>
</head>

<body>
    <jsp:include page="header.jsp"></jsp:include>
    <div class="form-register">
        <h2>Register</h2>

        <form action="" method="">
            <div class="imgcontainer">
                <img src="https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/1200px-Man_Utd_FC_.svg.png"
                    alt="" class="logo" width="100px" height="100px">
            </div>

            <div class="container">
                <hr>
                <label for="uname"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="user" required>
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="pass" required>
                <label for="psw-repeat"><b>Repeat Password</b></label>
                <input type="password" placeholder="Repeat Password" name="re-pass" id="psw-repeat" required>
                
                </hr>
                <button type="submit" class="registerbtn">Register</button>
            </div>

            <div class="container" style="background-color:#f1f1f1">
                <span class="psw">Already have an account? <a href="login.jsp">Login</a></span>
            </div>
        </form>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
