package p292ud;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import be.C1357a0;
import be.C1359b;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import de.C4030d;
import de.View$OnClickListenerC4045k;
import gd.C4695l6;
import gd.C4779t2;
import ge.C4868i;
import ge.C4895m;
import id.C5349g0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import me.C6847b2;
import me.C6858d0;
import me.C6879f3;
import me.C6890g4;
import me.C6899h3;
import me.C6901h4;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.View$OnTouchListenerC5103c0;
import p139jb.AbstractC5914f;
import p141jd.RunnableC5952j1;
import p154kb.C6235i;
import p193nb.C7316a;
import p291uc.C9540f4;
import p292ud.C9733d0;
import p292ud.C9758l0;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.C10756j9;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11526l;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11524j;
import p364zd.C11525k;
import p364zd.C11541z;
import td.AbstractC9323v4;

public class C9789y implements C4868i.AbstractC4890u, C3950k.AbstractC3952b, RunnableC5952j1.AbstractC5954b, View$OnClickListenerC4045k.AbstractC4052g, C9758l0.AbstractC9760b, C10756j9.AbstractC10760d, AbstractView$OnTouchListenerC7889a.AbstractC7897h, AbstractC11526l {
    public static final int f31989X0;
    public static final String[] f31990Y0;
    public final C3940f f31991A0;
    public final C3940f f31993C0;
    public View$OnClickListenerC4045k f31994D0;
    public boolean f31995E0;
    public boolean f31996F0;
    public long f31997G0;
    public long f31998H0;
    public View$OnClickListenerC2971rh f31999I0;
    public boolean f32002L0;
    public C6879f3 f32003M;
    public int f32004M0;
    public C6879f3 f32005N;
    public int f32006N0;
    public C9722a0 f32007O;
    public String f32008O0;
    public C9540f4 f32009P;
    public long f32010P0;
    public C9739e0 f32011Q;
    public String f32012Q0;
    public C4030d f32013R;
    public TdApi.File f32014R0;
    public FrameLayoutFix f32015S;
    public boolean f32016S0;
    public C9733d0 f32017T;
    public int f32018T0;
    public FrameLayoutFix f32019U;
    public boolean f32020U0;
    public TextView f32021V;
    public boolean f32022V0;
    public TextView f32023W;
    public TdApi.MessageSendOptions f32024W0;
    public View f32025X;
    public C6858d0 f32026Y;
    public View f32027Z;
    public final AbstractView$OnTouchListenerC7889a f32028a;
    public C9742f0 f32029a0;
    public FrameLayoutFix f32030b;
    public ImageView f32031b0;
    public C9805z f32032c;
    public ImageView f32033c0;
    public View$OnTouchListenerC5103c0 f32034d0;
    public C6890g4 f32035e0;
    public C6899h3 f32036f0;
    public ImageView f32037g0;
    public C10930q6 f32039i0;
    public boolean f32040j0;
    public C3940f f32041k0;
    public float f32042l0;
    public int f32043m0;
    public float f32044n0;
    public float f32045o0;
    public boolean f32046p0;
    public boolean f32047q0;
    public C3940f f32048r0;
    public long f32049s0;
    public int f32051u0;
    public final C3940f f32052v0;
    public boolean f32053w0;
    public float f32054x0;
    public final C3940f f32055y0;
    public float f32056z0;
    public final List<Reference<AbstractC9804o>> f32050t0 = new ArrayList();
    public float f31992B0 = 1.0f;
    public float f32000J0 = -1.0f;
    public float f32001K0 = 0.0f;
    public boolean f32038h0 = C4868i.m24726c2().m24629o3();

    public class C9790a extends ImageView {
        public C9790a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C9789y.this.f32054x0 > 0.0f && C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class C9791b extends C6890g4 {
        public C9791b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C9789y.this.f32054x0 > 0.0f && C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class C9792c implements C6890g4.AbstractC6893c {
        public C9792c() {
        }

        @Override
        public void mo6838a(C6890g4 g4Var, double d, double d2, double d3, int i, long j) {
            C6901h4.m18516a(this, g4Var, d, d2, d3, i, j);
        }

        @Override
        public void mo6837b(C6890g4 g4Var, boolean z) {
            C9789y.this.f32036f0.setPlaying(!z);
        }

        @Override
        public boolean mo6836c(C6890g4 g4Var) {
            return C9789y.this.f32036f0 != null && C9789y.this.f32036f0.m18523f();
        }

        @Override
        public void mo6835d(C6890g4 g4Var, float f) {
            C9789y.this.f32036f0.m18520m(f);
        }

        @Override
        public void mo6834e(C6890g4 g4Var, double d, double d2, double d3) {
            C9789y.this.f32036f0.m18519n(d, d2, d3);
        }
    }

    public class C9793d implements C6899h3.AbstractC6900a {
        public C9793d() {
        }

        @Override
        public void mo6833a(boolean z) {
            C9789y.this.f31991A0.m29575p(z, z);
        }

        @Override
        public void mo6832b(boolean z) {
            C9789y.this.f31993C0.m29575p(z, C9789y.this.f32054x0 > 0.0f);
        }
    }

    public class C9794e extends ImageView {
        public C9794e(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, C1357a0.m37541i(12.0f), C1410y.m37039g(Log.TAG_TDLIB_OPTIONS));
            super.onDraw(canvas);
        }
    }

    public class C9795f extends FrameLayoutFix {
        public C9795f(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return Math.max(C9789y.this.f32000J0, C9789y.this.f32054x0) == 0.0f;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return Math.max(C9789y.this.f32000J0, C9789y.this.f32054x0) != 0.0f && super.onTouchEvent(motionEvent);
        }
    }

    public class C9796g extends FrameLayoutFix {
        public C9796g(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C1399s0.m37218C(this);
        }
    }

    public class C9797h extends C6847b2 {
        public int f32064a;

        public C9797h(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredWidth = getMeasuredWidth();
            if (this.f32064a != measuredWidth) {
                this.f32064a = measuredWidth;
                C9789y.this.m6839z1();
            }
        }
    }

    public class C9798i extends View {
        public C9798i(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            C1359b.m37508k(canvas, 0.0f, getMeasuredHeight() / 2, C11524j.m213U0(), 3);
        }
    }

    public class C9799j extends C6847b2 {
        public C9799j(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C1399s0.m37205P(this, motionEvent) && super.onTouchEvent(motionEvent);
        }
    }

