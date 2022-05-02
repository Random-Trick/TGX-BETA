package p218p5;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import org.thunderdog.challegram.Log;
import p126j$.util.concurrent.ConcurrentHashMap;
import p163l5.AbstractC6377q1;
import p163l5.C6378r;
import p261s5.C8645b;

public class C8050a {
    public static final Object f26223b = new Object();
    @Nullable
    public static volatile C8050a f26224c;
    @RecentlyNonNull
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f26225a = new ConcurrentHashMap<>();

    @RecentlyNonNull
    public static C8050a m13701b() {
        if (f26224c == null) {
            synchronized (f26223b) {
                if (f26224c == null) {
                    f26224c = new C8050a();
                }
            }
        }
        C8050a aVar = f26224c;
        C6378r.m20507k(aVar);
        return aVar;
    }

    public static boolean m13697f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof AbstractC6377q1);
    }

    @SuppressLint({"UntrackedBindService"})
    public static void m13696g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public boolean m13702a(@RecentlyNonNull Context context, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return m13698e(context, context.getClass().getName(), intent, serviceConnection, i, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public void m13700c(@RecentlyNonNull Context context, @RecentlyNonNull ServiceConnection serviceConnection) {
        if (!m13697f(serviceConnection) || !this.f26225a.containsKey(serviceConnection)) {
            m13696g(context, serviceConnection);
            return;
        }
        try {
            m13696g(context, this.f26225a.get(serviceConnection));
        } finally {
            this.f26225a.remove(serviceConnection);
        }
    }

    public final boolean m13699d(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull Intent intent, @RecentlyNonNull ServiceConnection serviceConnection, int i) {
        return m13698e(context, str, intent, serviceConnection, i, true);
    }

    @SuppressLint({"UntrackedBindService"})
    public final boolean m13698e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C8645b.m11819a(context).m11822b(packageName, 0).flags & Log.TAG_ACCOUNTS) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m13697f(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection putIfAbsent = this.f26225a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            android.util.Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (bindService) {
                return bindService;
            }
            return false;
        } finally {
            this.f26225a.remove(serviceConnection, serviceConnection);
        }
    }
}
