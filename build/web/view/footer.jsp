<%-- 
    Document   : footer
    Created on : Feb 19, 2022, 10:13:50 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<style>
    .footer-1 {
        background-color: rgba(255, 0, 0, 0.644);
    }

    .imgLogo img {
        height: 50%;
        width: 70%;
    }

    .join {
        text-align: center;
        font-size: 30px;
        color: azure;
        border-bottom: 1px solid;
    }

    .MU {
        color: whitesmoke;
        font-size: 14px;
    }

    footer-1 {
        border-bottom: 1px solid;
        color: white;
    }

    .link-web li {
        width: 40px;
        display: inline-block;
        color: white;
        padding: 10px;
        font-size: 20px;
        text-align: center;
        margin-left: 25px;
        margin-top: 10px;
        border: 1px solid #fff;
        border-radius: 50%;
    }
    .link-web li:hover{
        background-color: red;
            color: white;
            border: 1px solid white;
    }
    .link-web a {
        color: aliceblue;
    }

    .menu-1 {
        text-align: center;
        font-size: 30px;
        color: azure;
        border-bottom: 1px solid;
    }

    .list-menu li {
        list-style: none;
        font-size: 16px;
        text-align: center;
    }

    .list-menu a {
        color: white;
    }

    .contact-us {
        text-align: center;
        color: white;
        font-size: 30px;
        border-bottom: 1px solid;
    }

    .list-contact li {
        list-style: none;
        font-size: 16px;
    }

    .list-contact i {
        color: white;
        font-size: 20px;
    }
</style>

<body>
    <footer>
        <div class="footer-1">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <h1 class="join">Join us</h1>
                        <div class="row">
                            <div class="col-md-6 imgLogo">
                                <img src="https://upload.wikimedia.org/wikipedia/vi/thumb/a/a1/Man_Utd_FC_.svg/1200px-Man_Utd_FC_.svg.png"
                                    alt="">
                            </div>
                            <p class="MU">Manchester United Football Club is a professional football club based in Old
                                Trafford,
                                Greater Manchester, England. The club is playing in the English Premier League.</p>
                        </div>
                        <ul class="link-web">
                            <li><a href="https://www.facebook.com/manchesterunited" class="facebook"><i
                                        class="fa fa-facebook"></i></a></li>
                            <li><a href="" class="twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="" class="instagram"><i class="fa fa-instagram"></i></a></li>
                            <li><a href="" class="youtube"><i class="fa fa-youtube"></i></a></li>
                        </ul>
                    </div>
                    <div class="col-md-4">
                        <h1 class="menu-1">Menu</h1>
                        <div class="menu">
                            <ul class="list-menu">
                                <li><a href="">Home</a></li>
                                <li><a href="">News</a></li>
                                <li><a href="">Matches</a></li>
                                <li><a href="">Teams</a></li>
                                <li><a href="">About</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <h1 class="contact-us">Contact Us</h1>
                        <div class="contact">
                            <ul class="list-contact">
                                <li><i class="fa fa-map-marker"></i> &ensp;Manchester, London, UK</li>
                                <li><i class="fa fa-phone"></i> &ensp;0989668350</li>
                                <li><i class="fa fa-envelope"></i> &ensp;ManchesterUnited@gmail.com</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </footer>
</body>

</html>
