package com.example.sheoliy.mdt;

import android.app.Activity;
import android.os.Bundle;

import android.view.Window;

/**
 * Created by Sheoliy on 2017/7/11.
 */

public class New_Progress_new extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.new_progressnew);
    }
}