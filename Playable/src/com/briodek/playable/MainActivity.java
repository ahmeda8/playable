package com.briodek.playable;

import android.net.Uri;
import android.os.Bundle;
import android.widget.*;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation.AnimationListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        LinearLayout LV = (LinearLayout)findViewById(R.id.linearLayout1);
        ObjectAnimator airplaneAnim = ObjectAnimator.ofFloat(findViewById(R.id.airplane), "X", 0f,3000f);
        airplaneAnim.setRepeatMode(ObjectAnimator.INFINITE);
        airplaneAnim.setDuration(10000);
        airplaneAnim.addListener(new planeAnimationControl(findViewById(R.id.airplane)));
        airplaneAnim.start();
        
        ObjectAnimator ani = ObjectAnimator.ofFloat(findViewById(R.id.linearLayout1), "X", 0f,-3000f);
        ani.setDuration(5000);
        ani.addListener(new animationMapControl(findViewById(R.id.linearLayout1)));
        ani.start();
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
