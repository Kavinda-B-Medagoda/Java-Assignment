package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stations = new ArrayList<>();
        System.out.println("Enter the station available(enter 'end' at the end of the destination): ");

        //get the stations from user
        while (true){
            String station = scanner.nextLine().trim();
            if (station.equalsIgnoreCase("end")){
                break;
            }
            stations.add(station);
        }

        //get the start station and final station of journey. and validate them.
        do {
        System.out.printf("Start station: ");
        String startStation = scanner.nextLine().trim();

        System.out.printf("Final station: ");
        String finalStation = scanner.nextLine().trim();

        //get the arraylist indexes of start and final destination
        int statIndex = stations.indexOf(startStation);
        int finalIndex = stations.indexOf(finalStation);

        if (statIndex == -1|| finalIndex == -1){
            System.out.printf("Invalid station. please enter valid station!");
        }
        else{
            // print stations that are in the journey
            System.out.println("Journey from " + startStation + " to " + finalStation + ":");
            for (int i = statIndex; i<= finalIndex; i++){
                System.out.println(stations.get(i));
            }
            break;
        }
        }while (true);


    }
}