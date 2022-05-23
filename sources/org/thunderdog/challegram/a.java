package org.thunderdog.challegram;

import ad.a0;
import ae.p;
import ae.v;
import ae.z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import ce.j0;
import ce.p0;
import ce.x;
import de.ii;
import de.rh;
import de.t30;
import de.u9;
import eb.k;
import gd.w;
import hd.o;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.j2;
import ne.m1;
import ne.s0;
import ne.z1;
import nl.dionsegijn.konfetti.KonfettiView;
import oc.v0;
import od.j1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.a;
import sb.b;
import tc.y1;
import ud.a2;
import ud.d1;
import ud.e1;
import ud.i1;
import ud.k0;
import ud.q1;
import ud.r1;
import ud.v1;
import ud.v4;
import ud.x1;
import ud.x2;
import vc.x;
import vd.g0;
import vd.o0;
import vd.y;
import zd.o6;
import zd.s1;
import zd.t1;
import zd.ya;

public abstract class a extends ComponentActivity implements View.OnTouchListener, k.b, x.a, ae.l, SensorEventListener, o0.d, t1.a, w.a, Handler.Callback {
    public IntentFilter A0;
    public boolean A1;
    public boolean B1;
    public SensorManager C1;
    public boolean D0;
    public Sensor D1;
    public boolean E0;
    public boolean E1;
    public boolean F0;
    public boolean G0;
    public float G1;
    public int H0;
    public boolean H1;
    public boolean I0;
    public Handler I1;
    public ii J0;
    public boolean J1;
    public ii K0;
    public boolean K1;
    public int L1;
    public kb.b M0;
    public int M1;
    public x2 N0;
    public List<v4<?>> N1;
    public boolean O0;
    public s0 O1;
    public boolean P0;
    public KonfettiView P1;
    public l Q0;
    public uc.a R0;
    public ValueAnimator S0;
    public float T0;
    public Handler U;
    public kb.b U0;
    public ne.e V;
    public e1 W;
    public j2 W0;
    public q1 X;
    public dd.d X0;
    public r1 Y;
    public dd.j Y0;
    public k0 Z;
    public j2 Z0;
    public x1 f20013a0;
    public m1 f20014a1;
    public ce.w f20015b0;
    public vc.x f20016b1;
    public int f20019d0;
    public a2 f20020d1;
    public boolean f20021e0;
    public View f20023f0;
    public ie.a f20024f1;
    public ie.a f20026g1;
    public g0 f20027h0;
    public y f20029i0;
    public ie.j f20031j0;
    public float f20032j1;
    public o6 f20033k0;
    public boolean f20034k1;
    public View f20035l0;
    public v4.k f20036l1;
    public kb.b f20037m0;
    public eb.k f20038m1;
    public List<Reference<View>> f20039n0;
    public ee.k f20040n1;
    public boolean f20042o1;
    public z1 f20043p0;
    public boolean f20044p1;
    public int f20045q0;
    public boolean f20046q1;
    public int f20048r1;
    public boolean f20049s0;
    public float f20051t0;
    public boolean f20052t1;
    public int f20053u0;
    public boolean f20054u1;
    public List<v4<?>> f20055v0;
    public boolean f20056v1;
    public List<v4<?>> f20057w0;
    public boolean f20059x0;
    public boolean f20061y0;
    public kb.g f20062y1;
    public float f20064z1;
    public final lb.d<h> f20017c0 = new lb.d<>();
    public int f20025g0 = -1;
    public final lb.d<i> f20041o0 = new lb.d<>();
    public int f20047r0 = 0;
    public final lb.d<m> f20063z0 = new lb.d<>(true);
    public BroadcastReceiver B0 = new b();
    public int C0 = 0;
    public final ArrayList<k> L0 = new ArrayList<>();
    public final ArrayList<x1> V0 = new ArrayList<>();
    public final ArrayList<j2> f20018c1 = new ArrayList<>();
    public final k0.h<j2> f20022e1 = new k0.h<>();
    public final k0.h<ud.a> f20028h1 = new k0.h<>();
    public final k0.h<ie.a> f20030i1 = new k0.h<>();
    public final DisplayMetrics f20050s1 = new DisplayMetrics();
    public final v f20058w1 = new v();
    public final ArrayList<v> f20060x1 = new ArrayList<>();
    public final lb.d<j> F1 = new lb.d<>();

    public class C0172a extends kb.b {
        public C0172a() {
        }

