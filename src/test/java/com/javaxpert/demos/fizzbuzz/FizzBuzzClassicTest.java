package com.javaxpert.demos.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class FizzBuzzClassicTest {
    private FizzBuzzClassic fizzbuzz;
    @BeforeEach
    void setUp(){
        fizzbuzz = new FizzBuzzClassic();
    }
    @Test
    void evenNumberSeenAsValue(){
        assertThat(fizzbuzz.fizzbuzz(2)).isEqualTo("2");
        assertThat(fizzbuzz.fizzbuzz(4)).isEqualTo("4");
        assertThat(fizzbuzz.fizzbuzz(4)).doesNotContain("Fizz");
        assertThat(fizzbuzz.fizzbuzz(4)).doesNotContain("Buzz");
    }

    @Test
    void fifteenSeenAsFizzBuzz(){
        assertThat(fizzbuzz.fizzbuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void fiveSeenAsFizz(){
        assertThat(fizzbuzz.fizzbuzz(5)).isEqualTo("Fizz");
    }

    @Test
    void threeSeenAsBuzz(){
        assertThat(fizzbuzz.fizzbuzz(3)).isEqualTo("Buzz");
    }

    @Test
    void sevenSeenasValueString(){
        assertThat(fizzbuzz.fizzbuzz(7)).isEqualTo("7");
    }

}
