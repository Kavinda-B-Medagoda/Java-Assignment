package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter string: ");
        String string = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> StringHashMap = new HashMap<>();

        for (char c: string.toCharArray()){
            if (c != ' '){
                StringHashMap.put(c, StringHashMap.getOrDefault(c,0)+1);
            }
        }

        System.out.print(StringHashMap);
    }
}