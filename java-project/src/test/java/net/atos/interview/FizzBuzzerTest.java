package net.atos.interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzerTest {
    private final FizzBuzzer subject = new FizzBuzzer();

    @Test
    public void should_only_return_integers_if_no_multiple_of_3_nor_5() throws Exception {
        // GIVEN
        int to = 2;
        String[] expected = {"1", "2"};

        // WHEN
        String[] actual = subject.generateFizzBuzzes(to);

        // THEN
        assertThat(actual, is(expected));
    }

    @Test
    public void should_only_integers_fizzes_and_buzzes_if_multiple_of_3_and_5() throws Exception {
        // GIVEN
        int to = 6;
        String[] expected = {"1", "2", "fizz", "4", "buzz", "fizz"};

        // WHEN
        String[] actual = subject.generateFizzBuzzes(to);

        // THEN
        assertThat(actual, is(expected));
    }

    @Test
    public void should_return_fizz_buzzes_if_some_multiple_of_3_and_5() throws Exception {
        // GIVEN
        int to = 16;
        String[] expected = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz", "16"};

        // WHEN
        String[] actual = subject.generateFizzBuzzes(to);

        // THEN
        assertThat(actual, is(expected));
    }

    @Test
    public void should_work_for_all_cases() throws Exception {
        should_only_return_integers_if_no_multiple_of_3_nor_5();
        should_only_integers_fizzes_and_buzzes_if_multiple_of_3_and_5();
        should_return_fizz_buzzes_if_some_multiple_of_3_and_5();
    }
}