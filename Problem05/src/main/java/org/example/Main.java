package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter name list(Enter 'done' to finish): ");

        ArrayList<String> nameList = new ArrayList<>();

        while (true){
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("done")){
                break;
            }

            nameList.add(name);
        }

        Collections.sort(nameList);

        System.out.println("Names in alphabet order:");
        for (String name: nameList){
            System.out.println(name);
        }
    }
}