package com.alejandro.httprequest.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alejandro on 19/3/17.
 */

public class Temperature {

    @SerializedName("temp")
    private float temperature;
    private float pressure;
    private float humidity;
    @SerializedName("temp_min")
    private float tempMin;
    @SerializedName("temp_max")
    private float tempMax;


    public Temperature() {

    }

    public Temperature(float temperature, float pressure, float humidity, float tempMin, float tempMax) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }


}
