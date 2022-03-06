<%-- 
    Document   : detailCoach
    Created on : Mar 3, 2022, 10:28:49 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
            .detailPlayer {
                width: 100%;
            }

            .detailPlayer .top-detailPlayer img {
                width: 100%;
            }
            .detailPlayer .top-infor-player{
                width: 100%;
                margin-top: 30px;
            }            
            .detailPlayer .top-infor-player .picture-player img{
                border: 1.5px solid black;
            }

            .detailPlayer .top-infor-player .frame-infor-player{
                width: 100%;

            }
            .detailPlayer .top-infor-player .frame-infor-player{
                border: 1.5px solid black;
            }

            .detailPlayer .top-infor-player .frame-infor-player .top-part h4{
                font-size: 40px;
                color: #c70101;
                margin-top: 30px;
                margin-left: 30px;
            }
            .detailPlayer .top-infor-player .frame-infor-player .top-part h5{
                margin-top: 30px;
                margin-left: 30px;
                font-size: 15px;
            }
            .detailPlayer .top-infor-player .frame-infor-player .bottom-part{
                width: 100%;
                margin-left: 30px;
                
            }

            .detailPlayer .top-infor-player .frame-infor-player .bottom-part .attribute{
                font-size: 15px;
                
            }
            .detailPlayer .top-infor-player .frame-infor-player .bottom-part .data{
                font-size: 15px;
                position: absolute;
                left: 75%;
                
            }
            .detailPlayer .bottom-infor-player{
                width: 100%;
            }
            .detailPlayer .bottom-infor-player h2{
                color: black;
                font-size: 40px;
                text-align: center;
                background-color: rgba(128, 128, 128, 0.192);
                margin: 40px 0;
            }

            .detailPlayer .bottom-infor-player h3{
                color: #c70101;
                font-size: 20px;
                
            }
            .detailPlayer .bottom-infor-player p{
                font-size: 15px;
            }
        </style>
        <title>detailPlayer</title>
    </head>

    <body>
        <div class="detailPlayer">
            <div class="top-detailPlayer">
                <img src="${coach.imgBack}" alt="" width="100%" height="450px">
            </div>           
            <div class="container">
                <div class="top-infor-player">
                    <div class="row">
                        <div class="col-md-4">
                            <div class="picture-player">
                                
                                <img src="${coach.img}" alt="" width="80%" height="200px">
                            </div>
                        </div>
                        <div class="col-md-8">
                            <div class="frame-infor-player">
                                <div class="top-part">
                                    <h4>${coach.coachName}</h4>                           
                                    <h5>Personal Information</h5>
                                </div>
                                <hr  width="91%" size="5px" align="center" color="#c70101" />
                                <div class="bottom-part">
                                    <table>
                                        <tr>
                                            <td class="attribute">Coach Name:</td>
                                            <td class="data">${coach.coachName}</td>
                                        </tr>
                                        <tr>
                                            <td class="attribute">Birthplace:</td>
                                            <td class="data">${coach.dob}</td>
                                        </tr>
                                        <tr>
                                            <td class="attribute">Position:</td>
                                            <c:forEach items="${listCoachRole}" var="cr">
                                                            <c:if test="${cr.roleId == coach.roleId}">
                                                                <td class="data">${cr.roleName}</td>
                                                            </c:if>
                                            </c:forEach>                                    
                                        </tr>                                        
                                    </table>
                                </div>   
                            </div>
                        </div>                    
                    </div>
                </div>
                
                <div class="bottom-infor-player">
                    <h2>Biography</h2>
                    <h3>${coach.shortDescription}</h3>
                    <p>${coach.coachInfor}</p>
                </div>              
            </div>
        </div>
    </body>

</html>
