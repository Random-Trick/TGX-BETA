package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bb.C1304a;
import java.util.Collections;
import java.util.List;
import p012ab.AbstractC0243a;
import p012ab.C0244b;

public class NewHtcHomeBadger implements AbstractC0243a {
    @Override
    public List<String> mo18371a() {
        return Collections.singletonList("com.htc.launcher");
    }

    @Override
    public void mo18370b(Context context, ComponentName componentName, int i) {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        boolean z2 = false;
        try {
            C1304a.m37785c(context, intent);
            z = true;
        } catch (C0244b unused) {
            z = false;
        }
        try {
            C1304a.m37785c(context, intent2);
            z2 = true;
        } catch (C0244b unused2) {
        }
        if (!z && !z2) {
            throw new C0244b("unable to resolve intent: " + intent2.toString());
        }
    }
}
