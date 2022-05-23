package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import bb.a;
import bb.b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.thunderdog.challegram.Log;

@Deprecated
public class XiaomiHomeBadger implements a {
    public ResolveInfo f17503a;

    @Override
    public List<String> a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        Object valueOf;
        Object obj = "";
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i10 == 0) {
                valueOf = obj;
            } else {
                try {
                    valueOf = Integer.valueOf(i10);
                } catch (Exception unused) {
                    declaredField.set(newInstance, Integer.valueOf(i10));
                }
            }
            declaredField.set(newInstance, String.valueOf(valueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            if (i10 != 0) {
                obj = Integer.valueOf(i10);
            }
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
            try {
                cb.a.c(context, intent);
            } catch (b unused3) {
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            c(context, i10);
        }
    }

    @TargetApi(16)
    public final void c(Context context, int i10) {
        if (this.f17503a == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.f17503a = context.getPackageManager().resolveActivity(intent, Log.TAG_COMPRESS);
        }
        if (this.f17503a != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Notification build = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f17503a.getIconResource()).build();
            try {
                Object obj = build.getClass().getDeclaredField("extraNotification").get(build);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
                notificationManager.notify(0, build);
            } catch (Exception e10) {
                throw new b("not able to set badge", e10);
            }
        }
    }
}
