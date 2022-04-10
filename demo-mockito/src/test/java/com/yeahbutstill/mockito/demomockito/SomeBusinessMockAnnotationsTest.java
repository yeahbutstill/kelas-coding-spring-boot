package com.yeahbutstill.mockito.demomockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    void testFindTheGreatestFromAllData24() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,3});
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        Assertions.assertEquals(24, theGreatestFromAllData);
    }

    @Test
    void testFindTheGreatestFromAllDataForOneValue() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        Assertions.assertEquals(15, theGreatestFromAllData);
    }

    @Test
    void testFindTheGreatestFromAllDataNoValue() {
        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        int theGreatestFromAllData = someBusiness.findTheGreatestFromAllData();
        Assertions.assertEquals(Integer.MIN_VALUE, theGreatestFromAllData);
    }

}