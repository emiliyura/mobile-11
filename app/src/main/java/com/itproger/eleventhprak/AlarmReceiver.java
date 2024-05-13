package com.itproger.eleventhprak;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AlarmReceiver extends BroadcastReceiver {

   @Override
 public void onReceive(Context context, Intent intent) {
     NotificationCompat.Builder builder = new NotificationCompat.Builder(context, MainActivity.CHANNEL_ID).setSmallIcon(R.drawable.ic_notification).setContentTitle("Delayed Notification").setContentText("This is your schedulednotification.").setPriority(NotificationCompat.PRIORITY_DEFAULT);
     NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
     notificationManager.notify(1, builder.build());
 }
}
