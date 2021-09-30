/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution34 {
    private static final int INITIAL_EMPLOYEE_LIST_SIZE = 5;
    public static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //There actually isn't anything I can test here, since I'm just using functions that already exist and work.
        //Furthermore, given the simplicity of 34, I can go back to one-class solutions!
        //First, make an arraylist containing the 5 names.
        ArrayList<String> employeeList = new ArrayList<>(INITIAL_EMPLOYEE_LIST_SIZE);
        employeeList.addAll(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"));
        //Then, call sayArrayList(employeeList).
        sayArrayList(employeeList);
        //Then, ask for an employee name to remove.
        System.out.print("\nEnter an employee name to remove: ");
        //Then, remove the employee using remove(employeeName), and use trimToSize if necessary.
        employeeList.remove(in.nextLine());
        employeeList.trimToSize();
        //Linebreak for formatting!
        System.out.print("\n");
        //Finally, call sayArrayList(employeeList) again.
        sayArrayList(employeeList);
    }

    private static void sayArrayList(ArrayList<String> arrayListToSay) {
        //First, say the number of employees in the arraylist.
        System.out.println("There are " + arrayListToSay.size() + " employees: ");
        //Then, use a loop to iterate through all the objects in the arraylist and say each one.
        for (String s : arrayListToSay) {
            System.out.println(s);
        }
    }
}
