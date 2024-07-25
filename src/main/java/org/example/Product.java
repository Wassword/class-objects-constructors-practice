package org.example;

public class Product {
    private double productCost;
    private String productName;
    private int productQuantity;

    //Constructor
    public Product(double productCost, String productName, int productQuantity) {
        this.productCost = productCost; // this. distinguishes btw class attributes and constrictors parameters
        this.productName = productName;
        this.productQuantity = productQuantity;
    }
    //Method for the total cost
    public void totalCost(){
        double total = productCost * productQuantity;
        System.out.println("Total cost for your product is: $" + total);
    }

    //Method for the print product details
    public void printProduct(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost per unit: $" + productCost);
        System.out.println("Purchased Quantity : " + productQuantity);

    }
    public static void main(String[] args) {
        // Create a Product object
        Product product = new Product(999.99, "Laptop", 3);

        // Print product details
        product.printProduct();

        // Print total cost
        product.totalCost();
    }
}




