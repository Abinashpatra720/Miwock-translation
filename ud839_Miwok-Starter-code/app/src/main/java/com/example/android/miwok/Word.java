package com.example.android.miwok;

/**
 * Created by Abinash Patra on 16-Mar-17.
 */

public class Word {
    private String mEnglish;
    private String mMiwok;
    private int mimaage= first_imageMy;
    private static final int first_imageMy =-1;
    private int mAudio;
    public Word(String english,String miwok,int Audio)
    {
        mEnglish=english;
        mMiwok=miwok;
        mAudio=Audio;
    }
    public Word(String english,String miwok,int image,int Audio)
    {
        mEnglish=english;
        mMiwok=miwok;
        mimaage=image;
        mAudio=Audio;

    }

    public String englishmethod(){
        return mEnglish;
    }
    public String miwokmethod(){
        return mMiwok;
    }
    public int imagemethod(){
        return  mimaage;
    }
    public  boolean imageornot()
    {
        return mimaage!= first_imageMy;
    }
    public int soundmethod(){return mAudio;}
}
