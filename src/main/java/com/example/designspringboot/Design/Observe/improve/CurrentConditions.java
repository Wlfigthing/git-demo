package com.example.designspringboot.Design.Observe.improve;

public class CurrentConditions implements Observe {
    private float temperature;
    private float pressure;
    private float humidity;


    public void display(){
        System.out.println("***Today mTemperature: "+ temperature+"***");
        System.out.println("***Today mPressure: "+ pressure+"***");
        System.out.println("***Today mHumidity: "+ humidity+"***");
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {

    }
}
