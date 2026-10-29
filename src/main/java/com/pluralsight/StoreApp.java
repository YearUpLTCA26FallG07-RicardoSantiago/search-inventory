package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class StoreApp {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();
        System.out.println("These are the cards we have right now: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f%n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        try { BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));

            br.readLine();

            String line;

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                double price = Double.parseDouble(fields[2]);

                Product product = new Product(id, name, price);
                inventory.add(product);
            }
              br.close();

            }catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
            }

        return inventory;
    }
}
