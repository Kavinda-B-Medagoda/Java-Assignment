package org.example;

public class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x<10){
            if (x>3){
                System.out.println("big x");
            }
            x++; // This program is compiled. it runs infinite time. but if we want to get outputs, we need to increase or decrease the x value in each iteration of while loop
        }
    }
}
