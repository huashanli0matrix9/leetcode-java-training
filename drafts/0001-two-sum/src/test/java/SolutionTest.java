import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    @Disabled("Enable after implementing Two Sum")
    void findsTwoIndicesWhoseValuesAddToTarget() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}

