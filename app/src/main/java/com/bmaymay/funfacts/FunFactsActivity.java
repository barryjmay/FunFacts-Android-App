package com.bmaymay.funfacts;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view Variables & assign them the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.master_layout);
        final FactBook mFactBook = new FactBook(this);
        final ColorWheel mColorWheel = new ColorWheel(this);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                //Update the label with our dynamic fact
                factLabel.setText(fact);

                int selectedColor = mColorWheel.selectColor();
                relativeLayout.setBackgroundColor(selectedColor);
                showFactButton.setTextColor(selectedColor);
            }
        };
            showFactButton.setOnClickListener(listener);
           //Toast.makeText(this, "Yay! Our activity was created!", Toast.LENGTH_LONG ).show();
        Log.d(TAG, "We're logging from the onCreate() method");



    }



}
