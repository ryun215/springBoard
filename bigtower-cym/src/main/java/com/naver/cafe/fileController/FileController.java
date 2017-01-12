package com.naver.cafe.fileController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naver.cafe.fileService.FileService;
import com.naver.cafe.fileService.FileUpload;

@Controller
public class FileController {
	Logger logger = LoggerFactory.getLogger(FileController.class);
	//파일 업로드 요청시 폼으로
	@Autowired
	private FileService fileService;
	@RequestMapping(value="/fileUpload" , method=RequestMethod.GET)
	public String fileUpload(){
		return "/file/fileUploadForm";
	}
	//폼에서 업로드할 파일 선택 후 입력
	@RequestMapping(value="/fileUpload", method=RequestMethod.POST)
	public String fileUpload(FileUpload fileUpload){
			logger.info("file안에 변수 확인 :"+fileUpload.toString());
			fileService.fileUpload(fileUpload);
		return "redirect:";
		
	}
}
