package p227q0;

import android.content.Context;
import android.os.Process;
import p016b1.C1128d;
import p213p0.C7949c;

public final class C8127c {
    public static int m13410a(Context context, String str, int i, int i2, String str2) {
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String c = C7949c.m14014c(str);
        if (c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i2 && C1128d.m38333a(context.getPackageName(), str2)) {
            i3 = C7949c.m14016a(context, i2, c, str2);
        } else {
            i3 = C7949c.m14015b(context, c, str2);
        }
        return i3 == 0 ? 0 : -2;
    }

    public static int m13409b(Context context, String str) {
        return m13410a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
