package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import bb.a;
import java.util.Arrays;
import java.util.List;

public class EverythingMeHomeBadger implements a {
    @Override
    public List<String> a() {
        return Arrays.asList("me.everything.launcher");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i10));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
