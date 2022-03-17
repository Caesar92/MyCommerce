<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Details</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<div class="container" style="margin-top: 5%">
    <div class="row" style="text-align: center">
        <c:if test="${ERROR_TYPE_ID_PRODUCT}">
            <h2>Product id must be an integer</h2>
        </c:if>

        <c:if test="${ERROR_UNKNOWN_PRODUCT}">
            <h2>Product does not exist</h2>
        </c:if>

        <c:if test="${not empty product}">
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Content</th>
                    <th>Category</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.content}</td>
                    <td>${product.category.name}</td>
                    <td>${product.price}</td>
                </tr>
            </table>
            <a class="btn btn-secondary" href="/list-product">GO BACK</a>
        </c:if>
    </div>
</div>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
