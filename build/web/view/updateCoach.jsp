<%-- 
    Document   : updateCoach
    Created on : Mar 10, 2022, 9:26:08 PM
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
            <h3>Update Coach</h3>

            <div class="container">
                <form action="UpdateC" method="post">
             
                    <label for="">ID</label>
                    <input type="text" name="coachId" placeholder="" value="${coach.coachId}" placeholder="" readonly="">
                    
                    <label for="">Name</label>
                    <input type="text" name="coachName" placeholder="Enter name.." value="${coach.coachName}">

                    <label for="">Img</label>
                    <input type="text" name="img" value="${coach.img}" placeholder="Enter img..">
                    
                    <label for="">Date of Birth</label>
                    <input type="text" name="dob" placeholder="Enter date of birth.." value="${coach.dob}">

                    

                    <jsp:useBean id="dal" scope="page" class="dal.ManagerDBcontext" />
                    <label for="">Nationality</label>
                    <select name="nationalityId">
                        <c:forEach items="${dal.allNationality}" var="listNA">
                            <option value="${listNA.nationalityId}" ${listNA.nationalityId==coach.getNationalityId()?"selected":""}>${listNA.nationalityName}</option>
                        </c:forEach>
                    </select>
                    
                    

                    <label for="">Role</label>
                    <select name="roleId">
                        <c:forEach items="${dal.getCoachRole()}" var="cr">
                            <option value="${cr.roleId}" ${cr.roleId==coach.getRoleId()?"selected":""}>${cr.roleName}</option>
                        </c:forEach>
                    </select>

                   <label for="">Img Background</label>
                    <input type="text" name="imgBack" placeholder="Enter img background.." value="${coach.imgBack}">
                    
                    <label for="">Short Description</label>
                    <textarea name="shortDescription" placeholder="Write something.." style="height:200px">${coach.shortDescription}</textarea>

                    <label for="">Information</label>
                    <textarea name="playerInfor" placeholder="Write something.." style="height:200px">${coach.coachInfor}</textarea>

                    <input type="submit" value="Update Coach">
                </form>
            </div>
        </div>
                    
    </body>
</html>
