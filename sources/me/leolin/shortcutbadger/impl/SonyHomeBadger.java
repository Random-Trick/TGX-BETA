package me.leolin.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import bb.a;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements a {
    public final Uri f17500a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    public AsyncQueryHandler f17501b;

    public static void d(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i10));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i10 > 0);
        context.sendBroadcast(intent);
    }

    public static boolean h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    @Override
    public List<String> a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        if (h(context)) {
            e(context, componentName, i10);
        } else {
            d(context, componentName, i10);
        }
    }

    public final ContentValues c(int i10, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i10));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    public final void e(Context context, ComponentName componentName, int i10) {
        if (i10 >= 0) {
            ContentValues c10 = c(i10, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f17501b == null) {
                    this.f17501b = new AsyncQueryHandler(context.getApplicationContext().getContentResolver()) {
                    };
                }
                f(c10);
                return;
            }
            g(context, c10);
        }
    }

    public final void f(ContentValues contentValues) {
        this.f17501b.startInsert(0, null, this.f17500a, contentValues);
    }

    public final void g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f17500a, contentValues);
    }
}
