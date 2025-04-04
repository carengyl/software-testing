package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        int bucketCount = (max - min) / array.length + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : array) {
            int bucketIndex = (num - min) / array.length;
            buckets.get(bucketIndex).add(num);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                array[index++] = num;
            }
        }
    }
}