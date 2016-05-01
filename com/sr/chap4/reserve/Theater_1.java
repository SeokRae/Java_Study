package com.sr.chap4.reserve;

import java.util.Scanner;

/**
 * <pre>
 * 1. Project Name : Test
 * 2. Package Name : 
 * 3. File Name    : Theater_1.java
 * 4. Date         : 2016. 4. 4. 오후 1:49:53
 * 5. Author       : MyungJin
 * 6. Note         :
 * </pre>
 */

public class Theater_1 {
	private String rName = "";
	private String[][] seat = new String[3][10];
	private String[] rank = { "S클래스", "A클래스", "B클래스" };
	public Scanner sc = new Scanner(System.in);

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	// 예약 메소드
	public void setReserve(int classSelect, int seatSelect, String name) {
		this.seat[classSelect][seatSelect] = name;
	}

	// 좌석 예약 상황을 보여주는 메소드
	public void reserve() {
		for (int i = 0; i < seat.length; i++) {
			System.out.print(rank[i] + " : ");
			for (int j = 0; j < seat[i].length; j++) {
				// 배열 안의 값이 null 일 때 ______를 값이 있다면 배열 안의 값을 표시해 준다.
				if ("".equals(seat[i][j]) || null == seat[i][j]) {
					System.out.print("______\t");
				} else {
					System.out.print(seat[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

	// 현재 예약상황 보여주는 메소드
	public void nowReserve() {
		System.out.println("----------------------------------------현재 예약 현황----------------------------------------");
		System.out.println();
		this.reserve();
		System.out.println();
		System.out.println(
				"----------------------------------------------------------------------------------------------");
	}

	// 예약된 좌석인지 체크 메소드
	public boolean checkReserve(int classSelect, int seatSelect) {
		boolean checkFlag = false;

		// 해당 좌석이 "" 또는 null일 경우에만 true
		// String[] 일 경우 초기값이 null로 저장이 되므로 null만 체크해도 되지만
		// 방어코드라고 해서 가능한 많은 처리를 넣어주는 것
		if ("".equals(seat[classSelect][seatSelect]) || null == seat[classSelect][seatSelect]) {
			checkFlag = true;
		}

		return checkFlag;
	}

	// 예약 취소 시 메소드
	public void cancelReserve(int classSelect, int seatSelect, String name) {

		// 해당 좌석에 예약된 사람이 없을 경우 Pass
		if ("".equals(seat[classSelect][seatSelect]) || null == seat[classSelect][seatSelect]) {
			System.out.println("예약되지 않은 좌석입니다. 다시 확인 해주세요.");
		}
		// 해당 좌석을 예약한 사람의 이름과 같지 않을 경우 Pass
		else if (!this.seat[classSelect][seatSelect].equals(name)) {
			System.out.println("예약자명이 일치하지 않습니다. 이름을 다시 확인 해주세요.");
		}
		// 해당 좌석에 예약이 되어있고 예약한 사람과 이름이 같을 경우 취소 처리
		else {
			this.seat[classSelect][seatSelect] = null;
			System.out.println("취소되었습니다.");
		}
	}

	public static void main(String[] args) {

		System.out.println("\t     ☆★☆환영합니다.☆★☆ \n\t★공연 예약프로그램입니다.★");
		boolean whileFlag = true;
		int classSelect = 0;
		int seatSelect = 0;
		boolean checkFlag = true;

		// 객체 초기화
		Theater_1 t = new Theater_1();

		while (whileFlag) {

			System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4> : ");
			int select = t.sc.nextInt();

			switch (select) {
			case 1:
				// 예약일 경우 현재 예약상황 출력 후 선택하게 만듬.
				t.nowReserve();
				System.out.println("Class 선택");
				System.out.print("1.S클래스  2.A클래스  3.B클래스 : ");
				classSelect = t.sc.nextInt();
				System.out.print("자리 선택<1 ~ 10> : ");
				seatSelect = t.sc.nextInt();
				// 자리까지 입력 받은 후에 해당 위치에 예약이 되어 있는지 체크
				checkFlag = t.checkReserve((classSelect - 1), (seatSelect - 1));
				// 예약이 되어있지 않을 경우에만 이름을 입력 받고 예약처리
				if (checkFlag) {
					System.out.print("이름 : ");
					String name = t.sc.next().trim();
					t.setReserve((classSelect - 1), (seatSelect - 1), name);
					System.out.println("예약되었습니다.");
					break;
				}
				// 예약이 되어 있을 경우 Pass
				else {
					System.out.println("이미 예약된 좌석입니다. 다시 시도해주세요.");
					break;
				}
			case 2:
				t.nowReserve();
				break;
			case 3:
				System.out.println("Class 선택");
				System.out.print("1.S클래스  2.A클래스  3.B클래스 : ");
				classSelect = t.sc.nextInt();
				System.out.print("자리 선택<1 ~ 10> : ");
				seatSelect = t.sc.nextInt();
				System.out.print("이름 : ");
				String name = t.sc.next().trim();
				// 클래스번호, 좌석번호, 이름을 입력 받아서 취소 메소드 호출
				t.cancelReserve((classSelect - 1), (seatSelect - 1), name);
				break;
			case 4:
				System.out.println("프로그램을 종료 합니다.");
				whileFlag = false;
				break;
			}
		}
	}
}
