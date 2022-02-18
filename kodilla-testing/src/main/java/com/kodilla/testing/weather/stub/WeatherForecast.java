package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        Map<String,Double> averageMap = new HashMap<>();
        double sum = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }

        double average = sum / temperatures.getTemperatures().size();
        return average;
    }

    public double calculateMedian() {
        List<Double> value = new ArrayList<>();
        double median = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            value.add(temperature.getValue());
        }

        Collections.sort(value);
        int valueSize = value.size();

        if (valueSize % 2 == 0) {
            int i = valueSize / 2;
            int j = (valueSize / 2) - 1;
            double iValueSize = value.get(i);
            double jValueSize = value.get(j);
            median = (iValueSize + jValueSize) / 2;
        } else {
            int k = value.size() / 2;
            median = value.get(k);
        }
        return median;
    }
}
