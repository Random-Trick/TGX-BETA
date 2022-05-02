package p118i5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p163l5.C6380r1;
import p232q5.C8248h;
import p261s5.C8645b;

public class C5221e {
    public static final int f17368a = C5224h.f17372a;
    public static final C5221e f17369b = new C5221e();

    @RecentlyNonNull
    public static C5221e m23586h() {
        return f17369b;
    }

    public void m23593a(@RecentlyNonNull Context context) {
        C5224h.m23577a(context);
    }

    public int m23592b(@RecentlyNonNull Context context) {
        return C5224h.m23576b(context);
    }

    @RecentlyNullable
    @Deprecated
    public Intent m23591c(int i) {
        return mo23590d(null, i, null);
    }

    @RecentlyNullable
    public Intent mo23590d(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && C8248h.m13046e(context)) {
                return C6380r1.m20499c();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f17368a);
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
                    sb2.append(C8645b.m11820a(context).m11821d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C6380r1.m20500b("com.google.android.gms", sb2.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C6380r1.m20501a("com.google.android.gms");
        }
    }

    @RecentlyNullable
    public PendingIntent mo23589e(@RecentlyNonNull Context context, int i, int i2) {
        return m23588f(context, i, i2, null);
    }

    @RecentlyNullable
    public PendingIntent m23588f(@RecentlyNonNull Context context, int i, int i2, String str) {
        Intent d = mo23590d(context, i, str);
        if (d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d, 134217728);
    }

    public String mo23587g(int i) {
        return C5224h.m23575c(i);
    }

    public int mo23585i(@RecentlyNonNull Context context) {
        return mo23584j(context, f17368a);
    }

    public int mo23584j(@RecentlyNonNull Context context, int i) {
        int f = C5224h.m23572f(context, i);
        if (C5224h.m23571g(context, f)) {
            return 18;
        }
        return f;
    }

    public boolean m23583k(@RecentlyNonNull Context context, int i) {
        return C5224h.m23571g(context, i);
    }

    public boolean m23582l(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return C5224h.m23568j(context, str);
    }

    public boolean mo23581m(int i) {
        return C5224h.m23569i(i);
    }
}
