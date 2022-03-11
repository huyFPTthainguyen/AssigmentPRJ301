<%-- 
    Document   : home
    Created on : Feb 23, 2022, 11:26:29 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .home {
                width: 100%;
            }

            .home h1 {
                font-size: 40px;
                color: #c70101;
                font-weight: bold;
                text-transform: uppercase;
                text-align: center;
                margin: 40px 20px;
            }

            .home ul {
                list-style: none;
                padding-left: 0;
            }

            .home a {
                text-decoration: none;
            }

            .home a:hover {
                text-decoration: none;
            }

            .home-news {
                width: 100%;
            }

            .home-news .item-news {
                width: 100%;
                border: 1px solid #c70101;
                height: 100%;
                margin: 10px auto;
            }

            .home-news .item-news h4 {
                font-size: 20px;
                color: #c70101;
                background-color: #fff;
                width: 30px;
                height: 30px;
                text-align: center;
                position: absolute;
            }

            .home-news .item-news h2 {
                font-size: 20px;
                color: black;
                margin: 10px;
            }

            .home-news .item-news h3 {
                font-size: 20px;
                color: rgba(128, 128, 128, 0.822);
                margin: 10px;
            }

            .home-news .item-news p {
                font-size: 20px;
                color: black;
                margin: 20px;
            }

            .home .btn-show-more {
                width: 100%;
                text-align: center;
                margin: 20px auto;
            }

            .home .btn-show-more button {
                width: 200px;
                height: 50px;
                font-size: 20px;
                color: #fff;
                background-color: #c70101;
                font-weight: bold;
                outline: none;
                border: 1px solid #c70101;
                margin: 20px 10px;
            }

            .home .btn-show-more button:hover {
                color: #c70101;
                background-color: #fff;
                border: 1px solid #c70101;
            }

            .home .btn-show-more button:focus {
                color: #c70101;
                background-color: #fff;
                border: 1px solid #c70101;
            }                         
        </style>
        <title>Document</title>

    </head>

    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="MySlides.jsp"></jsp:include>
            <div class="home">
                <h1>News</h1>
                <div class="container">
                    <div class="home-news">
                        <div class="row">
                            <div class="col-md-6">
                            </div>
                            <div class="col-md-6">
                                <div class="row">
                                    <div class="col-md-6">
                                        <div class="item-news">
                                            <a href="">
                                                <h4>id</h4>
                                                <img src="https://sport5.mediacdn.vn/158855217956261888/2021/8/31/612e0ca8d5797-16304078663241506566383.jpg"
                                                     alt="" width="100%" height="300px">
                                                <h2>This is an important win in the Premier League before we turn our focus to
                                                    the Champions League and towards Madrid. Back to orbit! We unite!</h2>
                                                <h3>Ronaldo has labelled his recent injury issues as ‘the toughest
                                                    hurdle
                                                    in
                                                    my career so far’
                                                    but believes he has come out the other side with more perspective and
                                                    patience.
                                                </h3>
                                                <p>17 Feb 2022</p>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="item-news">
                                            <a href="">
                                                <h4>id</h4>
                                                <img src="https://sport5.mediacdn.vn/158855217956261888/2021/8/31/612e0ca8d5797-16304078663241506566383.jpg"
                                                     alt="" width="100%" height="300px">
                                                <h2>This is an important win in the Premier League before we turn our focus to
                                                    the Champions League and towards Madrid. Back to orbit! We unite!</h2>
                                                <h3>Ronaldo has labelled his recent injury issues as ‘the toughest
                                                    hurdle
                                                    in
                                                    my career so far’
                                                    but believes he has come out the other side with more perspective and
                                                    patience.
                                                </h3>
                                                <p>17 Feb 2022</p>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="btn-show-more">
                        <a href=""><button type="submit">See More News</button></a>
                    </div>
                
                </div>
            </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>

</html>
