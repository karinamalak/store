<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>Adding Product</title>
    <%@ include file="header.jsp" %>
</head>

<form action="/add_product">
    <input type="submit" value="Dodaj produkt"/>
</form>

<form action="/add_product">
    <input type="submit" value="Logowanie"/>
</form>

<form action="/add_product">
    <input type="submit" value="Koszyk"/>
</form>

<form action="/product" method="GET">
    <input type="submit" value="Lista produktow"/>
</form>


<%--<a href="/add_product">gggggg</a>--%>

</html>