package com.kauassilva.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class OccurrencesOfATest {

    @DisplayName("should return the number of occurrences correctly for")
    @ParameterizedTest(name = "case {index} : expected {1}, for the text: {0}")
    @MethodSource("testDataForCalculateOccurrences")
    void testCalculateOccurrences(String text, int expected) {
        int occurrences = OccurrencesOfA.calculateOccurrences(text);

        assertEquals(expected, occurrences);
    }

    public static Stream<Arguments> testDataForCalculateOccurrences() {
        return Stream.of(
                arguments("O sol está lindo entre as nuvens.", 1),
                arguments("A risada dela é linda.", 5),
                arguments("Café, por favor.", 2),
                arguments("Sob o céu estrelado, conversamos até o amanhecer", 5),
                arguments("A antiga livraria tinha cheiro estranho e livros amarelados", 10),
                arguments("Pegue o copo!", 0)
        );
    }

}