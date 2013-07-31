package com.briodek.playable;

import android.net.Uri;
import android.os.Bundle;
import android.widget.*;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        LinearLayout LV = (LinearLayout)findViewById(R.id.linearLayout1);
        ObjectAnimator airplaneAnim = ObjectAnimator.ofFloat(findViewById(R.id.airplane), "X", 3000f,0f);
        airplaneAnim.setRepeatCount(-1);
        airplaneAnim.setRepeatMode(ObjectAnimator.RESTART);
        airplaneAnim.setDuration(10000);
        //airplaneAnim.addListener(new planeAnimationControl(findViewById(R.id.airplane)));
        airplaneAnim.start();
        
        ObjectAnimator ani = ObjectAnimator.ofFloat(findViewById(R.id.linearLayout1), "X", 0f,-3000f);
        ani.setDuration(5000);
        ani.setRepeatCount(1);
        ani.setRepeatMode(ObjectAnimator.REVERSE);
        //ani.addListener(new animationMapControl(findViewById(R.id.linearLayout1)));
        ani.start();
        
        //float x = 200;
        //float y = 200;
        String imageRes[] = new String[5];// "android.resource://com.briodek.playable/drawable/bizlocation";
        imageRes[0] ="android.resource://com.briodek.playable/drawable/bizlocation";
        imageRes[1] ="android.resource://com.briodek.playable/drawable/start_location";
        imageRes[2] ="android.resource://com.briodek.playable/drawable/start_arrow";
        imageRes[3] ="android.resource://com.briodek.playable/drawable/neon_a";
        imageRes[4] ="android.resource://com.briodek.playable/drawable/neon_b";
        float[] x = {505,558,440,800};
        float[] y ={186,166,140,400};
        for(int i=0;i<2;i++)
        {
        	ImageButton Ib = new ImageButton(this);
        	//Ib.setBackgroundResource(R.drawable.bizlocation);
        	Ib.setImageURI(Uri.parse(imageRes[i]));
        	Ib.setY(y[i]);
        	Ib.setX(x[i]);
        	LV.addView(Ib, 150, 150);
        }
        
        ImageView IbArrow = new ImageView(this);
        IbArrow.setImageURI(Uri.parse(imageRes[2]));
        IbArrow.setX(x[2]);
        IbArrow.setY(y[2]);
        LV.addView(IbArrow, 97, 68);
        
        ObjectAnimator ArrowAnim = ObjectAnimator.ofFloat(IbArrow, "Y", 140f,120f);
        ArrowAnim.setRepeatCount(-1);
        ArrowAnim.setRepeatMode(ObjectAnimator.REVERSE);
        ArrowAnim.setDuration(1000);
        //airplaneAnim.addListener(new planeAnimationControl(findViewById(R.id.airplane)));
        ArrowAnim.start();
        
        AnimationDrawable neon = new AnimationDrawable();
        neon.addFrame(getResources().getDrawable(R.drawable.neon_a), 1000);
    	neon.addFrame(getResources().getDrawable(R.drawable.neon_b), 1000);
    	neon.setOneShot(false);
    	
        ImageView IbNeonOpen = new ImageView(this);
    	IbNeonOpen.setImageDrawable(neon);
        IbNeonOpen.setY(y[3]);
        IbNeonOpen.setX(x[3]);
    	LV.addView(IbNeonOpen, 97, 68);
    	
    	neon.start();
    	/*
    	ObjectAnimator NeonAnim = ObjectAnimator.ofObject(IbNeonOpen, "src", ,Uri.parse(imageRes[3]),Uri.parse(imageRes[4])); //ObjectAnimator.ofFloat(IbNeonOpen, "Y", Uri.parse(imageRes[3]),Uri.parse(imageRes[4]));
    	NeonAnim.setRepeatCount(-1);
    	NeonAnim.setRepeatMode(ObjectAnimator.RESTART);
    	NeonAnim.setDuration(1000);
        //airplaneAnim.addListener(new planeAnimationControl(findViewById(R.id.airplane)));
    	NeonAnim.start();
    	*/
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
