package com.zpq.zpq.ApplicationExample.learnapplication;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Message;
import android.util.Log;


public class MyApplication extends Application {
	private String TAG = "CARLOZ - Application";
	private String saveString = "默认值";
	@Override
	public void onCreate() {
		// 程序创建的时候执行
		Log.d(TAG, "onCreate");

		super.onCreate();


	}

	public void setSaveString(String saveString)
	{
		this.saveString = saveString;
	}

	public String getSaveString()
	{
		return this.saveString;
	}

	@Override
	public void onTerminate() {
		// 程序终止的时候执行
		Log.d(TAG, "onTerminate");
		super.onTerminate();
	}


	public Handler m_handler = new Handler()
	{
		@Override
		public void handleMessage(Message msg)
		{
			super.handleMessage(msg);
		}
	};





	@Override
	public void onLowMemory() {
		// 低内存的时候执行
		Log.d(TAG, "onLowMemory");
		super.onLowMemory();
	}
	@Override
	public void onTrimMemory(int level) {
		// 程序在内存清理的时候执行
		Log.d(TAG, "onTrimMemory");
		super.onTrimMemory(level);
	}
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		Log.d(TAG, "onConfigurationChanged");
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void registerActivityLifecycleCallbacks(
			ActivityLifecycleCallbacks callback) {
		Log.d(TAG, "registerActivityLifecycleCallbacks");
		super.registerActivityLifecycleCallbacks(callback);
	}

	@Override
	public void registerComponentCallbacks(ComponentCallbacks callback) {
		Log.d(TAG, "registerComponentCallbacks");
		super.registerComponentCallbacks(callback);
	}

	@Override
	public void unregisterActivityLifecycleCallbacks(
			ActivityLifecycleCallbacks callback) {
		Log.d(TAG, "unregisterActivityLifecycleCallbacks");
		super.unregisterActivityLifecycleCallbacks(callback);
	}

	@Override
	public void unregisterComponentCallbacks(ComponentCallbacks callback) {
		Log.d(TAG, "unregisterComponentCallbacks");
		super.unregisterComponentCallbacks(callback);
	}

}
