package com.sr.file;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileSort {
	Scanner sc = new Scanner(System.in);
	List<FileVO> afvo;
	FileDAO fdao;
	FileSort fs;

	FileSort() {
		// TODO Auto-generated constructor stub
		afvo = new ArrayList<FileVO>();
		fdao = new FileDAO(afvo);
	}

	FileSort(int select) {
		switch (select) {
		case 1:

			break;
		case 2:
			fs.fileSort(afvo);
			break;
		case 3:
			fs.areaSort(str, afvo);
			break;
		case 4:
			fs.salarySort(salary, afvo);
			break;
		default:

		}
	}

	// default print
	public void fileShow(List<FileVO> afvo) {

		// for (FileVO fvo : afvo) {
		// System.out.println(fvo);
		// }
		int i = 0;
		for (FileVO fvo : afvo) {
			if (i == 500) {
				this.sleep(1000);
			}
			System.out.println(fvo);
			i++;
		}
	}

	// default sort print
	public void fileSort(List<FileVO> afvo) {
		// 기본 정렬
		Collections.sort(afvo);
		// int i = 0;
		// for (FileVO fvo : afvo) {
		// i++;
		// if (i == 500) {
		// this.sleep(1000);
		// }
		// System.out.println(fvo);
		// }
		for (int i = 0; i < afvo.size(); i++) {
			if (i == 500) {
				this.sleep(1000);
			}
			System.out.println(afvo.get(i));
		}
	}

	// area sort print
	public void areaSort(String str, List<FileVO> afvo) {
		// 지역 선택 출력
		for (int i = 0; i < afvo.size(); i++) {
			if ((afvo.get(i).toString().contains(str))) {
				System.out.println(afvo.get(i));
			}
		}
	}

	public void salarySort(int salary, List<FileVO> afvo) {
		// 연봉 구간 출력
		for (int i = 0; i < afvo.size(); i++) {
			if (((Integer.parseInt(afvo.get(i).getSalary())) / 1000) == salary) {
				System.out.println(afvo.get(i));
			}
		}

	}

	// sleep method
	private void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
}
