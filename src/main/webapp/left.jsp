<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/global.css" rel="stylesheet" />
<script type="text/javascript" src="js/1.js"></script>
</head>
<body>
	<div id="left">
		<div id="top">
			<c:if test="${username!=null}">
				用户${username }登陆成功!
				<input id="exit"
						type="button" value="注销" onclick="Exit()"  /> 
			</c:if>
			<c:if test="${username==null }">
				<form id="form1" method="post" action="login.do"
					onSubmit="return mycheck()">
					用户名:&nbsp;<input name="username" style="width: 110px" type="text" /><br />
					密&nbsp;&nbsp;&nbsp;码:&nbsp;<input name="password"
						style="width: 110px" type="password" /><br /> <input
						type="submit" value="登录" style="margin-left: 40px" /> <input
						type="button" value="注册" style="margin-left: 20px"
						onclick="register()" />
				</form>
			</c:if>

		</div>
		<div id="medium">
			<h5>图书查找：</h5>
			<input id="sea" type="text" style="width: 166px" /> <input id="btn"
				type="image" src="image/search.gif" onclick="goSearch()" />
		</div>
		<div id="bottom">
			<h4>友情链接</h4>
			<ul>
				<li><a href="http://www.golden-book.com">旌旗网上书店</a></li>
				<li><a href="http://www.golden-book.com">中国科技金书网</a></li>
				<li><a href="https://www.amazon.cn">卓越亚马逊网络书店</a></li>
				<li><a href="http://www.dangdang.com">当当网中文网上商城</a></li>
			</ul>
		</div>
	</div>
</body>
</html>