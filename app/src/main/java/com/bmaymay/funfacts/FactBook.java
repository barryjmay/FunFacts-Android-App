package com.bmaymay.funfacts;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Bundle;

import java.util.Random;

/**
 * Created by BMay on 26/08/2014.
 */
//FactBook has to extend the ContextWrapper to access the string array contained in Resources
//Reason: the getResources method is a non-static method and can't be referenced from a subclass of
//FunFactsActivity
public class FactBook extends ContextWrapper{
    //Initialise mFacts
    private String mFacts[];
    //This method generates automatically when we get FactBook to extend ContextWrapper
    public FactBook(Context base) {
        super(base);
        //This is where we need to put the getResources() method
        mFacts = getResources().getStringArray(R.array.fact_book);
    }

    public String getFact() {
        //Randomly select a fact
        //Instantiating randomGenerator
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        String fact = mFacts[randomNumber];
        return fact;
    }



}
