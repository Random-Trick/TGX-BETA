package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import p012ab.AbstractC0243a;

public class SonyHomeBadger implements AbstractC0243a {
    public final Uri f21959a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    public AsyncQueryHandler f21960b;

    public static void m18377d(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        context.sendBroadcast(intent);
    }

    public static boolean m18373h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    @Override
    public List<String> mo18371a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override
    public void mo18370b(Context context, ComponentName componentName, int i) {
        if (m18373h(context)) {
            m18376e(context, componentName, i);
        } else {
            m18377d(context, componentName, i);
        }
    }

    public final ContentValues m18378c(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    public final void m18376e(Context context, ComponentName componentName, int i) {
        if (i >= 0) {
            ContentValues c = m18378c(i, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f21960b == null) {
                    this.f21960b = new AsyncQueryHandler(context.getApplicationContext().getContentResolver()) {
                    };
                }
                m18375f(c);
                return;
            }
            m18374g(context, c);
        }
    }

    public final void m18375f(ContentValues contentValues) {
        this.f21960b.startInsert(0, null, this.f21959a, contentValues);
    }

    public final void m18374g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f21959a, contentValues);
    }
}
