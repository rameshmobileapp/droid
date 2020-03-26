package com.olam.ownimp;

import android.app.Application;

import com.olam.ownimp.data.local.pref.Preferences;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class AppClass extends Application {




    @Override
    public void onCreate() {

        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );


    }


}
