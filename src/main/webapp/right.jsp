<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/global.sss" rel="stylesheet">
</head>
<body>
	<div>
		<div id="right">
			<h5>图书信息展示</h5>

			<table cellspacing="20" cellpadding="10">
				<tr>
					<c:forEach items="${list}" var="book" varStatus="status">
						<td>
							<dl>
								<dd>
									<img alt="图片" src="${book.image.trim()}">
								</dd>
								<dd>
									<a href="#">${book.bookName}</a>
								</dd>
							</dl>
						</td>
						<c:if test="${status.count%2==0 }">
				</tr>
				<tr>
					</c:if>
					</c:forEach>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>