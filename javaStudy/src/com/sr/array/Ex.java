package com.sr.array;

/*
 * 가비지가 발생하는 부분?
 */
class MyClass {
	int i;
}

public class Ex {
	public static void main(String[] args) {
		MyClass a = new MyClass();
		MyClass b = new MyClass();
		MyClass c = b;
		
		int i = 10;
		int j = 0;
		int k = 0;
		
		k = i;
		// 이미 할당된 a의 주소 값이 b의 주소값을 참조하면서 할당 받았던 주소값이 의미가 없게 되면서 가비지가 발생한다.
		a = b;
	}
}
