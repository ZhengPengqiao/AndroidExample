package com.zpq.zpq.ApplicationExample.learncontext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zpq.zpq.ApplicationExample.learnapplication.MyApplication;


public class MainActivityOne extends Activity {

	String TAG = "MainActivityOne";
	EditText editText;
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");

		setContentView(R.layout.activity_main_one);
		editText = (EditText)findViewById(R.id.editTextOne);
		editText.setText(getApp().getSaveString());

		button = (Button)findViewById(R.id.buttonOne);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				getApp().setSaveString(editText.getText().toString());
			}
		});

	}
	
	public MyApplication getApp() {
		return ((MyApplication)getApplication());
	}

	@Override
	public void onPause()
	{
		Message message = new Message();
		message.what = 1;
		getApp().m_handler.sendMessage(message);
		Log.e(TAG,"onPause");

		super.onPause();
	}

	public void StartMainActivity()
	{
			Intent in = new Intent(this, MainActivityTwo.class);
			in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_SINGLE_TOP);
			startActivity(in);
	}



	@Override
	public void onStart()
	{
		Log.e(TAG,"onStart");

		super.onStart();
	}

	@Override
	protected void onDestroy() {
		Log.e(TAG,"onDestroy");
		super.onDestroy();
	}

	@Override
	protected void onResume() {
		Log.e(TAG,"onResume");

		super.onResume();
	}

	@Override
	protected void onStop() {
		Log.e(TAG,"onStop");

		super.onStop();
	}

	@Override
	protected void onRestart() {
		Log.e(TAG,"onRestart");

		super.onRestart();
	}


}
