package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;
public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		// FileDAO Ÿ���� fd ���������� ����ؼ� checkName()
		/****
		 boolean result = fd.checkName(file);
		 // ...
		 return result;
		 *****/
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());	// StringBuilder Ŭ������ toString() �������̵�
											//	* �� ��ü�� ���ڿ��� ��ȯ
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		fd.fileEdit(file, sb.toString());
	}
	
}
