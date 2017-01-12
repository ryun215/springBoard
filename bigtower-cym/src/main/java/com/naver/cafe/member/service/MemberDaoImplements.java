package com.naver.cafe.member.service;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImplements implements MemberDao{
	Logger logger = Logger.getLogger(MemberDaoImplements.class.getName());
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	final String NAMESPACE = "member.mapper.";
	
	public int MemberInsert(MemberDto member) {
		logger.info("MemberDao 객체에서 insert쿼리 호출");
		logger.info("member id 확인 :"+member.getmId());
		logger.info("member pw 확인 :"+member.getmPw());
		logger.info("member name 확인 :"+member.getmName());
		logger.info("member level 확인 :"+member.getmLevel());
		member.toString();
		return sqlSessionTemplate.insert(NAMESPACE+"memberInsert", member);
		
	}

	
	
}
