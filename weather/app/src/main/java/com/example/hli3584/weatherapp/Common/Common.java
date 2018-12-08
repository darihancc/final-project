package com.example.hli3584.weatherapp.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Common {

    public static final String APP_ID = "3535e13c5b7bba18e24eebd4b4d9ae03";
    public static Location current_location=null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf =new SimpleDateFormat("HH:mm EEE MM yyyy");

        String formatted =sdf.format(date);
        return formatted;

    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf =new SimpleDateFormat("HH:mm ");

        String formatted =sdf.format(date);
        return formatted;

    }
}
