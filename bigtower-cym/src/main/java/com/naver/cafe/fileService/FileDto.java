package com.naver.cafe.fileService;

public class FileDto {
	private int fNo;
	private String fName;
	private String fPath;
	private int bNo;
	
	public FileDto() {
		super();
	}

	public int getfNo() {
		return fNo;
	}

	public void setfNo(int fNo) {
		this.fNo = fNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfPath() {
		return fPath;
	}

	public void setPath(String fPath) {
		this.fPath = fPath;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	@Override
	public String toString() {
		return "fileDto [fNo=" + fNo + ", fName=" + fName + ", path=" + fPath + ", bNo=" + bNo + "]";
	}
	
}
