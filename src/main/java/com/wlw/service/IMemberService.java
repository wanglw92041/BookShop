package com.wlw.service;

import com.wlw.model.Member;

public interface IMemberService {
	public Member CheckMember(String username, String password);

	public Member checkExist(String username);

	public void insertMember(Member member);
}
