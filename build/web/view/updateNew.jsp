<%-- 
    Document   : updateNew
    Created on : Mar 10, 2022, 10:04:27 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }

            * {
                box-sizing: border-box;
            }

            .form-update{
                width: 70%;
                margin: 0 auto;
            }

            .form-update h3{
                text-align: center;
                font-size: 40px;
                color: #140a47;
            }

            input[type=text],
            select,
            textarea {
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
                margin-top: 6px;
                margin-bottom: 16px;
                resize: vertical;
            }

            input[type=submit] {
                background-color: #001489;
                color: white;
                padding: 12px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color: #001589c0;
            }

            .container {
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 20px;
            }
        </style>

        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <div class="form-update">
            <h3>Update News</h3>

            <div class="container">
                <form action="updateNews" method="POST">
                    <label for="">ID</label>
                    <input type="text" name="newsId" placeholder="" value="${news.newId}" readonly="">
                    
                    <label for="">Title</label>
                    <input type="text" name="title" placeholder="Enter title.." value="${news.title}">

                    <label for="">Img</label>
                    <input type="text" name="img" placeholder="Enter url img.." value="${news.img}">

                    <label for="">Date Published</label>
                    <input type="text" name="datePublished" placeholder="Enter date published.." value="${news.datepublished}">

                    <label for="">Short Description</label>
                    <textarea name="shortDescription" placeholder="Write something.." style="height:200px">${news.shortDescription}</textarea>

                    <label for="">Content</label>
                    <textarea name="content" placeholder="Write something.." style="height:200px">${news.content}</textarea>

                    <jsp:useBean id="dal" scope="page" class="dal.NewDBcontext" />
                    <label for="">Type News</label>
                    <select name="typeId">
                        <c:forEach items="${dal.getTypeNews()}" var="listTN">
                            <option value="${listTN.typeId}" ${listTN.typeId==news.getTypeId()?"selected":""}>${listTN.typeName}</option>
                        </c:forEach>
                    </select>
                    <input type="submit" value="Update News">
                </form>
            </div>
        </div>
                    <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

