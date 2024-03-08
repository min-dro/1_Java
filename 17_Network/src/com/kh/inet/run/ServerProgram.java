package com.kh.inet.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	/*
	 * TCP (Transmission Control Protocol)
	 * - ����, Ŭ���̾�Ʈ ���� 1:1 ���
	 * - �����͸� ��ȯ�ϱ� �� ������ Ŭ���̾�Ʈ�� ����Ǿ�� ��
	 *   (���� ������ ������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �־�� ��)
	 * - �ŷڼ� �ִ� �����͸� ���� ����
	 * 
	 * * Socket : ��Ʈ��ũ���� ����� ����
	 * - ���μ��� ���� ����� ���
	 * - Input / OutputStream�� ������ ���� ( �� ��Ʈ���� ���� ������� �̷���� )
	 * 
	 * * ServerSocket
	 * - ��Ʈ�� ����Ǿ� �ܺ��� ���� ��û�� ��ٸ��� ���� ��û�� ������ �����ϴ� �뵵
	 * 	 => ����: ����� �� �ִ� socket ����
	 */
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		// 1) ��Ʈ ��ȣ ���� : ���������� �� �� ��Ʈ�� ��θ� ���� �� �������� �ǹ�
		int port = 3000;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		ServerSocket server = null;
		// 2) ServerSocket ��ü �����Ͽ� ��Ʈ�� ����
		try {
			// ServerSocket : Ŭ���̾�Ʈ�� ���� ��û�� ���� �뵵�� ����
			server = new ServerSocket(port);		// �̶� ������ ������!
			
			// 3) Ŭ���̾�Ʈ�κ��� ���� ��û�� ���ö����� ���
			System.out.println("Ŭ���̾�Ʈ�� ��û �����...");
			
			// 4) ���� ��û�� ������ ���� ���� �� �ش� Ŭ���̾�Ʈ�� ��� �غ�
			//		��� �غ�=> ���������� Socket ��ü ����
			Socket socket = server.accept();
			// ���κ��� ��û�� �Դ��� Ȯ��
			System.out.println(socket.getInetAddress().getHostAddress() + " �κ��� ���� ��û...");
			
			// 5) Ŭ���̾�Ʈ�� ����� ��ݽ�Ʈ�� ���� 
			// 6) ������Ʈ���� ���� ���� ����
			//  �Է¿� ��Ʈ�� ( Ŭ���̾�Ʈ�κ��� ���޵� ���� �� �پ� �о���� ���� ���� �Է¿� ��Ʈ�� )
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//	��¿� ��Ʈ�� ( Ŭ���̾�Ʈ���� ���� �� �پ� ����� �� �ִ� ��Ʈ�� )
			//	 * PrintWriter : print(), println() �޼ҵ带 ���� ������ ���
			pw = new PrintWriter(socket.getOutputStream());
			
			// 7) ��Ʈ�� ���� �а� ����
			while(true) {		// ��� �Է�/����ϱ� ���� ���ѷ��� ���.
				
				
				// Ŭ���̾�Ʈ�κ��� �Է��� �ޱ�
				String message = br.readLine();
				System.out.println("Ŭ���̾�Ʈ�κ��� �Էµ� �޽��� : " + message);
				
				// Ŭ���̾�Ʈ���� ������ ����(���)
				pw.println("���� �Ϸ�!");		// Ŭ���̾�Ʈ���� ���.
				
				
				pw.flush();					// ���� ��Ʈ���� �ִ� �����͸� ������ �������� �޼ҵ�
											// 	close() �޼ҵ尡 ȣ��Ǹ� �ڵ����� flush��.
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 8) ��� ����
			try {
				if(pw != null) pw.close();
				if(br != null) br.close();
			
				if(server != null)server.close();		// ���� �ݱ�(����)
			} catch(IOException e) {}
		}
	}
}
