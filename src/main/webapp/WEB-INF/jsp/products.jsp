<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Product List</title>
    <%@ include file="header.jsp" %>

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>

<body>

<div class="container">
    <table class="table table-striped">
        <tr>
            <th>Product name</th>
            <th>Category</th>
            <th>Price</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.productName}</td>
                <td>${product.category}</td>
                <td>${product.price}</td>
                <td>
                    <form action="/deleteProduct" method="post" onclick="return confirm('Are you sure you want to delete product?');">
                        <input hidden name="id" value="${product.id}">
                        <button>
                            <i class="fas fa-trash"></i>
                        </button>
                    </form>
                    <form action="/editProduct" method="post" >
                        <input hidden name="id" value="${product.id}">
                        <button>
                            <i class="fas fa-cog"></i>
                        </button>
                    </form>
                    <form action="/details" method="GET" >
                        <input hidden name="id" value="${product.id}">
                        <button>
                            <i class="fas fa-info-circle"></i>
                        </button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <form action="/add_product">
        <input type="submit" value="Dodaj produkt"/>
    </form>
    <form action="/">
        <input type="submit" value="Strona glowna"/>
    </form>

</div>
</body>

</html>