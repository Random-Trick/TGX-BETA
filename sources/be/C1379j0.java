package be;

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
import gd.C4779t2;
import gd.C4812v2;
import ge.C4858a;
import ge.C4868i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.NetworkListenerService;
import p037cb.C2059c;
import p037cb.C2064f;
import p037cb.C2065g;
import p082fd.C4363d0;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5096a;
import p111he.AbstractC5155y0;
import p154kb.C6227d;
import p350yd.AbstractC10664f9;
import p350yd.C10536ab;
import td.AbstractC9323v4;
import td.C9270q1;
import td.View$OnClickListenerC9170d1;
import td.View$OnClickListenerC9218k0;

public class C1379j0 {
    public static Context f5007a = null;
    public static WeakReference<AbstractView$OnTouchListenerC7889a> f5008b = null;
    public static HandlerC1382k0 f5009c = null;
    public static Handler f5010d = null;
    public static int f5011e = -1;
    public static Boolean f5012f;
    public static int f5013g;
    public static long f5014h;
    public static HashMap<WeakReference<AbstractView$OnTouchListenerC7889a>, Boolean> f5016j;
    public static final C6227d<AbstractC1380a> f5015i = new C6227d<>();
    public static final int f5017k = -16777216;

    public interface AbstractC1380a {
        void mo1641h(int i);
    }

