
package com.demo;

import java.util.*;
import com.invoice.*;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> purchasedProducts = new ArrayList<>();

        
        Tax cgst = new Tax("CGST", 10);
        Tax sgst = new Tax("SGST", 10);
        Tax vat = new Tax("VAT", 2);

        TaxGroup noTax = new TaxGroup("No Tax", new ArrayList<>());
        TaxGroup vatGroup = new TaxGroup("VAT Group", Arrays.asList(vat));
        TaxGroup gstGroup = new TaxGroup("GST Group", Arrays.asList(cgst, sgst));

        
        while (true) {
            System.out.println("\n--- Add Product to Invoice ---");
            System.out.print("Enter Product Name (or type 'exit' to finish): ");
            String name = sc.next();
            
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.println("Select Tax Group: 1. No Tax | 2. VAT | 3. GST");
            int choice = sc.nextInt();
            
            TaxGroup selectedGroup = switch (choice) {
                case 2 -> vatGroup;
                case 3 -> gstGroup;
                default -> noTax;
            };

            purchasedProducts.add(new Product(name, price, selectedGroup));
        }

       
        if (!purchasedProducts.isEmpty()) {
            Invoice invoice = new Invoice(purchasedProducts);
            invoice.generateBill();
        } else {
            System.out.println("No products added.");
        }

        sc.close();
    }
}
