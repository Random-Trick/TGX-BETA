package p038ce;

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
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import gd.C4779t2;
import me.C6847b2;
import me.C6857d;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.View$OnClickListenerC7517a;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.TGCallService;
import org.thunderdog.challegram.voip.VoIPController;
import org.thunderdog.challegram.voip.gui.CallSettings;
import p037cb.C2057b;
import p037cb.C2061e;
import p037cb.C2065g;
import p051db.C3940f;
import p051db.C3950k;
import p080fb.HandlerC4344i;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.C5132o;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.C11059v7;
import p350yd.C11133y7;
import td.AbstractC9323v4;

public class View$OnClickListenerC2162b extends AbstractC9323v4<C2168e> implements C11059v7.AbstractC11068i, C11059v7.AbstractC11062c, View.OnClickListener, C3950k.AbstractC3952b, Runnable, C11052v1.AbstractC11053a, View$OnClickListenerC7517a.AbstractC7518a {
    public static float f7553Y0 = 2.25f;
    public View$OnClickListenerC7517a f7554A0;
    public FrameLayoutFix f7555B0;
    public C2169f f7556C0;
    public C2169f f7557D0;
    public float f7558E0;
    public C3940f f7559F0;
    public int f7560G0 = -1;
    public boolean f7561H0;
    public boolean f7562I0;
    public C3950k f7563J0;
    public float f7564K0;
    public boolean f7565L0;
    public TdApi.CallState f7566M0;
    public boolean f7567N0;
    public C3950k f7568O0;
    public long f7569P0;
    public boolean f7570Q0;
    public boolean f7571R0;
    public C3950k f7572S0;
    public boolean f7573T0;
    public C3950k f7574U0;
    public float f7575V0;
    public float f7576W0;
    public boolean f7577X0;
    public TdApi.Call f7578n0;
    public TdApi.User f7579o0;
    public CallSettings f7580p0;
    public boolean f7581q0;
    public C6857d f7582r0;
    public TextView f7583s0;
    public TextView f7584t0;
    public LinearLayout f7585u0;
    public TextView f7586v0;
    public C2170g f7587w0;
    public TextView f7588x0;
    public TextView f7589y0;
    public TextView f7590z0;

    public class C2163a extends FrameLayoutFix {
        public C2163a(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            View$OnClickListenerC2162b.this.m35447uf();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            View$OnClickListenerC2162b.this.m35447uf();
        }
    }

    public class C2164b extends C6857d {
        public final Drawable f7592a0 = C2061e.m35730a(-16777216, 2, 48, false);

        public C2164b(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            C1362c.m37478n(this.f7592a0, (int) (View$OnClickListenerC2162b.this.f7558E0 * 255.0f * 0.5f));
            this.f7592a0.draw(canvas);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredWidth = getMeasuredWidth();
            int i3 = C1357a0.m37544i(212.0f);
            if (this.f7592a0.getBounds().right != measuredWidth || this.f7592a0.getBounds().bottom != i3) {
                this.f7592a0.setBounds(0, 0, measuredWidth, i3);
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
                if (View$OnClickListenerC2162b.this.f7576W0 == 1.0f && View$OnClickListenerC2162b.this.f7573T0) {
                    View$OnClickListenerC2162b.this.m35461gf(false);
                }
            }
            return true;
        }
    }

    public class View$OnClickListenerC2165c implements View.OnClickListener {
        public final FrameLayoutFix f7594a;
        public final Context f7595b;

        public class RunnableC2166a implements Runnable {
            public final TextView f7597a;

            public RunnableC2166a(TextView textView) {
                this.f7597a = textView;
            }

            @Override
            public void run() {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "libtgvoip ");
                spannableStringBuilder.append((CharSequence) VoIPController.getVersion());
                spannableStringBuilder.setSpan(new C5132o(C1389o.m37265g(), 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.append((CharSequence) TGCallService.m14258C());
                this.f7597a.setText(spannableStringBuilder);
                if (this.f7597a.getParent() != null) {
                    this.f7597a.postDelayed(this, 500L);
                }
            }
        }

        public View$OnClickListenerC2165c(FrameLayoutFix frameLayoutFix, Context context) {
            this.f7594a = frameLayoutFix;
            this.f7595b = context;
        }

