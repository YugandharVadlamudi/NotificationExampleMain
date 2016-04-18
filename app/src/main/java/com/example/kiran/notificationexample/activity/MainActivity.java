package com.example.kiran.notificationexample.activity;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.kiran.notificationexample.R;

public class MainActivity extends Activity implements View.OnClickListener {
Button btClickNotification;
    int notificationId=1;
String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initilization();
    }

    private void initilization() {
        btClickNotification=(Button)findViewById(R.id.btClickNotification);
        btClickNotification.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Log.e(TAG, "onClick: called" );
        /*
        * calling an activity
        * */
        Intent in=new Intent(this,NotificaitonActivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(),0,in,0);
        Notification notification=new Notification.Builder(getApplicationContext())
                                    .setTicker("hello")
                                    .setContentTitle("Content Title")
                                    .setContentText("Content Text")
                                    .setSmallIcon(R.drawable.entypo_sixty_four)
                /*calling an activity method by clicking the notification */
                                    .setContentIntent(pendingIntent)
                /*
                * after clicking cancle the notfication 
                * */
                .setAutoCancel(true)
                                    .getNotification();
        NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0,notification);

    }

}
