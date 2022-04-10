package com.yeahbutstill.mockito.demomockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeBusinessTest {

    @Test
    void testFindTheGreatestFromAllData24() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        Assertions.assertEquals(24, theGreatestFromAllData);
    }

    @Test
    void testFindTheGreatestFromAllData90() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub1());
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        Assertions.assertEquals(90, theGreatestFromAllData);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 6, 15};
    }

}

class DataServiceStub1 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{90};
    }

}