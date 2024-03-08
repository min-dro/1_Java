package com.kh.network;

public class NetworkPractice {
	/*
	 * ��Ʈ��ũ
	 * : ��ǻ�� ���� �����͸� ����� �� �ֵ��� ������ ��
	 * 
	 * * IP �ּ�		: ��ǻ�͸� �ĺ��ϴ� ��ȣ ��ǻ���� �ֹι�ȣ)
	 * * ��Ʈ ��ȣ		: ��ǻ�� ���� ���α׷��� �ĺ��ϴ� ��ȣ
	 * 
	 * * ����			: Ŭ���̾�Ʈ�κ��� ���� ��û�� ���� ������ �ϴ� ����
	 * 				  ���񽺸� �����ϴ� ���α׷�
	 * 
	 * * ����		: ������ Ŭ���̾�Ʈ�� ����� �ϱ� ���� ���
	 * * ���� ��� *
	 * 		- TCP : ������, �����, ����������, �ӵ� ����
	 * 				http, �̸���, ftp (����)
	 * 		- UDP : �ŷڼ� ������ ����, �ܹ���, �񿬰�������, �ӵ� ����
	 * 				�ǽð� ������ ����(��Ʈ�̹�)
	 * 
	 * * ������ ���α׷�
	 * 		1) ��Ʈ��ȣ ����
	 * 		2) ServerSocket ��ü ���� (��Ʈ ��ȣ ���)
	 * 			: Ŭ���̾�Ʈ ���� ��û�� ����ϴ� ����
	 * 			ex) ServerSocker server = new ServerSocket(3000);
	 * 		3) ���� ��û�� �����ϰ� Socket ��ü ����
	 * 			ex) Socket socket = server.accept();
	 * 		4) ����� ��Ʈ�� ����Ͽ� ������ ��� ..
	 * 			ex) �Է� ��Ʈ�� : socket.getInputStream() �޼ҵ带 �Է¿� ��Ʈ�� �����ڿ� ����(�Ҵ�)
	 * 			ex) ��� ��Ʈ�� : socket.getOutputStream() �޼ҵ带 ��¿� ��Ʈ�� �����ڿ� ����(�Ҵ�)
	 * 		5) ��Ʈ�� �޼ҵ� ����Ͽ� ... ������ ��� ���� ...
	 * 		6) �ڿ� ��� �Ŀ��� �ڿ� �ݳ�(close()) **
	 * 			-> ���� �ϴ� ��� : try ~ with ~ resource ���� ����ϸ� �ڵ����� �ݳ�����!
	 * 			ex) try (ServerSocket server = new ServerSocket(3000);
	 * 						Socket socket = server.accept();
	 * 							BufferedReader br = new BufferedReader(.....)) { } catch(...) { }
	 * * Ŭ���̾�Ʈ�� ���α׷�
	 * 		1) ������ "IP�ּ�"�� "��Ʈ��ȣ" Ȯ��!!
	 * 		2) �ش� ������ ������ Socket socket = new Socket(serverIP, port);
	 * 										// serverIP = InetAddress.getLocalhost().getHostAddress
	 */
}
