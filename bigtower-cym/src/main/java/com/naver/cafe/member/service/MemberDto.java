package com.naver.cafe.member.service;

public class MemberDto {
	private String mId;
	private String mPw;
	private String mName;
	private String mLevel;
	
	public MemberDto() {
		super();
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmLevel() {
		return mLevel;
	}

	public void setmLevel(String mLevel) {
		this.mLevel = mLevel;
	}

	@Override
	public String toString() {
		return "MemberDTO [mId=" + mId + ", mPw=" + mPw + ", mName=" + mName + ", mLevel=" + mLevel + "]";
	}

	
}
