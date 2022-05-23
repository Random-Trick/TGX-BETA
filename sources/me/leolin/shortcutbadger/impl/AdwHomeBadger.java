package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bb.a;
import java.util.Arrays;
import java.util.List;

public class AdwHomeBadger implements a {
    @Override
    public List<String> a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i10);
        cb.a.c(context, intent);
    }
}
