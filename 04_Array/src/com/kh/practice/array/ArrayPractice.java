package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	/*
	 * [�迭 ����]
	 * 			 �ڷ���[] ������ = new �ڷ���[������ ����];
	 */
	public void practice1() {
		// ���̰� 10�� ������(1~10���� ���� ����) �迭�� ����
		int[] nums = new int[10];
		
		/*
		 * �ݺ����� ������� ���� ���
		 */
		nums[0] = 1; // nums �迭�� ù��° ��ġ�� 1�� ����
		nums[1] = 2; // nums �迭�� �ι�° ��ġ�� 2�� ����
		nums[2] = 3; // nums ������ ������ ��ġ�� 3�� ����
		// ......
		nums[9] = 10;// nums �迭�� ������ ��ġ(10����) 10�� ����)
		
		// �ݺ����� ����ؼ� ù������� ���������� 1���� ���ʴ�� ����
		//	�迭 ���� : [����������].length
		for(int a = 0; a < nums.length; a++) {
			nums[a] = a + 1;		// �迭�� ���� ����
		}
		
		for(int a = 0; a < nums.length; a++) {
			System.out.printf("%d ", nums[a]);
		}
	}
	
	public void practice2() {
		// ���̰� 10�� ������ �迭 ����
		int[] nums = new int[10];
		// nums.length : 10;
		nums[0] = 10;	// nums.length - index = 10 - 0 = 0
		nums[1] = 9;	// nums.length - index = 10 - 0 = 0
		nums[2] = 8;	// nums.length - index = 10 - 0 = 0
		// ....
		nums[9] = 1;
		
		for(int a = 0; a < nums.length; a++) {
			nums[a] = nums.length - a;
			System.out.printf("%d ", nums[a]);
		}
	}
			
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : "); 
		int num = sc.nextInt();
		if (num > 0) {
			int[] nums = new int[num];
			for(int i = 0; i < num; i++) {
				nums[i] = i + 1;
				System.out.printf("%d ",nums[i]);
			}
		} else {
			System.out.printf("����� �Է����ּ���");
		}
	}
	 public void practice4() {
		 String[] strs = new String[5];
		 strs[0] = "���";
		 strs[1] = "��";
		 strs[2] = "����";
		 strs[3] = "������";
		 strs[4] = "����";
		 System.out.println(strs[1]);
	 }
	 
	 /*
	  * �ǽ�����5)
	  */
	 public void practice5() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���ڿ� : "); 
			String inputStr = sc.nextLine();
			
			System.out.print("���� : "); 
			char inputCh = sc.next().charAt(0);
			
			// �Է¹��� ���ڿ��� �迭�� ���� �ϳ��ϳ� ����
			//  ���ڿ� ���� : [���ڿ� ���� �Ǵ� ��].length()
			//	�迭 ���� : [�迭 ���� �Ǵ� ��].length
			char[] arrCh = new char[inputStr.length()];
			// �Է¹��� ���ڿ��� �迭�� ���� �ϳ��ϳ� ���� => ������ �迭
			for(int i = 0; i<inputStr.length();i++) {
				arrCh[i]= inputStr.charAt(i);
			}
			
			// �迭 ������ ��� ([��1, ��2 ��3, ...] ����) : Arrays.toString([����������])
			System.out.println(Arrays.toString(arrCh));

			// �Է¹޴� ���ڰ� ���ڿ��� �� ���� �ִ��� ī��Ʈ
			System.out.printf("%s�� %c�� �����ϴ� ��ġ(�ε���) : ", inputStr, inputCh);
			int cnt = 0;
			for(int i=0; i < arrCh.length; i++) {
				if(arrCh[i] == inputCh) {
					cnt++;
					// �ε��� ��ġ�� �� �� ����
					System.out.print(i + " ");
				}
			}
			System.out.println();		// �ٹٲ�
			System.out.println(inputCh+" ���� : " + cnt );
	 }
	 
	 public void practice6() {
			Scanner sc = new Scanner(System.in);
			System.out.print("0 ~ 6 ���� ���� �Է� : "); 
			int num = sc.nextInt();
			
			String[] day = new String[7];
			day[0] = "��";
			day[1] = "ȭ";
			day[2] = "��";
			day[3] = "��";
			day[4] = "��";
			day[5] = "��";
			day[6] = "��";
			if (num >= 0 && num <= 6) {
				System.out.println(day[num]);
			} else {
				System.out.print("�߸� �Է��ϼ̽��ϴ�."); 
			}
			
	 }
	 public void practice7() {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : "); 
			int num = sc.nextInt();
			int[] add = new int[num];
			int total = 0;
			for(int i=0;i<add.length; i++) {
				System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
				int a = sc.nextInt();
				add[i] = a;
				total = total + add[i];
			}
			for(int i=0;i<add.length;i++) {
				System.out.print(add[i]+" "); 
			}
			System.out.println(); 
			System.out.print("�� �� : " + total ); 
	 }

	 /*
	  * �ǽ�����12)
	  */
	 public void practice12() {
		 // 10���� ���� ������ �� �ִ� ������ �翭 ���� �� �Ҵ�(����)
		 int[] numbers = new int[10];
		 
//		 System.out.println(numbers);	// ���������� ��� �� �ּҰ� Ȯ��
		 
		 // 1 ~ 10 ������ ����(���� ��)�� �߻����� �迭�� �ʱ�ȭ
		 // Math.random() => 0.0 ~ 0.9999 (0 <= n < 1)

		 int random = (int)(Math.random() * 10 + 1);
		 for(int i=0; i < numbers.length; i++) {
			 numbers[i] = random;
		 }
		 
		 // �迭 ������ �� �ִ밪�� �ּҰ��� ���
		 System.out.println(Arrays.toString(numbers));
		 
		 int max = 0;
		 int min = 0;
		 // �ִ밪, �ּҰ��� ���ϱ�
		 for(int i=0; i < numbers.length; i++) {
			 // �ִ밪
			 if (max < numbers[i]) {
				 max = numbers[i];
			 }
			 // �ּҰ�
			 if (min > numbers[i]) {
				 min = numbers[i];
			 }
		 }
		 System.out.println("�ִ밪 : " + max);
		 System.out.println("�ּҰ� : " + min);
		 
		 System.out.println("======================================");
		 
		 // (2) �迭�� ������������ �����Ͽ� ã��
		 //	 �迭 ��������
		 Arrays.sort(numbers);
		 System.out.println(numbers[numbers.length-1]);
	 }
	 /*
	  * �ǽ�����14) �ζ� ��ȣ �ڵ� ������ ���α׷�
	  */
	 public void practice14() {
		 // ��÷ ��ȣ: 3 20 28 38 40 43 + 4
		 //  ��÷ ��ȣ�� 
		 int[] winner = new int[] {3, 20, 28 ,38, 40, 43, 4};
		 // ���ʽ� ���� ����
		 // �ε� ��ȣ : 1 ~ 45
		 //  �ζ� ��ȣ 6�ڸ��� ������ �迭 ���� �� ����
		 int[] lotto = new int[6];
		 
		 // �ݺ��� �����鼭 ���� ���� �迭�� �ʱ�ȭ
		 //   �ٱ��� for��: �迭�� �����͸� ����
		  for (int i=0; i < lotto.length; i++) {
			  // 0 <= n < 1
			  lotto[i] = (int)(Math.random() * 45 + 1);
			  
			  // ���� for��: �ߺ����� Ȯ���ϱ� ���� ù��°��ġ���� �ٽ� �о��
			  for(int j=0; j < i; j++) {
				  if (lotto[i] == lotto[j]) {
					  // i��° �����Ϳ� j��° �����Ͱ� �����ϴ� (�ߺ������Ͱ� �ִ�.)
					  i--;
					  break;
				  }
			  }
		  }
		  
		  // �迭 �����͸� �������� ����
		  Arrays.sort(lotto);
		  
		  // �ζ� ��ȣ ���
		  int bonus = 0;
		  for(int i=0; i < lotto.length; i++) {
			  System.out.print(lotto[i] + " ");
		  }
		  
		  // ��÷ ���θ� üũ
		  int cnt=0;
		  boolean bBonus = false;
		  //	�ٱ��� for��: �������� ������ �迭�� �����͸� ��ȸ (i: lotto�� �ε���)
		  for(int i=0; i<lotto.length; i++) {
			  
			  // ���� for��: ��÷ ��ȣ�� ������ �迭�� �����͸� ��ȸ (j: winner�� �ε���)
			  for(int j=0; j<winner.length; j++) {
				  
				  if(lotto[i] == winner[j]) {
					  cnt++;
					  if (j == winner.length-1) {
						  // lotto �迭�� i��° �����Ϳ� winner �迭�� j��° �����Ͱ� �����ϰ�
						  //	j�� ���� winner �迭�� ������ ��ġ�� ��� ����
						  bBonus = true;
					  }
				  }
			  }
		  }

		  
		  
		  // ��÷ ���θ� ����� ���
		  // 	1��) 6�� ��ȣ ��ġ : "1�� ��÷�Դϴ�.", "��÷���� �ʾҽ��ϴ�."
		  // 	2��) 5����ȣ ��ġ + ���ʽ� ��ȣ ��ġ
		  //	3��) 5�� ��ȣ ��ġ
		  //	4��) 4�� ��ȣ ��ġ
		  //	5��) 3�� ��ȣ ��ġ
		  System.out.println("��÷ ��ȣ : " + Arrays.toString(winner));
		  switch(cnt) {
		  case 6:
			  // 2�� ? 1�� ?
			  if(bBonus) { // bBonus(boolean) : true/false
				  System.out.println("2�� ��÷�Դϴ�.");
			  } else {
				  System.out.println("1�� ��÷�Դϴ�.");
			  }
			  break;
		  case 5:
			  System.out.println("3�� ��÷�Դϴ�.");
			  break;
		  case 4:
			  System.out.println("4�� ��÷�Դϴ�.");
			  break;
		  case 3:
			  System.out.println("5�� ��÷�Դϴ�.");
			  break;
		  default:
			  System.out.println("��÷���� �ʾҽ��ϴ�.");
		  }
	 }

}
