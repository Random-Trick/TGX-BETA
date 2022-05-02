package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import bb.C1304a;
import java.util.Collections;
import java.util.List;
import p012ab.AbstractC0243a;

public class OPPOHomeBader implements AbstractC0243a {
    public int f21953a = -1;

    @Override
    public List<String> mo18371a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override
    public void mo18370b(Context context, ComponentName componentName, int i) {
        if (this.f21953a != i) {
            this.f21953a = i;
            if (Build.VERSION.SDK_INT >= 11) {
                m18380d(context, i);
            } else {
                m18381c(context, componentName, i);
            }
        }
    }

    public final void m18381c(Context context, ComponentName componentName, int i) {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        C1304a.m37782c(context, intent);
    }

    @TargetApi(11)
    public final void m18380d(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}
