package baseline;

final class TargetHeartRate {
    private static final int MAX_HEART_RATE = 220;

    private TargetHeartRate() {}

    public static int calcHeartRate(int age, int restingHeartRate, double intensity) {
        //Return (((220 − age) − restingHR) × intensity) + restingHR.
        return 0;
    }
}
