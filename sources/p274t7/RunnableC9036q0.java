package p274t7;

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
import com.google.firebase.messaging.C3524a;
import java.io.IOException;

public class RunnableC9036q0 implements Runnable {
    public static final Object f28995O = new Object();
    public static Boolean f28996P;
    public static Boolean f28997Q;
    public final C9034p0 f28998M;
    public final long f28999N;
    public final Context f29000a;
    public final C9010e0 f29001b;
    public final PowerManager.WakeLock f29002c;

    public class C9037a extends BroadcastReceiver {
        public RunnableC9036q0 f29003a;

        public C9037a(RunnableC9036q0 q0Var) {
            this.f29003a = q0Var;
        }

        public void m10618a() {
            if (RunnableC9036q0.m10619j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC9036q0.this.f29000a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC9036q0 q0Var = this.f29003a;
            if (q0Var != null) {
                if (q0Var.m10620i()) {
                    if (RunnableC9036q0.m10619j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f29003a.f28998M.m10634k(this.f29003a, 0L);
                    context.unregisterReceiver(this);
                    this.f29003a = null;
                }
            }
        }
    }

    public RunnableC9036q0(C9034p0 p0Var, Context context, C9010e0 e0Var, long j) {
        this.f28998M = p0Var;
        this.f29000a = context;
        this.f28999N = j;
        this.f29001b = e0Var;
        this.f29002c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String m10624e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 142);
        sb2.append("Missing Permission: ");
        sb2.append(str);
        sb2.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb2.toString();
    }

    public static boolean m10623f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f28995O) {
            Boolean bool = f28997Q;
            if (bool == null) {
                z = m10622g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f28997Q = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean m10622g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", m10624e(str));
        return false;
    }

    public static boolean m10621h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f28995O) {
            Boolean bool = f28996P;
            if (bool == null) {
                z = m10622g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f28996P = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean m10619j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final synchronized boolean m10620i() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f29000a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override
    @SuppressLint({"Wakelock"})
    public void run() {
        if (m10621h(this.f29000a)) {
            this.f29002c.acquire(C3524a.f11771a);
        }
        try {
            try {
                this.f28998M.m10633l(true);
                if (!this.f29001b.m10705g()) {
                    this.f28998M.m10633l(false);
                    if (m10621h(this.f29000a)) {
                        try {
                            this.f29002c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (!m10623f(this.f29000a) || m10620i()) {
                    if (this.f28998M.m10630o()) {
                        this.f28998M.m10633l(false);
                    } else {
                        this.f28998M.m10629p(this.f28999N);
                    }
                    if (m10621h(this.f29000a)) {
                        try {
                            this.f29002c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    new C9037a(this).m10618a();
                    if (m10621h(this.f29000a)) {
                        try {
                            this.f29002c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f28998M.m10633l(false);
                if (m10621h(this.f29000a)) {
                    try {
                        this.f29002c.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (m10621h(this.f29000a)) {
                try {
                    this.f29002c.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
