<%@include file="CommonHeader.jsp"%>
<br/><br/><br/><br/><br/>
<body>
<form action="<c:url value='/insertCategory'/>" method="post">
<table align="center" class="table table-condensed">
	<tr>
		<td colspan="2"><center>Product</center></td>
	</tr>
	<tr>
		<td>Product ID</td>
		<td><input type="text" name="proId"></td>
	</tr>
	<tr>
		<td>Product Name</td>
		<td><input type="text" name="proName"></td>
	</tr>
	<tr>
		<td>Product Description</td>
		<td><textarea rows="5" cols="30" name="proDesc"></textarea></td>
	</tr>
	<tr>
		<td colspan="2">
		<center>
			<input type="submit" value="Insert Product" class="btn btn-success">
		</center>
		</td>
	</tr>
</table>
</form>

<table align="center" cellspacing="3" cellpadding="3" class="table table-condensed">
	<tr bgcolor="PowderBlue">
		<td>Product Id</td>
		<td>Product Name</td>
		<td>Product Description</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${productList}" var="product">
		<tr bgcolor="PaleVioletRed">
			<td>${product.productId}</td>
			<td>${product.productName}</td>
			<td>${product.productDesc}</td>
			<td>
				<a href="<c:url value='/deleteProduct/${product.productId}'></c:url>">Delete</a>
				&nbsp;&nbsp;|&nbsp;&nbsp;
				<a href="<c:url value='/editProduct/${product.productId}'></c:url>">Edit</a>
	</c:forEach>
</table>
</body>
</html>