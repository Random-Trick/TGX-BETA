package c5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.thunderdog.challegram.Log;

public final class z {
    public static z f4933e;
    public final Handler f4934a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<WeakReference<c>> f4935b = new CopyOnWriteArrayList<>();
    public final Object f4936c = new Object();
    public int f4937d = 0;

    public static final class b {
        public static volatile boolean f4938a;
    }

    public interface c {
        void a(int i10);
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            int g10 = z.g(context);
            int i10 = l0.f4841a;
            if (i10 >= 29 && !b.f4938a && g10 == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) c5.a.e((TelephonyManager) context.getSystemService("phone"));
                    e eVar = new e();
                    if (i10 < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, Log.TAG_NDK);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            z.this.k(g10);
        }
    }

    public class e extends PhoneStateListener {
        public e() {
        }

        @Override
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            z.this.k(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            z.this.k(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public z(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized z d(Context context) {
        z zVar;
        synchronized (z.class) {
            if (f4933e == null) {
                f4933e = new z(context);
            }
            zVar = f4933e;
        }
        return zVar;
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return l0.f4841a >= 29 ? 9 : 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public void h(c cVar) {
        cVar.a(f());
    }

    public int f() {
        int i10;
        synchronized (this.f4936c) {
            i10 = this.f4937d;
        }
        return i10;
    }

    public void i(final c cVar) {
        j();
        this.f4935b.add(new WeakReference<>(cVar));
        this.f4934a.post(new Runnable() {
            @Override
            public final void run() {
                z.this.h(cVar);
            }
        });
    }

    public final void j() {
        Iterator<WeakReference<c>> it = this.f4935b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f4935b.remove(next);
            }
        }
    }

    public final void k(int i10) {
        synchronized (this.f4936c) {
            if (this.f4937d != i10) {
                this.f4937d = i10;
                Iterator<WeakReference<c>> it = this.f4935b.iterator();
                while (it.hasNext()) {
                    WeakReference<c> next = it.next();
                    c cVar = next.get();
                    if (cVar != null) {
                        cVar.a(i10);
                    } else {
                        this.f4935b.remove(next);
                    }
                }
            }
        }
    }
}
