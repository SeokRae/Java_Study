package com.sr.array;

/*
 * int 타입의 x1, y1, x2, y2 필드 : 사각형을 구성하는 두 점의 좌표
 * 생성자 2개 : 디폴트 생성자와 x1, y1, x2, y2의 값을 설정하는 생성자
 * void set(int x1, int y1, int x2, int y2) : x1, y1, x2, y2 좌표 설정
 * int square() : 사각형 넓이 리턴
 * void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
 * boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 직사각형이면 true 리턴
 * 
 * Ractangle을 이용한 main() 메소드는 다음과 같으며 이 main() 메소드가 잘 작동하도록 하라
 */
public class Rectangle {
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;

	Rectangle() {
	}

	Rectangle(int x1, int y1, int x2, int y2) {
		set(x1, y1, x2, y2);
	}

	void set(int x1, int y1, int x2, int y2) {
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
	}

	void show() {
		System.out.println(toString());
	}

	@Override
	public boolean equals(Object obj) {

		Rectangle r = (Rectangle) obj;
		if (square() == r.square()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Rectangle [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", square()=" + square() + "]";
	}

	private int square() {
		// 절대값 Math.abs
		return Math.abs(getX2() - getX1()) * (getY2() - getY1());
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1, 1, 2, 3);

		r.show();
		s.show();
		System.out.println(s.square());

		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println(r.square());
		if (r.equals(s)) {
			System.out.println("두 사각형은 같습니다.");
		}

	}

}
