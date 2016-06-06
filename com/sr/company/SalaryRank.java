package com.sr.company;

public class SalaryRank {
	
	private int rank = 0;
	private String name = null;
	private String location = null;
	private String work = null;
	private int salary = 0;
	private int unknownNumber = 0;
	private String local = null;
	
	public SalaryRank() {}
	
	public SalaryRank(String name, int rank, String location, String work, int salary, int unknownNumber,
			String local) {
		this.name = name;
		this.rank = rank;
		this.location = location;
		this.work = work;
		this.salary = salary;
		this.unknownNumber = unknownNumber;
		this.local = local;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getUnknownNumber() {
		return unknownNumber;
	}

	public void setUnknownNumber(int unknownNumber) {
		this.unknownNumber = unknownNumber;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "SalaryRank [name=" + name + ", rank=" + rank + ", location=" + location + ", work=" + work + ", salary="
				+ salary + ", unknownNumber=" + unknownNumber + ", local=" + local + "]";
	}
	
	
}
