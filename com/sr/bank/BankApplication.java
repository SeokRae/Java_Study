package com.sr.bank;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
	}

	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌 생성");
		System.out.println("---------");

		System.out.print("계좌 번호  :");
		String ano = scanner.nextLine().trim();
		System.out.print("계좌 주    :");
		String owner = scanner.nextLine().trim();
		System.out.print("초기 입금액:");
		int balance = scanner.nextInt();

		Account newAccount = new Account(ano, owner, balance);

		for (int i = 0; i < accountArray.length; i++) {

			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌 목록");
		System.out.println("---------");

		for (int i = 0; i < accountArray.length; i++) {
			// Account 객체 선언
			// 및 생성시 Account객체 배열
			Account account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno());
				System.out.print("		");
				System.out.print(account.getOwner());
				System.out.print("		");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}

	}

	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine().trim();
		System.out.print("예금액: ");
		int money = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("결과: 입금이 성공되었습니다.");
	}

	private static void withdraw() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌 번호: ");
		String ano = scanner.nextLine().trim();
		System.out.print("예금액\t: ");
		int money = scanner.nextInt();

		Account account = findAccount(ano);

		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	private static Account findAccount(String ano) {
		// Account클래스 선언 (계좌 번호: ano, 계좌주: owner, 예금액: balance)
		// null 값으로 초기화
		Account account = null;
		// 반복문을 통해 객체의 배열길이 만큼 반복
		for (int i = 0; i < accountArray.length; i++) {
			// 만약 i 번째의 배열 값이 null 값이 아닐 경우 실행
			if (accountArray[i] != null) {
				// dbAno라는 변수 생성 및 선언
				// 배열 값이 null 값이 아닐 경우 dbAno변수에 i번째의 계좌 번호 대입
				String dbAno = accountArray[i].getAno();
				// 메소드로 넘어온 매개 변수 값이 dbAno에 저장된 계좌 번호(ano)의 값이 같을 경우 출력
				if (dbAno.equals(ano)) {
					// Account에 배열 값을 대입
					account = accountArray[i];
					break;
				}
			}
		}
		// 입력된 배열 값을 반환
		return account;

	}
}
