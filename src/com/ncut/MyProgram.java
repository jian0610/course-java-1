package com.ncut;

public class MyProgram {
	public static void main(String[] args) {
/*		System.out.println("---Start---");
		Car myCar1 = new Car();
		myCar1.a = 100;
		Car myCar2 = myCar1;
		myCar1.a = 200;
		System.out.println(myCar2.a);*/
//		Car myCar =new Car();
//		int a = myCar.calAdd(1);
//      System.out.println(a);
		Car myCar1 = new Car();
		myCar1.a = 100;
		int ans = myCar1.calAdd(0, 1);
		System.out.println(ans);
	}
}
