package com.invoice;

public class Product {
	
	String name;
	double price;
	TaxGroup taxGroup;
	
	public Product(String name, double price, TaxGroup taxGroup){
		this.name = name;
		this.price = price;
		this.taxGroup = taxGroup;
	}
	
	double calculateTax() {
		return price *taxGroup.getTotalTaxPercentage()/100;
	}

}