    public static Handler m37377A() {
        if (f5010d == null) {
            synchronized (C1379j0.class) {
                if (f5010d == null) {
                    f5010d = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f5010d;
    }

    public static void m37376A0(Intent intent) {
        AbstractView$OnTouchListenerC7889a E = m37369E();
        if (E != null) {
            E.startActivity(intent);
            return;
        }
        intent.addFlags(268435456);
        m37318n().startActivity(intent);
    }

    public static Resources m37375B() {
        return f5007a.getResources();
    }

    public static void m37374B0(Intent intent, int i) {
        AbstractView$OnTouchListenerC7889a E = m37369E();
        if (E != null) {
            E.startActivityForResult(intent, i);
        }
    }

    public static long m37373C() {
        return System.currentTimeMillis() - f5014h;
    }

    public static void m37372C0() {
        m37370D0(new Intent(m37318n(), NetworkListenerService.class), false, false);
    }

    public static int m37371D() {
        AbstractView$OnTouchListenerC7889a E;
        if (Build.VERSION.SDK_INT < 21 || (E = m37369E()) == null || E.getWindow() == null) {
            return 0;
        }
        return E.getWindow().getStatusBarColor();
    }

    public static boolean m37370D0(final Intent intent, boolean z, boolean z2) {
        if (z) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    final AbstractView$OnTouchListenerC7889a E = m37369E();
                    if (E != null) {
                        E.m14575J2(new String[]{"android.permission.FOREGROUND_SERVICE"}, new AbstractC5096a() {
                            @Override
                            public final void mo4252o1(int i2, boolean z3) {
                                C1379j0.m37350U(AbstractView$OnTouchListenerC7889a.this, intent, i2, z3);
                            }
                        });
                        return true;
                    }
                    Log.m14724e("Cannot start foreground service, because activity not found.", new Object[0]);
                }
                if (i >= 26) {
                    m37312q().startForegroundService(intent);
                    return true;
                }
            } catch (Throwable th) {
                Log.m14710w("Cannot start service at all", th, new Object[0]);
                return false;
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && z2) {
            final AbstractView$OnTouchListenerC7889a E2 = m37369E();
            if (E2 != null) {
                E2.m14575J2(new String[]{"android.permission.FOREGROUND_SERVICE"}, new AbstractC5096a() {
                    @Override
                    public final void mo4252o1(int i2, boolean z3) {
                        C1379j0.m37349V(AbstractView$OnTouchListenerC7889a.this, intent, i2, z3);
                    }
                });
                return true;
            }
            Log.m14724e("Cannot request foreground service permission, because activity not found.", new Object[0]);
        }
        m37312q().startService(intent);
        return true;
    }

    public static AbstractView$OnTouchListenerC7889a m37369E() {
        WeakReference<AbstractView$OnTouchListenerC7889a> weakReference = f5008b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void m37368E0(AbstractC5155y0 y0Var) {
        m37316o().m37273t(y0Var);
    }

    public static int m37367F() {
        return f5011e;
    }

    public static void m37366F0(AbstractC5155y0 y0Var, long j) {
        m37316o().m37272u(y0Var, j);
    }

    public static Window m37365G() {
        AbstractView$OnTouchListenerC7889a E = m37369E();
        if (E != null) {
            return E.getWindow();
        }
        return null;
    }

    public static boolean m37364G0(long j) {
        return f5011e == 0 || m37373C() <= j;
    }

    public static void m37363H(View view, boolean z) {
        C2065g.m35723b(view, z, C4868i.m24727c2().m24619p6());
    }

    public static void m37362I() {
        m37316o().m37289d();
    }

    public static boolean m37361J() {
        return f5013g != 0;
    }

    public static boolean m37360K() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void m37359L(Context context) {
        if (f5007a == null && context != null) {
            synchronized (C1379j0.class) {
                if (f5007a == null) {
                    f5007a = context;
                    C4858a.m24994b();
                    if (f5013g != 1 && C2059c.m35732c(context)) {
                        f5013g = 1;
                        C10536ab.m4718a3();
                    }
                }
            }
        }
    }

    public static void m37358M(View view) {
        m37316o().m37288e(view);
    }

    public static boolean m37357N() {
        return f5007a.getResources().getConfiguration().orientation == 2;
    }

    public static boolean m37356O() {
        C9270q1 x = m37298x();
        return x != null && x.m9741S();
    }

    public static boolean m37355P() {
        AbstractView$OnTouchListenerC7889a E = m37369E();
        return E != null && E.m14423w1();
    }

    public static boolean m37354Q() {
        return f5007a.getResources().getConfiguration().orientation == 1;
    }

    public static boolean m37353R() {
        return f5011e == 0;
    }

    public static boolean m37352S() {
        if (f5012f == null) {
            synchronized (C1379j0.class) {
                if (f5012f == null) {
                    f5012f = Boolean.valueOf(f5007a.getResources().getBoolean(R.bool.isTablet));
                }
            }
        }
        return f5012f.booleanValue();
    }

    public static void m37351T(String str, AbstractView$OnTouchListenerC7889a.AbstractC7901l lVar, long j) {
        if (m37369E() != null) {
            m37369E().m14603D3(str, lVar, j);
        }
    }

    public static void m37350U(AbstractView$OnTouchListenerC7889a aVar, Intent intent, int i, boolean z) {
        try {
            aVar.startForegroundService(intent);
        } catch (Throwable th) {
            Log.m14725e("Cannot start foreground service", th, new Object[0]);
        }
    }

    public static void m37349V(AbstractView$OnTouchListenerC7889a aVar, Intent intent, int i, boolean z) {
        try {
            aVar.startService(intent);
        } catch (Throwable th) {
            Log.m14725e("Cannot start service", th, new Object[0]);
        }
    }

    public static void m37348W(AbstractC9323v4<?> v4Var) {
        m37316o().m37287f(v4Var);
    }

    public static boolean m37347X() {
        Context context = f5007a;
        if (context == null) {
            return false;
        }
        try {
            return !DateFormat.is24HourFormat(context);
        } catch (Throwable th) {
            Log.m14708w(th);
            return false;
        }
    }

    @Deprecated
    public static void m37346Y(Context context) {
        m37316o().m37286g(context, 160L, false, false);
    }

    public static void m37345Z(AbstractC10664f9 f9Var, String str, File file, String str2, int i) {
        m37316o().m37285h(f9Var, str, file, str2, i);
    }

    public static void m37343a0(boolean z) {
        m37316o().m37284i(160L, z);
    }

    public static void m37341b0(String str) {
        m37316o().m37282k(str);
    }

    public static void m37339c0(String str) {
        m37316o().m37283j(str);
    }

    public static void m37338d(AbstractC1380a aVar) {
        f5015i.add(aVar);
    }

    public static void m37337d0(Runnable runnable) {
        m37316o().post(runnable);
    }

    public static void m37336e(Runnable runnable) {
        m37316o().removeCallbacks(runnable);
    }

    public static void m37335e0(Runnable runnable, long j) {
        m37316o().postDelayed(runnable, j);
    }

    public static void m37334f() {
        m37316o().m37292a();
    }

    public static void m37333f0(Runnable runnable) {
        m37316o().removeCallbacks(runnable);
    }

    public static void m37332g(org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a r5) {
        throw new UnsupportedOperationException("Method not decompiled: be.C1379j0.m37332g(org.thunderdog.challegram.a):void");
    }

    public static void m37331g0(AbstractC1380a aVar) {
        f5015i.remove(aVar);
    }

    public static void m37330h(AbstractView$OnTouchListenerC7889a aVar) {
        if (m37369E() == aVar) {
            f5008b = null;
        }
    }

    public static void m37329h0(AbstractView$OnTouchListenerC7889a aVar) {
        f5008b = new WeakReference<>(aVar);
        if (f5007a == null) {
            m37359L(aVar.getApplicationContext());
            if (f5007a == null) {
                m37359L(aVar);
            }
        }
    }

    public static void m37328i(CharSequence charSequence, int i) {
        m37316o().m37291b(charSequence, i);
    }

    public static void m37327i0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setFitsSystemWindows(true);
            view.setSystemUiVisibility(1280);
        }
    }

