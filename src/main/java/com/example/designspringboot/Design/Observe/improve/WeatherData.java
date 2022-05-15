package com.example.designspringboot.Design.Observe.improve;

import com.example.designspringboot.Design.Observe.CurrentConditions;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observe> observes;

    public WeatherData(CurrentConditions currentConditions) {
        observes = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
       // currentConditions.update(getTemperature(),getPressure(),getHumidity());
        notifyOnserve();
    }
    public void setData(float temperature, float pressure, float humidity){
        this.temperature =temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        dataChange();
    }

    @Override
    public void registerOnserve(Observe o) {
        observes.add(o);
    }

    @Override
    public void removeOnserve(Observe o) {
        observes.remove(o);
    }

    @Override
    public void notifyOnserve() {
        for (int i = 0;i<observes.size();i++){
            observes.get(i).update(getTemperature(),getPressure(),getHumidity());
        }
    }
}
