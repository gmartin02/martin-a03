package baseline;

import static java.lang.Math.log;

public class PaymentCalculator {
    private final float b;
    private final float p;
    private final float i;

    public PaymentCalculator(float b, float p, float i) {
        this.b = b;
        this.p = p;
        this.i = i;

    }
    public int calculateMonthsUntilPaidOff() {
        //gets the values passed from the Solution26 class

        //uses the formula to get monthsRemaining
        double n = -(1.0/30) * log(1 + b/p * (1 - Math.pow((1 + i), 30))) / log(1 + i);
        //rounds monthsRemaining up and returns it
        return (int)Math.ceil(n);
    }
}
