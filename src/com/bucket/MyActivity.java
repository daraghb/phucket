package com.bucket;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class MyActivity extends Activity
{

    DrawView drawView;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        drawView = new DrawView(this);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);

    }
}
