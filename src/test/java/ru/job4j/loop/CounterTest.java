package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void when0And5then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMinus3And0then15() {
        int start = -3;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = -6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when5And0then15() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}