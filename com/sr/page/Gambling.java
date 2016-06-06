package com.sr.page;

import java.util.Scanner;

public class Gambling {
	Scanner sc = new Scanner(System.in);

	public Gambling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();

		p1.setName("석래");
		p2.setName("래석");
		p1.radomCreate();
		System.out.println(p1.getName() + " vs " + p2.getName());
	}
}