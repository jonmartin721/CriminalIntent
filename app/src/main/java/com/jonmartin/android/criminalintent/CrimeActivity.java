package com.jonmartin.android.criminalintent;


import android.support.v4.app.Fragment;

//this is the activity that hosts the crime detail fragment
public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}
