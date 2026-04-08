# 🧾 Tax Invoice System (Java)

A simple Java-based application that generates invoices by applying different tax rules on products. This project demonstrates the use of object-oriented programming, data structures, and basic financial calculations.

---

## 🚀 Features

* Store different types of taxes (CGST, SGST, VAT, etc.)
* Combine multiple taxes into tax groups
* Assign tax groups to products
* Automatically calculate:

  * Product tax
  * Total tax
  * Grand total
* Generate a formatted invoice output

---

## 🧠 Project Objective

The goal of this project is to simulate a real-world invoice system where:

* Different products have different tax rules
* Taxes can be grouped and reused
* Invoice is generated dynamically based on selected products

---

## 🏗️ Project Structure

```
src/
 ├── main/java/com/invoice/
 │     ├── Tax.java
 │     ├── TaxGroup.java
 │     ├── Product.java
 │     ├── Invoice.java
 │
 ├── test/java/
 │     ├── AppTest.java
```

---

## ⚙️ Technologies Used

* Java
* Maven
* OOP Concepts
* Collections (List, Map)

---

## 📌 Tasks Implemented

### ✅ Task 1: Tax Data Structure

* Stores tax name and percentage

### ✅ Task 2: Tax Group

* Combines multiple taxes into a single group

### ✅ Task 3: Product Structure

* Stores product name, price, and tax group

### ✅ Task 4: Invoice Generation

* Stores purchased products
* Calculates total tax and final amount
* Displays formatted invoice

---

## 📊 Sample Output

```
-----------------------------
Product     Price     Tax

Soap        10        2
Petrol      65        1.2

Total       75        3.2

Grand Total : 78.2
-----------------------------
```

---

## 🧮 How It Works

1. Define taxes (e.g., CGST, SGST, VAT)
2. Create tax groups (e.g., GST = CGST + SGST)
3. Assign tax groups to products
4. Add products to invoice
5. Calculate totals and display output

---

## ▶️ How to Run

1. Clone the repository:

```
git clone https://github.com/Kunalhande/Tax-Invoice-System.git
```

2. Open in Eclipse / IntelliJ

3. Run the main class:

```
App.java
```

---

## 💡 Future Improvements

* Add GUI (JavaFX / Swing)
* Export invoice as PDF
* Add database (MySQL)
* Build REST API using Spring Boot
* Add user authentication

---

## 🙌 Author

**Kunal Hande**

---

## ⭐ Contribution

Feel free to fork this project and improve it!
