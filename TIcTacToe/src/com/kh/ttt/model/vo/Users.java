package com.kh.ttt.model.vo;

public class Users {
	private String userNo;
	private String userName;
	private int uvuScore = 0;
	private int uvcScore = 0;
	private int nvnScore = 0;
	public Users() {}
	public Users(String userName) {
		this.userName = userName;
	}
	public Users(String userNo, String userName, int uvuScore, int uvcScore, int nvnScore) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.uvuScore = uvuScore;
		this.uvcScore = uvcScore;
		this.nvnScore = nvnScore;
	}
	
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUvuScore() {
		return uvuScore;
	}
	public void setUvuScore(int uvuScore) {
		this.uvuScore = uvuScore;
	}
	public int getUvcScore() {
		return uvcScore;
	}
	public void setUvcScore(int uvcScore) {
		this.uvcScore = uvcScore;
	}
	public int getNvnScore() {
		return nvnScore;
	}
	public void setNvnScore(int nvnScore) {
		this.nvnScore = nvnScore;
	}
	@Override
	public String toString() {
		return "Users [유저 번호=" + userNo + ", 유저 닉네임=" + userName + ", 친선전 점수=" + uvuScore + ", 혼자놀기점수="
				+ uvcScore + ", 온라인매칭전 점수=" + nvnScore + "]";
	}
}	
