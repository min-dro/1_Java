package ncs.test1;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.print("할당된 배열의 크기 : ");
		int num = sc.nextInt();
		for(int i=0; i<num;i++) {
			array[i]=(int)(Math.random()*100+1);
		}
		print(array);
		System.out.println("가장 큰 값 : "+max(array));
		System.out.println("가장 작은 값 : "+min(array));
		System.out.println("짝수의 개수 : "+evenCount(array));
		System.out.println("홀수의 개수 : "+oddCount(array));
		System.out.println("합계 : "+sum(array));
		System.out.println("평균 : "+avg(array));
		
		
	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static double avg(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				count++;
			}
		}
		double avg = sum(arr)/count;
		return Math.round(avg*100)/100.0;
	}
	
	public static int max(int[] arr) {
		int max = 100;
		for(;max>0;max--) {
			for(int i=0;i<arr.length;i++) {
				if(max==arr[i]) {
					return arr[i];
				}
			}
		}
		return 0;
	}
	
	public static int min(int[] arr) {
		int min = 0;
		for(;min<100;min++) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					if(min==arr[i]) {
						return arr[i];
					}
				}
			}
		}
		return 100;
	}
	
	public static int evenCount(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]!=0) {
				if(arr[i]%2==0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int oddCount(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		return count;
	}
	
	public static void print(int[] arr) {
		System.out.print("array : ");
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.print(" "+arr[i]+" ");
			}
		}
		System.out.println();
	}
}
