package baseline;

class PaymentCalculator {
    private static final double DAYS_PER_MONTH = 30;
    private static final int DAYS_PER_YEAR = 365;
    private static final double MIN_PAYMENT_AMOUNT = 0.01;
    private static final double APR_COMPARISON_EPSILON = 0.0000001;
    private final double apr;
    private final double balance;
    private final double monthlyPayment;

    PaymentCalculator(double aprIn, double balanceIn, double monthlyPaymentIn) {
        var potentialErrorAverted = false;
        //Using these if-else statements to prevent possible weirdness if the user is silly.
        if(balanceIn > 0) {
            balance = balanceIn;
        } else {
            System.out.println("Why are you using this calculator if you've already paid off the card?");
            balance = 0;
            potentialErrorAverted = true;
        }

        if(aprIn >= 0) {
            apr = aprIn;
        } else {
            System.out.println("It doesn't make sense to have a negative APR, defaulting to an APR of 0.");
            apr = 0;
            potentialErrorAverted = true;
        }

        if(monthlyPaymentIn >= MIN_PAYMENT_AMOUNT) {
            monthlyPayment = monthlyPaymentIn;
        } else {
            System.out.println("You have to make some monthly payment, defaulting to $" + MIN_PAYMENT_AMOUNT
                    + " per month.");
            monthlyPayment = MIN_PAYMENT_AMOUNT;
            potentialErrorAverted = true;
        }

        /*
        Newline here for better formatting if a block of Silly Value Weirdness Prevention(TM) code was tripped.
        You may call it over-engineering, I call it optimizing the user experience.
         */

        if(potentialErrorAverted) {
            System.out.print("\n");
        }
    }

    public int calculateMonthsUntilPaidOff() {
        var dailyRate = apr/DAYS_PER_YEAR;
        if(apr > APR_COMPARISON_EPSILON) {
            /*
            Using apr > APR_COMPARISON_EPSILON instead of the longer version because APR will always be compared to
            zero and will always be positive.
             */
            return (int) Math.ceil(-(1/DAYS_PER_MONTH) * Math.log(1 + balance/monthlyPayment
                    * (1 - Math.pow((1 + dailyRate), DAYS_PER_MONTH))) / Math.log(1 + dailyRate));
        } else {
            /*
            Using a 0 APR card with the above function causes it to always say the card will be paid off in 0 months.
            Using the below function both actually works and is less computationally wasteful.
             */
            return (int) Math.ceil(balance / monthlyPayment);
        }
    }
}
