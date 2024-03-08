package com.kh.model.vo;

public class User {
	private String nickName;		// 닉네임
	private int score;				// 점수
	
	public User(String nickname) {
		this.nickName = nickname;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", nickName, score);
	}
}
