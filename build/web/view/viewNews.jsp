<%-- 
    Document   : loadNews
    Created on : Mar 7, 2022, 10:49:26 PM
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

        <title>viewNews</title>
        <style>
            .news {
                width: 100%;
            }

            .news .top-news h1 {
                color: #c70101;
                font-size: 40px;
                text-align: center;
                background-color: rgba(128, 128, 128, 0.192);
                width: 100%;
                text-transform: uppercase;
            }
            .news .bottom-news{
                width: 100%;
                border: 1px solid black;
                margin-top: 20px;
                margin-bottom: 20px;
            }

            .news .bottom-news .left-bottom-news {
                width: 100%;

            }

            .news .bottom-news .left-bottom-news h3 {
                background-color: #c70101;
                font-size: 18px;
                width: 200px;
                text-align: center;
                color: white;
                position: absolute;
                border: 1px solid #fff;
                padding: 5px 10px;

            }

            .news .bottom-news .left-bottom-news img { 
                width: 100%;
                height: 200px;
            }

            .news .bottom-news .right-bottom-news {
                width: 100%;                                 
                margin-top: 20px;           
            }

            .news .bottom-news .right-bottom-news h1 {
                font-size: 20px;
                color: #c70101;
            }

            .news .bottom-news .right-bottom-news h2 {
                font-size: 16px;
                margin-top: 20px;
                color: #c70101c5;
            }
            .news .bottom-news .right-bottom-news h3{
                font-size: 14px;
                margin-top: 20px;
                color: gray;
            }
            .news .bottom-news a{
                text-decoration: none; 
                color: #c70101;
            }
            
        </style>
        <script src="js/paggerVN.js" type="text/javascript"></script>
    </head>

    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <div class="news">
            <div class="container">
                <div class="top-news">
                    <h1>News</h1>
                </div>
                <c:forEach items="${listpage}" var="g">
                    <div class="bottom-news">
                        <a href="detailN?newId=${g.newId}">
                            <div class="row">
                                <div class="col-md-4">
                                    <div class="left-bottom-news">
                                        <c:forEach items="${typeNews}" var="n">
                                            <c:if test="${g.typeId == n.typeId}">
                                                <h3>${n.typeName}</h3>
                                            </c:if>
                                        </c:forEach>                                  
                                        <img src="${g.img}"
                                             alt="">
                                    </div>
                                </div>
                                <div class="col-md-8">
                                    <div class="right-bottom-news">
                                        <h1>${g.title}</h1>
                                        <h2>${g.shortDescription}</h2>
                                        <h3>${g.datepublished}</h3>
                                    </div>
                                </div>
                            </div>
                        </a>
                    </div>
                </c:forEach>
                <div class="bottom3-managerCoach">
                        <div id='pagger'></div>
                        <script>
                            pagger('pagger', "${pageindex}", "${totalpage}");
                        </script>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>

</html>
