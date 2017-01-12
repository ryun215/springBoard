package com.naver.cafe.memberController;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.cafe.member.service.MemberDto;
import com.naver.cafe.member.service.MemberService;
@Controller
public class MemberController {
	Logger logger = Logger.getLogger(MemberController.class.getName());
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String memberInsert(){
		logger.info("get요청으로 insert폼 요청");
		return "/member/memberInsertForm";
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String memberInsert(MemberDto member){
		logger.info("post요청으로 회원가입요청");
		logger.info("member id 확인 :"+member.getmId());
		logger.info("member pw 확인 :"+member.getmPw());
		logger.info("member name 확인 :"+member.getmName());
		logger.info("member level 확인 :"+member.getmLevel());
		member.toString();
		int result = memberService.memberInsert(member);
		return "";
		
	}
}
