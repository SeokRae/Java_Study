package com.sr.test;

class MyClass {
	int i;

	public void hi() {

	}
}

// 가비지 a
public class gabage {
	public static void main(String[] args) {
		MyClass a = new MyClass();
		System.out.println(a.i);
		MyClass b = new MyClass();
		MyClass c = b;
		int i = 10;
		int j = 0;
		int k = 0;
		k = i;
		a = b;
		
		a.hi();
		
	}
}
