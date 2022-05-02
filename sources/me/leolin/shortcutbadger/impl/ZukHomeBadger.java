package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p012ab.AbstractC0243a;

public class ZukHomeBadger implements AbstractC0243a {
    public final Uri f21963a = Uri.parse("content://com.android.badge/badge");

    @Override
    public List<String> mo18371a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override
    @TargetApi(11)
    public void mo18370b(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f21963a, "setAppBadgeCount", (String) null, bundle);
    }
}
