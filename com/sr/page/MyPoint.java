package com.sr.page;

/*
 * "MyPoint(3,20)"이 출력되도록 MyPoint 클래스를 작성하라
 */
public class MyPoint {
	private int i = 0;
	private int j = 0;
	
	// Default 생성자
	MyPoint() {}
	// 생성자 오버로딩
	MyPoint(int i, int j) {
		this.i = i;
		this.j = j;
	}
	// toString Override
	@Override
	public String toString() {
		return "MyPoint (" + i + "," + j + ")";
	}

	public static void main(String[] args) { 	
		MyPoint a = new MyPoint(3, 20);
		System.out.println(a);
	}

}
