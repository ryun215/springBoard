package com.naver.cafe.fileService;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileDaoimplements implements FileDao {
	Logger logger = LoggerFactory.getLogger(FileDaoimplements.class);
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	final String NAMESPACE = "file.mapper.";
	@Override
	public int fileUpload(FileDto fileDto) {
		logger.debug("fileDto객체 확인 : "+fileDto.toString());
		return sqlSessionTemplate.insert(NAMESPACE+"fileUpload", fileDto);
	}
}
