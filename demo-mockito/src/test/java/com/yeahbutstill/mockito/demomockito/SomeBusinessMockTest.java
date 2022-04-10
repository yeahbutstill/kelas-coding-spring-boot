package com.yeahbutstill.mockito.demomockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SomeBusinessMockTest {

    @Test
    void testFindTheGreatestFromAllData24() {
        DataService dataServiceMock = Mockito.mock(DataService.class);

//        dataServiceMock.retrieveAllData() => new int[]{24,15,3}
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 15, 3});

        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        Assertions.assertEquals(24, theGreatestFromAllData);
    }

    @Test
    void testFindTheGreatestFromAllDataForOneValue() {
        DataService dataServiceMock = Mockito.mock(DataService.class);
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        Assertions.assertEquals(15, theGreatestFromAllData);
    }

}