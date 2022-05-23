package q5;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import m5.q1;
import m5.r;
import org.thunderdog.challegram.Log;
import t5.b;

public class a {
    public static final Object f21423b = new Object();
    @Nullable
    public static volatile a f21424c;
    @RecentlyNonNull
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f21425a = new ConcurrentHashMap<>();

    @RecentlyNonNull
    public static a b() {
        if (f21424c == null) {
            synchronized (f21423b) {
                if (f21424c == null) {
                    f21424c = new a();
                }
            }
        }
        a aVar = f21424c;
        r.k(aVar);
        return aVar;
    }

    public static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof q1);
    }

    @SuppressLint({"UntrackedBindService"})
    public static void g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i10) {
        return e(context, context.getClass().getName(), intent, serviceConnection, i10, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.f21425a.containsKey(serviceConnection)) {
            g(context, serviceConnection);
            return;
        }
        try {
            g(context, this.f21425a.get(serviceConnection));
        } finally {
            this.f21425a.remove(serviceConnection);
        }
    }

    public final boolean d(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i10) {
        return e(context, str, intent, serviceConnection, i10, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((b.a(context).b(packageName, 0).flags & Log.TAG_ACCOUNTS) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i10);
        }
        ServiceConnection putIfAbsent = this.f21425a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            android.util.Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i10);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            this.f21425a.remove(serviceConnection, serviceConnection);
        }
    }
}
