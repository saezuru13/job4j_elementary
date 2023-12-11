package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to5() {
        int[] input = {12, 9, 6, 8, 10, 14};
        int source = 3;
        int destination = 5;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {12, 9, 6, 14, 10, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to4() {
        int[] input = {7, 5, 3, 8, 1, 2};
        int source = 2;
        int destination = 4;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {7, 5, 1, 8, 3, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to2() {
        int[] input = {1, 3, 7, 9};
        int source = 0;
        int destination = 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {7, 3, 1, 9};
        assertThat(result).containsExactly(expected);

    }
}