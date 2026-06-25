package com.example.ecommerce;
import com.example.ecommerce.Product;
import com.example.ecommerce.SearchAlgorithms;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
       
        Product[] products = new Product[] {
                new Product(101, "Laptop", "Electronics"),
                new Product(58, "Sneakers", "Footwear"),
                new Product(230, "Coffee Maker", "Home Appliances"),
                new Product(12, "Notebook", "Stationery"),
                new Product(300, "Headphones", "Electronics"),
                new Product(75, "Backpack", "Bags")
        };

        System.out.println("Products (unsorted):");
        for (Product p : products) System.out.println(p);

        // Linear search by name
        String searchName = "Backpack";
        int idxLinear = SearchAlgorithms.linearSearchByName(products, searchName);
        System.out.println("Linear search by name - Product: " + searchName + ", Index found: " + idxLinear);
   

        // Linear search by id
        int searchId = 230;
        int idxLinearId = SearchAlgorithms.linearSearchById(products, searchId);
        System.out.println("Linear search by id - Product ID: " + searchId + ", Index found: " + idxLinearId);

       
        // Prepare sorted array for binary search
        Product[] sorted = SearchAlgorithms.sortedByIdCopy(products);
        System.out.println("\nProducts (sorted by id):");
        for (Product p : sorted) System.out.println(p);

        // Binary search by id
        int wantId = 58;
        int idxBinary = SearchAlgorithms.binarySearchById(sorted, wantId);
        System.out.println("Binary search by id - Product ID: " + wantId + ", Index found: " + idxBinary);
       
        System.out.println("\nDone.");
    }
}
