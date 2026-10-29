package com.pluralsight;

import java.util.ArrayList;

public class StoreApp {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(2001, "Blue eyes White Dragon", 34.99));
        inventory.add(new Product(2002, "Red eyes Black dragon", 15));
        inventory.add(new Product(2003, "Dark Magician", 45.50));
        inventory.add(new Product(2004, "Dark Magician Girl", 84.99));
        inventory.add(new Product(2005, "Red eyes Dark Dragoon", 30.50));

        return inventory;
    }
}