    public static void m37326j(boolean z) {
        m37316o().m37290c(z);
    }

    public static void m37325j0(C4812v2 v2Var, boolean z) {
        m37316o().m37281l(v2Var, z);
    }

    public static void m37324k(View view, boolean z) {
        m37322l(view, z, false);
    }

    public static void m37323k0(C4812v2 v2Var, float f, int i) {
        m37316o().m37280m(v2Var, f);
    }

    public static void m37322l(View view, boolean z, boolean z2) {
        C2065g.m35723b(view, z, z2 || C4868i.m24727c2().m24619p6());
    }

    public static void m37321l0(AbstractView$OnTouchListenerC7889a aVar, int i) {
        if (aVar != null) {
            aVar.getWindow().setSoftInputMode(i);
        }
    }

    public static void m37320m(View view) {
        m37324k(view, true);
        m37324k(view, true);
    }

    public static void m37319m0(int i) {
    }

    public static Context m37318n() {
        return f5007a;
    }

    public static boolean m37317n0(int i) {
        int i2 = f5011e;
        boolean z = false;
        if (i2 != i) {
            if ((i == 1 || i == 2) && i2 == 0) {
                f5014h = System.currentTimeMillis();
            }
            if (f5011e == 0 || i == 0) {
                C4363d0 g3 = C10536ab.m4667o1().m4694g3();
                if (i != 0) {
                    z = true;
                }
                z = g3.m28136s(z);
            }
            f5011e = i;
            Iterator<AbstractC1380a> it = f5015i.iterator();
            while (it.hasNext()) {
                it.next().mo1641h(i);
            }
        }
        return z;
    }

    public static HandlerC1382k0 m37316o() {
        if (f5009c == null) {
            synchronized (HandlerC1382k0.class) {
                if (f5009c == null) {
                    f5009c = new HandlerC1382k0(f5007a);
                }
            }
        }
        return f5009c;
    }

    public static boolean m37315o0(AbstractView$OnTouchListenerC7889a aVar, int i) {
        boolean z = false;
        boolean z2 = i == 0;
        HashMap<WeakReference<AbstractView$OnTouchListenerC7889a>, Boolean> hashMap = f5016j;
        ArrayList arrayList = null;
        r4 = null;
        WeakReference<AbstractView$OnTouchListenerC7889a> weakReference = null;
        if (hashMap != null) {
            WeakReference<AbstractView$OnTouchListenerC7889a> weakReference2 = null;
            for (Map.Entry<WeakReference<AbstractView$OnTouchListenerC7889a>, Boolean> entry : hashMap.entrySet()) {
                WeakReference<AbstractView$OnTouchListenerC7889a> key = entry.getKey();
                Boolean value = entry.getValue();
                AbstractView$OnTouchListenerC7889a aVar2 = key.get();
                if (aVar2 == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(key);
                } else if (aVar2 == aVar) {
                    weakReference2 = key;
                } else if (!z2 && value != null) {
                    z2 = value.booleanValue();
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f5016j.remove((WeakReference) it.next());
                }
            }
            weakReference = weakReference2;
        } else if (z2) {
            f5016j = new HashMap<>();
        }
        if (i != 2) {
            if (i == 0) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (weakReference != null) {
                f5016j.put(weakReference, valueOf);
            } else {
                if (f5016j == null) {
                    f5016j = new HashMap<>();
                }
                f5016j.put(new WeakReference<>(aVar), valueOf);
            }
        } else if (weakReference != null) {
            f5016j.remove(weakReference);
        }
        return m37317n0(!z2);
    }

