package baseline;

final class GetMultiplicationTableEntry {
    private GetMultiplicationTableEntry() {}

    public static String getMultiplicationTableEntry(int x, int y) {
        //Find (iteration of the higher loop * iteration of lower loop).
        var multiplicationTableEntry = x * y;
        /*
        Then, convert it to a string and add (MULTIPLICATION_TABLE_SPACE_OF_LARGEST_INT - length of current number)
        spaces to the beginning.
        SonarLint, I have no idea what you did, but it didn't break anything, so it's fine, I guess.
         */
        String multiplicationTableEntrySpaces = " ".repeat(Math.max(0,
                (Solution30.MULTIPLICATION_TABLE_SPACE_OF_LARGEST_INT - (int) (Math.log10(multiplicationTableEntry)))));
        return multiplicationTableEntrySpaces + multiplicationTableEntry;
    }
}
