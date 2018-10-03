package com.infotechnocation.weatherdemo.entity;

import com.google.gson.annotations.SerializedName;

public class Currently
{
    @SerializedName("summary")
    private String summary;
    @SerializedName("windGust")
    private String windGust;
    @SerializedName("icon")
    private String icon;
    @SerializedName("nearestStormBearing")
    private String nearestStormBearing;
    @SerializedName("pressure")
    private String pressure;
    @SerializedName("visibility")
    private String visibility;
    @SerializedName("cloudCover")
    private String cloudCover;
    @SerializedName("apparentTemperature")
    private String apparentTemperature;
    @SerializedName("precipIntensity")
    private String precipIntensity;
    @SerializedName("temperature")
    private String temperature;
    @SerializedName("dewPoint")
    private String dewPoint;
    @SerializedName("ozone")
    private String ozone;
    @SerializedName("windSpeed")
    private String windSpeed;
    @SerializedName("time")
    private String time;
    @SerializedName("humidity")
    private String humidity;
    @SerializedName("windBearing")
    private String windBearing;
    @SerializedName("nearestStormDistance")
    private String nearestStormDistance;
    @SerializedName("uvIndex")
    private String uvIndex;
    @SerializedName("precipProbability")
    private String precipProbability;

    public String getSummary ()
    {
        return summary;
    }

    public void setSummary (String summary)
    {
        this.summary = summary;
    }

    public String getWindGust ()
    {
        return windGust;
    }

    public void setWindGust (String windGust)
    {
        this.windGust = windGust;
    }

    public String getIcon ()
    {
        return icon;
    }

    public void setIcon (String icon)
    {
        this.icon = icon;
    }

    public String getNearestStormBearing ()
    {
        return nearestStormBearing;
    }

    public void setNearestStormBearing (String nearestStormBearing)
    {
        this.nearestStormBearing = nearestStormBearing;
    }

    public String getPressure ()
    {
        return pressure;
    }

    public void setPressure (String pressure)
    {
        this.pressure = pressure;
    }

    public String getVisibility ()
    {
        return visibility;
    }

    public void setVisibility (String visibility)
    {
        this.visibility = visibility;
    }

    public String getCloudCover ()
    {
        return cloudCover;
    }

    public void setCloudCover (String cloudCover)
    {
        this.cloudCover = cloudCover;
    }

    public String getApparentTemperature ()
    {
        return apparentTemperature;
    }

    public void setApparentTemperature (String apparentTemperature)
    {
        this.apparentTemperature = apparentTemperature;
    }

    public String getPrecipIntensity ()
    {
        return precipIntensity;
    }

    public void setPrecipIntensity (String precipIntensity)
    {
        this.precipIntensity = precipIntensity;
    }

    public String getTemperature ()
    {
        return temperature;
    }

    public void setTemperature (String temperature)
    {
        this.temperature = temperature;
    }

    public String getDewPoint ()
    {
        return dewPoint;
    }

    public void setDewPoint (String dewPoint)
    {
        this.dewPoint = dewPoint;
    }

    public String getOzone ()
    {
        return ozone;
    }

    public void setOzone (String ozone)
    {
        this.ozone = ozone;
    }

    public String getWindSpeed ()
    {
        return windSpeed;
    }

    public void setWindSpeed (String windSpeed)
    {
        this.windSpeed = windSpeed;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getHumidity ()
    {
        return humidity;
    }

    public void setHumidity (String humidity)
    {
        this.humidity = humidity;
    }

    public String getWindBearing ()
    {
        return windBearing;
    }

    public void setWindBearing (String windBearing)
    {
        this.windBearing = windBearing;
    }

    public String getNearestStormDistance ()
    {
        return nearestStormDistance;
    }

    public void setNearestStormDistance (String nearestStormDistance)
    {
        this.nearestStormDistance = nearestStormDistance;
    }

    public String getUvIndex ()
    {
        return uvIndex;
    }

    public void setUvIndex (String uvIndex)
    {
        this.uvIndex = uvIndex;
    }

    public String getPrecipProbability ()
    {
        return precipProbability;
    }

    public void setPrecipProbability (String precipProbability)
    {
        this.precipProbability = precipProbability;
    }

    @Override
    public String toString() {
        return "Currently{" +
                "summary='" + summary + '\'' +
                ", windGust='" + windGust + '\'' +
                ", icon='" + icon + '\'' +
                ", nearestStormBearing='" + nearestStormBearing + '\'' +
                ", pressure='" + pressure + '\'' +
                ", visibility='" + visibility + '\'' +
                ", cloudCover='" + cloudCover + '\'' +
                ", apparentTemperature='" + apparentTemperature + '\'' +
                ", precipIntensity='" + precipIntensity + '\'' +
                ", temperature='" + temperature + '\'' +
                ", dewPoint='" + dewPoint + '\'' +
                ", ozone='" + ozone + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", time='" + time + '\'' +
                ", humidity='" + humidity + '\'' +
                ", windBearing='" + windBearing + '\'' +
                ", nearestStormDistance='" + nearestStormDistance + '\'' +
                ", uvIndex='" + uvIndex + '\'' +
                ", precipProbability='" + precipProbability + '\'' +
                '}';
    }
}

