package com.example.hli3584.weatherapp.Retrofit;

import android.database.Observable;

import com.example.hli3584.weatherapp.Model.WeatherResult;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lon") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);
}
