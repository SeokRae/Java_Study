package com.sr.reserve;

import java.util.Scanner;

public class ReserveProgram {

	public static void main(String[] args) {

		System.out.println("\t     ☆★☆환영합니다.☆★☆ \n\t★공연 예약프로그램입니다.★");
		boolean whileFlag = true;
		int classSelect = 0;
		int seatSelect = 0;
		boolean checkFlag = true;
		
		// 객체 초기화
		Seat s = new Seat();

		while (whileFlag) {

			System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4> : ");
			int select = s.sc.nextInt();

			switch (select) {
			case 1:
				// 예약일 경우 현재 예약상황 출력 후 선택하게 만듬.
				s.nowReserve();
				
				System.out.println("Class 선택");
				System.out.print("1.S클래스  2.A클래스  3.B클래스 : ");
				classSelect = s.sc.nextInt();
				
				System.out.print("자리 선택<1 ~ 10> : ");
				seatSelect = s.sc.nextInt();
				// 자리까지 입력 받은 후에 해당 위치에 예약이 되어 있는지 체크
				checkFlag = s.checkReserve((classSelect - 1), (seatSelect - 1));
				// 예약이 되어있지 않을 경우에만 이름을 입력 받고 예약처리
				if (checkFlag) {
					System.out.print("이름 : ");
					String name = s.sc.next().trim();
					s.setReserve((classSelect - 1), (seatSelect - 1), name);
					System.out.println("예약되었습니다.");
					break;
				}
				// 예약이 되어 있을 경우 Pass
				else {
					System.out.println("이미 예약된 좌석입니다. 다시 시도해주세요.");
					break;
				}
			case 2:
				s.nowReserve();
				break;
			case 3:
				System.out.println("Class 선택");
				System.out.print("1.S클래스  2.A클래스  3.B클래스 : ");
				classSelect = s.sc.nextInt();
				System.out.print("자리 선택<1 ~ 10> : ");
				seatSelect = s.sc.nextInt();
				System.out.print("이름 : ");
				String name = s.sc.next().trim();
				// 클래스번호, 좌석번호, 이름을 입력 받아서 취소 메소드 호출
				s.cancelReserve((classSelect - 1), (seatSelect - 1), name);
				break;
			case 4:
				whileFlag = false;
				break;
			}
		}
	}
}