package u7;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

public class q0 implements Runnable {
    public static final Object O = new Object();
    public static Boolean P;
    public static Boolean Q;
    public final p0 M;
    public final long N;
    public final Context f23683a;
    public final e0 f23684b;
    public final PowerManager.WakeLock f23685c;

    public class a extends BroadcastReceiver {
        public q0 f23686a;

        public a(q0 q0Var) {
            this.f23686a = q0Var;
        }

        public void a() {
            if (q0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            q0.this.f23683a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override
        public synchronized void onReceive(Context context, Intent intent) {
            q0 q0Var = this.f23686a;
            if (q0Var != null) {
                if (q0Var.i()) {
                    if (q0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f23686a.M.k(this.f23686a, 0L);
                    context.unregisterReceiver(this);
                    this.f23686a = null;
                }
            }
        }
    }

    public q0(p0 p0Var, Context context, e0 e0Var, long j10) {
        this.M = p0Var;
        this.f23683a = context;
        this.N = j10;
        this.f23684b = e0Var;
        this.f23685c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 142);
        sb2.append("Missing Permission: ");
        sb2.append(str);
        sb2.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb2.toString();
    }

    public static boolean f(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (O) {
            Boolean bool = Q;
            if (bool == null) {
                z10 = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z10 = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z10);
            Q = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (z10 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z10;
        }
        Log.d("FirebaseMessaging", e(str));
        return false;
    }

    public static boolean h(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (O) {
            Boolean bool = P;
            if (bool == null) {
                z10 = g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z10 = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z10);
            P = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final synchronized boolean i() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f23683a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    @Override
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.f23683a)) {
            this.f23685c.acquire(com.google.firebase.messaging.a.f5767a);
        }
        try {
            try {
                this.M.l(true);
                if (!this.f23684b.g()) {
                    this.M.l(false);
                    if (h(this.f23683a)) {
                        try {
                            this.f23685c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (!f(this.f23683a) || i()) {
                    if (this.M.o()) {
                        this.M.l(false);
                    } else {
                        this.M.p(this.N);
                    }
                    if (h(this.f23683a)) {
                        try {
                            this.f23685c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    new a(this).a();
                    if (h(this.f23683a)) {
                        try {
                            this.f23685c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
            } catch (IOException e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.M.l(false);
                if (h(this.f23683a)) {
                    try {
                        this.f23685c.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (h(this.f23683a)) {
                try {
                    this.f23685c.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
