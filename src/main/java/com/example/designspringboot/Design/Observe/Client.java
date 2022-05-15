package com.example.designspringboot.Design.Observe;

public class Client {
    public static void main(String[] args) {
        //创建方
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(30,150,20);
    }
}
