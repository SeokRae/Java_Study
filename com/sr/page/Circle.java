package com.sr.page;

/*
 * int 타입의 x, y, radius 필드를 가지는 Circle 클래스를 작성하라
 * equals() 메소드를 재정의하여 두 개의 Circle 객체의 반지름이 같으면
 * 두 Circle 객체가 동일한 것으로 판별하도록 하라.
 * Circle 클래스의 생성자는 3개의 인자를 가지며 x,y,radius 필드를 인자로 받아 초기화 한다.
 */
public class Circle {

	int x;
	int y;
	int radius;

	Circle() {
	}

	// 3개의 인자를 갖는 생성자
	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		// 객체 비교
		if (!(obj instanceof Circle)) {
			return false;
		}
		Circle circle = (Circle) obj;
		if (radius == circle.radius) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Circle a1 = new Circle(2, 3, 5);
		Circle a2 = new Circle(5, 3, 5);

		System.out.println(a1.equals(a2));
		if (a1.equals(a2)) {
			if (a1 == a2) {
				System.out.println("반지름도 객체 주소도 같아");
			} else {
				System.out.println("반지름은 같은데 객체 주소가 달라");
			}
		} else {
			System.out.println("반지름이 달라");
		}
	}
}
