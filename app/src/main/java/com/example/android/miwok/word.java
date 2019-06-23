package com.example.android.miwok;

public class word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageID;

    public word(String defaultTranslation , String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public word(String defaultTranslation , String miwokTranslation , int imageID){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageID = imageID;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){

        return mMiwokTranslation;
    }
    public int getmImageID(){

        return mImageID;
    }
}
