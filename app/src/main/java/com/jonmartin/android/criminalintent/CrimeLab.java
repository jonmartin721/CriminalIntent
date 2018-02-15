package com.jonmartin.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    //variables
    private static CrimeLab sCrimeLab;
    private final List<Crime> mCrimes;

    static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime # " + i);
            crime.setSolved(i % 2 == 0);            //every other one will be marked solved
            crime.setRequiresPolice(i % 2 == 0);    //every other one will require police
            mCrimes.add(crime);
        }
    }


    //returns the list of crimes
    List<Crime> getmCrimes() {
        return mCrimes;
    }

    //returns specific crimes from the UUID passed to it
    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getID().equals(id)) {
                return crime;
            }
        }
        return null;
    }


}
