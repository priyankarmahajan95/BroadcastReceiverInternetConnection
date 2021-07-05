package com.prog.broadcastreceiverofflineinternetconnection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class OfflineBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {
        if (!Utils.checkConnection(context))
        {
           /* Intent offline = new Intent(context, OfflineActivity.class);
            context.startActivity(offline);*/
            MainActivity.isConnected(false);
        }
        // Connected
        else
        {
            /*Intent offline = new Intent(context, Connected.class);
            context.startActivity(offline);*/
            MainActivity.isConnected(true);
        }

    }
}