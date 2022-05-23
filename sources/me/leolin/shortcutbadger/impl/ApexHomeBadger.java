package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bb.a;
import java.util.Arrays;
import java.util.List;

public class ApexHomeBadger implements a {
    @Override
    public List<String> a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", componentName.getClassName());
        cb.a.c(context, intent);
    }
}
