package com.yeahbutstill.mockito.demomockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

class ListTest {

    @Test
    void testSize() {

        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(10);
        Assertions.assertEquals(10, listMock.size());

    }

    @Test
    void testSizeMultipleReturn() {

        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.size()).thenReturn(10).thenReturn(20);
        Assertions.assertEquals(10, listMock.size());
        Assertions.assertEquals(20, listMock.size());

    }

    @Test
    void testGetSpecificParameter() {

        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(0)).thenReturn("SomeString");
        Assertions.assertEquals("SomeString", listMock.get(0));
        Assertions.assertEquals(null, listMock.get(1));

    }

    @Test
    void testGetGenericParameter() {

        List listMock = Mockito.mock(List.class);
        Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
        Assertions.assertEquals("SomeString", listMock.get(0));
        Assertions.assertEquals("SomeString", listMock.get(1));

    }

}
