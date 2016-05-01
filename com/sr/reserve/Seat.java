package com.sr.reserve;

import java.util.Scanner;

/*
 * 자리 배정을 위한 클래스
 * 1. 좌석표 초기화
 * 2. 예약 기능 적용할 수 있는 메소드
 * 3. 취소 기능 적용할 수 있는 메소드
 * 
 * 필요 필드
 * 1. 좌석표 (2차원 배열로 선언)
 * 2. S, A, B등급 선택 가능한 변수
 * 3. 예약 시 자리표에 들어갈 이름
 */
public class Seat {

	private String rName = "";
	private String[][] seat = new String[3][10];
	private String[] rank = { "S클래스", "A클래스", "B클래스" };
	public Scanner sc = new Scanner(System.in);

	// default 생성자
	Seat() {
	}

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

	public void setReserve(int classSelect, int seatSelect, String name) {
		this.seat[classSelect][seatSelect] = name;
	}

	// 초기화 생성자
	// 매개변수로 seat의 i(S,A,B클래스)와 j(1~10까지의 좌석), rName(예약자)를 받음
	public void reserve() {
		for (int i = 0; i < seat.length; i++) {
			System.out.print(rank[i] + " : ");
			for (int j = 0; j < seat[i].length; j++) {
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

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

}
