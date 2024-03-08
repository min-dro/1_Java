package com.kh.collection;

import java.util.ArrayList;
import java.util.List;

class Food {
	static String name;
	static int kcal;
	// ���� : ������ Ÿ�� -> Set (��� ���), Map<���, �뷮> (�� �� �ڼ���.. �����Ѵٸ�..)
	
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
}

class Pizza extends Food {

	public Pizza() {
		super(name, kcal);
		// TODO Auto-generated constructor stub
	}
	
}
public class CollectionPractice {
	/*
	 * �÷��� (Collection) : �ڹٿ��� �������ִ� �ڷᱸ�� ���� ���̺귯��(�⺻ Ŭ����)
	 * 	- ���� ���� �ڷᱸ�� ���� �������̽��� ���ǵǾ� �ְ�, �� �������̽��� ������ Ŭ�������� �ִ�.
	 * 
	 *  - Collection �������̽�	: �����͸� �𿩼� ����
	 *  
 	 *		* List �������̽�	: ���� o, �ߺ� ��� o �ּҷ�, to-do ����Ʈ)
 	 *			(* <E> : ���׸� -> �ϳ��� Ÿ���� �ƴ� ���� Ÿ���� ����� �� �ֵ��� ������ ��)
 	 *			* ArrayList<E>	: ������ �߰�/���� �� �ӵ��� ����(����Ʈ ���, ���� ������ ������ ó�� ����)
 	 *
 	 *			+ LinkedList<E> : ������ �߰�/���� �� �ӵ��� ����(����Ʈ ���, ���� ������ ������ ó�� ����)
 	 *
 	 *
 	 *		* Set �������̽�	: ���� x, Ű-������ �� ���� �����͸� �𿩼� ����
 	 *	- Map �������̽�			: Ű-������ �� ���� �����͸� ��Ƽ� ����
 	 *		* ���� x, Ű�� �ߺ� ��� x, ���� �ߺ� ��� o
 	 *		* HashMap<K, V> : Ű ���� �������� �ؽ� �˰������� �����Ͽ� �ߺ��� üũ
 	 *						  Ű ����� ��ȸ�ϸ� "Set" �����̴�. ( keySet() �޼ҵ�� ��ȸ ����. )
 	 *
 	 *	* �޼ҵ� ����
 	 *					List				Set					Map
 	 *	������ �߰�		add(������)			add(������)			put(Ű_������, ��_������)
 	 *
 	 *	������ ����		remove(�ε���)		remove(������)		remove(Ű_������)
 	 *					remove(������)
 	 *
 	 *	������ ��ȸ		get(�ε���)			* Iterator ��ü
 	 *										1) Iterator ��ü ����
 	 *											Iterator iter = Set��ü_����������.iterator();
 	 *										2) ���� ������ ���� ��/�� �Ǵ�
 	 *											iter.hasNext() �޼ҵ� ȣ���Ͽ� Ȯ�� => ���ǽ�
 	 *										3) �ش� �����͸� �������� �޼ҵ� : next()
 	 *											E data = iter.next() // ������ Ÿ���� Set<E> ���� �� ���� E Ÿ��
 	 *
 	 *										 * for-each ��
 	 *									for(E data : set��ü_����������) { }
 	 *
 	 *		������ ����						size()
	 */
	public static void main(String[] args) {
		// ArrayList ��..
		// ArrayList �÷������� ���� ���� Food�� �����ϱ� ���� ��ü ����
		List<Food> fList = new ArrayList<>();
		
		// Food ��ü�� ����Ʈ�� �߰�.
		// �� �Ѱ��� , 300..?
		// �ܹ���, 414...
		Food f1 = new Food("�� �Ѱ���", 300);
		fList.add(f1);
		
		// add(E e)
		// => add(Food e)	=> �Ű������� ��üŸ��(Food)
		
		// fList.add("����");	// ���� ������ Ÿ�Կ� �ش��ϴ� �ν��Ͻ��� �����ؾ� ��
		
		fList.add(new Food("�ܹ���", 414));
		// ������
		// 	Food e = new pizza();
		fList.add(new Pizza());
	}
}