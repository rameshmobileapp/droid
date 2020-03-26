package com.olam.ownimp.data.local.pref;

import android.content.Context;
import android.content.SharedPreferences;

import com.olam.ownimp.Constants;

public class Preferences implements PreferencesHelper {

    private SharedPreferences sharedPreferences = null;

    public Preferences(Context context) {
        init(context);
    }

    private void init(Context context) {
        if (sharedPreferences == null)
            sharedPreferences = context.getSharedPreferences(Constants.APP_PREFERENCE, 0);
    }

    @Override
    public void setUserName(String userName) {
        sharedPreferences.edit().putString("username", userName).apply();
    }

    @Override
    public String getUserName() {
        return sharedPreferences.getString("username", null);
    }

    @Override
    public void clearAll() {
        sharedPreferences.edit().clear().apply();
    }
}
