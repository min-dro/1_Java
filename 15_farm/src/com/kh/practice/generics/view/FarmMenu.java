package com.kh.practice.generics.view;

import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	public void mainMenu() {
		System.out.println("========== KH ��Ʈ ==========");
		
		while (true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �����޴�");
			System.out.println("2. �մ� �޴�");
			System.out.println("9. ����");
			
			System.out.print("�޴� ��ȣ ���� : ");
			int selMenu = sc.nextInt();
			
			switch (selMenu) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	public void adminMenu() {
		while (true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �� ��깰 �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ��깰 ���");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� : ");
			
			int selMenu = sc.nextInt();
			switch (selMenu) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	public void customerMenu() {
		while (true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ��깰 ���");
			System.out.println("2. ��깰 ����");
			System.out.println("3. ������ ��깰 ����");
			System.out.println("9. �������� ���ư���");
			System.out.print("�޴� ��ȣ ���� : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	public void addNewKind() {
		while (true) {
			System.out.print("1. ���� / 2.ä�� /3.�߰� : ");
			System.out.print("�߰��� ���� ��ȣ : ");
			int num = sc.nextInt();
			System.out.print("�̸� : ");
			Farm f = sc.next();
			System.out.print("���� : ");
			int amount = sc.nextInt();
			switch (num) {
			case 1:
				if(fc.addNewKind(f, amount)) {
					System.out.println("�� ��깰�� �߰��Ǿ����ϴ�");
				} else {
					System.out.println("�� ��깰�� �߰��� ���еǾ����ϴ�. �ٽ� �Է����ּ���.");
				}
				return;
			case 2:
				if(fc.addNewKind(f, amount)) {
					System.out.println("�� ��깰�� �߰��Ǿ����ϴ�");
				} else {
					System.out.println("�� ��깰�� �߰��� ���еǾ����ϴ�. �ٽ� �Է����ּ���.");
				}
				return;
			case 3:
				if(fc.addNewKind(f, amount)) {
					System.out.println("�� ��깰�� �߰��Ǿ����ϴ�");
				} else {
					System.out.println("�� ��깰�� �߰��� ���еǾ����ϴ�. �ٽ� �Է����ּ���.");
				}
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	public void removeKind() {
		while (true) {
			System.out.print("1. ���� / 2.ä�� /3.�߰� : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	public void changeAmount() {
		while (true) {
			System.out.println("1. ���� / 2.ä�� /3.�߰� : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	public void printFarm() {

	}

	public void buyFarm() {
		while (true) {
			System.out.print("1. ���� / 2.ä�� /3.�߰� : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	public void removeFarm() {
		while (true) {
			System.out.print("1. ���� / 2.ä�� /3.�߰� : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			}
		}
	}

	public void printBuyFarm() {

	}

}
