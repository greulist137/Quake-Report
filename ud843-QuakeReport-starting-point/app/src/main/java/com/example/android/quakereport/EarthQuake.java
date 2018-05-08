package com.example.android.quakereport;

public class EarthQuake {

    private double mMagnitude;
    private String mCityOfEarthquake;
    private String mDateOfEarthquake;

    public EarthQuake(double magnitude, String cityOfEarthquake, String dateOfEarthquake){
        mMagnitude = magnitude;
        mCityOfEarthquake = cityOfEarthquake;
        mDateOfEarthquake = dateOfEarthquake;
    }


}
