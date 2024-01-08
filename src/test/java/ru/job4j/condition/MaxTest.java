package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To3Then3() {
        int left = 2;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3And3And3Then10() {
        int left = 3;
        int right = 3;
        int midle = 10;
        int result = Max.max(left, right, midle);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3And6And0Then6() {
        int left = 3;
        int right = 6;
        int midle = 0;
        int result = Max.max(left, right, midle);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

}