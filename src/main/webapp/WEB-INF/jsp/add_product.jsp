<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>Adding Product</title>
    <%@ include file="header.jsp" %>
</head>

<body>
<div class="container">
    <form:form method="POST"
               action="/product" modelAttribute="productDto">
        <form:input class="form-control" path="id" hidden="true"/>

        <div class="form-group">
            <form:label path="productName">Product name</form:label>
            <form:input class="form-control" path="productName" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="category">Category</form:label>
            <form:input class="form-control" path="category" required="true"/>
        </div>

        <div class="form-group">
            <form:label path="price">Price</form:label>
            <form:input class="form-control" path="price" required="true"/>
        </div>

        <div class="form-group">
            <form:label path="amount">Amount</form:label>
            <form:input class="form-control" path="amount" required="true"/>
        </div>
        <form:button class="btn btn-primary" type="submit" value="Submit">Submit</form:button>
    </form:form>
</div>
<form action="/" >
    <input type="submit" value="Anuluj"/>
</form>
</body>

</html>