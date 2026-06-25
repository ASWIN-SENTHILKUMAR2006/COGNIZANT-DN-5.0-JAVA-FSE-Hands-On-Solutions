package com.example.ecommerce;

import java.util.Arrays;

public class SearchAlgorithms {

    
    public static int linearSearchByName(Product[] products, String name) {
        if (products == null || name == null) return -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && name.equalsIgnoreCase(products[i].getProductName())) {
                return i;
            }
        }
        return -1;
    }

 
    public static int linearSearchById(Product[] products, int id) {
        if (products == null) return -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getProductId() == id) {
                return i;
            }
        }
        return -1;
    }

   
    public static int binarySearchById(Product[] sortedProducts, int id) {
        if (sortedProducts == null) return -1;
        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Product midProd = sortedProducts[mid];
            if (midProd == null) {
                high = mid - 1;
                continue;
            }
            int cmp = Integer.compare(midProd.getProductId(), id);
            if (cmp == 0) return mid;
            if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static Product[] sortedByIdCopy(Product[] products) {
        if (products == null) return null;
        Product[] copy = Arrays.copyOf(products, products.length);
        Arrays.sort(copy);
        return copy;
    }
}
