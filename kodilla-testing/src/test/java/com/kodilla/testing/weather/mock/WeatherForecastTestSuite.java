package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Weather Forecast Test Suite")

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test suite: end");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @Nested
    @DisplayName("Calculate Forecast Testing")
    class CalculateForecastTest {

        @Mock
        private Temperatures temperaturesMock;

        @Test
        void testCalculateForecastWithMock() {
            //Given
            //Temperatures temperaturesMock = mock(Temperatures.class);
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszów", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();
            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }
    }

    @Nested
    @DisplayName("Average calculation test")
    class CalculateAverageTest {

        @Mock
        private Temperatures temperaturesMock;

        @Test
        void testCalculateAverageWithMock() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszów", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When
            double result = weatherForecast.calculateAverage();
            double expectedResult = 25.56;
            //Then
            Assertions.assertEquals(expectedResult, result);
        }
    }

    @Nested
    @DisplayName("Median calculation test")
    class calculateMedianTest {

        @Mock
        private Temperatures temperaturesMock;

        @Test
        void testCalculateMedianWithMock() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszów", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
            //When
            double result = weatherForecast.calculateMedian();
            double expectedResult = 25.5;
            //Then
            Assertions.assertEquals(expectedResult, result);
        }
    }



}
