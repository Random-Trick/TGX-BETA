package bb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import p012ab.C0244b;

public class C1304a {
    public static List<ResolveInfo> m37787a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    public static void m37786b(Context context, Intent intent) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                m37785c(context, intent2);
                z = true;
            } catch (C0244b unused) {
            }
        }
        if (!z) {
            m37785c(context, intent);
        }
    }

    public static void m37785c(Context context, Intent intent) {
        List<ResolveInfo> a = m37787a(context, intent);
        if (a.size() != 0) {
            for (ResolveInfo resolveInfo : a) {
                Intent intent2 = new Intent(intent);
                if (resolveInfo != null) {
                    intent2.setPackage(resolveInfo.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        throw new C0244b("unable to resolve intent: " + intent.toString());
    }
}
