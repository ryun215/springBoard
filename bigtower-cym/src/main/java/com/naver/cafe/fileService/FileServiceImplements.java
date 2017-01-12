package com.naver.cafe.fileService;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileServiceImplements implements FileService {
	Logger logger = LoggerFactory.getLogger(FileServiceImplements.class);
	@Autowired
	private FileDao fileDao;
	
	@Override
	public int fileUpload(FileUpload fileUpload) {
		logger.info("서비스에서 fileUpload메소드 실행");
		String path="";
		File destFile = null;
		String fileName = "";
		String extension = "";
		int result = 0;
		try {
		path="D:\\jjdev\\workspace-sts\\bigtower-cym\\src\\main\\resources\\upload\\";
		//저장되는 파일경로
		UUID uuid = UUID.randomUUID();
		// 랜덤한 숫자와 문자의 조합 uuid를 생성
		fileName = uuid.toString().replaceAll("-", ""); 
		//fileName을 uuid의 조합에 -을 공백으로 바꿔 저장
		MultipartFile multipartFile = fileUpload.getMultipartFile();
		// 매개변수로 받은 fileUpload에 multipartFile을 가져와 multipartFile타입의 객체에 담는다.
		int index = multipartFile.getOriginalFilename().lastIndexOf(".");
		//multipartfile타입의 객체에서 마지막 .의 index번호를 가져온다
		extension = multipartFile.getOriginalFilename().substring(index+1);
		//multipartfile타입의 마지막 index번호에서 한자리까지 더 잘라와 확장자를 찾아온다
		fileName += "."+extension;
		//fileName을 uuid에 확장자를 붙인 이름으로 정해준다.
		destFile = new File(path+fileName);
		logger.info("destFile 생성 확인 :"+destFile);
		//경로와 파일이름을 넣어 새로운 file객체를 만드록 이를 destfile변수에 담는다
		multipartFile.transferTo(destFile);
		FileDto fileDto = new FileDto();
		fileDto.setPath(path);
		fileDto.setfName(fileName);
		result = fileDao.fileUpload(fileDto)
		;
		
		} catch (IllegalStateException e) {
			destFile.delete();
			e.printStackTrace();
			logger.debug("ILLegalStateException 으로 destFile 삭제");
		} catch (IOException e) {
			destFile.delete();
			e.printStackTrace();
			logger.debug("IOException 으로 destFile 삭제");
		}
		
		return result;
	}

}
