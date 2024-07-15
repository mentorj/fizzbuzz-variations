package com.javaxpert.demos.fizzbuzz;

import io.vavr.API;

import java.util.function.Predicate;

import static io.vavr.API.*;

public class FizzBuzzPatternMatching implements FizzBuzz {
    Predicate<Integer> dividableBy5 = integer -> integer % 5 == 0;
    Predicate<Integer> dividableBy3 = integer -> integer % 3 == 0;

    public String fizzbuzz(int value){

        return API.Match(value).of(
                Case($((Integer x) -> (x%3==0 && x%5==0)),"FizzBuzz"),
                Case($((Integer x) -> (x.intValue() %5 ==0)),"Fizz"),
                Case($((Integer x)-> (x%3==0)),"Buzz"),
                Case($(),""+value)
        );
    }
}
