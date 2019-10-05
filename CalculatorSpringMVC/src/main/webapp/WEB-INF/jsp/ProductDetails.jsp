<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Save Product</title>
    <style type="text/css">@import url(/css/main.css);</style>
</head>
<body>
<div id="global">
    <h3>${greet}</h3>
    <h4>The product has been saved.</h4>

    <h5>Details:</h5>
    Product Name: ${product.name}<br/>
    Category: ${product.category.name}<br/>
    Description: ${product.description}<br/>
    Price: $${product.price}

    <form:form action="list" method="get">
        <input type="submit" id="submit" value="List products"/>
    </form:form>

</div>
</body>
</html>