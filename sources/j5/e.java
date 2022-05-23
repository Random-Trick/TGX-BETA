package j5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import m5.r1;
import r5.h;
import t5.b;

public class e {
    public static final int f15074a = h.f15078a;
    public static final e f15075b = new e();

    @RecentlyNonNull
    public static e h() {
        return f15075b;
    }

    public void a(@RecentlyNonNull Context context) {
        h.a(context);
    }

    public int b(@RecentlyNonNull Context context) {
        return h.b(context);
    }

    @RecentlyNullable
    @Deprecated
    public Intent c(int i10) {
        return d(null, i10, null);
    }

    @RecentlyNullable
    public Intent d(Context context, int i10, String str) {
        if (i10 == 1 || i10 == 2) {
            if (context != null && h.e(context)) {
                return r1.c();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f15074a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(b.a(context).d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return r1.b("com.google.android.gms", sb2.toString());
        } else if (i10 != 3) {
            return null;
        } else {
            return r1.a("com.google.android.gms");
        }
    }

    @RecentlyNullable
    public PendingIntent e(@RecentlyNonNull Context context, int i10, int i11) {
        return f(context, i10, i11, null);
    }

    @RecentlyNullable
    public PendingIntent f(@RecentlyNonNull Context context, int i10, int i11, String str) {
        Intent d10 = d(context, i10, str);
        if (d10 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, d10, 134217728);
    }

    public String g(int i10) {
        return h.c(i10);
    }

    public int i(@RecentlyNonNull Context context) {
        return j(context, f15074a);
    }

    public int j(@RecentlyNonNull Context context, int i10) {
        int f10 = h.f(context, i10);
        if (h.g(context, f10)) {
            return 18;
        }
        return f10;
    }

    public boolean k(@RecentlyNonNull Context context, int i10) {
        return h.g(context, i10);
    }

    public boolean l(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return h.j(context, str);
    }

    public boolean m(int i10) {
        return h.i(i10);
    }
}
