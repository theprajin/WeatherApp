package com.infotechnocation.weatherdemo.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Minutely
{
    @SerializedName("summary")
    private String summary;
    @SerializedName("icon")
    private String icon;
    @SerializedName("data")
    private Data[] data;

    public String getSummary ()
    {
        return summary;
    }

    public void setSummary (String summary)
    {
        this.summary = summary;
    }

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Minutely{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}