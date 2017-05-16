<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/global.css" rel="stylesheet" />
</head>
<body>
	<div id="top1">
		<span id="big">网上书店</span> <span id="small">网上书店为您提供各类图书网上服务</span>
	</div>
	<div id="menu">
		<c:if test="${sessionScope.username!=null}">
			<ul>
				<li><a href="getAllBook.do">首页</a>|</li>
				<li><a href="#">用户注册</a>|</li>
				<li><a href="getMyCart.do">购物车</a>|</li>
				<li><a href="#">结算管理</a>|</li>
				<li><a href="#">订单查询</a></li>
			</ul>
		</c:if>
		<c:if test="${sessionScope.username==null}">
			<ul>
				<li><a href="getAllBook.do">首页</a>|</li>
				<li><a href="register.jsp">用户注册</a>|</li>
				<li><a href="#">购物车</a>|</li>
				<li><a href="#">结算管理</a>|</li>
				<li><a href="#">订单查询</a></li>
			</ul>
		</c:if>
	</div>
</body>
</html>