    public static Locale m37314p() {
        return m37318n().getResources().getConfiguration().locale;
    }

    public static void m37313p0(int i) {
        m37316o().m37274s(C4403w.m27867j1(R.string.AndroidVersionWarning, C2064f.m35727b(i), C2064f.m35725d(i)), 1);
    }

    public static Context m37312q() {
        AbstractView$OnTouchListenerC7889a E = m37369E();
        return E != null ? E : f5007a;
    }

    public static void m37311q0(String str) {
        if (C5070i.m24062i(str)) {
            m37295y0(R.string.BotIsDown, 0);
            return;
        }
        m37293z0(C4403w.m27867j1(R.string.BotIsDownSpecific, '@' + str), 0);
    }

    public static AbstractView$OnTouchListenerC7889a m37310r(Context context) {
        if (context instanceof AbstractView$OnTouchListenerC7889a) {
            return (AbstractView$OnTouchListenerC7889a) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof AbstractView$OnTouchListenerC7889a) {
            return (AbstractView$OnTouchListenerC7889a) baseContext;
        }
        return null;
    }

    public static void m37309r0(int i, int i2, int i3) {
        m37316o().m37279n(i, i2, i3);
    }

    @Deprecated
    public static AbstractC9323v4<?> m37308s() {
        C9270q1 x = m37298x();
        if (x != null) {
            return x.m9748M().m9501l();
        }
        return null;
    }

    public static void m37307s0(CharSequence charSequence, int i, int i2) {
        m37316o().m37278o(charSequence, i, i2);
    }

    @Deprecated
    public static AbstractC9323v4<?> m37306t(Context context) {
        return m37310r(context).m14551P1().m9762F();
    }

    public static void m37305t0(TdApi.Object object) {
        if (object.getConstructor() != -1679978726) {
            m37293z0(C4779t2.m25379z5(object), 0);
            return;
        }
        String z5 = C4779t2.m25379z5(object);
        if (z5 != null) {
            Log.critical("TDLib Error: %s", Log.generateException(2), z5);
            if (C4779t2.m25482l0(object) != 401) {
                m37293z0(z5, 0);
            }
        }
    }

    public static View$OnClickListenerC9218k0 m37304u(Context context) {
        AbstractView$OnTouchListenerC7889a r = m37310r(context);
        if (r != null) {
            return r.m14552P0();
        }
        return null;
    }

    public static void m37303u0(View view) {
        m37316o().m37277p(view, true);
    }

    public static View$OnClickListenerC9170d1 m37302v() {
        C9270q1 x = m37298x();
        if (x != null) {
            return x.m9756I();
        }
        return null;
    }

    public static void m37301v0() {
        m37316o().m37275r(R.string.prompt_network, 1);
    }

    public static View$OnClickListenerC9170d1 m37300w(Context context) {
        C9270q1 y = m37296y(context);
        if (y != null) {
            return y.m9756I();
        }
        return null;
    }

    public static void m37299w0(String str, AbstractView$OnTouchListenerC7889a.AbstractC7901l lVar) {
        m37316o().m37276q(str, lVar);
    }

    public static C9270q1 m37298x() {
        AbstractView$OnTouchListenerC7889a E = m37369E();
        if (E != null) {
            return E.m14551P1();
        }
        return null;
    }

    public static void m37297x0(final String str, final AbstractView$OnTouchListenerC7889a.AbstractC7901l lVar, final long j) {
        if (j <= 0) {
            m37299w0(str, lVar);
        } else {
            m37337d0(new Runnable() {
                @Override
                public final void run() {
                    C1379j0.m37351T(str, lVar, j);
                }
            });
        }
    }

    public static C9270q1 m37296y(Context context) {
        return m37310r(context).m14551P1();
    }

    public static void m37295y0(int i, int i2) {
        m37316o().m37275r(i, i2);
    }

    public static int m37294z() {
        return f5007a.getResources().getConfiguration().orientation;
    }

    public static void m37293z0(CharSequence charSequence, int i) {
        m37316o().m37274s(charSequence, i);
    }
}
