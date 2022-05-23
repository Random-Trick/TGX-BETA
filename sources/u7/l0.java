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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class l0 implements Runnable {
    public ExecutorService M = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s5.a("firebase-iid-executor"));
    public final long f23648a;
    public final PowerManager.WakeLock f23649b;
    public final FirebaseMessaging f23650c;

    public static class a extends BroadcastReceiver {
        @Nullable
        public l0 f23651a;

        public a(l0 l0Var) {
            this.f23651a = l0Var;
        }

        public void a() {
            if (l0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f23651a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            l0 l0Var = this.f23651a;
            if (l0Var != null && l0Var.d()) {
                if (l0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f23651a.f23650c.d(this.f23651a, 0L);
                this.f23651a.b().unregisterReceiver(this);
                this.f23651a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public l0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f23650c = firebaseMessaging;
        this.f23648a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f23649b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public Context b() {
        return this.f23650c.e();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() {
        try {
            if (this.f23650c.c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e10) {
            if (a0.f(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", sb2.toString());
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (i0.b().e(b())) {
            this.f23649b.acquire();
        }
        try {
            try {
                this.f23650c.s(true);
                if (!this.f23650c.m()) {
                    this.f23650c.s(false);
                    if (!i0.b().e(b())) {
                        return;
                    }
                } else if (!i0.b().d(b()) || d()) {
                    if (e()) {
                        this.f23650c.s(false);
                    } else {
                        this.f23650c.v(this.f23648a);
                    }
                    if (!i0.b().e(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!i0.b().e(b())) {
                        return;
                    }
                }
            } catch (IOException e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb2.toString());
                this.f23650c.s(false);
                if (!i0.b().e(b())) {
                    return;
                }
            }
            this.f23649b.release();
        } catch (Throwable th) {
            if (i0.b().e(b())) {
                this.f23649b.release();
            }
            throw th;
        }
    }
}
