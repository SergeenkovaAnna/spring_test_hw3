package pro.sky.springtesthw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceParamsTest {

    private Service out = new Service();

    @BeforeEach
    public void startNew() {
        this.out = new Service();
    }

    public static Stream<Arguments> sumParamsForTests() {
        return Stream.of(
        Arguments.of(5,9, 14),
        Arguments.of(16,-216, -200),
        Arguments.of(0, 14, 14),
        Arguments.of(-5, -10, -15));
    }

    public static Stream<Arguments> subParamsForTests() {
        return Stream.of(
                Arguments.of(5,9, -4),
                Arguments.of(16,-216, 232),
                Arguments.of(0, 14, -14),
                Arguments.of(-5, -10, 5));
    }

    public static Stream<Arguments> multiParamsForTests() {
        return Stream.of(
                Arguments.of(5,9, 45),
                Arguments.of(16,-216, -3456),
                Arguments.of(0, 14, 0),
                Arguments.of(-5, -10, 50));
    }

    public static Stream<Arguments> devideParamsForTests() {
        return Stream.of(
                Arguments.of(9,5, 1),
                Arguments.of(216, 1, 216),
                Arguments.of(0, 14, 0),
                Arguments.of(-10, -5, 2));
    }

    @ParameterizedTest
    @MethodSource("sumParamsForTests")
    public void sumTest(int num1, int num2, int expected) {
        assertEquals(expected, out.calculateSum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("subParamsForTests")
    public void subtractTest(int num1, int num2, int expected) {
        assertEquals(expected, out.subtract(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiParamsForTests")
    public void multiTest(int num1, int num2, int expected) {
        assertEquals(expected, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("devideParamsForTests")
    public void devideTest(int num1, int num2, int expected) {
        assertEquals(expected, out.devide(num1, num2));
    }
}
