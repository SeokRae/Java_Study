package com.sr.file;

import java.util.Collections;
import java.util.List;

public class FileSort {
	FileDAO fdao;
	FileSort fs;

	FileSort(List<FileVO> afvo) {
		// TODO Auto-generated constructor stub
		fdao = new FileDAO(afvo);

	}

	// default print
	// 기본 파일을 불러와서 출력해 주는 메소드
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
	// 파일 순위 정렬
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
	// 지역 정렬 메소드
	public void strSort(String str, List<FileVO> afvo) {
		// 지역 선택 출력
		for (int i = 0; i < afvo.size(); i++) {
			if ((afvo.get(i).toString().contains(str))) {
				System.out.println(afvo.get(i));
			}
		}
	}

	// 연봉 구간 정렬 메소드
	public void salarySort(int salary, List<FileVO> afvo) {
		// 연봉 구간 출력
		for (int i = 0; i < afvo.size(); i++) {
			if (((Integer.parseInt(afvo.get(i).getSalary())) / 1000) == salary) {
				System.out.println(afvo.get(i));
			}
		}

	}


	// sleep method
	// pause를 위한 메소드
	private void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}
}
