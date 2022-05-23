package vd;

import ae.p;
import ae.z;
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
import ce.a0;
import ce.j0;
import ce.p0;
import de.rh;
import eb.k;
import ee.k;
import gd.w;
import hd.l6;
import hd.t2;
import he.i;
import ie.c0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import jd.g0;
import kd.j1;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.d0;
import ne.f3;
import ne.f4;
import ne.g4;
import ne.h3;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import ud.v4;
import vc.e4;
import vd.c0;
import vd.k0;
import zd.h9;
import zd.hj;
import zd.o6;

public class y implements i.u, k.b, j1.b, k.g, k0.b, h9.d, a.h, ae.l {
    public static final int X0 = 480;
    public static final String[] Y0 = {"android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public final eb.f A0;
    public final eb.f C0;
    public ee.k D0;
    public boolean E0;
    public boolean F0;
    public long G0;
    public long H0;
    public rh I0;
    public boolean L0;
    public f3 M;
    public int M0;
    public f3 N;
    public int N0;
    public a0 O;
    public String O0;
    public e4 P;
    public long P0;
    public d0 Q;
    public String Q0;
    public ee.d R;
    public TdApi.File R0;
    public FrameLayoutFix S;
    public boolean S0;
    public c0 T;
    public int T0;
    public FrameLayoutFix U;
    public boolean U0;
    public TextView V;
    public boolean V0;
    public TextView W;
    public TdApi.MessageSendOptions W0;
    public View X;
    public d0 Y;
    public View Z;
    public final org.thunderdog.challegram.a f25633a;
    public e0 f25634a0;
    public FrameLayoutFix f25635b;
    public ImageView f25636b0;
    public z f25637c;
    public ImageView f25638c0;
    public c0 f25639d0;
    public f4 f25640e0;
    public h3 f25641f0;
    public ImageView f25642g0;
    public o6 f25644i0;
    public boolean f25645j0;
    public eb.f f25646k0;
    public float f25647l0;
    public int f25648m0;
    public float f25649n0;
    public float f25650o0;
    public boolean f25651p0;
    public boolean f25652q0;
    public eb.f f25653r0;
    public long f25654s0;
    public int f25656u0;
    public final eb.f f25657v0;
    public boolean f25658w0;
    public float f25659x0;
    public final eb.f f25660y0;
    public float f25661z0;
    public final List<Reference<o>> f25655t0 = new ArrayList();
    public float B0 = 1.0f;
    public float J0 = -1.0f;
    public float K0 = 0.0f;
    public boolean f25643h0 = he.i.c2().o3();

    public class a extends ImageView {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return y.this.f25659x0 > 0.0f && p0.z(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class b extends f4 {
        public b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return y.this.f25659x0 > 0.0f && p0.z(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class c implements f4.c {
        public c() {
        }

        @Override
        public void a(f4 f4Var, double d10, double d11, double d12) {
            y.this.f25641f0.G(d10, d11, d12);
        }

        @Override
        public void b(f4 f4Var, float f10) {
            y.this.f25641f0.F(f10);
        }

        @Override
        public boolean c(f4 f4Var) {
            return y.this.f25641f0 != null && y.this.f25641f0.A();
        }

        @Override
        public void d(f4 f4Var, boolean z10) {
            y.this.f25641f0.setPlaying(!z10);
        }

        @Override
        public void e(f4 f4Var, double d10, double d11, double d12, int i10, long j10) {
            g4.a(this, f4Var, d10, d11, d12, i10, j10);
        }
    }

    public class d implements h3.a {
        public d() {
        }

        @Override
        public void a(boolean z10) {
            y.this.A0.p(z10, z10);
        }

        @Override
        public void b(boolean z10) {
            y.this.C0.p(z10, y.this.f25659x0 > 0.0f);
        }
    }

    public class e extends ImageView {
        public e(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, a0.i(12.0f), ce.y.g(Log.TAG_TDLIB_OPTIONS));
            super.onDraw(canvas);
        }
    }

    public class f extends FrameLayoutFix {
        public f(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return Math.max(y.this.J0, y.this.f25659x0) == 0.0f;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return Math.max(y.this.J0, y.this.f25659x0) != 0.0f && super.onTouchEvent(motionEvent);
        }
    }

    public class g extends FrameLayoutFix {
        public g(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return p0.z(this);
        }
    }

    public class h extends b2 {
        public int f25667a;

        public h(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredWidth = getMeasuredWidth();
            if (this.f25667a != measuredWidth) {
                this.f25667a = measuredWidth;
                y.this.y1();
            }
        }
    }

    public class i extends View {
        public i(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            ce.b.k(canvas, 0.0f, getMeasuredHeight() / 2, ae.j.R0(), 3);
        }
    }

    public class j extends b2 {
        public j(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return p0.J(this, motionEvent) && super.onTouchEvent(motionEvent);
        }
    }

    public class k extends ee.d {
        public k(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return p0.z(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class l extends e4 {
        public l(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            y.this.y1();
            y.this.x1();
        }
    }

    public class m extends d0 {
        public m(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return p0.z(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class n extends ImageView {
        public n(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return y.this.f25659x0 > 0.0f && p0.z(this) && super.onTouchEvent(motionEvent);
        }
    }

    public interface o {
        void d1(boolean z10);
    }

    public y(org.thunderdog.challegram.a aVar) {
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.f25646k0 = new eb.f(2, this, decelerateInterpolator, 180L);
        this.f25653r0 = new eb.f(1, this, decelerateInterpolator, 180L);
        this.f25657v0 = new eb.f(0, this, decelerateInterpolator, 160L);
        this.f25660y0 = new eb.f(4, this, decelerateInterpolator, 180L);
        this.A0 = new eb.f(5, this, decelerateInterpolator, 180L);
        this.C0 = new eb.f(6, this, decelerateInterpolator, 180L, true);
        this.f25633a = aVar;
        aVar.Q(this);
        he.i.c2().t(this);
        j1.y();
        z.u().e(this);
    }

    public static boolean b0(int i10) {
        return (i10 == 0 || i10 == 3) ? false : true;
    }

    public static boolean e0(int i10) {
        return i10 == 2 || i10 == 3;
    }

    public void g0(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        Q(new TdApi.MessageSendOptions(z10, false, false, messageSchedulingState));
    }

    public void h0(DialogInterface dialogInterface, int i10) {
        Q(null);
    }

    public void i0(o6.l lVar, int i10, byte[] bArr) {
        if (Z()) {
            this.I0.yq(new l6(this.f25644i0, lVar, i10, bArr));
        }
    }

    public void j0(TdApi.File file) {
        TdApi.File file2 = this.R0;
        if (file2 != null && file2.f19913id == file.f19913id) {
            this.R0 = file;
            this.U0 = true;
            G0();
        }
    }

    public void k0(TdApi.Object object) {
        if (object.getConstructor() == 766337656) {
            e1((TdApi.File) object);
        } else {
            j0.t0(object);
        }
    }

    public void l0(View view) {
        if (this.f25645j0) {
            n1(0, false);
        }
    }

    public void m0() {
        float Y = this.f25658w0 ? Y() : 0.0f;
        this.f25634a0.f(ib.h.d(Y));
        if (Y >= 1.0f) {
            U(true);
        }
    }

    public void n0(View view) {
        if (c0() && this.f25645j0) {
            U(false);
        }
    }

    public void o0(View view) {
        ee.k kVar = this.D0;
        if (kVar != null) {
            kVar.og();
        }
    }

    public void p0(View view) {
        if (this.f25645j0) {
            U(true);
        }
    }

    public void r0(View view) {
        if (this.f25656u0 == 3) {
            this.f25641f0.J();
        }
    }

    public void s0(View view) {
        if (this.f25656u0 == 3) {
            Q(null);
        }
    }

    public void t0(View view) {
        O0(false, null);
    }

    public void u0(long j10, long j11, long j12, TdApi.MessageSendOptions messageSendOptions, TdApi.InputMessageVideoNote inputMessageVideoNote, boolean z10, TdApi.InputMessageVideoNote inputMessageVideoNote2, TdApi.Object object) {
        this.f25644i0.wb(j10, j11, j12, messageSendOptions, object.getConstructor() == 766337656 ? this.f25644i0.l5().C(inputMessageVideoNote, z10, (TdApi.File) object) : inputMessageVideoNote2, null);
    }

    public void v0(final TdApi.InputMessageVideoNote inputMessageVideoNote, final boolean z10, TdApi.File file, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        final TdApi.InputMessageVideoNote inputMessageVideoNote2 = (TdApi.InputMessageVideoNote) this.f25644i0.l5().C(inputMessageVideoNote, z10, file);
        final long C9 = this.I0.C9();
        final long qk = this.I0.qk();
        final long ko = this.I0.ko();
        final TdApi.MessageSendOptions messageSendOptions = new TdApi.MessageSendOptions(z11, false, false, messageSchedulingState);
        if (inputMessageVideoNote2.thumbnail != null || file == null) {
            this.f25644i0.wb(C9, qk, ko, messageSendOptions, inputMessageVideoNote2, null);
        } else {
            this.f25644i0.v4().o(new TdApi.DownloadFile(file.f19913id, 1, 0, 0, true), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    y.this.u0(C9, qk, ko, messageSendOptions, inputMessageVideoNote, z10, inputMessageVideoNote2, object);
                }
            });
        }
    }

    public void w0(String str, long j10, String str2) {
        if (ib.i.c(str, this.O0)) {
            c1(j10, str2);
        } else {
            this.f25644i0.v4().o(new TdApi.FinishFileGeneration(j10, new TdApi.Error()), this.f25644i0.yc());
        }
    }

    public void x0(TdApi.File file) {
        if (ib.i.i(this.O0) || !ib.i.c(file.local.path, this.Q0)) {
            this.f25644i0.v4().o(new TdApi.CancelUploadFile(file.f19913id), this.f25644i0.yc());
        } else {
            b1(file);
        }
    }

    public void y0(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        O0(z10, messageSchedulingState);
    }

    public boolean z0() {
        return this.f25659x0 == 1.0f;
    }

    public final boolean A0(boolean z10, boolean z11) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        String[] strArr = z10 ? ee.k.f11650s1 : Y0;
        if (!v0.Y1(strArr)) {
            return false;
        }
        if (!z11) {
            return true;
        }
        v0.x2(strArr, null);
        return true;
    }

    public final void B0(boolean z10) {
        this.f25633a.Q1().M().B(z10);
        if (z10) {
            j0.l(this.P, true, true);
            this.f25644i0.F4().w2().A0(Log.TAG_YOUTUBE);
        }
        for (int size = this.f25655t0.size() - 1; size >= 0; size--) {
            o oVar = this.f25655t0.get(size).get();
            if (oVar != null) {
                oVar.d1(z10);
            } else {
                this.f25655t0.remove(size);
            }
        }
    }

    public void C0() {
        if (this.f25656u0 == 3) {
            v4<?> t10 = j0.t(this.f25633a);
            if (t10 != null) {
                t10.Jc(R.string.DiscardVideoMessageTitle, R.string.DiscardVideoMessageDescription, w.i1(R.string.Discard), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        y.this.h0(dialogInterface, i10);
                    }
                });
                return;
            }
            return;
        }
        U(true);
    }

    @Override
    public void C4(int i10, int i11, float f10, boolean z10) {
        ae.k.c(this, i10, i11, f10, z10);
    }

    public final void D0() {
        ee.k kVar;
        if (this.L0) {
            if (this.f25658w0 && (kVar = this.D0) != null) {
                kVar.kc();
            }
            this.L0 = false;
        }
    }

    public final void E0() {
        if (!this.L0) {
            this.L0 = true;
            if (this.f25658w0) {
                ee.k kVar = this.D0;
                if (kVar != null) {
                    kVar.sc();
                } else {
                    Log.w((int) Log.TAG_ROUND, "ownedCamera.onFocus() failed: null", new Object[0]);
                }
            }
            N(0);
        }
    }

    public final void F0() {
        this.f25633a.s3(4, false);
        this.f25633a.n3(32, false);
        P();
    }

    public final void G0() {
        if (N0()) {
            this.f25644i0.m5().E0(this.R0.f19913id, this);
            this.f25640e0.setVideoPath(this.R0.local.path);
            this.f25641f0.setVideo(this.R0.local.path);
            if (this.V0) {
                this.V0 = false;
                TdApi.MessageSendOptions messageSendOptions = this.W0;
                this.W0 = null;
                Q(messageSendOptions);
            }
        }
    }

    public final void H0() {
        if (!ib.i.i(this.O0)) {
            throw new IllegalStateException();
        } else if (this.D0 != null) {
            this.O0 = "round" + SystemClock.uptimeMillis() + "_" + System.currentTimeMillis() + "_" + Math.random();
            this.f25644i0.v4().o(new TdApi.UploadFile(new TdApi.InputFileGenerated(null, this.O0, 0), ob.a.j(this.G0) ? new TdApi.FileTypeSecret() : new TdApi.FileTypeVideoNote(), 1), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    y.this.k0(object);
                }
            });
            i1(true);
            this.D0.ag();
            this.D0.fg(this.f25633a.Q1().F());
            this.D0.Ac();
            this.D0.pg(this.Y, 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public void I(o oVar) {
        lb.i.a(this.f25655t0, oVar);
    }

    public View I0() {
        if (this.f25635b == null) {
            f fVar = new f(this.f25633a);
            this.f25635b = fVar;
            fVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            z zVar = new z(this.f25633a);
            this.f25637c = zVar;
            zVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.f25635b.addView(this.f25637c);
            g gVar = new g(this.f25633a);
            this.U = gVar;
            gVar.setLayoutParams(FrameLayoutFix.r1(-1, a0.i(49.0f), 80));
            this.f25635b.addView(this.U);
            h hVar = new h(this.f25633a);
            this.V = hVar;
            hVar.setText(w.i1(R.string.slideToCancel));
            this.V.setTypeface(ce.o.k());
            this.V.setTextSize(1, 15.0f);
            this.V.setLayoutParams(FrameLayoutFix.r1(-2, -2, 17));
            this.U.addView(this.V);
            i iVar = new i(this.f25633a);
            this.X = iVar;
            iVar.setLayoutParams(FrameLayoutFix.r1(a0.i(12.0f), a0.i(16.0f), 17));
            this.U.addView(this.X);
            j jVar = new j(this.f25633a);
            this.W = jVar;
            jVar.setGravity(17);
            this.W.setText(w.i1(R.string.Cancel).toUpperCase());
            this.W.setPadding(a0.i(12.0f), 0, a0.i(12.0f), 0);
            this.W.setTextSize(1, 16.0f);
            this.W.setTypeface(ce.o.i());
            this.W.setAlpha(0.0f);
            this.W.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    y.this.l0(view);
                }
            });
            this.W.setLayoutParams(FrameLayoutFix.r1(-2, -1, 17));
            this.U.addView(this.W);
            f3 f3Var = new f3(this.f25633a);
            this.M = f3Var;
            f3Var.setSimpleTopShadow(true);
            f3 f3Var2 = this.M;
            f3Var2.setLayoutParams(p0.H(f3Var2, 80));
            this.f25635b.addView(this.M);
            f3 f3Var3 = new f3(this.f25633a);
            this.N = f3Var3;
            f3Var3.setSimpleBottomTransparentShadow(true);
            f3 f3Var4 = this.N;
            f3Var4.setLayoutParams(p0.H(f3Var4, 80));
            this.f25635b.addView(this.N);
            c0 c0Var = new c0(this.f25633a);
            this.T = c0Var;
            c0Var.setTimerCallback(new c0.b() {
                @Override
                public final void a() {
                    y.this.m0();
                }
            });
            c0 c0Var2 = this.T;
            c0Var2.setLayoutParams(p0.H(c0Var2, 83));
            this.f25635b.addView(this.T);
            a0 a0Var = new a0(this.f25633a);
            this.O = a0Var;
            a0Var.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    y.this.n0(view);
                }
            });
            this.f25635b.addView(this.O);
            k kVar = new k(this.f25633a);
            this.R = kVar;
            kVar.setCameraIconRes(!he.i.c2().U5());
            this.R.f();
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(this.f25633a);
            this.S = frameLayoutFix;
            p0.T(frameLayoutFix);
            yd.d.c(this.S, 33.0f, 3.0f, R.id.theme_color_filling);
            this.S.setLayoutParams(FrameLayoutFix.q1(a0.i(33.0f) + (a0.i(3.0f) * 2), a0.i(33.0f) + (a0.i(3.0f) * 2)));
            this.S.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    y.this.o0(view);
                }
            });
            this.S.addView(this.R);
            this.f25635b.addView(this.S);
            d0 d0Var = new d0(this.f25633a);
            this.Q = d0Var;
            p0.i0(d0Var);
            this.f25635b.addView(this.Q);
            this.Q.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    y.this.p0(view);
                }
            });
            l lVar = new l(this.f25633a);
            this.P = lVar;
            lVar.setLayoutParams(FrameLayoutFix.r1(a0.i(50.0f), a0.i(49.0f), 85));
            yd.g.h(this.P, this.O, true);
            this.f25635b.addView(this.P);
            m mVar = new m(this.f25633a);
            this.Y = mVar;
            mVar.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    y.this.r0(view);
                }
            });
            this.Y.setTransparentOutline(false);
            this.Y.setTranslationZ(a0.i(1.5f));
            this.Y.setElevation(a0.i(1.0f));
            this.Y.setLayoutParams(FrameLayoutFix.r1(a0.i(200.0f), a0.i(200.0f), 1));
            this.f25635b.addView(this.Y);
            View view = new View(this.f25633a);
            this.Z = view;
            view.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.Y.addView(this.Z);
            e0 e0Var = new e0(this.f25633a);
            this.f25634a0 = e0Var;
            e0Var.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.Y.addView(this.f25634a0);
            n nVar = new n(this.f25633a);
            this.f25636b0 = nVar;
            nVar.setScaleType(ImageView.ScaleType.CENTER);
            this.f25636b0.setImageResource(R.drawable.baseline_delete_24);
            p0.T(this.f25636b0);
            this.f25636b0.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    y.this.s0(view2);
                }
            });
            this.f25636b0.setLayoutParams(FrameLayoutFix.r1(a0.i(56.0f), -1, 3));
            this.U.addView(this.f25636b0);
            a aVar = new a(this.f25633a);
            this.f25638c0 = aVar;
            aVar.setScaleType(ImageView.ScaleType.CENTER);
            this.f25638c0.setImageResource(R.drawable.deproko_baseline_send_24);
            p0.T(this.f25638c0);
            this.f25638c0.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    y.this.t0(view2);
                }
            });
            this.f25638c0.setLayoutParams(FrameLayoutFix.r1(a0.i(55.0f), -1, 5));
            this.U.addView(this.f25638c0);
            b bVar = new b(this.f25633a);
            this.f25640e0 = bVar;
            bVar.setDelegate(new c());
            this.f25640e0.setPadding(a0.i(14.0f), a0.i(5.0f), a0.i(14.0f), a0.i(5.0f));
            FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -1);
            int i10 = a0.i(56.0f) - a0.i(14.0f);
            q12.rightMargin = i10;
            q12.leftMargin = i10;
            this.f25640e0.setLayoutParams(q12);
            this.U.addView(this.f25640e0);
            h3 h3Var = new h3(this.f25633a);
            this.f25641f0 = h3Var;
            h3Var.setMuted(true);
            this.f25641f0.setPlaying(true);
            this.f25641f0.setLooping(true);
            this.f25641f0.setDelegate(new d());
            this.f25641f0.setAlpha(0.0f);
            this.f25641f0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.Y.addView(this.f25641f0);
            e eVar = new e(this.f25633a);
            this.f25642g0 = eVar;
            eVar.setScaleType(ImageView.ScaleType.CENTER);
            this.f25642g0.setImageResource(R.drawable.deproko_baseline_sound_muted_24);
            this.f25642g0.setColorFilter(-1);
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1((a0.i(12.0f) * 2) + a0.i(2.0f), (a0.i(12.0f) * 2) + a0.i(2.0f), 81);
            r12.bottomMargin = a0.i(8.0f);
            this.f25642g0.setLayoutParams(r12);
            this.Y.addView(this.f25642g0);
            r1();
            W0(0.0f);
        }
        return this.f25635b;
    }

    public final void J() {
        this.f25644i0.m5().A0(this.R0.f19913id, this);
    }

    public void J0(o oVar) {
        lb.i.e(this.f25655t0, oVar);
    }

    public final boolean K() {
        return this.N0 != 0;
    }

    public final void K0() {
        if (this.R0 != null) {
            this.f25644i0.m5().E0(this.R0.f19913id, this);
            this.R0 = null;
        }
        this.Q0 = null;
        this.P0 = 0L;
        this.O0 = null;
        this.U0 = false;
    }

    public final boolean L() {
        if (this.f25654s0 != 0) {
            if (SystemClock.uptimeMillis() - this.f25654s0 >= (this.f25658w0 ? 1000L : 500L)) {
                return true;
            }
        }
        return false;
    }

    public final void L0() {
        N(0);
    }

    public final void M() {
        if (this.f25656u0 == 3) {
            this.N0 = 0;
            X0(0, true);
            P();
        }
    }

    public final void M0() {
        g1(0.0f, 0.0f);
        this.R.setCameraIconRes(!he.i.c2().U5());
        this.f25634a0.f(0.0f);
        this.T.i();
        this.Q.setCollapseFactor(0.0f);
        this.O.d(0.0f, false);
        this.f25660y0.p(false, false);
        this.f25641f0.Q2();
        this.f25640e0.Q2();
        this.f25641f0.setMuted(true);
        this.f25641f0.setPlaying(true);
        Z0(false, false);
        L0();
    }

    @Override
    public void M4() {
        this.f25641f0.setActivityPaused(true);
        if (!c0()) {
            return;
        }
        if (this.f25656u0 == 3) {
            Q(null);
        } else {
            n1(0, false);
        }
    }

    public final void N(int i10) {
        int i11 = this.f25656u0;
        boolean z10 = (i11 == 0 || i11 == 3 || !this.L0) ? false : true;
        boolean z11 = this.M0 != 0;
        if (!z11 && z10) {
            if (i11 == 1) {
                z10 = a0();
            } else if (i11 == 2) {
                z10 = f0();
            }
        }
        if (z11 == z10) {
            return;
        }
        if (z10) {
            k1(this.f25656u0);
            return;
        }
        if (!Z()) {
            i10 = 0;
        }
        o1(i10);
    }

    public final boolean N0() {
        return this.U0 && t2.T2(this.R0);
    }

    public final void O() {
        boolean z10 = this.f25651p0;
        if (this.f25652q0 != z10) {
            this.f25652q0 = z10;
            this.f25653r0.p(z10, Math.max(Math.abs(W()), Math.abs(X())) > 0.0f);
        }
    }

    public final void O0(boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        if (this.f25656u0 == 3) {
            Q(new TdApi.MessageSendOptions(z10, false, false, messageSchedulingState));
        }
    }

    public final void P() {
        if (this.f25658w0 && Math.max(this.J0, this.f25659x0) * (1.0f - this.f25661z0) == 0.0f && this.D0 != null && !K()) {
            this.D0.lc();
            this.D0.Of();
            i1(false);
            this.f25633a.r2();
            this.D0 = null;
            K0();
        }
    }

    public final void P0(final TdApi.InputMessageVideoNote inputMessageVideoNote, TdApi.MessageSendOptions messageSendOptions, final TdApi.File file) {
        if (Z()) {
            final boolean j10 = ob.a.j(this.G0);
            this.I0.Lo(messageSendOptions.disableNotification, messageSendOptions.schedulingState, new hj.o() {
                @Override
                public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                    y.this.v0(inputMessageVideoNote, j10, file, z10, messageSchedulingState, z11);
                }
            });
        }
        this.N0 = 0;
        P();
    }

    public final void Q(TdApi.MessageSendOptions messageSendOptions) {
        rh rhVar;
        if (this.f25656u0 == 3) {
            if (!N0()) {
                this.V0 = true;
                this.W0 = messageSendOptions;
            } else if (messageSendOptions == null || messageSendOptions.schedulingState != null || (rhVar = this.I0) == null || !rhVar.ui()) {
                this.f25656u0 = 0;
                if (messageSendOptions == null) {
                    this.f25644i0.v4().o(new TdApi.DeleteFile(this.R0.f19913id), this.f25644i0.yc());
                    this.N0 = 0;
                } else if (this.f25641f0.C()) {
                    this.f25644i0.v4().o(new TdApi.CancelUploadFile(this.R0.f19913id), this.f25644i0.na());
                    double startTime = this.f25641f0.getStartTime();
                    double endTime = this.f25641f0.getEndTime();
                    P0(new TdApi.InputMessageVideoNote(new TdApi.InputFileGenerated(this.R0.local.path, g0.s(this.R0.f19913id, false, 0, (long) (startTime * 1000000.0d), (long) (1000000.0d * endTime), true, 0L), 0), null, (int) Math.round(endTime - startTime), 360), messageSendOptions, null);
                } else {
                    P0(new TdApi.InputMessageVideoNote(new TdApi.InputFileId(this.R0.f19913id), null, this.T0, 360), messageSendOptions, this.R0);
                }
                this.f25641f0.setPlaying(false);
                this.f25660y0.p(false, true);
            } else {
                this.I0.Lo(messageSendOptions.disableNotification, messageSendOptions.schedulingState, new hj.o() {
                    @Override
                    public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                        y.this.g0(z10, messageSchedulingState, z11);
                    }
                });
            }
        }
    }

    @Override
    public void Q0(int i10, boolean z10) {
    }

    public final void R(boolean z10) {
        if (!ib.i.i(this.O0) && z10) {
            if (!ib.i.i(this.Q0)) {
                this.f25644i0.v4().o(new TdApi.FinishFileGeneration(this.P0, new TdApi.Error()), this.f25644i0.yc());
            }
            if (this.R0 != null) {
                this.f25644i0.v4().o(new TdApi.CancelUploadFile(this.R0.f19913id), this.f25644i0.yc());
            }
            K0();
        }
    }

    public void R0(boolean z10) {
        if (this.f25651p0 != z10) {
            this.f25651p0 = z10;
            O();
        }
    }

    public final rh S() {
        v4<?> t10 = j0.t(this.f25633a);
        if (t10 instanceof rh) {
            return (rh) t10;
        }
        return null;
    }

    public final void S0(float f10) {
        if (this.f25659x0 != f10) {
            this.f25659x0 = f10;
            u1();
        }
    }

    public final void T(int i10) {
        this.f25644i0.v4().o(new TdApi.SetFileGenerationProgress(this.P0, i10, i10), this.f25644i0.yc());
        this.f25644i0.v4().o(new TdApi.FinishFileGeneration(this.P0, null), this.f25644i0.yc());
    }

    public final void T0(float f10) {
        if (this.B0 != f10) {
            this.B0 = f10;
            w1();
        }
    }

    public boolean U(boolean z10) {
        return n1(L() ? z10 ? 2 : (!Z() || !this.I0.ui()) ? 1 : 3 : 0, true);
    }

    public final void U0(int i10) {
        if (this.f25648m0 != i10) {
            this.f25648m0 = i10;
            y1();
        }
    }

    public final void V(int i10) {
        boolean z10 = false;
        this.S0 = false;
        this.N0 = i10;
        if (i10 != 0) {
            z10 = true;
        }
        this.D0.qf().C0(this.O0, z10);
    }

    @Override
    public boolean V0() {
        return Math.max(this.f25659x0, this.J0) > 0.0f;
    }

    public final float W() {
        return this.f25649n0 * (1.0f - this.K0);
    }

    public final void W0(float f10) {
        if (this.J0 != f10) {
            this.J0 = f10;
            u1();
            float f11 = (0.4f * f10) + 0.6f;
            this.Q.setScaleX(f11);
            this.Q.setScaleY(f11);
            this.S.setScaleX(f11);
            this.S.setScaleY(f11);
            this.O.setExpand(f10);
            t1();
            s1();
            v1();
        }
    }

    public final float X() {
        return this.f25650o0 * this.K0 * (1.0f - this.f25647l0);
    }

    public final void X0(int i10, boolean z10) {
        boolean b02 = b0(this.f25656u0);
        boolean b03 = b0(i10);
        boolean z11 = true;
        boolean z12 = e0(this.f25656u0) || e0(i10);
        this.f25658w0 = z12;
        this.f25656u0 = i10;
        rh rhVar = this.I0;
        if (rhVar != null) {
            rhVar.Op(z12 ? TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR : TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR, i10 != 0, false);
            this.I0.Jk();
        }
        this.f25657v0.l(b03 ? 160L : 140L);
        if (b03) {
            x1();
            y1();
            this.f25657v0.n(db.b.f7287b);
        } else {
            this.f25657v0.n(db.b.f7288c);
        }
        this.f25657v0.p(b03, z10);
        if (b03) {
            e4 e4Var = this.P;
            boolean z13 = i10 == 2;
            if (this.J0 <= 0.0f) {
                z11 = false;
            }
            e4Var.k(z13, z11);
        }
        if (b02 != b03) {
            B0(b03);
            if (!b03) {
                D0();
            }
        }
    }

    public final float Y() {
        if (this.f25654s0 != 0) {
            return (float) ((SystemClock.uptimeMillis() - this.f25654s0) / 59500.0d);
        }
        return 0.0f;
    }

    public final void Y0(float f10) {
        if (this.f25647l0 != f10) {
            this.f25647l0 = f10;
            this.P.setSendFactor(f10);
            this.Q.setSendFactor(f10);
            y1();
        }
    }

    public final boolean Z() {
        rh rhVar = this.I0;
        return (rhVar == null || rhVar.Sa() || !this.I0.zj(this.G0, this.H0) || this.G0 == 0 || this.f25644i0 == null) ? false : true;
    }

    public final void Z0(boolean z10, boolean z11) {
        if (this.f25645j0 != z10) {
            this.f25645j0 = z10;
            this.f25646k0.p(z10, z11);
        }
    }

    @Override
    public void a() {
        if (c0()) {
            j0.y0(R.string.Error, 0);
            n1(0, false);
        }
    }

    public final boolean a0() {
        return !j1.y().z();
    }

    public final void a1(float f10) {
        if (this.f25661z0 != f10) {
            this.f25661z0 = f10;
            this.f25641f0.setAlpha(f10);
        }
    }

    @Override
    public void b(String str, int i10, int i11) {
        if (ib.i.c(this.O0, str)) {
            boolean z10 = i10 > 0;
            if (K()) {
                if (z10) {
                    this.T0 = i11;
                    int i12 = this.N0;
                    if (i12 == 2 || i12 == 3) {
                        J();
                        T(i10);
                        return;
                    }
                    T(i10);
                    P0(new TdApi.InputMessageVideoNote(new TdApi.InputFileId(this.R0.f19913id), null, this.T0, 360), t2.i0(), this.R0);
                    return;
                }
                T(-1);
                M();
            } else if (!z10) {
                n1(0, false);
            }
        }
    }

    public final void b1(TdApi.File file) {
        this.R0 = file;
        N(0);
    }

    @Override
    public void c(String str, int i10) {
        if (ib.i.c(this.O0, str)) {
            this.f25644i0.v4().o(new TdApi.SetFileGenerationProgress(this.P0, 0, i10), this.f25644i0.yc());
        }
    }

    public boolean c0() {
        return this.f25656u0 != 0 || Math.max(this.J0, this.f25659x0) > 0.0f;
    }

    public final void c1(long j10, String str) {
        this.P0 = j10;
        this.Q0 = str;
        N(0);
    }

    @Override
    public void c6() {
        this.f25641f0.setActivityPaused(true);
        if (c0() && !this.F0) {
            U(true);
        }
    }

    @Override
    public void d(boolean z10, boolean z11) {
        this.R.g(z10, z11);
    }

    public final boolean d0() {
        return !ib.i.i(this.O0) && !ib.i.i(this.Q0) && this.R0 != null;
    }

    public void d1(final String str, final long j10, final String str2) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                y.this.w0(str, j10, str2);
            }
        });
    }

    @Override
    public void e(float f10) {
        if (c0() && this.M0 != 0) {
            if (this.f25654s0 != 0) {
                this.O.d(f10, true);
            } else {
                l1(SystemClock.uptimeMillis());
            }
        }
    }

    public final void e1(final TdApi.File file) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                y.this.x0(file);
            }
        });
    }

    @Override
    public void f(String str, long j10) {
        if (ib.i.c(this.O0, str) && this.S0) {
            l1(j10);
        }
    }

    public final boolean f0() {
        return this.D0 != null && this.E0 && d0();
    }

    public void f1(o6 o6Var) {
        this.f25644i0 = o6Var;
    }

    @Override
    public void g(ee.k kVar) {
        if (this.f25656u0 == 2) {
            this.E0 = true;
            N(0);
        }
    }

    public boolean g1(float f10, float f11) {
        float W = W();
        float X = X();
        this.f25649n0 = f10;
        this.f25650o0 = f11;
        if (!(W == W() && X == X())) {
            y1();
        }
        return !this.f25645j0 && c0();
    }

    @Override
    public void h(final TdApi.File file) {
        if (!ib.i.i(file.local.path) && file.size != 0 && file.local.isDownloadingCompleted) {
            this.f25644i0.hd().post(new Runnable() {
                @Override
                public final void run() {
                    y.this.j0(file);
                }
            });
        }
    }

    public final void h1(float f10) {
        if (this.K0 != f10) {
            this.K0 = f10;
            y1();
        }
    }

    @Override
    public void i(final o6.l lVar, final int i10, final byte[] bArr) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                y.this.i0(lVar, i10, bArr);
            }
        });
    }

    public final void i1(boolean z10) {
        this.D0.rf().g0(!he.i.c2().U5() && z10);
        this.D0.rf().d0(z10 ? he.i.c2().J2() ? X0 : 280 : 0);
        this.D0.qf().e0(false);
        this.D0.qf().S0(z10);
        this.D0.qf().v().setIgnoreAspectRatio(z10);
        this.D0.of().setDisallowRatioChanges(z10);
        this.D0.jg(z10);
    }

    @Override
    public void i3(p pVar, p pVar2) {
        ae.k.b(this, pVar, pVar2);
    }

    public boolean j1(View view, boolean z10) {
        if (this.f25656u0 != 0 || this.f25644i0.F4().c0().v0()) {
            return false;
        }
        boolean z11 = !z10 && this.f25643h0;
        if (A0(z11, !z10)) {
            return false;
        }
        rh S = S();
        this.I0 = S;
        if (S == null) {
            return false;
        }
        this.G0 = S.C9();
        this.H0 = this.I0.qk();
        if (!z11 || this.f25644i0.Q3(this.G0)) {
            o6 o6Var = this.f25644i0;
            CharSequence Z5 = o6Var.Z5(o6Var.W2(this.G0), R.id.right_sendMedia, z11 ? R.string.ChatDisabledVideoNotes : R.string.ChatDisabledVoice, z11 ? R.string.ChatRestrictedVideoNotes : R.string.ChatRestrictedVoice, z11 ? R.string.ChatRestrictedVideoNotesUntil : R.string.ChatRestrictedVoiceUntil);
            if (Z5 != null) {
                if (view != null) {
                    this.f25633a.I3().g(view).i(this.I0).q(R.drawable.baseline_warning_24).D(this.f25644i0, Z5).F();
                } else {
                    j0.z0(Z5, 0);
                }
                return false;
            } else if (K()) {
                return false;
            } else {
                eb.f fVar = this.f25657v0;
                if ((fVar != null && fVar.i()) || j0.r(this.f25633a).r1()) {
                    return false;
                }
                j0.r(this.f25633a).s0(true);
                if (z11) {
                    if (this.D0 == null) {
                        this.E0 = false;
                        ee.k H3 = this.f25633a.H3(new v4.k().d(1).j(this));
                        this.D0 = H3;
                        if (H3 == null) {
                            return false;
                        }
                        H0();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                ie.c0 c0Var = this.f25639d0;
                if (c0Var != null) {
                    c0Var.e(this.f25638c0);
                }
                this.f25639d0 = this.f25644i0.hd().O2(this.I0, this.G0, new kb.f() {
                    @Override
                    public final boolean get() {
                        boolean z02;
                        z02 = y.this.z0();
                        return z02;
                    }
                }, null, null, new hj.o() {
                    @Override
                    public final void a(boolean z12, TdApi.MessageSchedulingState messageSchedulingState, boolean z13) {
                        y.this.y0(z12, messageSchedulingState, z13);
                    }
                }, null).d(this.f25638c0);
                if (!z10) {
                    this.f25633a.s3(4, true);
                }
                this.f25633a.n3(32, true);
                M0();
                this.F0 = z10;
                Z0(z10, false);
                if (z10) {
                    this.Q.setCollapseFactor(1.0f);
                }
                X0(z11 ? 2 : 1, !z10);
                return true;
            }
        } else {
            TdApi.User e42 = this.f25644i0.e4(this.G0);
            j0.z0(w.j1(R.string.SecretChatFeatureUnsupported, e42 != null ? e42.firstName : this.f25644i0.U3(this.G0)), 0);
            return false;
        }
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        r1();
    }

    public final void k1(int i10) {
        this.M0 = i10;
        if (i10 != 1) {
            if (i10 == 2) {
                m1();
            }
        } else if (this.f25644i0 != null) {
            j1.y().N(this.f25644i0, ob.a.j(this.G0), this);
        }
    }

    public final void l1(long j10) {
        this.f25654s0 = j10;
        this.T.k(j10);
    }

    public final void m1() {
        this.S0 = true;
        this.D0.qf().N0(this.O0, this, this.Q0);
    }

    public final boolean n1(int i10, boolean z10) {
        int i11;
        int i12 = this.f25656u0;
        boolean z11 = false;
        if (i12 == 0 || i12 == 3) {
            return false;
        }
        if (i10 == 0) {
            j0.l(this.P, true, true);
            if (z10) {
                he.i.c2().e3();
            }
        }
        if ((i10 == 2 || i10 == 3) && this.f25658w0) {
            this.f25660y0.p(true, false);
            i11 = 3;
        } else {
            i11 = 0;
        }
        if (this.f25658w0 && (i10 == 2 || i10 == 3)) {
            ee.k kVar = this.D0;
            if (kVar != null) {
                kVar.qf().e0(true);
            } else {
                Log.w((int) Log.TAG_ROUND, "ownedCamera.setNoPreviewBlur() failed: null", new Object[0]);
            }
        }
        X0(i11, true);
        if (this.f25658w0) {
            if (i10 == 0) {
                z11 = true;
            }
            R(z11);
        }
        N(i10);
        return true;
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        if (i10 == 0) {
            W0(f10);
        } else if (i10 == 1) {
            h1(f10);
        } else if (i10 == 2) {
            Y0(f10);
        } else if (i10 == 4) {
            S0(f10);
        } else if (i10 == 5) {
            a1(f10);
        } else if (i10 == 6) {
            T0(f10);
        }
    }

    public final void o1(int i10) {
        boolean z10 = i10 != 0 && Z();
        int i11 = this.M0;
        if (i11 != 1) {
            if (i11 == 2) {
                V(i10);
            }
        } else if (z10) {
            if (i10 == 2 || i10 == 3) {
                this.I0.No((int) ((SystemClock.uptimeMillis() - this.f25654s0) / 1000));
            }
            j1.y().O();
        } else {
            j1.y().p();
        }
        this.M0 = 0;
        q1();
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 5 && f10 == 1.0f) {
                        P();
                    }
                } else if (f10 == 0.0f) {
                    P();
                } else if (f10 == 1.0f && this.N0 == 3) {
                    O0(false, null);
                }
            } else if (f10 == 1.0f) {
                this.f25641f0.E();
            }
        } else if (f10 == 1.0f) {
            E0();
        } else if (f10 == 0.0f) {
            F0();
        }
    }

    @Override
    public void o6() {
        this.f25641f0.setActivityPaused(false);
    }

    @Override
    public void p1(boolean z10) {
        this.f25643h0 = z10;
    }

    @Override
    public void q0(int i10) {
        ae.k.a(this, i10);
    }

    public final void q1() {
        this.f25654s0 = 0L;
        this.T.l();
    }

    public final void r1() {
        if (this.f25635b != null) {
            this.U.setBackgroundColor(ae.j.u());
            this.V.setTextColor(ae.j.R0());
            this.W.setTextColor(ae.j.L(R.id.theme_color_textNeutral));
            this.Z.setBackgroundColor(ae.j.u());
            this.f25636b0.setColorFilter(ae.j.o0());
            this.f25638c0.setColorFilter(ae.j.j());
            this.f25637c.setBackgroundColor(ae.j.L(R.id.theme_color_previewBackground));
            this.X.invalidate();
            this.R.invalidate();
            this.S.invalidate();
            this.f25640e0.invalidate();
            this.T.invalidate();
            this.Q.invalidate();
            this.N.invalidate();
            this.M.invalidate();
        }
    }

    public final void s1() {
        float d10 = ib.h.d(this.J0);
        float measuredHeight = this.f25659x0 * (1.0f - this.J0) * (this.U.getMeasuredHeight() / 2);
        this.T.setAlpha(d10);
        this.T.setTranslationY(this.f25648m0 + measuredHeight);
    }

    public final void t1() {
        float top = (((((this.P.getTop() + this.P.getTranslationY()) + (this.P.getMeasuredHeight() / 2)) - this.Q.getMeasuredHeight()) - a0.i(11.0f)) - a0.i(41.0f)) + (a0.i(24.0f) * this.f25647l0) + (a0.i(24.0f) * (1.0f - ib.h.d(this.J0)));
        this.Q.setTranslationY(top);
        this.S.setTranslationY(((top - a0.i(16.0f)) - this.S.getMeasuredHeight()) + (a0.i(24.0f) * (1.0f - ib.h.d(this.J0)) * (1.0f - this.f25647l0)));
    }

    public final void u1() {
        float d10 = ib.h.d(this.J0);
        float max = Math.max(d10, this.f25659x0);
        this.P.setAlpha(d10);
        this.U.setAlpha(max);
        this.Q.setAlpha(d10);
        if (!this.f25658w0) {
            max = 0.0f;
        }
        this.f25637c.setFactor(max);
        this.M.setAlpha(max);
        this.N.setAlpha(max);
        this.Y.setAlpha(max);
        this.f25634a0.setAlpha(Math.max(this.J0, 1.0f - this.f25659x0));
        float f10 = (max * 0.6f) + 0.4f;
        this.Y.setScaleX(f10);
        this.Y.setScaleY(f10);
        FrameLayoutFix frameLayoutFix = this.S;
        if (!this.f25658w0) {
            d10 = 0.0f;
        }
        frameLayoutFix.setAlpha(d10);
        w1();
        z1();
    }

    public final void v1() {
        float d10 = (1.0f - this.f25647l0) * (1.0f - ib.h.d((-Math.max(-a0.i(50.0f), W())) / a0.i(50.0f)));
        this.V.setAlpha(d10);
        this.X.setAlpha(d10);
        float f10 = this.f25659x0 * (1.0f - this.J0);
        this.W.setAlpha(this.f25647l0 * (1.0f - f10));
        float measuredHeight = this.U.getMeasuredHeight() / 2;
        float f11 = f10 * measuredHeight;
        float f12 = -measuredHeight;
        this.W.setTranslationY(((1.0f - this.f25647l0) * f12) + f11);
        this.V.setTranslationY(this.f25647l0 * measuredHeight);
        this.X.setTranslationY(measuredHeight * this.f25647l0);
        float f13 = f12 + f11;
        this.f25638c0.setAlpha(this.f25659x0);
        this.f25636b0.setAlpha(f10);
        this.f25636b0.setTranslationY(f13);
        this.f25640e0.setAlpha(f10);
        this.f25640e0.setTranslationY(f13);
    }

    public final void w1() {
        float f10 = this.f25659x0 * (1.0f - this.J0) * this.B0;
        this.f25642g0.setAlpha(f10);
        float f11 = (f10 * 0.4f) + 0.6f;
        this.f25642g0.setScaleX(f11);
        this.f25642g0.setScaleY(f11);
    }

    public void x1() {
        v4<?> t10 = j0.t(this.f25633a);
        if (t10 instanceof rh) {
            U0((p0.r(((rh) t10).Uj())[1] - p0.r(this.f25635b)[1]) - this.P.getTop());
        }
    }

    public final void y1() {
        f3 f3Var;
        a0 a0Var;
        a0 a0Var2;
        d0 d0Var;
        FrameLayoutFix frameLayoutFix;
        float X = X();
        int i10 = (-a0.i(33.0f)) * 2;
        if (!this.f25645j0) {
            float f10 = i10;
            float f11 = X <= f10 ? 1.0f : X / f10;
            this.Q.setCollapseFactor(f11);
            if (f11 == 1.0f) {
                Z0(true, true);
            }
        }
        float max = Math.max(-a0.i(50.0f), W());
        float d10 = ib.h.d((-max) / a0.i(50.0f));
        float measuredWidth = (((-this.V.getMeasuredWidth()) / 2) + max) - this.X.getMeasuredWidth();
        this.V.setTranslationX(max);
        this.X.setTranslationX(measuredWidth);
        v1();
        c0 c0Var = this.T;
        c0Var.setTranslationX(Math.min(0.0f, (measuredWidth + this.X.getLeft()) - c0Var.getMeasuredWidth()));
        z1();
        s1();
        this.U.setTranslationY(this.f25648m0);
        this.M.setTranslationY(this.f25648m0 - this.U.getMeasuredHeight());
        this.N.setTranslationY(this.f25648m0 + f3Var.getMeasuredHeight());
        this.P.setTranslationY(this.f25648m0 + X);
        float top = this.P.getTop() + this.P.getTranslationY();
        float left = this.P.getLeft() + this.P.getTranslationX() + (this.P.getMeasuredWidth() / 2);
        float measuredHeight = top + (this.P.getMeasuredHeight() / 2);
        this.f25637c.a((int) left, (int) measuredHeight);
        this.O.setTranslationX(left - (a0Var.getMeasuredWidth() / 2));
        this.O.setTranslationY(measuredHeight - (a0Var2.getMeasuredHeight() / 2));
        this.Q.setTranslationX(left - (d0Var.getMeasuredWidth() / 2));
        this.S.setTranslationX(left - (frameLayoutFix.getMeasuredWidth() / 2));
        t1();
        if (d10 * this.J0 == 1.0f) {
            n1(0, false);
        }
    }

    @Override
    public void y4(boolean z10) {
        he.m.a(this, z10);
    }

    public final void z1() {
        int top = this.U.getTop() + this.f25648m0;
        d0 d0Var = this.Y;
        d0Var.setTranslationY(((top / 2) - (d0Var.getLayoutParams().height / 2)) + ((top / 3) * (1.0f - Math.max(this.J0, this.f25659x0))));
    }
}
