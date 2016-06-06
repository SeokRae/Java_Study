package com.sr.page;

import java.util.Scanner;

public class Person {
	// 이름
	private String name = null;
	private int num1 = 0;
	private int num2 = 0;
	private int num3 = 0;

	Scanner sc = new Scanner(System.in);

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int num1, int num2, int num3) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	// 랜덤 함수 생성
	public void radomCreate() {
		boolean flag = true;

		while (flag) {
			String n = sc.nextLine();

			for (int i = 0; i < 6; i++) {
				setNum1((int) (Math.random() * 3 + 1));
				setNum2((int) (Math.random() * 3 + 1));
				setNum3((int) (Math.random() * 3 + 1));
				System.out.println(toString());

				if (n.equals("")) {
					flag = true;
				} else if (n.equals("end")) {
					flag = false;
				}
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}

}
