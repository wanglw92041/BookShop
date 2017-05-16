<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<link href="css/reg.css" rel="stylesheet" />
<script src="js/1.js"></script>
<script type="text/javascript" src="js/year_month_day.js"></script>
</head>
<body>
	<div id="global">
		<form id="form1" method="post" action="register.do"
			onSubmit="return checkReg()">
			<h3>用户注册</h3>
			<table>
				<tr>
					<td>用户名:</td>
					<td><input id="username" name="memberName" type="text"
						value="${param.user }"><span>*</span></td>
					<td><input id="check" type="button" value="检测用户名"
						onclick="goCheck()" /></td>
				</tr>
				<tr>
					<td>密码:</td>
					<td><input id="wid" name="password" type="password" /><span>*</span></td>
				</tr>
				<tr>
					<td>确认密码:</td>
					<td><input id="wid" name="passagain" type="password" /><span>*</span></td>
				</tr>
				<tr>
					<td>姓名:</td>
					<td><input id="wid" name="name" type="text" /><span>*</span></td>
				</tr>
				<tr>
					<td>性别:</td>
					<td align="left"><select id="wid" name="sex"><option>男</option>
							<option>女</option></select></td>
				</tr>
				<tr>
					<td>出生日期:</td>
					<td align="left"><select id="selYear" name="year"></select> <select
						id="selMonth" name="month"></select> <select id="selDay"
						name="day"></select>
				</tr>
				<tr>
					<td>联系地址:</td>
					<td align="left"><input id="wid" name="address" type="text" /></td>
				</tr>
				<tr>
					<td>邮政编码:</td>
					<td align="left"><input id="wid" type="text" name="postalcode" /></td>
				</tr>
				<tr>
					<td>联系电话:</td>
					<td><input id="wid" type="text" name="telephone" /><span>*</span></td>
				</tr>
				<tr>
					<td>手机:</td>
					<td align="left"><input id="wid" name="mobilephone"
						type="text" /></td>
				</tr>
				<tr>
					<td>身份证号:</td>
					<td><input id="wid" name="IDnum" type="text" /><span>*</span></td>
				</tr>
				<tr>
					<td>验证码:</td>
					<td align="left"><img title="看不清，点击更换验证码" style="cursor: pointer"
						id="imgcode" alt="" src="ValidateCodeServlet"
						onclick="changeCode()"></td>
				</tr>
				<tr class="ct12">
				<td>输入验证码:</td>
				<td align="left"><input id="code" type="text" name="code"/></td>
			</tr>
				<tr height="50px">
					<td align="center" colspan="2"><input type="submit" value="注册" />
						<input type="reset" value="重置" /> <span
						style="font-size: 15px; position: relative; top: -2px;">带*的为必填项</span></td>
				</tr>
			</table>
		</form>
	</div>
	<script type="text/javascript">
		calendar()
	</script>
</body>
</html>