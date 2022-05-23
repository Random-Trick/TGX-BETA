package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import bb.a;
import cb.b;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger implements a {
    public static final String[] f17498b = {"_id", "class"};
    public DefaultBadger f17499a = new DefaultBadger();

    @Override
    public List<String> a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        DefaultBadger defaultBadger = this.f17499a;
        if (defaultBadger == null || !defaultBadger.c(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f17498b, "package=?", new String[]{componentName.getPackageName()}, null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z10 = false;
                    while (cursor.moveToNext()) {
                        contentResolver.update(parse, c(componentName, i10, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        contentResolver.insert(parse, c(componentName, i10, true));
                    }
                }
            } finally {
                b.a(cursor);
            }
        } else {
            this.f17499a.b(context, componentName, i10);
        }
    }

    public final ContentValues c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }
}
