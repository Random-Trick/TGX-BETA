package p009a8;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import p021b6.AbstractC1264i;

public class C0222m {
    public static void m42066a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        m42065b(context, AbstractC1264i.m37814u(str));
    }

    public static void m42065b(@RecentlyNonNull Context context, @RecentlyNonNull List<String> list) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        context.sendBroadcast(intent);
    }
}
