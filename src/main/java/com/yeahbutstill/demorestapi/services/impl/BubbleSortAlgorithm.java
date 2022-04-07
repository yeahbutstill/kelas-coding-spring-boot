package com.yeahbutstill.demorestapi.services.impl;

import com.yeahbutstill.demorestapi.services.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // high priority kalau tidak ada @Qualifier("nama")
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {

        // Logic for Bubble Sort
        return numbers;

    }

}
