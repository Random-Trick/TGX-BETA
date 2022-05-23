package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import bb.a;
import java.util.Collections;
import java.util.List;

public class ZukHomeBadger implements a {
    public final Uri f17504a = Uri.parse("content://com.android.badge/badge");

    @Override
    public List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override
    @TargetApi(11)
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f17504a, "setAppBadgeCount", (String) null, bundle);
    }
}
