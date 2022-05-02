package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bb.C1304a;
import java.util.Arrays;
import java.util.List;
import p012ab.AbstractC0243a;

public class AsusHomeBadger implements AbstractC0243a {
    @Override
    public List<String> mo18371a() {
        return Arrays.asList("com.asus.launcher");
    }

    @Override
    public void mo18370b(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        C1304a.m37783b(context, intent);
    }
}
