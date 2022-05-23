package de;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.y;
import eb.k;
import gb.i;
import gd.w;
import hd.t2;
import ib.h;
import ie.o;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import oe.a;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.TGCallService;
import org.thunderdog.challegram.voip.VoIPController;
import org.thunderdog.challegram.voip.gui.CallSettings;
import ud.v4;
import zd.o6;
import zd.s1;
import zd.t1;
import zd.t7;
import zd.w7;

public class b extends v4<e> implements t7.i, t7.c, View.OnClickListener, k.b, Runnable, t1.a, a.AbstractC0170a {
    public static float Y0 = 2.25f;
    public oe.a A0;
    public FrameLayoutFix B0;
    public f C0;
    public f D0;
    public float E0;
    public eb.f F0;
    public int G0 = -1;
    public boolean H0;
    public boolean I0;
    public k J0;
    public float K0;
    public boolean L0;
    public TdApi.CallState M0;
    public boolean N0;
    public k O0;
    public long P0;
    public boolean Q0;
    public boolean R0;
    public k S0;
    public boolean T0;
    public k U0;
    public float V0;
    public float W0;
    public boolean X0;
    public TdApi.Call f7498n0;
    public TdApi.User f7499o0;
    public CallSettings f7500p0;
    public boolean f7501q0;
    public ne.d f7502r0;
    public TextView f7503s0;
    public TextView f7504t0;
    public LinearLayout f7505u0;
    public TextView f7506v0;
    public g f7507w0;
    public TextView f7508x0;
    public TextView f7509y0;
    public TextView f7510z0;

    public class a extends FrameLayoutFix {
        public a(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            b.this.uf();
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            b.this.uf();
        }
    }

    public class C0087b extends ne.d {
        public final Drawable f7511a0 = db.e.a(-16777216, 2, 48, false);

        public C0087b(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            ce.c.n(this.f7511a0, (int) (b.this.E0 * 255.0f * 0.5f));
            this.f7511a0.draw(canvas);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredWidth = getMeasuredWidth();
            int i12 = a0.i(212.0f);
            if (this.f7511a0.getBounds().right != measuredWidth || this.f7511a0.getBounds().bottom != i12) {
                this.f7511a0.setBounds(0, 0, measuredWidth, i12);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                if (b.this.W0 == 1.0f && b.this.T0) {
                    b.this.gf(false);
                }
            }
            return true;
        }
    }

    public class c implements View.OnClickListener {
        public final FrameLayoutFix f7513a;
        public final Context f7514b;

        public class a implements Runnable {
            public final TextView f7516a;

            public a(TextView textView) {
                this.f7516a = textView;
            }

            @Override
            public void run() {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "libtgvoip ");
                spannableStringBuilder.append((CharSequence) VoIPController.getVersion());
                spannableStringBuilder.setSpan(new o(ce.o.g(), 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) TGCallService.C());
                this.f7516a.setText(spannableStringBuilder);
                if (this.f7516a.getParent() != null) {
                    this.f7516a.postDelayed(this, 500L);
                }
            }
        }

        public c(FrameLayoutFix frameLayoutFix, Context context) {
            this.f7513a = frameLayoutFix;
            this.f7514b = context;
        }

