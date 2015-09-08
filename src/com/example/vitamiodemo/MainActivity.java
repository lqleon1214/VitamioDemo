package com.example.vitamiodemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	private static final String MEDIA = "media";
	private static final int STREAM_VIDEO = 5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button go = (Button) findViewById(R.id.go);
		go.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,MediaPlayerDemo_Video.class);
				intent.putExtra(MEDIA, STREAM_VIDEO);
				startActivity(intent);
			}
		});
	}
}
