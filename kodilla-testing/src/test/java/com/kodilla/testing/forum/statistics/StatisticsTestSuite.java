package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@DisplayName("Statistics Test Suite")
@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private static int testCounter = 0;
    private StatisticsCounter statisticsCounter;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("The beginning of statistic tests.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("The end of statistic tests.");
    }

    @BeforeEach
    public void testNumbers() {
        testCounter++;
        System.out.println("Test number: " + testCounter);
    }

    private List<String> generateListOfNUsers(int users) {
        List<String> userList = new ArrayList<>();
        for(int i = 0; i < users; i++) {
            userList.add("User" + i);
        }
        return userList;
    }

    @Mock
    private Statistics statistics;

    @Test
    void test0Post() {
        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statistics);
        when(statistics.postsCount()).thenReturn(0);
        // When
        int result = statisticsCounter.getPostsQuantity();
        // Then
        Assertions.assertEquals(0, result);
    }

    @Test
    void test1000Posts() {
        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statistics);
        when(statistics.postsCount()).thenReturn(1000);
        // When
        int result = statisticsCounter.getPostsQuantity();
        // Then
        Assertions.assertEquals(1000, result);
    }

    @Test
    void test0Comments() {
        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statistics);
        when(statistics.commentsCount()).thenReturn(0);
        // When
        int result = statisticsCounter.getCommentsQuantity();
        // Then
        Assertions.assertEquals(0, result);
    }

    @Test
    void testSumCommentsLessThanSumPosts() {
        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statistics);
        when(statistics.commentsCount()).thenReturn(50);
        when(statistics.postsCount()).thenReturn(100);
        // When
        double result = statisticsCounter.getAverageCommentsPerPost();
        // Then
        Assertions.assertEquals(0.5, result);
    }

    @Test
    void testSumCommentsMoreThanSumPosts() {
        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statistics);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.postsCount()).thenReturn(50);
        // When
        double result = statisticsCounter.getAverageCommentsPerPost();
        // Then
        Assertions.assertEquals(2, result);
    }

    @Test
    void test0Users() {
        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statistics);
        when(statistics.usersNames()).thenReturn(generateListOfNUsers(0));
        // When
        List<String> resulList = statisticsCounter.getUsers();
        List<String> expectedList = new ArrayList<>();
        // Then
        Assertions.assertEquals(expectedList, resulList);
    }

    @Test
    void test100Users() {
        // Given
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        statisticsCounter.calculateAdvStatistics(statistics);
        when(statistics.usersNames()).thenReturn(generateListOfNUsers(100));
        // When
        int result = statisticsCounter.getUsersQuantity();
        // Then
        Assertions.assertEquals(100, result);
    }
}
