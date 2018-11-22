package com.example.georgesamuel.darslidemo;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefConfig {
    private Context context;
    private SharedPreferences sharedPreferences;
    public SharedPrefConfig(Context context)
    {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.login_preference), Context.MODE_PRIVATE);
    }
    public void setLoginStatus(boolean status)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.login_status_preference), status);
        editor.commit();
    }
    public boolean getLoginStatus()
    {
        boolean status = false;
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status_preference), false);
        return status;
    }
}
