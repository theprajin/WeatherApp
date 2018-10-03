package com.infotechnocation.weatherdemo.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Flags
{
    @SerializedName("nearestStation")
    private String nearestStation;
    @SerializedName("units")
    private String units;
    @SerializedName("sources")
    private String[] sources;

    public String getNearestStation ()
{
    return nearestStation;
}

    public void setNearestStation (String nearestStation)
{
    this.nearestStation = nearestStation;
}

    public String getUnits ()
    {
        return units;
    }

    public void setUnits (String units)
    {
        this.units = units;
    }

    public String[] getSources ()
    {
        return sources;
    }

    public void setSources (String[] sources)
    {
        this.sources = sources;
    }

    @Override
    public String toString() {
        return "Flags{" +
                "nearestStation='" + nearestStation + '\'' +
                ", units='" + units + '\'' +
                ", sources=" + Arrays.toString(sources) +
                '}';
    }
}

