package com.sr.page;

/*
 * Math.random()메소드를 이용하여 
 * 10에서 50사이의 난수 10개를 
 * 화면에 출력하는 프로그램을 작성하라
 */
public class Random {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++){
			int random = (int) (Math.random()* 50 + 10);
			System.out.println(random);
		}
	}
}
