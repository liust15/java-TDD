package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FizzBuzzGameTest {
  FizzBuzzGame game = new FizzBuzzGame();
    @Test
    public void should_return_Fizz_when_have_3() {
        assertEquals("Fizz", game.translate(3));
    }

    @Test
    public void should_return_Buzz_when_have_5() {
        assertEquals("Buzz", game.translate(5));
    }

    @Test
    public void should_return_Whizz_when_have_7() {
        assertEquals("Whizz", game.translate(7));
    }

    @Test
    public void should_return_Fizz_when_number_is_multiple_of_3() throws Exception {
        assertEquals("Fizz", game.translate(6));
    }

    @Test
    public void should_return_Buzz_when_number_is_multiple_of_5() throws Exception {
        assertEquals("Buzz", game.translate(10));
    }

    @Test
    public void should_return_Whizz_when_number_is_multiple_of_7() throws Exception {
        assertEquals("Whizz", game.translate(14));
    }

    @Test
    public void should_return_FizzBuzz_when_number_is_multiple_of_3_and_5() throws Exception {
        assertEquals("FizzBuzz", game.translate(15));
    }

    @Test
    public void should_return_FizzWhizz_when_number_is_multiple_of_3_and_7() throws Exception {
        assertEquals("FizzWhizz", game.translate(21));
    }

    @Test
    public void should_return_BuzzWhizz_when_number_is_multiple_of_5_and_7() throws Exception {
        assertEquals("Fizz", game.translate(35));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_number_is_multiple_of_3_and_5_and_7() throws Exception {
        assertEquals("FizzBuzzWhizz", game.translate(105));
    }

    @Test
    public void should_return_Fizz_when_number_contains_3() throws Exception {
        assertEquals("Fizz", game.translate(13));
    }

    @Test
    public void should_return_original_number_when_number_does_not_match_any_rules() throws Exception {
        assertEquals("2", game.translate(2));
    }
}
