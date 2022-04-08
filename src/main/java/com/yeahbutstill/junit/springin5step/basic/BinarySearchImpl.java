package com.yeahbutstill.junit.springin5step.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // by default is singleton
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
//    @Qualifier("quick")
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        // Return the result
        return 10;

    }

    @PostConstruct
    public void postConstruct() {

        LOGGER.info("postConstruct");

    }

    @PreDestroy
    public void preDestroy() {

        LOGGER.info("preDestroy");

    }

}
