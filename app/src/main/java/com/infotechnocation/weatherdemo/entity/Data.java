package com.infotechnocation.weatherdemo.entity;

import com.google.gson.annotations.SerializedName;

public class Data
{
    @SerializedName("time")
    private String time;
    @SerializedName("precipProbability")
    private String precipProbability;
    @SerializedName("precipIntensity")
    private String precipIntensity;

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getPrecipProbability ()
    {
        return precipProbability;
    }

    public void setPrecipProbability (String precipProbability)
    {
        this.precipProbability = precipProbability;
    }

    public String getPrecipIntensity ()
    {
        return precipIntensity;
    }

    public void setPrecipIntensity (String precipIntensity)
    {
        this.precipIntensity = precipIntensity;
    }

    @Override
    public String toString() {
        return "Data{" +
                "time='" + time + '\'' +
                ", precipProbability='" + precipProbability + '\'' +
                ", precipIntensity='" + precipIntensity + '\'' +
                '}';
    }
}