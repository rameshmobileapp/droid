package com.olam.ownimp;

import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.content.ContextCompat;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;

public class PermissionUtils {

    private Context context;

    public PermissionUtils(Context context) {
        this.context = context;
    }

    public  boolean isPermissionGranted() {
        int result = ContextCompat.checkSelfPermission(context, ACCESS_FINE_LOCATION);
        int result1 = ContextCompat.checkSelfPermission(context, ACCESS_COARSE_LOCATION);
        return result == PackageManager.PERMISSION_GRANTED && result1 == PackageManager.PERMISSION_GRANTED;
    }

    public  String[] permissionArray() {
        return new String[]{ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION};
    }

}
