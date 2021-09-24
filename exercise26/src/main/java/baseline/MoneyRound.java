package baseline;

final class MoneyRound {

    private static final double TEN = 10;
    private MoneyRound() {}

    //Rounding function necessary to round things to the nearest cent.
    public static double roundToXPlaces(double inDouble, double precision) {

        //First, convert the precision you want to round to into a power of ten.
        double powerOfTen = Math.pow(TEN, precision);
        //Then, multiply the value to round by that power of ten.
        var doubleToProcess = inDouble * powerOfTen;
        //Then, round the multiplied value to the nearest larger integer.
        doubleToProcess = Math.ceil(doubleToProcess);
        //Finally, divide the multiplied and rounded value by the earlier power of ten and return it.
        return doubleToProcess / powerOfTen;
    }
}
