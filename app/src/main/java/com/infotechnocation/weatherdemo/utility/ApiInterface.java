package com.infotechnocation.weatherdemo.utility;

import com.infotechnocation.weatherdemo.entity.Weather;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("/forecast/{api_key}/{longitude},{latitude}")
    Call<Weather> getWeather(@Path("api_key") String api_key, @Path("longitude") String longitude, @Path("latitude") String latitude);
}
