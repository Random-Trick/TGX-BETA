package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import bb.a;
import java.util.Collections;
import java.util.List;

public class OPPOHomeBader implements a {
    public int f17497a = -1;

    @Override
    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        if (this.f17497a != i10) {
            this.f17497a = i10;
            c(context, i10);
        }
    }

    @TargetApi(11)
    public final void c(Context context, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }
}
