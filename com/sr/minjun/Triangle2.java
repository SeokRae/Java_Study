package com.sr.minjun;
import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		System.out.println("몇 층?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("1");
		//3번 (삼항 연산자)
		for (int i = 1; i <= num ; i++) {
			for (int j = 1; j <= num; j++)
				System.out.print(num < i + j ? "*" : " ");
			System.out.println();
		}
		System.out.println("2");
		//4번 (삼항연산자)
		for (int i = 1; i <= num ; i++) {
			for (int j = 1; j <= num; j++)
				System.out.print(i > j ? " " : "*");
			System.out.println();
		}
		System.out.println("3");
		//4번 (--를 이용한 역삼각형 응용 삼항연산자)
		for (int i = num; i >= 1 ; i--) {
			for (int j = 1; j <= num; j++)
				System.out.print(num >= i+j ? " " : "*");
			System.out.println();
		}
		System.out.println("4");
		//5번 삼항연산자
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j < i+num; j++)
				System.out.print(num < i + j ? "*" : " ");
			System.out.println();
		}
		System.out.println("5");
		//6번 삼항연산자
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <= num; j++)
				System.out.print(num < i + j ? "* " : " ");
			System.out.println();
		}
		System.out.println("6");
		//7번 삼항연산자
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j < i + num; j++)
				System.out.print(num < i + j ? "*" : " ");
			System.out.println();
		}
		System.out.println("7");
		//8번 삼항연산자
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= num; j++)
				System.out.print(num < i + j ? "* " : " ");
			System.out.println();
		}
		System.out.println("8");
		//9번 삼항연산자
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(i+j <= num+1 ? "* " : " ");
			System.out.println();
		} 
	}
}
