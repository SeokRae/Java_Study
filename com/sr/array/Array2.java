package com.sr.array;

/*
 * 4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 8개만 랜덤하게 생성하여 임의의 위치에 삽입하라.
 * 동일한 수가 나올 수도 있다. 나머지 8개의 숫자는 모두 0이다.
 * 즉, 2차원 배열에는 항상 8개의 정수가 랜덤한 위치에 있도록 하라.
 * 그리고 이 2차원 배열을 화면에 출력하라.
 * 
 */
public class Array2 {
	public static void main(String[] args) {

		int[][] array = new int[4][4];

		for (int z = 0; z < 8; z++) {
			int f = (int) (Math.random() * 4);
			int s = (int) (Math.random() * 4);
			int i = (int) (Math.random() * 10 + 1);
			
			if (array[f][s] == 0) {
				array[f][s] = i;
			} else {
				z--;
			}
		}

		for (int f = 0; f < 4; f++) {
			for (int s = 0; s < 4; s++) {
				System.out.print(array[s][f] + "\t");
			}
			System.out.println();
		}
	}
}
