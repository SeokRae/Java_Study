package com.sr.test;

class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;


	Goods(String name, int price, int numberOfStock, int sold) {
		setName(name);
		setPrice(price);
		setNumberOfStock(numberOfStock);
		setSold(sold);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getNumberOfStock() {
		return numberOfStock;
	}

	int getSold() {
		return sold;
	}
}