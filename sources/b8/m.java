package b8;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import c6.i;
import java.util.List;

public class m {
    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        b(context, i.u(str));
    }

    public static void b(@RecentlyNonNull Context context, @RecentlyNonNull List<String> list) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        context.sendBroadcast(intent);
    }
}
