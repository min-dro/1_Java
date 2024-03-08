package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager{
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		int num = (int) (Math.random()*2 + 0 );
		 for(int i=0; i<aArr.length; i++) {
			 if (num == 0) {
				 aArr[i] = new Dog();
			 } else if(num == 1)
				 aArr[i] = new Cat();
		 }
		 for(int i=0; i<aArr.length; i++) {
			 aArr[i].speak();
		 }
	}
}