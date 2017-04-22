package com.example.bhalu.miwoklearning;

/**
 * Created by bhalu on 2/17/2017.
 */

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResource;

    public Word(String englishTranslation, String miwokTranslation){
        this.mMiwokTranslation = miwokTranslation;
        this.mEnglishTranslation = englishTranslation;
    }

    public Word(String englishTranslation, String miwokTranslation, int imageResource){
        this.mEnglishTranslation = englishTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResource = imageResource;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getEnglishTranslation(){
        return mEnglishTranslation;
    }

    public int getImageResource(){
        return mImageResource;
    }
}
