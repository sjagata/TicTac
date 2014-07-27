/*Group -- AJ
CreditsActivity.java -- Tictac
Members:
	1.Satyanarayana Jagata -- 800844992
	2.Sumanth Krishna -- 800810828
*/



package com.example.tictac;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CreditsActivity extends Activity {
	
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_credits);
		
		btn = (Button)findViewById(R.id.btnback);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent= new Intent(CreditsActivity.this,MainActivity.class);
				startActivity(intent);
				Log.d("Hello", "finish");
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.credits, menu);
		return true;
	}

}
