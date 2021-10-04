/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

public class EmployeeDataComparator implements Comparator<Map<Integer, EmployeeData>>, Serializable {
    //Not declaring serialVersionUID because I'm simply not skilled enough in Java to know what it does.
    //Furthermore, there are two conflicting rules about that.

    public int compare(Map<Integer, EmployeeData> firstMap, Map<Integer, EmployeeData> secondMap) {
        //To compare the two maps, use compareTo with the two maps' EmployeeData values.
        var firstEmployeeData = firstMap.get(0);
        var secondEmployeeData = secondMap.get(0);
        return firstEmployeeData.compareTo(secondEmployeeData);
    }
}
