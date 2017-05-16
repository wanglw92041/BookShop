function register() {
	window.location.href = "register.jsp";
}
function isNull(str) {
	if (str == "")
		return true;
}
function mycheck() {
	if (isNull(form1.username.value)) {
		alert("用户名不能为空!!!");
		return false;
	}
	if (isNull(form1.password.value)) {
		alert("密码不能为空!!!");
		return false;
	}
}
function checkReg() {
	if (isNull(form1.username.value)) {
		alert("用户名不能为空!!!");
		return false;
	}
	if (isNull(form1.password.value)) {
		alert("密码不能为空!!!");
		return false;
	}
	if (isNull(form1.passagain.value)) {
		alert("确认密码不能为空!!!");
		return false;
	}
	if (isNull(form1.name.value)) {
		alert("姓名不能为空!!!");
		return false;
	}
	if (isNull(form1.telephone.value)) {
		alert("联系电话不能为空!!!");
		return false;
	}
	if (isNull(form1.IDnum.value)) {
		alert("身份证号不能为空!!!");
		return false;
	}
	if (form1.password.value != form1.passagain.value) {
		alert("两次输入密码不一致");
		return false;
	}
	var validateCode=document.getElementById("code").value;
	//判断验证码
	if(validateCode==""||validateCode==null){
		alert("请输入验证码!");
		document.getElementById("code").focus();
		return false;
	}
	return true;
}
function goSearch() {
	window.location.href = "searchBook.do?key="
			+ document.getElementById("sea").value;
}
function goLogin() {
	window.location.href = "login.do";
}
function Exit() {
	window.location.href = "getAllBook.do?id=0";
}
function goCheck() {
	if(form1.username.value==""){
		alert("用户名不能为空!!!");
		return;
	}
	window.location.href = "checkMember.do?username="
			+ document.getElementById("username").value;
}
/**
*更换验证码
*/

function changeCode(){
	document.getElementById("imgcode").src="ValidateCodeServlet?nocache="+new Date().getTime();
}
