package com.company.Examples;

import java.util.Map;

public class HashMap {
    public static void main (String [] args) {
        Map<String , Integer> vehicle = new java.util.HashMap<>(); //I instantiated a new HashMap
        vehicle.put("Bmw" , 3);
        vehicle.put("Audi" , 5);
        vehicle.put("Volkswagen" , 7);
        System.out.println("Total vehicles:" + vehicle.size());
        //Iterate over all the vehicles ,using the keySet method.
        for (String key : vehicle.keySet())
            System.out.println(key + " - " + vehicle.get(key));
        System.out.println();

        String searchKey = "Bmw";
        if (vehicle.containsKey(searchKey))
            System.out.println("Found total:" + vehicle.get(searchKey) + " " + searchKey.toUpperCase() + " " + "cars!\n");
        // the program searches in the HashMap for all the BMWs stored
        vehicle.clear(); // Clears the values
        System.out.println("After clear operation,size:" + vehicle.size()); // Equals to 0
    }
}
