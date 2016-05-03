package com.sr.file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author "KimSR"
 *
 */
public class FileController {
	Scanner sc = new Scanner(System.in);
	List<FileVO> afvo;
	FileDAO fdao;
	FileSort fs;

	FileController() {
		afvo = new ArrayList<FileVO>();
		fdao = new FileDAO();
		fs = new FileSort();
		menu();
	}

	public void menu() {
		while (true) {
			System.out.print("선택 1. 무작위, 2. 정렬 : ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("무작위 출력합니다.");
				fs.fileShow(afvo);
				break;
			case 2:
				System.out.println("순위대로 출력합니다.");
				fs.fileSort(afvo);
				break;
			case 3:
				System.out.print("원하시는 지역을 입력하세요.: ");
				String str = sc.next();
				fs.areaSort(str, afvo);
				break;
			case 4:
				System.out.println("검색하시려는 연봉을 입력하세요.");
				System.out.println("예) 2000 ~ 5000");
				int salary = sc.nextInt();
				salary /= 1000;

				switch (salary) {
				case 2:
					fs.salarySort(salary, afvo);
					break;
				case 3:
					fs.salarySort(salary, afvo);
					break;
				case 4:
					fs.salarySort(salary, afvo);
					break;
				case 5:
					fs.salarySort(salary, afvo);
					break;
				default:
					System.out.println("2000 ~ 5000 범위의 값을 입력하세요.");
				}
				break;
			default:
				System.out.println("에러야..");
				return;
			}

		}

	}

	public static void main(String[] args) {
		new FileController();
	}
}
