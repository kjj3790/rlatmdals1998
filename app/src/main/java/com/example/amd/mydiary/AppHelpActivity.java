package com.example.amd.mydiary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AppHelpActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        TextView textview = new TextView(this);
        textview.setTextSize(20);
        textview.setText("나만의 일기장" + "\n"+ "만든이: 김승민");
        setContentView(textview);
    }
}
