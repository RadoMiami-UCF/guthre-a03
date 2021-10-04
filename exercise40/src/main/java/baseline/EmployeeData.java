/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.Calendar;
import java.util.Objects;

import static java.util.Calendar.*;

public final class EmployeeData implements Comparable<EmployeeData> {
    //Used to hold the first name, last name, position, and separation date. (The first three are strings, the fourth
    //a Calendar.)
    //No companies have any living employee whose separation date would be January, 1st, 1, so it should be a good
    //indicator for no date being entered.
    private static final int SINGLE_DIGIT_NUMBER_THRESHOLD = 10;
    private static final Calendar.Builder emptyCalendarBuilder = (new Calendar.Builder()).setDate(0, 1,
            1);
    private String firstName;
    private String lastName;
    private String position;
    private final Calendar separationDate;

    public EmployeeData(String inFirstName, String inLastName, String inPosition, int separationDay,
                        int separationMonth, int separationYear) {
        //Call the function setCrucialVariables to set the first name, last name, and position.
        setCrucialVariables(inFirstName, inLastName, inPosition);
        //Finally, set separationDate to set(separationYear, separationMonth, separationDay).
        this.separationDate = (new Calendar.Builder()).setDate(separationYear, separationMonth, separationDay).build();
    }

    public EmployeeData(String inFirstName, String inLastName, String inPosition) {
        //Call the function setCrucialVariables to set the first name, last name, and position.
        setCrucialVariables(inFirstName, inLastName, inPosition);
        //Finally, set separationDate to a value of January, 1st, 0.
        this.separationDate = emptyCalendarBuilder.build();
    }

    public String toStringForChart(int nameLengthToOutput, int positionLengthToOutput) {
        //Build, then return a string that makes up one row of the chart.
        //First, make a stringBuilder that has the name.
        var chartStringBuilder = new StringBuilder(firstName + " " + lastName);
        //Then, add the proper amount of spaces and the first |.
        chartStringBuilder.append(" ".repeat(nameLengthToOutput - (firstName.length() + lastName.length() + 1)))
                .append("|");
        //Then, append the position, appending that with the proper amount of spaces and the second |.
        chartStringBuilder.append(" ").append(position).append(" ".repeat(positionLengthToOutput - position.length()))
                .append("|");
        //Finally, if there is a date, append the date in the form YYYY-MM-DD.
        if(!separationDate.equals(emptyCalendarBuilder.build())) {
            chartStringBuilder.append(" ").append(separationDate.get(YEAR)).append("-");
            //If the month is single digit, add a 0 before it.
            //Note: January is stored as month 0, while December is stored as month 11.
            if(separationDate.get(MONTH) + 1 < SINGLE_DIGIT_NUMBER_THRESHOLD) {
                chartStringBuilder.append("0");
            }
            chartStringBuilder.append(separationDate.get(MONTH) + 1).append("-");
            //If the day is single digit, add a 0 before it.
            if(separationDate.get(DAY_OF_MONTH) < SINGLE_DIGIT_NUMBER_THRESHOLD) {
                chartStringBuilder.append("0");
            }
            chartStringBuilder.append(separationDate.get(DAY_OF_MONTH));
        }
        return chartStringBuilder.toString();
    }

    private void setCrucialVariables(String inFirstName, String inLastName, String inPosition) {
        //Set the first name to inFirstName.
        this.firstName = inFirstName;
        //Then, set the last name to inLastName.
        this.lastName = inLastName;
        //Then, set position to inPosition.
        this.position = inPosition;
    }

    //Get functions.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int compareTo(EmployeeData otherEmployeeData) {
        int valueToReturn;
        //If the last name of this employeeData and the one we're comparing to is different,
        if(!this.lastName.equals(otherEmployeeData.lastName)) {
            //return this employeeData's last name compared to the other's.
            valueToReturn = this.lastName.compareTo(otherEmployeeData.lastName);
            //If they're equal, repeat the paradigm with the first name, position, and finally just return this
            //EmployeeData's separation date with the others'.
        } else if (this.firstName.equals(otherEmployeeData.firstName)) {
            valueToReturn = this.firstName.compareTo(otherEmployeeData.firstName);
        } else if(this.position.equals(otherEmployeeData.position)) {
            valueToReturn = this.position.compareTo(otherEmployeeData.position);
        } else {
            valueToReturn = this.separationDate.compareTo(otherEmployeeData.separationDate);
        }
        return valueToReturn;
    }

    @Override
    public boolean equals(Object obj) {
        //Very basic equals() implementation, as it isn't used. If the other object is an EmployeeData and is the same
        //as this one, return true. Otherwise, return false.
        if(obj instanceof EmployeeData employeeDataObj) {
            return compareTo(employeeDataObj) == 0;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        //Very basic hashCode() implementation, as it isn't used. Simply return the hash of the first name, last name,
        //position, and separationDate.
        return Objects.hash(this.firstName, this.lastName, this.position, this.separationDate);
    }
}
