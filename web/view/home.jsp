<%-- 
    Document   : home
    Created on : Feb 23, 2022, 11:26:29 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                width: 40%;
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
            .home-news .lastest-item {
                width: 100%;
                border: 1px solid #c70101;
                height: 100%;
                margin: 10px auto;
            }

            .home-news .lastest-item h4 {
                font-size: 20px;
                color: #c70101;
                background-color: #fff;
                width: 30px;
                height: 30px;
                text-align: center;
                position: absolute;
                padding: 5px 10px;
                width: 40%;
            }

            .home-news .lastest-item h2 {
                font-size: 20px;
                color: black;
                margin: 10px;
            }

            .home-news .lastest-item h3 {
                font-size: 20px;
                color: rgba(128, 128, 128, 0.822);
                margin: 10px;
            }

            .home-news .lastest-item p {
                font-size: 20px;
                color: black;
                margin: 20px;
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
                            <div class="lastest-item">
                            <c:forEach items="${lastestNews}" var="lastN">
                                <a href="detailNew?newId=${lastN.newId}">
                                    <c:forEach items="${listTypeNews}" var="listTN">
                                        <c:if test="${listTN.typeId == lastN.typeId}">
                                            <h4>${listTN.typeName}</h4>
                                        </c:if>
                                    </c:forEach>
                                    <img src="${lastN.img}" alt="Picture" width="100%" height="400px">
                                    <h2>${lastN.title}</h2>
                                    <h3>${lastN.shortDescription}</h3>
                                    <p>${lastN.datepublished}</p>                                  
                                </a>
                            </c:forEach>
                            </div>
                        </div>                      
                        <div class="col-md-6">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="item-news">
                                        <c:forEach items="${lastestNewsInterview}" var="lastNI">
                                            <a href="detailNew?newId=${lastNI.newId}">
                                                <c:forEach items="${listTypeNews}" var="listTN">
                                                    <c:if test="${listTN.typeId == lastNI.typeId}">
                                                        <h4>${listTN.typeName}</h4>
                                                    </c:if>
                                                </c:forEach>
                                                <img src="${lastNI.img}"
                                                     alt="" width="100%" height="300px">
                                                <h2>${lastNI.title}</h2>
                                                <h3>${lastNI.shortDescription}</h3>
                                                <p>${lastNI.datepublished}</p>
                                            </a>
                                        </c:forEach>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="item-news">
                                        <c:forEach items="${lastestNewsPosMatch}" var="lastNPM">
                                        <a href="detailNew?newId=${lastNPM.newId}">
                                            <c:forEach items="${listTypeNews}" var="listTN">
                                                    <c:if test="${listTN.typeId == lastNPM.typeId}">
                                                        <h4>${listTN.typeName}</h4>
                                                    </c:if>
                                                </c:forEach>
                                            <img src="${lastNPM.img}"
                                                 alt="" width="100%" height="300px">
                                            <h2>${lastNPM.title}</h2>
                                            <h3>${lastNPM.shortDescription}</h3>
                                            <p>${lastNPM.datepublished}</p>
                                        </a>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="btn-show-more">
                <a href="ViewN"><button type="submit">See More News</button></a>
            </div>

        </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>

</html>