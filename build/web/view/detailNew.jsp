<%-- 
    Document   : detaiNew
    Created on : Mar 8, 2022, 10:28:40 PM
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
            .detailNew {
                width: 100%;
            }

            .detailNew .top-detailNew h1 {
                background-color: #c70101;
                font-size: 20px;
                width: 200px;
                text-align: center;
                color: white;
                position: absolute;
                border: 1px solid #fff;
                padding: 5px 10px;
            }

            .detailNew .top-detailNew h2 {
                color: #c70101;
                font-size: 30px;
            }

            .detailNew .top-detailNew h3 {
                color: gray;
                font-size: 18px;
            }

            .detailNew .middle-detailNew {
                width: 100%;
            }

            .detailNew .middle-detailNew img {
                width: 100%;
                height: 400px;
            }

            .detailNew .bottom-detailNew h1 {
                width: 100%;
                font-size: 25px;
                color: #c70101c5;
            }
            .detailNew .bottom-detailNew p{
                width: 100%;
            }
        </style>
        <title>detailNew</title>
    </head>

    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <div class="detailNew">
            <div class="top-detailNew">
                <div class="container">
                    <c:forEach items="${listTypenews}" var="cr">
                        <c:if test="${cr.typeId == news.typeId}">
                            <h1>${cr.typeName}</h1>
                        </c:if>
                    </c:forEach>
                    <br><br><br>
                    <h2>${news.title}</h2>
                    <br>
                    <h3>${news.datepublished}</h3>
                </div>
            </div>
            <div class="middle-detailNew">
                <img src="${news.img}" alt="">
            </div>
            <div class="bottom-detailNew">
                <div class="container">
                    <br><br>
                    <h1>${news.shortDescription}</h1><br>
                    <p>${news.content}
                    </p>
                </div>
            </div>

        </div>
                    <jsp:include page="footer.jsp"></jsp:include>
    </body>

</html>