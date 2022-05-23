package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bb.a;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class LGHomeBadger implements a {
    @Override
    public List<String> a() {
        return Arrays.asList("com.lge.launcher", "com.lge.launcher2");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        cb.a.b(context, intent);
    }
}
