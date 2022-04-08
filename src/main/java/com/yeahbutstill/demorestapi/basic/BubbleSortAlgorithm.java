package com.yeahbutstill.demorestapi.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Primary // high priority kalau tidak ada @Qualifier("nama")
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {

        // Logic for Bubble Sort
        return numbers;

    }

}
