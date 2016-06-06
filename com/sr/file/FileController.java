package com.sr.file;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author "KimSR"
 *
 */
public class FileController {

	List<FileVO> afvo;
	FileDAO fdao;

	public FileController() {
		afvo = new ArrayList<FileVO>();
		fdao = new FileDAO(afvo);
	}

	public static void main(String[] args) {
		new FileController();
	}
}
