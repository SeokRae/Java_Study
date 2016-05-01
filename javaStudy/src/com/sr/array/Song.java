package com.sr.array;

/*
 *  Song클래스가 갖는 필드
 *  title : 노래 제목
 *  artist : 가수
 *  album : 노래가 속한 앨범 제목
 *  composer : 작곡가(여러명이 존재 할 수 있음)
 *  year : 노래가 발표된 연도
 *  track : 노래가 속한 앨범에서의 트랙 번호 
 *  
 *  1. 기본 생성자
 *  2. 모든 필드를 초기화 하는 생성자
 *  3. 노래의 정보를 화면에 출력하는 show() 메소드
 *  4. ABBA의 "Dancing Queen"노래를 Song 객체로 생성하고 show()를 이용하여
 *  	이 노래의 정보를 출력하는 프로그램 작성하기 
 */
public class Song {
	private String artist = null;
	private String title = null;
	private String album = null;
	private String[] composer = null;
	private int year = 0;
	private int track = 0;

	// 1. default 생성자
	Song() {}

	// 2. 모든필드를 초기화 하는 생성자
	Song(String artist, String title, String album, String[] composer, int year, int track) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	// 3. 노래의 정보를 화면에 출력하는 show() 메소드
	public void show() {
		System.out.println("제목\t: " + getTitle());
		System.out.print("작곡가\t: " + getArtist());
		
		for (int i = 0; i < composer.length; i++) {
			getArtist().split(" ");
		}
		
		System.out.println("앨범\t: " + getAlbum());
		System.out.println("연도\t: " + getYear());
		System.out.println("트랙\t: " + getTrack());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String[] getComposer() {
		return composer;
	}

	public void setComposer(String[] composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public static void main(String[] args) {
		Song s = new Song("ABBA", "Dancing Queen", null, null, 0, 0);
		s.show();
	}

	@Override
	public String toString() {
		return "Song [artist=" + artist + ", title=" + title + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
}
