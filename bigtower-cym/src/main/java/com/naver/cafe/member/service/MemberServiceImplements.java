package com.naver.cafe.member.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImplements implements MemberService {
	Logger logger = Logger.getLogger(MemberServiceImplements.class.getName());
	@Autowired
	private MemberDao memberDao;
	
	public int memberInsert(MemberDto member) {
		logger.info("memberService의 memberInsert요청");
		logger.info("member id 확인 :"+member.getmId());
		logger.info("member pw 확인 :"+member.getmPw());
		logger.info("member name 확인 :"+member.getmName());
		logger.info("member level 확인 :"+member.getmLevel());
		member.toString();
		return memberDao.MemberInsert(member);
	}

}
