package modules;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

import algorithms.BucketSort;

public class BucketSortTest {
    
    @Test
    void testEmptyArray() {
        int[] array = {};
        BucketSort.sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    void testSingleElement() {
        int[] array = {5};
        BucketSort.sort(array);
        assertArrayEquals(new int[]{5}, array);
    }

    @Test
    void testSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        BucketSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        BucketSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testArrayWithDuplicates() {
        int[] array = {3, 1, 2, 3, 1};
        BucketSort.sort(array);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, array);
    }

    @Test
    void testLargeRandomArray() {
        int[] array = new int[1000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        
        BucketSort.sort(array);
        assertArrayEquals(expected, array);
    }
}
