package p163l5;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

public abstract class AbstractC6349i {
    public static int f19957a = 4225;
    public static final Object f19958b = new Object();
    public static AbstractC6349i f19959c;

    public static int m20576a() {
        return f19957a;
    }

    @RecentlyNonNull
    public static AbstractC6349i m20575b(@RecentlyNonNull Context context) {
        synchronized (f19958b) {
            if (f19959c == null) {
                f19959c = new C6373p1(context.getApplicationContext());
            }
        }
        return f19959c;
    }

    public final void m20574c(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z) {
        mo20530e(new C6361l1(str, str2, i, z), serviceConnection, str3);
    }

    public abstract boolean mo20531d(C6361l1 l1Var, ServiceConnection serviceConnection, String str);

    public abstract void mo20530e(C6361l1 l1Var, ServiceConnection serviceConnection, String str);
}
