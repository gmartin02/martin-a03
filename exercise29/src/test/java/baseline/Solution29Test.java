/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    //only the function with calculations was subjected to testing as
    //it is unclear how to assertThrows an exception when that exception
    //is caused by user input.
    @ParameterizedTest
    @ValueSource(doubles = {1, 2, 3, 4})
    void ruleOf72CalculatorTest(double rateOfReturn) {
        Solution29 solution = new Solution29();
        assertEquals(72/rateOfReturn, solution.ruleOf72Calculator(rateOfReturn));
    }
}