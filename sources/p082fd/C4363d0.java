package p082fd;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import be.C1379j0;
import ge.C4868i;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;
import p139jb.AbstractRunnableC5910b;
import p154kb.C6235i;
import p350yd.C10536ab;

public class C4363d0 {
    public final C10536ab f14447a;
    public boolean f14450d;
    public boolean f14451e;
    public long f14454h;
    public AbstractRunnableC5910b f14455i;
    public NetworkInfo.State f14457k;
    public String f14458l;
    public int f14459m;
    public boolean f14460n;
    public long f14461o;
    public int f14452f = -1;
    public int f14453g = Integer.MIN_VALUE;
    public boolean f14456j = true;
    public final List<Reference<Context>> f14448b = new ArrayList();
    public boolean f14449c = true;

    public class C4364a extends AbstractRunnableC5910b {
        public C4364a() {
        }

        @Override
        public void mo1364b() {
            C4363d0.this.m28137p(false);
        }
    }

    public static class C4365b {
        public static final int[] f14463a;

        static {
            int[] iArr = new int[NetworkInfo.State.values().length];
            f14463a = iArr;
            try {
                iArr[NetworkInfo.State.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14463a[NetworkInfo.State.DISCONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14463a[NetworkInfo.State.SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4363d0(C10536ab abVar) {
        this.f14447a = abVar;
    }

    @TargetApi(21)
    public static boolean m28149d(NetworkInfo networkInfo) {
        return networkInfo.isConnectedOrConnecting() && networkInfo.getType() != 17;
    }

    public static int m28147f(NetworkInfo networkInfo) {
        if (networkInfo.isRoaming()) {
            return 2;
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 9) ? 1 : 0;
    }

    public static boolean m28140m(NetworkInfo networkInfo) {
        int i;
        return networkInfo == null || (i = C4365b.f14463a[networkInfo.getState().ordinal()]) == 1 || i == 2 || i == 3;
    }

    public final void m28154A(boolean z) {
        this.f14450d = z;
    }

    public void m28153B() {
        m28138o();
    }

    public final void m28152a() {
        C6235i.m21012d(this.f14448b);
    }

    public final void m28151b(boolean z) {
        boolean z2;
        int i;
        int i2 = -1;
        if (this.f14456j) {
            i = this.f14452f;
            if (i == -1) {
                i = 3;
            }
            z2 = true;
        } else {
            boolean z3 = this.f14449c;
            int i3 = this.f14452f;
            if (z3) {
                i2 = i3;
            }
            i = i2;
            z2 = z3;
        }
        if (this.f14453g != i || z) {
            this.f14454h = SystemClock.elapsedRealtime();
            this.f14453g = i;
            m28130w(i, z2);
        }
    }

    public void m28150c() {
        if (this.f14452f == -1) {
            m28138o();
        }
    }

    public int m28148e() {
        return this.f14452f;
    }

    @TargetApi(21)
    public final boolean m28146g(ConnectivityManager connectivityManager, Object obj) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21 || connectivityManager == null || obj == null) {
            return false;
        }
        return i >= 23 && ((Network) obj).getNetworkHandle() != this.f14461o;
    }

    public final boolean m28145h(NetworkInfo networkInfo) {
        NetworkInfo.State state = this.f14457k;
        return state != null && (!state.equals(networkInfo.getState()) || !C5070i.m24067c(this.f14458l, networkInfo.getExtraInfo()) || this.f14460n != networkInfo.isAvailable() || this.f14459m != networkInfo.getType());
    }

    public void m28144i() {
        if (this.f14456j) {
            m28137p(false);
        }
    }

    public boolean m28143j() {
        return !this.f14449c;
    }

    public boolean m28142k() {
        return this.f14449c;
    }

    public boolean m28141l() {
        return this.f14451e;
    }

    public boolean m28139n() {
        return this.f14452f == -1;
    }

    public void m28138o() {
        m28137p(false);
    }

    public void m28137p(boolean z) {
        int i;
        NetworkInfo networkInfo;
        Network network;
        Network network2;
        NetworkInfo networkInfo2;
        boolean z2;
        int i2;
        NetworkInfo networkInfo3;
        NetworkInfo[] allNetworkInfo;
        Network[] allNetworks;
        ConnectivityManager connectivityManager = (ConnectivityManager) C1379j0.m37315n().getSystemService("connectivity");
        if (connectivityManager != null) {
            boolean z3 = true;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    i = connectivityManager.getRestrictBackgroundStatus();
                } catch (SecurityException e) {
                    Log.m14710w("Unable to fetch background network status", e, new Object[0]);
                    i = 3;
                }
                m28127z(connectivityManager.isActiveNetworkMetered() && i != 1);
                if (z) {
                    return;
                }
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23) {
                network = connectivityManager.getActiveNetwork();
                if (network != null) {
                    networkInfo = connectivityManager.getNetworkInfo(network);
                } else {
                    network = null;
                    networkInfo = null;
                }
            } else {
                networkInfo = connectivityManager.getActiveNetworkInfo();
                network = null;
            }
            if (networkInfo == null || !networkInfo.isAvailable() || networkInfo.getType() == 17) {
                networkInfo2 = null;
                network2 = null;
            } else {
                network2 = network;
                networkInfo2 = networkInfo;
            }
            if (networkInfo != null && m28149d(networkInfo)) {
                i2 = m28147f(networkInfo);
                z2 = true;
            } else if (i3 >= 21) {
                NetworkInfo networkInfo4 = networkInfo2;
                Network network3 = network2;
                int i4 = -1;
                Network network4 = null;
                NetworkInfo networkInfo5 = null;
                z2 = false;
                for (Network network5 : connectivityManager.getAllNetworks()) {
                    NetworkInfo networkInfo6 = connectivityManager.getNetworkInfo(network5);
                    if (networkInfo6 != null) {
                        if (m28149d(networkInfo6)) {
                            int f = m28147f(networkInfo6);
                            if (i4 == -1 || f != 1) {
                                i4 = f;
                            }
                            network4 = network5;
                            networkInfo5 = networkInfo6;
                            z2 = true;
                        } else if (networkInfo4 == null && networkInfo6.isAvailable() && networkInfo6.getType() != 17) {
                            network3 = network5;
                            networkInfo4 = networkInfo6;
                        }
                    }
                }
                i2 = i4;
                network = network4;
                networkInfo = networkInfo5;
                networkInfo2 = networkInfo4;
                network2 = network3;
            } else {
                int i5 = -1;
                networkInfo = null;
                z2 = false;
                for (NetworkInfo networkInfo7 : connectivityManager.getAllNetworkInfo()) {
                    if (networkInfo7 != null) {
                        if (networkInfo7.isConnectedOrConnecting()) {
                            int f2 = m28147f(networkInfo7);
                            if (i5 == -1 || f2 != 1) {
                                i5 = f2;
                            }
                            networkInfo = networkInfo7;
                            z2 = true;
                        } else if (networkInfo2 == null && networkInfo7.isAvailable()) {
                            networkInfo2 = networkInfo7;
                        }
                    }
                }
                i2 = i5;
                network = null;
            }
            if (C4868i.m24726c2().m24736b0()) {
                i2 = -1;
                network = null;
                networkInfo3 = null;
                z2 = false;
            } else if (networkInfo != null || networkInfo2 == null) {
                networkInfo3 = networkInfo;
            } else {
                i2 = m28147f(networkInfo2);
                networkInfo3 = networkInfo2;
                network = network2;
                z2 = true;
            }
            boolean m = m28140m(networkInfo3);
            m28154A(m);
            if (!z2 || m) {
                z3 = false;
            }
            if (z3) {
                int i6 = this.f14452f;
                m28129x(i2);
                if (i6 != -1 && (i6 != i2 || m28145h(networkInfo3) || (Build.VERSION.SDK_INT >= 21 && m28146g(connectivityManager, network)))) {
                    m28133t();
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    m28131v(connectivityManager, network);
                }
                m28132u(networkInfo3);
            }
            if (!m28128y(z3)) {
                m28151b(false);
            }
        }
    }

    public void m28136q(Context context) {
        m28153B();
        if (C6235i.m21015a(this.f14448b, context)) {
            m28152a();
        }
    }

    public void m28135r(Context context) {
        if (C6235i.m21011e(this.f14448b, context)) {
            m28152a();
        }
    }

    public boolean m28134s(boolean z) {
        if (this.f14456j == z) {
            return false;
        }
        this.f14456j = z;
        Log.m14721i(1, "inBackground -> %b", Boolean.valueOf(z));
        AbstractRunnableC5910b bVar = this.f14455i;
        if (bVar != null) {
            bVar.m21857c();
            this.f14455i = null;
        }
        if (!z) {
            C4364a aVar = new C4364a();
            this.f14455i = aVar;
            aVar.m21855e(C1379j0.m37313o());
            C1379j0.m37332e0(this.f14455i, 300L);
        }
        return true;
    }

    public final void m28133t() {
        if (this.f14449c) {
            m28151b(true);
        }
    }

    public final void m28132u(NetworkInfo networkInfo) {
        this.f14457k = networkInfo.getState();
        this.f14458l = networkInfo.getExtraInfo();
        this.f14460n = networkInfo.isAvailable();
        this.f14459m = networkInfo.getType();
        if (Log.isEnabled(1)) {
            Log.m14721i(1, "saveConnectionRouteInfo: %s", networkInfo);
        }
    }

    @TargetApi(21)
    public final void m28131v(ConnectivityManager connectivityManager, Object obj) {
        if (Build.VERSION.SDK_INT >= 21 && connectivityManager != null && obj != null) {
            Network network = (Network) obj;
            if (Log.isEnabled(1)) {
                try {
                    Log.m14721i(1, "saveRoute, network: %s, capabilities: %s", network, connectivityManager.getNetworkCapabilities(network));
                } catch (Throwable th) {
                    Log.m14722i(1, "Unable to get network capabilities: %s", th, network);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.f14461o = network.getNetworkHandle();
            }
        }
    }

    public final void m28130w(int i, boolean z) {
        TdApi.NetworkType networkType;
        Log.m14709w("sendTGConnectionType type:%d isOnline:%b inBackground:%b this.isOnline:%b", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(this.f14456j), Boolean.valueOf(this.f14449c));
        if (!z) {
            networkType = new TdApi.NetworkTypeNone();
        } else if (i == 0) {
            networkType = new TdApi.NetworkTypeMobile();
        } else if (i == 1) {
            networkType = new TdApi.NetworkTypeWiFi();
        } else if (i != 2) {
            networkType = new TdApi.NetworkTypeOther();
        } else {
            networkType = new TdApi.NetworkTypeMobileRoaming();
        }
        if (Log.isEnabled(1)) {
            Log.m14721i(1, "setConnectionType, networkType: %s", networkType.getClass().getName());
        }
        this.f14447a.m4722Z2(networkType);
    }

    public final void m28129x(int i) {
        if (this.f14452f != i) {
            boolean z = this.f14449c || this.f14456j;
            int i2 = z ? i : -1;
            if (z && i2 == -1 && this.f14456j) {
                i2 = 3;
            }
            this.f14454h = SystemClock.elapsedRealtime();
            this.f14453g = i2;
            m28130w(i2, z);
        }
        int i3 = this.f14452f;
        if (i3 == -1) {
            this.f14452f = i;
        } else if (i3 != i) {
            this.f14452f = i;
            this.f14447a.m4682j2(i3, i);
        }
    }

    public boolean m28128y(boolean z) {
        if (this.f14449c == z) {
            return false;
        }
        if (Log.isEnabled(1)) {
            Log.m14721i(1, "setIsOnline: %b -> %b", Boolean.valueOf(this.f14449c), Boolean.valueOf(z));
        }
        this.f14449c = z;
        m28151b(false);
        return true;
    }

    public final void m28127z(boolean z) {
        if (this.f14452f == -1) {
            this.f14451e = z;
        } else if (this.f14451e != z) {
            this.f14451e = z;
            this.f14447a.m4676l2(z);
        }
    }
}
