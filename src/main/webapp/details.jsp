<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/1.css" rel="stylesheet" />
<script src="js/1.js"></script>
</head>
<body>
	<div id="global">
		<%@ include file="top.jsp"%>
		<div id="all">
			<%@ include file="left.jsp"%>
			<div id="right">
			<div id="detail">
				<table cellspacing="10">
					<tr>
						<td colspan="2">${book.bookName}</td>
					</tr>
					<tr>
						<td><img alt="图片" src="${book.image.trim()}"></td>
						<td>作者:${book.author }</td>
					</tr>
					<tr>
						<td colspan="2"><input type="image" src="image/buy.gif" /></td>
					</tr>
				</table>
				</div>
			</div>
		</div>
		<%@ include file="bottom.jsp"%>
	</div>
</body>
</html>