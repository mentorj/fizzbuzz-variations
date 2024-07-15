package com.javaxpert.demos.fizzbuzz;
import io.vavr.API;
import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.function.Predicate;

import static io.vavr.API.*;
import static io.vavr.Patterns.$Tuple2;

public class FizzBuzzPatternMatchingTruthTable implements FizzBuzz{
    Predicate<Integer> dividableBy5 = integer -> integer % 5 == 0;
    Predicate<Integer> dividableBy3 = integer -> integer % 3 == 0;
    @Override
    public String fizzbuzz(int value) {
        Tuple2<Boolean,Boolean> dividableTuple = Tuple.of(dividableBy5.test(value),dividableBy3.test(value));
        return Match(dividableTuple).of(
                Case($Tuple2($(Boolean.TRUE),$(Boolean.TRUE)),"FizzBuzz"),
                Case($Tuple2($(Boolean.TRUE),$(Boolean.FALSE)),"Fizz"),
                Case($Tuple2($(Boolean.FALSE),$(Boolean.TRUE)),"Buzz"),
                Case($(),""+value)
        );
    }
}
