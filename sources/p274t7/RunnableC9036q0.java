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
    public static final Object f28998O = new Object();
    public static Boolean f28999P;
    public static Boolean f29000Q;
    public final C9034p0 f29001M;
    public final long f29002N;
    public final Context f29003a;
    public final C9010e0 f29004b;
    public final PowerManager.WakeLock f29005c;

    public class C9037a extends BroadcastReceiver {
        public RunnableC9036q0 f29006a;

        public C9037a(RunnableC9036q0 q0Var) {
            this.f29006a = q0Var;
        }

        public void m10617a() {
            if (RunnableC9036q0.m10618j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC9036q0.this.f29003a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC9036q0 q0Var = this.f29006a;
            if (q0Var != null) {
                if (q0Var.m10619i()) {
                    if (RunnableC9036q0.m10618j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f29006a.f29001M.m10633k(this.f29006a, 0L);
                    context.unregisterReceiver(this);
                    this.f29006a = null;
                }
            }
        }
    }

    public RunnableC9036q0(C9034p0 p0Var, Context context, C9010e0 e0Var, long j) {
        this.f29001M = p0Var;
        this.f29003a = context;
        this.f29002N = j;
        this.f29004b = e0Var;
        this.f29005c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String m10623e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 142);
        sb2.append("Missing Permission: ");
        sb2.append(str);
        sb2.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb2.toString();
    }

    public static boolean m10622f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f28998O) {
            Boolean bool = f29000Q;
            if (bool == null) {
                z = m10621g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f29000Q = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean m10621g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", m10623e(str));
        return false;
    }

    public static boolean m10620h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f28998O) {
            Boolean bool = f28999P;
            if (bool == null) {
                z = m10621g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f28999P = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean m10618j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final synchronized boolean m10619i() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f29003a.getSystemService("connectivity");
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
        if (m10620h(this.f29003a)) {
            this.f29005c.acquire(C3524a.f11771a);
        }
        try {
            try {
                this.f29001M.m10632l(true);
                if (!this.f29004b.m10704g()) {
                    this.f29001M.m10632l(false);
                    if (m10620h(this.f29003a)) {
                        try {
                            this.f29005c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (!m10622f(this.f29003a) || m10619i()) {
                    if (this.f29001M.m10629o()) {
                        this.f29001M.m10632l(false);
                    } else {
                        this.f29001M.m10628p(this.f29002N);
                    }
                    if (m10620h(this.f29003a)) {
                        try {
                            this.f29005c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    new C9037a(this).m10617a();
                    if (m10620h(this.f29003a)) {
                        try {
                            this.f29005c.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f29001M.m10632l(false);
                if (m10620h(this.f29003a)) {
                    try {
                        this.f29005c.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th) {
            if (m10620h(this.f29003a)) {
                try {
                    this.f29005c.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
