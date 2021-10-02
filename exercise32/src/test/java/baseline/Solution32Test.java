package baseline;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    @Test
    void difficultyOneRandomNumGeneratorTest() {
        Solution32 solution = new Solution32();
        assertTrue(solution.difficultyOneRandomNumGenerator() <= 10 && solution.difficultyOneRandomNumGenerator() > 0);
    }

    @Test
    void difficultyTwoRandomNumGeneratorTest() {
        Solution32 solution = new Solution32();
        assertTrue(solution.difficultyTwoRandomNumGenerator() <= 100 && solution.difficultyTwoRandomNumGenerator() > 0);
    }

    @Test
    void difficultyThreeRandomNumGeneratorTest() {
        Solution32 solution = new Solution32();
        assertTrue(solution.difficultyThreeRandomNumGenerator() <= 1000 && solution.difficultyThreeRandomNumGenerator() > 0);
    }

}