        @Override
        public void onClick(View view) {
            TGCallService.m14251J();
            if (View$OnClickListenerC2162b.this.f7586v0 != null) {
                this.f7594a.removeView(View$OnClickListenerC2162b.this.f7586v0);
                View$OnClickListenerC2162b.this.f7586v0 = null;
                return;
            }
            C6847b2 b2Var = new C6847b2(this.f7595b);
            b2Var.setBackgroundColor(-1426063361);
            b2Var.setTextSize(1, 15.0f);
            b2Var.setGravity(16);
            b2Var.setTextColor(-16777216);
            b2Var.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(16.0f));
            b2Var.post(new RunnableC2166a(b2Var));
            View$OnClickListenerC2162b.this.f7586v0 = b2Var;
            this.f7594a.addView(View$OnClickListenerC2162b.this.f7586v0);
        }
    }

    public class C2167d extends C6847b2 {
        public C2167d(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() != 0 || View$OnClickListenerC2162b.this.f7576W0 == 0.0f) && super.onTouchEvent(motionEvent);
        }
    }

    public static class C2168e {
        public TdApi.Call f7600a;

        public C2168e(TdApi.Call call) {
            this.f7600a = call;
        }
    }

    public static class C2169f extends View implements C3950k.AbstractC3952b {
        public boolean f7601M;
        public C3950k f7602N;
        public Drawable f7603a;
        public float f7604b;
        public boolean f7605c;

        public C2169f(Context context) {
            super(context);
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            m35441c(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public final void m35443a(float f) {
            if (this.f7602N == null) {
                this.f7602N = new C3950k(0, this, C2057b.f7280b, 180L, this.f7604b);
            }
            this.f7602N.m29546i(f);
        }

        public final void m35442b(float f) {
            C3950k kVar = this.f7602N;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            m35441c(f);
        }

        public final void m35441c(float f) {
            if (this.f7604b != f) {
                this.f7604b = f;
                invalidate();
            }
        }

        public void m35440d(int i) {
            this.f7603a = C1362c.m37486f(i);
        }

        public void m35439e(boolean z, boolean z2) {
            if (this.f7601M != z) {
                this.f7601M = z;
                float f = 1.0f;
                if (z2) {
                    if (!z) {
                        f = 0.0f;
                    }
                    m35443a(f);
                    return;
                }
                if (!z) {
                    f = 0.0f;
                }
                m35442b(f);
            }
        }

        public void m35438f(boolean z) {
            this.f7605c = z;
        }

        public boolean m35437g() {
            m35439e(!this.f7601M, true);
            return this.f7601M;
        }

        @Override
        public void onDraw(Canvas canvas) {
            Drawable drawable;
            if (this.f7603a != null) {
                float measuredWidth = getMeasuredWidth() / 2;
                float measuredHeight = getMeasuredHeight() / 2;
                int d = C5064d.m24129d(16777215, -1, this.f7604b);
                if (this.f7604b != 0.0f) {
                    canvas.drawCircle(measuredWidth, measuredHeight, C1357a0.m37544i(18.0f), C1410y.m37042g(d));
                }
                int d2 = C5064d.m24129d(-1, -16777216, this.f7604b);
                C1362c.m37490b(canvas, this.f7603a, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f7603a.getMinimumHeight() / 2), C1410y.m37058W(d2));
                float f = this.f7604b;
                if (f != 0.0f && this.f7605c) {
                    C1359b.m37513i(canvas, measuredWidth, measuredHeight, f, d2, d);
                }
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return getParent() != null && ((View) getParent()).getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
        }
    }

    public static class C2170g extends View {
        public long f7608c;
        public int f7607b = -1;
        public final HandlerC4344i f7606a = new HandlerC4344i();

        public C2170g(Context context) {
            super(context);
        }

        public void m35436a(int i) {
            boolean z = false;
            if (Math.max(this.f7607b, 0) != Math.max(i, 0)) {
                z = true;
            }
            this.f7607b = i;
            if (z) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.f7608c;
                if (j == 0 || elapsedRealtime - j >= 1000) {
                    this.f7608c = elapsedRealtime;
                    this.f7606a.m28234a(this);
                    invalidate();
                    return;
                }
                this.f7606a.m28233b(this, 1000 - (elapsedRealtime - j));
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i = C1357a0.m37544i(3.0f);
            int i2 = C1357a0.m37544i(1.0f);
            int measuredWidth = (getMeasuredWidth() / 2) - (((i * 4) + (i2 * 3)) / 2);
            int measuredHeight = (getMeasuredHeight() / 2) + (i * 2);
            int i3 = 0;
            while (i3 < 4) {
                RectF a0 = C1410y.m37053a0();
                int i4 = i3 + 1;
                a0.set(measuredWidth, measuredHeight - (i * i4), measuredWidth + i, measuredHeight);
                float f = i2;
                canvas.drawRoundRect(a0, f, f, C1410y.m37042g(this.f7607b > i3 ? -1 : Integer.MAX_VALUE));
                measuredWidth += i + i2;
                i3 = i4;
            }
        }
    }

    public View$OnClickListenerC2162b(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m35468Ze() {
        if (!m9347Sa()) {
            m35456lf();
        }
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        if (!C1379j0.m37352S()) {
            mo4347s().m14467l3(AbstractView$OnTouchListenerC7889a.m14577J0());
        }
    }

    @Override
    public void mo9435G8(float f) {
        if (this.f7558E0 != f) {
            this.f7558E0 = f;
            m35450rf();
            m35448tf();
            this.f7585u0.setAlpha(f);
            this.f7582r0.invalidate();
        }
    }

    @Override
    public boolean mo9416Ie() {
        return false;
    }

    @Override
    public void mo15746K0(TdApi.Call call) {
        this.f30170b.m2930B4().m4713c0().m4615A(mo4347s(), this.f30170b, call.f25367id);
    }

    @Override
    public boolean mo9386Me() {
        return true;
    }

    @Override
    public void mo1348P1(TdApi.User user) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2162b.this.m35468Ze();
            }
        });
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        C2170g gVar;
        if (i == 0) {
            m35465cf(f);
        } else if (i == 1) {
            this.f7584t0.setAlpha(f <= 0.5f ? 1.0f - (f / 0.5f) : (f - 0.5f) / 0.5f);
        } else if (i == 3) {
            m35460hf(f);
        } else if (i == 4) {
            m35462ff(Math.max(0.0f, f));
        } else if (i == 6 && (gVar = this.f7587w0) != null) {
            gVar.setAlpha(f);
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_call;
    }

    @Override
    public void mo1564X4(int i, int i2) {
        TdApi.Call call;
        if (!m9347Sa() && (call = this.f7578n0) != null && call.f25367id == i) {
            m35463ef(i2);
        }
    }

    public final void m35470Xe() {
        this.f7565L0 = true;
        this.f30170b.m2480e2().m1615n2(this.f7578n0.f25367id, this);
        m9298Zb();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 1) {
            this.f7568O0.m29543l(0.0f);
            if (this.f7567N0) {
                this.f7568O0.m29546i(1.0f);
            }
        }
    }

    public boolean m35469Ye(long j) {
        return this.f7578n0.userId == j;
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2480e2().m1615n2(this.f7578n0.f25367id, this);
        this.f30170b.m2480e2().m1702P1(this.f7578n0.userId, this);
        C11052v1.m1768b().m1766d(this);
        this.f7582r0.mo4501a3();
    }

    @Override
    public int mo9293aa() {
        return -16777216;
    }

    public void m35467af(TdApi.Call call) {
        this.f30170b.m2480e2().m1615n2(this.f7578n0.f25367id, this);
        this.f7566M0 = null;
        m35454nf(call);
        this.f30170b.m2480e2().m1665a2(call.f25367id, this);
        this.f30170b.m2930B4().m4713c0().m4611C(call.f25367id);
        m35452pf();
    }

    @Override
    public void mo1563b7(int i, CallSettings callSettings) {
        if (!m9347Sa()) {
            this.f7580p0 = callSettings;
            m35453of();
        }
    }

    public void m35466bf(C2168e eVar) {
        super.m9476Ad(eVar);
        this.f7578n0 = eVar.f7600a;
        m35463ef(this.f30170b.m2930B4().m4713c0().m4604I(this.f30170b, this.f7578n0.f25367id));
        this.f7581q0 = this.f7578n0.state.getConstructor() == -2000107571;
        this.f7579o0 = this.f30170b.m2480e2().m1583v2(this.f7578n0.userId);
    }

    @Override
    public void mo15745c5(TdApi.Call call) {
        this.f30170b.m2930B4().m4713c0().m4549t0(this, call.userId, null);
    }

    public final void m35465cf(float f) {
        this.f7564K0 = f;
        m35450rf();
    }

    public final void m35464df(boolean z, boolean z2) {
        if (this.f7562I0 != z) {
            this.f7562I0 = z;
            float f = 1.0f;
            if (z2) {
                if (this.f7563J0 == null) {
                    this.f7563J0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f7564K0);
                }
                C3950k kVar = this.f7563J0;
                if (!z) {
                    f = 0.0f;
                }
                kVar.m29546i(f);
                return;
            }
            C3950k kVar2 = this.f7563J0;
            if (kVar2 != null) {
                kVar2.m29543l(z ? 1.0f : 0.0f);
            }
            if (!z) {
                f = 0.0f;
            }
            m35465cf(f);
        }
    }

    public final void m35463ef(int i) {
        if (this.f7560G0 != i) {
            this.f7560G0 = i;
            C2170g gVar = this.f7587w0;
            if (gVar != null) {
                gVar.m35436a(i);
            }
            m35451qf();
        }
    }

    @Override
    public void mo1562f(TdApi.Call call) {
        if (!m9347Sa()) {
            m35454nf(call);
            m35452pf();
        }
    }

    public final void m35462ff(float f) {
        if (this.f7576W0 != f) {
            this.f7576W0 = f;
            m35448tf();
        }
    }

    @Override
    public void mo452g2() {
        TextView textView = this.f7588x0;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f7589y0;
        if (textView2 != null) {
            textView2.invalidate();
        }
        TextView textView3 = this.f7583s0;
        if (textView3 != null) {
            textView3.invalidate();
        }
        TextView textView4 = this.f7590z0;
        if (textView4 != null) {
            textView4.invalidate();
        }
    }

    public final void m35461gf(boolean z) {
        if (this.f7573T0 != z) {
            this.f7573T0 = z;
            if (this.f7574U0 == null) {
                this.f7574U0 = new C3950k(4, this, new OvershootInterpolator(1.02f), 310L, this.f7576W0);
            }
            this.f7574U0.m29546i(z ? 1.0f : 0.0f);
        }
    }

    public final void m35460hf(float f) {
        if (this.f7575V0 != f) {
            this.f7575V0 = f;
            m35448tf();
        }
    }

    public final void m35459if(boolean z, boolean z2) {
        if (this.f7571R0 != z) {
            this.f7571R0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f7572S0 == null) {
                    this.f7572S0 = new C3950k(3, this, C2057b.f7280b, 180L, this.f7575V0);
                }
                this.f7572S0.m29546i(f);
                return;
            }
            C3950k kVar = this.f7572S0;
            if (kVar != null) {
                kVar.m29543l(f);
            }
            m35460hf(f);
        }
    }

    @Override
    public void mo15744j1(TdApi.Call call) {
        m35470Xe();
    }

    public final void m35458jf(boolean z) {
        if (this.f7567N0 != z) {
            this.f7567N0 = z;
            if (z) {
                if (this.f7568O0 == null) {
                    C3950k kVar = new C3950k(1, this, C2057b.f7280b, 1100L);
                    this.f7568O0 = kVar;
                    kVar.m29555F(650L);
                }
                if (!this.f7568O0.m29533v()) {
                    this.f7568O0.m29543l(0.0f);
                    this.f7568O0.m29546i(1.0f);
                    return;
                }
                return;
            }
            C3950k kVar2 = this.f7568O0;
            if (kVar2 != null && kVar2.m29540o() == 0.0f) {
                this.f7568O0.m29543l(0.0f);
            }
        }
    }

    public final void m35457kf(boolean z) {
        if (this.f7561H0 != z) {
            this.f7561H0 = z;
            if (z) {
                C1379j0.m37337d0(this);
            } else {
                C1379j0.m37333f0(this);
            }
        }
    }

    @Override
    public void mo9216lc() {
        super.mo9216lc();
        if (!C1379j0.m37352S()) {
            mo4347s().m14467l3(-1);
        }
    }

    public final void m35456lf() {
        TextView textView = this.f7583s0;
        if (textView != null) {
            textView.setText(C5078d.m23987z().m24025I(C4779t2.m25438r2(this.f7579o0)));
        }
        TextView textView2 = this.f7590z0;
        if (textView2 != null) {
            textView2.setText(C5078d.m23987z().m24025I(C4403w.m27867j1(R.string.CallEmojiHint, C4779t2.m25431s2(this.f7578n0.userId, this.f7579o0))));
        }
    }

    public final void m35455mf() {
        mo4347s().m14584H3().m8985g(this.f7588x0).m8958i(this).m8971D(this.f30170b, C4403w.m27855m1(R.string.CallEmojiHint, C4779t2.m25431s2(this.f7578n0.userId, this.f7579o0)));
    }

    @Override
    public void mo15743n1(TdApi.Call call, boolean z) {
        this.f30170b.m2930B4().m4713c0().m4597P(this.f30170b, call.f25367id);
    }

    public final void m35454nf(TdApi.Call call) {
        if (!this.f7565L0) {
            TdApi.CallState callState = this.f7578n0.state;
            this.f7566M0 = callState;
            boolean z = true;
            boolean z2 = callState.getConstructor() == -2000107571;
            boolean z3 = call.state.getConstructor() == -2133790038 || (call.state.getConstructor() == -190853167 && ((TdApi.CallStateDiscarded) call.state).reason.getConstructor() == 438216166);
            this.f7578n0 = call;
            this.f7569P0 = 0L;
            m35463ef(this.f30170b.m2930B4().m4713c0().m4604I(this.f30170b, call.f25367id));
            m35451qf();
            if (C4779t2.m25645M2(call) || C4779t2.m25694F2(call) || C4779t2.m25617Q2(call) || ((z2 && z3) || C4779t2.m25486k3(call) || call.state.getConstructor() == -2133790038)) {
                m35470Xe();
                return;
            }
            View$OnClickListenerC7517a aVar = this.f7554A0;
            C10930q6 q6Var = this.f30170b;
            if (this.f30161T == null) {
                z = false;
            }
            aVar.m15756C1(q6Var, call, z);
        }
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public View mo403oc(Context context) {
        C2163a aVar = new C2163a(context);
        C10192g.m5782i(aVar, R.id.theme_color_headerBackground, this);
        C2164b bVar = new C2164b(context);
        this.f7582r0 = bVar;
        bVar.setNoRound(true);
        this.f7582r0.setNoPlaceholders(true);
        this.f7582r0.setNeedFull(true);
        this.f7582r0.m18745r(this.f30170b, this.f7579o0, false);
        this.f7582r0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        aVar.addView(this.f7582r0);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -2);
        s1.topMargin = C1357a0.m37544i(76.0f);
        int i = C1357a0.m37544i(18.0f);
        s1.rightMargin = i;
        s1.leftMargin = i;
        C6847b2 b2Var = new C6847b2(context);
        this.f7583s0 = b2Var;
        b2Var.setSingleLine(true);
        this.f7583s0.setTextColor(-1);
        this.f7583s0.setTextSize(1, 40.0f);
        this.f7583s0.setTypeface(Typeface.create("sans-serif-light", 0));
        C1399s0.m37168o0(this.f7583s0);
        this.f7583s0.setEllipsize(TextUtils.TruncateAt.END);
        this.f7583s0.setLayoutParams(s1);
        aVar.addView(this.f7583s0);
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, -2);
        s12.topMargin = C1357a0.m37544i(136.0f);
        int i2 = C1357a0.m37544i(18.0f);
        s12.rightMargin = i2;
        s12.leftMargin = i2;
        C6847b2 b2Var2 = new C6847b2(context);
        this.f7584t0 = b2Var2;
        b2Var2.setMaxLines(2);
        this.f7584t0.setLineSpacing(C1357a0.m37544i(3.0f), 1.0f);
        this.f7584t0.setTextColor(-1);
        this.f7584t0.setTextSize(1, 14.0f);
        this.f7584t0.setTypeface(C1389o.m37261k());
        C1399s0.m37168o0(this.f7584t0);
        this.f7584t0.setLayoutParams(s12);
        aVar.addView(this.f7584t0);
        FrameLayout.LayoutParams s13 = FrameLayoutFix.m18008s1(-2, -2);
        s13.topMargin = C1357a0.m37544i(42.0f);
        int i3 = C1357a0.m37544i(18.0f);
        s13.rightMargin = i3;
        s13.leftMargin = i3;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f7585u0 = linearLayout;
        linearLayout.setAlpha(0.0f);
        this.f7585u0.setOrientation(0);
        this.f7585u0.setLayoutParams(s13);
        aVar.addView(this.f7585u0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1357a0.m37544i(14.0f), C1357a0.m37544i(14.0f));
        layoutParams.topMargin = C1357a0.m37544i(2.0f);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.deproko_logo_telegram_18);
        imageView.setLayoutParams(layoutParams);
        this.f7585u0.addView(imageView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = C1357a0.m37544i(9.0f);
        C6847b2 b2Var3 = new C6847b2(context);
        b2Var3.setSingleLine(true);
        b2Var3.setTextColor(-1);
        b2Var3.setTextSize(1, 14.0f);
        b2Var3.setTypeface(C1389o.m37261k());
        C1399s0.m37168o0(b2Var3);
        b2Var3.setEllipsize(TextUtils.TruncateAt.END);
        b2Var3.setLayoutParams(layoutParams2);
        b2Var3.setText(C4403w.m27871i1(R.string.VoipBranding).toUpperCase());
        if (Log.checkLogLevel(3)) {
            b2Var3.setOnClickListener(new View$OnClickListenerC2165c(aVar, context));
        }
        this.f7585u0.addView(b2Var3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C1357a0.m37544i(18.0f), C1357a0.m37544i(18.0f));
        layoutParams3.leftMargin = C1357a0.m37544i(8.0f);
        C2170g gVar = new C2170g(context);
        this.f7587w0 = gVar;
        gVar.setLayoutParams(layoutParams3);
        if (this.f7560G0 < 0) {
            this.f7587w0.setAlpha(0.0f);
        }
        this.f7587w0.m35436a(this.f7560G0);
        this.f7585u0.addView(this.f7587w0);
        C11052v1.m1768b().m1769a(this);
        C2167d dVar = new C2167d(context);
        this.f7588x0 = dVar;
        dVar.setSingleLine(true);
        this.f7588x0.setTextColor(-1);
        this.f7588x0.setTextSize(1, 16.0f);
        this.f7588x0.setTypeface(C1389o.m37261k());
        C1399s0.m37168o0(this.f7588x0);
        this.f7588x0.setEllipsize(TextUtils.TruncateAt.END);
        this.f7588x0.setPadding(C1357a0.m37544i(18.0f), C1357a0.m37544i(18.0f), C1357a0.m37544i(18.0f), C1357a0.m37544i(18.0f));
        this.f7588x0.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 51));
        this.f7588x0.setOnClickListener(this);
        this.f7588x0.setId(R.id.btn_emoji);
        aVar.addView(this.f7588x0);
        C6847b2 b2Var4 = new C6847b2(context);
        this.f7589y0 = b2Var4;
        b2Var4.setSingleLine(true);
        this.f7589y0.setScaleX(1.0f / f7553Y0);
        this.f7589y0.setScaleY(1.0f / f7553Y0);
        this.f7589y0.setAlpha(0.0f);
        this.f7589y0.setTextColor(-1);
        float f = 36;
        f7553Y0 = f / 16.0f;
        this.f7589y0.setTextSize(1, f);
        this.f7589y0.setTypeface(C1389o.m37261k());
        C1399s0.m37168o0(this.f7589y0);
        this.f7589y0.setEllipsize(TextUtils.TruncateAt.END);
        this.f7589y0.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 51));
        aVar.addView(this.f7589y0);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, 16);
        t1.topMargin = C1357a0.m37544i(24.0f) * 2;
        int i4 = C1357a0.m37544i(48.0f);
        t1.leftMargin = i4;
        t1.rightMargin = i4;
        C6847b2 b2Var5 = new C6847b2(context);
        this.f7590z0 = b2Var5;
        b2Var5.setAlpha(0.0f);
        this.f7590z0.setTextColor(-1);
        this.f7590z0.setGravity(17);
        this.f7590z0.setTextSize(1, 15.0f);
        this.f7590z0.setTypeface(C1389o.m37261k());
        C1399s0.m37168o0(this.f7590z0);
        this.f7590z0.setLayoutParams(t1);
        aVar.addView(this.f7590z0);
        C2169f fVar = new C2169f(context);
        this.f7556C0 = fVar;
        fVar.setId(R.id.btn_mute);
        this.f7556C0.setOnClickListener(this);
        this.f7556C0.m35440d(R.drawable.baseline_mic_24);
        this.f7556C0.m35438f(true);
        this.f7556C0.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(72.0f), C1357a0.m37544i(72.0f), 83));
        C2169f fVar2 = new C2169f(context);
        fVar2.setId(R.id.btn_openChat);
        fVar2.setOnClickListener(this);
        fVar2.m35440d(R.drawable.baseline_chat_bubble_24);
        fVar2.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(72.0f), C1357a0.m37544i(72.0f), 81));
        C2169f fVar3 = new C2169f(context);
        this.f7557D0 = fVar3;
        fVar3.setId(R.id.btn_speaker);
        this.f7557D0.setOnClickListener(this);
        this.f7557D0.m35440d(R.drawable.baseline_volume_up_24);
        this.f7557D0.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(72.0f), C1357a0.m37544i(72.0f), 85));
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f7555B0 = frameLayoutFix;
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18007t1(-1, C1357a0.m37544i(76.0f), 80));
        this.f7555B0.addView(this.f7556C0);
        this.f7555B0.addView(fVar2);
        this.f7555B0.addView(this.f7557D0);
        Drawable a = C2061e.m35730a(-16777216, 2, 80, false);
        a.setAlpha(76);
        C2065g.m35721d(this.f7555B0, a);
        aVar.addView(this.f7555B0);
        View$OnClickListenerC7517a aVar2 = new View$OnClickListenerC7517a(context, this);
        this.f7554A0 = aVar2;
        aVar2.setCallback(this);
        this.f7554A0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        aVar.addView(this.f7554A0);
        this.f7554A0.m15756C1(this.f30170b, this.f7578n0, false);
        this.f30170b.m2480e2().m1665a2(this.f7578n0.f25367id, this);
        this.f30170b.m2480e2().m1720L(this.f7578n0.userId, this);
        this.f7580p0 = this.f30170b.m2480e2().m1640h0(this.f7578n0.f25367id);
        C11052v1.m1768b().m1769a(this);
        m35456lf();
        m35452pf();
        CallSettings callSettings = this.f7580p0;
        if (callSettings != null) {
            this.f7556C0.m35439e(callSettings.isMicMuted(), false);
            this.f7557D0.m35439e(this.f7580p0.isSpeakerModeEnabled(), false);
        }
        return aVar;
    }

    public final void m35453of() {
        if (this.f7555B0 != null) {
            C2169f fVar = this.f7556C0;
            CallSettings callSettings = this.f7580p0;
            boolean z = true;
            fVar.m35439e(callSettings != null && callSettings.isMicMuted(), m9339Ta());
            C2169f fVar2 = this.f7557D0;
            CallSettings callSettings2 = this.f7580p0;
            if (callSettings2 == null || !callSettings2.isSpeakerModeEnabled()) {
                z = false;
            }
            fVar2.m35439e(z, m9339Ta());
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_emoji:
                if (this.f7571R0) {
                    m35461gf(true);
                    return;
                }
                return;
            case R.id.btn_mute:
                if (!C4779t2.m25563Z2(this.f7578n0)) {
                    if (this.f7580p0 == null) {
                        this.f7580p0 = new CallSettings(this.f30170b, this.f7578n0.f25367id);
                    }
                    this.f7580p0.setMicMuted(((C2169f) view).m35437g());
                    return;
                }
                return;
            case R.id.btn_openChat:
                this.f30170b.m2485dd().m3439u7(this, this.f7578n0.userId, null);
                return;
            case R.id.btn_speaker:
                if (!C4779t2.m25563Z2(this.f7578n0)) {
                    if (this.f7580p0 == null) {
                        this.f7580p0 = new CallSettings(this.f30170b, this.f7578n0.f25367id);
                    }
                    if (this.f7580p0.isSpeakerModeEnabled()) {
                        this.f7580p0.setSpeakerMode(0);
                        return;
                    } else {
                        this.f7580p0.toggleSpeakerMode(this);
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public final void m35452pf() {
        String str;
        String D1;
        m35445wf();
        this.f7569P0 = this.f30170b.m2930B4().m4713c0().m4603J(this.f30170b, this.f7578n0.f25367id);
        boolean z = true;
        if (this.f7566M0 == null || this.f7578n0.state.getConstructor() != -2133790038) {
            str = C4779t2.m25647M0(this.f7578n0, this.f7569P0, false);
            TdApi.Call call = this.f7578n0;
            if (!call.isOutgoing && call.state.getConstructor() == 1073048620 && this.f30170b.m2930B4().m4661q1() && (D1 = this.f30170b.m2901D1()) != null) {
                str = str + "\n" + C4403w.m27867j1(R.string.VoipAnsweringAsAccount, D1);
            }
        } else {
            str = C4779t2.m25640N0(this.f7578n0, this.f7566M0, this.f7569P0, false);
        }
        this.f7584t0.setText(str.toUpperCase());
        if (C4779t2.m25563Z2(this.f7578n0) || (this.f7578n0.state.getConstructor() == 1073048620 && !this.f7578n0.isOutgoing)) {
            z = false;
        }
        m35464df(z, m9339Ta());
        m35449sf();
        m35446vf();
        m35451qf();
    }

    public final void m35451qf() {
        TdApi.Call call;
        boolean z = false;
        boolean z2 = this.f7560G0 >= 0 && (call = this.f7578n0) != null && call.state.getConstructor() == -2000107571 && this.f7569P0 >= 0;
        boolean z3 = !z2;
        C3940f fVar = this.f7559F0;
        if (z3 == (fVar != null && fVar.m29585h())) {
            if (this.f7559F0 == null) {
                this.f7559F0 = new C3940f(6, this, C2057b.f7280b, 180L);
            }
            C3940f fVar2 = this.f7559F0;
            if (this.f7587w0 != null && this.f7558E0 > 0.0f) {
                z = true;
            }
            fVar2.m29577p(z2, z);
        }
    }

    @Override
    public boolean mo9177r9() {
        AbstractC9323v4<?> kd = m9221kd();
        return kd != null && kd.mo407R9() == R.id.controller_call;
    }

    public final void m35450rf() {
        this.f7555B0.setAlpha(this.f7558E0 * this.f7564K0);
        FrameLayoutFix frameLayoutFix = this.f7555B0;
        frameLayoutFix.setTranslationY((1.0f - this.f7558E0) * frameLayoutFix.getMeasuredHeight() * 0.2f);
    }

    @Override
    public void run() {
        if (!m9347Sa()) {
            m35452pf();
            if (this.f7561H0) {
                C1379j0.m37335e0(this, this.f30170b.m2930B4().m4713c0().m4598O(this.f30170b, this.f7578n0.f25367id));
            }
        }
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (!this.f7577X0) {
            m9273d9(R.id.controller_call);
            AbstractC9323v4<?> kd = m9221kd();
            if (kd != null && kd.mo407R9() == R.id.controller_contacts) {
                m9280c9(R.id.controller_contacts);
            }
            this.f7577X0 = true;
        }
        this.f30170b.m2930B4().m4713c0().m4611C(this.f7578n0.f25367id);
    }

    public final void m35449sf() {
        String[] strArr;
        boolean z = this.f7578n0.state.getConstructor() == -2000107571;
        if (z && C5070i.m24062i(this.f7588x0.getText())) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : ((TdApi.CallStateReady) this.f7578n0.state).emojis) {
                if (sb2.length() > 0) {
                    sb2.append("  ");
                }
                sb2.append(str);
            }
            String sb3 = sb2.toString();
            this.f7588x0.setText(C5078d.m23987z().m24025I(sb3));
            this.f7589y0.setText(C5078d.m23987z().m24025I(sb3));
            if (!this.f7581q0) {
                m35455mf();
            }
        }
        m35448tf();
        m35459if(z, m9339Ta());
    }

    @Override
    public void mo9159tc() {
        m35446vf();
    }

    public final void m35448tf() {
        TextView textView = this.f7588x0;
        float f = this.f7575V0;
        float f2 = 1.0f - this.f7558E0;
        float f3 = this.f7576W0;
        textView.setAlpha(C5069h.m24090d(f * (1.0f - Math.max(f2, f3 >= 0.5f ? (f3 - 0.5f) / 0.5f : 0.0f))));
        this.f7588x0.setScaleX((this.f7576W0 * (f7553Y0 - 1.0f)) + 1.0f);
        this.f7588x0.setScaleY((this.f7576W0 * (f7553Y0 - 1.0f)) + 1.0f);
        float d = C5069h.m24090d(this.f7575V0 * this.f7576W0);
        this.f7589y0.setAlpha(d);
        this.f7590z0.setAlpha(d);
        float f4 = 1.0f / f7553Y0;
        float f5 = 1.0f - f4;
        this.f7589y0.setScaleX((this.f7576W0 * f5) + f4);
        this.f7589y0.setScaleY(f4 + (f5 * this.f7576W0));
        this.f7582r0.setMainAlpha(1.0f - C5069h.m24090d(this.f7575V0 * this.f7576W0));
        m35447uf();
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    public final void m35447uf() {
        int i;
        int i2;
        int measuredHeight;
        int measuredWidth = ((View) this.f7589y0.getParent()).getMeasuredWidth();
        int measuredHeight2 = ((View) this.f7589y0.getParent()).getMeasuredHeight();
        int measuredWidth2 = this.f7589y0.getMeasuredWidth();
        int measuredHeight3 = this.f7589y0.getMeasuredHeight();
        int measuredWidth3 = this.f7588x0.getMeasuredWidth();
        int i3 = (C1357a0.m37544i(42.0f) - this.f7588x0.getPaddingTop()) + (this.f7588x0.getMeasuredHeight() / 2);
        int i4 = (measuredHeight2 / 2) - C1357a0.m37544i(24.0f);
        float f = (measuredWidth - measuredWidth3) + (measuredWidth3 / 2);
        float f2 = this.f7576W0;
        int i5 = (int) (f + (((measuredWidth / 2) - i2) * f2));
        int i6 = (int) (i3 + ((i4 - i3) * f2));
        this.f7589y0.setTranslationX(i5 - (measuredWidth2 / 2));
        this.f7589y0.setTranslationY(i6 - (measuredHeight3 / 2));
        this.f7588x0.setTranslationX(i5 - i);
        this.f7588x0.setTranslationY(i6 - measuredHeight);
    }

    public final void m35446vf() {
        boolean z = false;
        this.f7570Q0 = m9339Ta() || this.f7570Q0;
        if (C4779t2.m25654L0(this.f7578n0) && this.f7570Q0) {
            z = true;
        }
        m35458jf(z);
    }

    public final void m35445wf() {
        m35457kf(!m9347Sa() && this.f7578n0.state.getConstructor() == -2000107571);
    }

    @Override
    public void mo1561x0(int i, int i2) {
        if (!m9347Sa()) {
            m35452pf();
        }
    }
}
