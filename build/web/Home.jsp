<%-- 
    Document   : Home
    Created on : Feb 18, 2022, 7:40:35 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .home {
                width: 100%;
            }

            .home h1 {
                text-align: center;
                font-size: 40px;
                font-weight: bold;
                text-transform: uppercase;
                color: #140a47;
                background-color: #f1f1f1;
                padding: 10px 0;
                margin: 40px 0;
            }

            .home a {
                text-decoration: none;
            }

            .home a:hover {
                text-decoration: none;
            }

            .home ul {
                padding-left: 0;
                list-style: none;
            }

            .home .btn-show-more {
                text-align: center;
                margin: 40px 0;
            }

            .home .btn-show-more a {
                background-color: #0033ff;
                border: 1px solid #140a47;
                font-size: 20px;
                color: #fff;
                padding: 15px 25px;
            }

            .home .btn-show-more a:hover {
                background-color: #fff;
                border: 1px solid #140a47;
                color: #0033ff;
                text-decoration: none;
            }

            .home .btn-show-more a:focus {
                background-color: #fff;
                border: 1px solid #140a47;
                color: #0033ff;
                text-decoration: none;
            }

            .home-news {
                width: 100%;
            }

            .home-news .top-news-lastest {
                width: 100%;
            }

            .home-news .lastest-item {
                width: 100%;
                border: 1px solid #001489;
                height: 600px;
            }

            .home-news .lastest-item h6 {
                background-color: #0033ff;
                width: 150px;
                height: 30px;
                font-size: 15px;
                text-align: center;
                color: #fff;
                padding: 5px 0;
                position: absolute;
                top: 0;
            }

            .home-news .lastest-item h2 {
                font-size: 20px;
                padding: 20px;
                color: #001489;
            }

            .home-news .lastest-item p {
                font-size: 18px;
                color: grey;
                padding: 10px 20px;
            }

            .home-news .next-item {
                width: 100%;
                border: 1px solid #001489;
                height: 600px;
            }

            .home-news .next-item h6 {
                background-color: #0033ff;
                width: 150px;
                height: 30px;
                font-size: 15px;
                text-align: center;
                color: #fff;
                padding: 5px 0;
                position: absolute;
                top: 0;
            }

            .home-news .next-item h2 {
                font-size: 20px;
                padding: 10px 20px;
                color: #001489;
            }

            .home-news .next-item h3 {
                font-size: 15px;
                padding: 5px 20px;
                color: black;
            }

            .home-news .next-item p {
                font-size: 18px;
                color: grey;
                padding: 5px 20px;
            }

            .home-news .item-news {
                width: 100%;
                margin: 20px 0;
                border: 1px solid #001489;
            }

            .home-news .item-news h6 {
                background-color: #0033ff;
                width: 150px;
                height: 30px;
                font-size: 15px;
                text-align: center;
                color: #fff;
                padding: 5px 0;
                position: absolute;
                top: 0;
            }

            .home-news .item-news h2 {
                font-size: 20px;
                padding: 10px;
                color: #001489;
            }

            .home-news .item-news h3 {
                font-size: 15px;
                padding: 10px;
                color: black;
            }

            .home-news .item-news p {
                font-size: 18px;
                color: grey;
                padding: 5px 10px;
            }

            .home-matches {
                width: 100%;
            }

            .home-matches .frame-matches {
                width: 100%;
                border: 2px solid #001489;
            }

            .home-matches .top-matches-infor {
                width: 100%;
            }

            .home-matches .top-matches-infor .time-place {
                width: 100%;
            }

            .home-matches .top-matches-infor li {
                display: inline-block;
                color: #001489;
                font-weight: bold;
                font-size: 20px;
                margin: 20px 0 15px 0;
                padding: 10px 15px;
                border: 1px solid #001489;
            }

            .home-matches .top-matches-infor li:first-child{
                margin-left: 20px;
            }

            .home-matches .top-matches-infor img{
                margin: 10px 0 10px 75%;
            }

            .home-matches .middle-matches-infor{
                width: 100%;
                border-top: 2px solid #001489;
                border-bottom: 2px solid #001489;
            }

            .home-matches .middle-matches-infor img{
                display: block;
                margin: 10px auto;
            }

            .home-matches .middle-matches-infor .pair-matches-name{
                width: 100%;
                text-align: center;
                margin: 15px 0;
            }
            
            .home-matches .middle-matches-infor span{
                text-align: center;
                font-size: 50px;
                font-weight: bold;
                color: #140a47;
                padding: 5px 10px;
            }

            .home-matches .bottom-matches-infor{
                width: 100%;
            }

            .home-matches .bottom-matches-infor h3{
                font-size: 40px;
                text-align: center;
                padding: 10px 0;
                color: #140a47;
                font-family: fantasy;
            }
            
        </style>

        <title>JSP Page</title>
    </head>
    
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
        <jsp:include page="Slideshow.jsp"></jsp:include>

            <div class="home">
                <div class="container">
                    <h1>Breaking-News</h1>
                    <div class="home-news">
                        <div class="top-news-lastest">
                            <div class="row">
                            <c:forEach items="${lastestNews}" var="lastN">
                                <div class="col-md-6">
                                    <div class="lastest-item">
                                        <a href="detailNews?newsId=${lastN.newsId}">
                                            <div class="img">
                                                <c:forEach items="${listTypeNews}" var="listTN">
                                                    <c:if test="${listTN.typeId == lastN.typeId}">
                                                        <h6>${listTN.typeName}</h6>
                                                    </c:if>
                                                </c:forEach>
                                                <img src="${lastN.img}" alt="Picture" width="100%"
                                                     height="400px">
                                            </div>
                                            <div class="short-description">
                                                <h2>${lastN.title}</h2>
                                                <p>${lastN.datePublished}</p>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </c:forEach>
                            <c:forEach items="${lastestNewsInterview}" var="lastNI">
                                <div class="col-md-3">
                                    <div class="next-item">
                                        <a href="detailNews?newsId=${lastNI.newsId}">
                                            <div class="img">
                                                <c:forEach items="${listTypeNews}" var="listTN">
                                                    <c:if test="${listTN.typeId == lastNI.typeId}">
                                                        <h6>${listTN.typeName}</h6>
                                                    </c:if>
                                                </c:forEach>
                                                <img src="${lastNI.img}" alt="Picture" width="100%"
                                                     height="200px">
                                            </div>
                                            <div class="short-description">
                                                <h2>${lastNI.title}</h2>
                                                <h3>${lastNI.shortDescription}</h3>
                                                <p>${lastNI.datePublished}</p>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="bottom-news-lastest">
                        <c:forEach items="${lastestNewsPosMatch}" var="lastNPM">
                            <div class="item-news">
                                <a href="detailNews?newsId=${lastNPM.newsId}">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="img">
                                                <c:forEach items="${listTypeNews}" var="listTN">
                                                    <c:if test="${listTN.typeId == lastNPM.typeId}">
                                                        <h6>${listTN.typeName}</h6>
                                                    </c:if>
                                                </c:forEach>
                                                <img src="${lastNPM.img}" alt="Picture" width="100%"
                                                     height="auto">
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="short-description">
                                                <h2>${lastNPM.title}</h2>
                                                <h3>${lastNPM.shortDescription}</h3>
                                                <p>${lastNPM.datePublished}</p>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="btn-show-more">
                    <a href="loadNews">See All News</a>
                </div>
                <h1>Matches</h1>
                <div class="home-matches">
                    <div class="frame-matches">
                        <c:forEach items="${lastestMatch}" var="lastM">
                            <div class="container">
                                <div class="top-matches-infor">
                                    <div class="row">
                                        <div class="col-md-6">
                                            <ul class="time-place">
                                                <li>${lastM.date}</li>
                                                <li>${lastM.place}</li>
                                            </ul>
                                        </div>
                                        <div class="col-md-6">
                                            <c:forEach items="${listTournament}" var="listTour">
                                                <c:if test="${listTour.tournamentId == lastM.tournamentId}">
                                                    <img src="${listTour.img}" alt="Tournament" width="100px" height="80px">
                                                </c:if>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                                <div class="middle-matches-infor">
                                    <div class="row">
                                        <div class="col-md-2">
                                            <div class="logo-team-home">
                                                <c:forEach items="${myTeam}" var="myT">
                                                    <c:if test="${myT.teamId == lastM.homeId}">
                                                        <img src="${myT.img}" alt="" width="100px" height="100px">
                                                    </c:if>
                                                </c:forEach>
                                            </div>
                                        </div>
                                        <div class="col-md-8">
                                            <div class="pair-matches-name">
                                                <div class="row">
                                                    <div class="col-md-5">
                                                        <c:forEach items="${myTeam}" var="myT">
                                                            <c:if test="${myT.teamId == lastM.homeId}">
                                                                <span class="name-team">${myT.teamName}</span>
                                                                </c:if>
                                                            </c:forEach>
                                                    </div>
                                                    <div class="col-md-2">
                                                        <span class="venus">Vs</span>
                                                    </div>
                                                    <div class="col-md-5">
                                                        <c:forEach items="${listOpponent}" var="listOp">
                                                            <c:if test="${listOp.teamId == lastM.awayId}">
                                                                <span class="name-team">${listOp.teamName}</span>
                                                                </c:if>
                                                            </c:forEach>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-2">
                                            <div class="logo-team-away">
                                                <c:forEach items="${listOpponent}" var="listOp">
                                                    <c:if test="${listOp.teamId == lastM.awayId}">
                                                        <img src="${listOp.img}" alt="" width="100px" height="100px">
                                                    </c:if>
                                                </c:forEach>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="bottom-matches-infor">
                                    <h3>Next Match</h3>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="btn-show-more">
                    <a href="loadMatch">See All Matches</a>
                </div>
            </div>
        </div>

        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
