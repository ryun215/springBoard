package com.naver.cafe.fileService;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload {
	private String fileName;
	private String fileAuth;
	private MultipartFile multipartFile;
	public FileUpload() {
		super();
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileAuth() {
		return fileAuth;
	}
	public void setFileAuth(String fileAuth) {
		this.fileAuth = fileAuth;
	}
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	@Override
	public String toString() {
		return "fileUpload [fileName=" + fileName + ", fileAuth=" + fileAuth + ", multipartFile=" + multipartFile + "]";
	}
	
	
	
}
