<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link href="css/global.css" rel="stylesheet" />
<script src="js/1.js"></script>
</head>
<body>
	<div id="global">
		<%@ include file="top.jsp"%>
		<div id="all">
			<%@ include file="left.jsp"%>
			<div id="right">
				<h5>图书信息展示</h5>
				<table id="c">
					<tr>
						<c:forEach items="${list}" var="book" varStatus="status">
							<td>
								<dl>
									<dd>
										<img alt="图片" src="${book.image.trim()}">
									</dd>
									<dd>
										<a href="getDetails.do?bookID=${book.bookID }">${book.bookName}</a>
									</dd>
								</dl>
							</td>
							<c:if test="${status.count%4==0 }">
					</tr>
					<tr>
						</c:if>
						</c:forEach>
					</tr>
				</table>
			</div>
		</div>
		<%@ include file="bottom.jsp"%>
	</div>
	</div>
</body>
</html>