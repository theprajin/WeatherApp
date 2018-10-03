package com.infotechnocation.weatherdemo.entity;

import com.google.gson.annotations.SerializedName;

public class Weather
{
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("flags")
    private Flags flags;
    @SerializedName("currently")
    private Currently currently;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("offset")
    private String offset;
    @SerializedName("hourly")
    private Hourly hourly;
    @SerializedName("daily")
    private Daily daily;
    @SerializedName("minutely")
    private Minutely minutely;

    public String getTimezone ()
    {
        return timezone;
    }

    public void setTimezone (String timezone)
    {
        this.timezone = timezone;
    }

    public Flags getFlags ()
    {
        return flags;
    }

    public void setFlags (Flags flags)
    {
        this.flags = flags;
    }

    public Currently getCurrently ()
    {
        return currently;
    }

    public void setCurrently (Currently currently)
    {
        this.currently = currently;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getOffset ()
    {
        return offset;
    }

    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    public Hourly getHourly ()
    {
        return hourly;
    }

    public void setHourly (Hourly hourly)
    {
        this.hourly = hourly;
    }

    public Daily getDaily ()
    {
        return daily;
    }

    public void setDaily (Daily daily)
    {
        this.daily = daily;
    }

    public Minutely getMinutely ()
    {
        return minutely;
    }

    public void setMinutely (Minutely minutely)
    {
        this.minutely = minutely;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "timezone='" + timezone + '\'' +
                ", flags=" + flags +
                ", currently=" + currently +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", offset='" + offset + '\'' +
                ", hourly=" + hourly +
                ", daily=" + daily +
                ", minutely=" + minutely +
                '}';
    }
}