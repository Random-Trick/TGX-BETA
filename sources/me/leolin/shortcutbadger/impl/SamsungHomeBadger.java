package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import bb.C1305b;
import java.util.Arrays;
import java.util.List;
import p012ab.AbstractC0243a;

public class SamsungHomeBadger implements AbstractC0243a {
    public static final String[] f21954b = {"_id", "class"};
    public DefaultBadger f21955a;

    public SamsungHomeBadger() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f21955a = new DefaultBadger();
        }
    }

    @Override
    public List<String> mo18371a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override
    public void mo18370b(Context context, ComponentName componentName, int i) {
        DefaultBadger defaultBadger = this.f21955a;
        if (defaultBadger == null || !defaultBadger.m18382c(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f21954b, "package=?", new String[]{componentName.getPackageName()}, null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        contentResolver.update(parse, m18379c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, m18379c(componentName, i, true));
                    }
                }
            } finally {
                C1305b.m37781a(cursor);
            }
        } else {
            this.f21955a.mo18370b(context, componentName, i);
        }
    }

    public final ContentValues m18379c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }
}
