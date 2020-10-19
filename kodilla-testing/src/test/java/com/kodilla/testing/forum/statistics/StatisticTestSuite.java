package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticTestSuite {

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String theUser = "User" + n;
            resultList.add(theUser);
        }
        return resultList;
    }

    static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @Mock
    private Statistics statistickMock;

    @Test
    void testCalculateAdvStatisticsWhenPostsIs0() {
        //Given
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic(statistickMock);
        when(statistickMock.postsCount()).thenReturn(0);
        when(statistickMock.commentsCount()).thenReturn(0);
        when(statistickMock.usersNames()).thenReturn(generateListOfNUsers(1000));
        //When
        calculatingStatistic.calculateAdvStatistics(statistickMock);
        int numberUsers = calculatingStatistic.getNumberUsers();
        int numberPosts = calculatingStatistic.getNumberPosts();
        int numberComments = calculatingStatistic.getNumberComments();
        double averagePostsUser = calculatingStatistic.getAveragePostsUser();
        double averageCommentsUser = calculatingStatistic.getAverageCommentsUser();
        double averageCommentsPost = calculatingStatistic.getAverageCommentsPost();

        //Then
        assertEquals(1000, numberUsers);
        assertEquals(0, numberPosts);
        assertEquals(0, numberComments);
        assertEquals(0, averagePostsUser);
        assertEquals(0, averageCommentsUser);
        assertEquals(0, averageCommentsPost);
    }

    @Test
    void testAveragePostsUserWhenPostsIs1000() {
        //Given
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic(statistickMock);
        when(statistickMock.postsCount()).thenReturn(1000);
        when(statistickMock.commentsCount()).thenReturn(200);
        when(statistickMock.usersNames()).thenReturn(generateListOfNUsers(2000));
        //When
        calculatingStatistic.calculateAdvStatistics(statistickMock);
        int numberUsers = calculatingStatistic.getNumberUsers();
        int numberPosts = calculatingStatistic.getNumberPosts();
        int numberComments = calculatingStatistic.getNumberComments();
        double averagePostsUser = calculatingStatistic.getAveragePostsUser();
        double averageCommentsUser = calculatingStatistic.getAverageCommentsUser();
        double averageCommentsPost = calculatingStatistic.getAverageCommentsPost();

        //Then
        assertEquals(2000, numberUsers);
        assertEquals(1000, numberPosts);
        assertEquals(200, numberComments);
        assertEquals(0.5, averagePostsUser);
        assertEquals(0.1, averageCommentsUser);
        assertEquals(0.2, averageCommentsPost);
    }

    @Test
    void testAveragePostsUserWhenComentsIs0() {
        //Given
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic(statistickMock);
        when(statistickMock.postsCount()).thenReturn(4000);
        when(statistickMock.commentsCount()).thenReturn(0);
        when(statistickMock.usersNames()).thenReturn(generateListOfNUsers(2000));
        //When
        calculatingStatistic.calculateAdvStatistics(statistickMock);
        int numberUsers = calculatingStatistic.getNumberUsers();
        int numberPosts = calculatingStatistic.getNumberPosts();
        int numberComments = calculatingStatistic.getNumberComments();
        double averagePostsUser = calculatingStatistic.getAveragePostsUser();
        double averageCommentsUser = calculatingStatistic.getAverageCommentsUser();
        double averageCommentsPost = calculatingStatistic.getAverageCommentsPost();

        //Then
        assertEquals(2000, numberUsers);
        assertEquals(4000, numberPosts);
        assertEquals(0, numberComments);
        assertEquals(2, averagePostsUser);
        assertEquals(0, averageCommentsUser);
        assertEquals(0, averageCommentsPost);
    }

    @Test
    void testAveragePostsUserWhenComentsLessPosts() {
        //Given
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic(statistickMock);
        when(statistickMock.postsCount()).thenReturn(4000);
        when(statistickMock.commentsCount()).thenReturn(500);
        when(statistickMock.usersNames()).thenReturn(generateListOfNUsers(2000));
        //When
        calculatingStatistic.calculateAdvStatistics(statistickMock);
        int numberUsers = calculatingStatistic.getNumberUsers();
        int numberPosts = calculatingStatistic.getNumberPosts();
        int numberComments = calculatingStatistic.getNumberComments();
        double averagePostsUser = calculatingStatistic.getAveragePostsUser();
        double averageCommentsUser = calculatingStatistic.getAverageCommentsUser();
        double averageCommentsPost = calculatingStatistic.getAverageCommentsPost();

        //Then
        assertEquals(2000, numberUsers);
        assertEquals(4000, numberPosts);
        assertEquals(500, numberComments);
        assertEquals(2, averagePostsUser);
        assertEquals(0.25, averageCommentsUser);
        assertEquals(0.125, averageCommentsPost);
    }

    @Test
    void testAveragePostsUserWhenComentsMorePosts() {
        //Given
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic(statistickMock);
        when(statistickMock.postsCount()).thenReturn(400);
        when(statistickMock.commentsCount()).thenReturn(4000);
        when(statistickMock.usersNames()).thenReturn(generateListOfNUsers(2000));
        //When
        calculatingStatistic.calculateAdvStatistics(statistickMock);
        int numberUsers = calculatingStatistic.getNumberUsers();
        int numberPosts = calculatingStatistic.getNumberPosts();
        int numberComments = calculatingStatistic.getNumberComments();
        double averagePostsUser = calculatingStatistic.getAveragePostsUser();
        double averageCommentsUser = calculatingStatistic.getAverageCommentsUser();
        double averageCommentsPost = calculatingStatistic.getAverageCommentsPost();

        //Then
        assertEquals(2000, numberUsers);
        assertEquals(400, numberPosts);
        assertEquals(4000, numberComments);
        assertEquals(0.2, averagePostsUser);
        assertEquals(2, averageCommentsUser);
        assertEquals(10, averageCommentsPost);
    }

    @Test
    void testAveragePostsUserWhenUsersIs0() {
        //Given
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic(statistickMock);
        when(statistickMock.postsCount()).thenReturn(400);
        when(statistickMock.commentsCount()).thenReturn(4000);
        when(statistickMock.usersNames()).thenReturn(generateListOfNUsers(0));
        //When
        calculatingStatistic.calculateAdvStatistics(statistickMock);
        int numberUsers = calculatingStatistic.getNumberUsers();
        int numberPosts = calculatingStatistic.getNumberPosts();
        int numberComments = calculatingStatistic.getNumberComments();
        double averagePostsUser = calculatingStatistic.getAveragePostsUser();
        double averageCommentsUser = calculatingStatistic.getAverageCommentsUser();
        double averageCommentsPost = calculatingStatistic.getAverageCommentsPost();

        //Then
        assertEquals(0, numberUsers);
        assertEquals(400, numberPosts);
        assertEquals(4000, numberComments);
        assertEquals(0, averagePostsUser);
        assertEquals(0, averageCommentsUser);
        assertEquals(10, averageCommentsPost);
    }

    @Test
    void testAveragePostsUserWhenUsersIs100() {
        //Given
        CalculatingStatistic calculatingStatistic = new CalculatingStatistic(statistickMock);
        when(statistickMock.postsCount()).thenReturn(400);
        when(statistickMock.commentsCount()).thenReturn(400);
        when(statistickMock.usersNames()).thenReturn(generateListOfNUsers(100));
        //When
        calculatingStatistic.calculateAdvStatistics(statistickMock);
        int numberUsers = calculatingStatistic.getNumberUsers();
        int numberPosts = calculatingStatistic.getNumberPosts();
        int numberComments = calculatingStatistic.getNumberComments();
        double averagePostsUser = calculatingStatistic.getAveragePostsUser();
        double averageCommentsUser = calculatingStatistic.getAverageCommentsUser();
        double averageCommentsPost = calculatingStatistic.getAverageCommentsPost();

        //Then
        assertEquals(100, numberUsers);
        assertEquals(400, numberPosts);
        assertEquals(400, numberComments);
        assertEquals(4, averagePostsUser);
        assertEquals(4, averageCommentsUser);
        assertEquals(1, averageCommentsPost);
    }
}
