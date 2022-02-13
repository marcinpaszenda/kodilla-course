package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection tests.")

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Start test");
    }

    @AfterEach
    public void after() {
        System.out.println("Finish test");
    }

    @DisplayName("Test how a class works when the list is empty.")

    @Test

    void testOddNumbersExterminatorEmptyList() {

        // Given
        List<Integer> emptyList = new ArrayList<>();
        // When
        List<Integer> testList = new ArrayList<>();
        testList.isEmpty();
        // Then
        Assertions.assertEquals(emptyList, testList);
        System.out.println("Test OK - list is empty.");

    }

    @DisplayName("Test how the class works when there are even and odd numbers in list.")

    @Test

    void testOddNumbersExterminatorNormalList() {

        // Given
        List<Integer> normalList = new ArrayList<>();
        normalList.add(11);
        normalList.add(22);
        normalList.add(45);
        normalList.add(76);
        normalList.add(81);
        normalList.add(96);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> resultNormalList = oddNumbersExterminator.exterminate(normalList);
        // When
        List<Integer> expectedResultList = new ArrayList<>();
        expectedResultList.add(22);
        expectedResultList.add(76);
        expectedResultList.add(96);
        // Then
        Assertions.assertEquals(resultNormalList,expectedResultList);

        System.out.println("Test is Okay");
    }



}
