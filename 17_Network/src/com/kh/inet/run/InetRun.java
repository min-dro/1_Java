package com.kh.inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
	public static void main(String[] args) {
		/*
		 * ��Ʈ��ũ (Network) : ���� ���� ��ǻ�͵��� ����Ǿ� �ִ� ��Ÿ�
		 * 					  => �� ��Ʈ��ũ�� ���� ���� �����͸� ��ȯ�� �� ����.
		 * - IP �ּ�	: ��Ʈ��ũ �� �� ��ǻ�͵��� �ĺ����ִ� ��ȣ (��ǻ���� �ֹι�ȣ)
		 * - ��Ʈ ��ȣ : �� ��ǻ�� ���� ���α׷��� �ĺ����ִ� ��ȣ
		 * 
		 * - ����			: Ŭ���̾�Ʈ(����)���� ���񽺸� �������ִ� ���α׷�
		 * 				  Ŭ���̾�Ʈ�� ��û�� ó���ؼ� ����
		 * - Ŭ���̾�Ʈ	: ������ ��û�� �ϴ� ���α׷�(��ǻ��)
		 * 				  ���񽺸� �����޴� ����
		 * 
		 * * ������ ��û�ϱ� ���ؼ� ��û�ϰ��� �ϴ� ������ "IP �ּ�", "��Ʈ ��ȣ"�� �ʿ���.
		 */
		
		// InetAddress : ��Ʈ��ũ ����(ip�ּ� ����)�� Ȯ���� �� �ִ� Ŭ����
		try {
			InetAddress localhost = InetAddress.getLocalHost();		// getLocalHost() : �� PC�� ���� ������ ��ȯ
			
			System.out.println(localhost);		// "Pc ���� / IP �ּ�"
			
			System.out.println("�� PC ���� : " + localhost.getHostName());		// ȣ��Ʈ�� �̿� ��ȯ
			System.out.println("�� IP �ּ� : " + localhost.getHostAddress());		// ȣ��Ʈ�� IP �ּ� ��ȯ
			
			System.out.println("===================================");
			
			// �������� ���ؼ� ���� ������ Ȯ��
			InetAddress googleHost = InetAddress.getByName("www.google.com");	// getByName(�����θ�) : �������� ���� �ش� ȣ��Ʈ
			
			System.out.println("���� ������ : " + googleHost.getHostName());
			System.out.println("���� IP �ּ� : " + googleHost.getHostAddress());
			
			// �������� ���ؼ� ���� ���õ� ������ �迭�� �޾� Ȯ��
			//	* �޼ҵ� ȣ�� �� ����� ���� ������ ������Ÿ����,
			//		�޼ҵ��� ��ȯŸ������ ���
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("������ ȣ��Ʈ ���� : " + naverHost.length);
			for(InetAddress n : naverHost) {	// for(�迭��_���_������_Ÿ�� ������ : �迭_������) {}
				System.out.println("���̹� ȣ��Ʈ");
				System.out.println("���̹� IP�ּ�");	
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
