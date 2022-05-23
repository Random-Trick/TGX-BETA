package ee;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.o;
import ce.p0;
import de.rh;
import eb.k;
import ee.c;
import ee.x;
import fe.j;
import he.i;
import java.util.ArrayList;
import ld.h;
import ld.l;
import ld.q;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.f3;
import oc.v0;
import od.j1;
import od.k1;
import od.l1;
import od.y;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class k extends v4<Void> implements l, SensorEventListener, k.b, View.OnClickListener, c.a, x.a, i.q {
    public static final String[] f11650s1 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public static final String[] f11651t1 = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public static final boolean f11652u1 = true;
    public TextView A0;
    public f3 B0;
    public ee.b C0;
    public ee.c D0;
    public ee.d E0;
    public ee.d F0;
    public FrameLayoutFix G0;
    public TextView H0;
    public v<?> I0;
    public boolean J0;
    public boolean N0;
    public boolean P0;
    public boolean Q0;
    public float S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public boolean X0;
    public boolean Y0;
    public v4<?> Z0;
    public boolean f11653a1;
    public OrientationEventListener f11654b1;
    public int f11655c1;
    public eb.k f11657e1;
    public boolean f11658f1;
    public boolean f11659g1;
    public j1 f11660h1;
    public qd.b f11661i1;
    public Bitmap f11662j1;
    public Runnable f11663k1;
    public int f11664l1;
    public int f11665m1;
    public boolean f11666n0;
    public int f11667n1;
    public int f11668o0;
    public long f11669o1;
    public g f11670p0;
    public boolean f11671p1;
    public f f11672q0;
    public boolean f11673q1;
    public String f11674r0;
    public kb.b f11675r1;
    public boolean f11676s0;
    public int f11677t0;
    public boolean f11678u0;
    public l0 f11680w0;
    public o f11681x0;
    public x f11682y0;
    public m f11683z0;
    public final e f11679v0 = new e(this);
    public float K0 = -1.0f;
    public float L0 = 0.0f;
    public int M0 = -1;
    public int O0 = Log.TAG_CAMERA;
    public float R0 = 1.0f;
    public int f11656d1 = -1;

    public class a extends OrientationEventListener {
        public a(Context context, int i10) {
            super(context, i10);
        }

        @Override
        public void onOrientationChanged(int i10) {
            if (i10 != -1 && i10 <= 360 && !k.this.f11673q1) {
                k.this.hg(k.Kf(i10), true);
            }
        }
    }

    public class b implements k1 {
        public b() {
        }

        @Override
        public void Z1(int i10, qd.b bVar, boolean z10) {
        }

        @Override
        public l1 s1(int i10, qd.b bVar) {
            l1 l1Var = new l1(0, 0, k.this.f11681x0.getMeasuredWidth(), k.this.f11681x0.getMeasuredHeight());
            l1Var.n();
            l1Var.o();
            return l1Var;
        }
    }

    public class c implements od.x {
        public final l f11686a;

        public c(l lVar) {
            this.f11686a = lVar;
        }

        @Override
        public ArrayList<h> L0(boolean z10) {
            return null;
        }

        @Override
        public boolean P3() {
            return this.f11686a.D0();
        }

        @Override
        public int S0() {
            return 0;
        }

        @Override
        public long b() {
            rh nf = k.this.nf();
            if (nf != null) {
                return nf.b();
            }
            return 0L;
        }

        @Override
        public void b5(int i10, qd.b bVar, boolean z10) {
        }

        @Override
        public boolean k(int i10, qd.b bVar) {
            return false;
        }
    }

    public class d extends kb.b {
        public d() {
        }

        @Override
        public void b() {
            if (k.this.f11658f1 && k.this.f11660h1 == null) {
                k.this.D0.g();
            }
        }
    }

    public static class e extends Handler {
        public final k f11688a;

        public e(k kVar) {
            super(Looper.getMainLooper());
            this.f11688a = kVar;
        }

        @Override
        public void handleMessage(Message message) {
            boolean z10 = false;
            switch (message.what) {
                case 0:
                    this.f11688a.Z0((String) message.obj);
                    return;
                case 1:
                    this.f11688a.g1(message.arg1);
                    return;
                case 2:
                    this.f11688a.Tf(message.arg1);
                    return;
                case 3:
                    if (message.arg1 == 1) {
                        this.f11688a.q();
                        return;
                    }
                    k kVar = this.f11688a;
                    if (message.arg2 == 1) {
                        z10 = true;
                    }
                    kVar.r(z10, (Runnable) message.obj);
                    return;
                case 4:
                    this.f11688a.hg(message.arg1, false);
                    return;
                case 5:
                case 6:
                default:
                    return;
                case 7:
                    this.f11688a.P6(message.arg1);
                    return;
                case 8:
                    k kVar2 = this.f11688a;
                    boolean z11 = message.arg1 == 1;
                    int i10 = message.arg2;
                    boolean z12 = (i10 & 1) != 0;
                    if ((i10 & 2) != 0) {
                        z10 = true;
                    }
                    kVar2.f7(z11, z12, z10);
                    return;
                case 9:
                    this.f11688a.u2(Float.intBitsToFloat(message.arg1));
                    return;
                case 10:
                    k kVar3 = this.f11688a;
                    if (message.arg1 == 1) {
                        z10 = true;
                    }
                    kVar3.E3(z10);
                    return;
                case 11:
                    this.f11688a.yg();
                    return;
            }
        }
    }

    public interface f {
        void q3(String str);
    }

    public interface g {
        void d(boolean z10, boolean z11);

        void g(k kVar);
    }

    public k(Context context) {
        super(context, null);
    }

    public void Cf(ArrayList arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z10, boolean z11) {
        Mf((l) arrayList.get(0), messageSendOptions, z10, z11);
    }

    public void Df() {
        eg(null, null);
    }

    public void Ef(l lVar) {
        o6 C0 = this.f24493a.C0();
        j1 j1Var = new j1(this.f24493a, C0);
        qd.c cVar = new qd.c(this.f24493a, C0);
        qd.b bVar = new qd.b(this.f24493a, C0, lVar);
        cVar.v(bVar);
        rh nf = nf();
        j1.r r10 = new j1.r(this, 3, new b(), new c(lVar), new y() {
            @Override
            public final void H6(ArrayList arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z10, boolean z11) {
                k.this.Cf(arrayList, messageSendOptions, z10, z11);
            }
        }, cVar).r(nf != null && nf.ui());
        if (nf != null) {
            r10.s(nf.C9());
        }
        j1Var.Xk(r10);
        j1Var.Yh(true);
        j1Var.dk();
        j1Var.k8(new kb.c() {
            @Override
            public final void Q2() {
                k.this.Df();
            }
        });
        eg(j1Var, bVar);
    }

    public static void Ff(boolean z10, qd.b bVar) {
        if (z10) {
            bVar.n();
            return;
        }
        String q10 = bVar.K().q();
        if (!v0.t1(q10)) {
            v0.n(q10);
        }
    }

    public void Gf() {
        t().l0();
    }

    public void Hf(Bitmap bitmap) {
        if (!this.I0.H(bitmap, this.f11664l1, this.f11665m1, this.f11667n1)) {
            this.I0.M(bitmap);
        } else {
            this.f11662j1 = bitmap;
        }
    }

    public static int If(int i10) {
        return (i10 == 48 || i10 == 80) ? i10 | 1 : i10 | 16;
    }

    public static int Kf(int i10) {
        if (i10 <= 62 || i10 >= 298) {
            return 0;
        }
        if (i10 <= 62 || i10 >= 118) {
            return (i10 <= 208 || i10 >= 298) ? 180 : 90;
        }
        return 270;
    }

    @Override
    public void Ac() {
        super.Ac();
        if (this.Z0 != null) {
            if (Log.isEnabled(Log.TAG_CAMERA)) {
                Log.i((int) Log.TAG_CAMERA, "onPrepareToShow", new Object[0]);
            }
            this.Y0 = true;
            Sf();
            Pf();
            jf();
            lf();
            if (this.X0) {
                Nf();
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public boolean Af() {
        return this.I0.x();
    }

    @Override
    public void B2(final l lVar) {
        ff();
        new Runnable() {
            @Override
            public final void run() {
                k.this.Ef(lVar);
            }
        }.run();
    }

    public final boolean Bf() {
        rh nf = nf();
        return nf != null && nf.gl();
    }

    @Override
    public boolean C1() {
        return Bf();
    }

    @Override
    public void C2(String str, RectF rectF, int i10, int i11, int i12, boolean z10) {
        if (this.f11672q0 != null && !str.isEmpty()) {
            if ((str.startsWith("tg://") || str.startsWith(this.f24493a.C0().Wc())) && !this.f11676s0) {
                this.f11674r0 = str;
                this.f11680w0.D1(rectF, i10, i11, i12, z10);
            }
        }
    }

    @Override
    public void D0() {
        this.D0.setInRecordMode(false);
    }

    @Override
    public void E3(boolean z10) {
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 10, z10 ? 1 : 0, 0));
            return;
        }
        this.C0.a();
    }

    @Override
    public int G3() {
        v<?> vVar = this.I0;
        if (vVar instanceof j) {
            return ((j) vVar).D0();
        }
        return 0;
    }

    public final boolean Jf() {
        int r02;
        return this.f11666n0 || !fd.a.f11889k || (r02 = i.c2().r0()) == 2 || r02 == 0;
    }

    @Override
    public void K4(ee.c cVar) {
        if (!this.f11673q1) {
            if (yf()) {
                this.f24493a.onBackPressed();
            } else if (gf()) {
                this.I0.h0(true);
                if (this.O0 == 1024) {
                    rg(false);
                } else {
                    this.f11682y0.b();
                }
            } else if (this.O0 == 16384) {
                this.I0.h0(true);
                this.f11682y0.b();
            } else {
                qg(false);
            }
        }
    }

    @Override
    public void K5() {
        Runnable runnable = this.f11663k1;
        if (runnable != null) {
            runnable.run();
            this.f11663k1 = null;
        }
    }

    public void Lf() {
        String str;
        f fVar = this.f11672q0;
        if (fVar != null && (str = this.f11674r0) != null) {
            fVar.q3(str);
            this.f11674r0 = null;
            this.f11676s0 = true;
            this.f24493a.onBackPressed();
        }
    }

    public final void Mf(l lVar, TdApi.MessageSendOptions messageSendOptions, boolean z10, boolean z11) {
        rh nf = nf();
        if (nf != null) {
            this.f24493a.J0();
            nf.tp(lVar, messageSendOptions, z10, z11);
        }
    }

    public final void Nf() {
        if (!this.f11658f1) {
            this.f11658f1 = true;
            m18if();
        }
    }

    @Override
    public void O() {
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 5));
            return;
        }
        Sf();
    }

    public void Of() {
        get();
        p0.F(this.f11681x0, this.f11680w0, 0);
        this.I0.v().requestLayout();
    }

    @Override
    public void P6(int i10) {
        int i11;
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 7, i10, 0));
            return;
        }
        this.O0 = i10;
        if (i10 != 2048) {
            if (i10 == 4096) {
                i11 = R.drawable.baseline_flash_auto_24;
            } else if (i10 != 16384) {
                i11 = R.drawable.baseline_flash_off_24;
            }
            this.F0.c(i11);
        }
        i11 = R.drawable.baseline_flash_on_24;
        this.F0.c(i11);
    }

    public final void Pf() {
        this.E0.setCameraIconRes(this.I0.V());
    }

    public final void Qf() {
        this.F0.setIconRes(R.drawable.baseline_flash_off_24);
        boolean V = this.I0.V();
        this.E0.e(V);
        this.E0.setCameraIconRes(V);
    }

    @Override
    public int R9() {
        return R.id.controller_camera;
    }

    public final void Rf() {
        this.H0.setText("0:00");
    }

    public final void Sf() {
        eb.k kVar = this.f11657e1;
        if (kVar != null) {
            kVar.l(0.0f);
        }
        this.f11655c1 = 0;
        this.f11656d1 = -1;
        xg();
    }

    public void Tf(int i10) {
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 2, i10, 0));
        }
    }

    public final void Uf() {
        this.f11664l1 = this.f11681x0.getMeasuredWidth();
        this.f11665m1 = this.f11681x0.getMeasuredHeight();
        this.f11667n1 = pf(true);
    }

    public void Vf(float f10, boolean z10, boolean z11) {
        this.S0 = f10;
        this.f11683z0.setFadeFactor(1.0f - f10);
        sg();
        ug();
    }

    @Override
    public boolean W3() {
        return yf();
    }

    public void Wf(float f10) {
        int o10 = a0.o();
        float f11 = o10;
        this.B0.setAlpha(f10 <= f11 ? o10 == 0 ? 0.0f : f10 / f11 : 1.0f);
        this.B0.setTranslationY(f10);
    }

    public void Xf(int i10, int i11, int i12, int i13) {
        if (this.T0 != i10 || this.U0 != i11 || this.V0 != i12 || this.W0 != i13) {
            this.T0 = i10;
            this.U0 = i11;
            this.V0 = i12;
            this.W0 = i13;
            tg();
        }
    }

    public final void Yf(float f10) {
        if (this.K0 != f10) {
            this.K0 = f10;
            vg();
        }
    }

    @Override
    public void Z0(String str) {
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 0, str));
        } else if (ib.i.i(str)) {
            TextView textView = this.A0;
            if (textView != null && textView.getParent() != null) {
                this.f11681x0.removeView(this.A0);
            }
        } else {
            if (this.A0 == null) {
                b2 b2Var = new b2(t());
                this.A0 = b2Var;
                b2Var.setTextColor(-1);
                this.A0.setTypeface(o.k());
                this.A0.setTextSize(1, 12.0f);
                this.A0.setGravity(17);
                this.A0.setLayoutParams(FrameLayoutFix.r1(-2, -2, 17));
                p0.h0(this.A0);
            }
            if (this.A0.getParent() == null) {
                this.f11681x0.addView(this.A0);
            }
            this.A0.setText(str);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.i((int) Log.TAG_CAMERA, "destroy", new Object[0]);
        }
        i.c2().K3(this);
        v<?> vVar = this.I0;
        if (vVar != null) {
            vVar.i();
        }
    }

    public final void Zf(boolean z10) {
        if (this.f11666n0 != z10) {
            this.f11666n0 = z10;
            kf();
        }
    }

    public void ag() {
        this.X0 = f11652u1 || this.I0.w();
    }

    public final void bg(View view, int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        boolean W = p0.W(layoutParams, i11);
        boolean cg = cg(view, layoutParams, i10, i12, i13);
        if (W || cg) {
            view.setLayoutParams(layoutParams);
        }
    }

    @Override
    public void c6() {
        super.c6();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.i((int) Log.TAG_CAMERA, "onActivityPause", new Object[0]);
        }
        r(true, null);
        this.I0.U();
        lf();
    }

    public final boolean cg(View view, FrameLayout.LayoutParams layoutParams, int i10, int i11, int i12) {
        if (i10 == 3) {
            return p0.b0(layoutParams, (i11 - view.getPaddingLeft()) + this.T0, 0, 0, 0);
        }
        if (i10 == 5) {
            return p0.b0(layoutParams, 0, 0, (i11 - view.getPaddingRight()) + this.V0, 0);
        }
        if (i10 == 48) {
            return p0.b0(layoutParams, i12 > 0 ? i12 : 0, (i11 - view.getPaddingTop()) + this.U0, i12 < 0 ? -i12 : 0, 0);
        } else if (i10 != 80) {
            return false;
        } else {
            return p0.b0(layoutParams, i12 > 0 ? i12 : 0, 0, i12 < 0 ? -i12 : 0, (i11 - view.getPaddingBottom()) + this.W0);
        }
    }

    public void dg(int i10, g gVar) {
        boolean z10 = false;
        this.f11676s0 = false;
        this.f11670p0 = gVar;
        int i11 = this.f11668o0;
        if (i11 != i10) {
            Zf(i10 == 1 || i10 == 2);
            this.f11668o0 = i10;
            if (this.f11681x0 != null) {
                sg();
                wg();
                x xVar = this.f11682y0;
                if (xVar != null) {
                    if (this.f11668o0 == 0 && i.c2().k1(4096L)) {
                        z10 = true;
                    }
                    xVar.e(z10, Ta());
                }
            }
        } else if (i11 == 2) {
            this.f11680w0.E1(true, false);
        }
    }

    public final void ef(int i10) {
        eb.k kVar = this.f11657e1;
        if (kVar != null) {
            kVar.k();
        }
        if (this.Y0 && !Xa() && !Sa()) {
            if (this.f11657e1 == null) {
                this.f11657e1 = new eb.k(0, this, db.b.f7287b, 180L, 0.0f);
            }
            this.f11657e1.i(i10);
            return;
        }
        eb.k kVar2 = this.f11657e1;
        if (kVar2 != null) {
            kVar2.l(i10);
        }
        xg();
    }

    public void eg(j1 j1Var, qd.b bVar) {
        Bitmap bitmap;
        if (j1Var == null) {
            final qd.b bVar2 = this.f11661i1;
            j1 j1Var2 = this.f11660h1;
            final boolean z10 = j1Var2 != null && !j1Var2.aj() && (Bf() || !i.c2().k1(2048L) || (bVar2 != null && v0.t1(bVar2.K().q())));
            if (bVar2 != null) {
                q.c().e(bVar2.K());
                org.thunderdog.challegram.loader.b.k().l(new Runnable() {
                    @Override
                    public final void run() {
                        k.Ff(z10, bVar2);
                    }
                });
            }
            if (!z10 || (bitmap = this.f11662j1) == null || bitmap.isRecycled()) {
                this.I0.L();
            } else {
                this.I0.M(this.f11662j1);
            }
        }
        this.f11660h1 = j1Var;
        this.f11661i1 = bVar;
        m18if();
        j0.e0(new Runnable() {
            @Override
            public final void run() {
                k.this.Gf();
            }
        }, 200L);
    }

    @Override
    public void f7(boolean z10, boolean z11, boolean z12) {
        if (!j0.K()) {
            if (z12) {
                boolean z13 = z11 ? 1 : 0;
                char c10 = z11 ? 1 : 0;
                z11 = z13 | true;
            }
            e eVar = this.f11679v0;
            int i10 = z10 ? 1 : 0;
            int i11 = z11 ? 1 : 0;
            int i12 = z11 ? 1 : 0;
            eVar.sendMessage(Message.obtain(eVar, 8, i10, i11));
            return;
        }
        this.P0 = !z10 ? 1 : 0;
        if (!z10) {
            this.E0.g(z11, z12);
            g gVar = this.f11670p0;
            if (gVar != null) {
                gVar.d(z11, z12);
            }
        }
    }

    public final boolean ff() {
        int i10;
        if (uf() == 0.0f) {
            return false;
        }
        jf();
        int pf = pf(false);
        if (pf == -1) {
            return false;
        }
        if (pf == 0) {
            i10 = 1;
        } else if (pf == 90) {
            i10 = 0;
        } else if (pf != 270) {
            return false;
        } else {
            i10 = 8;
        }
        int P0 = t().P0();
        t().N1(i10);
        jf();
        return (P0 == 1) != (i10 == 1);
    }

    public void fg(v4<?> v4Var) {
        this.Z0 = v4Var;
    }

    @Override
    public void g1(int i10) {
        int i11 = 0;
        boolean z10 = true;
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 1, i10, 0));
            return;
        }
        this.M0 = i10;
        if (i10 != -1) {
            if (i10 <= 1) {
                z10 = false;
            }
            if (!yf()) {
                ee.d dVar = this.E0;
                if (!z10) {
                    i11 = 8;
                }
                dVar.setVisibility(i11);
            }
        }
    }

    public final boolean gf() {
        return false;
    }

    public void gg(f fVar, int i10, boolean z10) {
        l0 l0Var;
        this.f11672q0 = fVar;
        this.f11677t0 = i10;
        this.f11678u0 = z10;
        if (this.f11668o0 == 2 && (l0Var = this.f11680w0) != null) {
            l0Var.G1(i10);
            this.f11680w0.E1(true, z10);
        }
    }

    @Override
    public void h6(long j10, long j11) {
        this.f11682y0.e(this.f11668o0 == 0 && ib.c.c(j10, 4096L), Ta());
    }

    public final boolean hf() {
        kb.b bVar = this.f11675r1;
        if (bVar == null || !bVar.d()) {
            return false;
        }
        this.f11675r1.c();
        this.f11675r1 = null;
        return true;
    }

    public final void hg(int r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: ee.k.hg(int, boolean):void");
    }

    public final void m18if() {
        boolean z10 = this.f11658f1 && this.f11660h1 == null;
        if (this.f11659g1 != z10) {
            this.f11659g1 = z10;
            if (z10) {
                this.I0.S();
                return;
            }
            this.I0.h();
            this.f11682y0.f(true, !Xa(), null);
        }
    }

    public final void ig(boolean z10) {
        if (this.f11653a1 != z10) {
            this.f11653a1 = z10;
            if (this.f11654b1 == null) {
                xf();
            }
            if (z10) {
                this.f11654b1.enable();
            } else {
                this.f11654b1.disable();
            }
        }
    }

    @Override
    public void j7() {
        this.f11680w0.A1();
    }

    public void jf() {
        this.I0.f();
        tg();
    }

    public void jg(boolean z10) {
        if (this.J0 != z10) {
            this.J0 = z10;
            this.f11682y0.setNeedFastAnimations(z10);
        }
    }

    @Override
    public void kc() {
        super.kc();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.i((int) Log.TAG_CAMERA, "onBlur", new Object[0]);
        }
        if (this.X0) {
            n9();
        } else {
            mf();
        }
    }

    public void kf() {
        if (this.f11681x0 != null && zf() != Jf()) {
            v<?> vVar = this.I0;
            if (vVar != null) {
                this.f11681x0.removeView(vVar.v());
                this.I0.i();
                this.I0 = null;
            }
            if (Jf()) {
                this.I0 = new j(this.f24493a, this);
            } else {
                this.I0 = new ge.h(this.f24493a, this);
            }
            this.f11681x0.addView(this.I0.v(), this.f11681x0.getChildCount() - 1);
        }
    }

    public void kg(float f10) {
        if (this.L0 != f10) {
            this.L0 = f10;
            vg();
        }
    }

    @Override
    public void lc() {
        super.lc();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.i((int) Log.TAG_CAMERA, "onCleanAfterHide", new Object[0]);
        }
        this.Y0 = false;
        lg(false);
        lf();
        Sf();
        Z0(null);
        Qf();
        this.f11682y0.d();
        if (this.X0) {
            mf();
        }
        this.I0.a0();
    }

    public final void lf() {
        ig(ng() && !Xa() && !Sa() && this.Y0);
    }

    public void lg(boolean z10) {
        if (this.Q0 != z10) {
            this.Q0 = z10;
        }
    }

    @Override
    public void mc(Configuration configuration) {
        super.mc(configuration);
        jf();
    }

    public final void mf() {
        if (this.f11658f1) {
            this.f11658f1 = false;
            m18if();
        }
    }

    public final void mg(long j10) {
        this.f11669o1 = j10;
        yg();
    }

    @Override
    public void n1(ee.c cVar) {
        if (!yf()) {
            this.I0.j();
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        if (i10 == 0) {
            xg();
        }
    }

    public final rh nf() {
        v4<?> F = this.f24493a.Q1().F();
        if (F instanceof rh) {
            return (rh) F;
        }
        return null;
    }

    public boolean ng() {
        if (this.f11654b1 == null) {
            xf();
        }
        return this.f11654b1.canDetectOrientation();
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
    }

    @Override
    public void o5() {
        if (gf()) {
            rg(true);
            return;
        }
        this.I0.h0(false);
        qg(true);
    }

    @Override
    public void o6() {
        super.o6();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.i((int) Log.TAG_CAMERA, "onActivityResume", new Object[0]);
        }
        this.I0.b0();
        lf();
    }

    @Override
    public View oc(Context context) {
        o oVar = new o(context);
        this.f11681x0 = oVar;
        oVar.setLayoutParams(FrameLayoutFix.r1(-1, -1, 17));
        this.f11681x0.setParent(this);
        x xVar = new x(context);
        this.f11682y0 = xVar;
        xVar.setFlashListener(this);
        this.f11682y0.e(this.f11668o0 == 0 && i.c2().k1(4096L), false);
        this.f11682y0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f11683z0 = new m(context);
        this.C0 = new ee.b(context);
        ee.c cVar = new ee.c(context);
        this.D0 = cVar;
        cVar.setBlurView(this.C0);
        this.D0.setParent(this);
        this.D0.setRecordListener(this);
        ee.d dVar = new ee.d(context);
        this.E0 = dVar;
        dVar.setOnClickListener(this);
        this.E0.setNeedParentTranslation(true);
        this.E0.setId(R.id.btn_camera_switch);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.G0 = frameLayoutFix;
        frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(a0.i(56.0f), a0.i(56.0f)));
        this.G0.addView(this.E0);
        ee.d dVar2 = new ee.d(context);
        this.F0 = dVar2;
        dVar2.setId(R.id.btn_camera_flash);
        this.F0.setOnClickListener(this);
        this.F0.setIconRes(R.drawable.baseline_flash_off_24);
        b2 b2Var = new b2(context);
        this.H0 = b2Var;
        b2Var.setLayoutParams(FrameLayoutFix.q1(-2, -2));
        this.H0.setTypeface(o.i());
        this.H0.setTextColor(-1);
        this.H0.setTextSize(1, 20.0f);
        p0.h0(this.H0);
        Rf();
        k0 k0Var = new k0(context);
        this.f11680w0 = k0Var;
        k0Var.C1(this);
        this.f11680w0.setBackgroundColor(-16777216);
        this.f11680w0.addView(this.f11681x0);
        this.f11680w0.addView(this.G0);
        this.f11680w0.addView(this.F0);
        this.f11680w0.addView(this.C0);
        this.f11680w0.addView(this.D0);
        this.f11680w0.addView(this.H0);
        this.f11680w0.addView(this.f11683z0);
        f3 f3Var = new f3(context);
        this.B0 = f3Var;
        f3Var.setSimpleBottomTransparentShadow(true);
        this.f11680w0.addView(this.B0);
        if (Jf()) {
            this.I0 = new j(context, this);
        } else {
            this.I0 = new ge.h(context, this);
        }
        this.f11681x0.addView(this.I0.v());
        this.E0.setCameraIconRes(this.I0.V());
        this.f11681x0.addView(this.f11682y0);
        wg();
        tg();
        ug();
        i.c2().m(this);
        return this.f11680w0;
    }

    public o of() {
        return this.f11681x0;
    }

    public void og() {
        if (!this.P0) {
            this.I0.l0();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_camera_flash:
                this.I0.m0();
                return;
            case R.id.btn_camera_switch:
                og();
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!this.f11658f1 || this.f11660h1 != null || yf()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (i10 == 24 || i10 == 25) {
            int s02 = this.f11668o0 != 0 ? 1 : i.c2().s0();
            boolean z10 = false;
            if (s02 == 0) {
                kb.b bVar = this.f11675r1;
                if ((bVar != null && bVar.d()) || this.D0.d(false)) {
                    return true;
                }
                hf();
                d dVar = new d();
                this.f11675r1 = dVar;
                vd(dVar, ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (s02 == 1) {
                if (i10 == 24) {
                    z10 = true;
                }
                float p10 = this.I0.p();
                float o10 = this.I0.o();
                float l10 = this.I0.l();
                float max = Math.max(this.I0.q(), Math.min(1.0f, (o10 - p10) / 20.0f));
                v<?> vVar = this.I0;
                if (!z10) {
                    max = -max;
                }
                vVar.J(ib.h.e(l10 + max, p10, o10));
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.f11658f1 || this.f11660h1 != null || yf()) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (i10 == 24 || i10 == 25) {
            int s02 = i.c2().s0();
            if (s02 == 0) {
                if (hf()) {
                    this.D0.f();
                }
                return true;
            } else if (s02 == 1) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i10 = 0;
        if (Math.abs(sensorEvent.values[1]) > Math.abs(sensorEvent.values[0])) {
            float[] fArr = sensorEvent.values;
            if (fArr[1] <= 1.0f) {
                if (fArr[1] < -1.0f) {
                    i10 = 180;
                } else {
                    return;
                }
            }
        } else {
            float[] fArr2 = sensorEvent.values;
            if (fArr2[0] > 1.0f) {
                i10 = 90;
            } else if (fArr2[0] < -1.0f) {
                i10 = 270;
            } else {
                return;
            }
        }
        hg(i10, true);
    }

    public final int pf(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: ee.k.pf(boolean):int");
    }

    public void pg(ViewGroup viewGroup, int i10) {
        get();
        p0.F(this.f11681x0, viewGroup, i10);
        this.I0.v().requestLayout();
    }

    @Override
    public void q() {
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 3, 1, 0));
            return;
        }
        this.N0 = true;
        this.f11682y0.f(false, true ^ Xa(), null);
        g gVar = this.f11670p0;
        if (gVar != null) {
            gVar.g(this);
        }
        n9();
    }

    public j qf() {
        return (j) this.I0;
    }

    public final void qg(boolean z10) {
        if (!this.f11673q1) {
            Uf();
            this.f11671p1 = z10;
            this.I0.o0(this.f11664l1, this.f11665m1, this.f11667n1);
        }
    }

    @Override
    public void r(boolean z10, Runnable runnable) {
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 3, 0, z10 ? 1 : 0, runnable));
            return;
        }
        if (this.N0) {
            this.f11682y0.g(this.I0.n0(), t().c1());
        }
        this.N0 = false;
        this.f11682y0.f(true, !Xa(), runnable);
        if (yf()) {
            this.f11680w0.z1();
        }
        n9();
    }

    public v<?> rf() {
        return this.I0;
    }

    public final void rg(boolean z10) {
        if (this.I0.w()) {
            final Bitmap p02 = this.I0.p0();
            Uf();
            Runnable fVar = new Runnable() {
                @Override
                public final void run() {
                    k.this.Hf(p02);
                }
            };
            if (z10) {
                this.f11663k1 = fVar;
                this.f11682y0.c(false);
                return;
            }
            fVar.run();
        }
    }

    @Override
    public void sc() {
        super.sc();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.i((int) Log.TAG_CAMERA, "onFocus", new Object[0]);
        }
        if (this.f11668o0 == 0 && i.c2().X2(32768L)) {
            i.c2().w2(32768L);
            t().I3().g(this.D0).i(this).C(this.f24495b, R.string.CameraButtonHint).F();
        }
        if (this.X0) {
            this.X0 = false;
        } else {
            Nf();
        }
    }

    public final int sf() {
        return pf(false);
    }

    public final void sg() {
        float f10;
        if (this.f11668o0 == 1) {
            f10 = 1.0f;
        } else {
            f10 = this.R0 * ((this.S0 * 0.100000024f) + 0.9f);
        }
        this.f11681x0.setScaleX(f10);
        this.f11681x0.setScaleY(f10);
    }

    public final int tf() {
        return ib.h.l(this.f11655c1, 360);
    }

    public final void tg() {
        int i10;
        int m10 = this.I0.m();
        int i11 = 48;
        if (m10 == 90) {
            i11 = 5;
            i10 = 3;
        } else if (m10 == 180) {
            i10 = 80;
        } else if (m10 != 270) {
            i11 = 80;
            i10 = 48;
        } else {
            i11 = 3;
            i10 = 5;
        }
        int If = If(i11);
        bg(this.H0, i10, If(i10), a0.i(18.0f), 0);
        int i12 = i11;
        bg(this.D0, i12, If, a0.i(40.0f), 0);
        bg(this.C0, i12, If, a0.i(18.0f), 0);
        bg(this.G0, i12, If, a0.i(40.0f), 0);
        bg(this.F0, i12, If, a0.i(40.0f), 0);
        if (i11 != 5) {
            this.E0.setAlignGravity(5);
            this.F0.setAlignGravity(3);
            return;
        }
        this.E0.setAlignGravity(3);
        this.F0.setAlignGravity(5);
    }

    @Override
    public void u2(float f10) {
        if (!j0.K()) {
            e eVar = this.f11679v0;
            eVar.sendMessage(Message.obtain(eVar, 9, Float.floatToIntBits(f10), 0));
            return;
        }
        this.D0.setActualZoom(f10);
    }

    @Override
    public void u6(long j10) {
        mg(j10);
        this.D0.setInRecordMode(true);
    }

    public float uf() {
        eb.k kVar = this.f11657e1;
        if (kVar != null) {
            return kVar.o();
        }
        return 0.0f;
    }

    public final void ug() {
        Yf(this.S0);
    }

    @Override
    public int v2() {
        v<?> vVar = this.I0;
        if (vVar instanceof j) {
            return ((j) vVar).E0();
        }
        return 0;
    }

    @Override
    public boolean v3(ee.c cVar) {
        if (yf()) {
            return false;
        }
        i.c2().u2(32768L);
        return this.I0.k0(sf());
    }

    public boolean vf() {
        return this.f11660h1 != null;
    }

    public final void vg() {
        float f10 = this.S0;
        float f11 = (0.35000002f * f10) + 0.65f;
        this.C0.setScaleX(f11);
        this.C0.setScaleY(f11);
        this.C0.setAlpha(f10);
        this.D0.setScaleX(f11);
        this.D0.setScaleY(f11);
        this.D0.setAlpha(f10);
        float f12 = (1.0f - this.L0) * f10;
        float f13 = (f12 * 0.3f) + 0.7f;
        this.E0.setScaleX(f13);
        this.E0.setScaleY(f13);
        this.G0.setAlpha(f12);
        this.F0.setScaleX(f13);
        this.F0.setScaleY(f13);
        this.F0.setAlpha(f12);
        float f14 = f10 * this.L0;
        float f15 = (0.3f * f14) + 0.7f;
        this.H0.setScaleX(f15);
        this.H0.setScaleY(f15);
        this.H0.setAlpha(f14);
    }

    public boolean wf() {
        return this.N0;
    }

    public final void wg() {
        if (yf()) {
            this.E0.setVisibility(8);
            this.F0.setVisibility(8);
            this.C0.setVisibility(8);
            this.f11680w0.E1(true, this.f11678u0);
            this.f11680w0.G1(this.f11677t0);
            return;
        }
        this.E0.setVisibility(0);
        this.F0.setVisibility(0);
        this.C0.setVisibility(0);
        this.f11680w0.E1(false, this.f11678u0);
    }

    @Override
    public void x3(boolean z10) {
        this.f11673q1 = z10;
        t().T2(z10);
        if (!z10 && this.f11671p1) {
            this.f11671p1 = false;
            this.f11682y0.c(false);
        }
    }

    public final void xf() {
        if (this.f11654b1 == null) {
            this.f11654b1 = new a(t(), 3);
        }
    }

    public final void xg() {
        float uf = uf();
        this.f11680w0.B1(uf);
        this.D0.setComponentRotation(uf);
        this.G0.setRotation(uf);
        this.F0.setComponentRotation(uf);
        this.H0.setRotation(uf);
    }

    public boolean yf() {
        return this.f11668o0 == 2;
    }

    public final void yg() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j10 = this.f11669o1;
        long j11 = j10 != 0 ? uptimeMillis - j10 : 0L;
        this.H0.setText(c0.h(j11 / 1000));
        this.f11679v0.removeMessages(11);
        if (this.f11669o1 != 0) {
            long j12 = 1000 - (j11 % 1000);
            e eVar = this.f11679v0;
            eVar.sendMessageDelayed(Message.obtain(eVar, 11), j12);
        }
    }

    public boolean zf() {
        return this.I0 instanceof j;
    }
}
