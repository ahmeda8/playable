package com.briodek.playable;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.Animator.AnimatorListener;
import android.view.View;

public class animationMapControl implements AnimatorListener {

	View view;
	public animationMapControl(View findViewById) {
		// TODO Auto-generated constructor stub
		this.view = findViewById;
	}
	@Override
	public void onAnimationCancel(Animator animation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationEnd(Animator animation) {
		// TODO Auto-generated method stub
		animation = ObjectAnimator.ofFloat(view, "X", -3000f,0f);
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

	
}
