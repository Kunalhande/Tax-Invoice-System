package com.invoice;
import java.util.*;


public class TaxGroup {

	String groupName;
	List<Tax> taxes;
	
	public TaxGroup(String groupName, List<Tax> taxes){
		this.groupName = groupName;
		this.taxes = taxes;
	}
	
	double getTotalTaxPercentage() {
		double total = 0;
		for(Tax t:taxes) {
			total +=t.percentage;
		}
		return total;
	}
	
}
