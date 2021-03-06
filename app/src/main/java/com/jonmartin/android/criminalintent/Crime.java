package com.jonmartin.android.criminalintent;

import java.util.Date;
import java.util.UUID;

//this is the crime class that has data on each crime
class Crime {

    private final UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    //constructor
    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
