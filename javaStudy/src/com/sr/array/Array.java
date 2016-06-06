package com.sr.array;

/*
 * 	4x4 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여
 * 	정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
 * 	int i = (int) Math.round(Math.random() * 9 + 1);
 */
public class Array {
	public static void main(String[] args) {

		// 배열 생성
		int[][] array = new int[4][4];
		
		// 입력
		for (int x = 0 ; x < array.length ; x++){
			for (int y = 0 ; y < array[x].length ; y++){
				int i = (int) Math.round(Math.random() * 9 + 1);
				array[x][y] = i;
			}
		}
		
		// 출력
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				System.out.print(array[x][y] + "\t");
			}
			System.out.println();
		}
	}
}
