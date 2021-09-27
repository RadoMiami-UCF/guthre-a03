/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

public class Solution27 {
    public static void main(String[] args) {
        //First, ask for the first name, last name, employee ID, and zipcode of the employee.
        var firstName = sayThenGetString("first name sentence");
        var lastName = sayThenGetString("last name sentence");
        var zipCode = sayThenGetString("zipcode sentence");
        var employeeID = sayThenGetString("id sentence");
        //Then, pass them into the validator function.
        var employeeValidator = new EmployeeValidator();
        employeeValidator.employeeValidate(firstName, lastName, zipCode, employeeID);

    }
    private static String sayThenGetString(String sayString) {
        //Hooray, it's the return of sayThenGetString!
        //Say sayString.
        //Then return in.nextLine.
        return "";
    }
}
