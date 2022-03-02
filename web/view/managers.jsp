<%-- 
    Document   : managers
    Created on : Mar 1, 2022, 4:56:00 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .teams {
            width: 100%;
        }

        .top-teams {
            width: 100%;
            margin: 40px 0;
        }

        .top-teams h1 {
            font-size: 40px;
            color: #c70101;
            font-family: fantasy;
            text-align: center;
            text-transform: uppercase;
            margin: 5px 10px;
        }

        .top-teams .player-management {
            list-style: none;
            padding-left: 0;
            text-align: center;
        }

        .top-teams .player-management a {
            text-decoration: none;
        }

        .top-teams .player-management li {
            display: inline-block;
            background-color: #c70101;
            text-align: center;
            width: 150px;
            height: 50px;
            padding: 10px;
            font-size: 20px;
            border: 1px solid #1a1a1a;
            color: #fff;
            margin: 5px 10px;
        }

        .top-teams .player-management li:hover {
            background-color: #fff;
            border: 1px solid #1a1a1a;
            color: #c70101;
        }

        .top-teams .player-management li:focus {
            background-color: #fff;
            border: 1px solid #1a1a1a;
            color: #c70101;
        }

        .bottom-teams {
            width: 100%;
        }

        .bottom-teams h2 {
            color: #1a1a1a;
            font-family: fantasy;
            margin: 40px 10px;
        }

        .bottom-teams .frame-player {
            width: 100%;
        }

        .bottom-teams .frame-player a {
            text-decoration: none;
        }

        .bottom-teams .frame-player .name-nationality {
            width: 100%;
            margin: 3px 0;
        }

        .bottom-teams .frame-player .name-nationality p {
            font-size: 20px;
            color: #c70101;
            font-weight: bold;
            margin: 10px;
            text-align: center;
        }

        .bottom-teams .frame-player .name-nationality img {
            margin: 10px auto;
            display: block;
        }
    </style>
    <title>Document</title>
</head>

<body>
    <jsp:include page="header.jsp"></jsp:include>
    <div class="teams">
        <div class="container">
            <div class="top-teams">
                <div class="row">
                    <div class="col-md-6">
                        <h1>Manchester United FC</h1>
                    </div>
                    <div class="col-md-6">
                        <ul class="player-management">
                            <a href="viewP">
                                <li>Players</li>
                            </a>
                            <a href="viewM">
                                <li>Management</li>
                            </a>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="bottom-teams">
                <div class="manager-infor">
                    <h2>Managers</h2>
                    <div class="frame-manager">
                        <div class="row">
                            <c:forEach items="${listCoachs}" var="g">
                                <div class="col-md-3">
                                    <a href="">                                        
                                        <img src="${g.img}" alt="" width="100%" height="300px">
                                        <div class="name-nationality">
                                            <div class="row">
                                                <div class="col-md-7">
                                                    <p>${g.coachName}</p>
                                                </div>
                                                <div class="col-md-5">
                                                    <c:forEach items="${listNationality}" var="n">
                                                        <c:if test="${g.nationalityId == n.nationalityId}">
                                                            <img src="${n.img}" alt="" width="50px" height="30px">
                                                        </c:if>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                    </a>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
