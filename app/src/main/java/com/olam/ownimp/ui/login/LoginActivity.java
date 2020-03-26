package com.olam.ownimp.ui.login;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.olam.ownimp.AppClass;
import com.olam.ownimp.R;
import com.olam.ownimp.base.BaseActivity;
import com.olam.ownimp.callback.AlertCallBack;

public class LoginActivity extends BaseActivity implements AlertCallBack {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        fullScreenView();
        setContentView(R.layout.activity_main);
        intiView();
    }

    @Override
    protected void intiView() {
        getPreferences().setUserName("Ramesh R");
        getPreferences().clearAll();
        Log.d(TAG, "intiView: " + getPreferences().getUserName());
    }


    @Override
    public void positive(int userOption) {
        Toast.makeText(this, "" + userOption, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void negative() {
        Toast.makeText(this, "negative", Toast.LENGTH_SHORT).show();
    }
}