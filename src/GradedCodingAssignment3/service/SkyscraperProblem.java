package GradedCodingAssignment3.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SkyscraperProblem {

    public static Scanner scn = new Scanner(System.in);


    public static void floorSelection(LinkedList<Integer> floors, int noOfFloors) {
        int temp = noOfFloors;
        LinkedList<Integer> constructedFloors = new LinkedList<>();
        for (int i = 0; i < noOfFloors; i++) {
            constructedFloors.add(floors.get(i));
            Collections.sort(constructedFloors, Collections.reverseOrder());

            System.out.println("Day: " + (i + 1));
            if (constructedFloors.getFirst() == temp) {
                System.out.print(constructedFloors.pop() + " ");
                temp--;
                while (!constructedFloors.isEmpty() && constructedFloors.getFirst() == temp) {
                    System.out.print(constructedFloors.pop() + " ");
                    temp--;
                }
            }
            System.out.println();
        }
    }
//
//
//    public static void main(String[] args) {
//        System.out.println("Enter the total no. of floors in the building ");
//        int n = scn.nextInt();
//        LinkedList<Integer> floors = new LinkedList<>();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter the floor size given on day : " + (i + 1));
//            int floor = scn.nextInt();
//            floors.add(floor);
//        }
//        floorSelection(floors, n);
//    }

}
