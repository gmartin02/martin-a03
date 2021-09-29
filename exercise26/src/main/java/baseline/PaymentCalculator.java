package baseline;

import static java.lang.Math.log;

public class PaymentCalculator {
    Solution26 solution = new Solution26();

    public int calculateMonthsUntilPaidOff() {
        //gets the values passed from the Solution26 class
        float b = solution.getBalance();
        float p = solution.getAPR();
        float i = solution.getAPR();
        //uses the formula to get monthsRemaining
        float n = -(1.0/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i);
        //rounds monthsRemaining up and returns it
        return (int)Math.ceil(n);
    }
}
