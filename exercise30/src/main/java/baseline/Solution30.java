package baseline;

public class Solution30 {
    private static final int MULTIPLICATION_TABLE_WIDTH = 12;
    private static final int MULTIPLICATION_TABLE_HEIGHT = 12;
    public static final int MULTIPLICATION_TABLE_SPACE_OF_LARGEST_INT = 2 +
            (int) (Math.log10(MULTIPLICATION_TABLE_HEIGHT * (double) MULTIPLICATION_TABLE_WIDTH));
    public static void main(String[] args) {
        //First, find the length of the largest number of the multiplication table, add two to that, and store it.
        //In the higher loop, execute the lower loop once, then add a line break.
        for(var j = 1; j <= MULTIPLICATION_TABLE_HEIGHT; j++) {
            for(var k = 1; k <= MULTIPLICATION_TABLE_WIDTH; k++) {
                //In the lower loop, print the result of
                //getMultiplicationTableEntry(higherLoopIteration, lowerLoopIteration).
                System.out.print(GetMultiplicationTableEntry.getMultiplicationTableEntry(j, k));
            }
            System.out.print("\n");
        }
    }
}
