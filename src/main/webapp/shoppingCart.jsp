<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
<link href="css/global.css" rel="stylesheet" />
<script src="js/1.js"></script>
<style type="text/css">
th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<div id="global">
		<%@ include file="top.jsp"%>
		<div id="all">
			<%@ include file="left.jsp"%>
			<div id="right">
				<h4>购物车</h4>
				<div id="cart">
					<table id="cartCar" align="center" bgcolor="#D2B48C">
						<tr>
							<th>图书编号</th>
							<th>图书名称</th>
							<th>价格</th>
							<th>数量</th>
							<th>修改数量</th>
							<th>删除</th>
						</tr>
						<c:forEach items="${list}" var="book">
						<tr>
							<td>${book.bookID }</td>
							<td>${book.bookName}</td>
							<td>${book.price}</td>
							<td><input id="num" type="text" style="width: 40px" value="${book.typeID}"></td>
							<td><input type="button" value="修改数量" onclick="window.location.href='changeNumber.do?'"></td>
							<td><input type="button" value="删除"></td>
						</tr>
					</c:forEach>
					</table>
				</div>
				<div id="total" align="left">
					总金额:<label></label>
					<button>继续购物</button>
					<button>清空购物车</button>
					<button>结算中心</button>
				</div>
			</div>

		</div>
		<%@ include file="bottom.jsp"%>
	</div>
</body>
</html>