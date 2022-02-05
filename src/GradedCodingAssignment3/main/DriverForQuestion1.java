package GradedCodingAssignment3.main;

import java.util.LinkedList;
import java.util.Scanner;

import static GradedCodingAssignment3.service.SkyscraperProblem.floorSelection;


public class DriverForQuestion1 {
    public  static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the total no. of floors in the building ");
        int n = scn.nextInt();
        LinkedList<Integer> floors = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the floor size given on day : " + (i + 1));
            int floor = scn.nextInt();
            floors.add(floor);
        }

        floorSelection(floors, n);
    }
}
