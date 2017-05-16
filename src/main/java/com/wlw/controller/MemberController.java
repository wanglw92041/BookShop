package com.wlw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wlw.model.Member;
import com.wlw.service.impl.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@RequestMapping("/login")
	public String login(HttpServletRequest request, Model model, HttpSession session) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Member member = memberService.CheckMember(username, password);
		if (member != null) {
			session.setAttribute("username", username);
		}
		return "getAllBook.do";
	}

	@RequestMapping("/checkMember")
	public String checkMember(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {
		String username = request.getParameter("username");
		Member member = memberService.checkExist(username);
		PrintWriter out = response.getWriter();
		if (member == null) {
			out.print("<script language='javascript'>alert('该用户名可以注册！');window.location='register.jsp?user=" + username
					+ "';</script>");
		} else {
			out.print("<script language='javascript'>alert('该用户名已被注册！');window.location='register.jsp';</script>");
		}
		return null;
	}

	@RequestMapping("/register")
	public String register(Member member, HttpSession session, HttpServletRequest request, HttpServletResponse response,
			Model model) throws IOException, ParseException {
		Member member1 = memberService.checkExist(member.getMemberName());
		PrintWriter out = response.getWriter();
		String code = request.getParameter("code");
		String code2 = (String) session.getAttribute("Code");
		System.out.println(code);
		System.out.println(code2);
		if (!code.equals(code2)) {
			out.print(
					"<script language='javascript'>alert('验证码输入错误！');window.location=window.history.back(-1);</script>");
			return null;
		}
		if (member1 != null) {
			out.print("<script language='javascript'>alert('该用户名已被注册！');window.location='register.jsp';</script>");
			return null;
		}
		String dateStr = request.getParameter("year") + "-" + request.getParameter("month") + "-"
				+ request.getParameter("day");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = sdf.parse(dateStr);
		Date date2 = new Date(date.getTime());
		member.setBirthDate(date2);
		memberService.insertMember(member);
		out.print("<script language='javascript'>alert('您已成功注册！');window.location='getAllBook.do';</script>");
		return null;
	}
}
