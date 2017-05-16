package com.wlw.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wlw.model.Member;
@Repository
public interface MemberDAO {
	@Select("SELECT * from member where memberName=#{0} and password=#{1}")
	public Member CheckMember(String username, String password);

	@Select("SELECT * from member where memberName=#{0}")
	public Member checkExist(String username);

	@Insert("insert into member values(#{memberName},#{password},#{name},#{sex},#{birthDate},#{address},#{telephone},#{mobilephone},#{postalcode},#{IDnum})")
	public void insertMember(Member member);
}
