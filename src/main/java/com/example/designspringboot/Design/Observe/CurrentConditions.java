package com.example.designspringboot.Design.Observe;

public class CurrentConditions {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
    }
    public void display(){
        System.out.println("***Today mTemperature: "+ temperature+"***");
        System.out.println("***Today mPressure: "+ pressure+"***");
        System.out.println("***Today mHumidity: "+ humidity+"***");
    }
}
