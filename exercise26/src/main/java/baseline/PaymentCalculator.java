package baseline;

import static java.lang.Math.log;

public class PaymentCalculator {

    public int calculateMonthsUntilPaidOff(float balance, float APR, float monthlyPayment) {
        //gets the values passed from the Solution26 class
        //uses the formula to get monthsRemaining
        double monthsRemaining = -(1.00/30) * log(1 + balance/monthlyPayment * Math.pow((1 - (1 + APR)), 30) / log(1 + APR));
        //rounds monthsRemaining up and returns it
        return (int)Math.ceil(monthsRemaining);
    }
}
