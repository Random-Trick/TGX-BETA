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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p246r5.ThreadFactoryC8371a;

public class RunnableC9025l0 implements Runnable {
    public ExecutorService f28959M = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8371a("firebase-iid-executor"));
    public final long f28960a;
    public final PowerManager.WakeLock f28961b;
    public final FirebaseMessaging f28962c;

    public static class C9026a extends BroadcastReceiver {
        @Nullable
        public RunnableC9025l0 f28963a;

        public C9026a(RunnableC9025l0 l0Var) {
            this.f28963a = l0Var;
        }

        public void m10669a() {
            if (RunnableC9025l0.m10672c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f28963a.m10673b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            RunnableC9025l0 l0Var = this.f28963a;
            if (l0Var != null && l0Var.m10671d()) {
                if (RunnableC9025l0.m10672c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f28963a.f28962c.m30229d(this.f28963a, 0L);
                this.f28963a.m10673b().unregisterReceiver(this);
                this.f28963a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC9025l0(FirebaseMessaging firebaseMessaging, long j) {
        this.f28962c = firebaseMessaging;
        this.f28960a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m10673b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f28961b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean m10672c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public Context m10673b() {
        return this.f28962c.m30228e();
    }

    public boolean m10671d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m10673b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean m10670e() {
        try {
            if (this.f28962c.m30230c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            if (C9002a0.m10727f(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", sb2.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C9019i0.m10689b().m10686e(m10673b())) {
            this.f28961b.acquire();
        }
        try {
            try {
                this.f28962c.m30214s(true);
                if (!this.f28962c.m30220m()) {
                    this.f28962c.m30214s(false);
                    if (!C9019i0.m10689b().m10686e(m10673b())) {
                        return;
                    }
                } else if (!C9019i0.m10689b().m10687d(m10673b()) || m10671d()) {
                    if (m10670e()) {
                        this.f28962c.m30214s(false);
                    } else {
                        this.f28962c.m30211v(this.f28960a);
                    }
                    if (!C9019i0.m10689b().m10686e(m10673b())) {
                        return;
                    }
                } else {
                    new C9026a(this).m10669a();
                    if (!C9019i0.m10689b().m10686e(m10673b())) {
                        return;
                    }
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb2.toString());
                this.f28962c.m30214s(false);
                if (!C9019i0.m10689b().m10686e(m10673b())) {
                    return;
                }
            }
            this.f28961b.release();
        } catch (Throwable th) {
            if (C9019i0.m10689b().m10686e(m10673b())) {
                this.f28961b.release();
            }
            throw th;
        }
    }
}
