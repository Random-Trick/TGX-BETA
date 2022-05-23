package gd;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import ce.j0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import lb.i;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import zd.ya;

public class d0 {
    public final ya f12216a;
    public boolean f12219d;
    public boolean f12220e;
    public long f12223h;
    public kb.b f12224i;
    public NetworkInfo.State f12226k;
    public String f12227l;
    public int f12228m;
    public boolean f12229n;
    public long f12230o;
    public int f12221f = -1;
    public int f12222g = Integer.MIN_VALUE;
    public boolean f12225j = true;
    public final List<Reference<Context>> f12217b = new ArrayList();
    public boolean f12218c = true;

    public class a extends kb.b {
        public a() {
        }

        @Override
        public void b() {
            d0.this.p(false);
        }
    }

    public static class b {
        public static final int[] f12231a;

        static {
            int[] iArr = new int[NetworkInfo.State.values().length];
            f12231a = iArr;
            try {
                iArr[NetworkInfo.State.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12231a[NetworkInfo.State.DISCONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12231a[NetworkInfo.State.SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d0(ya yaVar) {
        this.f12216a = yaVar;
    }

    @TargetApi(21)
    public static boolean d(NetworkInfo networkInfo) {
        return networkInfo.isConnectedOrConnecting() && networkInfo.getType() != 17;
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo.isRoaming()) {
            return 2;
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 9) ? 1 : 0;
    }

    public static boolean m(NetworkInfo networkInfo) {
        int i10;
        return networkInfo == null || (i10 = b.f12231a[networkInfo.getState().ordinal()]) == 1 || i10 == 2 || i10 == 3;
    }

    public final void A(boolean z10) {
        this.f12219d = z10;
    }

    public void B() {
        o();
    }

    public final void a() {
        i.d(this.f12217b);
    }

    public final void b(boolean z10) {
        boolean z11;
        int i10;
        int i11 = -1;
        if (this.f12225j) {
            i10 = this.f12221f;
            if (i10 == -1) {
                i10 = 3;
            }
            z11 = true;
        } else {
            boolean z12 = this.f12218c;
            int i12 = this.f12221f;
            if (z12) {
                i11 = i12;
            }
            i10 = i11;
            z11 = z12;
        }
        if (this.f12222g != i10 || z10) {
            this.f12223h = SystemClock.elapsedRealtime();
            this.f12222g = i10;
            w(i10, z11);
        }
    }

    public void c() {
        if (this.f12221f == -1) {
            o();
        }
    }

    public int e() {
        return this.f12221f;
    }

    @TargetApi(21)
    public final boolean g(ConnectivityManager connectivityManager, Object obj) {
        int i10 = Build.VERSION.SDK_INT;
        if (connectivityManager == null || obj == null) {
            return false;
        }
        return i10 >= 23 && ((Network) obj).getNetworkHandle() != this.f12230o;
    }

    public final boolean h(NetworkInfo networkInfo) {
        NetworkInfo.State state = this.f12226k;
        return state != null && (!state.equals(networkInfo.getState()) || !ib.i.c(this.f12227l, networkInfo.getExtraInfo()) || this.f12229n != networkInfo.isAvailable() || this.f12228m != networkInfo.getType());
    }

    public void i() {
        if (this.f12225j) {
            p(false);
        }
    }

    public boolean j() {
        return !this.f12218c;
    }

    public boolean k() {
        return this.f12218c;
    }

    public boolean l() {
        return this.f12220e;
    }

    public boolean n() {
        return this.f12221f == -1;
    }

    public void o() {
        p(false);
    }

    public void p(boolean z10) {
        int i10;
        NetworkInfo networkInfo;
        Network network;
        Network network2;
        NetworkInfo networkInfo2;
        boolean z11;
        int i11;
        NetworkInfo networkInfo3;
        ConnectivityManager connectivityManager = (ConnectivityManager) j0.n().getSystemService("connectivity");
        if (connectivityManager != null) {
            int i12 = 1;
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    i10 = connectivityManager.getRestrictBackgroundStatus();
                } catch (SecurityException e10) {
                    Log.w("Unable to fetch background network status", e10, new Object[0]);
                    i10 = 3;
                }
                z(connectivityManager.isActiveNetworkMetered() && i10 != 1);
                if (z10) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
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
            if (networkInfo == null || !d(networkInfo)) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                NetworkInfo networkInfo4 = networkInfo2;
                Network network3 = network2;
                Network network4 = null;
                NetworkInfo networkInfo5 = null;
                int i13 = -1;
                int i14 = 0;
                z11 = false;
                while (i14 < length) {
                    Network network5 = allNetworks[i14];
                    NetworkInfo networkInfo6 = connectivityManager.getNetworkInfo(network5);
                    if (networkInfo6 != null) {
                        if (d(networkInfo6)) {
                            int f10 = f(networkInfo6);
                            if (i13 == -1 || f10 != i12) {
                                i13 = f10;
                            }
                            network4 = network5;
                            networkInfo5 = networkInfo6;
                            z11 = true;
                        } else if (networkInfo4 == null && networkInfo6.isAvailable() && networkInfo6.getType() != 17) {
                            network3 = network5;
                            networkInfo4 = networkInfo6;
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                network = network4;
                networkInfo = networkInfo5;
                i11 = i13;
                networkInfo2 = networkInfo4;
                network2 = network3;
            } else {
                i11 = f(networkInfo);
                z11 = true;
            }
            if (he.i.c2().b0()) {
                network = null;
                networkInfo3 = null;
                i11 = -1;
                z11 = false;
            } else if (networkInfo != null || networkInfo2 == null) {
                networkInfo3 = networkInfo;
            } else {
                i11 = f(networkInfo2);
                networkInfo3 = networkInfo2;
                network = network2;
                z11 = true;
            }
            boolean m10 = m(networkInfo3);
            A(m10);
            boolean z12 = z11 && !m10;
            if (z12) {
                int i15 = this.f12221f;
                x(i11);
                if (i15 != -1 && (i15 != i11 || h(networkInfo3) || g(connectivityManager, network))) {
                    t();
                }
                v(connectivityManager, network);
                u(networkInfo3);
            }
            if (!y(z12)) {
                b(false);
            }
        }
    }

    public void q(Context context) {
        B();
        if (i.a(this.f12217b, context)) {
            a();
        }
    }

    public void r(Context context) {
        if (i.e(this.f12217b, context)) {
            a();
        }
    }

    public boolean s(boolean z10) {
        if (this.f12225j == z10) {
            return false;
        }
        this.f12225j = z10;
        Log.i(1, "inBackground -> %b", Boolean.valueOf(z10));
        kb.b bVar = this.f12224i;
        if (bVar != null) {
            bVar.c();
            this.f12224i = null;
        }
        if (!z10) {
            a aVar = new a();
            this.f12224i = aVar;
            aVar.e(j0.o());
            j0.e0(this.f12224i, 300L);
        }
        return true;
    }

    public final void t() {
        if (this.f12218c) {
            b(true);
        }
    }

    public final void u(NetworkInfo networkInfo) {
        this.f12226k = networkInfo.getState();
        this.f12227l = networkInfo.getExtraInfo();
        this.f12229n = networkInfo.isAvailable();
        this.f12228m = networkInfo.getType();
        if (Log.isEnabled(1)) {
            Log.i(1, "saveConnectionRouteInfo: %s", networkInfo);
        }
    }

    @TargetApi(21)
    public final void v(ConnectivityManager connectivityManager, Object obj) {
        if (connectivityManager != null && obj != null) {
            Network network = (Network) obj;
            if (Log.isEnabled(1)) {
                try {
                    Log.i(1, "saveRoute, network: %s, capabilities: %s", network, connectivityManager.getNetworkCapabilities(network));
                } catch (Throwable th) {
                    Log.i(1, "Unable to get network capabilities: %s", th, network);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.f12230o = network.getNetworkHandle();
            }
        }
    }

    public final void w(int i10, boolean z10) {
        TdApi.NetworkType networkType;
        Log.w("sendTGConnectionType type:%d isOnline:%b inBackground:%b this.isOnline:%b", Integer.valueOf(i10), Boolean.valueOf(z10), Boolean.valueOf(this.f12225j), Boolean.valueOf(this.f12218c));
        if (!z10) {
            networkType = new TdApi.NetworkTypeNone();
        } else if (i10 == 0) {
            networkType = new TdApi.NetworkTypeMobile();
        } else if (i10 == 1) {
            networkType = new TdApi.NetworkTypeWiFi();
        } else if (i10 != 2) {
            networkType = new TdApi.NetworkTypeOther();
        } else {
            networkType = new TdApi.NetworkTypeMobileRoaming();
        }
        if (Log.isEnabled(1)) {
            Log.i(1, "setConnectionType, networkType: %s", networkType.getClass().getName());
        }
        this.f12216a.Z2(networkType);
    }

    public final void x(int i10) {
        if (this.f12221f != i10) {
            boolean z10 = this.f12218c || this.f12225j;
            int i11 = z10 ? i10 : -1;
            if (z10 && i11 == -1 && this.f12225j) {
                i11 = 3;
            }
            this.f12223h = SystemClock.elapsedRealtime();
            this.f12222g = i11;
            w(i11, z10);
        }
        int i12 = this.f12221f;
        if (i12 == -1) {
            this.f12221f = i10;
        } else if (i12 != i10) {
            this.f12221f = i10;
            this.f12216a.j2(i12, i10);
        }
    }

    public boolean y(boolean z10) {
        if (this.f12218c == z10) {
            return false;
        }
        if (Log.isEnabled(1)) {
            Log.i(1, "setIsOnline: %b -> %b", Boolean.valueOf(this.f12218c), Boolean.valueOf(z10));
        }
        this.f12218c = z10;
        b(false);
        return true;
    }

    public final void z(boolean z10) {
        if (this.f12221f == -1) {
            this.f12220e = z10;
        } else if (this.f12220e != z10) {
            this.f12220e = z10;
            this.f12216a.l2(z10);
        }
    }
}
