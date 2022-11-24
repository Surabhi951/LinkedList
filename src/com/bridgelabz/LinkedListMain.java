package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Add the data.\n2. Append the data\n3. Insert in between\n4. Delete the data at first position");
        switch (sc.nextInt()) {

            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.append();
                break;
            case 3:
                Operations.insertInBetween();
                break;
            case 4:
                Operations.pop();
                break;
        }

    }
}
