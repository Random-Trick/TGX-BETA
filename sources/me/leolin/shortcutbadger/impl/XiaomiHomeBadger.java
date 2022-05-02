package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import bb.C1304a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.thunderdog.challegram.Log;
import p012ab.AbstractC0243a;
import p012ab.C0244b;

@Deprecated
public class XiaomiHomeBadger implements AbstractC0243a {
    public ResolveInfo f21962a;

    @Override
    public List<String> mo18371a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override
    public void mo18370b(Context context, ComponentName componentName, int i) {
        Object valueOf;
        Object obj = "";
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                valueOf = obj;
            } else {
                try {
                    valueOf = Integer.valueOf(i);
                } catch (Exception unused) {
                    declaredField.set(newInstance, Integer.valueOf(i));
                }
            }
            declaredField.set(newInstance, String.valueOf(valueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            if (i != 0) {
                obj = Integer.valueOf(i);
            }
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(obj));
            try {
                C1304a.m37785c(context, intent);
            } catch (C0244b unused3) {
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            m18372c(context, i);
        }
    }

    @TargetApi(16)
    public final void m18372c(Context context, int i) {
        if (this.f21962a == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.f21962a = context.getPackageManager().resolveActivity(intent, Log.TAG_COMPRESS);
        }
        if (this.f21962a != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Notification build = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f21962a.getIconResource()).build();
            try {
                Object obj = build.getClass().getDeclaredField("extraNotification").get(build);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
                notificationManager.notify(0, build);
            } catch (Exception e) {
                throw new C0244b("not able to set badge", e);
            }
        }
    }
}
