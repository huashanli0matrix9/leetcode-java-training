import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    @ParameterizedTest(name = "{0}")
    @MethodSource("searchCases")
    @DisplayName("returns the first matching index or -1")
    void searchReturnsExpectedIndex(String name, int[] nums, int target, int expected) {
        assertEquals(expected, Solution.search(nums, target));
    }

    static Stream<Arguments> searchCases() {
        return Stream.of(
                Arguments.of("typical hit", new int[]{4, 1, 7, 3}, 7, 2),
                Arguments.of("first duplicate", new int[]{4, 1, 7, 7}, 7, 2),
                Arguments.of("not found", new int[]{4, 1, 7, 3}, 9, -1),
                Arguments.of("empty array", new int[]{}, 7, -1),
                Arguments.of("first element", new int[]{7, 1, 2}, 7, 0),
                Arguments.of("last element", new int[]{1, 2, 7}, 7, 2),
                Arguments.of("negative value", new int[]{3, -7, 2}, -7, 1));
    }

    @Test
    @DisplayName("single non-matching element returns -1")
    void singleNonMatchingElementReturnsMinusOne() {
        assertEquals(-1, Solution.search(new int[]{4}, 7));
    }
}

