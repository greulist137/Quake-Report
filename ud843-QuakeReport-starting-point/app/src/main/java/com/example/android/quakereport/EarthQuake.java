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

    //Returns the Magnitude of the current EarthQauke
    public double getMagnitude(){
        return mMagnitude;
    }

    //Returns the city of the Earthquake
    public String getCity(){
        return mCityOfEarthquake;
    }

    //Returns the date of the earthquake
    public String getDate(){
        return mDateOfEarthquake;
    }


}
