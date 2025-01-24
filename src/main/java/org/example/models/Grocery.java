package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Grocery {

    public  static ArrayList<String> groceryList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void startGrocery() {
        int choice;

        do {
            System.out.println("Seçiminizi Yapın: Çıkış=0, Eleman Ekle=1, Eleman Çıkar=2 ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemAdd = scanner.nextLine();
                    addItems(itemAdd);
                    printSorted();
                    break;

                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String itemRemove = scanner.nextLine();
                    removeItems(itemRemove);
                    printSorted();
                    break;
            }
        }


        while (choice != 0);
        scanner.close();


    }

    public static void addItems(String itemAdd) {
        String[] items = itemAdd.split(",");
        for (String item : items) {
            item = item.trim();
            if (checkItemIsInList(item)) {
                System.out.println(item + "listede mevcut");

            } else {
                groceryList.add(item);
            }
        }
        sortItems();
    }

    public static void removeItems(String itemRemove) {
        String[] items = itemRemove.split(",");
        for (String item : items) {
            item = item.trim();
            if (!checkItemIsInList(item)) {
                System.out.println("Listede bulunamadı: " + item);
            } else {
                groceryList.remove(item);
            }
        }
        sortItems();
    }

    public static boolean checkItemIsInList(String item) {
        return groceryList.contains(item);
    }

    public static void printSorted() {
        sortItems();
        System.out.println("Mevcut liste: ");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    public  static void sortItems() {
        Collections.sort(groceryList);


    }
}

