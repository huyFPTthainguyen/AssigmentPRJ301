<%-- 
    Document   : updatePlayer
    Created on : Mar 9, 2022, 11:47:55 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }

            * {
                box-sizing: border-box;
            }

            .form-update {
                width: 70%;
                margin: 0 auto;
            }

            .form-update h3 {
                text-align: center;
                font-size: 40px;
                color: #c70101;
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
                background-color: #c70101c5;
                color: white;
                padding: 12px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color: #c70101c5;
            }

            .container {
                border-radius: 5px;
                background-color: #f2f2f2;
                padding: 20px;
            }
        </style>
    </head>
    <body>
        <div class="form-update">
            <h3>Update Player</h3>

            <div class="container">
                <form action="UpdateP" method="post">
                    <label for="">ID</label>
                    <input type="text" name="coachId" placeholder="" value="${player.playerId}" readonly="">
                    
                    <label for="">Name</label>
                    <input type="text" name="coachName" value="${player.playerName}" >

                    <label for="">Img</label>
                    <input type="text" name="img" value="${player.img}" placeholder="Enter img..">

                    <jsp:useBean id="dal" scope="page" class="dal.PlayerDBcontext" />
                    <label for="">Nationality</label>
                    <select name="nationalityId">
                        <c:forEach items="${dao.getAllNationality()}" var="listNA">
                            <option value="${listNA.nationalityId}" ${listNA.nationalityId==player.getAllNationality()?"selected":""}>${listNA.nationalityName}</option>
                        </c:forEach>
                    </select>

                    <label for="">Role</label>
                    <select name="roleId">
                        <c:forEach items="${dao.getPlayerRole()}" var="cr">
                            <option value="${cr.roleId}" ${cr.roleId==player.getPlayerById?"selected":""}>${cr.roleName}</option>
                        </c:forEach>
                    </select>

                    <label for="">Short Description</label>
                    <textarea name="shortDescription" placeholder="Write something.." style="height:200px">${player.shortDescription}</textarea>

                    <label for="">Information</label>
                    <textarea name="playerInfor" placeholder="Write something.." style="height:200px">${player.playerInfor}</textarea>

                    <input type="submit" value="Update Player">
                </form>
            </div>
        </div>
    </body>
</html>

