package com.wlw.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wlw.dao.MemberDAO;
import com.wlw.model.Member;
import com.wlw.service.IMemberService;

@Service
public class MemberService implements IMemberService {
	@Resource
	private MemberDAO memberDAO;

	public Member CheckMember(String username, String password) {
		// TODO Auto-generated method stub
		Member member = memberDAO.CheckMember(username, password);
		return member;
	}

	public Member checkExist(String username) {
		// TODO Auto-generated method stub
		Member member = memberDAO.checkExist(username);
		return member;
	}

	public void insertMember(Member member) {
		// TODO Auto-generated method stub
		memberDAO.insertMember(member);
	}

}
