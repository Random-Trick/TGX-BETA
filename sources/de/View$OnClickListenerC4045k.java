package de;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
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
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import de.C4069x;
import de.RunnableC4027c;
import ee.C4195j;
import ge.C4868i;
import java.util.ArrayList;
import me.C6847b2;
import me.C6879f3;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.loader.C7907b;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3950k;
import p067ed.C4183a;
import p083fe.C4420h;
import p108hb.C5063c;
import p108hb.C5069h;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p139jb.AbstractRunnableC5910b;
import p156kd.C6246h;
import p156kd.C6253l;
import p156kd.C6259q;
import p194nd.AbstractC7459k1;
import p194nd.AbstractC7511x;
import p194nd.AbstractC7513y;
import p194nd.C7462l1;
import p194nd.View$OnClickListenerC7430j1;
import p225pd.C8112b;
import p225pd.C8113c;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class View$OnClickListenerC4045k extends AbstractC9323v4<Void> implements AbstractC4055l, SensorEventListener, C3950k.AbstractC3952b, View.OnClickListener, RunnableC4027c.AbstractC4028a, C4069x.AbstractC4070a, C4868i.AbstractC4886q {
    public static final String[] f13574s1;
    public static final String[] f13575t1;
    public static final boolean f13576u1;
    public TextView f13577A0;
    public C6879f3 f13578B0;
    public C4025b f13579C0;
    public RunnableC4027c f13580D0;
    public C4030d f13581E0;
    public C4030d f13582F0;
    public FrameLayoutFix f13583G0;
    public TextView f13584H0;
    public AbstractC4067v<?> f13585I0;
    public boolean f13586J0;
    public boolean f13590N0;
    public boolean f13592P0;
    public boolean f13593Q0;
    public float f13595S0;
    public int f13596T0;
    public int f13597U0;
    public int f13598V0;
    public int f13599W0;
    public boolean f13600X0;
    public boolean f13601Y0;
    public AbstractC9323v4<?> f13602Z0;
    public boolean f13603a1;
    public OrientationEventListener f13604b1;
    public int f13605c1;
    public C3950k f13607e1;
    public boolean f13608f1;
    public boolean f13609g1;
    public View$OnClickListenerC7430j1 f13610h1;
    public C8112b f13611i1;
    public Bitmap f13612j1;
    public Runnable f13613k1;
    public int f13614l1;
    public int f13615m1;
    public boolean f13616n0;
    public int f13617n1;
    public int f13618o0;
    public long f13619o1;
    public AbstractC4052g f13620p0;
    public boolean f13621p1;
    public AbstractC4051f f13622q0;
    public boolean f13623q1;
    public String f13624r0;
    public AbstractRunnableC5910b f13625r1;
    public boolean f13626s0;
    public int f13627t0;
    public boolean f13628u0;
    public C4056l0 f13630w0;
    public C4060o f13631x0;
    public C4069x f13632y0;
    public C4057m f13633z0;
    public final HandlerC4050e f13629v0 = new HandlerC4050e(this);
    public float f13587K0 = -1.0f;
    public float f13588L0 = 0.0f;
    public int f13589M0 = -1;
    public int f13591O0 = Log.TAG_CAMERA;
    public float f13594R0 = 1.0f;
    public int f13606d1 = -1;

    public class C4046a extends OrientationEventListener {
        public C4046a(Context context, int i) {
            super(context, i);
        }

        @Override
        public void onOrientationChanged(int i) {
            if (i != -1 && i <= 360 && !View$OnClickListenerC4045k.this.f13623q1) {
                View$OnClickListenerC4045k.this.m29186hg(View$OnClickListenerC4045k.m29229Kf(i), true);
            }
        }
    }

    public class C4047b implements AbstractC7459k1 {
        public C4047b() {
        }

        @Override
        public void mo9807F2(int i, C8112b bVar, boolean z) {
        }

        @Override
        public C7462l1 mo9806v(int i, C8112b bVar) {
            C7462l1 l1Var = new C7462l1(0, 0, View$OnClickListenerC4045k.this.f13631x0.getMeasuredWidth(), View$OnClickListenerC4045k.this.f13631x0.getMeasuredHeight());
            l1Var.m15986n();
            l1Var.m15985o();
            return l1Var;
        }
    }

    public class C4048c implements AbstractC7511x {
        public final C6253l f13636a;

        public C4048c(C6253l lVar) {
            this.f13636a = lVar;
        }

        @Override
        public ArrayList<C6246h> mo11249J0(boolean z) {
            return null;
        }

        @Override
        public int mo11241P0() {
            return 0;
        }

        @Override
        public void mo11239Q1(int i, C8112b bVar, boolean z) {
        }

        @Override
        public boolean mo11226Y3() {
            return this.f13636a.m20872D0();
        }

        @Override
        public long mo11220b() {
            View$OnClickListenerC2971rh nf = View$OnClickListenerC4045k.this.m29175nf();
            if (nf != null) {
                return nf.mo16269b();
            }
            return 0L;
        }

        @Override
        public boolean mo11197v1(int i, C8112b bVar) {
            return false;
        }
    }

    public class C4049d extends AbstractRunnableC5910b {
        public C4049d() {
        }

        @Override
        public void mo1364b() {
            if (View$OnClickListenerC4045k.this.f13608f1 && View$OnClickListenerC4045k.this.f13610h1 == null) {
                View$OnClickListenerC4045k.this.f13580D0.m29270g();
            }
        }
    }

    public static class HandlerC4050e extends Handler {
        public final View$OnClickListenerC4045k f13639a;

        public HandlerC4050e(View$OnClickListenerC4045k kVar) {
            super(Looper.getMainLooper());
            this.f13639a = kVar;
        }

        @Override
        public void handleMessage(Message message) {
            boolean z = false;
            switch (message.what) {
                case 0:
                    this.f13639a.mo29128c1((String) message.obj);
                    return;
                case 1:
                    this.f13639a.mo29122m1(message.arg1);
                    return;
                case 2:
                    this.f13639a.m29214Tf(message.arg1);
                    return;
                case 3:
                    if (message.arg1 == 1) {
                        this.f13639a.mo29126e();
                        return;
                    }
                    View$OnClickListenerC4045k kVar = this.f13639a;
                    if (message.arg2 == 1) {
                        z = true;
                    }
                    kVar.mo29121n(z, (Runnable) message.obj);
                    return;
                case 4:
                    this.f13639a.m29186hg(message.arg1, false);
                    return;
                case 5:
                case 6:
                default:
                    return;
                case 7:
                    this.f13639a.mo29129P6(message.arg1);
                    return;
                case 8:
                    View$OnClickListenerC4045k kVar2 = this.f13639a;
                    boolean z2 = message.arg1 == 1;
                    int i = message.arg2;
                    boolean z3 = (i & 1) != 0;
                    if ((i & 2) != 0) {
                        z = true;
                    }
                    kVar2.mo29125f7(z2, z3, z);
                    return;
                case 9:
                    this.f13639a.mo29138A2(Float.intBitsToFloat(message.arg1));
                    return;
                case 10:
                    View$OnClickListenerC4045k kVar3 = this.f13639a;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    kVar3.mo29132L3(z);
                    return;
                case 11:
                    this.f13639a.m29150yg();
                    return;
            }
        }
    }

    public interface AbstractC4051f {
        void mo1772y3(String str);
    }

    public interface AbstractC4052g {
        void mo6907d(boolean z, boolean z2);

        void mo6903e(View$OnClickListenerC4045k kVar);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f13574s1 = i >= 16 ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        f13575t1 = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        f13576u1 = i >= 21;
    }

    public View$OnClickListenerC4045k(Context context) {
        super(context, null);
    }

    public void m29237Cf(ArrayList arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z, boolean z2) {
        m29227Mf((C6253l) arrayList.get(0), messageSendOptions, z, z2);
    }

    public void m29236Df() {
        m29192eg(null, null);
    }

    public void m29235Ef(C6253l lVar) {
        C10930q6 z0 = this.f30168a.m14409z0();
        View$OnClickListenerC7430j1 j1Var = new View$OnClickListenerC7430j1(this.f30168a, z0);
        C8113c cVar = new C8113c(this.f30168a, z0);
        C8112b bVar = new C8112b(this.f30168a, z0, lVar);
        cVar.m13445v(bVar);
        View$OnClickListenerC2971rh nf = m29175nf();
        View$OnClickListenerC7430j1.C7448r r = new View$OnClickListenerC7430j1.C7448r(this, 3, new C4047b(), new C4048c(lVar), new AbstractC7513y() {
            @Override
            public final void mo11246L6(ArrayList arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z, boolean z2) {
                View$OnClickListenerC4045k.this.m29237Cf(arrayList, messageSendOptions, z, z2);
            }
        }, cVar).m16046r(nf != null && nf.m32219ui());
        if (nf != null) {
            r.m16045s(nf.mo9464C9());
        }
        j1Var.m16296Xk(r);
        j1Var.m16290Yh(true);
        j1Var.m16247dk();
        j1Var.m9226k8(new AbstractC5911c() {
            @Override
            public final void mo4501a3() {
                View$OnClickListenerC4045k.this.m29236Df();
            }
        });
        m29192eg(j1Var, bVar);
    }

    public static void m29234Ff(boolean z, C8112b bVar) {
        if (z) {
            bVar.m13492n();
            return;
        }
        String q = bVar.m13549K().mo20876q();
        if (!C7389v0.m16580t1(q)) {
            C7389v0.m16606n(q);
        }
    }

    public void m29233Gf() {
        mo4347s().m14474k0();
    }

    public void m29232Hf(Bitmap bitmap) {
        if (!this.f13585I0.m29100H(bitmap, this.f13614l1, this.f13615m1, this.f13617n1)) {
            this.f13585I0.m29098M(bitmap);
        } else {
            this.f13612j1 = bitmap;
        }
    }

    public static int m29231If(int i) {
        return (i == 48 || i == 80) ? i | 1 : i | 16;
    }

    public static int m29229Kf(int i) {
        if (i <= 62 || i >= 298) {
            return 0;
        }
        if (i <= 62 || i >= 118) {
            return (i <= 208 || i >= 298) ? 180 : 90;
        }
        return 270;
    }

    @Override
    public void mo29138A2(float f) {
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 9, Float.floatToIntBits(f), 0));
            return;
        }
        this.f13580D0.setActualZoom(f);
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        if (this.f13602Z0 != null) {
            if (Log.isEnabled(Log.TAG_CAMERA)) {
                Log.m14721i((int) Log.TAG_CAMERA, "onPrepareToShow", new Object[0]);
            }
            this.f13601Y0 = true;
            m29217Sf();
            m29223Pf();
            m29183jf();
            m29179lf();
            if (this.f13600X0) {
                m29226Nf();
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public boolean m29239Af() {
        return this.f13585I0.m29060x();
    }

    public final boolean m29238Bf() {
        View$OnClickListenerC2971rh nf = m29175nf();
        return nf != null && nf.m32399gl();
    }

    @Override
    public int mo29137C2() {
        AbstractC4067v<?> vVar = this.f13585I0;
        if (vVar instanceof C4195j) {
            return ((C4195j) vVar).m28515E0();
        }
        return 0;
    }

    @Override
    public void mo29136D0() {
        this.f13580D0.setInRecordMode(false);
    }

    @Override
    public boolean mo29135E1() {
        return m29238Bf();
    }

    @Override
    public void mo29134F3(boolean z) {
        this.f13623q1 = z;
        mo4347s().m14534T2(z);
        if (!z && this.f13621p1) {
            this.f13621p1 = false;
            this.f13632y0.m29051c(false);
        }
    }

    public final boolean m29230Jf() {
        int r0;
        return this.f13616n0 || !C4183a.f14093k || (r0 = C4868i.m24727c2().m24609r0()) == 2 || r0 == 0;
    }

    @Override
    public void mo29133L2(String str, RectF rectF, int i, int i2, int i3, boolean z) {
        if (this.f13622q0 != null && !str.isEmpty()) {
            if ((str.startsWith("tg://") || str.startsWith(this.f30168a.m14409z0().m2652Sc())) && !this.f13626s0) {
                this.f13624r0 = str;
                this.f13630w0.mo29115G1(rectF, i, i2, i3, z);
            }
        }
    }

    @Override
    public void mo29132L3(boolean z) {
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 10, z ? 1 : 0, 0));
            return;
        }
        this.f13579C0.m29277a();
    }

    public void m29228Lf() {
        String str;
        AbstractC4051f fVar = this.f13622q0;
        if (fVar != null && (str = this.f13624r0) != null) {
            fVar.mo1772y3(str);
            this.f13624r0 = null;
            this.f13626s0 = true;
            this.f30168a.onBackPressed();
        }
    }

    public final void m29227Mf(C6253l lVar, TdApi.MessageSendOptions messageSendOptions, boolean z, boolean z2) {
        View$OnClickListenerC2971rh nf = m29175nf();
        if (nf != null) {
            this.f30168a.m14591G0();
            nf.m32225tp(lVar, messageSendOptions, z, z2);
        }
    }

    @Override
    public void mo29131N() {
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 5));
            return;
        }
        m29217Sf();
    }

    @Override
    public void mo29046N5() {
        Runnable runnable = this.f13613k1;
        if (runnable != null) {
            runnable.run();
            this.f13613k1 = null;
        }
    }

    public final void m29226Nf() {
        if (!this.f13608f1) {
            this.f13608f1 = true;
            m29185if();
        }
    }

    @Override
    public int mo29130O3() {
        AbstractC4067v<?> vVar = this.f13585I0;
        if (vVar instanceof C4195j) {
            return ((C4195j) vVar).m28516D0();
        }
        return 0;
    }

    public void m29225Of() {
        get();
        C1399s0.m37212L(this.f13631x0, this.f13630w0, 0);
        this.f13585I0.m29061v().requestLayout();
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m29153xg();
        }
    }

    @Override
    public void mo29129P6(int i) {
        int i2;
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 7, i, 0));
            return;
        }
        this.f13591O0 = i;
        if (i != 2048) {
            if (i == 4096) {
                i2 = R.drawable.baseline_flash_auto_24;
            } else if (i != 16384) {
                i2 = R.drawable.baseline_flash_off_24;
            }
            this.f13582F0.m29267c(i2);
        }
        i2 = R.drawable.baseline_flash_on_24;
        this.f13582F0.m29267c(i2);
    }

    public final void m29223Pf() {
        this.f13581E0.setCameraIconRes(this.f13585I0.m29093V());
    }

    public final void m29221Qf() {
        this.f13582F0.setIconRes(R.drawable.baseline_flash_off_24);
        boolean V = this.f13585I0.m29093V();
        this.f13581E0.m29265e(V);
        this.f13581E0.setCameraIconRes(V);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_camera;
    }

    public final void m29219Rf() {
        this.f13584H0.setText("0:00");
    }

    public final void m29217Sf() {
        C3950k kVar = this.f13607e1;
        if (kVar != null) {
            kVar.m29543l(0.0f);
        }
        this.f13605c1 = 0;
        this.f13606d1 = -1;
        m29153xg();
    }

    @Override
    public void mo29216T6(RunnableC4027c cVar) {
        if (!m29151yf()) {
            this.f13585I0.m29073j();
        }
    }

    public void m29214Tf(int i) {
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 2, i, 0));
        }
    }

    public final void m29212Uf() {
        this.f13614l1 = this.f13631x0.getMeasuredWidth();
        this.f13615m1 = this.f13631x0.getMeasuredHeight();
        this.f13617n1 = m29171pf(true);
    }

    public void m29210Vf(float f, boolean z, boolean z2) {
        this.f13595S0 = f;
        this.f13633z0.setFadeFactor(1.0f - f);
        m29164sg();
        m29160ug();
    }

    public void m29208Wf(float f) {
        int o = C1357a0.m37538o();
        float f2 = o;
        this.f13578B0.setAlpha(f <= f2 ? o == 0 ? 0.0f : f / f2 : 1.0f);
        this.f13578B0.setTranslationY(f);
    }

    public void m29206Xf(int i, int i2, int i3, int i4) {
        if (this.f13596T0 != i || this.f13597U0 != i2 || this.f13598V0 != i3 || this.f13599W0 != i4) {
            this.f13596T0 = i;
            this.f13597U0 = i2;
            this.f13598V0 = i3;
            this.f13599W0 = i4;
            m29162tg();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && Build.VERSION.SDK_INT < 18) {
            m29191ff();
        }
    }

    public final void m29204Yf(float f) {
        if (this.f13587K0 != f) {
            this.f13587K0 = f;
            m29158vg();
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.m14721i((int) Log.TAG_CAMERA, "destroy", new Object[0]);
        }
        C4868i.m24727c2().m24854K3(this);
        AbstractC4067v<?> vVar = this.f13585I0;
        if (vVar != null) {
            vVar.mo27763i();
        }
    }

    public final void m29202Zf(boolean z) {
        if (this.f13616n0 != z) {
            this.f13616n0 = z;
            m29181kf();
        }
    }

    public void m29200ag() {
        this.f13600X0 = f13576u1 || this.f13585I0.mo27749w();
    }

    public final void m29198bg(View view, int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        boolean d0 = C1399s0.m37190d0(layoutParams, i2);
        boolean cg = m29196cg(view, layoutParams, i, i3, i4);
        if (d0 || cg) {
            view.setLayoutParams(layoutParams);
        }
    }

    @Override
    public void mo29128c1(String str) {
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 0, str));
        } else if (C5070i.m24062i(str)) {
            TextView textView = this.f13577A0;
            if (textView != null && textView.getParent() != null) {
                this.f13631x0.removeView(this.f13577A0);
            }
        } else {
            if (this.f13577A0 == null) {
                C6847b2 b2Var = new C6847b2(mo4347s());
                this.f13577A0 = b2Var;
                b2Var.setTextColor(-1);
                this.f13577A0.setTypeface(C1389o.m37261k());
                this.f13577A0.setTextSize(1, 12.0f);
                this.f13577A0.setGravity(17);
                this.f13577A0.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 17));
                C1399s0.m37168o0(this.f13577A0);
            }
            if (this.f13577A0.getParent() == null) {
                this.f13631x0.addView(this.f13577A0);
            }
            this.f13577A0.setText(str);
        }
    }

    public final boolean m29196cg(View view, FrameLayout.LayoutParams layoutParams, int i, int i2, int i3) {
        if (i == 3) {
            return C1399s0.m37180i0(layoutParams, (i2 - view.getPaddingLeft()) + this.f13596T0, 0, 0, 0);
        }
        if (i == 5) {
            return C1399s0.m37180i0(layoutParams, 0, 0, (i2 - view.getPaddingRight()) + this.f13598V0, 0);
        }
        if (i == 48) {
            return C1399s0.m37180i0(layoutParams, i3 > 0 ? i3 : 0, (i2 - view.getPaddingTop()) + this.f13597U0, i3 < 0 ? -i3 : 0, 0);
        } else if (i != 80) {
            return false;
        } else {
            return C1399s0.m37180i0(layoutParams, i3 > 0 ? i3 : 0, 0, i3 < 0 ? -i3 : 0, (i2 - view.getPaddingBottom()) + this.f13599W0);
        }
    }

    @Override
    public void mo29127d3(final C6253l lVar) {
        m29191ff();
        new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC4045k.this.m29235Ef(lVar);
            }
        }.run();
    }

    @Override
    public void mo6904d6() {
        super.mo6904d6();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.m14721i((int) Log.TAG_CAMERA, "onActivityPause", new Object[0]);
        }
        mo29121n(true, null);
        this.f13585I0.mo27766U();
        m29179lf();
    }

    public void m29194dg(int i, AbstractC4052g gVar) {
        boolean z = false;
        this.f13626s0 = false;
        this.f13620p0 = gVar;
        int i2 = this.f13618o0;
        if (i2 != i) {
            m29202Zf(i == 1 || i == 2);
            this.f13618o0 = i;
            if (this.f13631x0 != null) {
                m29164sg();
                m29156wg();
                C4069x xVar = this.f13632y0;
                if (xVar != null) {
                    if (this.f13618o0 == 0 && C4868i.m24727c2().m24664k1(4096L)) {
                        z = true;
                    }
                    xVar.m29049e(z, m9339Ta());
                }
            }
        } else if (i2 == 2) {
            this.f13630w0.mo29114I1(true, false);
        }
    }

    @Override
    public void mo29126e() {
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 3, 1, 0));
            return;
        }
        this.f13590N0 = true;
        this.f13632y0.m29048f(false, true ^ m9312Xa(), null);
        AbstractC4052g gVar = this.f13620p0;
        if (gVar != null) {
            gVar.mo6903e(this);
        }
        m9204n9();
    }

    public final void m29193ef(int i) {
        C3950k kVar = this.f13607e1;
        if (kVar != null) {
            kVar.m29544k();
        }
        if (this.f13601Y0 && !m9312Xa() && !m9347Sa()) {
            if (this.f13607e1 == null) {
                this.f13607e1 = new C3950k(0, this, C2057b.f7280b, 180L, 0.0f);
            }
            this.f13607e1.m29546i(i);
            return;
        }
        C3950k kVar2 = this.f13607e1;
        if (kVar2 != null) {
            kVar2.m29543l(i);
        }
        m29153xg();
    }

    public void m29192eg(View$OnClickListenerC7430j1 j1Var, C8112b bVar) {
        Bitmap bitmap;
        if (j1Var == null) {
            final C8112b bVar2 = this.f13611i1;
            View$OnClickListenerC7430j1 j1Var2 = this.f13610h1;
            final boolean z = j1Var2 != null && !j1Var2.m16273aj() && (m29238Bf() || !C4868i.m24727c2().m24664k1(2048L) || (bVar2 != null && C7389v0.m16580t1(bVar2.m13549K().mo20876q())));
            if (bVar2 != null) {
                C6259q.m20787c().m20785e(bVar2.m13549K());
                C7907b.m14361k().m14360l(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC4045k.m29234Ff(z, bVar2);
                    }
                });
            }
            if (!z || (bitmap = this.f13612j1) == null || bitmap.isRecycled()) {
                this.f13585I0.m29099L();
            } else {
                this.f13585I0.m29098M(this.f13612j1);
            }
        }
        this.f13610h1 = j1Var;
        this.f13611i1 = bVar;
        m29185if();
        C1379j0.m37335e0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC4045k.this.m29233Gf();
            }
        }, 200L);
    }

    @Override
    public void mo29125f7(boolean z, boolean z2, boolean z3) {
        if (!C1379j0.m37360K()) {
            if (z3) {
                boolean z4 = z2 ? 1 : 0;
                char c = z2 ? 1 : 0;
                z2 = z4 | true;
            }
            HandlerC4050e eVar = this.f13629v0;
            int i = z ? 1 : 0;
            int i2 = z2 ? 1 : 0;
            int i3 = z2 ? 1 : 0;
            eVar.sendMessage(Message.obtain(eVar, 8, i, i2));
            return;
        }
        this.f13592P0 = !z ? 1 : 0;
        if (!z) {
            this.f13581E0.m29263g(z2, z3);
            AbstractC4052g gVar = this.f13620p0;
            if (gVar != null) {
                gVar.mo6907d(z2, z3);
            }
        }
    }

    public final boolean m29191ff() {
        int i;
        if (m29161uf() == 0.0f) {
            return false;
        }
        m29183jf();
        int pf = m29171pf(false);
        if (pf == -1) {
            return false;
        }
        if (pf == 0) {
            i = 1;
        } else if (pf == 90) {
            i = 0;
        } else if (pf != 270) {
            return false;
        } else {
            i = 8;
        }
        int M0 = mo4347s().m14562M0();
        mo4347s().m14561M1(i);
        m29183jf();
        return (M0 == 1) != (i == 1);
    }

    public void m29190fg(AbstractC9323v4<?> v4Var) {
        this.f13602Z0 = v4Var;
    }

    public final boolean m29189gf() {
        return false;
    }

    public void m29188gg(AbstractC4051f fVar, int i, boolean z) {
        C4056l0 l0Var;
        this.f13622q0 = fVar;
        this.f13627t0 = i;
        this.f13628u0 = z;
        if (this.f13618o0 == 2 && (l0Var = this.f13630w0) != null) {
            l0Var.mo29113J1(i);
            this.f13630w0.mo29114I1(true, z);
        }
    }

    public final boolean m29187hf() {
        AbstractRunnableC5910b bVar = this.f13625r1;
        if (bVar == null || !bVar.m21857d()) {
            return false;
        }
        this.f13625r1.m21858c();
        this.f13625r1 = null;
        return true;
    }

    public final void m29186hg(int r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: de.View$OnClickListenerC4045k.m29186hg(int, boolean):void");
    }

    @Override
    public void mo2412i6(long j, long j2) {
        this.f13632y0.m29049e(this.f13618o0 == 0 && C5063c.m24144c(j, 4096L), m9339Ta());
    }

    public final void m29185if() {
        boolean z = this.f13608f1 && this.f13610h1 == null;
        if (this.f13609g1 != z) {
            this.f13609g1 = z;
            if (z) {
                this.f13585I0.mo27767S();
                return;
            }
            this.f13585I0.mo27764h();
            this.f13632y0.m29048f(true, !m9312Xa(), null);
        }
    }

    public final void m29184ig(boolean z) {
        if (this.f13603a1 != z) {
            this.f13603a1 = z;
            if (this.f13604b1 == null) {
                m29154xf();
            }
            if (z) {
                this.f13604b1.enable();
            } else {
                this.f13604b1.disable();
            }
        }
    }

    @Override
    public boolean mo29124j4() {
        return m29151yf();
    }

    @Override
    public void mo29123j7() {
        this.f13630w0.mo29118D1();
    }

    public void m29183jf() {
        this.f13585I0.m29079f();
        m29162tg();
    }

    public void m29182jg(boolean z) {
        if (this.f13586J0 != z) {
            this.f13586J0 = z;
            this.f13632y0.setNeedFastAnimations(z);
        }
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.m14721i((int) Log.TAG_CAMERA, "onBlur", new Object[0]);
        }
        if (this.f13600X0) {
            m9204n9();
        } else {
            m29177mf();
        }
    }

    public void m29181kf() {
        if (this.f13631x0 != null && m29149zf() != m29230Jf()) {
            AbstractC4067v<?> vVar = this.f13585I0;
            if (vVar != null) {
                this.f13631x0.removeView(vVar.m29061v());
                this.f13585I0.mo27763i();
                this.f13585I0 = null;
            }
            if (m29230Jf()) {
                this.f13585I0 = new C4195j(this.f30168a, this);
            } else {
                this.f13585I0 = new C4420h(this.f30168a, this);
            }
            this.f13631x0.addView(this.f13585I0.m29061v(), this.f13631x0.getChildCount() - 1);
        }
    }

    public void m29180kg(float f) {
        if (this.f13588L0 != f) {
            this.f13588L0 = f;
            m29158vg();
        }
    }

    @Override
    public void mo9216lc() {
        super.mo9216lc();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.m14721i((int) Log.TAG_CAMERA, "onCleanAfterHide", new Object[0]);
        }
        this.f13601Y0 = false;
        m29178lg(false);
        m29179lf();
        m29217Sf();
        mo29128c1(null);
        m29221Qf();
        this.f13632y0.m29050d();
        if (this.f13600X0) {
            m29177mf();
        }
        this.f13585I0.m29087a0();
    }

    public final void m29179lf() {
        m29184ig(m29174ng() && !m9312Xa() && !m9347Sa() && this.f13601Y0);
    }

    public void m29178lg(boolean z) {
        if (this.f13593Q0 != z) {
            this.f13593Q0 = z;
        }
    }

    @Override
    public void mo29122m1(int i) {
        int i2 = 0;
        boolean z = true;
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 1, i, 0));
            return;
        }
        this.f13589M0 = i;
        if (i != -1) {
            if (i <= 1) {
                z = false;
            }
            if (!m29151yf()) {
                C4030d dVar = this.f13581E0;
                if (!z) {
                    i2 = 8;
                }
                dVar.setVisibility(i2);
            }
        }
    }

    @Override
    public void mo9208mc(Configuration configuration) {
        super.mo9208mc(configuration);
        m29183jf();
    }

    public final void m29177mf() {
        if (this.f13608f1) {
            this.f13608f1 = false;
            m29185if();
        }
    }

    public final void m29176mg(long j) {
        this.f13619o1 = j;
        m29150yg();
    }

    @Override
    public void mo29121n(boolean z, Runnable runnable) {
        if (!C1379j0.m37360K()) {
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessage(Message.obtain(eVar, 3, 0, z ? 1 : 0, runnable));
            return;
        }
        if (this.f13590N0) {
            this.f13632y0.m29047g(this.f13585I0.m29068n0(), mo4347s().m14512a1());
        }
        this.f13590N0 = false;
        this.f13632y0.m29048f(true, !m9312Xa(), runnable);
        if (m29151yf()) {
            this.f13630w0.mo29119C1();
        }
        m9204n9();
    }

    public final View$OnClickListenerC2971rh m29175nf() {
        AbstractC9323v4<?> F = this.f30168a.m14551P1().m9762F();
        if (F instanceof View$OnClickListenerC2971rh) {
            return (View$OnClickListenerC2971rh) F;
        }
        return null;
    }

    public boolean m29174ng() {
        if (this.f13604b1 == null) {
            m29154xf();
        }
        return this.f13604b1.canDetectOrientation();
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.m14721i((int) Log.TAG_CAMERA, "onActivityResume", new Object[0]);
        }
        this.f13585I0.mo27765b0();
        m29179lf();
    }

    @Override
    public View mo403oc(Context context) {
        C4060o oVar = new C4060o(context);
        this.f13631x0 = oVar;
        oVar.setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, 17));
        this.f13631x0.setParent(this);
        C4069x xVar = new C4069x(context);
        this.f13632y0 = xVar;
        xVar.setFlashListener(this);
        this.f13632y0.m29049e(this.f13618o0 == 0 && C4868i.m24727c2().m24664k1(4096L), false);
        this.f13632y0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f13633z0 = new C4057m(context);
        this.f13579C0 = new C4025b(context);
        RunnableC4027c cVar = new RunnableC4027c(context);
        this.f13580D0 = cVar;
        cVar.setBlurView(this.f13579C0);
        this.f13580D0.setParent(this);
        this.f13580D0.setRecordListener(this);
        C4030d dVar = new C4030d(context);
        this.f13581E0 = dVar;
        dVar.setOnClickListener(this);
        this.f13581E0.setNeedParentTranslation(true);
        this.f13581E0.setId(R.id.btn_camera_switch);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f13583G0 = frameLayoutFix;
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(C1357a0.m37544i(56.0f), C1357a0.m37544i(56.0f)));
        this.f13583G0.addView(this.f13581E0);
        C4030d dVar2 = new C4030d(context);
        this.f13582F0 = dVar2;
        dVar2.setId(R.id.btn_camera_flash);
        this.f13582F0.setOnClickListener(this);
        this.f13582F0.setIconRes(R.drawable.baseline_flash_off_24);
        C6847b2 b2Var = new C6847b2(context);
        this.f13584H0 = b2Var;
        b2Var.setLayoutParams(FrameLayoutFix.m18008s1(-2, -2));
        this.f13584H0.setTypeface(C1389o.m37263i());
        this.f13584H0.setTextColor(-1);
        this.f13584H0.setTextSize(1, 20.0f);
        C1399s0.m37168o0(this.f13584H0);
        m29219Rf();
        C4053k0 k0Var = new C4053k0(context);
        this.f13630w0 = k0Var;
        k0Var.m29116F1(this);
        this.f13630w0.setBackgroundColor(-16777216);
        this.f13630w0.addView(this.f13631x0);
        this.f13630w0.addView(this.f13583G0);
        this.f13630w0.addView(this.f13582F0);
        this.f13630w0.addView(this.f13579C0);
        this.f13630w0.addView(this.f13580D0);
        this.f13630w0.addView(this.f13584H0);
        this.f13630w0.addView(this.f13633z0);
        C6879f3 f3Var = new C6879f3(context);
        this.f13578B0 = f3Var;
        f3Var.setSimpleBottomTransparentShadow(true);
        this.f13630w0.addView(this.f13578B0);
        if (m29230Jf()) {
            this.f13585I0 = new C4195j(context, this);
        } else {
            this.f13585I0 = new C4420h(context, this);
        }
        this.f13631x0.addView(this.f13585I0.m29061v());
        this.f13581E0.setCameraIconRes(this.f13585I0.m29093V());
        this.f13631x0.addView(this.f13632y0);
        m29156wg();
        m29162tg();
        m29160ug();
        C4868i.m24727c2().m24650m(this);
        return this.f13630w0;
    }

    public C4060o m29173of() {
        return this.f13631x0;
    }

    public void m29172og() {
        if (!this.f13592P0) {
            this.f13585I0.mo27760l0();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_camera_flash:
                this.f13585I0.mo27759m0();
                return;
            case R.id.btn_camera_switch:
                m29172og();
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.f13608f1 || this.f13610h1 != null || m29151yf()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24 || i == 25) {
            int s0 = this.f13618o0 != 0 ? 1 : C4868i.m24727c2().m24601s0();
            boolean z = false;
            if (s0 == 0) {
                AbstractRunnableC5910b bVar = this.f13625r1;
                if ((bVar != null && bVar.m21857d()) || this.f13580D0.m29273d(false)) {
                    return true;
                }
                m29187hf();
                C4049d dVar = new C4049d();
                this.f13625r1 = dVar;
                m9143vd(dVar, ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (s0 == 1) {
                if (i == 24) {
                    z = true;
                }
                float p = this.f13585I0.mo27757p();
                float o = this.f13585I0.mo27758o();
                float l = this.f13585I0.mo27761l();
                float max = Math.max(this.f13585I0.mo27756q(), Math.min(1.0f, (o - p) / 20.0f));
                AbstractC4067v<?> vVar = this.f13585I0;
                if (!z) {
                    max = -max;
                }
                vVar.mo27771J(C5069h.m24089e(l + max, p, o));
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f13608f1 || this.f13610h1 != null || m29151yf()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24 || i == 25) {
            int s0 = C4868i.m24727c2().m24601s0();
            if (s0 == 0) {
                if (m29187hf()) {
                    this.f13580D0.m29271f();
                }
                return true;
            } else if (s0 == 1) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i = 0;
        if (Math.abs(sensorEvent.values[1]) > Math.abs(sensorEvent.values[0])) {
            float[] fArr = sensorEvent.values;
            if (fArr[1] <= 1.0f) {
                if (fArr[1] < -1.0f) {
                    i = 180;
                } else {
                    return;
                }
            }
        } else {
            float[] fArr2 = sensorEvent.values;
            if (fArr2[0] > 1.0f) {
                i = 90;
            } else if (fArr2[0] < -1.0f) {
                i = 270;
            } else {
                return;
            }
        }
        m29186hg(i, true);
    }

    public final int m29171pf(boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: de.View$OnClickListenerC4045k.m29171pf(boolean):int");
    }

    public void m29170pg(ViewGroup viewGroup, int i) {
        get();
        C1399s0.m37212L(this.f13631x0, viewGroup, i);
        this.f13585I0.m29061v().requestLayout();
    }

    public C4195j m29169qf() {
        return (C4195j) this.f13585I0;
    }

    public final void m29168qg(boolean z) {
        if (!this.f13623q1) {
            m29212Uf();
            this.f13621p1 = z;
            this.f13585I0.m29067o0(this.f13614l1, this.f13615m1, this.f13617n1);
        }
    }

    public AbstractC4067v<?> m29167rf() {
        return this.f13585I0;
    }

    public final void m29166rg(boolean z) {
        if (this.f13585I0.mo27749w()) {
            final Bitmap p0 = this.f13585I0.m29066p0();
            m29212Uf();
            Runnable fVar = new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC4045k.this.m29232Hf(p0);
                }
            };
            if (z) {
                this.f13613k1 = fVar;
                this.f13632y0.m29051c(false);
                return;
            }
            fVar.run();
        }
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (Log.isEnabled(Log.TAG_CAMERA)) {
            Log.m14721i((int) Log.TAG_CAMERA, "onFocus", new Object[0]);
        }
        if (this.f13618o0 == 0 && C4868i.m24727c2().m24764X2(32768L)) {
            C4868i.m24727c2().m24568w2(32768L);
            mo4347s().m14584H3().m8985g(this.f13580D0).m8958i(this).m8972C(this.f30170b, R.string.CameraButtonHint).m8919F();
        }
        if (this.f13600X0) {
            this.f13600X0 = false;
        } else {
            m29226Nf();
        }
    }

    public final int m29165sf() {
        return m29171pf(false);
    }

    public final void m29164sg() {
        float f;
        if (this.f13618o0 == 1) {
            f = 1.0f;
        } else {
            f = this.f13594R0 * ((this.f13595S0 * 0.100000024f) + 0.9f);
        }
        this.f13631x0.setScaleX(f);
        this.f13631x0.setScaleY(f);
    }

    @Override
    public void mo29045t5() {
        if (m29189gf()) {
            m29166rg(true);
            return;
        }
        this.f13585I0.m29075h0(false);
        m29168qg(true);
    }

    public final int m29163tf() {
        return C5069h.m24082l(this.f13605c1, 360);
    }

    public final void m29162tg() {
        int i;
        int m = this.f13585I0.m29070m();
        int i2 = 48;
        if (m == 90) {
            i2 = 5;
            i = 3;
        } else if (m == 180) {
            i = 80;
        } else if (m != 270) {
            i2 = 80;
            i = 48;
        } else {
            i2 = 3;
            i = 5;
        }
        int If = m29231If(i2);
        m29198bg(this.f13584H0, i, m29231If(i), C1357a0.m37544i(18.0f), 0);
        int i3 = i2;
        m29198bg(this.f13580D0, i3, If, C1357a0.m37544i(40.0f), 0);
        m29198bg(this.f13579C0, i3, If, C1357a0.m37544i(18.0f), 0);
        m29198bg(this.f13583G0, i3, If, C1357a0.m37544i(40.0f), 0);
        m29198bg(this.f13582F0, i3, If, C1357a0.m37544i(40.0f), 0);
        if (i2 != 5) {
            this.f13581E0.setAlignGravity(5);
            this.f13582F0.setAlignGravity(3);
            return;
        }
        this.f13581E0.setAlignGravity(3);
        this.f13582F0.setAlignGravity(5);
    }

    @Override
    public void mo29120u6(long j) {
        m29176mg(j);
        this.f13580D0.setInRecordMode(true);
    }

    public float m29161uf() {
        C3950k kVar = this.f13607e1;
        if (kVar != null) {
            return kVar.m29540o();
        }
        return 0.0f;
    }

    public final void m29160ug() {
        m29204Yf(this.f13595S0);
    }

    public boolean m29159vf() {
        return this.f13610h1 != null;
    }

    public final void m29158vg() {
        float f = this.f13595S0;
        float f2 = (0.35000002f * f) + 0.65f;
        this.f13579C0.setScaleX(f2);
        this.f13579C0.setScaleY(f2);
        this.f13579C0.setAlpha(f);
        this.f13580D0.setScaleX(f2);
        this.f13580D0.setScaleY(f2);
        this.f13580D0.setAlpha(f);
        float f3 = (1.0f - this.f13588L0) * f;
        float f4 = (f3 * 0.3f) + 0.7f;
        this.f13581E0.setScaleX(f4);
        this.f13581E0.setScaleY(f4);
        this.f13583G0.setAlpha(f3);
        this.f13582F0.setScaleX(f4);
        this.f13582F0.setScaleY(f4);
        this.f13582F0.setAlpha(f3);
        float f5 = f * this.f13588L0;
        float f6 = (0.3f * f5) + 0.7f;
        this.f13584H0.setScaleX(f6);
        this.f13584H0.setScaleY(f6);
        this.f13584H0.setAlpha(f5);
    }

    public boolean m29157wf() {
        return this.f13590N0;
    }

    public final void m29156wg() {
        if (m29151yf()) {
            this.f13581E0.setVisibility(8);
            this.f13582F0.setVisibility(8);
            this.f13579C0.setVisibility(8);
            this.f13630w0.mo29114I1(true, this.f13628u0);
            this.f13630w0.mo29113J1(this.f13627t0);
            return;
        }
        this.f13581E0.setVisibility(0);
        this.f13582F0.setVisibility(0);
        this.f13579C0.setVisibility(0);
        this.f13630w0.mo29114I1(false, this.f13628u0);
    }

    @Override
    public boolean mo29155x6(RunnableC4027c cVar) {
        if (m29151yf()) {
            return false;
        }
        C4868i.m24727c2().m24583u2(32768L);
        return this.f13585I0.m29071k0(m29165sf());
    }

    public final void m29154xf() {
        if (this.f13604b1 == null) {
            this.f13604b1 = new C4046a(mo4347s(), 3);
        }
    }

    public final void m29153xg() {
        float uf = m29161uf();
        this.f13630w0.mo29117E1(uf);
        this.f13580D0.setComponentRotation(uf);
        this.f13583G0.setRotation(uf);
        this.f13582F0.setComponentRotation(uf);
        this.f13584H0.setRotation(uf);
    }

    @Override
    public void mo29152y(RunnableC4027c cVar) {
        if (!this.f13623q1) {
            if (m29151yf()) {
                this.f30168a.onBackPressed();
            } else if (m29189gf()) {
                this.f13585I0.m29075h0(true);
                if (this.f13591O0 == 1024) {
                    m29166rg(false);
                } else {
                    this.f13632y0.m29052b();
                }
            } else if (this.f13591O0 == 16384) {
                this.f13585I0.m29075h0(true);
                this.f13632y0.m29052b();
            } else {
                m29168qg(false);
            }
        }
    }

    public boolean m29151yf() {
        return this.f13618o0 == 2;
    }

    public final void m29150yg() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f13619o1;
        long j2 = j != 0 ? uptimeMillis - j : 0L;
        this.f13584H0.setText(C1363c0.m37436h(j2 / 1000));
        this.f13629v0.removeMessages(11);
        if (this.f13619o1 != 0) {
            long j3 = 1000 - (j2 % 1000);
            HandlerC4050e eVar = this.f13629v0;
            eVar.sendMessageDelayed(Message.obtain(eVar, 11), j3);
        }
    }

    public boolean m29149zf() {
        return this.f13585I0 instanceof C4195j;
    }
}
