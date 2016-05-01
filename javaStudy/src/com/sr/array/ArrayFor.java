package com.sr.array;

import java.util.Scanner;

/*
 * 배열과 반복문을 이용하여 프로그램을 작성
 * 키보드에서 정수로 된 돈의 액수를 입력 받아
 * 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리동전, 10원짜리 동전, 1원짜리 동전
 * 각 몇 개로 변환되는지 출력하라, 
 * 예를 들어 65370이 입력되면 오만원권 1매, 만원권 1매, 천원권 5매, 100원 짜리 동전 3개, 50원짜리 동전 1개, 10원짜리 동전 2개
 * 
 * int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
 */
public class ArrayFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		
		for (int i = 0 ; i < unit.length ; i++){
			System.out.println("\t" + unit[i] + "원\t:" + money/unit[i] +"개");
			money %= unit[i];
		}
	}
}
