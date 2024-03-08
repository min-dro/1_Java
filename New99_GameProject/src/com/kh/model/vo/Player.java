package com.kh.model.vo;

public class Player {
	private String player;
	private int score;
	public Player() {}
	public Player(String player, int score) {
		this.player = player;
		this.score = score;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String toString() {
		return String.format("����� %s�� ������ %d�� �Դϴ�.", player, score);
	}
}
