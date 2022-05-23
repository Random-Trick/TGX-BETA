package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import bb.a;
import java.util.Arrays;
import java.util.List;

public class HuaweiHomeBadger implements a {
    @Override
    public List<String> a() {
        return Arrays.asList("com.huawei.android.launcher");
    }

    @Override
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i10);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
