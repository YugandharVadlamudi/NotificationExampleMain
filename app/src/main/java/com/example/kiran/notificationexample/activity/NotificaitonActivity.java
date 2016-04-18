package com.example.kiran.notificationexample.activity;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kiran.notificationexample.R;

/**
 * Created by Kiran on 18-04-2016.
 */
public class NotificaitonActivity extends Activity {
    TextView textView;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificationactivity);
        textView=new TextView(NotificaitonActivity.this);
        textView.setText("called Activity");
        linearLayout=(LinearLayout)findViewById(R.id.lnr_head);
        linearLayout.addView(textView);
    }

    /*@Override
    public void onBackPressed() {
        System.exit(0);
    }*/
}
