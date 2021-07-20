<!DOCTYPE html>

<%@ page import="java.util.*,com.example.entity.Product" %>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>

<body class="container">

    <hr />
    <div>Product Management</div>
    <hr />

    <%

    List<Product> products=(List<Product>)request.getAttribute("all-products");

    %>


    <table class="table">
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Price</th>
                <th>Type</th>
            </tr>
        </thead>
        <tbody>
            <%
            for(Product product:products){
            %>
        
            <tr>
                <td><%=product.getId()%></td>
                <td><%=product.getName()%></td>
                <td>&#8377;<%=product.getPrice()%></td>
                <td><%=product.getType()%></td>
        
            </tr>
        
            <%
                }
            %>
            </tbody>
    </table>    

    
</body>

</html>