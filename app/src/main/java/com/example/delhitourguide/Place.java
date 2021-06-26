package com.example.delhitourguide;

public class Place {

    private static final  int NO_IMAGE_PROVIDED = -1;
    private String mName;
    private String mPlace;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Place(String name, String place, int imageResourceId){
        mName = name;
        mPlace = place;
        mImageResourceId = imageResourceId;
    }

    public String getmName(){
        return mName;
    }

    public String getmPlace(){
        return mPlace;
    }

    public int getmImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