    public class C9800k extends C4030d {
        public C9800k(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class C9801l extends C9540f4 {
        public C9801l(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C9789y.this.m6839z1();
            C9789y.this.m6842y1();
        }
    }

    public class C9802m extends C6858d0 {
        public C9802m(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class C9803n extends ImageView {
        public C9803n(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C9789y.this.f32054x0 > 0.0f && C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public interface AbstractC9804o {
        void mo6831i1(boolean z);
    }

    static {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        f31989X0 = i < 21 ? 360 : 480;
        if (i >= 16) {
            strArr = new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
        } else {
            strArr = new String[]{"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        f31990Y0 = strArr;
    }

    public C9789y(AbstractView$OnTouchListenerC7889a aVar) {
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f32041k0 = new C3940f(2, this, decelerateInterpolator, 180L);
        this.f32048r0 = new C3940f(1, this, decelerateInterpolator, 180L);
        this.f32052v0 = new C3940f(0, this, decelerateInterpolator, 160L);
        this.f32055y0 = new C3940f(4, this, decelerateInterpolator, 180L);
        this.f31991A0 = new C3940f(5, this, decelerateInterpolator, 180L);
        this.f31993C0 = new C3940f(6, this, decelerateInterpolator, 180L, true);
        this.f32028a = aVar;
        aVar.m14554P(this);
        C4868i.m24726c2().m24593t(this);
        RunnableC5952j1.m21779y();
        C11541z.m7t().m23f(this);
    }

    public static boolean m6912b0(int i) {
        return (i == 0 || i == 3) ? false : true;
    }

    public static boolean m6902e0(int i) {
        return i == 2 || i == 3;
    }

    public void m6896g0(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        m6935Q(new TdApi.MessageSendOptions(z, false, false, messageSchedulingState));
    }

    public void m6893h0(DialogInterface dialogInterface, int i) {
        m6935Q(null);
    }

    public void m6891i0(C10930q6.C10942l lVar, int i, byte[] bArr) {
        if (m6918Z()) {
            this.f31999I0.m32156yq(new C4695l6(this.f32039i0, lVar, i, bArr));
        }
    }

    public void m6888j0(TdApi.File file) {
        TdApi.File file2 = this.f32014R0;
        if (file2 != null && file2.f25373id == file.f25373id) {
            this.f32014R0 = file;
            this.f32020U0 = true;
            m6955G0();
        }
    }

    public void m6885k0(TdApi.Object object) {
        if (object.getConstructor() == 766337656) {
            m6898f1((TdApi.File) object);
        } else {
            C1379j0.m37302t0(object);
        }
    }

    public void m6882l0(View view) {
        if (this.f32040j0) {
            m6872o1(0, false);
        }
    }

    public void m6879m0() {
        float Y = this.f32053w0 ? m6919Y() : 0.0f;
        this.f32029a0.m7296f(C5069h.m24089d(Y));
        if (Y >= 1.0f) {
            m6926U(true);
        }
    }

    public void m6876n0(View view) {
        if (m6909c0() && this.f32040j0) {
            m6926U(false);
        }
    }

    public void m6873o0(View view) {
        View$OnClickListenerC4045k kVar = this.f31994D0;
        if (kVar != null) {
            kVar.m29170og();
        }
    }

    public void m6869p0(View view) {
        if (this.f32040j0) {
            m6926U(true);
        }
    }

    public void m6864r0(View view) {
        if (this.f32051u0 == 3) {
            this.f32036f0.m18518r();
        }
    }

    public void m6861s0(View view) {
        if (this.f32051u0 == 3) {
            m6935Q(null);
        }
    }

    public void m6858t0(View view) {
        m6936P0(false, null);
    }

    public void m6855u0(long j, long j2, long j3, TdApi.MessageSendOptions messageSendOptions, TdApi.InputMessageVideoNote inputMessageVideoNote, boolean z, TdApi.InputMessageVideoNote inputMessageVideoNote2, TdApi.Object object) {
        this.f32039i0.m2247sb(j, j2, j3, messageSendOptions, object.getConstructor() == 766337656 ? this.f32039i0.m2429h5().m23149C(inputMessageVideoNote, z, (TdApi.File) object) : inputMessageVideoNote2, null);
    }

    public void m6852v0(final TdApi.InputMessageVideoNote inputMessageVideoNote, final boolean z, TdApi.File file, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        final TdApi.InputMessageVideoNote inputMessageVideoNote2 = (TdApi.InputMessageVideoNote) this.f32039i0.m2429h5().m23149C(inputMessageVideoNote, z, file);
        final long C9 = this.f31999I0.mo9464C9();
        final long qk = this.f31999I0.m32266qk();
        final long ko = this.f31999I0.m32341ko();
        final TdApi.MessageSendOptions messageSendOptions = new TdApi.MessageSendOptions(z2, false, false, messageSchedulingState);
        if (inputMessageVideoNote2.thumbnail != null || file == null) {
            this.f32039i0.m2247sb(C9, qk, ko, messageSendOptions, inputMessageVideoNote2, null);
        } else {
            this.f32039i0.m2270r4().m14783o(new TdApi.DownloadFile(file.f25373id, 1, 0, 0, true), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C9789y.this.m6855u0(C9, qk, ko, messageSendOptions, inputMessageVideoNote, z, inputMessageVideoNote2, object);
                }
            });
        }
    }

    public void m6849w0(String str, long j, String str2) {
        if (C5070i.m24067c(str, this.f32008O0)) {
            m6905d1(j, str2);
        } else {
            this.f32039i0.m2270r4().m14783o(new TdApi.FinishFileGeneration(j, new TdApi.Error()), this.f32039i0.m2214uc());
        }
    }

    public void m6846x0(TdApi.File file) {
        if (C5070i.m24061i(this.f32008O0) || !C5070i.m24067c(file.local.path, this.f32012Q0)) {
            this.f32039i0.m2270r4().m14783o(new TdApi.CancelUploadFile(file.f25373id), this.f32039i0.m2214uc());
        } else {
            m6908c1(file);
        }
    }

    public void m6843y0(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        m6936P0(z, messageSchedulingState);
    }

    public boolean m6840z0() {
        return this.f32054x0 == 1.0f;
    }

    public final boolean m6968A0(boolean z, boolean z2) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        String[] strArr = z ? View$OnClickListenerC4045k.f13574s1 : f31990Y0;
        if (!C7389v0.m16662Y1(strArr)) {
            return false;
        }
        if (!z2) {
            return true;
        }
        C7389v0.m16563x2(strArr, null);
        return true;
    }

    public final void m6967A1() {
        int top = this.f32019U.getTop() + this.f32043m0;
        C6858d0 d0Var = this.f32026Y;
        d0Var.setTranslationY(((top / 2) - (d0Var.getLayoutParams().height / 2)) + ((top / 3) * (1.0f - Math.max(this.f32000J0, this.f32054x0))));
    }

    public final void m6965B0(boolean z) {
        this.f32028a.m14552P1().m9749M().m9514B(z);
        if (z) {
            C1379j0.m37319l(this.f32009P, true, true);
            this.f32039i0.m2930B4().m4636w2().m7119A0(Log.TAG_YOUTUBE);
        }
        for (int size = this.f32050t0.size() - 1; size >= 0; size--) {
            AbstractC9804o oVar = this.f32050t0.get(size).get();
            if (oVar != null) {
                oVar.mo6831i1(z);
            } else {
                this.f32050t0.remove(size);
            }
        }
    }

    public void m6963C0() {
        if (this.f32051u0 == 3) {
            AbstractC9323v4<?> t = C1379j0.m37303t(this.f32028a);
            if (t != null) {
                t.m9411Jc(R.string.DiscardVideoMessageTitle, R.string.DiscardVideoMessageDescription, C4403w.m27869i1(R.string.Discard), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C9789y.this.m6893h0(dialogInterface, i);
                    }
                });
                return;
            }
            return;
        }
        m6926U(true);
    }

    public final void m6961D0() {
        View$OnClickListenerC4045k kVar;
        if (this.f32002L0) {
            if (this.f32053w0 && (kVar = this.f31994D0) != null) {
                kVar.mo9222kc();
            }
            this.f32002L0 = false;
        }
    }

    public final void m6959E0() {
        if (!this.f32002L0) {
            this.f32002L0 = true;
            if (this.f32053w0) {
                View$OnClickListenerC4045k kVar = this.f31994D0;
                if (kVar != null) {
                    kVar.mo9166sc();
                } else {
                    Log.m14711w((int) Log.TAG_ROUND, "ownedCamera.onFocus() failed: null", new Object[0]);
                }
            }
            m6941N(0);
        }
    }

    public final void m6957F0() {
        this.f32028a.m14445r3(4, false);
        this.f32028a.m14464m3(32, false);
        m6937P();
    }

    public final void m6955G0() {
        if (m6940N0()) {
            this.f32039i0.m2413i5().m4028E0(this.f32014R0.f25373id, this);
            this.f32035e0.setVideoPath(this.f32014R0.local.path);
            this.f32036f0.setVideo(this.f32014R0.local.path);
            if (this.f32022V0) {
                this.f32022V0 = false;
                TdApi.MessageSendOptions messageSendOptions = this.f32024W0;
                this.f32024W0 = null;
                m6935Q(messageSendOptions);
            }
        }
    }

    @Override
    public void mo6954G4(boolean z) {
        C4895m.m24483a(this, z);
    }

    public final void m6952H0() {
        if (!C5070i.m24061i(this.f32008O0)) {
            throw new IllegalStateException();
        } else if (this.f31994D0 != null) {
            this.f32008O0 = "round" + SystemClock.uptimeMillis() + "_" + System.currentTimeMillis() + "_" + Math.random();
            this.f32039i0.m2270r4().m14783o(new TdApi.UploadFile(new TdApi.InputFileGenerated(null, this.f32008O0, 0), C7316a.m17051j(this.f31997G0) ? new TdApi.FileTypeSecret() : new TdApi.FileTypeVideoNote(), 1), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    C9789y.this.m6885k0(object);
                }
            });
            m6887j1(true);
            this.f31994D0.m29198ag();
            this.f31994D0.m29188fg(this.f32028a.m14552P1().m9763F());
            this.f31994D0.mo9477Ac();
            this.f31994D0.m29168pg(this.f32026Y, 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public void m6951I(AbstractC9804o oVar) {
        C6235i.m21015a(this.f32050t0, oVar);
    }

    public View m6950I0() {
        if (this.f32030b == null) {
            C9795f fVar = new C9795f(this.f32028a);
            this.f32030b = fVar;
            fVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            C9805z zVar = new C9805z(this.f32028a);
            this.f32032c = zVar;
            zVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f32030b.addView(this.f32032c);
            C9796g gVar = new C9796g(this.f32028a);
            this.f32019U = gVar;
            gVar.setLayoutParams(FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(49.0f), 80));
            this.f32030b.addView(this.f32019U);
            C9797h hVar = new C9797h(this.f32028a);
            this.f32021V = hVar;
            hVar.setText(C4403w.m27869i1(R.string.slideToCancel));
            this.f32021V.setTypeface(C1389o.m37258k());
            this.f32021V.setTextSize(1, 15.0f);
            this.f32021V.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 17));
            this.f32019U.addView(this.f32021V);
            C9798i iVar = new C9798i(this.f32028a);
            this.f32025X = iVar;
            iVar.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(12.0f), C1357a0.m37541i(16.0f), 17));
            this.f32019U.addView(this.f32025X);
            C9799j jVar = new C9799j(this.f32028a);
            this.f32023W = jVar;
            jVar.setGravity(17);
            this.f32023W.setText(C4403w.m27869i1(R.string.Cancel).toUpperCase());
            this.f32023W.setPadding(C1357a0.m37541i(12.0f), 0, C1357a0.m37541i(12.0f), 0);
            this.f32023W.setTextSize(1, 16.0f);
            this.f32023W.setTypeface(C1389o.m37260i());
            this.f32023W.setAlpha(0.0f);
            this.f32023W.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C9789y.this.m6882l0(view);
                }
            });
            this.f32023W.setLayoutParams(FrameLayoutFix.m18007t1(-2, -1, 17));
            this.f32019U.addView(this.f32023W);
            C6879f3 f3Var = new C6879f3(this.f32028a);
            this.f32003M = f3Var;
            f3Var.setSimpleTopShadow(true);
            C6879f3 f3Var2 = this.f32003M;
            f3Var2.setLayoutParams(C1399s0.m37207N(f3Var2, 80));
            this.f32030b.addView(this.f32003M);
            C6879f3 f3Var3 = new C6879f3(this.f32028a);
            this.f32005N = f3Var3;
            f3Var3.setSimpleBottomTransparentShadow(true);
            C6879f3 f3Var4 = this.f32005N;
            f3Var4.setLayoutParams(C1399s0.m37207N(f3Var4, 80));
            this.f32030b.addView(this.f32005N);
            C9733d0 d0Var = new C9733d0(this.f32028a);
            this.f32017T = d0Var;
            d0Var.setTimerCallback(new C9733d0.AbstractC9735b() {
                @Override
                public final void mo7204a() {
                    C9789y.this.m6879m0();
                }
            });
            C9733d0 d0Var2 = this.f32017T;
            d0Var2.setLayoutParams(C1399s0.m37207N(d0Var2, 83));
            this.f32030b.addView(this.f32017T);
            C9722a0 a0Var = new C9722a0(this.f32028a);
            this.f32007O = a0Var;
            a0Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C9789y.this.m6876n0(view);
                }
            });
            this.f32030b.addView(this.f32007O);
            C9800k kVar = new C9800k(this.f32028a);
            this.f32013R = kVar;
            kVar.setCameraIconRes(!C4868i.m24726c2().m24781U5());
            this.f32013R.m29262f();
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(this.f32028a);
            this.f32015S = frameLayoutFix;
            C1399s0.m37193a0(frameLayoutFix);
            C10189d.m5801c(this.f32015S, 33.0f, 3.0f, R.id.theme_color_filling);
            this.f32015S.setLayoutParams(FrameLayoutFix.m18008s1(C1357a0.m37541i(33.0f) + (C1357a0.m37541i(3.0f) * 2), C1357a0.m37541i(33.0f) + (C1357a0.m37541i(3.0f) * 2)));
            this.f32015S.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C9789y.this.m6873o0(view);
                }
            });
            this.f32015S.addView(this.f32013R);
            this.f32030b.addView(this.f32015S);
            C9739e0 e0Var = new C9739e0(this.f32028a);
            this.f32011Q = e0Var;
            C1399s0.m37163p0(e0Var);
            this.f32030b.addView(this.f32011Q);
            this.f32011Q.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C9789y.this.m6869p0(view);
                }
            });
            C9801l lVar = new C9801l(this.f32028a);
            this.f32009P = lVar;
            lVar.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(50.0f), C1357a0.m37541i(49.0f), 85));
            C10192g.m5783h(this.f32009P, this.f32007O, true);
            this.f32030b.addView(this.f32009P);
            C9802m mVar = new C9802m(this.f32028a);
            this.f32026Y = mVar;
            mVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    C9789y.this.m6864r0(view);
                }
            });
            this.f32026Y.setTransparentOutline(false);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f32026Y.setTranslationZ(C1357a0.m37541i(1.5f));
                this.f32026Y.setElevation(C1357a0.m37541i(1.0f));
            }
            this.f32026Y.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(200.0f), C1357a0.m37541i(200.0f), 1));
            this.f32030b.addView(this.f32026Y);
            View view = new View(this.f32028a);
            this.f32027Z = view;
            view.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f32026Y.addView(this.f32027Z);
            C9742f0 f0Var = new C9742f0(this.f32028a);
            this.f32029a0 = f0Var;
            f0Var.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f32026Y.addView(this.f32029a0);
            C9803n nVar = new C9803n(this.f32028a);
            this.f32031b0 = nVar;
            nVar.setScaleType(ImageView.ScaleType.CENTER);
            this.f32031b0.setImageResource(R.drawable.baseline_delete_24);
            C1399s0.m37193a0(this.f32031b0);
            this.f32031b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    C9789y.this.m6861s0(view2);
                }
            });
            this.f32031b0.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), -1, 3));
            this.f32019U.addView(this.f32031b0);
            C9790a aVar = new C9790a(this.f32028a);
            this.f32033c0 = aVar;
            aVar.setScaleType(ImageView.ScaleType.CENTER);
            this.f32033c0.setImageResource(R.drawable.deproko_baseline_send_24);
            C1399s0.m37193a0(this.f32033c0);
            this.f32033c0.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    C9789y.this.m6858t0(view2);
                }
            });
            this.f32033c0.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(55.0f), -1, 5));
            this.f32019U.addView(this.f32033c0);
            C9791b bVar = new C9791b(this.f32028a);
            this.f32035e0 = bVar;
            bVar.setDelegate(new C9792c());
            this.f32035e0.setPadding(C1357a0.m37541i(14.0f), C1357a0.m37541i(5.0f), C1357a0.m37541i(14.0f), C1357a0.m37541i(5.0f));
            FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -1);
            int i = C1357a0.m37541i(56.0f) - C1357a0.m37541i(14.0f);
            s1.rightMargin = i;
            s1.leftMargin = i;
            this.f32035e0.setLayoutParams(s1);
            this.f32019U.addView(this.f32035e0);
            C6899h3 h3Var = new C6899h3(this.f32028a);
            this.f32036f0 = h3Var;
            h3Var.setMuted(true);
            this.f32036f0.setPlaying(true);
            this.f32036f0.setLooping(true);
            this.f32036f0.setDelegate(new C9793d());
            this.f32036f0.setAlpha(0.0f);
            this.f32036f0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            this.f32026Y.addView(this.f32036f0);
            C9794e eVar = new C9794e(this.f32028a);
            this.f32037g0 = eVar;
            eVar.setScaleType(ImageView.ScaleType.CENTER);
            this.f32037g0.setImageResource(R.drawable.deproko_baseline_sound_muted_24);
            this.f32037g0.setColorFilter(-1);
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1((C1357a0.m37541i(12.0f) * 2) + C1357a0.m37541i(2.0f), (C1357a0.m37541i(12.0f) * 2) + C1357a0.m37541i(2.0f), 81);
            t1.bottomMargin = C1357a0.m37541i(8.0f);
            this.f32037g0.setLayoutParams(t1);
            this.f32026Y.addView(this.f32037g0);
            m6860s1();
            m6923V0(0.0f);
        }
        return this.f32030b;
    }

    public final void m6949J() {
        this.f32039i0.m2413i5().m4036A0(this.f32014R0.f25373id, this);
    }

    public void m6948J0(AbstractC9804o oVar) {
        C6235i.m21011e(this.f32050t0, oVar);
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        C11525k.m138c(this, i, i2, f, z);
    }

    public final boolean m6947K() {
        return this.f32006N0 != 0;
    }

    public final void m6946K0() {
        if (this.f32014R0 != null) {
            this.f32039i0.m2413i5().m4028E0(this.f32014R0.f25373id, this);
            this.f32014R0 = null;
        }
        this.f32012Q0 = null;
        this.f32010P0 = 0L;
        this.f32008O0 = null;
        this.f32020U0 = false;
    }

    public final boolean m6945L() {
        if (this.f32049s0 != 0) {
            if (SystemClock.uptimeMillis() - this.f32049s0 >= (this.f32053w0 ? 1000L : 500L)) {
                return true;
            }
        }
        return false;
    }

    public final void m6944L0() {
        m6941N(0);
    }

    public final void m6943M() {
        if (this.f32051u0 == 3) {
            this.f32006N0 = 0;
            m6920X0(0, true);
            m6937P();
        }
    }

    public final void m6942M0() {
        m6892h1(0.0f, 0.0f);
        this.f32013R.setCameraIconRes(!C4868i.m24726c2().m24781U5());
        this.f32029a0.m7296f(0.0f);
        this.f32017T.m7325k();
        this.f32011Q.setCollapseFactor(0.0f);
        this.f32007O.m7420d(0.0f, false);
        this.f32055y0.m29575p(false, false);
        this.f32036f0.mo4501a3();
        this.f32035e0.mo4501a3();
        this.f32036f0.setMuted(true);
        this.f32036f0.setPlaying(true);
        m6914a1(false, false);
        m6944L0();
    }

    public final void m6941N(int i) {
        int i2 = this.f32051u0;
        boolean z = (i2 == 0 || i2 == 3 || !this.f32002L0) ? false : true;
        boolean z2 = this.f32004M0 != 0;
        if (!z2 && z) {
            if (i2 == 1) {
                z = m6915a0();
            } else if (i2 == 2) {
                z = m6899f0();
            }
        }
        if (z2 == z) {
            return;
        }
        if (z) {
            m6881l1(this.f32051u0);
            return;
        }
        if (!m6918Z()) {
            i = 0;
        }
        m6868p1(i);
    }

    public final boolean m6940N0() {
        return this.f32020U0 && C4779t2.m25598T2(this.f32014R0);
    }

    public final void m6939O() {
        boolean z = this.f32046p0;
        if (this.f32047q0 != z) {
            this.f32047q0 = z;
            this.f32048r0.m29575p(z, Math.max(Math.abs(m6922W()), Math.abs(m6921X())) > 0.0f);
        }
    }

    @Override
    public void mo6938O0(int i, boolean z) {
    }

    public final void m6937P() {
        if (this.f32053w0 && Math.max(this.f32000J0, this.f32054x0) * (1.0f - this.f32056z0) == 0.0f && this.f31994D0 != null && !m6947K()) {
            this.f31994D0.mo9216lc();
            this.f31994D0.m29223Of();
            m6887j1(false);
            this.f32028a.m14450q2();
            this.f31994D0 = null;
            m6946K0();
        }
    }

    public final void m6936P0(boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        if (this.f32051u0 == 3) {
            m6935Q(new TdApi.MessageSendOptions(z, false, false, messageSchedulingState));
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            m6923V0(f);
        } else if (i == 1) {
            m6890i1(f);
        } else if (i == 2) {
            m6917Z0(f);
        } else if (i == 4) {
            m6930S0(f);
        } else if (i == 5) {
            m6911b1(f);
        } else if (i == 6) {
            m6927T0(f);
        }
    }

    public final void m6935Q(TdApi.MessageSendOptions messageSendOptions) {
        View$OnClickListenerC2971rh rhVar;
        if (this.f32051u0 == 3) {
            if (!m6940N0()) {
                this.f32022V0 = true;
                this.f32024W0 = messageSendOptions;
            } else if (messageSendOptions == null || messageSendOptions.schedulingState != null || (rhVar = this.f31999I0) == null || !rhVar.m32216ui()) {
                this.f32051u0 = 0;
                if (messageSendOptions == null) {
                    this.f32039i0.m2270r4().m14783o(new TdApi.DeleteFile(this.f32014R0.f25373id), this.f32039i0.m2214uc());
                    this.f32006N0 = 0;
                } else if (this.f32036f0.m18522i()) {
                    this.f32039i0.m2270r4().m14783o(new TdApi.CancelUploadFile(this.f32014R0.f25373id), this.f32039i0.m2392ja());
                    double startTime = this.f32036f0.getStartTime();
                    double endTime = this.f32036f0.getEndTime();
                    m6934Q0(new TdApi.InputMessageVideoNote(new TdApi.InputFileGenerated(this.f32014R0.local.path, C5349g0.m23160s(this.f32014R0.f25373id, false, 0, (long) (startTime * 1000000.0d), (long) (1000000.0d * endTime), true, 0L), 0), null, (int) Math.round(endTime - startTime), 360), messageSendOptions, null);
                } else {
                    m6934Q0(new TdApi.InputMessageVideoNote(new TdApi.InputFileId(this.f32014R0.f25373id), null, this.f32018T0, 360), messageSendOptions, this.f32014R0);
                }
                this.f32036f0.setPlaying(false);
                this.f32055y0.m29575p(false, true);
            } else {
                this.f31999I0.m32665Lo(messageSendOptions.disableNotification, messageSendOptions.schedulingState, new HandlerC10770jj.AbstractC10786o() {
                    @Override
                    public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                        C9789y.this.m6896g0(z, messageSchedulingState, z2);
                    }
                });
            }
        }
    }

    public final void m6934Q0(final TdApi.InputMessageVideoNote inputMessageVideoNote, TdApi.MessageSendOptions messageSendOptions, final TdApi.File file) {
        if (m6918Z()) {
            final boolean j = C7316a.m17051j(this.f31997G0);
            this.f31999I0.m32665Lo(messageSendOptions.disableNotification, messageSendOptions.schedulingState, new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                    C9789y.this.m6852v0(inputMessageVideoNote, j, file, z, messageSchedulingState, z2);
                }
            });
        }
        this.f32006N0 = 0;
        m6937P();
    }

    public final void m6933R(boolean z) {
        if (!C5070i.m24061i(this.f32008O0) && z) {
            if (!C5070i.m24061i(this.f32012Q0)) {
                this.f32039i0.m2270r4().m14783o(new TdApi.FinishFileGeneration(this.f32010P0, new TdApi.Error()), this.f32039i0.m2214uc());
            }
            if (this.f32014R0 != null) {
                this.f32039i0.m2270r4().m14783o(new TdApi.CancelUploadFile(this.f32014R0.f25373id), this.f32039i0.m2214uc());
            }
            m6946K0();
        }
    }

    public void m6932R0(boolean z) {
        if (this.f32046p0 != z) {
            this.f32046p0 = z;
            m6939O();
        }
    }

    public final View$OnClickListenerC2971rh m6931S() {
        AbstractC9323v4<?> t = C1379j0.m37303t(this.f32028a);
        if (t instanceof View$OnClickListenerC2971rh) {
            return (View$OnClickListenerC2971rh) t;
        }
        return null;
    }

    public final void m6930S0(float f) {
        if (this.f32054x0 != f) {
            this.f32054x0 = f;
            m6851v1();
        }
    }

    @Override
    public void mo6929S4() {
        this.f32036f0.setActivityPaused(true);
        if (!m6909c0()) {
            return;
        }
        if (this.f32051u0 == 3) {
            m6935Q(null);
        } else {
            m6872o1(0, false);
        }
    }

    public final void m6928T(int i) {
        this.f32039i0.m2270r4().m14783o(new TdApi.SetFileGenerationProgress(this.f32010P0, i, i), this.f32039i0.m2214uc());
        this.f32039i0.m2270r4().m14783o(new TdApi.FinishFileGeneration(this.f32010P0, null), this.f32039i0.m2214uc());
    }

    public final void m6927T0(float f) {
        if (this.f31992B0 != f) {
            this.f31992B0 = f;
            m6845x1();
        }
    }

    public boolean m6926U(boolean z) {
        return m6872o1(m6945L() ? z ? 2 : (!m6918Z() || !this.f31999I0.m32216ui()) ? 1 : 3 : 0, true);
    }

    public final void m6925U0(int i) {
        if (this.f32043m0 != i) {
            this.f32043m0 = i;
            m6839z1();
        }
    }

    public final void m6924V(int i) {
        boolean z = false;
        this.f32016S0 = false;
        this.f32006N0 = i;
        if (i != 0) {
            z = true;
        }
        this.f31994D0.m29167qf().m28515C0(this.f32008O0, z);
    }

    public final void m6923V0(float f) {
        if (this.f32000J0 != f) {
            this.f32000J0 = f;
            m6851v1();
            float f2 = (0.4f * f) + 0.6f;
            this.f32011Q.setScaleX(f2);
            this.f32011Q.setScaleY(f2);
            this.f32015S.setScaleX(f2);
            this.f32015S.setScaleY(f2);
            this.f32007O.setExpand(f);
            m6854u1();
            m6857t1();
            m6848w1();
        }
    }

    public final float m6922W() {
        return this.f32044n0 * (1.0f - this.f32001K0);
    }

    @Override
    public boolean mo136W0() {
        return Math.max(this.f32054x0, this.f32000J0) > 0.0f;
    }

    public final float m6921X() {
        return this.f32045o0 * this.f32001K0 * (1.0f - this.f32042l0);
    }

    public final void m6920X0(int i, boolean z) {
        boolean b0 = m6912b0(this.f32051u0);
        boolean b02 = m6912b0(i);
        boolean z2 = true;
        boolean z3 = m6902e0(this.f32051u0) || m6902e0(i);
        this.f32053w0 = z3;
        this.f32051u0 = i;
        View$OnClickListenerC2971rh rhVar = this.f31999I0;
        if (rhVar != null) {
            rhVar.m32627Op(z3 ? TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR : TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR, i != 0, false);
            this.f31999I0.m32695Jk();
        }
        this.f32052v0.m29579l(b02 ? 160L : 140L);
        if (b02) {
            m6842y1();
            m6839z1();
            this.f32052v0.m29577n(C2057b.f7280b);
        } else {
            this.f32052v0.m29577n(C2057b.f7281c);
        }
        this.f32052v0.m29575p(b02, z);
        if (b02) {
            C9540f4 f4Var = this.f32009P;
            boolean z4 = i == 2;
            if (this.f32000J0 <= 0.0f) {
                z2 = false;
            }
            f4Var.m8388k(z4, z2);
        }
        if (b0 != b02) {
            m6965B0(b02);
            if (!b02) {
                m6961D0();
            }
        }
    }

    public final float m6919Y() {
        if (this.f32049s0 != 0) {
            return (float) ((SystemClock.uptimeMillis() - this.f32049s0) / 59500.0d);
        }
        return 0.0f;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 5 && f == 1.0f) {
                        m6937P();
                    }
                } else if (f == 0.0f) {
                    m6937P();
                } else if (f == 1.0f && this.f32006N0 == 3) {
                    m6936P0(false, null);
                }
            } else if (f == 1.0f) {
                this.f32036f0.m18521j();
            }
        } else if (f == 1.0f) {
            m6959E0();
        } else if (f == 0.0f) {
            m6957F0();
        }
    }

    public final boolean m6918Z() {
        View$OnClickListenerC2971rh rhVar = this.f31999I0;
        return (rhVar == null || rhVar.m9347Sa() || !this.f31999I0.m32150zj(this.f31997G0, this.f31998H0) || this.f31997G0 == 0 || this.f32039i0 == null) ? false : true;
    }

    public final void m6917Z0(float f) {
        if (this.f32042l0 != f) {
            this.f32042l0 = f;
            this.f32009P.setSendFactor(f);
            this.f32011Q.setSendFactor(f);
            m6839z1();
        }
    }

    @Override
    public void mo6916a() {
        if (m6909c0()) {
            C1379j0.m37292y0(R.string.Error, 0);
            m6872o1(0, false);
        }
    }

    public final boolean m6915a0() {
        return !RunnableC5952j1.m21779y().m21778z();
    }

    public final void m6914a1(boolean z, boolean z2) {
        if (this.f32040j0 != z) {
            this.f32040j0 = z;
            this.f32041k0.m29575p(z, z2);
        }
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        C11525k.m139b(this, pVar, pVar2);
    }

    @Override
    public void mo6913b(String str, int i, int i2) {
        if (C5070i.m24067c(this.f32008O0, str)) {
            boolean z = i > 0;
            if (m6947K()) {
                if (z) {
                    this.f32018T0 = i2;
                    int i3 = this.f32006N0;
                    if (i3 == 2 || i3 == 3) {
                        m6949J();
                        m6928T(i);
                        return;
                    }
                    m6928T(i);
                    m6934Q0(new TdApi.InputMessageVideoNote(new TdApi.InputFileId(this.f32014R0.f25373id), null, this.f32018T0, 360), C4779t2.m25502i0(), this.f32014R0);
                    return;
                }
                m6928T(-1);
                m6943M();
            } else if (!z) {
                m6872o1(0, false);
            }
        }
    }

    public final void m6911b1(float f) {
        if (this.f32056z0 != f) {
            this.f32056z0 = f;
            this.f32036f0.setAlpha(f);
        }
    }

    @Override
    public void mo6910c(String str, int i) {
        if (C5070i.m24067c(this.f32008O0, str)) {
            this.f32039i0.m2270r4().m14783o(new TdApi.SetFileGenerationProgress(this.f32010P0, 0, i), this.f32039i0.m2214uc());
        }
    }

    public boolean m6909c0() {
        return this.f32051u0 != 0 || Math.max(this.f32000J0, this.f32054x0) > 0.0f;
    }

    public final void m6908c1(TdApi.File file) {
        this.f32014R0 = file;
        m6941N(0);
    }

    @Override
    public void mo6907d(boolean z, boolean z2) {
        this.f32013R.m29261g(z, z2);
    }

    public final boolean m6906d0() {
        return !C5070i.m24061i(this.f32008O0) && !C5070i.m24061i(this.f32012Q0) && this.f32014R0 != null;
    }

    public final void m6905d1(long j, String str) {
        this.f32010P0 = j;
        this.f32012Q0 = str;
        m6941N(0);
    }

    @Override
    public void mo6904d6() {
        this.f32036f0.setActivityPaused(true);
        if (m6909c0() && !this.f31996F0) {
            m6926U(true);
        }
    }

    @Override
    public void mo6903e(View$OnClickListenerC4045k kVar) {
        if (this.f32051u0 == 2) {
            this.f31995E0 = true;
            m6941N(0);
        }
    }

    public void m6901e1(final String str, final long j, final String str2) {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C9789y.this.m6849w0(str, j, str2);
            }
        });
    }

    @Override
    public void mo6900f(float f) {
        if (m6909c0() && this.f32004M0 != 0) {
            if (this.f32049s0 != 0) {
                this.f32007O.m7420d(f, true);
            } else {
                m6878m1(SystemClock.uptimeMillis());
            }
        }
    }

    public final boolean m6899f0() {
        return this.f31994D0 != null && this.f31995E0 && m6906d0();
    }

    public final void m6898f1(final TdApi.File file) {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C9789y.this.m6846x0(file);
            }
        });
    }

    @Override
    public void mo6897g(String str, long j) {
        if (C5070i.m24067c(this.f32008O0, str) && this.f32016S0) {
            m6878m1(j);
        }
    }

    public void m6895g1(C10930q6 q6Var) {
        this.f32039i0 = q6Var;
    }

    @Override
    public void mo6894h(final C10930q6.C10942l lVar, final int i, final byte[] bArr) {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                C9789y.this.m6891i0(lVar, i, bArr);
            }
        });
    }

    public boolean m6892h1(float f, float f2) {
        float W = m6922W();
        float X = m6921X();
        this.f32044n0 = f;
        this.f32045o0 = f2;
        if (!(W == m6922W() && X == m6921X())) {
            m6839z1();
        }
        return !this.f32040j0 && m6909c0();
    }

    @Override
    public void mo3952i(final TdApi.File file) {
        if (!C5070i.m24061i(file.local.path) && file.size != 0 && file.local.isDownloadingCompleted) {
            this.f32039i0.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C9789y.this.m6888j0(file);
                }
            });
        }
    }

    public final void m6890i1(float f) {
        if (this.f32001K0 != f) {
            this.f32001K0 = f;
            m6839z1();
        }
    }

    public final void m6887j1(boolean z) {
        this.f31994D0.m29165rf().m29074g0(!C4868i.m24726c2().m24781U5() && z);
        this.f31994D0.m29165rf().m29080d0(z ? C4868i.m24726c2().m24861J2() ? f31989X0 : 280 : 0);
        this.f31994D0.m29167qf().m29078e0(false);
        this.f31994D0.m29167qf().m28499S0(z);
        this.f31994D0.m29167qf().m29059v().setIgnoreAspectRatio(z);
        this.f31994D0.m29171of().setDisallowRatioChanges(z);
        this.f31994D0.m29180jg(z);
    }

    public boolean m6884k1(View view, boolean z) {
        if (this.f32051u0 != 0 || this.f32039i0.m2930B4().m4713c0().m4537z0()) {
            return false;
        }
        boolean z2 = !z && this.f32038h0;
        if (m6968A0(z2, !z)) {
            return false;
        }
        View$OnClickListenerC2971rh S = m6931S();
        this.f31999I0 = S;
        if (S == null) {
            return false;
        }
        this.f31997G0 = S.mo9464C9();
        this.f31998H0 = this.f31999I0.m32266qk();
        if (!z2 || this.f32039i0.m2755M3(this.f31997G0)) {
            C10930q6 q6Var = this.f32039i0;
            CharSequence V5 = q6Var.m2614V5(q6Var.m2632U2(this.f31997G0), R.id.right_sendMedia, z2 ? R.string.ChatDisabledVideoNotes : R.string.ChatDisabledVoice, z2 ? R.string.ChatRestrictedVideoNotes : R.string.ChatRestrictedVoice, z2 ? R.string.ChatRestrictedVideoNotesUntil : R.string.ChatRestrictedVoiceUntil);
            if (V5 != null) {
                if (view != null) {
                    this.f32028a.m14584H3().m8985g(view).m8958i(this.f31999I0).m8951q(R.drawable.baseline_warning_24).m8971D(this.f32039i0, V5).m8919F();
                } else {
                    C1379j0.m37290z0(V5, 0);
                }
                return false;
            } else if (m6947K()) {
                return false;
            } else {
                C3940f fVar = this.f32052v0;
                if ((fVar != null && fVar.m29582i()) || C1379j0.m37307r(this.f32028a).m14451q1()) {
                    return false;
                }
                C1379j0.m37307r(this.f32028a).m14455p0(true);
                if (z2) {
                    if (this.f31994D0 == null) {
                        this.f31995E0 = false;
                        View$OnClickListenerC4045k G3 = this.f32028a.m14589G3(new AbstractC9323v4.C9334k().m9107d(1).m9101j(this));
                        this.f31994D0 = G3;
                        if (G3 == null) {
                            return false;
                        }
                        m6952H0();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                View$OnTouchListenerC5103c0 c0Var = this.f32034d0;
                if (c0Var != null) {
                    c0Var.m23955e(this.f32033c0);
                }
                this.f32034d0 = this.f32039i0.m2485dd().m3763O2(this.f31999I0, this.f31997G0, new AbstractC5914f() {
                    @Override
                    public final boolean get() {
                        boolean z0;
                        z0 = C9789y.this.m6840z0();
                        return z0;
                    }
                }, null, null, new HandlerC10770jj.AbstractC10786o() {
                    @Override
                    public final void mo3333a(boolean z3, TdApi.MessageSchedulingState messageSchedulingState, boolean z4) {
                        C9789y.this.m6843y0(z3, messageSchedulingState, z4);
                    }
                }, null).m23956d(this.f32033c0);
                if (!z) {
                    this.f32028a.m14445r3(4, true);
                }
                this.f32028a.m14464m3(32, true);
                m6942M0();
                this.f31996F0 = z;
                m6914a1(z, false);
                if (z) {
                    this.f32011Q.setCollapseFactor(1.0f);
                }
                m6920X0(z2 ? 2 : 1, !z);
                return true;
            }
        } else {
            TdApi.User a4 = this.f32039i0.m2541a4(this.f31997G0);
            C1379j0.m37290z0(C4403w.m27865j1(R.string.SecretChatFeatureUnsupported, a4 != null ? a4.firstName : this.f32039i0.m2691Q3(this.f31997G0)), 0);
            return false;
        }
    }

    public final void m6881l1(int i) {
        this.f32004M0 = i;
        if (i != 1) {
            if (i == 2) {
                m6875n1();
            }
        } else if (this.f32039i0 != null) {
            RunnableC5952j1.m21779y().m21810N(this.f32039i0, C7316a.m17051j(this.f31997G0), this);
        }
    }

    public final void m6878m1(long j) {
        this.f32049s0 = j;
        this.f32017T.m7323m(j);
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        m6860s1();
    }

    public final void m6875n1() {
        this.f32016S0 = true;
        this.f31994D0.m29167qf().m28504N0(this.f32008O0, this, this.f32012Q0);
    }

    public final boolean m6872o1(int i, boolean z) {
        int i2;
        int i3 = this.f32051u0;
        boolean z2 = false;
        if (i3 == 0 || i3 == 3) {
            return false;
        }
        if (i == 0) {
            C1379j0.m37319l(this.f32009P, true, true);
            if (z) {
                C4868i.m24726c2().m24709e3();
            }
        }
        if ((i == 2 || i == 3) && this.f32053w0) {
            this.f32055y0.m29575p(true, false);
            i2 = 3;
        } else {
            i2 = 0;
        }
        if (this.f32053w0 && (i == 2 || i == 3)) {
            View$OnClickListenerC4045k kVar = this.f31994D0;
            if (kVar != null) {
                kVar.m29167qf().m29078e0(true);
            } else {
                Log.m14711w((int) Log.TAG_ROUND, "ownedCamera.setNoPreviewBlur() failed: null", new Object[0]);
            }
        }
        m6920X0(i2, true);
        if (this.f32053w0) {
            if (i == 0) {
                z2 = true;
            }
            m6933R(z2);
        }
        m6941N(i);
        return true;
    }

    @Override
    public void mo6871o6() {
        this.f32036f0.setActivityPaused(false);
    }

    public final void m6868p1(int i) {
        boolean z = i != 0 && m6918Z();
        int i2 = this.f32004M0;
        if (i2 != 1) {
            if (i2 == 2) {
                m6924V(i);
            }
        } else if (z) {
            if (i == 2 || i == 3) {
                this.f31999I0.m32640No((int) ((SystemClock.uptimeMillis() - this.f32049s0) / 1000));
            }
            RunnableC5952j1.m21779y().m21809O();
        } else {
            RunnableC5952j1.m21779y().m21788p();
        }
        this.f32004M0 = 0;
        m6866q1();
    }

    @Override
    public void mo133q0(int i) {
        C11525k.m140a(this, i);
    }

    public final void m6866q1() {
        this.f32049s0 = 0L;
        this.f32017T.m7322n();
    }

    @Override
    public void mo6863r1(boolean z) {
        this.f32038h0 = z;
    }

    public final void m6860s1() {
        if (this.f32030b != null) {
            this.f32019U.setBackgroundColor(C11524j.m148w());
            this.f32021V.setTextColor(C11524j.m213U0());
            this.f32023W.setTextColor(C11524j.m228N(R.id.theme_color_textNeutral));
            this.f32027Z.setBackgroundColor(C11524j.m148w());
            this.f32031b0.setColorFilter(C11524j.m159q0());
            this.f32033c0.setColorFilter(C11524j.m175j());
            this.f32032c.setBackgroundColor(C11524j.m228N(R.id.theme_color_previewBackground));
            this.f32025X.invalidate();
            this.f32013R.invalidate();
            this.f32015S.invalidate();
            this.f32035e0.invalidate();
            this.f32017T.invalidate();
            this.f32011Q.invalidate();
            this.f32005N.invalidate();
            this.f32003M.invalidate();
        }
    }

    public final void m6857t1() {
        float d = C5069h.m24089d(this.f32000J0);
        float measuredHeight = this.f32054x0 * (1.0f - this.f32000J0) * (this.f32019U.getMeasuredHeight() / 2);
        this.f32017T.setAlpha(d);
        this.f32017T.setTranslationY(this.f32043m0 + measuredHeight);
    }

    public final void m6854u1() {
        float top = (((((this.f32009P.getTop() + this.f32009P.getTranslationY()) + (this.f32009P.getMeasuredHeight() / 2)) - this.f32011Q.getMeasuredHeight()) - C1357a0.m37541i(11.0f)) - C1357a0.m37541i(41.0f)) + (C1357a0.m37541i(24.0f) * this.f32042l0) + (C1357a0.m37541i(24.0f) * (1.0f - C5069h.m24089d(this.f32000J0)));
        this.f32011Q.setTranslationY(top);
        this.f32015S.setTranslationY(((top - C1357a0.m37541i(16.0f)) - this.f32015S.getMeasuredHeight()) + (C1357a0.m37541i(24.0f) * (1.0f - C5069h.m24089d(this.f32000J0)) * (1.0f - this.f32042l0)));
    }

    public final void m6851v1() {
        float d = C5069h.m24089d(this.f32000J0);
        float max = Math.max(d, this.f32054x0);
        this.f32009P.setAlpha(d);
        this.f32019U.setAlpha(max);
        this.f32011Q.setAlpha(d);
        if (!this.f32053w0) {
            max = 0.0f;
        }
        this.f32032c.setFactor(max);
        this.f32003M.setAlpha(max);
        this.f32005N.setAlpha(max);
        this.f32026Y.setAlpha(max);
        this.f32029a0.setAlpha(Math.max(this.f32000J0, 1.0f - this.f32054x0));
        float f = (max * 0.6f) + 0.4f;
        this.f32026Y.setScaleX(f);
        this.f32026Y.setScaleY(f);
        FrameLayoutFix frameLayoutFix = this.f32015S;
        if (!this.f32053w0) {
            d = 0.0f;
        }
        frameLayoutFix.setAlpha(d);
        m6845x1();
        m6967A1();
    }

    public final void m6848w1() {
        float d = (1.0f - this.f32042l0) * (1.0f - C5069h.m24089d((-Math.max(-C1357a0.m37541i(50.0f), m6922W())) / C1357a0.m37541i(50.0f)));
        this.f32021V.setAlpha(d);
        this.f32025X.setAlpha(d);
        float f = this.f32054x0 * (1.0f - this.f32000J0);
        this.f32023W.setAlpha(this.f32042l0 * (1.0f - f));
        float measuredHeight = this.f32019U.getMeasuredHeight() / 2;
        float f2 = f * measuredHeight;
        float f3 = -measuredHeight;
        this.f32023W.setTranslationY(((1.0f - this.f32042l0) * f3) + f2);
        this.f32021V.setTranslationY(this.f32042l0 * measuredHeight);
        this.f32025X.setTranslationY(measuredHeight * this.f32042l0);
        float f4 = f3 + f2;
        this.f32033c0.setAlpha(this.f32054x0);
        this.f32031b0.setAlpha(f);
        this.f32031b0.setTranslationY(f4);
        this.f32035e0.setAlpha(f);
        this.f32035e0.setTranslationY(f4);
    }

    public final void m6845x1() {
        float f = this.f32054x0 * (1.0f - this.f32000J0) * this.f31992B0;
        this.f32037g0.setAlpha(f);
        float f2 = (f * 0.4f) + 0.6f;
        this.f32037g0.setScaleX(f2);
        this.f32037g0.setScaleY(f2);
    }

    public void m6842y1() {
        AbstractC9323v4<?> t = C1379j0.m37303t(this.f32028a);
        if (t instanceof View$OnClickListenerC2971rh) {
            m6925U0((C1399s0.m37154u(((View$OnClickListenerC2971rh) t).m32554Uj())[1] - C1399s0.m37154u(this.f32030b)[1]) - this.f32009P.getTop());
        }
    }

    public final void m6839z1() {
        C6879f3 f3Var;
        C9722a0 a0Var;
        C9722a0 a0Var2;
        C9739e0 e0Var;
        FrameLayoutFix frameLayoutFix;
        float X = m6921X();
        int i = (-C1357a0.m37541i(33.0f)) * 2;
        if (!this.f32040j0) {
            float f = i;
            float f2 = X <= f ? 1.0f : X / f;
            this.f32011Q.setCollapseFactor(f2);
            if (f2 == 1.0f) {
                m6914a1(true, true);
            }
        }
        float max = Math.max(-C1357a0.m37541i(50.0f), m6922W());
        float d = C5069h.m24089d((-max) / C1357a0.m37541i(50.0f));
        float measuredWidth = (((-this.f32021V.getMeasuredWidth()) / 2) + max) - this.f32025X.getMeasuredWidth();
        this.f32021V.setTranslationX(max);
        this.f32025X.setTranslationX(measuredWidth);
        m6848w1();
        C9733d0 d0Var = this.f32017T;
        d0Var.setTranslationX(Math.min(0.0f, (measuredWidth + this.f32025X.getLeft()) - d0Var.getMeasuredWidth()));
        m6967A1();
        m6857t1();
        this.f32019U.setTranslationY(this.f32043m0);
        this.f32003M.setTranslationY(this.f32043m0 - this.f32019U.getMeasuredHeight());
        this.f32005N.setTranslationY(this.f32043m0 + f3Var.getMeasuredHeight());
        this.f32009P.setTranslationY(this.f32043m0 + X);
        float top = this.f32009P.getTop() + this.f32009P.getTranslationY();
        float left = this.f32009P.getLeft() + this.f32009P.getTranslationX() + (this.f32009P.getMeasuredWidth() / 2);
        float measuredHeight = top + (this.f32009P.getMeasuredHeight() / 2);
        this.f32032c.m6830a((int) left, (int) measuredHeight);
        this.f32007O.setTranslationX(left - (a0Var.getMeasuredWidth() / 2));
        this.f32007O.setTranslationY(measuredHeight - (a0Var2.getMeasuredHeight() / 2));
        this.f32011Q.setTranslationX(left - (e0Var.getMeasuredWidth() / 2));
        this.f32015S.setTranslationX(left - (frameLayoutFix.getMeasuredWidth() / 2));
        m6854u1();
        if (d * this.f32000J0 == 1.0f) {
            m6872o1(0, false);
        }
    }
}
