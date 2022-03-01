<%-- 
    Document   : MySlides
    Created on : Feb 24, 2022, 4:17:47 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <style>
            .carousel-inner img {
                width: 100%;
                height: 700px;
                border-top: 1px solid #fff;
                border-bottom: 1px solid #fff;
            }
        </style>

        <title>My Slides</title>
    </head>
    <body>
        <div class="slides-show">
            <div id="demo" class="carousel slide" data-ride="carousel">
                <ul class="carousel-indicators">
                    <li data-target="#demo" data-slide-to="0" class="active"></li>
                    <li data-target="#demo" data-slide-to="1"></li>
                    <li data-target="#demo" data-slide-to="2"></li>
                </ul>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="https://i.ytimg.com/vi/wjoS-qfM0uQ/maxresdefault.jpg" alt="" width="100%" height="500px">
                        <div class="carousel-caption">
                            <h3 style="font-size: 40px">Nobody who ever gave his best regretted it.</h3>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="https://eu-images.contentstack.com/v3/assets/bltcc7a7ffd2fbf71f5/blt982e40af6d7f1d36/60db51c0cbc6070f5c3b30a6/39e10c262cfa79a800f298eebafb280ce3241bee.jpg?auto=webp&fit=crop&format=jpg&quality=60&w=1280" alt="" width="100%" height="500px">
                        <div class="carousel-caption">
                            <h3 style="font-size: 40px;">It’s not whether you get knocked down, it’s whether you get back up.</h3>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <img src="https://sbv.com.vn/wp-content/uploads/2020/12/sbv.com.vn-manchester-united-se-som-chieu-mo-duoc-sieu-sao-tre-tuoi-amad-diallo-traore-manchester-united-2.jpg" alt="" width="100%" height="500px">
                        <div class="carousel-caption">
                            <h3 style="font-size: 40px">If you Don’t Practice
                                You Don’t Derserve
                                to win!</h3>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a>
                <a class="carousel-control-next" href="#demo" data-slide="next">
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div>
        </div>
    </body>
</html>
