package com.kh.inet.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) ��û�� ������ "IP �ּ�", "��Ʈ ��ȣ" Ȯ��.
		String serverIP = "192.168.10.17";
		int port = 3000;
		
		// ���Ǵ� ���(��Ĺ, ��Ʈ��) �ʱ�ȭ
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 2) ������ ���� ��û�� ������ ( ��û�ϰ��� �ϴ� ������ IP�ּҿ� ��Ʈ��ȣ�� ����Ͽ� ���� ��ü ���� )
		try {
			socket = new Socket(serverIP, port);
			
			if (socket != null) {		// �������� ���� �������� ���
				System.out.println("����(" + serverIP + ":" + port +")�� ���� ����!");
				
				// 3) ������ ����� ��ݽ�Ʈ�� ����
				// 4) ������Ʈ���� ���ؼ� ���� ����
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// ��¿� ��Ʈ��
				pw = new PrintWriter(socket.getOutputStream());
				
				// 5) ��Ʈ�� ����Ͽ� �����(������ ���)
				while(true) {
					System.out.print("������ ������ �޽��� : ");
					String sendMessage = sc.nextLine();
					
					// ��� - ���������� ������ ����
					pw.println(sendMessage);
					pw.flush();				// �Է����� ������ �����Ͱ� ���޵��� ���� �� �־� ���
					
					// �Է� - �����κ��� �����͸� ���� ����
					String message = br.readLine();
					System.out.println("�����κ��� ���޵� �޽��� : " + message);
				}
			}
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pw != null) pw.close();
				if(br != null) br.close();
			} catch(IOException e) {}
		}
	}
}
