package p274t7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public class C9019i0 {
    public static C9019i0 f28947e;
    @GuardedBy("this")
    public String f28948a = null;
    public Boolean f28949b = null;
    public Boolean f28950c = null;
    public final Queue<Intent> f28951d = new ArrayDeque();

    public static synchronized C9019i0 m10688b() {
        C9019i0 i0Var;
        synchronized (C9019i0.class) {
            if (f28947e == null) {
                f28947e = new C9019i0();
            }
            i0Var = f28947e;
        }
        return i0Var;
    }

    public final int m10689a(Context context, Intent intent) {
        ComponentName componentName;
        String f = m10684f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", f.length() != 0 ? "Restricting intent to a specific service: ".concat(f) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (m10685e(context)) {
                componentName = C9039r0.m10612e(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf);
            Log.e("FirebaseMessaging", sb2.toString());
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    public Intent m10687c() {
        return this.f28951d.poll();
    }

    public boolean m10686d(Context context) {
        if (this.f28950c == null) {
            this.f28950c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f28949b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f28950c.booleanValue();
    }

    public boolean m10685e(Context context) {
        if (this.f28949b == null) {
            this.f28949b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f28949b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f28949b.booleanValue();
    }

    public final synchronized String m10684f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f28948a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (!(resolveService == null || (serviceInfo = resolveService.serviceInfo) == null)) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.f28948a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.f28948a = serviceInfo.name;
                }
                return this.f28948a;
            }
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
            sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb2.append(str3);
            sb2.append("/");
            sb2.append(str4);
            Log.e("FirebaseMessaging", sb2.toString());
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public int m10683g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f28951d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m10689a(context, intent2);
    }
}