        @Override
        public void onClick(View view) {
            TGCallService.J();
            if (b.this.f7506v0 != null) {
                this.f7513a.removeView(b.this.f7506v0);
                b.this.f7506v0 = null;
                return;
            }
            b2 b2Var = new b2(this.f7514b);
            b2Var.setBackgroundColor(-1426063361);
            b2Var.setTextSize(1, 15.0f);
            b2Var.setGravity(16);
            b2Var.setTextColor(-16777216);
            b2Var.setPadding(a0.i(16.0f), a0.i(16.0f), a0.i(16.0f), a0.i(16.0f));
            b2Var.post(new a(b2Var));
            b.this.f7506v0 = b2Var;
            this.f7513a.addView(b.this.f7506v0);
        }
    }

    public class d extends b2 {
        public d(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() != 0 || b.this.W0 == 0.0f) && super.onTouchEvent(motionEvent);
        }
    }

    public static class e {
        public TdApi.Call f7519a;

        public e(TdApi.Call call) {
            this.f7519a = call;
        }
    }

    public static class f extends View implements k.b {
        public boolean M;
        public k N;
        public Drawable f7520a;
        public float f7521b;
        public boolean f7522c;

        public f(Context context) {
            super(context);
        }

        public final void a(float f10) {
            if (this.N == null) {
                this.N = new k(0, this, db.b.f7287b, 180L, this.f7521b);
            }
            this.N.i(f10);
        }

        public final void b(float f10) {
            k kVar = this.N;
            if (kVar != null) {
                kVar.l(f10);
            }
            c(f10);
        }

        public final void c(float f10) {
            if (this.f7521b != f10) {
                this.f7521b = f10;
                invalidate();
            }
        }

        public void d(int i10) {
            this.f7520a = ce.c.f(i10);
        }

        public void e(boolean z10, boolean z11) {
            if (this.M != z10) {
                this.M = z10;
                float f10 = 1.0f;
                if (z11) {
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    a(f10);
                    return;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                b(f10);
            }
        }

        public void f(boolean z10) {
            this.f7522c = z10;
        }

        public boolean g() {
            e(!this.M, true);
            return this.M;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            c(f10);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }

        @Override
        public void onDraw(Canvas canvas) {
            Drawable drawable;
            if (this.f7520a != null) {
                float measuredWidth = getMeasuredWidth() / 2;
                float measuredHeight = getMeasuredHeight() / 2;
                int d10 = ib.d.d(16777215, -1, this.f7521b);
                if (this.f7521b != 0.0f) {
                    canvas.drawCircle(measuredWidth, measuredHeight, a0.i(18.0f), y.g(d10));
                }
                int d11 = ib.d.d(-1, -16777216, this.f7521b);
                ce.c.b(canvas, this.f7520a, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f7520a.getMinimumHeight() / 2), y.W(d11));
                float f10 = this.f7521b;
                if (f10 != 0.0f && this.f7522c) {
                    ce.b.i(canvas, measuredWidth, measuredHeight, f10, d11, d10);
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return getParent() != null && ((View) getParent()).getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
        }
    }

    public static class g extends View {
        public long f7525c;
        public int f7524b = -1;
        public final i f7523a = new i();

        public g(Context context) {
            super(context);
        }

        public void a(int i10) {
            boolean z10 = false;
            if (Math.max(this.f7524b, 0) != Math.max(i10, 0)) {
                z10 = true;
            }
            this.f7524b = i10;
            if (z10) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f7525c;
                if (j10 == 0 || elapsedRealtime - j10 >= 1000) {
                    this.f7525c = elapsedRealtime;
                    this.f7523a.a(this);
                    invalidate();
                    return;
                }
                this.f7523a.b(this, 1000 - (elapsedRealtime - j10));
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10 = a0.i(3.0f);
            int i11 = a0.i(1.0f);
            int measuredWidth = (getMeasuredWidth() / 2) - (((i10 * 4) + (i11 * 3)) / 2);
            int measuredHeight = (getMeasuredHeight() / 2) + (i10 * 2);
            int i12 = 0;
            while (i12 < 4) {
                RectF a02 = y.a0();
                int i13 = i12 + 1;
                a02.set(measuredWidth, measuredHeight - (i10 * i13), measuredWidth + i10, measuredHeight);
                float f10 = i11;
                canvas.drawRoundRect(a02, f10, f10, y.g(this.f7524b > i12 ? -1 : Integer.MAX_VALUE));
                measuredWidth += i10 + i11;
                i12 = i13;
            }
        }
    }

    public b(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ze() {
        if (!Sa()) {
            lf();
        }
    }

    @Override
    public void Ac() {
        super.Ac();
        if (!j0.S()) {
            t().m3(org.thunderdog.challegram.a.M0());
        }
    }

    @Override
    public void G8(float f10) {
        if (this.E0 != f10) {
            this.E0 = f10;
            rf();
            tf();
            this.f7505u0.setAlpha(f10);
            this.f7502r0.invalidate();
        }
    }

    @Override
    public boolean Ie() {
        return false;
    }

    @Override
    public void M0(TdApi.Call call) {
        this.f24495b.F4().c0().y(t(), this.f24495b, call.f19905id);
    }

    @Override
    public void M1(TdApi.User user) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                b.this.Ze();
            }
        });
    }

    @Override
    public boolean Me() {
        return true;
    }

    @Override
    public void Q4(int i10, int i11) {
        TdApi.Call call;
        if (!Sa() && (call = this.f7498n0) != null && call.f19905id == i10) {
            ef(i11);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_call;
    }

    @Override
    public void X4(TdApi.Call call) {
        this.f24495b.F4().c0().p0(this, call.userId, null);
    }

    public final void Xe() {
        this.L0 = true;
        this.f24495b.e2().m2(this.f7498n0.f19905id, this);
        Zb();
    }

    public boolean Ye(long j10) {
        return this.f7498n0.userId == j10;
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.e2().m2(this.f7498n0.f19905id, this);
        this.f24495b.e2().N1(this.f7498n0.userId, this);
        t1.b().d(this);
        this.f7502r0.Q2();
    }

    @Override
    public int aa() {
        return -16777216;
    }

    public void af(TdApi.Call call) {
        this.f24495b.e2().m2(this.f7498n0.f19905id, this);
        this.M0 = null;
        nf(call);
        this.f24495b.e2().Y1(call.f19905id, this);
        this.f24495b.F4().c0().A(call.f19905id);
        pf();
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void b7(int i10, CallSettings callSettings) {
        if (!Sa()) {
            this.f7500p0 = callSettings;
            of();
        }
    }

    public void bf(e eVar) {
        super.Ad(eVar);
        this.f7498n0 = eVar.f7519a;
        ef(this.f24495b.F4().c0().G(this.f24495b, this.f7498n0.f19905id));
        this.f7501q0 = this.f7498n0.state.getConstructor() == -2000107571;
        this.f7499o0 = this.f24495b.e2().u2(this.f7498n0.userId);
    }

    public final void cf(float f10) {
        this.K0 = f10;
        rf();
    }

    @Override
    public void d(TdApi.Call call) {
        if (!Sa()) {
            nf(call);
            pf();
        }
    }

    public final void df(boolean z10, boolean z11) {
        if (this.I0 != z10) {
            this.I0 = z10;
            float f10 = 1.0f;
            if (z11) {
                if (this.J0 == null) {
                    this.J0 = new k(0, this, db.b.f7287b, 180L, this.K0);
                }
                k kVar = this.J0;
                if (!z10) {
                    f10 = 0.0f;
                }
                kVar.i(f10);
                return;
            }
            k kVar2 = this.J0;
            if (kVar2 != null) {
                kVar2.l(z10 ? 1.0f : 0.0f);
            }
            if (!z10) {
                f10 = 0.0f;
            }
            cf(f10);
        }
    }

    @Override
    public void e1(TdApi.Call call) {
        Xe();
    }

    @Override
    public void e2() {
        TextView textView = this.f7508x0;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f7509y0;
        if (textView2 != null) {
            textView2.invalidate();
        }
        TextView textView3 = this.f7503s0;
        if (textView3 != null) {
            textView3.invalidate();
        }
        TextView textView4 = this.f7510z0;
        if (textView4 != null) {
            textView4.invalidate();
        }
    }

    public final void ef(int i10) {
        if (this.G0 != i10) {
            this.G0 = i10;
            g gVar = this.f7507w0;
            if (gVar != null) {
                gVar.a(i10);
            }
            qf();
        }
    }

    public final void ff(float f10) {
        if (this.W0 != f10) {
            this.W0 = f10;
            tf();
        }
    }

    public final void gf(boolean z10) {
        if (this.T0 != z10) {
            this.T0 = z10;
            if (this.U0 == null) {
                this.U0 = new k(4, this, new OvershootInterpolator(1.02f), 310L, this.W0);
            }
            this.U0.i(z10 ? 1.0f : 0.0f);
        }
    }

    public final void hf(float f10) {
        if (this.V0 != f10) {
            this.V0 = f10;
            tf();
        }
    }

    @Override
    public void i1(TdApi.Call call, boolean z10) {
        this.f24495b.F4().c0().N(this.f24495b, call.f19905id);
    }

    public final void m0if(boolean z10, boolean z11) {
        if (this.R0 != z10) {
            this.R0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.S0 == null) {
                    this.S0 = new k(3, this, db.b.f7287b, 180L, this.V0);
                }
                this.S0.i(f10);
                return;
            }
            k kVar = this.S0;
            if (kVar != null) {
                kVar.l(f10);
            }
            hf(f10);
        }
    }

    public final void jf(boolean z10) {
        if (this.N0 != z10) {
            this.N0 = z10;
            if (z10) {
                if (this.O0 == null) {
                    k kVar = new k(1, this, db.b.f7287b, 1100L);
                    this.O0 = kVar;
                    kVar.F(650L);
                }
                if (!this.O0.v()) {
                    this.O0.l(0.0f);
                    this.O0.i(1.0f);
                    return;
                }
                return;
            }
            k kVar2 = this.O0;
            if (kVar2 != null && kVar2.o() == 0.0f) {
                this.O0.l(0.0f);
            }
        }
    }

    public final void kf(boolean z10) {
        if (this.H0 != z10) {
            this.H0 = z10;
            if (z10) {
                j0.d0(this);
            } else {
                j0.f0(this);
            }
        }
    }

    @Override
    public void lc() {
        super.lc();
        if (!j0.S()) {
            t().m3(-1);
        }
    }

    public final void lf() {
        TextView textView = this.f7503s0;
        if (textView != null) {
            textView.setText(id.d.z().I(t2.r2(this.f7499o0)));
        }
        TextView textView2 = this.f7510z0;
        if (textView2 != null) {
            textView2.setText(id.d.z().I(w.j1(R.string.CallEmojiHint, t2.s2(this.f7498n0.userId, this.f7499o0))));
        }
    }

    public final void mf() {
        t().I3().g(this.f7508x0).i(this).D(this.f24495b, w.m1(R.string.CallEmojiHint, t2.s2(this.f7498n0.userId, this.f7499o0)));
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        g gVar;
        if (i10 == 0) {
            cf(f10);
        } else if (i10 == 1) {
            this.f7504t0.setAlpha(f10 <= 0.5f ? 1.0f - (f10 / 0.5f) : (f10 - 0.5f) / 0.5f);
        } else if (i10 == 3) {
            hf(f10);
        } else if (i10 == 4) {
            ff(Math.max(0.0f, f10));
        } else if (i10 == 6 && (gVar = this.f7507w0) != null) {
            gVar.setAlpha(f10);
        }
    }

    public final void nf(TdApi.Call call) {
        if (!this.L0) {
            TdApi.CallState callState = this.f7498n0.state;
            this.M0 = callState;
            boolean z10 = true;
            boolean z11 = callState.getConstructor() == -2000107571;
            boolean z12 = call.state.getConstructor() == -2133790038 || (call.state.getConstructor() == 1394310213 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == 438216166);
            this.f7498n0 = call;
            this.P0 = 0L;
            ef(this.f24495b.F4().c0().G(this.f24495b, call.f19905id));
            qf();
            if (t2.M2(call) || t2.F2(call) || t2.Q2(call) || ((z11 && z12) || t2.k3(call) || call.state.getConstructor() == -2133790038)) {
                Xe();
                return;
            }
            oe.a aVar = this.A0;
            o6 o6Var = this.f24495b;
            if (this.T == null) {
                z10 = false;
            }
            aVar.z1(o6Var, call, z10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 1) {
            this.O0.l(0.0f);
            if (this.N0) {
                this.O0.i(1.0f);
            }
        }
    }

    @Override
    public View oc(Context context) {
        a aVar = new a(context);
        yd.g.i(aVar, R.id.theme_color_headerBackground, this);
        C0087b bVar = new C0087b(context);
        this.f7502r0 = bVar;
        bVar.setNoRound(true);
        this.f7502r0.setNoPlaceholders(true);
        this.f7502r0.setNeedFull(true);
        this.f7502r0.r(this.f24495b, this.f7499o0, false);
        this.f7502r0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        aVar.addView(this.f7502r0);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -2);
        q12.topMargin = a0.i(76.0f);
        int i10 = a0.i(18.0f);
        q12.rightMargin = i10;
        q12.leftMargin = i10;
        b2 b2Var = new b2(context);
        this.f7503s0 = b2Var;
        b2Var.setSingleLine(true);
        this.f7503s0.setTextColor(-1);
        this.f7503s0.setTextSize(1, 40.0f);
        this.f7503s0.setTypeface(Typeface.create("sans-serif-light", 0));
        p0.h0(this.f7503s0);
        this.f7503s0.setEllipsize(TextUtils.TruncateAt.END);
        this.f7503s0.setLayoutParams(q12);
        aVar.addView(this.f7503s0);
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-1, -2);
        q13.topMargin = a0.i(136.0f);
        int i11 = a0.i(18.0f);
        q13.rightMargin = i11;
        q13.leftMargin = i11;
        b2 b2Var2 = new b2(context);
        this.f7504t0 = b2Var2;
        b2Var2.setMaxLines(2);
        this.f7504t0.setLineSpacing(a0.i(3.0f), 1.0f);
        this.f7504t0.setTextColor(-1);
        this.f7504t0.setTextSize(1, 14.0f);
        this.f7504t0.setTypeface(ce.o.k());
        p0.h0(this.f7504t0);
        this.f7504t0.setLayoutParams(q13);
        aVar.addView(this.f7504t0);
        FrameLayout.LayoutParams q14 = FrameLayoutFix.q1(-2, -2);
        q14.topMargin = a0.i(42.0f);
        int i12 = a0.i(18.0f);
        q14.rightMargin = i12;
        q14.leftMargin = i12;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f7505u0 = linearLayout;
        linearLayout.setAlpha(0.0f);
        this.f7505u0.setOrientation(0);
        this.f7505u0.setLayoutParams(q14);
        aVar.addView(this.f7505u0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a0.i(14.0f), a0.i(14.0f));
        layoutParams.topMargin = a0.i(2.0f);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.deproko_logo_telegram_18);
        imageView.setLayoutParams(layoutParams);
        this.f7505u0.addView(imageView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = a0.i(9.0f);
        b2 b2Var3 = new b2(context);
        b2Var3.setSingleLine(true);
        b2Var3.setTextColor(-1);
        b2Var3.setTextSize(1, 14.0f);
        b2Var3.setTypeface(ce.o.k());
        p0.h0(b2Var3);
        b2Var3.setEllipsize(TextUtils.TruncateAt.END);
        b2Var3.setLayoutParams(layoutParams2);
        b2Var3.setText(w.i1(R.string.VoipBranding).toUpperCase());
        if (Log.checkLogLevel(3)) {
            b2Var3.setOnClickListener(new c(aVar, context));
        }
        this.f7505u0.addView(b2Var3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(a0.i(18.0f), a0.i(18.0f));
        layoutParams3.leftMargin = a0.i(8.0f);
        g gVar = new g(context);
        this.f7507w0 = gVar;
        gVar.setLayoutParams(layoutParams3);
        if (this.G0 < 0) {
            this.f7507w0.setAlpha(0.0f);
        }
        this.f7507w0.a(this.G0);
        this.f7505u0.addView(this.f7507w0);
        t1.b().a(this);
        d dVar = new d(context);
        this.f7508x0 = dVar;
        dVar.setSingleLine(true);
        this.f7508x0.setTextColor(-1);
        this.f7508x0.setTextSize(1, 16.0f);
        this.f7508x0.setTypeface(ce.o.k());
        p0.h0(this.f7508x0);
        this.f7508x0.setEllipsize(TextUtils.TruncateAt.END);
        this.f7508x0.setPadding(a0.i(18.0f), a0.i(18.0f), a0.i(18.0f), a0.i(18.0f));
        this.f7508x0.setLayoutParams(FrameLayoutFix.r1(-2, -2, 51));
        this.f7508x0.setOnClickListener(this);
        this.f7508x0.setId(R.id.btn_emoji);
        aVar.addView(this.f7508x0);
        b2 b2Var4 = new b2(context);
        this.f7509y0 = b2Var4;
        b2Var4.setSingleLine(true);
        this.f7509y0.setScaleX(1.0f / Y0);
        this.f7509y0.setScaleY(1.0f / Y0);
        this.f7509y0.setAlpha(0.0f);
        this.f7509y0.setTextColor(-1);
        float f10 = 36;
        Y0 = f10 / 16.0f;
        this.f7509y0.setTextSize(1, f10);
        this.f7509y0.setTypeface(ce.o.k());
        p0.h0(this.f7509y0);
        this.f7509y0.setEllipsize(TextUtils.TruncateAt.END);
        this.f7509y0.setLayoutParams(FrameLayoutFix.r1(-2, -2, 51));
        aVar.addView(this.f7509y0);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, -2, 16);
        r12.topMargin = a0.i(24.0f) * 2;
        int i13 = a0.i(48.0f);
        r12.leftMargin = i13;
        r12.rightMargin = i13;
        b2 b2Var5 = new b2(context);
        this.f7510z0 = b2Var5;
        b2Var5.setAlpha(0.0f);
        this.f7510z0.setTextColor(-1);
        this.f7510z0.setGravity(17);
        this.f7510z0.setTextSize(1, 15.0f);
        this.f7510z0.setTypeface(ce.o.k());
        p0.h0(this.f7510z0);
        this.f7510z0.setLayoutParams(r12);
        aVar.addView(this.f7510z0);
        f fVar = new f(context);
        this.C0 = fVar;
        fVar.setId(R.id.btn_mute);
        this.C0.setOnClickListener(this);
        this.C0.d(R.drawable.baseline_mic_24);
        this.C0.f(true);
        this.C0.setLayoutParams(FrameLayoutFix.r1(a0.i(72.0f), a0.i(72.0f), 83));
        f fVar2 = new f(context);
        fVar2.setId(R.id.btn_openChat);
        fVar2.setOnClickListener(this);
        fVar2.d(R.drawable.baseline_chat_bubble_24);
        fVar2.setLayoutParams(FrameLayoutFix.r1(a0.i(72.0f), a0.i(72.0f), 81));
        f fVar3 = new f(context);
        this.D0 = fVar3;
        fVar3.setId(R.id.btn_speaker);
        this.D0.setOnClickListener(this);
        this.D0.d(R.drawable.baseline_volume_up_24);
        this.D0.setLayoutParams(FrameLayoutFix.r1(a0.i(72.0f), a0.i(72.0f), 85));
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.B0 = frameLayoutFix;
        frameLayoutFix.setLayoutParams(FrameLayoutFix.r1(-1, a0.i(76.0f), 80));
        this.B0.addView(this.C0);
        this.B0.addView(fVar2);
        this.B0.addView(this.D0);
        Drawable a10 = db.e.a(-16777216, 2, 80, false);
        a10.setAlpha(76);
        db.g.d(this.B0, a10);
        aVar.addView(this.B0);
        oe.a aVar2 = new oe.a(context, this);
        this.A0 = aVar2;
        aVar2.setCallback(this);
        this.A0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        aVar.addView(this.A0);
        this.A0.z1(this.f24495b, this.f7498n0, false);
        this.f24495b.e2().Y1(this.f7498n0.f19905id, this);
        this.f24495b.e2().L(this.f7498n0.userId, this);
        this.f7500p0 = this.f24495b.e2().h0(this.f7498n0.f19905id);
        t1.b().a(this);
        lf();
        pf();
        CallSettings callSettings = this.f7500p0;
        if (callSettings != null) {
            this.C0.e(callSettings.isMicMuted(), false);
            this.D0.e(this.f7500p0.isSpeakerModeEnabled(), false);
        }
        return aVar;
    }

    public final void of() {
        if (this.B0 != null) {
            f fVar = this.C0;
            CallSettings callSettings = this.f7500p0;
            boolean z10 = true;
            fVar.e(callSettings != null && callSettings.isMicMuted(), Ta());
            f fVar2 = this.D0;
            CallSettings callSettings2 = this.f7500p0;
            if (callSettings2 == null || !callSettings2.isSpeakerModeEnabled()) {
                z10 = false;
            }
            fVar2.e(z10, Ta());
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_emoji:
                if (this.R0) {
                    gf(true);
                    return;
                }
                return;
            case R.id.btn_mute:
                if (!t2.Z2(this.f7498n0)) {
                    if (this.f7500p0 == null) {
                        this.f7500p0 = new CallSettings(this.f24495b, this.f7498n0.f19905id);
                    }
                    this.f7500p0.setMicMuted(((f) view).g());
                    return;
                }
                return;
            case R.id.btn_openChat:
                this.f24495b.hd().u7(this, this.f7498n0.userId, null);
                return;
            case R.id.btn_speaker:
                if (!t2.Z2(this.f7498n0)) {
                    if (this.f7500p0 == null) {
                        this.f7500p0 = new CallSettings(this.f24495b, this.f7498n0.f19905id);
                    }
                    if (this.f7500p0.isSpeakerModeEnabled()) {
                        this.f7500p0.setSpeakerMode(0);
                        return;
                    } else {
                        this.f7500p0.toggleSpeakerMode(this);
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public final void pf() {
        String str;
        String D1;
        wf();
        this.P0 = this.f24495b.F4().c0().H(this.f24495b, this.f7498n0.f19905id);
        boolean z10 = true;
        if (this.M0 == null || this.f7498n0.state.getConstructor() != -2133790038) {
            str = t2.M0(this.f7498n0, this.P0, false);
            TdApi.Call call = this.f7498n0;
            if (!call.isOutgoing && call.state.getConstructor() == 1073048620 && this.f24495b.F4().q1() && (D1 = this.f24495b.D1()) != null) {
                str = str + "\n" + w.j1(R.string.VoipAnsweringAsAccount, D1);
            }
        } else {
            str = t2.N0(this.f7498n0, this.M0, this.P0, false);
        }
        this.f7504t0.setText(str.toUpperCase());
        if (t2.Z2(this.f7498n0) || (this.f7498n0.state.getConstructor() == 1073048620 && !this.f7498n0.isOutgoing)) {
            z10 = false;
        }
        df(z10, Ta());
        sf();
        vf();
        qf();
    }

    public final void qf() {
        TdApi.Call call;
        boolean z10 = false;
        boolean z11 = this.G0 >= 0 && (call = this.f7498n0) != null && call.state.getConstructor() == -2000107571 && this.P0 >= 0;
        boolean z12 = !z11;
        eb.f fVar = this.F0;
        if (z12 == (fVar != null && fVar.h())) {
            if (this.F0 == null) {
                this.F0 = new eb.f(6, this, db.b.f7287b, 180L);
            }
            eb.f fVar2 = this.F0;
            if (this.f7507w0 != null && this.E0 > 0.0f) {
                z10 = true;
            }
            fVar2.p(z11, z10);
        }
    }

    @Override
    public boolean r9() {
        v4<?> kd2 = kd();
        return kd2 != null && kd2.R9() == R.id.controller_call;
    }

    public final void rf() {
        this.B0.setAlpha(this.E0 * this.K0);
        FrameLayoutFix frameLayoutFix = this.B0;
        frameLayoutFix.setTranslationY((1.0f - this.E0) * frameLayoutFix.getMeasuredHeight() * 0.2f);
    }

    @Override
    public void run() {
        if (!Sa()) {
            pf();
            if (this.H0) {
                j0.e0(this, this.f24495b.F4().c0().M(this.f24495b, this.f7498n0.f19905id));
            }
        }
    }

    @Override
    public void sc() {
        super.sc();
        if (!this.X0) {
            d9(R.id.controller_call);
            v4<?> kd2 = kd();
            if (kd2 != null && kd2.R9() == R.id.controller_contacts) {
                c9(R.id.controller_contacts);
            }
            this.X0 = true;
        }
        this.f24495b.F4().c0().A(this.f7498n0.f19905id);
    }

    public final void sf() {
        String[] strArr;
        boolean z10 = this.f7498n0.state.getConstructor() == -2000107571;
        if (z10 && ib.i.i(this.f7508x0.getText())) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : ((TdApi.CallStateReady) this.f7498n0.state).emojis) {
                if (sb2.length() > 0) {
                    sb2.append("  ");
                }
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            this.f7508x0.setText(id.d.z().I(sb3));
            this.f7509y0.setText(id.d.z().I(sb3));
            if (!this.f7501q0) {
                mf();
            }
        }
        tf();
        m0if(z10, Ta());
    }

    @Override
    public void tc() {
        vf();
    }

    public final void tf() {
        TextView textView = this.f7508x0;
        float f10 = this.V0;
        float f11 = 1.0f - this.E0;
        float f12 = this.W0;
        textView.setAlpha(h.d(f10 * (1.0f - Math.max(f11, f12 >= 0.5f ? (f12 - 0.5f) / 0.5f : 0.0f))));
        this.f7508x0.setScaleX((this.W0 * (Y0 - 1.0f)) + 1.0f);
        this.f7508x0.setScaleY((this.W0 * (Y0 - 1.0f)) + 1.0f);
        float d10 = h.d(this.V0 * this.W0);
        this.f7509y0.setAlpha(d10);
        this.f7510z0.setAlpha(d10);
        float f13 = 1.0f / Y0;
        float f14 = 1.0f - f13;
        this.f7509y0.setScaleX((this.W0 * f14) + f13);
        this.f7509y0.setScaleY(f13 + (f14 * this.W0));
        this.f7502r0.setMainAlpha(1.0f - h.d(this.V0 * this.W0));
        uf();
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    public final void uf() {
        int i10;
        int i11;
        int measuredHeight;
        int measuredWidth = ((View) this.f7509y0.getParent()).getMeasuredWidth();
        int measuredHeight2 = ((View) this.f7509y0.getParent()).getMeasuredHeight();
        int measuredWidth2 = this.f7509y0.getMeasuredWidth();
        int measuredHeight3 = this.f7509y0.getMeasuredHeight();
        int measuredWidth3 = this.f7508x0.getMeasuredWidth();
        int i12 = (a0.i(42.0f) - this.f7508x0.getPaddingTop()) + (this.f7508x0.getMeasuredHeight() / 2);
        int i13 = (measuredHeight2 / 2) - a0.i(24.0f);
        float f10 = (measuredWidth - measuredWidth3) + (measuredWidth3 / 2);
        float f11 = this.W0;
        int i14 = (int) (f10 + (((measuredWidth / 2) - i11) * f11));
        int i15 = (int) (i12 + ((i13 - i12) * f11));
        this.f7509y0.setTranslationX(i14 - (measuredWidth2 / 2));
        this.f7509y0.setTranslationY(i15 - (measuredHeight3 / 2));
        this.f7508x0.setTranslationX(i14 - i10);
        this.f7508x0.setTranslationY(i15 - measuredHeight);
    }

    public final void vf() {
        boolean z10 = false;
        this.Q0 = Ta() || this.Q0;
        if (t2.L0(this.f7498n0) && this.Q0) {
            z10 = true;
        }
        jf(z10);
    }

    public final void wf() {
        kf(!Sa() && this.f7498n0.state.getConstructor() == -2000107571);
    }

    @Override
    public void x0(int i10, int i11) {
        if (!Sa()) {
            pf();
        }
    }
}
