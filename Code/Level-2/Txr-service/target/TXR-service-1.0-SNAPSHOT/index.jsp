<%--
  Created by IntelliJ IDEA.
  User: nag
  Date: 02/08/21
  Time: 3:16 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="container">
<hr/>
<div>Txr-service powered by spring framework</div>
<hr/>
    ${requestScope.message}
<hr/>


<div class="row">
    <div class="col-6">
        <div class="card">
            <div class="card-header">Transfer Form</div>
            <div class="card-body">
                <form action="txr" method="post">
                    <div class="form-group">
                        <label>Amount</label>
                        <input class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label>From Account</label>
                        <input class="form-control"/>
                    </div>
                    <div class="form-group">
                        <label>To Account</label>
                        <input class="form-control"/>
                    </div>
                    <button>transfer</button>
                </form>
            </div>
        </div>
    </div>
</div>


</body>
</html>
