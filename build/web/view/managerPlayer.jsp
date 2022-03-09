<%-- 
    Document   : managerPlayer
    Created on : Mar 5, 2022, 11:09:10 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .managerPlayer {
            width: 100%;
        }

        .managerPlayer .top-managerPlayer h1 {
            color: #c70101;
            font-size: 40px;
            text-align: center;
            background-color: rgba(128, 128, 128, 0.192);
            margin: 40px 150px;
            text-transform: uppercase;
        }

        .managerPlayer .bottom-managerPlayer {
            width: 100%;
        }

        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer {
            width: 100%;
        }

        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer h3 {
            width: 100%;
            font-size: 25px;
            color: #c70101;
            margin-left: 65px;
        }

        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer .fa {
            padding: 15px 15px;
            color: #fff;
            font-size: 15px;
            background: green;
            border: 1px solid white;
            margin-left: 300px;
        }

        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer {
            width: 100%;
            margin-top: 40px;
            margin-left: 65px;
            text-align: center;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer th {
            background-color: #c70101;
            color: #fff;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer img {
            width: 70%;
            height: 200px;
            margin-left: 18px;
            padding: 12px 12px;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .table {
            width: 980px;

        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .fa {
            padding: 15px 15px;
            color: #fff;
            background: blue;
            border: 1px solid white;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .deleteplayer .fa {
            background-color: #c70101;
            color: #fff;
            padding: 15px 15px;
            border: 1px solid white;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .deleteplayer .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer .deleteplayer .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }
    </style>
    <title>Document</title>
</head>

<body>
    <div class="managerPlayer">
        <div class="top-managerPlayer">
            <h1>Manager players</h1>
        </div>
        <div class="bottom-managerPlayer">
            <div class="container">
                <div class="bottom1-managerPlayer">
                    <div class="row">
                        <div class="col-md-6">
                            <h3>There are 15 player</h3>
                        </div>
                        <div class="col-md-6">
                            <a href="view/addPlayer.jsp" class="addplayer"><i style="font-size:20px" class="fa">&#xf196; Add
                                    Player</i></a>
                        </div>
                    </div>
                </div>
                <div class="bottom2-managerPlayer">
                    <table border="1px solid black" class="table">
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Img</th>
                            <th>Date</th>
                            <th>Action</th>
                        </tr>
                        <c:forEach items="${listPlayers}" var="x">
                        <tr>
                            <td>${x.playerId}</td>
                            <td>${x.playerName}</td>
                            <td><img src="${x.img}" alt=""></td>
                            <td>${x.dob}</td>
                            <td>
                                <a href="view/updatePlayer.jsp" class="updateplayer"><i style="font-size:20px" class="fa">&#9756; Update
                                        Player</i></a><br><br>
                                <a href="" class="deleteplayer"><i style="font-size:21px" class="fa">&#xf014; Delete
                                        Player</i></a>
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
