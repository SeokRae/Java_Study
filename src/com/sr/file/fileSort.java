package com.sr.file;

import java.util.Collections;
import java.util.List;

public class fileSort {
	FileDAO fdao;
	FileVO fvo;

	// default print
	public void fileShow(List<FileVO> afvo) {
		for (FileVO fvo : afvo) {
			System.out.println(fvo);
		}
	}

	// default sort print
	public void fileSort(List<FileVO> afvo) {
		// 기본 정렬
		Collections.sort(afvo);
		for (FileVO fvo : afvo) {
			System.out.println(fvo);
			this.sleep(50);
		}
	}

	// area sort print
	public void areaSort(List<FileVO> afvo) {
		System.out.println("검색 하시길 원하시는 지역을 입력하세요.");
//		String str = sc.nextLine();
//		if (afvo.contains((String) str)) {
//			System.out.println(afvo);
//		}
	}

	// sleep method
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
