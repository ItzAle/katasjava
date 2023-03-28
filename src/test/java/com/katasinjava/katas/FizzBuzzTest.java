package com.katasinjava.katas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void fizzBuzzReturnsFizzIfNumIsDivisibleBy3() {
        // Give
        var fizzbuzz = new FizzBuzz();
        //When
        var sut = fizzbuzz.FizzBuzz(9);
        //Then
        assertEquals("Fizz", sut);
    }    @Test
    void fizzBuzzReturnsFizzIfNumIsDivisibleBy5() {
        // Give
        var fizzbuzz = new FizzBuzz();
        //When
        var sut = fizzbuzz.FizzBuzz(5);
        //Then
        assertEquals("Buzz", sut);
    }
}