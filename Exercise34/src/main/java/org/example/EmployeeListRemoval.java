package org.example;
import java.util.Scanner;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class EmployeeListRemoval {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        Scanner scnr = new Scanner(System.in);
        String userInput;

        alist.add("John Smith");
        alist.add("Jackie Jackson");
        alist.add("Chris Jones");
        alist.add("Amanda Cullen");
        alist.add("Jeremy Goodwin");

        System.out.println(alist);

        System.out.println("Enter an employee name to remove: ");
        userInput = scnr.nextLine();
        alist.remove(userInput);
        System.out.println(alist);

    }
}
