package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double resultAverage = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            Double tempAverage = temperature.getValue();
            resultAverage += tempAverage;
        }
        double result = resultAverage/temperatures.getTemperatures().size();
        return result;
    }

    public double medianaTemperature() {
        ArrayList<Double> TempList=new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            Double tempValue = temperature.getValue();
            TempList.add(tempValue);
        }
        Collections.sort(TempList);
        double mediana;
        if (TempList.size() % 2 == 0) {
            mediana = (TempList.get(TempList.size() / 2) + TempList.get(TempList.size() / 2 - 1)) / 2;
        } else {
            mediana = TempList.get(TempList.size() / 2);
        }
        return mediana;
    }
}
