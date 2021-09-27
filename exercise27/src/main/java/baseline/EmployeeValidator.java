/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.regex.Pattern;

final class EmployeeValidator {
    public static final byte POSSIBLE_ERROR_COUNT = 6;
    public static final byte POSSIBLE_NAME_ERROR_COUNT = 2;
    public static final byte ZIP_CHECK_ERROR_INDEX = 4;
    public static final byte ID_CHECK_ERROR_INDEX = 5;
    private static final int MIN_NAME_LENGTH = 2;
    private final String firstName;
    private final String lastName;
    private final String zipCode;
    private final String employeeID;

    public EmployeeValidator(String firstNameIn, String lastNameIn, String zipCodeIn, String employeeIDIn) {
        firstName = firstNameIn;
        lastName = lastNameIn;
        zipCode = zipCodeIn;
        employeeID = employeeIDIn;
    }

    public boolean[] validateInput() {
        //First, make a boolean array to store the various possible errors.
        var errorsTripped = new boolean[POSSIBLE_ERROR_COUNT];
        //First, check the length of the first and last name through nameChecker.

        //If arraycopy didn't exist, this is where the memory leaks would have begun.
        System.arraycopy(nameChecker(firstName), 0, errorsTripped, 0, POSSIBLE_NAME_ERROR_COUNT);
        System.arraycopy(nameChecker(lastName), 0, errorsTripped, POSSIBLE_NAME_ERROR_COUNT,
                POSSIBLE_NAME_ERROR_COUNT);
        //(Maybe the below can be accomplished with patterns and regex?)
        //Then, check the zip code.
        errorsTripped[ZIP_CHECK_ERROR_INDEX] = zipChecker(zipCode);
        //Then, check the employee ID.
        errorsTripped[ID_CHECK_ERROR_INDEX] = idChecker(employeeID);
        return errorsTripped;
    }

    private static boolean[] nameChecker(String nameToCheck) {
        //If the length of either name is less than 2, say that it needs to be at least 2 characters long.
        var nameErrorsTripped = new boolean[POSSIBLE_NAME_ERROR_COUNT];
        if(nameToCheck.length() < MIN_NAME_LENGTH) {
            nameErrorsTripped[0] = true;
            //If the length of either name is 0, say that it needs to be filled in.
            if(nameToCheck.length() == 0) {
                nameErrorsTripped[1] = true;
            }
        }
        return nameErrorsTripped;
    }

    private static boolean zipChecker(String zipCodeToCheck) {
        //If the zipcode isn't 5 characters long and all numbers, say that it needs to be a 5-digit number.
        return !Pattern.matches("\\d{5}+", zipCodeToCheck);
    }

    private static boolean idChecker(String idToCheck) {
        //If the employee ID doesn't match the format AA-1234, say that it needs to be the format AA-1234.
        return !Pattern.matches("[\\p{IsAlphabetic}]{2}?-[\\d]{4}", idToCheck);
    }
}
