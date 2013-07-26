package com.briodek.playable;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.view.View;

public class planeAnimationControl implements AnimatorListener {

	View view;
	public planeAnimationControl(View findView)
	{
		this.view = findView;
	}

	@Override
	public void onAnimationCancel(Animator animation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onAnimationEnd(Animator animation) {
		// TODO Auto-generated method stub
		animation = ObjectAnimator.ofFloat(view, "X", 3000f,0f);
		animation.setDuration(10000);
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
