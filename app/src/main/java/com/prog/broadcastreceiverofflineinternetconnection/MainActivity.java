package com.prog.broadcastreceiverofflineinternetconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static TextView txt_off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_off = (TextView) findViewById(R.id.txt_off);

        OfflineBroadcastReceiver offlineForeground = new OfflineBroadcastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(offlineForeground, filter);
    }
    public static void isConnected(boolean offline)
    {
        if(!offline)
        {
            txt_off.setText("Not Connected");
        }
        else
        {
            txt_off.setText("Connected");
        }
    }

}