package com.javaxpert.demos.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class FizzBuzzClassicTest {
    private FizzBuzz fizzbuzzClassic;
    private FizzBuzz fizzBuzzPM;
    private FizzBuzz fizzBuzzTruthTable;
    @BeforeEach
    void setUp(){
        fizzbuzzClassic = new FizzBuzzClassic();
        fizzBuzzPM = new FizzBuzzPatternMatching();
        fizzBuzzTruthTable = new FizzBuzzPatternMatchingTruthTable();
    }
    @Test
    void evenNumberSeenAsValue(){
        assertThat(fizzbuzzClassic.fizzbuzz(2)).isEqualTo("2");
        assertThat(fizzbuzzClassic.fizzbuzz(4)).isEqualTo("4");
        assertThat(fizzbuzzClassic.fizzbuzz(4)).doesNotContain("Fizz");
        assertThat(fizzbuzzClassic.fizzbuzz(4)).doesNotContain("Buzz");

        assertThat(fizzBuzzPM.fizzbuzz(2)).isEqualTo("2");
        assertThat(fizzBuzzPM.fizzbuzz(4)).isEqualTo("4");
        assertThat(fizzBuzzPM.fizzbuzz(4)).doesNotContain("Fizz");
        assertThat(fizzBuzzPM.fizzbuzz(4)).doesNotContain("Buzz");

        assertThat(fizzBuzzTruthTable.fizzbuzz(2)).isEqualTo("2");
        assertThat(fizzBuzzTruthTable.fizzbuzz(4)).isEqualTo("4");
        assertThat(fizzBuzzTruthTable.fizzbuzz(4)).doesNotContain("Fizz");
        assertThat(fizzBuzzTruthTable.fizzbuzz(4)).doesNotContain("Buzz");
    }

    @Test
    void fifteenSeenAsFizzBuzz(){
        assertThat(fizzbuzzClassic.fizzbuzz(5)).isEqualTo("Fizz");
        assertThat(fizzBuzzPM.fizzbuzz(5)).isEqualTo("Fizz");
        assertThat(fizzBuzzTruthTable.fizzbuzz(5)).isEqualTo("Fizz");
    }

    @Test
    void threeSeenAsBuzz(){
        assertThat(fizzbuzzClassic.fizzbuzz(3)).isEqualTo("Buzz");
        assertThat(fizzBuzzPM.fizzbuzz(3)).isEqualTo("Buzz");
        assertThat(fizzBuzzTruthTable.fizzbuzz(3)).isEqualTo("Buzz");
    }

    @Test
    void sevenSeenasValueString(){
        assertThat(fizzbuzzClassic.fizzbuzz(7)).isEqualTo("7");
        assertThat(fizzBuzzPM.fizzbuzz(7)).isEqualTo("7");
        assertThat(fizzBuzzTruthTable.fizzbuzz(7)).isEqualTo("7");
    }

}
