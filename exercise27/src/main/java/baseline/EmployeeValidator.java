/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

final class EmployeeValidator {
    public void employeeValidate(String firstName, String lastName, String zipCode, String employeeID) {
        //First, check the length of the first and last name through .length.
        //If they're less than 2, say that they need to be at least 2 characters long.
        //Then, check the zip code.
        //(Maybe the below can be accomplished with patterns and regex?)
        //If it's not 5 characters long and all numbers, say that it needs to be a 5-digit number.
        //Finally, if the employee ID doesn't match the format AA-1234, say that it needs to be the format AA-1234.
    }
}
