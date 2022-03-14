<%-- 
    Document   : managerNew
    Created on : Mar 5, 2022, 11:18:06 PM
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
        .managerCoach {
            width: 100%;
        }

        .managerCoach .top-managerCoach h1 {
            color: #c70101;
            font-size: 40px;
            text-align: center;
            background-color: rgba(128, 128, 128, 0.192);
            margin: 40px 150px;
            text-transform: uppercase;
        }

        .managerCoach .bottom-managerCoach {
            width: 100%;
        }

        .managerCoach .bottom-managerCoach .bottom1-managerCoach {
            width: 100%;
        }

        .managerCoach .bottom-managerCoach .bottom1-managerCoach h3 {
            width: 100%;
            font-size: 25px;
            color: #c70101;
            margin-left: 65px;
        }

        .managerCoach .bottom-managerCoach .bottom1-managerCoach .fa {
            padding: 15px 15px;
            color: #fff;
            font-size: 15px;
            background: green;
            border: 1px solid white;
            margin-left: 300px;
        }

        .managerCoach .bottom-managerCoach .bottom1-managerCoach .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerCoach .bottom-managerCoach .bottom1-managerCoach .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach {
            width: 100%;
            margin-top: 40px;
            margin-left: 65px;
            text-align: center;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach th {
            background-color: #c70101;
            color: #fff;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach img {
            width: 70%;
            height: 200px;
            margin-left: 18px;
            padding: 12px 12px;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach .table {
            width: 980px;

        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach .fa {
            padding: 15px 15px;
            color: #fff;
            background: blue;
            border: 1px solid white;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach .deleteCoach .fa {
            background-color: #c70101;
            color: #fff;
            padding: 15px 15px;
            border: 1px solid white;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach .deleteCoach .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerCoach .bottom-managerCoach .bottom2-managerCoach .deleteCoach .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }
        .managerCoach .bottom-managerCoach .bottom3-managerCoach{
                width: 100%;               
                text-align: center;
                margin-bottom: 20px;
            }
    </style>
    <script src="js/paggerC.js" type="text/javascript"></script>
    <title>Document</title>
</head>

<body>
    <jsp:include page="header.jsp"></jsp:include>
    <div class="managerCoach">
        <div class="top-managerCoach">
            <h1>Manager Coachs</h1>
        </div>
        <div class="bottom-managerCoach">
            <div class="container">
                <div class="bottom1-managerCoach">
                    <div class="row">
                        <div class="col-md-6">
                            <h3>There are ${totalcoach} Coachs</h3>
                        </div>
                        <div class="col-md-6">
                            <a href="view/addCoach.jsp" class="addCoach"><i style="font-size:20px" class="fa">&#xf196; Add
                                    Coach</i></a>
                        </div>
                    </div>
                </div>
                <div class="bottom2-managerCoach">
                    <table border="1px solid black" class="table">
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Img</th>
                            <th>Date</th>
                            <th>Action</th>
                        </tr>
                        <c:forEach items="${listpage}" var="x">
                        <tr>
                            <td>${x.coachId}</td>
                            <td>${x.coachName}</td>
                            <td><img src="${x.img}" alt=""></td>
                            <td>${x.dob}</td>
                            <td>
                                <a href="UpdateC?id=${x.coachId}" class="updateCoach"><i style="font-size:20px" class="fa">&#9756; Update
                                        Coach</i></a><br><br>
                                <a href="DeleteC?id=${x.coachId}" class="deleteCoach"><i style="font-size:21px" class="fa">&#xf014; Delete
                                        Coach</i></a>
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
                <div class="bottom3-managerCoach">
                        <div id='pagger'></div>
                        <script>
                            pagger('pagger', "${pageindex}", "${totalpage}");
                        </script>
                    </div>
            </div>
        </div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
</body>

</html>
