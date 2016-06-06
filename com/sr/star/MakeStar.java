package com.sr.star;
/*
 * i == 층 
 * j == 별
 * floor == 사용자의 층수
 */
public class MakeStar {

	public static void main(String[] args) {
		int floor = 4 ;
		for (int i = 1 ; i <= floor ; i++){
			for (int j = 0 ; j < i ; j++){
				System.out.print( floor > i + j ? "*" : " ");
			}
		}
	}
}
