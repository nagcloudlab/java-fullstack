<!DOCTYPE html>
<%@ page import="java.time.*,java.util.*,com.example.entity.*" %>  
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index</title>
    <link href="./css/bootstrap.css" rel="stylesheet">
</head>

<body class="container">

    <hr />
    <div>todo-app : using JEE technologies</div>
    <hr />
    
    <table class="table table-bordered">
        <% List<Todo> todos=(List<Todo>)request.getAttribute("todos"); %>

        <% for(Todo todo: todos){ %>
            <tr>
                <td><%=todo.getId()%></td>
                <td><%=todo.getTitle()%></td>
                <td><%=todo.isCompleted()%></td>
            </tr>
        <% } %>
    </table>
    
    </hr/>

</body>

</html>