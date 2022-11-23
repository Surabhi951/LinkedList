package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Add the data.\n2. Append the data");
        switch (sc.nextInt()) {

            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.append();
                break;
        }

    }
}
