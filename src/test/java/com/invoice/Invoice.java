package com.invoice;
import java.util.*;

public class Invoice {
	List<Product> products; 
	
	public Invoice(List<Product> products){
		this.products = products;
	}
	
	public void generateBill() {
		double totalPrice = 0;
		double totalTax = 0;
	
	System.out.println("_______________________");
	System.out.println("Product\tPrice\tTax");
	
	for(Product p: products) {
		double tax = p.calculateTax();
		System.out.println(p.name + "\t" + p.price + "\t" +tax);
		
		totalPrice += p.price;
		totalTax += tax;
	}
	
	System.out.println("_______________________");
	System.out.println("Total\t"+totalPrice +"\t" + totalTax);
	System.out.println("Grand total\t" + (totalPrice +totalTax));
	
    }
}
