package com.javaxpert.demos.fizzbuzz;

import java.util.function.Predicate;

public class FizzBuzzClassic {
    public String fizzbuzz(int value) {
        Predicate<Integer> dividableBy5 = integer -> integer % 5 == 0;
        Predicate<Integer> dividableBy3 = integer -> integer % 3 == 0;
        String result = "";

        if (dividableBy5.and(dividableBy3).test(value)) {
            result = "FizzBuzz";
        } else if (dividableBy5.test(value)) {
            result = "Fizz";
        }else if (dividableBy3.test(value)){
                result = "Buzz";
            }
          else {
              result=Integer.toString(value);
            }
        return result;
    }
}
