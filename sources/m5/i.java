package m5;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

public abstract class i {
    public static int f17213a = 4225;
    public static final Object f17214b = new Object();
    public static i f17215c;

    public static int a() {
        return f17213a;
    }

    @RecentlyNonNull
    public static i b(@RecentlyNonNull Context context) {
        synchronized (f17214b) {
            if (f17215c == null) {
                f17215c = new p1(context.getApplicationContext());
            }
        }
        return f17215c;
    }

    public final void c(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i10, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z10) {
        e(new l1(str, str2, i10, z10), serviceConnection, str3);
    }

    public abstract boolean d(l1 l1Var, ServiceConnection serviceConnection, String str);

    public abstract void e(l1 l1Var, ServiceConnection serviceConnection, String str);
}
