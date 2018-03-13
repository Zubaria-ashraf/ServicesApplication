package com.z.serviceapplicatioon;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by mg on 3/13/2018.
 */

public class NotificationService extends Service {

    private static String TAG="Notification service";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startID){
        Log.e(TAG, "onStartCommand:");
        String a=intent.getStringExtra("Message");
        Log.e(TAG, "onStartCommand: Value of a:"+a);
        this.stopSelf();
        return START_STICKY;
    }
//    @Override
//    public void onStart(Intent intent, int startId){
//        super.onStart(intent,startId);
//        Log.e(TAG, "onStart: Service is started");
//       // this.stopSelf();
//    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "onDestroy: Service is destroyed.");
    }

}
