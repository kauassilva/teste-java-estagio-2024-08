package com.kauassilva.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FibonacciSequenceTest {

    @DisplayName("should return if contains or not correctly for")
    @ParameterizedTest(name = "case {index} : number {0}, expected {1}")
    @MethodSource("testDataForContains")
    void testContains(int number, boolean expected) {
        boolean actual = FibonacciSequence.contains(number);

        assertEquals(expected, actual);
    }

    public static Stream<Arguments> testDataForContains() {
        return Stream.of(
                arguments(0, true),
                arguments(1, true),
                arguments(4, false),
                arguments(50, false),
                arguments(89, true),
                arguments(2584, true)
        );
    }

}