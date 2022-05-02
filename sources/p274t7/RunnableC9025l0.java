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
    public ExecutorService f28962M = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8371a("firebase-iid-executor"));
    public final long f28963a;
    public final PowerManager.WakeLock f28964b;
    public final FirebaseMessaging f28965c;

    public static class C9026a extends BroadcastReceiver {
        @Nullable
        public RunnableC9025l0 f28966a;

        public C9026a(RunnableC9025l0 l0Var) {
            this.f28966a = l0Var;
        }

        public void m10668a() {
            if (RunnableC9025l0.m10671c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f28966a.m10672b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            RunnableC9025l0 l0Var = this.f28966a;
            if (l0Var != null && l0Var.m10670d()) {
                if (RunnableC9025l0.m10671c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f28966a.f28965c.m30231d(this.f28966a, 0L);
                this.f28966a.m10672b().unregisterReceiver(this);
                this.f28966a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC9025l0(FirebaseMessaging firebaseMessaging, long j) {
        this.f28965c = firebaseMessaging;
        this.f28963a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m10672b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f28964b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean m10671c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public Context m10672b() {
        return this.f28965c.m30230e();
    }

    public boolean m10670d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m10672b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean m10669e() {
        try {
            if (this.f28965c.m30232c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            if (C9002a0.m10726f(e.getMessage())) {
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
        if (C9019i0.m10688b().m10685e(m10672b())) {
            this.f28964b.acquire();
        }
        try {
            try {
                this.f28965c.m30216s(true);
                if (!this.f28965c.m30222m()) {
                    this.f28965c.m30216s(false);
                    if (!C9019i0.m10688b().m10685e(m10672b())) {
                        return;
                    }
                } else if (!C9019i0.m10688b().m10686d(m10672b()) || m10670d()) {
                    if (m10669e()) {
                        this.f28965c.m30216s(false);
                    } else {
                        this.f28965c.m30213v(this.f28963a);
                    }
                    if (!C9019i0.m10688b().m10685e(m10672b())) {
                        return;
                    }
                } else {
                    new C9026a(this).m10668a();
                    if (!C9019i0.m10688b().m10685e(m10672b())) {
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
                this.f28965c.m30216s(false);
                if (!C9019i0.m10688b().m10685e(m10672b())) {
                    return;
                }
            }
            this.f28964b.release();
        } catch (Throwable th) {
            if (C9019i0.m10688b().m10685e(m10672b())) {
                this.f28964b.release();
            }
            throw th;
        }
    }
}
