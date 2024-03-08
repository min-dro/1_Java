package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	public void mainMenu() {
		System.out.println("******* ���� �޴� *******");
		System.out.println("1. ������ ��ġ�� �� �߰�");
		System.out.println("2. ù ��ġ�� �� �߰�");
		System.out.println("3. ��ü �� ��� ���");
		System.out.println("4. Ư�� �� �˻�");
		System.out.println("5. Ư�� �� ����");
		System.out.println("6. Ư�� �� ���� ����");
		System.out.println("7. ��� �������� ����");
		System.out.println("8. ������ �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� : ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			addList();
			break;
		case 2:
			addAtZero();
			break;
		case 3:
			printAll();
			break;
		case 4:
			searchMusic();
			break;
		case 5:
			removeMusic();
			break;
		case 6:
			setMusic();
			break;
		case 7:
			ascTitle();
			break;
		case 8:
			descSinger();
			break;
		case 9:
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��Ͽ� �ּ���.");
		}
	}
	public void addList() {
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		
		if (mc.addList(null) == 1) {
			
		}
		
		
	}
	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();
		mc.addAtZero(null);
	}
	public void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		mc.printAll();
	}
	public void searchMusic() {
		System.out.println("****** Ư�� �� �˻� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		mc.searchMusic(title);
	}
	public void removeMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		String title = sc.nextLine();
		mc.removeMusic(title);
	}
	public void setMusic() {
		System.out.println("****** Ư�� �� ���� ���� ******");
		String title = sc.nextLine();
		mc.setMusic(title, null);
	}
	public void ascTitle() {
		System.out.println("****** �� �� �������� ���� ******");
	}
	public void descSinger() {
		System.out.println("****** ���� �� �������� ���� ******");
	}
}
