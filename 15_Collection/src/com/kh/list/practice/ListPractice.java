package com.kh.list.practice;

import java.util.ArrayList; // import : �ٸ� ��ο� �ִ� Ŭ���� ��� �� ��ġ�� �˷��ش�.
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	/*
	 * List Ư¡
	 * : ������ �ְ�, �ߺ��� ���Ǵ� �ݷ���
	 * 
	 * * ArrayList
	 * 	 - �迭 ����
	 * 	 - ������ ��ȸ�� ������.
	 * 	 - ������ �߰�/���� �� �����Ͽ� ���� �ɸ���.
	 * 
	 * 	 - ǥ����: List<E> ���������� = new ArrayList<[E]>();
	 * 			 ArrayList<E> ���������� = new ArrayList<[E]>();
	 * 
	 * * LinkedList
	 * 	 - ����Ʈ ����
	 * 	 - ������ �߰�/������ ������.
	 * 	 - ������ ��ȸ�� ������.
	 * 
	 * 	 - ǥ����:  List<E> ���������� = new LinkedList<[E]>();		// [E] : E Ÿ�� ���� ����.
	 * 			  LinkedList<E> ���������� = new LinkedList<[E]>();
	 * 
	 * * List ���� �޼ҵ� => ArrayList, LinkedList Ŭ�������� ���ǵǾ� ����
	 * 	 - ������ �߰� : add(������) 	// E Ÿ���� ������ �߰�
	 *   - ������ ���� : remove(�ε���)	// �ε����� ��ġ�� ������ ����
	 *   - ������ ��ȸ : get(�ε���)		// �ε����� ��ġ�� ������ ��ȸ
	 *   - ����� ������ ���� : size()
	 */
	public static void main(String[] args) {	//PSVM
		// ť(Queue) : ó�� ����� �����Ͱ� ���� ó������ ������ �� �ִ� ���� (FIFO: First In first Out)
		MyQueue mQueue = new MyQueue();
		
		mQueue.enQueue("������ �ܰ���");
		mQueue.enQueue("��Ʈ ����");
		mQueue.enQueue("�Ƹ�� ����");
	}
	public static void stackTest(){
		// ����(Stack) : ���� �������� ����� �����Ͱ� ���� ó������ ������ �� �ִ� ���� (LIFO: Last In First Out)
		// ������ �߰� : ������� �߰�
		// ������ ���� : ������ ��ġ���� ����
		
		MyStack mStack = new MyStack(); 
		
		//
		mStack.push("Ŀ��");
		mStack.push("�������ֽ�");
		mStack.push("��ȭ��");
		
		System.out.println(mStack.pop());
		System.out.println(mStack.pop());
		System.out.println(mStack.pop());
		
	}
	public static void linkedListTest() {
		// [2] LinkedList<E>
		LinkedList<Integer> list = new LinkedList<>();
		
		// ����ڿ��� ������ ������ ���̸� �Է¹޾�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ ���̸� �Է��ϼ��� : ");
		int num = sc.nextInt();
		// �� ���̸�ŭ ���� ���� ����
		for(int i=0; i < num; i++) {
			
			//(int)(Math.random() * num + 1)	// ���� ������: ���� ����� 1��, (type) => ���⿬���� (�켱 ������ �� ������)
												// Math.random() => 0 <= n < 1 (0.000000xxx1 ~ 0.999999xx)
			int random = (int)(Math.random() * num + 1);
			list.add(random);			// random ������ ������Ÿ�� �ڵ� ��ȯ -> Integer
		}
		// ����� �����͸� ���
		printItem(list);
	}
	
	public static void arrayListTest() {
		// [1] ArrayList<E>
		ArrayList<String> arr = new ArrayList<>();
		
		//	������ �߰�: add
		arr.add("�ѽ�(����â��)");
		arr.add("������");
		arr.add("¥���");
		
		//	������ ��ȸ: get
//		for(int i=0; i < arr.size(); i++) {		// ����� ������ ����: size
//			System.out.println(arr.get(i));		//	������ ��ȸ: get
//		}
		printItem(arr);
		
		//	������ ����: remove
		arr.remove(1);	// �ι�° ��ġ�� ������("������") ����
		
//		System.out.println("-".repeat(10));		// ���ڿ�.repeat(count) : �ش� ���ڿ��� �ݺ��Ͽ� ���ڿ� ��ȯ
		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		printItem(arr);
		
		//	������ �߰� (���ϴ� ��ġ��) : add(int index, E element)
		arr.add(1, "������");		  // �ι��� ��ġ�� ������ �߰�
		
//		System.out.println("-".repeat(10));
		
//		for(int i=0; i<arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		printItem(arr);
		
		//	������ ���� (������ ��ġ��) : set(int index, E element)
		arr.set(1, "�ø�");
		
//		System.out.println("-".repeat(10));
		printItem(arr);
	}
	
	// printItem �޼ҵ� : �ߺ� �����ϱ� ���� ����. ����Ʈ �� ������ ���
	public static <E> void printItem(List<E> list) {	// ���׸� �޼ҵ� ����
			// �������̽��� ������ Ŭ������ �ν��Ͻ��� �Ű������� ���� ����!
			// List<E> list = new ArratList<>();
			// List<E> list = new LinkedList<>();
		for(int i=0; i<list.size(); i++) {
			System.out.println(i +"����: " + list.get(i));
		}
		System.out.println("-".repeat(10));
	}
}
