/*Group -- AJ
Score.java -- Tictac
Members:
	1.Satyanarayana Jagata -- 800844992
	2.Sumanth Krishna -- 800810828
*/


package com.example.tictac;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Score extends Activity {

	ProgressBar seep1,seep2;
	SharedPreferences sh;
	TextView oneper,twoper,pgg,per,per2;
	float tipfloat,grandtotal;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_score);
			
		sh = getSharedPreferences("game", 0);
		b = (Button)findViewById(R.id.back);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent(Score.this,MainActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		Bundle bundle = getIntent().getExtras();

		String LastWin = bundle.getString("LastWin");
		
		seep1=(ProgressBar)findViewById(R.id.playerone);
		seep2=(ProgressBar)findViewById(R.id.playertwo);
		oneper=(TextView)findViewById(R.id.oneper);
		twoper=(TextView)findViewById(R.id.twoper);
		per=(TextView)findViewById(R.id.per);
		per2=(TextView)findViewById(R.id.per2);
		pgg=(TextView)findViewById(R.id.pgg);
		TextView Lastwin=(TextView)findViewById(R.id.Lastwin);
		
		Lastwin.setText(LastWin);
		
		int p=sh.getInt("p1", 0)+sh.getInt("p2", 0);
		float p1=sh.getInt("p1", 0);
		float p2=sh.getInt("p2", 0);
		pgg.setText(""+p);
		//int perp1=(p1*100)%p;
		//int perp2=(p2*100)%p;
		 tipfloat=(p1*100/p);
	     grandtotal=(p2*100/p);
	     
		//Log.v("hi", "hi"+perp1);
		//Log.v("hi", "hi"+perp2);
		seep1.setMax(p);
		seep2.setMax(p);
		seep1.setProgress(sh.getInt("p1", 0));
		seep2.setProgress(sh.getInt("p2", 0));
		oneper.setText("" + tipfloat + "%");
		twoper.setText("" + grandtotal + "%");
		per.setText("%");
		per2.setText("%");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.score, menu);
		return true;
	}

}

