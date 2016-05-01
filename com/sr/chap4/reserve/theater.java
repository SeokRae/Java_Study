package com.sr.chap4.reserve;

import java.util.Scanner;

public class theater {
	private static String rName;
	private static String[][] seat = new String[3][10];
	private static String[] rank = { "S클래스 : ", "A클래스 : ", "B클래스 : " };
	static Scanner sc = new Scanner(System.in);

	public static String getrName() {
		return rName;
	}

	public static void setrName(String rName) {
		theater.rName = rName;
	}

	public void reserve() {
		for (int i = 0; i < seat.length; i++) {
			System.out.println(rank[i]);
			for (int j = 0; j < seat[i].length; j++) {
				if ("".equals(seat[i][j]) || null == seat[i][j]) {
					seat[i][j] = "______";
				}
				System.out.print(seat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("\t     ☆★☆환영합니다.☆★☆ \n\t★공연 예약프로그램입니다.★");
		boolean flag = false;

		theater t = new theater();
		t.reserve();

		do {
			System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4> : ");
			int sellect = sc.nextInt();

			if (sellect == 1) {

				System.out.println("Class 선택");
				int i = sc.nextInt();

				if (i == 1) {

					System.out.print("자리 선택<1 ~ 10> : ");
					int j = sc.nextInt();

					// 반복
					do {
						System.out.print("이름 : ");
						rName = sc.next().trim();

						for (i = 1; i <= seat.length; i++) {
							System.out.println(rank[i - 1]);
							for (j = 1; j <= seat[i - 1].length; j++) {
								if ("".equals(seat[i - 1][j - 1]) || null == seat[i - 1][j - 1]) {
									seat[i - 1][j - 1] = "______";
								} else if (rName.equals(seat[i - 1][j - 1])) {
									flag = true;
								} else if (!(rName.equals(seat[i - 1][j - 1]))) {
									t.setrName(rName);
									seat[i - 1][j - 1] = getrName();
								}
								System.out.print(seat[i - 1][j - 1] + "\t");
							}
							System.out.println();
						}
					} while (flag);
				} else if (i == 2) {
					System.out.print("자리 선택<1 ~ 10> : ");
					int j = sc.nextInt();

					// 반복
					do {
						System.out.print("이름 : ");
						rName = sc.next().trim();

						for (i = 1; i <= seat.length; i++) {
							System.out.println(rank[i - 1]);
							for (j = 1; j <= seat[i - 1].length; j++) {
								if ("".equals(seat[i - 1][j - 1]) || null == seat[i - 1][j - 1]) {

									seat[i - 1][j - 1] = "______";

								} else if (rName.equals(seat[i - 1][j - 1])) {
									flag = true;
								} else if (!(rName.equals(seat[i - 1][j - 1]))) {
									t.setrName(rName);
									seat[i - 1][j - 1] = getrName();
								}
								System.out.print(seat[i - 1][j - 1] + "\t");
							}
							System.out.println();
						}
					} while (flag);

				} else if (i == 3) {
					System.out.print("자리 선택<1 ~ 10> : ");
					int j = sc.nextInt();

					// 반복
					do {
						System.out.print("이름 : ");
						rName = sc.next().trim();

						for (i = 1; i <= seat.length; i++) {
							System.out.println(rank[i - 1]);
							for (j = 1; j <= seat[i - 1].length; j++) {
								if ("".equals(seat[i - 1][j - 1]) || null == seat[i - 1][j - 1]) {

									seat[i - 1][j - 1] = "______";

								} else if (rName.equals(seat[i - 1][j - 1])) {

									flag = true;
								} else if (!(rName.equals(seat[i - 1][j - 1]))) {

									t.setrName(rName);
									seat[i - 1][j - 1] = getrName();

								}
								System.out.print(seat[i - 1][j - 1] + "\t");
							}
							System.out.println();
						}
					} while (flag);

				}

			} else if (sellect == 2) {
				t.reserve();
			} else if (sellect == 3) {
				System.out.println("Class 선택");
				int i = sc.nextInt();

				if (i == 1) {
					System.out.print("자리 선택<1 ~ 10> : ");
					int j = sc.nextInt();
					t.setrName("______");
					seat[i - 1][j - 1] = getrName();
				} else if (i == 2) {
					System.out.print("자리 선택<1 ~ 10> : ");
					int j = sc.nextInt();
					t.setrName("______");
					seat[i - 1][j - 1] = getrName();
				} else if (i == 3) {
					System.out.print("자리 선택<1 ~ 10> : ");
					int j = sc.nextInt();
					t.setrName("______");
					seat[i - 1][j - 1] = getrName();
				}

			} else if (sellect == 4) {
				System.exit(0);
			}
			/*
			 * if(call == 1) new Reserve();
			 * 
			 * else if(call == 2) s.showPosition();
			 * 
			 * else if(call == 3) new Cancel();
			 * 
			 * else if (call==4) break;
			 * 
			 * else System.out.println(
			 * "잘못 누르셨습니다. \n정해진 1~4의 숫자중 원하시는 메뉴를 선택하세요. ");
			 */

		} while (true);

	}
}
