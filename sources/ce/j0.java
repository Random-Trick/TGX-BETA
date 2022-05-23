package ce;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import db.c;
import db.f;
import db.g;
import gd.d0;
import gd.w;
import hd.t2;
import hd.v2;
import he.i;
import ie.y0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import lb.d;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.service.NetworkListenerService;
import ud.d1;
import ud.k0;
import ud.q1;
import ud.v4;
import zd.d9;
import zd.ya;

public class j0 {
    public static Context f5274a = null;
    public static WeakReference<org.thunderdog.challegram.a> f5275b = null;
    public static k0 f5276c = null;
    public static Handler f5277d = null;
    public static int f5278e = -1;
    public static Boolean f5279f;
    public static int f5280g;
    public static long f5281h;
    public static HashMap<WeakReference<org.thunderdog.challegram.a>, Boolean> f5283j;
    public static final d<a> f5282i = new d<>();
    public static final int f5284k = -16777216;

    public interface a {
        void f(int i10);
    }

    public static Handler A() {
        if (f5277d == null) {
            synchronized (j0.class) {
                if (f5277d == null) {
                    f5277d = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f5277d;
    }

    public static void A0(Intent intent) {
        org.thunderdog.challegram.a E = E();
        if (E != null) {
            E.startActivity(intent);
            return;
        }
        intent.addFlags(268435456);
        n().startActivity(intent);
    }

    public static Resources B() {
        return f5274a.getResources();
    }

    public static void B0(Intent intent, int i10) {
        org.thunderdog.challegram.a E = E();
        if (E != null) {
            E.startActivityForResult(intent, i10);
        }
    }

    public static long C() {
        return System.currentTimeMillis() - f5281h;
    }

    public static void C0() {
        D0(new Intent(n(), NetworkListenerService.class), false, false);
    }

    public static int D() {
        org.thunderdog.challegram.a E = E();
        if (E == null || E.getWindow() == null) {
            return 0;
        }
        return E.getWindow().getStatusBarColor();
    }

    public static boolean D0(final Intent intent, boolean z10, boolean z11) {
        if (z10) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    final org.thunderdog.challegram.a E = E();
                    if (E != null) {
                        E.K2(new String[]{"android.permission.FOREGROUND_SERVICE"}, new ie.a() {
                            @Override
                            public final void l1(int i11, boolean z12) {
                                j0.U(a.this, intent, i11, z12);
                            }
                        });
                        return true;
                    }
                    Log.e("Cannot start foreground service, because activity not found.", new Object[0]);
                }
                if (i10 >= 26) {
                    q().startForegroundService(intent);
                    return true;
                }
            } catch (Throwable th) {
                Log.w("Cannot start service at all", th, new Object[0]);
                return false;
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && z11) {
            final org.thunderdog.challegram.a E2 = E();
            if (E2 != null) {
                E2.K2(new String[]{"android.permission.FOREGROUND_SERVICE"}, new ie.a() {
                    @Override
                    public final void l1(int i11, boolean z12) {
                        j0.V(a.this, intent, i11, z12);
                    }
                });
                return true;
            }
            Log.e("Cannot request foreground service permission, because activity not found.", new Object[0]);
        }
        q().startService(intent);
        return true;
    }

    public static org.thunderdog.challegram.a E() {
        WeakReference<org.thunderdog.challegram.a> weakReference = f5275b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void E0(y0 y0Var) {
        o().t(y0Var);
    }

    public static int F() {
        return f5278e;
    }

    public static void F0(y0 y0Var, long j10) {
        o().u(y0Var, j10);
    }

    public static Window G() {
        org.thunderdog.challegram.a E = E();
        if (E != null) {
            return E.getWindow();
        }
        return null;
    }

    public static boolean G0(long j10) {
        return f5278e == 0 || C() <= j10;
    }

    public static void H(View view, boolean z10) {
        g.b(view, z10, i.c2().p6());
    }

    public static void I() {
        o().d();
    }

    public static boolean J() {
        return f5280g != 0;
    }

    public static boolean K() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void L(Context context) {
        if (f5274a == null && context != null) {
            synchronized (j0.class) {
                if (f5274a == null) {
                    f5274a = context;
                    he.a.b();
                    if (f5280g != 1 && c.c(context)) {
                        f5280g = 1;
                        ya.a3();
                    }
                }
            }
        }
    }

    public static void M(View view) {
        o().e(view);
    }

    public static boolean N() {
        return f5274a.getResources().getConfiguration().orientation == 2;
    }

    public static boolean O() {
        q1 x10 = x();
        return x10 != null && x10.S();
    }

    public static boolean P() {
        org.thunderdog.challegram.a E = E();
        return E != null && E.x1();
    }

    public static boolean Q() {
        return f5274a.getResources().getConfiguration().orientation == 1;
    }

    public static boolean R() {
        return f5278e == 0;
    }

    public static boolean S() {
        if (f5279f == null) {
            synchronized (j0.class) {
                if (f5279f == null) {
                    f5279f = Boolean.valueOf(f5274a.getResources().getBoolean(R.bool.isTablet));
                }
            }
        }
        return f5279f.booleanValue();
    }

    public static void T(String str, a.l lVar, long j10) {
        if (E() != null) {
            E().E3(str, lVar, j10);
        }
    }

    public static void U(org.thunderdog.challegram.a aVar, Intent intent, int i10, boolean z10) {
        try {
            aVar.startForegroundService(intent);
        } catch (Throwable th) {
            Log.e("Cannot start foreground service", th, new Object[0]);
        }
    }

    public static void V(org.thunderdog.challegram.a aVar, Intent intent, int i10, boolean z10) {
        try {
            aVar.startService(intent);
        } catch (Throwable th) {
            Log.e("Cannot start service", th, new Object[0]);
        }
    }

    public static void W(v4<?> v4Var) {
        o().f(v4Var);
    }

    public static boolean X() {
        Context context = f5274a;
        if (context == null) {
            return false;
        }
        try {
            return !DateFormat.is24HourFormat(context);
        } catch (Throwable th) {
            Log.w(th);
            return false;
        }
    }

    @Deprecated
    public static void Y(Context context) {
        o().g(context, 160L, false, false);
    }

    public static void Z(d9 d9Var, String str, File file, String str2, int i10) {
        o().h(d9Var, str, file, str2, i10);
    }

    public static void a0(boolean z10) {
        o().i(160L, z10);
    }

    public static void b0(String str) {
        o().k(str);
    }

    public static void c0(String str) {
        o().j(str);
    }

    public static void d(a aVar) {
        f5282i.add(aVar);
    }

    public static void d0(Runnable runnable) {
        o().post(runnable);
    }

    public static void e(Runnable runnable) {
        o().removeCallbacks(runnable);
    }

    public static void e0(Runnable runnable, long j10) {
        o().postDelayed(runnable, j10);
    }

    public static void f() {
        o().a();
    }

    public static void f0(Runnable runnable) {
        o().removeCallbacks(runnable);
    }

    public static void g(org.thunderdog.challegram.a r5) {
        throw new UnsupportedOperationException("Method not decompiled: ce.j0.g(org.thunderdog.challegram.a):void");
    }

    public static void g0(a aVar) {
        f5282i.remove(aVar);
    }

    public static void h(org.thunderdog.challegram.a aVar) {
        if (E() == aVar) {
            f5275b = null;
        }
    }

    public static void h0(org.thunderdog.challegram.a aVar) {
        f5275b = new WeakReference<>(aVar);
        if (f5274a == null) {
            L(aVar.getApplicationContext());
            if (f5274a == null) {
                L(aVar);
            }
        }
    }

    public static void i(CharSequence charSequence, int i10) {
        o().b(charSequence, i10);
    }

    public static void i0(View view) {
        view.setFitsSystemWindows(true);
        view.setSystemUiVisibility(1280);
    }

    public static void j(boolean z10) {
        o().c(z10);
    }

    public static void j0(v2 v2Var, boolean z10) {
        o().l(v2Var, z10);
    }

    public static void k(View view, boolean z10) {
        l(view, z10, false);
    }

    public static void k0(v2 v2Var, float f10, int i10) {
        o().m(v2Var, f10);
    }

    public static void l(View view, boolean z10, boolean z11) {
        g.b(view, z10, z11 || i.c2().p6());
    }

    public static void l0(org.thunderdog.challegram.a aVar, int i10) {
        if (aVar != null) {
            aVar.getWindow().setSoftInputMode(i10);
        }
    }

    public static void m(View view) {
        k(view, true);
        k(view, true);
    }

    public static void m0(int i10) {
    }

    public static Context n() {
        return f5274a;
    }

    public static boolean n0(int i10) {
        int i11 = f5278e;
        boolean z10 = false;
        if (i11 != i10) {
            if ((i10 == 1 || i10 == 2) && i11 == 0) {
                f5281h = System.currentTimeMillis();
            }
            if (f5278e == 0 || i10 == 0) {
                d0 g32 = ya.o1().g3();
                if (i10 != 0) {
                    z10 = true;
                }
                z10 = g32.s(z10);
            }
            f5278e = i10;
            Iterator<a> it = f5282i.iterator();
            while (it.hasNext()) {
                it.next().f(i10);
            }
        }
        return z10;
    }

    public static k0 o() {
        if (f5276c == null) {
            synchronized (k0.class) {
                if (f5276c == null) {
                    f5276c = new k0(f5274a);
                }
            }
        }
        return f5276c;
    }

    public static boolean o0(org.thunderdog.challegram.a aVar, int i10) {
        boolean z10 = false;
        boolean z11 = i10 == 0;
        HashMap<WeakReference<org.thunderdog.challegram.a>, Boolean> hashMap = f5283j;
        ArrayList arrayList = null;
        r4 = null;
        WeakReference<org.thunderdog.challegram.a> weakReference = null;
        if (hashMap != null) {
            WeakReference<org.thunderdog.challegram.a> weakReference2 = null;
            for (Map.Entry<WeakReference<org.thunderdog.challegram.a>, Boolean> entry : hashMap.entrySet()) {
                WeakReference<org.thunderdog.challegram.a> key = entry.getKey();
                Boolean value = entry.getValue();
                org.thunderdog.challegram.a aVar2 = key.get();
                if (aVar2 == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(key);
                } else if (aVar2 == aVar) {
                    weakReference2 = key;
                } else if (!z11 && value != null) {
                    z11 = value.booleanValue();
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f5283j.remove((WeakReference) it.next());
                }
            }
            weakReference = weakReference2;
        } else if (z11) {
            f5283j = new HashMap<>();
        }
        if (i10 != 2) {
            if (i10 == 0) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            if (weakReference != null) {
                f5283j.put(weakReference, valueOf);
            } else {
                if (f5283j == null) {
                    f5283j = new HashMap<>();
                }
                f5283j.put(new WeakReference<>(aVar), valueOf);
            }
        } else if (weakReference != null) {
            f5283j.remove(weakReference);
        }
        return n0(!z11);
    }

    public static Locale p() {
        return n().getResources().getConfiguration().locale;
    }

    public static void p0(int i10) {
        o().s(w.j1(R.string.AndroidVersionWarning, f.b(i10), f.d(i10)), 1);
    }

    public static Context q() {
        org.thunderdog.challegram.a E = E();
        return E != null ? E : f5274a;
    }

    public static void q0(String str) {
        if (ib.i.i(str)) {
            y0(R.string.BotIsDown, 0);
            return;
        }
        z0(w.j1(R.string.BotIsDownSpecific, '@' + str), 0);
    }

    public static org.thunderdog.challegram.a r(Context context) {
        if (context instanceof org.thunderdog.challegram.a) {
            return (org.thunderdog.challegram.a) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof org.thunderdog.challegram.a) {
            return (org.thunderdog.challegram.a) baseContext;
        }
        return null;
    }

    public static void r0(int i10, int i11, int i12) {
        o().n(i10, i11, i12);
    }

    @Deprecated
    public static v4<?> s() {
        q1 x10 = x();
        if (x10 != null) {
            return x10.M().l();
        }
        return null;
    }

    public static void s0(CharSequence charSequence, int i10, int i11) {
        o().o(charSequence, i10, i11);
    }

    @Deprecated
    public static v4<?> t(Context context) {
        return r(context).Q1().F();
    }

    public static void t0(TdApi.Object object) {
        if (object.getConstructor() != -1679978726) {
            z0(t2.z5(object), 0);
            return;
        }
        String z52 = t2.z5(object);
        if (z52 != null) {
            Log.critical("TDLib Error: %s", Log.generateException(2), z52);
            if (t2.l0(object) != 401) {
                z0(z52, 0);
            }
        }
    }

    public static k0 u(Context context) {
        org.thunderdog.challegram.a r10 = r(context);
        if (r10 != null) {
            return r10.S0();
        }
        return null;
    }

    public static void u0(View view) {
        o().p(view, true);
    }

    public static d1 v() {
        q1 x10 = x();
        if (x10 != null) {
            return x10.I();
        }
        return null;
    }

    public static void v0() {
        o().r(R.string.prompt_network, 1);
    }

    public static d1 w(Context context) {
        q1 y10 = y(context);
        if (y10 != null) {
            return y10.I();
        }
        return null;
    }

    public static void w0(String str, a.l lVar) {
        o().q(str, lVar);
    }

    public static q1 x() {
        org.thunderdog.challegram.a E = E();
        if (E != null) {
            return E.Q1();
        }
        return null;
    }

    public static void x0(final String str, final a.l lVar, final long j10) {
        if (j10 <= 0) {
            w0(str, lVar);
        } else {
            d0(new Runnable() {
                @Override
                public final void run() {
                    j0.T(str, lVar, j10);
                }
            });
        }
    }

    public static q1 y(Context context) {
        return r(context).Q1();
    }

    public static void y0(int i10, int i11) {
        o().r(i10, i11);
    }

    public static int z() {
        return f5274a.getResources().getConfiguration().orientation;
    }

    public static void z0(CharSequence charSequence, int i10) {
        o().s(charSequence, i10);
    }
}
