/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

public class Solution40 {
    /*
    You might notice how similar the code is to Solution40. This is because it's a direct copy and paste, since the
    base is almost exactly the same as 39, and instead of reinventing the wheel, I thought I might want to save
    myself the headache.
     */
    private static final int SPACES_TO_ADD_TO_NAME = 2;
    private static final int MINIMUM_NAME_LENGTH = 5;
    private static final int MINIMUM_POSITION_LENGTH = 9;
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final Map<Integer, EmployeeData> JOHN_JOHNSON_MAP = Map.of(0, new EmployeeData(
            "John", "Johnson", "Manager", 31, Calendar.DECEMBER,
            2016));
    private static final Map<Integer, EmployeeData> TOU_XIONG_MAP = Map.of(0, new EmployeeData(
            "Tou", "Xiong", "Software Engineer", 5, Calendar.OCTOBER,
            2016));
    private static final Map<Integer, EmployeeData> MICHAELA_MICHAELSON_MAP = Map.of(0, new EmployeeData(
            "Michaela", "Michealson", "District Manager", 19, Calendar.DECEMBER,
            2015));
    private static final Map<Integer, EmployeeData> JAKE_JACOBSON_MAP = Map.of(0, new EmployeeData(
            "Jake", "Jacobson", "Programmer"));
    private static final Map<Integer, EmployeeData> JACQUELYN_JACKSON_MAP = Map.of(0, new EmployeeData(
            "Jacquelyn", "Jackson", "DBA"));
    private static final Map<Integer, EmployeeData> SALLY_WEBBER_MAP = Map.of(0, new EmployeeData(
            "Sally", "Webber", "Web Developer", 18, Calendar.DECEMBER,
            2015));

    public static void main(String[] args) {
        //First, create a list that the maps will be stored in.
        //Then, create a series of maps that has the last name as the key, and an instance of EmployeeData as the value.
        //The above was done in the form of final class variables.
        //Then, store the maps in the list.
        ArrayList<Map<Integer, EmployeeData>> mapList = new ArrayList<>(Arrays.asList(JOHN_JOHNSON_MAP, TOU_XIONG_MAP,
                MICHAELA_MICHAELSON_MAP, JAKE_JACOBSON_MAP, JACQUELYN_JACKSON_MAP, SALLY_WEBBER_MAP));
        //Then, sort the list based on each map's data. See EmployeeData.compareTo for more details.
        mapList.sort(new EmployeeDataComparator());
        //Then, ask for and store a string to filter with.
        System.out.print("Enter a search string: ");
        var searchString = in.nextLine();
        //Then, use trimUnneededEntries to remove the entries that don't match up with searchString.
        trimUnneededEntries(mapList, searchString);
        //Then, trim the arrayList to make sure that it's only large enough to store its list of maps.
        mapList.trimToSize();
        //Then, find the length of the longest name in the list and the length of the longest position for formatting.
        var lengthOfLongestName = 0;
        var lengthOfLongestPosition = 0;

        for(Map<Integer, EmployeeData> integerEmployeeDataMap : mapList) {
            if(integerEmployeeDataMap.get(0).getFirstName().length() +
                    integerEmployeeDataMap.get(0).getLastName().length() +
                    SPACES_TO_ADD_TO_NAME > lengthOfLongestName) {
                lengthOfLongestName = integerEmployeeDataMap.get(0).getFirstName().length() +
                        integerEmployeeDataMap.get(0).getLastName().length() + SPACES_TO_ADD_TO_NAME;
            }

            if(integerEmployeeDataMap.get(0).getPosition().length() + 1 > lengthOfLongestPosition) {
                lengthOfLongestPosition = integerEmployeeDataMap.get(0).getPosition().length() + 1;
            }
        }

        if(lengthOfLongestName < MINIMUM_NAME_LENGTH) {
            lengthOfLongestName = MINIMUM_NAME_LENGTH;
        }

        if(lengthOfLongestPosition < MINIMUM_POSITION_LENGTH) {
            lengthOfLongestPosition = MINIMUM_POSITION_LENGTH;
        }
        //Finally, build and return the chart.
        System.out.print(buildChart(mapList, lengthOfLongestName, lengthOfLongestPosition));
    }

    private static String buildChart(ArrayList<Map<Integer, EmployeeData>> mapArrayList, int lengthOfLongestName,
                                     int lengthOfLongestPosition) {
        //First, create a string builder with "\nResults\n\n": in it.
        var chartBuilder = new StringBuilder("\nResults:\n\n");
        //Then, create the header, adding the correct amount of spaces for the name and position columns.
        chartBuilder.append("Name").append(" ".repeat(lengthOfLongestName - (MINIMUM_NAME_LENGTH - 1)))
                .append("| Position").append(" ".repeat(lengthOfLongestPosition - (MINIMUM_POSITION_LENGTH - 1)))
                .append("| Separation Date\n");
        //Then, create the correct amount of hyphens, punctuated by vertical lines.
        chartBuilder.append("-".repeat(lengthOfLongestName)).append("|").append("-".repeat(lengthOfLongestPosition + 1))
                .append("|").append("----------------");
        for(Map<Integer, EmployeeData> integerEmployeeDataMap : mapArrayList) {
            chartBuilder.append("\n").append(integerEmployeeDataMap.get(0)
                    .toStringForChart(lengthOfLongestName, lengthOfLongestPosition));
        }
        return chartBuilder.toString();
    }

    private static void trimUnneededEntries(Collection<Map<Integer, EmployeeData>> mapArrayList,
                                            String regexToMatchAgainst) {
        /*
        Go through every map in the list. If the searchString isn't found anywhere in either name, then delete the map
        from the list.
         */
    }
}
