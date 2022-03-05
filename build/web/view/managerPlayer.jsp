<%-- 
    Document   : managerPlayer
    Created on : Mar 5, 2022, 11:09:10 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

            .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer{
                width: 100%;
            }
            .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer h3{
                width: 100%;
                font-size: 25px;
                color: #c70101;
                margin-left: 65px;
            }
            .managerPlayer .bottom-managerPlayer .bottom1-managerPlayer a{
                width: 100%;
                font-size: 25px;
                color: #c70101;
                margin-left: 250px;
                padding: 6px 12px;
                border: 1px solid black;          
            }
            .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer{
                width: 100%;
                margin-top: 40px;
                margin-left: 65px;
            }
            .managerPlayer .bottom-managerPlayer .bottom2-managerPlayer img{
                width: 70%;
                height: 200px;
                margin-left: 60px;
                padding: 12px 12px;
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
                                <a href="">Add Players</a>
                            </div>
                        </div>
                    </div>
                    <div class="bottom2-managerPlayer">
                        <table border="1px solid black">
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Img</th>
                                <th>Date</th>
                                <th>Action</th>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>Huy</td>
                                <td><img src="https://i.ytimg.com/vi/wjoS-qfM0uQ/maxresdefault.jpg" alt=""></td>
                                <td>2022-1-1</td>
                                <td>
                                    <a href="">Update Players</a><br>
                                    <a href="">Delete Players</a>
                                </td>                            
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>

</html>
