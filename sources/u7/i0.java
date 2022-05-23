package u7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public class i0 {
    public static i0 f23633e;
    @GuardedBy("this")
    public String f23634a = null;
    public Boolean f23635b = null;
    public Boolean f23636c = null;
    public final Queue<Intent> f23637d = new ArrayDeque();

    public static synchronized i0 b() {
        i0 i0Var;
        synchronized (i0.class) {
            if (f23633e == null) {
                f23633e = new i0();
            }
            i0Var = f23633e;
        }
        return i0Var;
    }

    public final int a(Context context, Intent intent) {
        ComponentName componentName;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", f10.length() != 0 ? "Restricting intent to a specific service: ".concat(f10) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                componentName = r0.e(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf);
            Log.e("FirebaseMessaging", sb2.toString());
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return 401;
        }
    }

    public Intent c() {
        return this.f23637d.poll();
    }

    public boolean d(Context context) {
        if (this.f23636c == null) {
            this.f23636c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f23635b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f23636c.booleanValue();
    }

    public boolean e(Context context) {
        if (this.f23635b == null) {
            this.f23635b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f23635b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f23635b.booleanValue();
    }

    public final synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f23634a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (!(resolveService == null || (serviceInfo = resolveService.serviceInfo) == null)) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.f23634a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.f23634a = serviceInfo.name;
                }
                return this.f23634a;
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

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f23637d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
