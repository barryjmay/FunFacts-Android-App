package com.bmaymay.funfacts;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;

import java.util.Random;

/**
 * Created by BMay on 26/08/2014.
 */
public class ColorWheel extends ContextWrapper {
    //Member Vars
    public String mColors [];

    public ColorWheel(Context base) {
        super(base);
        mColors = getResources().getStringArray(R.array.color_wheel);
    }

    //Methods
    public int selectColor(){
        //Randomly select a color
        //Instantiating randomGenerator
        Random randomGenerator = new Random();
        int randomColor = randomGenerator.nextInt(mColors.length);
        String color = mColors[randomColor];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
