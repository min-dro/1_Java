package com.kh.io.practice.log;

public class LogTest {
	public static void main(String[] args) {
		FileDAO log = new FileDAO();
		// ���� ����
//		log.acess("log.txt" , 1);
		
		// ���� ó��
		int[] arr = new int[3];
		
		for(int i=0; i<4; i++) {
			arr[i] = i;
		}
//	} catch(ArrayIndexOutOfBoundsException e) {
//		System.out.print("");log.write();("[Exception]" + e.getMessage() + "\n"));	// getMessage() ���� ���� �޽���
		
		
//	}finally {
		System.out.println("try ~catch ����");
//		log.close(1);		// (*) close�� ���� ������ ���� ���� ó���� �Ϸ���� ����.
	}
}