        @Override
        public void b() {
            if (a.this.f20023f0 != null) {
                a.this.f20023f0.setEnabled(true);
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.TIMEZONE_CHANGED".equals(action) || "android.intent.action.TIME_SET".equals(action)) {
                    he.i.c2().E(true);
                }
            }
        }
    }

    public class c extends kb.b {
        public c() {
        }

        @Override
        public void b() {
            if (a.this.M0 == this) {
                a.this.M0 = null;
                a.this.X.m0();
            }
        }
    }

    public class d implements k.b {
        public final ii f20066a;

        public d(ii iiVar) {
            this.f20066a = iiVar;
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            this.f20066a.get().setAlpha(1.0f - f10);
            a.this.K3();
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
            a.this.V.removeView(this.f20066a.get());
            this.f20066a.Z8();
            if (a.this.K0 == this.f20066a) {
                a.this.K0 = null;
            }
            a.this.K3();
        }
    }

    public class e extends AnimatorListenerAdapter {
        public final boolean f20068a;

        public e(boolean z10) {
            this.f20068a = z10;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            a.this.P0 = false;
            a.this.S0 = null;
            if (this.f20068a && a.this.R0 != null && a.this.R0.getProgress() != null) {
                a.this.R0.getProgress().setVisibility(8);
                a.this.R0.getProgress().setVisibility(0);
            }
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            a.this.P0 = false;
            a.this.y2();
            a aVar = a.this;
            aVar.W.removeView(aVar.R0);
        }
    }

    public class g extends kb.b {
        public final String M;
        public final l N;

        public g(String str, l lVar) {
            this.M = str;
            this.N = lVar;
        }

        @Override
        public void b() {
            a.this.D3(this.M, this.N);
        }
    }

    public interface h {
        void M4();

        void Q0(int i10, boolean z10);

        void c6();

        void o6();
    }

    public interface i {
        boolean onKeyDown(int i10, KeyEvent keyEvent);

        boolean onKeyUp(int i10, KeyEvent keyEvent);
    }

    public interface j {
        void a(float f10);
    }

    public interface k {
        void e(a aVar, boolean z10);
    }

    public interface l {
        void a();
    }

    public interface m {
        void V(a aVar, int i10, int i11);
    }

    public static void C1(View view) {
        he.i.c2().d5(w.k2(), !w.G2());
    }

    public void D1(ValueAnimator valueAnimator) {
        p3(1.0f - db.b.a(valueAnimator));
    }

    public void E1(v4.k kVar, boolean z10) {
        if (z10) {
            d2(kVar);
        }
    }

    public void F1() {
        this.W.A1(this.f20038m1, 0.0f);
        this.V.addView(this.W, 1);
    }

    public void G1() {
        this.f20038m1.i(1.0f);
    }

    public static String G3(int i10) {
        if (i10 == 0) {
            return "unspecified";
        }
        if (i10 == 1) {
            return "no";
        }
        if (i10 == 2) {
            return "yes";
        }
        throw new IllegalArgumentException("mode == " + i10);
    }

    public boolean J1(Message message) {
        if (b0()) {
            boolean z10 = message.what == 1;
            this.K1 = z10;
            z.u().d0(z10, true);
        } else {
            p0();
        }
        return true;
    }

    public void K1(ValueAnimator valueAnimator) {
        p3(db.b.a(valueAnimator));
    }

    public void L1(x2 x2Var, boolean z10) {
        if (!z10) {
            removeFromRoot(this.N0);
        } else if (this.N0.getParent() == null) {
            a0(this.N0, true);
        }
    }

    public static int M0() {
        return 12;
    }

    public static AlertDialog P1(Context context, AlertDialog alertDialog, p pVar) {
        if (pVar == null) {
            pVar = z.u().j(false);
        }
        int e10 = pVar.e(R.id.theme_color_text);
        View findViewById = alertDialog.findViewById(16908310);
        p0.E(findViewById);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(e10);
        }
        View findViewById2 = alertDialog.findViewById(16908299);
        if (findViewById2 instanceof TextView) {
            ((TextView) findViewById2).setTextColor(e10);
        }
        View q02 = p0.q0(context, alertDialog, "alertTitle");
        p0.E(q02);
        if (q02 instanceof TextView) {
            ((TextView) q02).setTextColor(e10);
        }
        if (!j2(alertDialog.getButton(-1), pVar, R.id.theme_color_textNeutral)) {
            j2(alertDialog.findViewById(16908313), pVar, R.id.theme_color_textNeutral);
        }
        if (!j2(alertDialog.getButton(-3), pVar, R.id.theme_color_textNeutral)) {
            j2(alertDialog.findViewById(16908314), pVar, R.id.theme_color_textNeutral);
        }
        if (!j2(alertDialog.getButton(-2), pVar, R.id.theme_color_textNeutral)) {
            j2(alertDialog.findViewById(16908315), pVar, R.id.theme_color_textNeutral);
        }
        Drawable background = alertDialog.getWindow().getDecorView().getBackground();
        if (background != null) {
            background.setColorFilter(new PorterDuffColorFilter(pVar.e(R.id.theme_color_overlayFilling), PorterDuff.Mode.SRC_IN));
        }
        return alertDialog;
    }

    public static int R2(int i10) {
        if (i10 == 1) {
            return 90;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 270;
        }
        return 180;
    }

    public static boolean j2(View view, p pVar, int i10) {
        if (view == null) {
            return false;
        }
        p0.E(view);
        if (!(view instanceof TextView)) {
            return false;
        }
        ((TextView) view).setTextColor(pVar.e(i10));
        return true;
    }

    public static boolean s1(int i10) {
        return i10 == 1 || i10 == 12;
    }

    public static boolean u1(View view) {
        return (view instanceof v1) || (view instanceof i1);
    }

    public static boolean v1(v4<?> v4Var) {
        return (v4Var instanceof u9) || ((v4Var instanceof j1) && ((j1) v4Var).ti() != 3);
    }

    public final void A0(Class<? extends v4<?>> cls) {
        List<v4<?>> list = this.N1;
        if (list != null) {
            for (v4<?> v4Var : list) {
                if (v4Var.getClass() == cls) {
                    z0(v4Var);
                    return;
                }
            }
        }
    }

    public boolean A1() {
        return this.f20045q0 != 0;
    }

    public final void A2(m mVar) {
        this.f20063z0.remove(mVar);
    }

    public void A3(int i10, int i11) {
        if (this.f20013a0 == null) {
            x1 x1Var = new x1(this);
            this.f20013a0 = x1Var;
            x1Var.setVisibility(8);
            this.f20013a0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        }
        if (this.f20013a0.getParent() != null) {
            this.W.removeView(this.f20013a0);
        }
        this.f20013a0.a(i10, i11);
        if (i11 != 2) {
            this.f20013a0.setAlpha(0.0f);
        }
        this.f20013a0.setVisibility(0);
        p0.Z(this.f20013a0, 2);
        k0 k0Var = this.Z;
        int indexOfChild = k0Var != null ? this.W.indexOfChild(k0Var.get()) : -1;
        if (indexOfChild == -1) {
            this.W.addView(this.f20013a0);
        } else {
            this.W.addView(this.f20013a0, indexOfChild);
        }
    }

    public boolean B0(j2 j2Var) {
        for (int n10 = this.f20022e1.n() - 1; n10 >= 0; n10--) {
            if (this.f20022e1.o(n10) == j2Var) {
                this.f20022e1.l(n10);
                return true;
            }
        }
        return false;
    }

    public boolean B1() {
        ArrayList<j2> arrayList = this.f20018c1;
        return arrayList != null && !arrayList.isEmpty();
    }

    public void B2(j2 j2Var) {
        if (!this.f20018c1.remove(j2Var)) {
            B0(j2Var);
        }
        m0();
    }

    public void B3(boolean z10) {
        if (!this.I0) {
            this.H0 = j0.D();
            h3(true);
            K3();
            ii iiVar = new ii(this, null);
            this.J0 = iiVar;
            iiVar.Kf(0);
            this.J0.Ac();
            this.V.removeView(this.W);
            this.V.addView(this.J0.get());
            this.J0.o6();
            this.J0.sc();
            int t22 = d1.t2();
            int i10 = this.H0;
            if (i10 != 0 && i10 != t22) {
                j0.m0(t22);
            }
        }
    }

    public final o6 C0() {
        o6 o6Var = this.f20033k0;
        if (o6Var != null) {
            return o6Var;
        }
        throw new AssertionError();
    }

    public final void C2(boolean z10) {
        if (this.W.getParent() == null) {
            if (this.f20040n1.Ta()) {
                if (z10) {
                    Runnable iVar = new Runnable() {
                        @Override
                        public final void run() {
                            a.this.F1();
                        }
                    };
                    if (this.f20040n1.wf()) {
                        this.f20040n1.zd(iVar, -1L);
                    } else {
                        iVar.run();
                    }
                } else {
                    this.V.addView(this.W, 1);
                }
                this.f20040n1.ag();
                this.f20040n1.kc();
            }
        } else if (z10) {
            this.f20038m1.i(0.0f);
        }
    }

    public void C3(ne.j2 r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.a.C3(ne.j2):void");
    }

    @Override
    public void C4(int i10, int i11, float f10, boolean z10) {
        if (i11 == R.id.theme_property_dark || i11 == R.id.theme_property_lightStatusBar) {
            M3();
        }
    }

    public boolean D0(boolean z10, boolean z11, boolean z12) {
        for (int size = this.f20018c1.size() - 1; size >= 0; size--) {
            j2 j2Var = this.f20018c1.get(size);
            if (j2Var.t2()) {
                if (z10 && j2Var.k2()) {
                    return j2Var.p2();
                } else {
                    if (z11 && j2Var.j0(z12)) {
                        return true;
                    }
                    j2Var.s2(true);
                    return true;
                }
            }
        }
        return false;
    }

    public final void D2(boolean z10) {
        p1(this.f20036l1);
        if (this.f20040n1.get().getParent() == null) {
            if (z10) {
                this.f20040n1.zd(new Runnable() {
                    @Override
                    public final void run() {
                        a.this.G1();
                    }
                }, -1L);
            }
            this.f20040n1.ag();
            this.f20040n1.fg(this.X.F());
            this.f20040n1.Ac();
            e3(true);
            this.V.addView(this.f20040n1.get(), 0);
            v4<?> F = this.X.F();
            if (F != null) {
                F.kc();
            }
        } else if (z10) {
            this.f20038m1.i(1.0f);
        }
    }

    public void D3(String str, l lVar) {
        boolean z10;
        if (this.O0) {
            this.R0.setMessage(str);
            return;
        }
        this.O0 = true;
        if (this.R0 == null) {
            uc.a aVar = new uc.a(this);
            this.R0 = aVar;
            aVar.z1(this.f20058w1);
            z10 = true;
        } else {
            z10 = false;
        }
        this.R0.setMessage(str);
        this.Q0 = lVar;
        if (!this.P0) {
            this.P0 = true;
            A3(-16777216, 3);
            this.f20013a0.setTranslationX(0.0f);
            this.f20013a0.setTranslationY(0.0f);
            this.f20013a0.setUnlockable(null);
            if (this.R0.getParent() != null) {
                this.W.removeView(this.R0);
            }
            this.R0.setAlpha(0.0f);
            this.R0.setScaleX(0.85f);
            this.R0.setScaleY(0.85f);
            this.W.addView(this.R0);
            ValueAnimator b10 = db.b.b();
            this.S0 = b10;
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    org.thunderdog.challegram.a.this.K1(valueAnimator);
                }
            });
            this.S0.setInterpolator(db.b.f7287b);
            this.S0.setDuration(220L);
            this.S0.addListener(new e(z10));
            if (this.R0.getProgress() != null) {
                this.R0.getProgress().setVisibility(8);
                this.R0.getProgress().setVisibility(0);
            }
            db.b.c(this.R0, this.S0);
        }
    }

    public boolean E0(View view, int i10, int i11, int i12, int i13) {
        ee.k kVar;
        if (view == null || (kVar = this.f20040n1) == null || kVar.Ha() != view) {
            return false;
        }
        this.f20040n1.Xf(i10, i11, i12, i13);
        return true;
    }

    @Override
    public void E2(int i10) {
        vd.p0.b(this, i10);
    }

    public void E3(String str, l lVar, long j10) {
        kb.b bVar = this.U0;
        if (bVar != null) {
            bVar.c();
        }
        g gVar = new g(str, lVar);
        this.U0 = gVar;
        j0.e0(gVar, j10);
    }

    public void F0(MotionEvent motionEvent) {
        dd.d dVar = this.X0;
        if (dVar != null) {
            dVar.Z1(motionEvent);
        }
    }

    public void F2(dd.l lVar, int i10, int i11) {
        dd.d dVar = this.X0;
        if (dVar != null) {
            dVar.k2(lVar, i10, i11);
        }
    }

    public boolean F3(v4.k kVar, boolean z10) {
        ee.k kVar2;
        if (this.f20034k1 == z10 || !h0() || w1()) {
            return false;
        }
        if (z10) {
            if (c2(kVar)) {
                return false;
            }
            if (!s1(this.f20019d0) && (kVar2 = this.f20040n1) != null && !kVar2.ng()) {
                return false;
            }
        }
        V2(true);
        if (!z10) {
            this.f20040n1.ag();
        }
        X2(kVar, z10, true);
        this.f20040n1.lg(true);
        return true;
    }

    public void G0() {
        H0(this.f20032j1 >= 0.8f, false);
    }

    public final void G2(int i10) {
        try {
            setRequestedOrientation(i10);
        } catch (Throwable th) {
            Log.e("Cannot request orientation", th, new Object[0]);
        }
    }

    public void H0(boolean z10, boolean z11) {
        if (this.f20042o1) {
            V2(false);
            boolean z12 = z10 || this.f20044p1;
            if (!z12) {
                this.f20040n1.lg(false);
            }
            X2(this.f20036l1, z12, true);
            float f10 = 1.0f;
            if ((!z12 || this.f20032j1 != 1.0f) && (z12 || this.f20032j1 != 0.0f)) {
                this.f20038m1.y((!z11 || !z12) ? 200L : 140L);
                eb.k kVar = this.f20038m1;
                if (!z12) {
                    f10 = 0.0f;
                }
                kVar.i(f10);
                return;
            }
            n2(this.f20032j1);
        }
    }

    public final void H2() {
        G2(12);
    }

    public ee.k H3(v4.k kVar) {
        if (this.f20034k1 || !h0()) {
            return null;
        }
        p1(kVar);
        this.f20056v1 = true;
        return this.f20040n1;
    }

    public final void I0() {
        kb.b bVar = this.f20037m0;
        if (bVar != null) {
            bVar.c();
        }
        C0172a aVar = new C0172a();
        this.f20037m0 = aVar;
        j0.e0(aVar, 1000L);
    }

    public void I2() {
        View view = this.f20023f0;
        if (view != null) {
            view.requestFocus();
        }
    }

    public x2 I3() {
        if (this.N0 == null) {
            x2 x2Var = new x2(this);
            this.N0 = x2Var;
            x2Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.N0.setAvailabilityListener(new x2.d() {
                @Override
                public final void a(x2 x2Var2, boolean z10) {
                    a.this.L1(x2Var2, z10);
                }
            });
        }
        return this.N0;
    }

    public void J0() {
        if (this.f20034k1) {
            V2(true);
            W2(0.0f, true);
            H0(false, false);
        }
    }

    public void J2() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, 2);
        }
    }

    public void J3() {
        vc.x xVar = this.f20016b1;
        if (!(xVar == null || xVar.getParent() == null)) {
            this.f20016b1.y2(true);
        }
        this.f20027h0.I0();
        x2 x2Var = this.N0;
        if (x2Var != null) {
            x2Var.o();
        }
    }

    public void K0(boolean z10) {
        if (this.K1 != z10) {
            this.K1 = z10;
            p0();
        }
    }

    public void K2(String[] strArr, ie.a aVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f20026g1 = aVar;
            try {
                requestPermissions(strArr, 9);
            } catch (Throwable unused) {
                Log.e("Cannot check permissions: %s", TextUtils.join(", ", strArr));
                aVar.l1(9, false);
                this.f20026g1 = null;
            }
        }
    }

    public final void K3() {
        boolean z10;
        int i10;
        float f10;
        if (fd.a.f11902x) {
            boolean z11 = true;
            if ((this.f20047r0 & 4) != 0) {
                i10 = j0.f5284k;
                z10 = false;
            } else {
                i10 = ae.j.b();
                z10 = !ae.j.x0();
            }
            if (this.f20064z1 != 0.0f) {
                kb.g gVar = this.f20062y1;
                i10 = ib.d.d(i10, ib.d.c(gVar != null ? gVar.get() : 0, 503316480), this.f20064z1);
                z10 = z10 && this.A1;
            }
            float f11 = this.f20051t0;
            if (f11 != 0.0f) {
                i10 = ib.d.d(i10, j0.f5284k, f11);
                z10 = false;
            }
            if (this.I0) {
                f10 = 1.0f;
            } else {
                ii iiVar = this.K0;
                f10 = iiVar != null ? iiVar.get().getAlpha() : 0.0f;
            }
            if (f10 != 0.0f) {
                i10 = ib.d.d(i10, ae.j.L(R.id.theme_color_passcode), f10);
                if (!z10 || f10 >= 0.5f) {
                    z11 = false;
                }
                z10 = z11;
            }
            getWindow().setNavigationBarColor(i10);
            if (this.f20049s0 != z10) {
                this.f20049s0 = z10;
                int i11 = this.f20047r0;
                if (z10) {
                    i11 |= 16;
                }
                if (ae.j.A0()) {
                    i11 |= Log.TAG_LUX;
                }
                getWindow().getDecorView().setSystemUiVisibility(i11);
            }
        }
    }

    public int L0() {
        return this.f20025g0;
    }

    public void L2(boolean z10, boolean z11, final ie.a aVar) {
        M2(z10, z11, new Runnable() {
            @Override
            public final void run() {
                ie.a.this.l1(6, false);
            }
        }, aVar);
    }

    public void L3() {
        getWindow().getContext().getTheme().applyStyle(ae.j.x0() ? 2131689478 : R.style.AppTheme, true);
    }

    public void M1(j2 j2Var) {
        int o12 = o1(j2Var);
        if (o12 != -1) {
            int min = Math.min(o12, this.f20018c1.size());
            if (min == this.f20018c1.size()) {
                this.f20018c1.add(j2Var);
            } else {
                this.f20018c1.add(min, j2Var);
            }
            this.f20022e1.k(o12);
            m0();
        }
    }

    public void M2(final boolean z10, boolean z11, Runnable runnable, final ie.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (z11) {
            I1(z10, aVar);
        } else {
            a0.h(this, z10, runnable, new Runnable() {
                @Override
                public final void run() {
                    a.this.I1(z10, aVar);
                }
            });
        }
    }

    public void M3() {
        v3(this.f20047r0, false);
    }

    public View N0() {
        return this.W;
    }

    public void N1(int i10) {
        if (this.f20019d0 != i10) {
            this.f20019d0 = i10;
            if (this.F0) {
                G2(i10);
            } else {
                g3(true);
            }
        }
    }

    public final void I1(boolean z10, ie.a aVar) {
        String[] strArr;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (i10 < 29 || !fd.a.f11897s || !z10) {
                strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            } else {
                strArr = new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            }
            if (aVar != null) {
                this.f20030i1.j(6, aVar);
                requestPermissions(strArr, 7);
                return;
            }
            requestPermissions(strArr, 6);
        }
    }

    public int O0(View view) {
        int measuredWidth = view.getMeasuredWidth();
        return measuredWidth != 0 ? measuredWidth : this.X.get().getMeasuredWidth();
    }

    public AlertDialog O1(AlertDialog alertDialog, p pVar) {
        return P1(this, alertDialog, pVar);
    }

    public void O2(ie.a aVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f20024f1 = aVar;
            requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 8);
        }
    }

    public int P0() {
        return this.f20019d0;
    }

    public void P2() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
        }
    }

    public void Q(h hVar) {
        this.f20017c0.add(hVar);
    }

    public j2 Q0() {
        if (this.f20018c1.isEmpty()) {
            return null;
        }
        ArrayList<j2> arrayList = this.f20018c1;
        return arrayList.get(arrayList.size() - 1);
    }

    public q1 Q1() {
        return this.X;
    }

    public final void Q2() {
        Iterator<j2> it = this.f20018c1.iterator();
        while (it.hasNext()) {
            it.next().F2();
        }
    }

    @Override
    public final void Q5(int i10, int i11) {
        z1 z1Var;
        z1 z1Var2;
        if (w.H1(i10, i11) && (z1Var2 = this.f20043p0) != null) {
            z1Var2.E1();
        }
        if (i10 == 0) {
            z1 z1Var3 = this.f20043p0;
            if (z1Var3 != null) {
                z1Var3.G1(0);
            }
        } else if (i10 == 2 && (z1Var = this.f20043p0) != null) {
            z1Var.G1(i11);
        }
    }

    public void R(v4<?> v4Var, boolean z10) {
        List<v4<?>> list;
        if (z10) {
            if (this.f20057w0 == null) {
                this.f20057w0 = new ArrayList();
            }
            list = this.f20057w0;
        } else {
            if (this.f20055v0 == null) {
                this.f20055v0 = new ArrayList();
            }
            list = this.f20055v0;
        }
        if (!list.contains(v4Var)) {
            list.add(v4Var);
            b3(z10 ? 8 : 4, true);
        }
    }

    public v4<?> R0() {
        j2 Q0 = Q0();
        if (Q0 != null) {
            return Q0.getBoundController();
        }
        return null;
    }

    public abstract boolean R1();

    public k0 S0() {
        return this.Z;
    }

    public boolean S1() {
        return true;
    }

    public final void S2(int i10) {
        int i11 = this.f20025g0;
        if (i11 != i10) {
            boolean z10 = i11 == 0;
            this.f20025g0 = i10;
            if (i10 != 0) {
                if (z10) {
                    this.U.removeMessages(2);
                }
                j0.o0(this, i10);
            } else {
                Handler handler = this.U;
                handler.sendMessageDelayed(Message.obtain(handler, 2), 200L);
            }
            Iterator<m> it = this.f20063z0.iterator();
            while (it.hasNext()) {
                it.next().V(this, i10, i11);
            }
        }
    }

    public final void T(v vVar) {
        if (!this.f20060x1.contains(vVar)) {
            this.f20060x1.add(vVar);
        }
    }

    public final k0.h<j2> T0() {
        return this.f20022e1;
    }

    public final boolean T1() {
        return this.B1 && this.D1 != null && this.f20025g0 == 0 && he.i.c2().m1() == 1;
    }

    public void T2(boolean z10) {
        if (this.f20044p1 != z10) {
            this.f20044p1 = z10;
            if (z10) {
                G0();
            }
        }
    }

    public void U(v4<?> v4Var, ArrayList<o<?>> arrayList, x.h hVar) {
        vc.x xVar = this.f20016b1;
        if (xVar != null) {
            xVar.V1(v4Var, arrayList, hVar);
        }
    }

    public r1 U0() {
        return this.Y;
    }

    public final void U1() {
        Iterator<h> it = this.f20017c0.iterator();
        while (it.hasNext()) {
            it.next().M4();
        }
    }

    public void U2(float f10) {
        if (this.f20042o1) {
            eb.k kVar = this.f20038m1;
            if (kVar != null) {
                kVar.l(f10);
            }
            W2(f10, true);
        }
    }

    public void V(i iVar) {
        this.f20041o0.add(iVar);
    }

    @Override
    public boolean V0() {
        vc.x xVar;
        return this.O0 || ((xVar = this.f20016b1) != null && xVar.X1()) || !this.f20060x1.isEmpty() || fd.a.f11902x;
    }

    public final void V2(boolean z10) {
        if (this.f20042o1 != z10) {
            this.f20042o1 = z10;
            l0();
        }
    }

    public void W(j jVar) {
        this.F1.add(jVar);
        k3(!this.F1.isEmpty());
    }

    public float W0() {
        return this.G1;
    }

    public final void W1() {
        Iterator<h> it = this.f20017c0.iterator();
        while (it.hasNext()) {
            it.next().c6();
        }
    }

    public final void W2(float f10, boolean z10) {
        eb.k kVar;
        if (f10 < 0.0f) {
            f10 = -f10;
        }
        float f11 = this.f20032j1;
        if (f11 != f10) {
            boolean z11 = f10 > f11;
            this.f20032j1 = f10;
            l0();
            d0(this.W);
            this.f20040n1.Vf(f10, z10, z11);
            if (z10 && (kVar = this.f20038m1) != null) {
                kVar.l(f10);
            }
        }
    }

    public void X(k kVar) {
        this.L0.add(kVar);
    }

    public x1 X0() {
        if (this.V0.isEmpty()) {
            return this.f20013a0;
        }
        ArrayList<x1> arrayList = this.V0;
        return arrayList.get(arrayList.size() - 1);
    }

    public final void X1() {
        Iterator<h> it = this.f20017c0.iterator();
        while (it.hasNext()) {
            it.next().o6();
        }
    }

    public final void X2(v4.k kVar, boolean z10, boolean z11) {
        if (this.f20034k1 != z10) {
            this.f20034k1 = z10;
            if (z10) {
                this.f20036l1 = kVar;
            }
            if (this.f20038m1 == null) {
                this.f20038m1 = new eb.k(0, this, db.b.f7287b, 240L, this.f20032j1);
            }
            float f10 = z10 ? 1.0f : 0.0f;
            if (!z11) {
                this.f20038m1.y(240L);
            }
            if (this.f20038m1.v()) {
                if (z11) {
                    this.f20038m1.k();
                } else {
                    this.f20038m1.i(f10);
                }
            } else if (z10) {
                D2(!z11);
            } else {
                C2(!z11);
            }
        }
    }

    public void Y() {
        View view = this.f20035l0;
        if (view != null) {
            this.V.removeView(view);
            this.f20035l0 = null;
            return;
        }
        View view2 = new View(this);
        view2.setLayoutParams(FrameLayoutFix.r1(ce.a0.i(32.0f), ce.a0.i(32.0f), 49));
        view2.setBackgroundColor(1895759872);
        view2.setOnClickListener(oc.e.f19374a);
        ne.e eVar = this.V;
        this.f20035l0 = view2;
        eVar.addView(view2);
    }

    public x1 Y0() {
        return this.f20013a0;
    }

    public void Y1(boolean z10) {
        if (!this.O0) {
            x2 x2Var = this.N0;
            if ((x2Var != null && x2Var.l()) || D0(false, true, z10)) {
                return;
            }
            if (this.f20034k1) {
                t0();
            } else if (this.f20029i0.c0()) {
                this.f20029i0.C0();
            } else if (t1(false)) {
            } else {
                if (this.X.s0(z10)) {
                    super.onBackPressed();
                } else if (!this.X.j0(z10)) {
                    k0 k0Var = this.Z;
                    if (k0Var == null || !k0Var.Ff()) {
                        v4<?> F = this.X.F();
                        if (F == null) {
                            super.onBackPressed();
                        } else if (F.Oa() || F.Na() || F.Ma()) {
                            this.X.j0(z10);
                        } else {
                            super.onBackPressed();
                        }
                    } else {
                        this.Z.pf(0.0f, null);
                    }
                }
            }
        } else if (this.Q0 != null) {
            m1(true);
        }
    }

    public void Y2(kb.g gVar, float f10, boolean z10) {
        if (!fd.a.f11902x) {
            return;
        }
        if (this.f20062y1 != gVar || this.f20064z1 != f10 || this.A1 != z10) {
            this.f20062y1 = gVar;
            this.f20064z1 = f10;
            this.A1 = z10;
            K3();
        } else if (gVar != null && f10 > 0.0f) {
            K3();
        }
    }

    public final void Z(m mVar) {
        this.f20063z0.add(mVar);
    }

    public y Z0() {
        return this.f20029i0;
    }

    public final void Z1() {
        this.f20040n1.lc();
        this.V.removeView(this.f20040n1.get());
        e3(false);
        v4<?> F = this.X.F();
        if (F != null) {
            F.sc();
        }
    }

    public final void Z2(boolean z10) {
        w3(z10 ? Log.TAG_LUX : 0, Log.TAG_LUX);
    }

    public void a0(View view, boolean z10) {
        FrameLayoutFix Y0;
        ii iiVar = this.J0;
        int indexOfChild = (iiVar == null || !this.I0) ? -1 : this.V.indexOfChild(iiVar.get());
        if (indexOfChild == -1 && (Y0 = this.f20027h0.Y0()) != null) {
            indexOfChild = this.V.indexOfChild(Y0);
        }
        if (indexOfChild == -1 && !z10) {
            z1 z1Var = this.f20043p0;
            indexOfChild = z1Var != null ? this.V.indexOfChild(z1Var) : -1;
        }
        x2 x2Var = this.N0;
        int indexOfChild2 = x2Var != null ? this.V.indexOfChild(x2Var) : -1;
        if (indexOfChild2 != -1) {
            if (indexOfChild != -1) {
                indexOfChild2 = Math.min(indexOfChild2, indexOfChild);
            }
            indexOfChild = indexOfChild2;
        }
        if (indexOfChild != -1) {
            this.V.addView(view, indexOfChild);
        } else {
            this.V.addView(view);
        }
    }

    public g0 a1() {
        return this.f20027h0;
    }

    public final void a2() {
        this.V.removeView(this.W);
        this.f20040n1.sc();
        this.f20040n1.lg(false);
        n1();
    }

    public final void a3(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (this.f20059x0 != z10) {
            this.f20059x0 = z10;
            if (i10 >= 28 && z10) {
                this.f20061y0 = true;
                Window window = getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = z10 ? 1 : 0;
                window.setAttributes(attributes);
            }
            w3(z10 ? Log.TAG_CAMERA : 0, Log.TAG_CAMERA);
            if (z10) {
                v3(1, true);
            } else {
                v3(0, true);
            }
            if (i10 >= 28 && !z10) {
                Window window2 = getWindow();
                WindowManager.LayoutParams attributes2 = window2.getAttributes();
                attributes2.layoutInDisplayCutoutMode = 0;
                window2.setAttributes(attributes2);
            }
        }
    }

    public void addToNavigation(View view) {
        this.X.l(view);
    }

    public final boolean b0() {
        v4<?> F = this.X.F();
        return (F == null || F.E8()) && (this.M1 & Log.TAG_YOUTUBE) == 0;
    }

    public int b1() {
        if (i1()) {
            o6 C0 = C0();
            boolean X0 = C0.ka().X0();
            TdApi.SuggestedAction Ac = C0.Ac();
            if ((Ac != null ? 1 : Ac != null || C0.z6() ? 2 : 0) + (X0 ? 1 : 0) > 1) {
                return o6.B2;
            }
            if (X0) {
                return R.drawable.baseline_notification_important_14;
            }
            if (Ac != null) {
                int constructor = Ac.getConstructor();
                if (constructor == 648771563) {
                    return R.drawable.baseline_sim_card_alert_14;
                }
                if (constructor == 1910534839) {
                    return R.drawable.baseline_gpp_maybe_14;
                }
                throw new UnsupportedOperationException(Ac.toString());
            }
        }
        return 0;
    }

    public void b2() {
    }

    public void b3(int i10, boolean z10) {
        int h10 = ib.c.h(this.f20053u0, i10, z10);
        if (this.f20053u0 != h10) {
            this.f20053u0 = h10;
            a3(h10 != 0 && !ib.c.b(h10, 2) && !ib.c.b(h10, 4));
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public ie.j c0() {
        return this.f20031j0;
    }

    public int c1() {
        return R2(getWindowManager().getDefaultDisplay().getRotation());
    }

    public final boolean c2(final v4.k kVar) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (!v0.Y1(kVar.f24528d ? ee.k.f11651t1 : ee.k.f11650s1)) {
            return false;
        }
        v0.x2(kVar.f24528d ? ee.k.f11651t1 : ee.k.f11650s1, new kb.i() {
            @Override
            public final void a(boolean z10) {
                a.this.E1(kVar, z10);
            }
        });
        return true;
    }

    public final void c3(boolean z10) {
        if (this.J1) {
            if (this.I1 == null) {
                this.I1 = new Handler(Looper.getMainLooper(), new Handler.Callback() {
                    @Override
                    public final boolean handleMessage(Message message) {
                        boolean J1;
                        J1 = a.this.J1(message);
                        return J1;
                    }
                });
            }
            if (!this.I1.hasMessages(z10 ? 1 : 0)) {
                this.I1.removeMessages(!z10 ? 1 : 0);
                if (this.K1 != z10) {
                    Handler handler = this.I1;
                    handler.sendMessageDelayed(Message.obtain(handler, (int) z10), 1500L);
                }
            }
        } else if (b0()) {
            Handler handler2 = this.I1;
            if (handler2 != null) {
                handler2.removeMessages(0);
                this.I1.removeMessages(1);
            }
            if (this.K1 != z10) {
                this.K1 = z10;
                z.u().d0(z10, true);
                this.J1 = true;
            }
        }
    }

    public void d0(e1 e1Var) {
        if (this.f20040n1 != null) {
            int measuredHeight = e1Var.getMeasuredHeight();
            float f10 = (-measuredHeight) * this.f20032j1;
            e1Var.setTranslationY(f10);
            z1 z1Var = this.f20043p0;
            if (z1Var != null) {
                z1Var.setTranslationY(f10);
            }
            this.f20040n1.Wf(f10 + measuredHeight);
            J3();
        }
    }

    public boolean d1() {
        return this.f20021e0;
    }

    public boolean d2(v4.k kVar) {
        if (this.f20034k1) {
            return true;
        }
        if (!h0()) {
            return false;
        }
        if (w1()) {
            n1();
            Handler handler = this.U;
            handler.sendMessageDelayed(Message.obtain(handler, 1, kVar), 100L);
            return false;
        }
        n1();
        if (c2(kVar)) {
            return false;
        }
        X2(kVar, true, false);
        return true;
    }

    public void d3(rh rhVar, boolean z10) {
        vc.x xVar = this.f20016b1;
        if (xVar != null && xVar.getTdlibDelegate() == rhVar) {
            this.f20016b1.y2(false);
            this.f20016b1.setHidden(z10);
        }
    }

    public boolean e0() {
        vc.x xVar = this.f20016b1;
        return xVar != null && xVar.g2();
    }

    public boolean e1() {
        Iterator<j2> it = this.f20018c1.iterator();
        while (it.hasNext()) {
            if (!it.next().m2()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void e2() {
        List<Reference<View>> list = this.f20039n0;
        if (list != null) {
            try {
                for (int size = list.size() - 1; size >= 0; size--) {
                    View view = this.f20039n0.get(size).get();
                    if (view != null) {
                        view.invalidate();
                    } else {
                        this.f20039n0.remove(size);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void e3(boolean z10) {
        if (this.f20054u1 != z10) {
            this.f20054u1 = z10;
            l0();
        }
    }

    @Override
    public final void e5(o6 o6Var, TdApi.Message message, int i10, int i11, float f10, boolean z10) {
        s3(1, message != null && i11 == 3);
    }

    public final void f0() {
        kb.b bVar = this.f20037m0;
        if (bVar != null) {
            bVar.c();
            this.f20037m0 = null;
        }
        View view = this.f20023f0;
        if (view != null) {
            view.setEnabled(false);
        }
    }

    public boolean f1() {
        Iterator<j2> it = this.f20018c1.iterator();
        while (it.hasNext()) {
            if (it.next().getBoundView() instanceof i1) {
                return true;
            }
        }
        return false;
    }

    public boolean f2(m1.f fVar) {
        if (this.Z0 != null) {
            return false;
        }
        m1 m1Var = new m1(this);
        this.f20014a1 = m1Var;
        try {
            m1Var.K1(fVar);
            j2 j2Var = new j2(this);
            this.Z0 = j2Var;
            j2Var.setOverlayStatusBar(true);
            boolean z10 = fd.b.f11911h;
            this.Z0.L1(true);
            if (!fVar.v()) {
                this.Z0.I2();
            }
            if (fVar.D()) {
                this.Z0.G2();
            }
            j2 j2Var2 = this.Z0;
            m1 m1Var2 = this.f20014a1;
            j2Var2.L2(m1Var2, m1Var2);
            return true;
        } catch (Throwable th) {
            Log.e("Unable to open force touch preview", th, new Object[0]);
            return false;
        }
    }

    public void f3(boolean z10) {
        if (this.E0 != z10) {
            this.E0 = z10;
        }
    }

    @Override
    public void g0(o6 o6Var, TdApi.Message message) {
        vd.p0.a(this, o6Var, message);
    }

    public boolean g1() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        defaultDisplay.getRealMetrics(this.f20050s1);
        DisplayMetrics displayMetrics = this.f20050s1;
        int i10 = displayMetrics.heightPixels;
        int i11 = displayMetrics.widthPixels;
        defaultDisplay.getMetrics(displayMetrics);
        DisplayMetrics displayMetrics2 = this.f20050s1;
        int i12 = displayMetrics2.heightPixels;
        int i13 = displayMetrics2.widthPixels;
        int n10 = ce.a0.n();
        return n10 > 0 && (i11 - i13 >= n10 || i10 - i12 >= n10);
    }

    public void g2(dd.j jVar, dd.l lVar) {
        dd.d dVar = this.X0;
        if (dVar != null && this.Y0 == jVar) {
            dVar.j2(lVar);
        }
    }

    public final void g3(boolean z10) {
        if (this.F0 != z10 && !this.G0) {
            this.F0 = z10;
            if (z10) {
                int rotation = getWindowManager().getDefaultDisplay().getRotation();
                int i10 = this.f20019d0;
                if (i10 == 2 && (rotation == 0 || rotation == 1)) {
                    G2(0);
                } else if (i10 == 1 && (rotation == 0 || rotation == 1)) {
                    H2();
                } else if (i10 == 2 && (rotation == 2 || rotation == 3)) {
                    G2(8);
                } else if (i10 != 1) {
                } else {
                    if (rotation == 2 || rotation == 3) {
                        H2();
                    }
                }
            } else {
                G2(-1);
            }
        }
    }

    public final boolean h0() {
        eb.k kVar;
        return Q0() == null && ((kVar = this.f20038m1) == null || !kVar.v()) && this.f20025g0 == 0 && !this.f20029i0.c0() && !this.f20056v1 && !x1();
    }

    public boolean h1() {
        int i10 = this.C0;
        return i10 == 2 || i10 == 1;
    }

    public void h2(o6 o6Var, dd.j jVar, dd.l lVar, int i10, int i11, int i12, int i13, boolean z10) {
        if (this.X0 == null) {
            this.Y0 = jVar;
            dd.d dVar = new dd.d(this);
            this.X0 = dVar;
            dVar.setControllerView(this.Y0);
            this.X0.p2(o6Var, lVar, i10, i11, i12, i13, z10);
            j2 j2Var = new j2(this);
            this.W0 = j2Var;
            j2Var.setBackListener(this.X0);
            this.W0.setOverlayStatusBar(true);
            this.W0.L1(true);
            this.W0.I2();
            j2 j2Var2 = this.W0;
            dd.d dVar2 = this.X0;
            j2Var2.L2(dVar2, dVar2);
        }
    }

    public final void h3(boolean z10) {
        if (this.I0 != z10) {
            this.I0 = z10;
            if (z10) {
                t2();
            } else {
                Q2();
            }
            b3(2, z10);
            if (z10) {
                kb.b bVar = this.M0;
                if (bVar != null) {
                    bVar.c();
                    this.M0 = null;
                } else {
                    this.X.k0();
                }
            } else {
                c cVar = new c();
                this.M0 = cVar;
                cVar.e(j0.o());
                j0.e0(this.M0, 100L);
            }
            for (int size = this.L0.size() - 1; size >= 0; size--) {
                this.L0.get(size).e(this, z10);
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            d2((v4.k) message.obj);
        } else if (i10 == 2 && this.f20025g0 == 0 && !j0.o0(this, 0)) {
            ya.o1().g3().c();
        }
        return true;
    }

    public final void i0() {
        boolean z10 = true;
        if (!(this.f20025g0 == 0 && he.i.c2().m1() == 1)) {
            z10 = false;
        }
        q3(z10);
        t3(getResources().getConfiguration().uiMode & 48);
    }

    public final boolean i1() {
        return this.f20033k0 != null;
    }

    public final void i2(v4<?> v4Var) {
        List<v4<?>> list = this.N1;
        if (list == null || !list.contains(v4Var)) {
            if (this.N1 == null) {
                this.N1 = new ArrayList();
            }
            if (this.O1 == null) {
                s0 s0Var = new s0(this);
                this.O1 = s0Var;
                s0Var.setPadding(0, d1.getTopOffset(), 0, 0);
                this.O1.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            }
            if (this.O1.getParent() == null) {
                a0(this.O1, false);
            }
            this.N1.add(v4Var);
            this.O1.A1(v4Var.Ca());
        }
    }

    @Override
    public void i3(p pVar, p pVar2) {
        if (fd.a.f11902x && pVar.c() != pVar2.c()) {
            K3();
        }
        A0(t30.class);
        if (pVar.f() != pVar2.f()) {
            M3();
        }
        if (pVar.c() != pVar2.c()) {
            L3();
        }
    }

    @Override
    public void j(boolean z10) {
        this.X.n0(z10);
        this.D0 = z10;
        z1 z1Var = this.f20043p0;
        if (z1Var != null) {
            z1Var.H1();
        }
    }

    public void j0() {
        ee.k kVar = this.f20040n1;
        if (kVar != null) {
            kVar.kf();
        }
    }

    public void j1() {
        View view = this.f20023f0;
        if (view != null) {
            ce.x.c(view);
        }
    }

    public final void j3(boolean z10) {
        Window window;
        if (this.f20052t1 != z10 && (window = getWindow()) != null) {
            if (z10) {
                window.addFlags(134217728);
            } else {
                window.clearFlags(134217728);
            }
            this.f20052t1 = z10;
        }
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        this.f20058w1.n(z10);
        vc.x xVar = this.f20016b1;
        if (xVar != null) {
            xVar.getThemeProvider().n(z10);
        }
        if (this.f20043p0 != null && (!z10 || z.u().s(fd.a.f11880b))) {
            this.f20043p0.invalidate();
        }
        x2 x2Var = this.N0;
        if (x2Var != null) {
            x2Var.invalidate();
        }
        Iterator<v> it = this.f20060x1.iterator();
        while (it.hasNext()) {
            it.next().n(z10);
        }
        if (fd.a.f11902x) {
            K3();
        }
    }

    public final void k0() {
        ee.k kVar;
        ee.k kVar2;
        float f10 = this.f20032j1;
        boolean z10 = false;
        boolean z11 = ((f10 < 1.0f && this.f20034k1) || (!(f10 == 0.0f || f10 == 1.0f) || this.f20042o1 || (f10 == 1.0f && (kVar2 = this.f20040n1) != null && kVar2.ng()))) && ((kVar = this.f20040n1) == null || !kVar.vf());
        if (this.f20046q1 != z11) {
            this.f20046q1 = z11;
            g3(z11);
        }
        if (this.f20032j1 == 1.0f) {
            z10 = true;
        }
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = 2;
        if (z10) {
            int i11 = attributes.rotationAnimation;
            if (i11 != 2) {
                this.f20048r1 = i11;
            }
        } else {
            i10 = this.f20048r1;
        }
        if (attributes.rotationAnimation != i10) {
            attributes.rotationAnimation = i10;
            window.setAttributes(attributes);
        }
    }

    public void k1(boolean z10) {
        if (!this.f20018c1.isEmpty()) {
            for (int size = this.f20018c1.size() - 1; size >= 0; size--) {
                j2 j2Var = this.f20018c1.get(size);
                View boundView = j2Var.getBoundView();
                v4<?> boundController = j2Var.getBoundController();
                if (u1(boundView) || ((z10 && (boundView instanceof dd.i)) || (((boundView instanceof y1) && !(this.X.F() instanceof rh)) || (z10 && v1(boundController))))) {
                    j2Var.s2(true);
                }
            }
        }
    }

    public void k2(View view, int i10, int i11) {
        if (this.P1 == null) {
            KonfettiView konfettiView = new KonfettiView(this);
            this.P1 = konfettiView;
            konfettiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            a0(this.P1, true);
        }
        int[] r10 = p0.r(this.V);
        int i12 = r10[0];
        int i13 = r10[1];
        int[] r11 = p0.r(view);
        this.P1.a().a(ae.j.L(R.id.theme_color_confettiRed), ae.j.L(R.id.theme_color_confettiGreen), ae.j.L(R.id.theme_color_confettiBlue), ae.j.L(R.id.theme_color_confettiCyan), ae.j.L(R.id.theme_color_confettiPurple), ae.j.L(R.id.theme_color_confettiYellow)).h(0.0d, 359.0d).k(1.0f, 12.0f).i(true).l(600L).b(b.a.f22695b, b.c.f22699a).c(new sb.c(12, 2.0f)).j(i10 + (r11[0] - i12), i11 + (r11[1] - i13)).d(150);
    }

    public final void k3(boolean z10) {
        if (this.E1 != z10) {
            this.E1 = z10;
            if (this.B1) {
                try {
                    this.C1.unregisterListener(this, this.D1);
                    this.C1.registerListener(this, this.D1, 3, this.E1 ? 90000 : 700000);
                } catch (Throwable th) {
                    Log.w("Cannot re-register sensor event listener", th, new Object[0]);
                }
            }
        }
    }

    public void l0() {
        ee.k kVar;
        ee.k kVar2 = this.f20040n1;
        boolean z10 = false;
        boolean z11 = kVar2 != null && kVar2.vf();
        s3(8, this.f20032j1 > 0.0f || this.f20042o1);
        b3(1, (this.f20032j1 > 0.0f || this.f20042o1) && !z11);
        k0();
        if (this.f20054u1 || ((kVar = this.f20040n1) != null && kVar.vf())) {
            z10 = true;
        }
        j3(z10);
    }

    public void l1() {
        if (this.I0) {
            this.X.o0();
            this.V.addView(this.W, y1() ? 1 : 0);
            this.W.invalidate();
            h3(false);
            ii iiVar = this.J0;
            if (iiVar != null) {
                this.K0 = iiVar;
                this.J0 = null;
                new eb.k(0, new d(iiVar), db.b.f7287b, 100L).i(1.0f);
            }
            int t22 = d1.t2();
            int i10 = this.H0;
            if (i10 != 0 && i10 != t22) {
                j0.m0(i10);
            }
        }
    }

    public void l2(v4.k kVar, boolean z10) {
        if (this.f20034k1 != z10 && h0()) {
            this.V.W1(kVar, z10);
        }
    }

    public void l3(boolean z10) {
        o6 o6Var = this.f20033k0;
        if (o6Var != null) {
            o6Var.lc(z10);
        }
    }

    public final void m0() {
        boolean z10 = false;
        if (j0.f5280g != 1) {
            boolean z11 = this.X.J0() || he.d.w().R();
            if (!z11) {
                Iterator<j2> it = this.f20018c1.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().T0()) {
                            z11 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z11) {
                for (int i10 = 0; i10 < this.f20022e1.n(); i10++) {
                    j2 o10 = this.f20022e1.o(i10);
                    if (o10 != null && o10.T0()) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = z11;
        }
        Z2(z10);
    }

    public void m1(boolean z10) {
        ValueAnimator valueAnimator = this.S0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S0 = null;
            this.P0 = false;
        }
        kb.b bVar = this.U0;
        if (bVar != null) {
            bVar.c();
        }
        if (this.O0) {
            l lVar = this.Q0;
            if (lVar != null) {
                if (z10) {
                    lVar.a();
                }
                this.Q0 = null;
            }
            this.O0 = false;
            this.P0 = true;
            ValueAnimator b10 = db.b.b();
            b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    a.this.D1(valueAnimator2);
                }
            });
            b10.setInterpolator(db.b.f7287b);
            b10.setDuration(220L);
            b10.addListener(new f());
            b10.start();
        }
    }

    public void m2(j2 j2Var) {
        int indexOf = this.f20018c1.indexOf(j2Var);
        if (indexOf != -1) {
            this.f20018c1.remove(indexOf);
            while (this.f20022e1.e(indexOf) != null) {
                indexOf++;
            }
            this.f20022e1.j(indexOf, j2Var);
        }
    }

    public void m3(int i10) {
        this.G0 = i10 != -1;
        G2(i10);
    }

    @Override
    public void n0() {
    }

    public final void n1() {
        v4<?> F = this.X.F();
        if (F != null) {
            F.La();
        }
        j2 Q0 = Q0();
        if (Q0 != null) {
            Q0.p2();
        }
    }

    public final void n2(float f10) {
        if (f10 == 1.0f && this.f20034k1) {
            a2();
        } else if (f10 == 0.0f && !this.f20034k1) {
            Z1();
        }
    }

    public void n3(int i10, boolean z10) {
        int i11 = this.M1;
        boolean z11 = true;
        boolean z12 = i11 != 0;
        int h10 = ib.c.h(i11, i10, z10);
        this.M1 = h10;
        if (h10 == 0) {
            z11 = false;
        }
        if (z12 != z11) {
            g3(z11);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        if (i10 == 0) {
            W2(f10, false);
        }
    }

    public int o0(boolean z10) {
        String[] strArr;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            if (i10 < 29 || !fd.a.f11897s || !z10) {
                strArr = new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            } else {
                strArr = new String[]{"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            }
            for (String str : strArr) {
                int checkSelfPermission = checkSelfPermission(str);
                if (checkSelfPermission != 0) {
                    return checkSelfPermission;
                }
            }
        }
        return 0;
    }

    public final int o1(j2 j2Var) {
        for (int n10 = this.f20022e1.n() - 1; n10 >= 0; n10--) {
            if (this.f20022e1.o(n10) == j2Var) {
                return this.f20022e1.i(n10);
            }
        }
        return -1;
    }

    public void o2(float f10, float f11, float f12, float f13) {
        if (this.Z0 != null) {
            this.f20014a1.P1(f10, f11, f12, f13);
        }
    }

    public void o3(float f10) {
        if (fd.a.f11902x && this.f20051t0 != f10) {
            this.f20051t0 = f10;
            K3();
        }
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
        if (i10 == 0) {
            n2(f10);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 10001) {
            this.f20031j0.B(i11, intent);
            return;
        }
        int g10 = this.f20028h1.g(i10);
        if (g10 >= 0) {
            this.f20028h1.l(g10);
            this.f20028h1.o(g10).u(i10, i11, intent);
            return;
        }
        v4<?> l10 = this.X.M().l();
        if (l10 instanceof ud.a) {
            ((ud.a) l10).u(i10, i11, intent);
        }
        if (!this.f20018c1.isEmpty()) {
            for (int size = this.f20018c1.size() - 1; size >= 0; size--) {
                this.f20018c1.get(size).u(i10, i11, intent);
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (this.I0) {
            super.onBackPressed();
        } else {
            Y1(false);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        ii iiVar;
        super.onConfigurationChanged(configuration);
        boolean d10 = ce.a0.d();
        this.X.y(configuration);
        if (this.I0 && (iiVar = this.J0) != null) {
            iiVar.mc(configuration);
        }
        ee.k kVar = this.f20040n1;
        if (kVar != null) {
            kVar.mc(configuration);
        }
        this.f20019d0 = configuration.orientation;
        w.t();
        t3(configuration.uiMode & 48);
        if (d10) {
            recreate();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        j0.h0(this);
        he.a.b();
        he.a.a();
        this.f20031j0 = new ie.j(this);
        this.f20027h0 = new g0(this);
        this.f20029i0 = new y(this);
        this.f20015b0 = new ce.w(this);
        this.U = new Handler(this);
        j0.g(this);
        L3();
        if (fd.a.f11902x) {
            this.f20049s0 = !ae.j.x0();
        }
        S2(0);
        ya.o1().g3().q(this);
        he.d.w().d();
        try {
            super.onCreate(bundle);
            ce.a0.d();
            this.f20021e0 = g1();
            this.f20019d0 = j0.z();
            if (R1()) {
                k0 k0Var = new k0(this);
                this.Z = k0Var;
                k0Var.get();
            }
            q1 q1Var = new q1(this);
            this.X = q1Var;
            this.Y = new r1(this, q1Var, this.Z);
            ne.e eVar = new ne.e(this);
            this.V = eVar;
            eVar.setLayoutDirection(0);
            this.V.setKeyboardListener(this);
            this.V.L1(false);
            this.V.setId(R.id.app_root);
            e1 e1Var = new e1(this);
            this.W = e1Var;
            e1Var.setId(R.id.app_container);
            View view = new View(this);
            this.f20023f0 = view;
            view.setFocusable(true);
            this.f20023f0.setFocusableInTouchMode(true);
            this.f20023f0.setLayoutParams(FrameLayoutFix.r1(1, 1, 17));
            this.W.addView(this.f20023f0);
            this.W.addView(this.X.get());
            this.W.addView(this.f20029i0.I0());
            k0 k0Var2 = this.Z;
            if (k0Var2 != null) {
                this.W.addView(k0Var2.get());
            }
            this.V.addView(this.W);
            r0(false);
            z1 z1Var = new z1(this);
            this.f20043p0 = z1Var;
            z1Var.z1(this.f20058w1);
            this.V.addView(this.f20043p0);
            setContentView(this.V);
            z.u().e(this);
            i0();
            Q(this.f20027h0);
            Log.initLibraries(this);
            if (S1()) {
                ya.o1().w2().p(this);
                ya.o1().F2();
            }
            w.h(this);
        } catch (Throwable th) {
            Tracer.l(th);
            throw th;
        }
    }

    @Override
    public void onDestroy() {
        ii iiVar;
        try {
            super.onDestroy();
            q1 q1Var = this.X;
            if (q1Var != null) {
                q1Var.z();
            }
            w.F2(this);
            z1 z1Var = this.f20043p0;
            if (z1Var != null) {
                z1Var.Q2();
            }
            t1.b().d(this);
            ya.o1().g3().r(this);
            ce.v.H();
            S2(2);
            if (this.I0 && (iiVar = this.J0) != null) {
                iiVar.M4();
            }
            U1();
            if (!this.f20018c1.isEmpty()) {
                for (int size = this.f20018c1.size() - 1; size >= 0; size--) {
                    this.f20018c1.get(size).M4();
                }
            }
            if (this.f20022e1.n() > 0) {
                for (int i10 = 0; i10 < this.f20022e1.n(); i10++) {
                    this.f20022e1.o(i10).M4();
                }
            }
            i0();
            j0.h(this);
            ya.o1().w2().Q0(this);
        } catch (Throwable th) {
            Tracer.l(th);
            throw th;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Iterator<i> it = this.f20041o0.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 && next.onKeyDown(i10, keyEvent)) {
                z10 = true;
            }
        }
        return z10 || super.onKeyDown(i10, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        Iterator<i> it = this.f20041o0.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            i next = it.next();
            if (!z10 && next.onKeyUp(i10, keyEvent)) {
                z10 = true;
            }
        }
        return z10 || super.onKeyUp(i10, keyEvent);
    }

    @Override
    public void onPause() {
        ii iiVar;
        f0();
        S2(1);
        ee.k kVar = this.f20040n1;
        if (kVar != null) {
            kVar.c6();
        }
        if (this.I0 && (iiVar = this.J0) != null) {
            iiVar.c6();
        }
        W1();
        if (!this.f20018c1.isEmpty()) {
            Iterator<j2> it = this.f20018c1.iterator();
            while (it.hasNext()) {
                it.next().c6();
            }
        }
        if (this.f20022e1.n() > 0) {
            for (int i10 = 0; i10 < this.f20022e1.n(); i10++) {
                this.f20022e1.o(i10).c6();
            }
        }
        l3(false);
        try {
            super.onPause();
            i0();
            try {
                unregisterReceiver(this.B0);
            } catch (Throwable th) {
                Log.w(th);
            }
        } catch (Throwable th2) {
            Tracer.l(th2);
            throw th2;
        }
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        int i11;
        ie.a e10;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (iArr.length != 0) {
            boolean z10 = false;
            if (i10 != 2) {
                if (i10 == 7) {
                    for (String str : strArr) {
                        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
                            i11 = 6;
                            break;
                        }
                    }
                    i11 = 0;
                    if (!(i11 == 0 || (e10 = this.f20030i1.e(i11)) == null)) {
                        if (iArr[0] == 0) {
                            z10 = true;
                        }
                        e10.l1(i11, z10);
                        return;
                    }
                } else if (i10 == 8) {
                    ie.a aVar = this.f20024f1;
                    if (aVar != null) {
                        if (iArr[0] == 0) {
                            z10 = true;
                        }
                        aVar.l1(i10, z10);
                        this.f20024f1 = null;
                        return;
                    }
                    return;
                } else if (i10 == 9) {
                    ie.a aVar2 = this.f20026g1;
                    if (aVar2 != null) {
                        if (iArr[0] == 0) {
                            z10 = true;
                        }
                        aVar2.l1(i10, z10);
                        this.f20026g1 = null;
                        return;
                    }
                    return;
                }
                j2 Q0 = Q0();
                if (Q0 != null) {
                    if (iArr[0] == 0) {
                        z10 = true;
                    }
                    Q0.Q0(i10, z10);
                    return;
                }
                v4<?> F = this.X.F();
                if (F != null) {
                    if (iArr[0] == 0) {
                        z10 = true;
                    }
                    F.Bc(i10, z10);
                }
            } else if (iArr[0] == 0) {
                j0.Y(this);
            } else {
                j0.y0(R.string.cam_hint, 0);
            }
        }
    }

    @Override
    public void onResume() {
        ii iiVar;
        boolean z10 = this.I0;
        j0.h0(this);
        S2(0);
        he.d.w().d();
        r0(false);
        if (this.I0 && z10 && (iiVar = this.J0) != null) {
            iiVar.o6();
        }
        X1();
        if (!this.f20018c1.isEmpty()) {
            Iterator<j2> it = this.f20018c1.iterator();
            while (it.hasNext()) {
                it.next().o6();
            }
        }
        if (this.f20022e1.n() > 0) {
            for (int i10 = 0; i10 < this.f20022e1.n(); i10++) {
                this.f20022e1.o(i10).o6();
            }
        }
        l3(true);
        try {
            super.onResume();
            i0();
            ce.v.H();
            I0();
            if (this.A0 == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.A0 = intentFilter;
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.A0.addAction("android.intent.action.TIME_SET");
            }
            try {
                registerReceiver(this.B0, this.A0);
            } catch (Throwable th) {
                Log.w(th);
            }
            he.i.c2().E(true);
            this.f20031j0.m();
        } catch (Throwable th2) {
            Tracer.l(th2);
            throw th2;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        this.Y.e();
        try {
            super.onSaveInstanceState(bundle);
        } catch (Throwable th) {
            Tracer.l(th);
            throw th;
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 5) {
            boolean z10 = false;
            float f10 = sensorEvent.values[0];
            if (!T1()) {
                return;
            }
            if (this.G1 != f10 || this.H1) {
                this.G1 = f10;
                this.H1 = false;
                Iterator<j> it = this.F1.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
                if (f10 <= he.i.c2().i1()) {
                    z10 = true;
                }
                c3(z10);
            }
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        r1 r1Var = this.Y;
        return r1Var != null && !this.O0 && r1Var.g(motionEvent);
    }

    public void p0() {
        if (T1()) {
            boolean z10 = false;
            this.J1 = false;
            if (this.G1 <= he.i.c2().i1()) {
                z10 = true;
            }
            c3(z10);
        }
    }

    public final void p1(v4.k kVar) {
        ee.k kVar2 = this.f20040n1;
        if (kVar2 == null) {
            ee.k kVar3 = new ee.k(this);
            this.f20040n1 = kVar3;
            kVar3.dg(kVar.f24529e, kVar.f24531g);
            this.f20040n1.gg(kVar.f24532h, kVar.f24533i, kVar.f24534j);
            this.f20040n1.get();
            Q(this.f20040n1);
        } else {
            kVar2.dg(kVar.f24529e, kVar.f24531g);
            this.f20040n1.gg(kVar.f24532h, kVar.f24533i, kVar.f24534j);
        }
        k1(false);
        s0(true);
    }

    public boolean p2(MotionEvent motionEvent) {
        return !this.O0 && this.Y.g(motionEvent);
    }

    public void p3(float f10) {
        if (this.T0 != f10) {
            this.T0 = f10;
            float f11 = (0.14999998f * f10) + 0.85f;
            this.R0.setScaleX(f11);
            this.R0.setScaleY(f11);
            this.R0.setAlpha(f10);
            this.f20013a0.setAlpha(f10 * 0.6f);
        }
    }

    @Override
    public void q0(int i10) {
        this.J1 = false;
        this.U.post(new Runnable() {
            @Override
            public final void run() {
                a.this.i0();
            }
        });
    }

    public ce.w q1() {
        return this.f20015b0;
    }

    public void q2(int i10, ud.a aVar) {
        if (aVar != null) {
            this.f20028h1.j(i10, aVar);
        } else {
            this.f20028h1.k(i10);
        }
    }

    public final void q3(boolean z10) {
        SensorManager sensorManager;
        if (this.B1 != z10) {
            try {
                if (this.C1 == null) {
                    this.C1 = (SensorManager) getSystemService("sensor");
                }
                if (this.D1 == null && (sensorManager = this.C1) != null) {
                    this.D1 = sensorManager.getDefaultSensor(5);
                }
                boolean z11 = z10 && this.D1 != null;
                if (this.B1 == z11) {
                    Log.i((int) Log.TAG_LUX, "Cannot register light sensor, because it's unavailable", new Object[0]);
                    return;
                }
                if (z11) {
                    this.K1 = ae.j.x0();
                    this.H1 = true;
                    this.C1.registerListener(this, this.D1, 3, this.E1 ? 90000 : 700000);
                } else {
                    this.C1.unregisterListener(this, this.D1);
                }
                this.B1 = z11;
            } catch (Throwable th) {
                Object[] objArr = new Object[1];
                objArr[0] = z10 ? "register" : "unregister";
                Log.w(Log.TAG_LUX, "Cannot %s light sensor", th, objArr);
            }
        }
    }

    public final void r0(boolean z10) {
        if (!z10) {
            if (he.d.w().y()) {
                try {
                    B3(z10);
                } catch (Throwable th) {
                    Log.e("TODO", th, new Object[0]);
                }
            } else {
                he.d.w().T(false);
            }
        }
    }

    public boolean r1() {
        return this.f20034k1 || this.f20042o1 || x1();
    }

    public void r2() {
        if (this.f20056v1) {
            this.f20040n1.dg(0, null);
            this.f20056v1 = false;
        }
    }

    public void r3(a2 a2Var) {
        this.f20020d1 = a2Var;
    }

    public void removeFromNavigation(View view) {
        ((ViewGroup) this.X.get()).removeView(view);
    }

    public void removeFromRoot(View view) {
        try {
            this.V.removeView(view);
        } catch (NullPointerException e10) {
            Log.i(e10);
        }
    }

    public void s0(boolean z10) {
        if (z10) {
            Iterator<j2> it = this.f20018c1.iterator();
            while (it.hasNext()) {
                j2 next = it.next();
                if (next.getBoundController() instanceof j1) {
                    ((j1) next.getBoundController()).sk();
                }
            }
            for (int i10 = 0; i10 < this.f20022e1.n(); i10++) {
                j2 o10 = this.f20022e1.o(i10);
                if (o10 != null && (o10.getBoundController() instanceof j1)) {
                    ((j1) o10.getBoundController()).sk();
                }
            }
            return;
        }
        x0();
    }

    public void s2(h hVar) {
        this.f20017c0.remove(hVar);
    }

    public void s3(int i10, boolean z10) {
        int i11 = this.L1;
        boolean z11 = true;
        boolean z12 = i11 != 0;
        int h10 = ib.c.h(i11, i10, z10);
        this.L1 = h10;
        if (h10 == 0) {
            z11 = false;
        }
        if (z12 == z11) {
            return;
        }
        if (z11) {
            getWindow().addFlags(Log.TAG_YOUTUBE);
        } else {
            getWindow().clearFlags(Log.TAG_YOUTUBE);
        }
    }

    public void t0() {
        if (!this.f20040n1.Af() && !this.f20044p1) {
            V2(false);
            X2(null, false, false);
        }
    }

    public boolean t1(boolean z10) {
        k0 k0Var;
        eb.k kVar;
        q1 q1Var = this.X;
        return (q1Var != null && (!z10 ? q1Var.S() : q1Var.U())) || ((k0Var = this.Z) != null && k0Var.Df()) || this.O0 || ((kVar = this.f20038m1) != null && kVar.v());
    }

    public final void t2() {
        for (int size = this.f20018c1.size() - 1; size >= 0; size--) {
            this.f20018c1.get(size).r2();
        }
    }

    public final void t3(int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.a.t3(int):void");
    }

    public void u0(TdApi.File[] fileArr) {
        j1 j1Var;
        TdApi.File ni;
        int n10 = this.f20022e1.n();
        for (int i10 = 0; i10 < n10; i10++) {
            j2 o10 = this.f20022e1.o(i10);
            if (o10 != null && (o10.getBoundController() instanceof j1) && (ni = (j1Var = (j1) o10.getBoundController()).ni()) != null) {
                int length = fileArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (ni.f19913id == fileArr[i11].f19913id) {
                            j1Var.Hh();
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
    }

    public void u2(v4<?> v4Var, boolean z10) {
        List<v4<?>> list = z10 ? this.f20057w0 : this.f20055v0;
        if (list != null && list.remove(v4Var)) {
            b3(z10 ? 8 : 4, !list.isEmpty());
        }
    }

    public final void u3(o6 o6Var) {
        o6 o6Var2 = this.f20033k0;
        if (o6Var2 != o6Var) {
            boolean z10 = false;
            if (o6Var2 != null) {
                boolean d72 = o6Var2.d7();
                this.f20033k0.lc(false);
                z10 = d72;
            }
            this.f20033k0 = o6Var;
            this.f20029i0.f1(o6Var);
            o6Var.lc(z10);
            k0 k0Var = this.Z;
            if (k0Var != null) {
                k0Var.Xf(o6Var);
            }
            b2();
        }
    }

    public final void v2(v vVar) {
        this.f20060x1.remove(vVar);
    }

    public void v3(int i10, boolean z10) {
        boolean z11;
        int i11;
        View decorView = getWindow().getDecorView();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26 || !fd.a.f11902x || ae.j.x0() || (i10 & 4) != 0) {
            z11 = false;
            i11 = i10;
        } else {
            i11 = i10 | 16;
            z11 = true;
        }
        if (i12 >= 23 && ae.j.A0()) {
            i11 |= Log.TAG_LUX;
        }
        decorView.setSystemUiVisibility(i11);
        if (this.f20049s0 != z11) {
            this.f20049s0 = z11;
            K3();
        }
        this.f20047r0 = i10;
        if (z10) {
            this.f20045q0 = i10;
        }
    }

    public void w0() {
        j2 j2Var = this.Z0;
        if (j2Var != null) {
            j2Var.s2(true);
            this.Z0 = null;
            this.f20014a1 = null;
        }
    }

    public boolean w1() {
        return this.D0;
    }

    public void w2(i iVar) {
        this.f20041o0.remove(iVar);
    }

    public final void w3(int i10, int i11) {
        getWindow().setFlags(i10, i11);
    }

    public void x0() {
        int n10 = this.f20022e1.n();
        for (int i10 = 0; i10 < n10; i10++) {
            j2 o10 = this.f20022e1.o(i10);
            if (o10 != null) {
                if (o10.getBoundController() instanceof j1) {
                    ((j1) o10.getBoundController()).Hh();
                } else if (o10.getBoundView() instanceof bd.c) {
                    ((bd.c) o10.getBoundView()).D1(true);
                }
            }
        }
    }

    public boolean x1() {
        return this.f20029i0.c0() || e1() || this.X.S() || this.X.I().p3();
    }

    public void x2(j jVar) {
        this.F1.remove(jVar);
        k3(!this.F1.isEmpty());
    }

    public final AlertDialog x3(AlertDialog.Builder builder) {
        return y3(builder, null);
    }

    public void y0() {
        j2 j2Var = this.W0;
        if (j2Var != null) {
            j2Var.s2(true);
            this.W0 = null;
            this.X0 = null;
        }
    }

    public final boolean y1() {
        ee.k kVar = this.f20040n1;
        return (kVar == null || this.f20056v1 || kVar.get().getParent() == null) ? false : true;
    }

    public void y2() {
        x1 x1Var = this.f20013a0;
        if (x1Var != null) {
            x1Var.setVisibility(8);
            p0.Z(this.f20013a0, 0);
            this.W.removeView(this.f20013a0);
        }
    }

    public final AlertDialog y3(AlertDialog.Builder builder, p pVar) {
        if (isFinishing()) {
            return null;
        }
        try {
            AlertDialog show = builder.show();
            View findViewById = show.findViewById(16908299);
            if (findViewById != null) {
                if (this.f20039n0 == null) {
                    this.f20039n0 = new ArrayList();
                    t1.b().a(this);
                }
                lb.i.a(this.f20039n0, findViewById);
            }
            return O1(show, pVar);
        } catch (Throwable th) {
            if (j0.F() == 0) {
                j0.z0("Failed to display system pop-up, see application log for details", 0);
            }
            Log.e("Cannot show dialog", th, new Object[0]);
            return null;
        }
    }

    public final void z0(v4<?> v4Var) {
        List<v4<?>> list = this.N1;
        int indexOf = list != null ? list.indexOf(v4Var) : -1;
        if (indexOf != -1) {
            this.N1.remove(indexOf);
            this.O1.G1(v4Var.Ca(), true);
        }
    }

    public boolean z1() {
        return this.I0;
    }

    public void z2(k kVar) {
        this.L0.remove(kVar);
    }

    public void z3(v4<?> v4Var, o6 o6Var, ArrayList<o<?>> arrayList, boolean z10, x.h hVar) {
        if (this.f20016b1 == null) {
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f20016b1 = new vc.x(this);
            } else {
                return;
            }
        }
        if (arrayList != null && !arrayList.isEmpty() && this.f20016b1.getParent() == null) {
            a0(this.f20016b1, false);
        }
        this.f20016b1.r2(v4Var, arrayList, z10, hVar, !v4Var.Ta());
    }
}
