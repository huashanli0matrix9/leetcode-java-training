import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findsTwoIndicesWhoseValuesAddToTarget() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, Solution.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{3, 3}, 6));
        assertArrayEquals(new int[0], Solution.twoSum(new int[]{1}, 3));
        assertArrayEquals(new int[0], Solution.twoSum(new int[0], 3));
        assertArrayEquals(new int[0], Solution.twoSum(new int[]{1, 2, 3}, 8));
        assertArrayEquals(new int[]{0, 3}, Solution.twoSum(new int[]{-1, -2, 0, 4, 5}, 3));
    }
}

