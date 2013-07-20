package com.briodek.playable;

import android.os.Bundle;
import android.widget.*;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation.AnimationListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //HorizontalScrollView hv = (HorizontalScrollView)findViewById(R.id.horizontalScrollView1);
        ObjectAnimator ani = ObjectAnimator.ofFloat(findViewById(R.id.linearLayout1), "X", 0f,-3000f);
        ani.setDuration(5000);
        ani.addListener(new AnimatorListener() {
        	
			@Override
			public void onAnimationCancel(Animator animation) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationEnd(Animator animation) {
				// TODO Auto-generated method stub
				animation = ObjectAnimator.ofFloat(findViewById(R.id.linearLayout1), "X", -3000f,0f);
				animation.setDuration(5000);
				animation.start();
				
			}

			@Override
			public void onAnimationRepeat(Animator animation) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onAnimationStart(Animator animation) {
				// TODO Auto-generated method stub
				
			}
        });
        ani.start();
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}