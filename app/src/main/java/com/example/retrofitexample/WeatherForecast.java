package com.example.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherForecast {
    @GET("WeatherForecast")
    Call<List<Weather>> getWeather();
}
