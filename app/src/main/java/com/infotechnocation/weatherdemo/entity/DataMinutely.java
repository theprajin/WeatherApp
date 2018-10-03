package com.infotechnocation.weatherdemo.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataMinutely {

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("precipIntensity")
    @Expose
    private Integer precipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private Integer precipProbability;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Integer precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Integer getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Integer precipProbability) {
        this.precipProbability = precipProbability;
    }

    @Override
    public String toString() {
        return "DataMinutely{" +
                "time=" + time +
                ", precipIntensity=" + precipIntensity +
                ", precipProbability=" + precipProbability +
                '}';
    }
}
