package p020b5;

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

public final class C1242z {
    public static C1242z f4604e;
    public final Handler f4605a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<WeakReference<AbstractC1245c>> f4606b = new CopyOnWriteArrayList<>();
    public final Object f4607c = new Object();
    public int f4608d = 0;

    public static final class C1244b {
        public static volatile boolean f4609a;
    }

    public interface AbstractC1245c {
        void mo37829a(int i);
    }

    public final class C1246d extends BroadcastReceiver {
        public C1246d() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            int g = C1242z.m37835g(context);
            int i = C1216l0.f4526a;
            if (i >= 29 && !C1244b.f4609a && g == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) C1186a.m38188e((TelephonyManager) context.getSystemService("phone"));
                    C1247e eVar = new C1247e();
                    if (i < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, Log.TAG_NDK);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            C1242z.this.m37831k(g);
        }
    }

    public class C1247e extends PhoneStateListener {
        public C1247e() {
        }

        @Override
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            C1242z.this.m37831k(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2 = serviceState == null ? "" : serviceState.toString();
            C1242z.this.m37831k(serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    public C1242z(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C1246d(), intentFilter);
    }

    public static synchronized C1242z m37838d(Context context) {
        C1242z zVar;
        synchronized (C1242z.class) {
            if (f4604e == null) {
                f4604e = new C1242z(context);
            }
            zVar = f4604e;
        }
        return zVar;
    }

    public static int m37837e(NetworkInfo networkInfo) {
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
                return C1216l0.f4526a >= 29 ? 9 : 0;
        }
    }

    public static int m37835g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
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
                return m37837e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    public void m37834h(AbstractC1245c cVar) {
        cVar.mo37829a(m37836f());
    }

    public int m37836f() {
        int i;
        synchronized (this.f4607c) {
            i = this.f4608d;
        }
        return i;
    }

    public void m37833i(final AbstractC1245c cVar) {
        m37832j();
        this.f4606b.add(new WeakReference<>(cVar));
        this.f4605a.post(new Runnable() {
            @Override
            public final void run() {
                C1242z.this.m37834h(cVar);
            }
        });
    }

    public final void m37832j() {
        Iterator<WeakReference<AbstractC1245c>> it = this.f4606b.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC1245c> next = it.next();
            if (next.get() == null) {
                this.f4606b.remove(next);
            }
        }
    }

    public final void m37831k(int i) {
        synchronized (this.f4607c) {
            if (this.f4608d != i) {
                this.f4608d = i;
                Iterator<WeakReference<AbstractC1245c>> it = this.f4606b.iterator();
                while (it.hasNext()) {
                    WeakReference<AbstractC1245c> next = it.next();
                    AbstractC1245c cVar = next.get();
                    if (cVar != null) {
                        cVar.mo37829a(i);
                    } else {
                        this.f4606b.remove(next);
                    }
                }
            }
        }
    }
}
