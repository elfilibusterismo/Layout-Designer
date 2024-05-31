package com.elfilibustero.uidesigner;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import androidx.appcompat.app.AppCompatDelegate;

public class AppLoader extends Application {
	
	private static AppLoader instance;
	
	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
	}
	
	public Context getContext() {
		return instance.getApplicationContext();
	}
	
	public void updateTheme(int nightMode, Activity activity) {
		AppCompatDelegate.setDefaultNightMode(nightMode);
		activity.recreate();
	}
	
	public static AppLoader getInstance() {
		return instance;
	}
}
