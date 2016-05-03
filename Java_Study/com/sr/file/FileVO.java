package com.sr.file;

/**
 * 
 * @author "KimSR"
 *
 */
public class FileVO implements Comparable<Object> {

	private String rank;
	private String commpany;
	private String area;
	private String cat;
	private String salary;
	private String number;
	private String a_area;

	public FileVO() {
	}

	public FileVO(String rank, String commpany, String area, String cat, String salary, String number, String a_area) {
		setRank(rank);
		setCommpany(commpany);
		setarea(area);
		setCat(cat);
		setSalary(salary);
		setNumber(number);
		setA_area(a_area);
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getCommpany() {
		return commpany;
	}

	public void setCommpany(String commpany) {
		this.commpany = commpany;
	}

	public String getarea() {
		return area;
	}

	public void setarea(String area) {
		this.area = area;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getA_area() {
		return a_area;
	}

	public void setA_area(String a_area) {
		this.a_area = a_area;
	}

	@Override
	public String toString() {
		return "대졸연봉순위 <순위>: " + this.rank + ", <연봉>: " + this.salary + ", <총 인원>: " + this.number + ", <회사>: "
				+ this.commpany + ",\t <업종>: " + this.cat + ",\t <주소지>: " + this.area;
	}

	@Override
	public int compareTo(Object o) {
		return rank.compareTo(((FileVO) o).rank);
	}

}
