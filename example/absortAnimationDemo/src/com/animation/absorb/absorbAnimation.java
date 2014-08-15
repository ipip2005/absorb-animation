package com.animation.absorb;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public class absorbAnimation extends Animation{
	private int absorb_x, absorb_y, center_x, center_y;
	private boolean direction = true;
	public static final boolean CLOCKWISE = true;
	public static final boolean ANTICLOCKWISE = false;
	public absorbAnimation(int absorb_x, int absorb_y){
		super();
		this.absorb_x = absorb_x;
		this.absorb_y = absorb_y;
	}
	public void setAbsorbCoordinate(int absorb_x, int absorb_y){
		this.absorb_x = absorb_x;
		this.absorb_y = absorb_y;
	}
	public void setDirection(boolean clockwise){
		direction = clockwise;
	}
	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t){
		Matrix matrix = t.getMatrix();
		/**
		 * basic animation algorithm here.
		 */
		
		matrix.pre
	}
	
	@Override
	public void initialize(int width, int height, int parentWidth, int parentHeight){
		center_x = width/2;
		center_y = height/2;
		setFillAfter(true);
		setInterpolator(new LinearInterpolator());
	}
}
