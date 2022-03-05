<%-- 
    Document   : managerNew
    Created on : Mar 5, 2022, 11:18:06 PM
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
        .managerNew {
            width: 100%;
        }

        .managerNew .top-managerNew h1 {
            color: #c70101;
            font-size: 40px;
            text-align: center;
            background-color: rgba(128, 128, 128, 0.192);
            margin: 40px 150px;
            text-transform: uppercase;
        }

        .managerNew .bottom-managerNew {
            width: 100%;
        }

        .managerNew .bottom-managerNew .bottom1-managerNew {
            width: 100%;
        }

        .managerNew .bottom-managerNew .bottom1-managerNew h3 {
            width: 100%;
            font-size: 25px;
            color: #c70101;
            margin-left: 65px;
        }

        .managerNew .bottom-managerNew .bottom1-managerNew .fa {
            padding: 15px 15px;
            color: #fff;
            font-size: 15px;
            background: green;
            border: 1px solid white;
            margin-left: 300px;
        }

        .managerNew .bottom-managerNew .bottom1-managerNew .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerNew .bottom-managerNew .bottom1-managerNew .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew {
            width: 100%;
            margin-top: 40px;
            margin-left: 65px;
            text-align: center;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew th {
            background-color: #c70101;
            color: #fff;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew img {
            width: 70%;
            height: 200px;
            margin-left: 18px;
            padding: 12px 12px;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew .table {
            width: 980px;

        }

        .managerNew .bottom-managerNew .bottom2-managerNew .fa {
            padding: 15px 15px;
            color: #fff;
            background: blue;
            border: 1px solid white;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew .deleteNew .fa {
            background-color: #c70101;
            color: #fff;
            padding: 15px 15px;
            border: 1px solid white;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew .deleteNew .fa:hover {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }

        .managerNew .bottom-managerNew .bottom2-managerNew .deleteNew .fa:focus {
            color: #c70101;
            background-color: #fff;
            border: 1px solid #140a47;
        }
    </style>
    <title>Document</title>
</head>

<body>
    <div class="managerNew">
        <div class="top-managerNew">
            <h1>Manager players</h1>
        </div>
        <div class="bottom-managerNew">
            <div class="container">
                <div class="bottom1-managerNew">
                    <div class="row">
                        <div class="col-md-6">
                            <h3>There are 15 News</h3>
                        </div>
                        <div class="col-md-6">
                            <a href="" class="addNew"><i style="font-size:20px" class="fa">&#xf196; Add
                                    New</i></a>
                        </div>
                    </div>
                </div>
                <div class="bottom2-managerNew">
                    <table border="1px solid black" class="table">
                        <tr>
                            <th>ID</th>
                            <th>Tittle</th>
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
                                <a href="" class="updateNew"><i style="font-size:20px" class="fa">&#9756; Update
                                        New</i></a><br><br>
                                <a href="" class="deleteNew"><i style="font-size:21px" class="fa">&#xf014; Delete
                                        New</i></a>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
