package tc;

import ae.l;
import ae.p;
import ae.v;
import ae.z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import de.d6;
import de.rh;
import eb.k;
import gd.w;
import hd.d7;
import he.i;
import ie.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kb.j;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.f3;
import ne.j2;
import ne.k2;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import tc.f0;
import tc.h;
import ud.d1;
import ud.q1;
import ud.r;
import ud.v4;
import zd.hj;
import zd.o6;

public class y1 extends FrameLayoutFix implements h.c, View.OnClickListener, a.h, ud.a, ud.c, j2.d, j2.f, k.b, l, w.a, kb.c, j2.i {
    public ImageView A0;
    public float B0;
    public boolean C0;
    public k D0;
    public float E0;
    public k F0;
    public boolean G0;
    public boolean H0;
    public float I0;
    public d1 J0;
    public int M;
    public g N;
    public boolean O;
    public rh P;
    public o<?>[] Q;
    public tc.h R;
    public f3 S;
    public o<?> T;
    public ViewGroup U;
    public final v4<?> W;
    public boolean f23344a0;
    public boolean f23345b0;
    public j2 f23346c0;
    public j2 f23347d0;
    public j2 f23348e0;
    public boolean f23349f0;
    public boolean f23350g0;
    public o<?> f23351h0;
    public View f23352i0;
    public View f23353j0;
    public int f23354k0;
    public int f23355l0;
    public float f23356m0;
    public boolean f23359p0;
    public boolean f23360q0;
    public int f23361r0;
    public boolean f23362s0;
    public boolean f23363t0;
    public boolean f23364u0;
    public r f23365v0;
    public ImageView f23366w0;
    public c0 f23367x0;
    public ud.b f23368y0;
    public TextView f23369z0;
    public final v V = new v();
    public int f23357n0 = -1;
    public float f23358o0 = 1.0f;
    public int K0 = -1;
    public boolean L0 = true;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            y1.this.getCurrentController().Tf();
            if (y1.this.f23348e0 != null) {
                y1.this.f23348e0.B2();
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (y1.this.f23347d0 != null) {
                y1.this.f23347d0.C2();
            }
            y1.this.getCurrentController().Xf(true);
        }
    }

    public class c extends ImageView {
        public c(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return isEnabled() && p0.z(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class d extends ImageView {
        public d(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return isEnabled() && p0.z(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class e extends ud.b {
        public e(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() != 0 || isEnabled()) && super.onTouchEvent(motionEvent);
        }
    }

    public class f extends d1 {
        public f(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return true;
        }
    }

    public interface g {
    }

    public interface h extends g {
        void B4(ld.l lVar, boolean z10);

        void D2(ld.l lVar, boolean z10);
    }

    public y1(v4<?> v4Var) {
        super(v4Var.t());
        this.W = v4Var;
    }

    public void A2(ValueAnimator valueAnimator) {
        setRevealFactor(db.b.a(valueAnimator));
    }

    public void B2(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        getCurrentController().Yf(new TdApi.MessageSendOptions(z10, false, false, messageSchedulingState), false);
    }

    public void C2(r rVar) {
        c2();
    }

    public List D2(View view) {
        List<c0.a> X2 = w3().hd().X2(getTargetChatId(), false, getCurrentController().ff(), true);
        if (X2 == null) {
            X2 = new ArrayList<>();
        }
        getCurrentController().Xe(X2);
        if (!X2.isEmpty()) {
            return X2;
        }
        return null;
    }

    public void E2(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        getCurrentController().Yf(new TdApi.MessageSendOptions(false, false, false, messageSchedulingState), true);
    }

    public void F2(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        getCurrentController().Yf(new TdApi.MessageSendOptions(true, false, false, messageSchedulingState), false);
    }

    public void G2(TdApi.MessageSchedulingState messageSchedulingState) {
        getCurrentController().Yf(new TdApi.MessageSendOptions(false, false, false, messageSchedulingState), false);
    }

    public void I2(View view, View view2) {
        switch (view.getId()) {
            case R.id.btn_sendNoMarkdown:
                Z2(new hj.o() {
                    @Override
                    public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                        y1.this.E2(z10, messageSchedulingState, z11);
                    }
                });
                return;
            case R.id.btn_sendNoSound:
                Z2(new hj.o() {
                    @Override
                    public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                        y1.this.F2(z10, messageSchedulingState, z11);
                    }
                });
                return;
            case R.id.btn_sendOnceOnline:
                getCurrentController().Yf(new TdApi.MessageSendOptions(false, false, false, new TdApi.MessageSchedulingStateSendWhenOnline()), false);
                return;
            case R.id.btn_sendScheduled:
                if (this.P != null) {
                    w3().hd().J7(this.P, new j() {
                        @Override
                        public final void a(Object obj) {
                            y1.this.G2((TdApi.MessageSchedulingState) obj);
                        }
                    }, getTargetChatId(), false, false, null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void J2(d7 d7Var, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.up(d7Var.r(), true, new TdApi.MessageSendOptions(z10, false, false, messageSchedulingState));
        }
        p2(false);
    }

    public void L2(String str, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.yp(Collections.singletonList(str), this.C0, true, z10, messageSchedulingState);
        }
        p2(false);
    }

    public void M2(boolean z10, ld.h hVar, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        if (z10) {
            if (hVar instanceof h1) {
                h1 h1Var = (h1) hVar;
                long D0 = h1Var.D0();
                String E0 = h1Var.E0();
                rh rhVar = this.P;
                if (rhVar != null) {
                    rhVar.zp(D0, E0, true, false, z11, messageSchedulingState);
                }
            } else {
                throw new IllegalArgumentException("image.getType() == " + ((int) hVar.C()));
            }
        }
        p2(false);
    }

    public void N2(double d10, double d11, double d12, int i10, int i11, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        if (this.P != null) {
            TdApi.Location location = new TdApi.Location(d10, d11, d12);
            if (s2()) {
                this.P.Dp(location, i10, z10, messageSchedulingState);
            } else {
                this.P.np(new TdApi.InputMessageLocation(location, i11, i10, 0), true, z10, messageSchedulingState, null);
            }
        }
        p2(false);
    }

    public void P2(f0.h hVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.Ap(Collections.singletonList(hVar), this.C0, true, z10, messageSchedulingState);
        }
        p2(false);
    }

    public void R2(z1 z1Var, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.np(z1Var.a(), true, z10, messageSchedulingState, null);
        }
        p2(false);
    }

    private int getBottomBarHeight() {
        ViewGroup viewGroup = this.U;
        return viewGroup != null ? viewGroup.getMeasuredHeight() : tc.h.getBarHeight();
    }

    public o<?> getCurrentController() {
        tc.h hVar = this.R;
        return hVar != null ? this.Q[hVar.getCurrentIndex()] : this.Q[0];
    }

    private void setAddExtraSpacing(boolean z10) {
        if (this.H0 != z10) {
            this.H0 = z10;
            o<?> oVar = this.T;
            if (oVar != null) {
                oVar.pg();
            }
        }
    }

    private void setCounterEnabled(boolean z10) {
        r rVar = this.f23365v0;
        if (rVar != null && rVar.isEnabled() != z10) {
            this.f23365v0.setEnabled(z10);
            this.A0.setEnabled(z10);
            this.f23366w0.setEnabled(z10);
            this.f23368y0.setEnabled(z10);
        }
    }

    private void setCounterFactor(float f10) {
        if (this.E0 != f10) {
            X1(f10);
            if (!this.G0 || this.f23358o0 != 0.0f) {
                setCounterFactorInternal(f10);
            }
            x3();
        }
    }

    private void setCounterFactorInternal(float f10) {
        tc.h hVar = this.R;
        if (hVar != null) {
            hVar.setOverlayFactor(f10);
        }
        r rVar = this.f23365v0;
        if (rVar != null) {
            rVar.setAlpha(f10);
            this.f23366w0.setAlpha(f10);
            this.f23368y0.setAlpha(f10);
            c2();
        }
        setCounterEnabled(f10 != 0.0f);
    }

    private void setGroupMediaFactor(float f10) {
        if (this.B0 != f10) {
            this.B0 = f10;
            this.A0.setColorFilter(ib.d.d(ae.j.L(R.id.theme_color_icon), ae.j.L(R.id.theme_color_iconActive), f10));
        }
    }

    private void setRevealFactor(float f10) {
        j2 j2Var = this.f23346c0;
        if (j2Var != null) {
            j2Var.setRevealFactor(f10);
        }
        setBottomBarFactor(f10);
        View v92 = this.T.get();
        int i10 = this.f23361r0;
        v92.setTranslationY(i10 - ((int) (i10 * f10)));
    }

    public void z2(float f10, float f11, float f12, float f13, float f14, float f15, ValueAnimator valueAnimator) {
        float a10 = db.b.a(valueAnimator);
        this.f23358o0 = f10 + (f11 * a10);
        if (f12 != 0.0f) {
            X1(f12 + (f13 * a10));
        }
        x3();
        setHeaderFactor(f14 + (f15 * a10));
        getCurrentController().Uf(a10);
        this.f23348e0.setRevealFactor(1.0f - a10);
    }

    @Override
    public void C4(int i10, int i11, float f10, boolean z10) {
        ae.k.c(this, i10, i11, f10, z10);
    }

    @Override
    public void E(float f10) {
        this.f23352i0.setTranslationY(this.f23356m0 + Math.round(this.f23354k0 * f10));
        View view = this.f23353j0;
        int i10 = this.f23355l0;
        view.setTranslationY(i10 - Math.round(i10 * f10));
        invalidateOutline();
        V2();
    }

    @Override
    public void H2(j2 j2Var) {
        this.f23347d0 = j2Var;
        l2().start();
    }

    @Override
    public void M4() {
        o<?>[] oVarArr;
        for (o<?> oVar : this.Q) {
            if (oVar != null) {
                oVar.M4();
            }
        }
    }

    @Override
    public void Q0(int r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: tc.y1.Q0(int, boolean):void");
    }

    @Override
    public void Q2() {
        o<?>[] oVarArr;
        rh rhVar;
        setContentVisible(true);
        this.f23363t0 = true;
        V2();
        for (o<?> oVar : this.Q) {
            if (oVar != null) {
                removeView(oVar.get());
                if (!oVar.Sa()) {
                    oVar.Z8();
                }
            }
        }
        if (this.f23364u0 && (rhVar = this.P) != null) {
            rhVar.Vq();
        }
        z.u().U(this);
        w.F2(this);
        rh rhVar2 = this.P;
        if (rhVar2 != null) {
            rhVar2.Mp(TdApi.ChatActionCancel.CONSTRUCTOR);
        }
    }

    @Override
    public void Q5(int i10, int i11) {
        w.H1(i10, i11);
    }

    public void S2(boolean z10) {
        if (z10) {
            a2();
        } else {
            p2(false);
        }
    }

    public void T2() {
        invalidateOutline();
    }

    @Override
    public boolean U1(j2 j2Var, k kVar) {
        this.f23348e0 = j2Var;
        Animator k22 = k2();
        if (k22 != null) {
            k22.start();
            return true;
        }
        this.f23348e0 = null;
        return false;
    }

    @Override
    public boolean V0() {
        return true;
    }

    public final void V2() {
        j2 j2Var;
        if (fd.a.f11902x && this.R != null) {
            org.thunderdog.challegram.a r10 = j0.r(getContext());
            final tc.h hVar = this.R;
            Objects.requireNonNull(hVar);
            r10.Y2(new kb.g() {
                @Override
                public final int get() {
                    return h.this.getCurrentColor();
                }
            }, this.f23363t0 ? 0.0f : this.f23358o0 * (1.0f - this.E0), this.f23350g0 || ((j2Var = this.f23346c0) != null && j2Var.u2()) || this.f23359p0);
        }
    }

    public final void X1(float f10) {
        if (this.E0 != f10) {
            this.E0 = f10;
            setAddExtraSpacing(f10 == 1.0f);
        }
    }

    public void X2() {
        p2(false);
        j0.Y(getContext());
    }

    public final void Y1(float f10) {
        boolean z10 = true;
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        this.f23359p0 = i10 == 0;
        V2();
        k kVar = this.F0;
        if (kVar == null) {
            this.F0 = new k(0, this, db.b.f7287b, 200L, this.E0);
        } else {
            kVar.k();
        }
        if (this.f23358o0 != 0.0f) {
            z10 = false;
        }
        this.G0 = z10;
        tc.h hVar = this.R;
        if (hVar != null) {
            hVar.j2();
        }
        if (this.G0 && i10 == 0) {
            setCounterFactorInternal(1.0f);
        }
        this.F0.i(f10);
    }

    public void Y2(boolean z10) {
        p2(false);
        j0.a0(z10);
    }

    public boolean Z1() {
        rh rhVar = this.P;
        return rhVar != null && rhVar.ui();
    }

    public void Z2(hj.o oVar) {
        rh rhVar = this.P;
        if (rhVar == null || !rhVar.ui()) {
            oVar.a(false, null, false);
        } else {
            w3().hd().L8(this.P, getTargetChatId(), false, oVar, null);
        }
    }

    public void a2() {
        Y1(0.0f);
        getCurrentController().Wf();
    }

    public void a3(Runnable runnable, long j10) {
        getCurrentController().eg(runnable, j10);
    }

    public final void b3() {
        if (this.f23365v0 == null && this.R != null) {
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, a0.i(53.0f), 51);
            r12.leftMargin = a0.i(74.0f);
            r12.rightMargin = a0.i(56.0f);
            r rVar = new r(getContext());
            this.f23365v0 = rVar;
            rVar.setFactorChangeListener(new r.c() {
                @Override
                public final void a(r rVar2) {
                    y1.this.C2(rVar2);
                }
            });
            this.f23365v0.y(R.id.theme_color_text);
            this.V.f(this.f23365v0);
            this.f23365v0.F(w.o2(R.string.SelectedSuffix, 1L), false);
            this.f23365v0.setLayoutParams(r12);
            this.R.addView(this.f23365v0);
            this.C0 = !i.c2().E3() || i.c2().F2();
            FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-2, a0.i(53.0f), 51);
            r13.leftMargin = a0.i(74.0f);
            r13.rightMargin = a0.i(56.0f);
            r13.topMargin = a0.i(28.0f);
            b2 b2Var = new b2(getContext());
            this.f23369z0 = b2Var;
            b2Var.setTextSize(1, 13.0f);
            this.f23369z0.setTextColor(ae.j.R0());
            this.V.k(this.f23365v0);
            this.f23369z0.setTypeface(o.k());
            this.f23369z0.setEllipsize(TextUtils.TruncateAt.END);
            this.f23369z0.setSingleLine(true);
            this.f23369z0.setLayoutParams(r13);
            this.f23369z0.setText(w.i1(this.C0 ? R.string.AsOneMessage : R.string.AsSeparateMessages));
            this.B0 = this.C0 ? 1.0f : 0.0f;
            this.R.addView(this.f23369z0);
            c cVar = new c(getContext());
            this.f23366w0 = cVar;
            cVar.setId(R.id.btn_send);
            this.f23366w0.setScaleType(ImageView.ScaleType.CENTER);
            this.f23366w0.setImageResource(R.drawable.deproko_baseline_send_24);
            this.f23366w0.setColorFilter(ae.j.j());
            this.V.e(this.f23366w0, R.id.theme_color_chatSendButton);
            this.f23366w0.setLayoutParams(FrameLayoutFix.r1(a0.i(55.0f), -1, 5));
            p0.T(this.f23366w0);
            this.f23366w0.setOnClickListener(this);
            this.R.addView(this.f23366w0);
            this.f23367x0 = new c0(new c0.c() {
                @Override
                public final List F3(View view) {
                    List D2;
                    D2 = y1.this.D2(view);
                    return D2;
                }
            }, new c0.b() {
                @Override
                public final void I0(View view, View view2) {
                    y1.this.I2(view, view2);
                }
            }, this.V, null).d(this.f23366w0);
            FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(a0.i(55.0f), -1, 5);
            r14.rightMargin = a0.i(55.0f);
            d dVar = new d(getContext());
            this.A0 = dVar;
            dVar.setOnClickListener(this);
            this.A0.setId(R.id.btn_mosaic);
            this.A0.setScaleType(ImageView.ScaleType.CENTER);
            this.A0.setImageResource(R.drawable.deproko_baseline_mosaic_group_24);
            int i10 = this.C0 ? R.id.theme_color_iconActive : R.id.theme_color_icon;
            this.A0.setColorFilter(ae.j.L(i10));
            this.V.e(this.A0, i10);
            this.A0.setLayoutParams(r14);
            this.R.addView(this.A0);
            e eVar = new e(getContext());
            this.f23368y0 = eVar;
            eVar.setId(R.id.btn_close);
            yd.d.j(this.f23368y0);
            this.f23368y0.setButtonFactor(4);
            this.f23368y0.setOnClickListener(this);
            this.f23368y0.setColor(ae.j.o0());
            this.V.c(this.f23368y0, R.id.theme_color_icon);
            this.f23368y0.setLayoutParams(FrameLayoutFix.r1(a0.i(56.0f), -1, 3));
            this.R.addView(this.f23368y0);
            this.f23365v0.setAlpha(0.0f);
            this.f23366w0.setAlpha(0.0f);
            this.f23368y0.setAlpha(0.0f);
            this.f23369z0.setAlpha(0.0f);
            this.A0.setAlpha(0.0f);
            setCounterEnabled(false);
        }
        r rVar2 = this.f23365v0;
        if (rVar2 != null) {
            rVar2.setTranslationY(0.0f);
            f2(false);
        }
    }

    @Override
    public void c0() {
    }

    public final void c2() {
        r rVar = this.f23365v0;
        if (rVar != null) {
            float multipleFactor = rVar.getMultipleFactor();
            if (multipleFactor > 0.0f && (this.E0 == 0.0f || !getCurrentController().og())) {
                multipleFactor = 0.0f;
            }
            float f10 = this.E0 * multipleFactor;
            this.A0.setAlpha(f10);
            this.f23369z0.setAlpha(f10);
            this.f23365v0.setTranslationY((-a0.i(9.0f)) * multipleFactor);
        }
    }

    @Override
    public void c6() {
        getCurrentController().c6();
    }

    public final void d2() {
        TextView textView;
        r rVar = this.f23365v0;
        if (rVar != null && (textView = this.f23369z0) != null) {
            if (this.C0) {
                int ceil = (int) Math.ceil(rVar.getCounter() / 10.0f);
                if (ceil > 1) {
                    this.f23369z0.setText(w.o2(R.string.AsXMessages, ceil));
                } else {
                    this.f23369z0.setText(w.i1(R.string.AsOneMessage));
                }
            } else {
                textView.setText(w.i1(R.string.AsSeparateMessages));
            }
        }
    }

    public void d3() {
        tc.h hVar = this.R;
        int currentIndex = hVar != null ? hVar.getCurrentIndex() : 0;
        getCurrentController();
        if (this.J0 == null) {
            f fVar = new f(getContext());
            this.J0 = fVar;
            fVar.n3(getCurrentController(), true);
            this.J0.setAlpha(0.0f);
            this.J0.setTranslationY((-d1.a3(false)) - this.J0.getFilling().t());
            addView(this.J0);
            this.K0 = currentIndex;
        }
        if (this.K0 != currentIndex) {
            this.J0.setTitle(getCurrentController());
            this.K0 = currentIndex;
        }
    }

    public final void e3() {
        this.f23361r0 = this.T.Cf();
        this.T.get().setTranslationY(this.f23361r0);
        invalidateOutline();
        setBottomBarFactor(0.0f);
    }

    @Override
    public void f1(int i10) {
        o<?>[] oVarArr = this.Q;
        if (oVarArr[i10] != null) {
            oVarArr[i10].kf();
        }
    }

    public final void f2(boolean z10) {
        ArrayList<ld.h> L0;
        o<?> currentController = getCurrentController();
        int i10 = 1;
        if (!(currentController instanceof u0) || (L0 = ((u0) currentController).L0(false)) == null || L0.isEmpty()) {
            r rVar = this.f23365v0;
            rVar.F(w.o2(R.string.SelectedSuffix, Math.max(1, rVar.getCounter())), z10);
            return;
        }
        Iterator<ld.h> it = L0.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            ld.h next = it.next();
            if (next.M() || !(next instanceof ld.l)) {
                break;
            } else if (((ld.l) next).e1()) {
                i12++;
                if (i11 > 0) {
                    break;
                }
            } else {
                i11++;
                if (i12 > 0) {
                    break;
                }
            }
        }
        i10 = 0;
        if (i10 > 0 || (i11 > 0 && i12 > 0)) {
            this.f23365v0.F(w.o2(R.string.AttachMediasSuffix, i10 + i11 + i12), z10);
        } else if (i12 > 0) {
            this.f23365v0.F(w.o2(R.string.AttachVideosSuffix, i12), z10);
        } else {
            this.f23365v0.F(w.o2(R.string.AttachPhotosSuffix, i11), z10);
        }
    }

    public void f3(final d7 d7Var) {
        Z2(new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                y1.this.J2(d7Var, z10, messageSchedulingState, z11);
            }
        });
    }

    public void g2(d7 d7Var) {
        rh rhVar;
        if (!(d7Var.r() == null || (rhVar = this.P) == null)) {
            rhVar.yo(d7Var.r().username);
        }
        this.f23364u0 = true;
        p2(false);
    }

    public void g3(k0.e<d7> eVar, TdApi.MessageSendOptions messageSendOptions) {
        int p10;
        if (eVar != null && eVar.p() != 0) {
            if (this.P != null && (p10 = eVar.p()) > 0) {
                int i10 = 0;
                while (i10 < p10) {
                    this.P.up(eVar.q(i10).r(), i10 == 0, messageSendOptions);
                    i10++;
                }
            }
            p2(true);
        }
    }

    public float getCounterFactor() {
        return this.E0;
    }

    public int getCurrentBottomBarHeight() {
        return (int) (getBottomBarHeight() * Math.max(this.f23358o0, this.E0));
    }

    public int getCurrentContentWidth() {
        tc.h hVar = this.R;
        return hVar != null ? hVar.getCurrentBarWidth() : a0.g();
    }

    public d1 getHeaderView() {
        if (this.J0 == null) {
            d3();
        }
        return this.J0;
    }

    public rh getTarget() {
        return this.P;
    }

    public long getTargetChatId() {
        rh rhVar = this.P;
        if (rhVar != null) {
            return rhVar.C9();
        }
        return 0L;
    }

    public long getTargetMessageThreadId() {
        rh rhVar = this.P;
        if (rhVar != null) {
            return rhVar.qk();
        }
        return 0L;
    }

    public void h2(String str) {
        rh rhVar = this.P;
        if (rhVar != null) {
            rhVar.yo(str);
        }
        this.f23364u0 = true;
        p2(false);
    }

    @Override
    public void h3(j2 j2Var) {
        Q2();
    }

    public void i2() {
        Y1(0.0f);
        getCurrentController().Wf();
    }

    @Override
    public void i3(p pVar, p pVar2) {
        ae.k.b(this, pVar, pVar2);
    }

    @Override
    public boolean j0(boolean z10) {
        o<?> currentController = getCurrentController();
        if (currentController.Kf() || currentController.jc(z10)) {
            return true;
        }
        r rVar = this.f23365v0;
        if (rVar != null && rVar.isEnabled()) {
            if (!currentController.ng(false)) {
                a2();
            }
            return true;
        } else if (!currentController.Lf()) {
            return currentController.ng(false);
        } else {
            currentController.gf();
            return true;
        }
    }

    public o<?> j2(int i10) {
        int i11 = this.M;
        if (i11 == 1) {
            return new c1(this);
        }
        if (i11 == 2) {
            return new u0(this);
        }
        if (this.f23344a0) {
            i10 = (this.Q.length - i10) - 1;
        }
        if (i10 == 0) {
            return new t(this);
        }
        if (i10 == 1) {
            return new f0(this);
        }
        if (i10 == 2) {
            return new u0(this);
        }
        if (i10 == 3) {
            return new c1(this);
        }
        if (i10 == 4) {
            return new z0(this);
        }
        throw new IllegalArgumentException("Unknown index passed: " + i10);
    }

    public void j3(final String str) {
        Z2(new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                y1.this.L2(str, z10, messageSchedulingState, z11);
            }
        });
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        o<?> currentController;
        this.V.n(z10);
        if (this.J0 != null && (currentController = getCurrentController()) != null) {
            this.J0.G3(currentController, null);
        }
    }

    public Animator k2() {
        a aVar = new a();
        if (this.f23349f0) {
            int measuredWidth = getMeasuredWidth() - ((int) (this.f23366w0.getMeasuredWidth() * 0.5f));
            int measuredHeight = getMeasuredHeight() - ((int) (this.f23366w0.getMeasuredHeight() * 0.5f));
            if (this.I0 != 0.0f) {
                setContentVisible(true);
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, measuredWidth, measuredHeight, (float) Math.hypot(getMeasuredWidth(), getMeasuredHeight()), 0.0f);
            createCircularReveal.setInterpolator(db.b.f7287b);
            createCircularReveal.setDuration(285L);
            createCircularReveal.addListener(aVar);
            j2 j2Var = this.f23348e0;
            if (j2Var != null) {
                j2Var.j2(0.0f);
            }
            return createCircularReveal;
        }
        ValueAnimator b10 = db.b.b();
        b10.setDuration(220L);
        final float f10 = this.f23358o0;
        final float f11 = -f10;
        final float f12 = this.E0;
        final float f13 = -f12;
        final float f14 = this.I0;
        final float f15 = -f14;
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                y1.this.z2(f10, f11, f12, f13, f14, f15, valueAnimator);
            }
        });
        b10.addListener(aVar);
        b10.setInterpolator(db.b.f7287b);
        getCurrentController().Vf(true);
        return b10;
    }

    public Animator l2() {
        ValueAnimator b10 = db.b.b();
        b10.setDuration(220L);
        b10.setInterpolator(db.b.f7287b);
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                y1.this.A2(valueAnimator);
            }
        });
        b10.addListener(new b());
        e3();
        return b10;
    }

    public void l3(List<String> list, ArrayList<f0.h> arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z10) {
        boolean z11;
        if ((list != null && !list.isEmpty()) || (arrayList != null && !arrayList.isEmpty())) {
            if (z10) {
                z11 = this.C0;
                i.c2().X4(z11);
            } else {
                z11 = !i.c2().E3() || i.c2().F2();
            }
            rh rhVar = this.P;
            if (rhVar != null) {
                if (list != null) {
                    rhVar.yp(list, z11, true, messageSendOptions.disableNotification, messageSendOptions.schedulingState);
                }
                if (arrayList != null) {
                    this.P.Ap(arrayList, z11, true, messageSendOptions.disableNotification, messageSendOptions.schedulingState);
                }
            }
            p2(z10);
        }
    }

    public void m2() {
        if (!this.f23350g0) {
            this.f23350g0 = true;
            this.f23346c0.s2(false);
        }
    }

    public void m3(final ld.h hVar, final boolean z10) {
        Z2(new hj.o() {
            @Override
            public final void a(boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
                y1.this.M2(z10, hVar, z11, messageSchedulingState, z12);
            }
        });
    }

    public final o<?> n2(int i10) {
        o<?> oVar = this.Q[i10];
        if (oVar != null) {
            return oVar;
        }
        o<?> j22 = j2(i10);
        j22.O8(this.V);
        this.Q[i10] = j22;
        return j22;
    }

    public void n3(final double d10, final double d11, final double d12, final int i10, final int i11) {
        Z2(new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                y1.this.N2(d10, d11, d12, i10, i11, z10, messageSchedulingState, z11);
            }
        });
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setCounterFactor(f10);
        } else if (i10 == 1) {
            setGroupMediaFactor(f10);
        }
    }

    public void o3(final f0.h hVar) {
        Z2(new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                y1.this.P2(hVar, z10, messageSchedulingState, z11);
            }
        });
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0 && f10 == 0.0f && this.G0) {
            setCounterFactorInternal(0.0f);
        }
    }

    @Override
    public void o6() {
        getCurrentController().o6();
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.btn_close) {
            if (id2 == R.id.btn_mosaic) {
                s3(!this.C0, true);
            } else if (id2 == R.id.btn_send) {
                Z2(new hj.o() {
                    @Override
                    public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                        y1.this.B2(z10, messageSchedulingState, z11);
                    }
                });
            }
        } else if (!getCurrentController().ng(true)) {
            a2();
        }
    }

    @Override
    public void p(int i10) {
        rh rhVar;
        removeView(this.f23352i0);
        this.f23351h0.gg();
        this.f23351h0.c6();
        o<?>[] oVarArr = this.Q;
        this.T = oVarArr[i10];
        oVarArr[i10].Xf(false);
        V2();
        if (this.M == 0 && (rhVar = this.P) != null) {
            rhVar.Mp(this.Q[i10].pf());
        }
    }

    @Override
    public boolean p0(int i10, int i11) {
        k kVar;
        boolean z10;
        if (this.E0 != 0.0f || (((kVar = this.F0) != null && kVar.v()) || getCurrentController().Kf())) {
            return false;
        }
        if (i11 != 1) {
            if (i11 == 3) {
                try {
                    h6.d.a(getContext());
                    z10 = db.c.b(getContext(), "com.google.android.apps.maps");
                } catch (Throwable unused) {
                    z10 = false;
                }
                if (!z10) {
                    v4<?> t10 = j0.t(getContext());
                    if (t10 != null) {
                        t10.Tc();
                    } else {
                        j0.y0(R.string.NoGoogleMaps, 1);
                    }
                    return false;
                }
            } else if (i11 == 4 && this.f23345b0) {
                rh rhVar = this.P;
                if (rhVar != null && rhVar.Ta()) {
                    long targetChatId = getTargetChatId();
                    if (targetChatId != 0) {
                        d6 d6Var = new d6(this.P.t(), this.P.c());
                        d6Var.kh(new d6.d(targetChatId, this.P.pk(), this.P));
                        this.W.ac(d6Var);
                        p2(false);
                    }
                }
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 23 && !(getContext().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
            this.f23357n0 = i11;
            ((org.thunderdog.challegram.a) getContext()).P2();
            return false;
        }
        o<?> oVar = this.Q[i10];
        this.f23351h0 = oVar;
        this.f23354k0 = oVar.rf();
        View v92 = this.f23351h0.get();
        this.f23352i0 = v92;
        this.f23356m0 = v92.getTranslationY();
        o<?> n22 = n2(i11);
        this.f23353j0 = n22.get();
        int Cf = n22.Cf();
        this.f23355l0 = Cf;
        this.f23353j0.setTranslationY(Cf);
        if (n22.Xa()) {
            n22.o6();
        }
        addView(this.f23353j0, 1);
        return true;
    }

    public void p2(boolean z10) {
        if (!this.f23350g0) {
            r3();
            this.f23349f0 = z10;
            this.f23346c0.s2(true);
        }
    }

    public void p3(ArrayList<ld.h> arrayList, boolean z10, TdApi.MessageSendOptions messageSendOptions, boolean z11, boolean z12) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z10) {
                Iterator<ld.h> it = arrayList.iterator();
                boolean z13 = true;
                while (it.hasNext()) {
                    ld.h next = it.next();
                    if (next instanceof h1) {
                        h1 h1Var = (h1) next;
                        long D0 = h1Var.D0();
                        String E0 = h1Var.E0();
                        rh rhVar = this.P;
                        if (rhVar != null) {
                            rhVar.zp(D0, E0, z13, false, messageSendOptions.disableNotification, messageSendOptions.schedulingState);
                        }
                        z13 = false;
                    }
                }
                p2(true);
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator<ld.h> it2 = arrayList.iterator();
            boolean z14 = true;
            while (it2.hasNext()) {
                ld.h next2 = it2.next();
                if (next2 instanceof ld.l) {
                    ld.l lVar = (ld.l) next2;
                    if (lVar.q() != null) {
                        arrayList2.add(lVar);
                    }
                    g gVar = this.N;
                    if (gVar != null && (gVar instanceof h)) {
                        if (lVar.e1()) {
                            ((h) this.N).B4(lVar, z14);
                        } else {
                            ((h) this.N).D2(lVar, z14);
                        }
                    }
                    z14 = false;
                } else {
                    throw new IllegalArgumentException("rawFile instanceof " + next2.getClass().getName());
                }
            }
            if (this.P != null) {
                ld.l[] lVarArr = new ld.l[arrayList2.size()];
                arrayList2.toArray(lVarArr);
                i.c2().X4(this.C0);
                this.P.Cp(lVarArr, this.C0, messageSendOptions, z11, z12);
            }
            p2(true);
        }
    }

    @Override
    public void q0(int i10) {
        ae.k.a(this, i10);
    }

    public void q3(final z1 z1Var) {
        Z2(new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                y1.this.R2(z1Var, z10, messageSchedulingState, z11);
            }
        });
    }

    public void r2() {
        this.f23360q0 = true;
        p2(false);
    }

    public void r3() {
        if (!this.f23350g0) {
            this.f23350g0 = true;
            V2();
        }
    }

    public boolean s2() {
        return this.M != 0;
    }

    public final void s3(boolean z10, boolean z11) {
        if (this.C0 != z10) {
            this.C0 = z10;
            i.c2().X4(z10);
            this.V.o(this.A0);
            this.V.e(this.A0, z10 ? R.id.theme_color_iconActive : R.id.theme_color_icon);
            d2();
            float f10 = 1.0f;
            if (z11) {
                if (this.D0 == null) {
                    this.D0 = new k(1, this, db.b.f7287b, 180L, this.B0);
                }
                k kVar = this.D0;
                if (!z10) {
                    f10 = 0.0f;
                }
                kVar.i(f10);
                return;
            }
            k kVar2 = this.D0;
            if (kVar2 != null) {
                kVar2.l(0.0f);
            }
            if (!z10) {
                f10 = 0.0f;
            }
            setGroupMediaFactor(f10);
        }
    }

    public void setBottomBarFactor(float f10) {
        if (this.f23358o0 != f10) {
            this.f23358o0 = f10;
            x3();
        }
    }

    public void setCallback(g gVar) {
        this.N = gVar;
    }

    public void setContentVisible(boolean z10) {
        if (this.L0 != z10) {
            this.L0 = z10;
            q1 x10 = j0.x();
            if (x10 != null) {
                x10.get().setVisibility(z10 ? 0 : 4);
            }
        }
    }

    public void setCounter(int i10) {
        float f10 = 0.0f;
        boolean z10 = this.E0 == 0.0f && i10 == 1;
        if (z10) {
            b3();
        }
        if (i10 > 0) {
            f10 = 1.0f;
        }
        Y1(f10);
        r rVar = this.f23365v0;
        if (rVar != null) {
            if (z10) {
                rVar.w(i10, false);
                f2(false);
            } else if (i10 != 0) {
                rVar.E(i10);
            }
        }
        if (!z10 && i10 > 0) {
            f2(true);
            d2();
        }
    }

    public void setHeaderFactor(float f10) {
        if (this.I0 != f10) {
            this.I0 = f10;
            d1 d1Var = this.J0;
            if (d1Var != null && !this.f23362s0) {
                d1Var.setAlpha(f10);
                int a32 = d1.a3(false) + this.J0.getFilling().t();
                this.J0.setTranslationY((-a32) + ((int) (a32 * f10)));
            }
        }
    }

    public void t2(int i10, rh rhVar) {
        h.b[] bVarArr;
        h.b bVar;
        h.b bVar2;
        int i11 = i10;
        this.M = i11;
        this.P = rhVar;
        this.f23344a0 = w.G2();
        int i12 = 0;
        this.f23345b0 = false;
        if (i11 == 1) {
            bVarArr = new h.b[]{new h.b(R.drawable.baseline_location_on_24, R.string.Location, R.id.theme_color_attachLocation, a0.i(1.0f))};
        } else if (i11 != 2) {
            boolean M2 = w3().M2(getTargetChatId());
            this.f23345b0 = M2;
            if (this.f23344a0) {
                bVarArr = new h.b[5];
                if (M2) {
                    bVar2 = new h.b(R.drawable.baseline_poll_24, R.string.CreatePoll, R.id.theme_color_attachInlineBot);
                } else {
                    bVar2 = new h.b(R.drawable.deproko_baseline_bots_24, R.string.InlineBot, R.id.theme_color_attachInlineBot);
                }
                bVarArr[0] = bVar2;
                bVarArr[1] = new h.b(R.drawable.baseline_location_on_24, R.string.Location, R.id.theme_color_attachLocation, a0.i(1.0f));
                bVarArr[2] = new h.b(R.drawable.baseline_image_24, R.string.Gallery, R.id.theme_color_attachPhoto);
                bVarArr[3] = new h.b(R.drawable.baseline_insert_drive_file_24, R.string.File, R.id.theme_color_attachFile);
                bVarArr[4] = new h.b(R.drawable.baseline_person_24, R.string.AttachContact, R.id.theme_color_attachContact, a0.i(1.0f));
            } else {
                h.b[] bVarArr2 = new h.b[5];
                bVarArr2[0] = new h.b(R.drawable.baseline_person_24, R.string.AttachContact, R.id.theme_color_attachContact, a0.i(1.0f));
                bVarArr2[1] = new h.b(R.drawable.baseline_insert_drive_file_24, R.string.File, R.id.theme_color_attachFile);
                bVarArr2[2] = new h.b(R.drawable.baseline_image_24, R.string.Gallery, R.id.theme_color_attachPhoto);
                bVarArr2[3] = new h.b(R.drawable.baseline_location_on_24, R.string.Location, R.id.theme_color_attachLocation, a0.i(1.0f));
                if (this.f23345b0) {
                    bVar = new h.b(R.drawable.baseline_poll_24, R.string.CreatePoll, R.id.theme_color_attachInlineBot);
                } else {
                    bVar = new h.b(R.drawable.deproko_baseline_bots_24, R.string.InlineBot, R.id.theme_color_attachInlineBot);
                }
                bVarArr2[4] = bVar;
                bVarArr = bVarArr2;
            }
            i11 = 0;
            i12 = 2;
        } else {
            bVarArr = new h.b[]{new h.b(R.drawable.baseline_location_on_24, R.string.Gallery, R.id.theme_color_attachPhoto, a0.i(1.0f))};
        }
        this.Q = new o[bVarArr.length];
        if (i11 == 0) {
            tc.h hVar = new tc.h(getContext());
            this.R = hVar;
            hVar.k2(bVarArr, i12);
            this.R.setCallback(this);
            f3 f3Var = new f3(getContext());
            this.S = f3Var;
            f3Var.setSimpleTopShadow(true);
            this.V.f(this.R);
            FrameLayout.LayoutParams t12 = FrameLayoutFix.t1(this.S.getLayoutParams());
            t12.bottomMargin = this.R.getLayoutParams().height;
            t12.gravity = 80;
            this.S.setLayoutParams(t12);
            this.V.f(this.S);
        }
        o<?> n22 = n2(i12);
        this.T = n22;
        addView(n22.get());
        if (i11 == 0) {
            addView(this.R);
            addView(this.S);
        }
        setLayoutParams(FrameLayoutFix.q1(-1, -1));
        z.u().e(this);
        w.h(this);
    }

    public void t3() {
        this.O = true;
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        if (i10 == 110) {
            Q0(110, v0.z());
            return;
        }
        o<?> currentController = getCurrentController();
        if (currentController instanceof ud.a) {
            ((ud.a) currentController).u(i10, i11, intent);
        }
    }

    public void u2() {
        this.M = 3;
        this.Q = new o[1];
        o<?> n22 = n2(0);
        this.T = n22;
        addView(n22.get());
        if (this.M == 0) {
            ViewGroup hf = this.T.hf();
            this.U = hf;
            addView(hf);
            this.V.f(this.U);
            this.U.setLayoutParams(FrameLayoutFix.r1(-1, -2, 80));
            this.U.measure(0, Log.TAG_TDLIB_OPTIONS);
        }
        setLayoutParams(FrameLayoutFix.q1(-1, -1));
        z.u().e(this);
        w.h(this);
    }

    public void v2(rh rhVar) {
        t2(0, rhVar);
    }

    public void v3() {
        j2 j2Var = new j2(getContext());
        this.f23346c0 = j2Var;
        j2Var.setTouchDownInterceptor(this);
        this.f23346c0.setActivityListener(this);
        this.f23346c0.G2();
        this.f23346c0.setDismissListener(this);
        this.f23346c0.I2();
        this.f23346c0.L1(true);
        this.f23346c0.L2(this, this);
    }

    @Override
    public void w(j2 j2Var) {
        k2.a(this, j2Var);
    }

    public o6 w3() {
        return this.W.c();
    }

    public final void x3() {
        int bottomBarHeight = getBottomBarHeight();
        float max = bottomBarHeight - ((int) (bottomBarHeight * Math.max(this.f23358o0, this.E0)));
        if (!s2()) {
            tc.h hVar = this.R;
            if (hVar != null) {
                hVar.setTranslationY(max);
                V2();
            }
            ViewGroup viewGroup = this.U;
            if (viewGroup != null) {
                viewGroup.setTranslationY(max);
                V2();
            }
            f3 f3Var = this.S;
            if (f3Var != null) {
                f3Var.setTranslationY(max);
            }
        }
    }

    @Override
    public boolean y0(j2 j2Var, MotionEvent motionEvent) {
        o<?> currentController = getCurrentController();
        return currentController != null && currentController.ng(false);
    }

    public boolean y2() {
        return this.f23350g0;
    }
}
