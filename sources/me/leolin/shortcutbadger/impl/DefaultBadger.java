package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import bb.a;
import java.util.Arrays;
import java.util.List;

public class DefaultBadger implements a {
    @Override
    public List<String> a() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        cb.a.b(context, intent);
    }

    public boolean c(Context context) {
        return cb.a.a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() > 0 || (Build.VERSION.SDK_INT >= 26 && cb.a.a(context, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0);
    }
}
