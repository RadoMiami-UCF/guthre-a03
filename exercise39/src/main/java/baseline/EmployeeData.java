package baseline;

import java.util.Calendar;

public class EmployeeData {
    //Used to hold the first name, last name, position, and separation date. (The first three are strings, the fourth
    //a Calendar.)
    private String firstName;
    private String lastName;
    private String position;
    private Calendar separationDate;

    public EmployeeData(String inFirstName, String inLastName, String inPosition, byte separationDay,
                        byte separationMonth, byte separationYear) {
        //Set the first name to inFirstName.
        //Then, set the last name to inLastName.
        //Then, set position to inPosition.
        //Finally, set separationDate to Calendar.Builder.setDate(separationYear, separationMonth, separationDay).
    }
}
