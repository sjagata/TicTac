/*Group -- AJ
MainActivity.java -- Tictac
Members:
	1.Satyanarayana Jagata -- 800844992
	2.Sumanth Krishna -- 800810828
*/



package com.example.tictac;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	ImageView one,two,three,four,five,six,seven,eight,nine;
	Button player,scores,reset,credit,exit;
	TextView win;
	boolean a=false,p=false;
	public static int i=0,j=0;
	int m1,m2,m3,m4,m5,m6,m7,m8,m9;
	View x;	
	String LastWin;
	int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;	
	int playerone=0,playertwo=0;	
	SharedPreferences sh;
	SharedPreferences.Editor sef;
	int previousp1=0;
	int previousp2=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sh =getSharedPreferences("game", 0);
		sef=sh.edit();
		
		previousp1=sh.getInt("p1", 0);
		previousp2=sh.getInt("p2", 0);
		
		one=(ImageView) findViewById(R.id.imageone);
		two=(ImageView) findViewById(R.id.imagetwo);
		three=(ImageView) findViewById(R.id.imagethree);
		four=(ImageView) findViewById(R.id.imagefour);
		five=(ImageView) findViewById(R.id.imagefive);
		six=(ImageView) findViewById(R.id.imagesix);
		seven=(ImageView) findViewById(R.id.imageseven);
		eight=(ImageView) findViewById(R.id.imageeight);
		nine=(ImageView) findViewById(R.id.imagenine);

		player=(Button) findViewById(R.id.playerinformation);
		scores=(Button) findViewById(R.id.score);
		reset=(Button) findViewById(R.id.reset);
		credit=(Button) findViewById(R.id.credit);
		exit=(Button) findViewById(R.id.exit);

		win=(TextView) findViewById(R.id.win);

		one.setOnClickListener(this);
		two.setOnClickListener(this);
		three.setOnClickListener(this);
		four.setOnClickListener(this);
		five.setOnClickListener(this);
		six.setOnClickListener(this);
		seven.setOnClickListener(this);
		eight.setOnClickListener(this);
		nine.setOnClickListener(this);


		player.setOnClickListener(this);
		scores.setOnClickListener(this);
		reset.setOnClickListener(this);
		credit.setOnClickListener(this);
		exit.setOnClickListener(this);

		player.setText("Turn to Player One");

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		x=v;

		if(v.getId()==R.id.score)
		{
			Intent i=new Intent(MainActivity.this, Score.class);
			i.putExtra("LastWin", LastWin);
			startActivity(i);
		}
		if(v.getId()==R.id.reset)
		{
			one.setImageResource(R.drawable.empty);
			two.setImageResource(R.drawable.empty);
			three.setImageResource(R.drawable.empty);
			four.setImageResource(R.drawable.empty);
			five.setImageResource(R.drawable.empty);
			six.setImageResource(R.drawable.empty);
			seven.setImageResource(R.drawable.empty);
			eight.setImageResource(R.drawable.empty);
			nine.setImageResource(R.drawable.empty);
			
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(true);
			nine.setEnabled(true);
			
			win.setText("");			
			a=false;p=false;			
			m1=0;m2=0;m3=0;m4=0;m5=0;m6=0;m7=0;m8=0;m9=0;			
			c1=0;c2=0;c3=0;c4=0;c5=0;c6=0;c7=0;c8=0;c9=0;
			
			player.setText("");
			

		}
		if(v.getId()==R.id.credit)
		{
			Intent sendIntent = new Intent(MainActivity.this,CreditsActivity.class);
			startActivity(sendIntent);

		}
		if(v.getId()==R.id.exit)
		{
			finish();
		}
		if(v.getId()==R.id.imageone)
		{
			if(c1==0)
			{
				if(!a)
				{
					m1=1;
					one.setImageResource(R.drawable.letterx);
					a=true;
				}
				else
				{
					m1=2;
					one.setImageResource(R.drawable.lettero);
					a=false;
				}
				checking();
				c1=1;
			}

		}
		if(v.getId()==R.id.imagetwo)
		{
			if(c2==0)
			{

				if(!a)
				{
					m2=1;
					two.setImageResource(R.drawable.letterx);
					a=true;
				}
				else
				{
					m2=2;
					two.setImageResource(R.drawable.lettero);
					a=false;
				}
				checking();
				c2=1;
			}
		}
		if(v.getId()==R.id.imagethree)
		{
			if(c3==0)
			{

				if(!a)
				{
					m3=1;
					three.setImageResource(R.drawable.letterx);
					a=true;
				}
				else
				{
					m3=2;
					three.setImageResource(R.drawable.lettero);
					a=false;
				}
				checking();
				c3=1;
			}

		}
		if(v.getId()==R.id.imagefour)
		{
			if(c4==0)
			{
				if(!a)
				{
					m4=1;
					four.setImageResource(R.drawable.letterx);
					a=true;
				}
				else
				{
					m4=2;
					four.setImageResource(R.drawable.lettero);
					a=false;
				}
				checking();
				c4=1;
			}

		}
		if(v.getId()==R.id.imagefive)
		{
			if(c5==0)
			{
				if(!a)
				{
					m5=1;
					five.setImageResource(R.drawable.letterx);
					a=true;
				}
				else
				{
					m5=2;
					five.setImageResource(R.drawable.lettero);
					a=false;
				}
				checking();
				c5=1;
			}
		}
		if(v.getId()==R.id.imagesix)
		{
			if(c6==0)
			{
			
			if(!a)
			{
				m6=1;

				six.setImageResource(R.drawable.letterx);
				a=true;
			}
			else
			{
				m6=2;

				six.setImageResource(R.drawable.lettero);
				a=false;
			}
			checking();
			c6=1;
			}
		}
		if(v.getId()==R.id.imageseven)
		{
			if(c7==0)
			{
			if(!a)
			{
				m7=1;
				seven.setImageResource(R.drawable.letterx);
				a=true;
			}
			else
			{			
				m7=2;

				seven.setImageResource(R.drawable.lettero);
				a=false;
			}
			checking();
			c7=1;
			}

		}
		if(v.getId()==R.id.imageeight)
		{
			if(c8==0)
			{
			
			if(!a)
			{
				m8=1;

				eight.setImageResource(R.drawable.letterx);
				a=true;
			}
			else
			{
				m8=2;

				eight.setImageResource(R.drawable.lettero);
				a=false;
			}
			checking();
			c8=1;
			}

		}
		if(v.getId()==R.id.imagenine)
		{
			if(c9==0)
			{
			
			if(!a)
			{
				m9=1;

				nine.setImageResource(R.drawable.letterx);
				a=true;
			}
			else
			{
				m9=2;

				nine.setImageResource(R.drawable.lettero);
				a=false;
			}
			checking();
			c9=1;
			
			}
		}
	}

	public void checking()
	{
		if(x.getId()==R.id.imageone||x.getId()==R.id.imagetwo||x.getId()==R.id.imagethree||x.getId()==R.id.imagefour
				||x.getId()==R.id.imagefive||x.getId()==R.id.imagesix||x.getId()==R.id.imageseven||
				x.getId()==R.id.imageeight||x.getId()==R.id.imagenine)
		{

			if(!p)
			{
				player.setText("Turn to Palyer Two");				
				if(m1==1&&m2==1&&m3==1 || m1==1&&m5==1&&m9==1 || m3==1&&m5==1&&m7==1 || m4==1&&m5==1&&m6==1 || m7==1&&m8==1&&m9==1 || m1==1&&m4==1&&m7==1 || m2==1&&m5==1&&m8==1 || m3==1&&m6==1&&m9==1)
				{
					win.setText("Player One win the game. Press reset to play again.");
					previousp1=previousp1+1;
					LastWin = "Congratulatoins to Player 1 for winning the last game.";
					one.setEnabled(false);
					two.setEnabled(false);
					three.setEnabled(false);
					four.setEnabled(false);
					five.setEnabled(false);
					six.setEnabled(false);
					seven.setEnabled(false);
					eight.setEnabled(false);
					nine.setEnabled(false);
					
					gamewinner(1, previousp1);
				}				
				else if(!(m1==0) && !(m2==0) && !(m3==0) && !(m4==0) && !(m5==0) && !(m6==0) && !(m7==0) && !(m8==0) && !(m9==0)){
					if (!(m1==1 && m2== 1 && m3==1) || !(m1==1 && m5==1 && m9==1) || !(m3==1 && m5==1 && m7==1) || !(m4==1 && m5==1 && m6==1) || !(m7==1 && m8==1 && m9==1) || !(m7==1 && m8==1 && m9==1) || !(m1==1 && m4==1 && m7==1) || !(m2==1 && m4==1 && m8==1) || !(m3==1 && m6==1 && m9==1) || !(m3==1 && m6==1 && m9==1) || !(m2==1 && m5==1 && m8==1))
					{
						win.setText("Game is draw. Press reset to play again.");
						LastWin = "Last game was a draw.";
						one.setEnabled(false);
						two.setEnabled(false);
						three.setEnabled(false);
						four.setEnabled(false);
						five.setEnabled(false);
						six.setEnabled(false);
						seven.setEnabled(false);
						eight.setEnabled(false);
						nine.setEnabled(false);
					}
				}
				p=true;
			}
			else
			{
				player.setText("Turn to Player One");				
				if(m1==2&&m2==2&&m3==2 || m1==2&&m5==2&&m9==2 || m3==2&&m5==2&&m7==2 || m4==2&&m5==2&&m6==2 || m7==2&&m8==2&&m9==2 || m1==2&&m4==2&&m7==2 || m2==2&&m5==2&&m8==2 || m3==2&&m6==2&&m9==2)
				{
					win.setText("Player Two win the game. Press reset to play again.");
					previousp2=previousp2+1;
					LastWin = "Congratulatoins to Player 2 for winning the last game.";
					one.setEnabled(false);
					two.setEnabled(false);
					three.setEnabled(false);
					four.setEnabled(false);
					five.setEnabled(false);
					six.setEnabled(false);
					seven.setEnabled(false);
					eight.setEnabled(false);
					nine.setEnabled(false);
					
					gamewinner(2, previousp2);
				}
				else if(!(m1==0) && !(m2==0) && !(m3==0) && !(m4==0) && !(m5==0) && !(m6==0) && !(m7==0) && !(m8==0) && !(m9==0)){
					if (!(m1==2 && m2== 2 && m3==2) || !(m1==2 && m5==2 && m9==2) || !(m3==2 && m5==2 && m7==2) || !(m4==2 && m5==2 && m6==2) || !(m7==2 && m8==2 && m9==2) || !(m7==2 && m8==2 && m9==2) || !(m1==2 && m4==2 && m7==2) || !(m2==2 && m4==2 && m8==2) || !(m3==2 && m6==2 && m9==2) || !(m3==2 && m6==2 && m9==2) || !(m2==1 && m5==1 && m8==1))
					{
						win.setText("Game is draw. Press reset to play again.");
						LastWin = "Last game was a draw.";
						one.setEnabled(false);
						two.setEnabled(false);
						three.setEnabled(false);
						four.setEnabled(false);
						five.setEnabled(false);
						six.setEnabled(false);
						seven.setEnabled(false);
						eight.setEnabled(false);
						nine.setEnabled(false);
					}
				}
				
				p=false;
			}

		}
	}
	
	public void gamewinner(int m,int c)
	{		
		if(m==1){
			sef.putInt("p1", c);	
		}else if(m==2){
		sef.putInt("p2", c);
		}
		sef.commit();
		
		int finalscorep1=sh.getInt("p1", 0);
		int finalscorep2=sh.getInt("p2", 0);
		
		Log.v("p1", "won matches "+finalscorep1);
		Log.v("p2", "won matches "+finalscorep2);
	}
	
}
