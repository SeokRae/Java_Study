package com.sr.test;

import java.util.Scanner;

public class GoodsArrays {
	public static void main(String[] args) {
		// Goods 클래스를 배열객체로 선언
		Goods[] goodsArray;
		// goodsArray객체에 Goods[3]개를 생성
		goodsArray = new Goods[3];
		
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < goodsArray.length; i++) {
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold);
		}
		
		for (int i = 0 ; i < goodsArray.length; i++) {
			System.out.print(goodsArray[i].getName() + " ");
			System.out.print(goodsArray[i].getPrice() + " ");
			System.out.print(goodsArray[i].getNumberOfStock() + " ");
			System.out.println(goodsArray[i].getSold());
		}
		
		for (int i = 0 ; i < goodsArray.length ; i++){
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goods(name, price, n, sold);
		}
	}
}