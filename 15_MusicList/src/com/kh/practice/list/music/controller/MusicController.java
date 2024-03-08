package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List list = new ArrayList();
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	public int addAtZero(Music music) {
		if(list.get(0) == null) {
			
			list.add(0, music);
			return 1;
		} else {
			return 0;
		}
	}
	public List printAll() {
		return list;	
	}
	public Music searchMusic(String title) {
		return null;
		
	}
	public Music removeMusic(String title) {
		return null;
	}
	public Music setMusic(String title, String music) {
		return null;
	}
	public int ascTitle() {
		return 0;
	}
	public int descSinger() {
		return 0;
		
	}
	
}
