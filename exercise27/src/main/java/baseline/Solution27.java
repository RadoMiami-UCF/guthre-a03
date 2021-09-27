/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        var output = "";
        //First, ask for the first name, last name, employee ID, and zipcode of the employee.

        var firstName = sayThenGetString("Enter the first name: ");
        var lastName = sayThenGetString("Enter the last name: ");
        var zipCode = sayThenGetString("Enter the ZIP code: ");
        var employeeID = sayThenGetString("Enter the employee ID: ");
        //Then, pass them into the validator function.
        var employeeValidator = new EmployeeValidator(firstName, lastName, zipCode, employeeID);
        var employeeValidatorResults = employeeValidator.validateInput();
        //Then, say the results of the validator function.
        if(employeeValidatorResults[0]) {
            output += "The first name must be at least 2 characters.\n";
            if(employeeValidatorResults[1]) {
                output += "The first name must be filled in.\n";
            }
        }

        if(employeeValidatorResults[EmployeeValidator.POSSIBLE_NAME_ERROR_COUNT]) {
            output += "The last name must be at least 2 characters.\n";
            if(employeeValidatorResults[EmployeeValidator.POSSIBLE_NAME_ERROR_COUNT + 1]) {
                output += "The last name must be filled in.\n";
            }
        }

        if (employeeValidatorResults[EmployeeValidator.ID_CHECK_ERROR_INDEX]) {
            output += "The employee ID must be in the format of AA-1234.\n";
        }

        if (employeeValidatorResults[EmployeeValidator.ZIP_CHECK_ERROR_INDEX]) {
            output += "The zipcode must be a 5 digit number.\n";
        }
        //Finally, if there were no errors, say that there were no errors.
        if ("".equals(output)) {
            output = "There were no errors found.\n";
        }

        System.out.print(output);

    }
    private static String sayThenGetString(String sayString) {
        //Hooray, it's the return of sayThenGetString!
        //Say sayString.
        System.out.print(sayString);
        //Then return in.nextLine.
        return in.nextLine();
    }
}
