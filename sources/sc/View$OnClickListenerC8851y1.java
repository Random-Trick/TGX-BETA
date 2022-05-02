package sc;

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
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import gd.C4618d7;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import me.C6847b2;
import me.C6879f3;
import me.C6924j2;
import me.C6941k2;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2059c;
import p038ce.View$OnClickListenerC2280d6;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3950k;
import p067ed.C4183a;
import p082fd.C4403w;
import p091g6.C4488d;
import p108hb.C5064d;
import p111he.View$OnTouchListenerC5103c0;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5915g;
import p139jb.AbstractC5918j;
import p143k0.C6035e;
import p156kd.C6246h;
import p156kd.C6253l;
import p335xd.C10189d;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11526l;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11524j;
import p364zd.C11525k;
import p364zd.C11537v;
import p364zd.C11541z;
import sc.GestureDetector$OnGestureListenerC8768h;
import sc.View$OnClickListenerC8750f0;
import td.AbstractC9142a;
import td.AbstractC9162c;
import td.AbstractC9323v4;
import td.C9270q1;
import td.C9279r;
import td.View$OnClickListenerC9150b;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC8851y1 extends FrameLayoutFix implements GestureDetector$OnGestureListenerC8768h.AbstractC8771c, View.OnClickListener, AbstractView$OnTouchListenerC7889a.AbstractC7897h, AbstractC9142a, AbstractC9162c, C6924j2.AbstractC6928d, C6924j2.AbstractC6930f, C3950k.AbstractC3952b, AbstractC11526l, C4403w.AbstractC4404a, AbstractC5911c, C6924j2.AbstractC6933i {
    public ImageView f28548A0;
    public float f28549B0;
    public boolean f28550C0;
    public C3950k f28551D0;
    public float f28552E0;
    public C3950k f28553F0;
    public boolean f28554G0;
    public boolean f28555H0;
    public float f28556I0;
    public View$OnClickListenerC9170d1 f28557J0;
    public int f28560M;
    public AbstractC8858g f28561N;
    public boolean f28562O;
    public View$OnClickListenerC2971rh f28563P;
    public AbstractC8809o<?>[] f28564Q;
    public GestureDetector$OnGestureListenerC8768h f28565R;
    public C6879f3 f28566S;
    public AbstractC8809o<?> f28567T;
    public ViewGroup f28568U;
    public final AbstractC9323v4<?> f28570W;
    public boolean f28571a0;
    public boolean f28572b0;
    public C6924j2 f28573c0;
    public C6924j2 f28574d0;
    public C6924j2 f28575e0;
    public boolean f28576f0;
    public boolean f28577g0;
    public AbstractC8809o<?> f28578h0;
    public View f28579i0;
    public View f28580j0;
    public int f28581k0;
    public int f28582l0;
    public float f28583m0;
    public boolean f28586p0;
    public boolean f28587q0;
    public int f28588r0;
    public boolean f28589s0;
    public boolean f28590t0;
    public boolean f28591u0;
    public C9279r f28592v0;
    public ImageView f28593w0;
    public View$OnTouchListenerC5103c0 f28594x0;
    public View$OnClickListenerC9150b f28595y0;
    public TextView f28596z0;
    public final C11537v f28569V = new C11537v();
    public int f28584n0 = -1;
    public float f28585o0 = 1.0f;
    public int f28558K0 = -1;
    public boolean f28559L0 = true;

    public class C8852a extends AnimatorListenerAdapter {
        public C8852a() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            View$OnClickListenerC8851y1.this.getCurrentController().m11312Tf();
            if (View$OnClickListenerC8851y1.this.f28575e0 != null) {
                View$OnClickListenerC8851y1.this.f28575e0.m18441G2();
            }
        }
    }

    public class C8853b extends AnimatorListenerAdapter {
        public C8853b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (View$OnClickListenerC8851y1.this.f28574d0 != null) {
                View$OnClickListenerC8851y1.this.f28574d0.mo18440H2();
            }
            View$OnClickListenerC8851y1.this.getCurrentController().mo11229Xf(true);
        }
    }

    public class C8854c extends ImageView {
        public C8854c(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return isEnabled() && C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class C8855d extends ImageView {
        public C8855d(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return isEnabled() && C1399s0.m37218C(this) && super.onTouchEvent(motionEvent);
        }
    }

    public class C8856e extends View$OnClickListenerC9150b {
        public C8856e(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() != 0 || isEnabled()) && super.onTouchEvent(motionEvent);
        }
    }

    public class C8857f extends View$OnClickListenerC9170d1 {
        public C8857f(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return true;
        }
    }

    public interface AbstractC8858g {
    }

    public interface AbstractC8859h extends AbstractC8858g {
        void mo11103P2(C6253l lVar, boolean z);

        void mo11102r(C6253l lVar, boolean z);
    }

    public View$OnClickListenerC8851y1(AbstractC9323v4<?> v4Var) {
        super(v4Var.mo4347s());
        this.f28570W = v4Var;
    }

    public void m11187C2(float f, float f2, float f3, float f4, float f5, float f6, ValueAnimator valueAnimator) {
        float a = C2057b.m35735a(valueAnimator);
        this.f28585o0 = f + (f2 * a);
        if (f3 != 0.0f) {
            m11150Y1(f3 + (f4 * a));
        }
        m11107w3();
        setHeaderFactor(f5 + (f6 * a));
        getCurrentController().m11310Uf(a);
        this.f28575e0.setRevealFactor(1.0f - a);
    }

    public void m11183E2(ValueAnimator valueAnimator) {
        setRevealFactor(C2057b.m35735a(valueAnimator));
    }

    public void m11181F2(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        getCurrentController().mo11226Yf(new TdApi.MessageSendOptions(z, false, false, messageSchedulingState), false);
    }

    public void m11179G2(C9279r rVar) {
        m11141d2();
    }

    public List m11178H2(View view) {
        List<View$OnTouchListenerC5103c0.C5104a> X2 = m11109v3().m2485dd().m3673X2(getTargetChatId(), false, getCurrentController().m11297ff(), true);
        if (X2 == null) {
            X2 = new ArrayList<>();
        }
        getCurrentController().mo11230Xe(X2);
        if (!X2.isEmpty()) {
            return X2;
        }
        return null;
    }

    public void m11174J2(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        getCurrentController().mo11226Yf(new TdApi.MessageSendOptions(false, false, false, messageSchedulingState), true);
    }

    public void m11173K2(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        getCurrentController().mo11226Yf(new TdApi.MessageSendOptions(true, false, false, messageSchedulingState), false);
    }

    public void m11171L2(TdApi.MessageSchedulingState messageSchedulingState) {
        getCurrentController().mo11226Yf(new TdApi.MessageSendOptions(false, false, false, messageSchedulingState), false);
    }

    public void m11169M2(View view, View view2) {
        switch (view.getId()) {
            case R.id.btn_sendNoMarkdown:
                m11144b3(new HandlerC10770jj.AbstractC10786o() {
                    @Override
                    public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                        View$OnClickListenerC8851y1.this.m11174J2(z, messageSchedulingState, z2);
                    }
                });
                return;
            case R.id.btn_sendNoSound:
                m11144b3(new HandlerC10770jj.AbstractC10786o() {
                    @Override
                    public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                        View$OnClickListenerC8851y1.this.m11173K2(z, messageSchedulingState, z2);
                    }
                });
                return;
            case R.id.btn_sendOnceOnline:
                getCurrentController().mo11226Yf(new TdApi.MessageSendOptions(false, false, false, new TdApi.MessageSchedulingStateSendWhenOnline()), false);
                return;
            case R.id.btn_sendScheduled:
                if (this.f28563P != null) {
                    m11109v3().m2485dd().m3808J7(this.f28563P, new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            View$OnClickListenerC8851y1.this.m11171L2((TdApi.MessageSchedulingState) obj);
                        }
                    }, getTargetChatId(), false, false, null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void m11167N2(C4618d7 d7Var, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        if (rhVar != null) {
            rhVar.m32209up(d7Var.m26870r(), true, new TdApi.MessageSendOptions(z, false, false, messageSchedulingState));
        }
        m11112u2(false);
    }

    public void m11165O2(String str, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        if (rhVar != null) {
            rhVar.m32157yp(Collections.singletonList(str), this.f28550C0, true, z, messageSchedulingState);
        }
        m11112u2(false);
    }

    public void m11164P2(boolean z, C6246h hVar, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        if (z) {
            if (hVar instanceof C8774h1) {
                C8774h1 h1Var = (C8774h1) hVar;
                long D0 = h1Var.m11429D0();
                String E0 = h1Var.m11428E0();
                View$OnClickListenerC2971rh rhVar = this.f28563P;
                if (rhVar != null) {
                    rhVar.m32144zp(D0, E0, true, false, z2, messageSchedulingState);
                }
            } else {
                throw new IllegalArgumentException("image.getType() == " + ((int) hVar.mo20777C()));
            }
        }
        m11112u2(false);
    }

    public void m11162Q2(double d, double d2, double d3, int i, int i2, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        if (this.f28563P != null) {
            TdApi.Location location = new TdApi.Location(d, d2, d3);
            if (m11106x2()) {
                this.f28563P.m32769Dp(location, i, z, messageSchedulingState);
            } else {
                this.f28563P.m32300np(new TdApi.InputMessageLocation(location, i2, i, 0), true, z, messageSchedulingState, null);
            }
        }
        m11112u2(false);
    }

    public void m11161R2(View$OnClickListenerC8750f0.C8759h hVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        if (rhVar != null) {
            rhVar.m32808Ap(Collections.singletonList(hVar), this.f28550C0, true, z, messageSchedulingState);
        }
        m11112u2(false);
    }

    public void m11158T2(C8862z1 z1Var, boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        if (rhVar != null) {
            rhVar.m32300np(z1Var.m11088a(), true, z, messageSchedulingState, null);
        }
        m11112u2(false);
    }

    private int getBottomBarHeight() {
        ViewGroup viewGroup = this.f28568U;
        return viewGroup != null ? viewGroup.getMeasuredHeight() : GestureDetector$OnGestureListenerC8768h.getBarHeight();
    }

    public AbstractC8809o<?> getCurrentController() {
        GestureDetector$OnGestureListenerC8768h hVar = this.f28565R;
        return hVar != null ? this.f28564Q[hVar.getCurrentIndex()] : this.f28564Q[0];
    }

    private void setAddExtraSpacing(boolean z) {
        if (this.f28555H0 != z) {
            this.f28555H0 = z;
            AbstractC8809o<?> oVar = this.f28567T;
            if (oVar != null) {
                oVar.m11280pg();
            }
        }
    }

    private void setCounterEnabled(boolean z) {
        C9279r rVar = this.f28592v0;
        if (rVar != null && rVar.isEnabled() != z) {
            this.f28592v0.setEnabled(z);
            this.f28548A0.setEnabled(z);
            this.f28593w0.setEnabled(z);
            this.f28595y0.setEnabled(z);
        }
    }

    private void setCounterFactor(float f) {
        if (this.f28552E0 != f) {
            m11150Y1(f);
            if (!this.f28554G0 || this.f28585o0 != 0.0f) {
                setCounterFactorInternal(f);
            }
            m11107w3();
        }
    }

    private void setCounterFactorInternal(float f) {
        GestureDetector$OnGestureListenerC8768h hVar = this.f28565R;
        if (hVar != null) {
            hVar.setOverlayFactor(f);
        }
        C9279r rVar = this.f28592v0;
        if (rVar != null) {
            rVar.setAlpha(f);
            this.f28593w0.setAlpha(f);
            this.f28595y0.setAlpha(f);
            m11141d2();
        }
        setCounterEnabled(f != 0.0f);
    }

    private void setGroupMediaFactor(float f) {
        if (this.f28549B0 != f) {
            this.f28549B0 = f;
            this.f28548A0.setColorFilter(C5064d.m24128d(C11524j.m228N(R.id.theme_color_icon), C11524j.m228N(R.id.theme_color_iconActive), f));
        }
    }

    private void setRevealFactor(float f) {
        C6924j2 j2Var = this.f28573c0;
        if (j2Var != null) {
            j2Var.setRevealFactor(f);
        }
        setBottomBarFactor(f);
        View v9 = this.f28567T.get();
        int i = this.f28588r0;
        v9.setTranslationY(i - ((int) (i * f)));
    }

    public void m11190A2(View$OnClickListenerC2971rh rhVar) {
        m11105y2(0, rhVar);
    }

    public boolean m11189B2() {
        return this.f28577g0;
    }

    @Override
    public void mo11185E(float f) {
        this.f28579i0.setTranslationY(this.f28583m0 + Math.round(this.f28581k0 * f));
        View view = this.f28580j0;
        int i = this.f28582l0;
        view.setTranslationY(i - Math.round(i * f));
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
        m11151X2();
    }

    @Override
    public void mo11176I2(C6924j2 j2Var) {
        this.f28574d0 = j2Var;
        m11120p2().start();
    }

    @Override
    public void mo137J4(int i, int i2, float f, boolean z) {
        C11525k.m138c(this, i, i2, f, z);
    }

    @Override
    public void mo6938O0(int r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: sc.View$OnClickListenerC8851y1.mo6938O0(int, boolean):void");
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setCounterFactor(f);
        } else if (i == 1) {
            setGroupMediaFactor(f);
        }
    }

    @Override
    public void mo6929S4() {
        AbstractC8809o<?>[] oVarArr;
        for (AbstractC8809o<?> oVar : this.f28564Q) {
            if (oVar != null) {
                oVar.mo6929S4();
            }
        }
    }

    @Override
    public void mo9343T5(int i, int i2) {
        C4403w.m27981H1(i, i2);
    }

    public void m11156U2(boolean z) {
        if (z) {
            m11145b2();
        } else {
            m11112u2(false);
        }
    }

    public void m11154V2() {
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override
    public boolean mo136W0() {
        return true;
    }

    public final void m11151X2() {
        C6924j2 j2Var;
        if (C4183a.f14106x && this.f28565R != null) {
            AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(getContext());
            final GestureDetector$OnGestureListenerC8768h hVar = this.f28565R;
            Objects.requireNonNull(hVar);
            r.m14519Y2(new AbstractC5915g() {
                @Override
                public final int get() {
                    return GestureDetector$OnGestureListenerC8768h.this.getCurrentColor();
                }
            }, this.f28590t0 ? 0.0f : this.f28585o0 * (1.0f - this.f28552E0), this.f28577g0 || ((j2Var = this.f28573c0) != null && j2Var.m18446A2()) || this.f28586p0);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 0.0f && this.f28554G0) {
            setCounterFactorInternal(0.0f);
        }
    }

    public final void m11150Y1(float f) {
        if (this.f28552E0 != f) {
            this.f28552E0 = f;
            setAddExtraSpacing(f == 1.0f);
        }
    }

    public void m11149Y2() {
        m11112u2(false);
        C1379j0.m37343Y(getContext());
    }

    public final void m11148Z1(float f) {
        boolean z = true;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        this.f28586p0 = i == 0;
        m11151X2();
        C3950k kVar = this.f28553F0;
        if (kVar == null) {
            this.f28553F0 = new C3950k(0, this, C2057b.f7280b, 200L, this.f28552E0);
        } else {
            kVar.m29542k();
        }
        if (this.f28585o0 != 0.0f) {
            z = false;
        }
        this.f28554G0 = z;
        GestureDetector$OnGestureListenerC8768h hVar = this.f28565R;
        if (hVar != null) {
            hVar.m11443m2();
        }
        if (this.f28554G0 && i == 0) {
            setCounterFactorInternal(1.0f);
        }
        this.f28553F0.m29544i(f);
    }

    public void m11147Z2(boolean z) {
        m11112u2(false);
        C1379j0.m37340a0(z);
    }

    public boolean m11146a2() {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        return rhVar != null && rhVar.m32216ui();
    }

    @Override
    public void mo4501a3() {
        AbstractC8809o<?>[] oVarArr;
        View$OnClickListenerC2971rh rhVar;
        setContentVisible(true);
        this.f28590t0 = true;
        m11151X2();
        for (AbstractC8809o<?> oVar : this.f28564Q) {
            if (oVar != null) {
                removeView(oVar.get());
                if (!oVar.m9347Sa()) {
                    oVar.mo417Z8();
                }
            }
        }
        if (this.f28591u0 && (rhVar = this.f28563P) != null) {
            rhVar.m32534Vq();
        }
        C11541z.m7t().m42S(this);
        C4403w.m27988F2(this);
        View$OnClickListenerC2971rh rhVar2 = this.f28563P;
        if (rhVar2 != null) {
            rhVar2.m32651Mp(TdApi.ChatActionCancel.CONSTRUCTOR);
        }
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        C11525k.m139b(this, pVar, pVar2);
    }

    public void m11145b2() {
        m11148Z1(0.0f);
        getCurrentController().mo11232Wf();
    }

    public void m11144b3(HandlerC10770jj.AbstractC10786o oVar) {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        if (rhVar == null || !rhVar.m32216ui()) {
            oVar.mo3333a(false, null, false);
        } else {
            m11109v3().m2485dd().m3787L8(this.f28563P, getTargetChatId(), false, oVar, null);
        }
    }

    public void m11143c3(Runnable runnable, long j) {
        getCurrentController().mo11213eg(runnable, j);
    }

    @Override
    public void mo11142d0() {
    }

    public final void m11141d2() {
        C9279r rVar = this.f28592v0;
        if (rVar != null) {
            float multipleFactor = rVar.getMultipleFactor();
            if (multipleFactor > 0.0f && (this.f28552E0 == 0.0f || !getCurrentController().mo11203og())) {
                multipleFactor = 0.0f;
            }
            float f = this.f28552E0 * multipleFactor;
            this.f28548A0.setAlpha(f);
            this.f28596z0.setAlpha(f);
            this.f28592v0.setTranslationY((-C1357a0.m37541i(9.0f)) * multipleFactor);
        }
    }

    public final void m11140d3() {
        if (this.f28592v0 == null && this.f28565R != null) {
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, C1357a0.m37541i(53.0f), 51);
            t1.leftMargin = C1357a0.m37541i(74.0f);
            t1.rightMargin = C1357a0.m37541i(56.0f);
            C9279r rVar = new C9279r(getContext());
            this.f28592v0 = rVar;
            rVar.setFactorChangeListener(new C9279r.AbstractC9282c() {
                @Override
                public final void mo9644a(C9279r rVar2) {
                    View$OnClickListenerC8851y1.this.m11179G2(rVar2);
                }
            });
            this.f28592v0.m9651y(R.id.theme_color_text);
            this.f28569V.m74f(this.f28592v0);
            this.f28592v0.m9678F(C4403w.m27844o2(R.string.SelectedSuffix, 1L), false);
            this.f28592v0.setLayoutParams(t1);
            this.f28565R.addView(this.f28592v0);
            this.f28550C0 = !C4868i.m24726c2().m24895E3() || C4868i.m24726c2().m24889F2();
            FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-2, C1357a0.m37541i(53.0f), 51);
            t12.leftMargin = C1357a0.m37541i(74.0f);
            t12.rightMargin = C1357a0.m37541i(56.0f);
            t12.topMargin = C1357a0.m37541i(28.0f);
            C6847b2 b2Var = new C6847b2(getContext());
            this.f28596z0 = b2Var;
            b2Var.setTextSize(1, 13.0f);
            this.f28596z0.setTextColor(C11524j.m213U0());
            this.f28569V.m69k(this.f28592v0);
            this.f28596z0.setTypeface(C1389o.m37258k());
            this.f28596z0.setEllipsize(TextUtils.TruncateAt.END);
            this.f28596z0.setSingleLine(true);
            this.f28596z0.setLayoutParams(t12);
            this.f28596z0.setText(C4403w.m27869i1(this.f28550C0 ? R.string.AsOneMessage : R.string.AsSeparateMessages));
            this.f28549B0 = this.f28550C0 ? 1.0f : 0.0f;
            this.f28565R.addView(this.f28596z0);
            C8854c cVar = new C8854c(getContext());
            this.f28593w0 = cVar;
            cVar.setId(R.id.btn_send);
            this.f28593w0.setScaleType(ImageView.ScaleType.CENTER);
            this.f28593w0.setImageResource(R.drawable.deproko_baseline_send_24);
            this.f28593w0.setColorFilter(C11524j.m175j());
            this.f28569V.m75e(this.f28593w0, R.id.theme_color_chatSendButton);
            this.f28593w0.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(55.0f), -1, 5));
            C1399s0.m37193a0(this.f28593w0);
            this.f28593w0.setOnClickListener(this);
            this.f28565R.addView(this.f28593w0);
            this.f28594x0 = new View$OnTouchListenerC5103c0(new View$OnTouchListenerC5103c0.AbstractC5106c() {
                @Override
                public final List mo2024N3(View view) {
                    List H2;
                    H2 = View$OnClickListenerC8851y1.this.m11178H2(view);
                    return H2;
                }
            }, new View$OnTouchListenerC5103c0.AbstractC5105b() {
                @Override
                public final void mo4198I0(View view, View view2) {
                    View$OnClickListenerC8851y1.this.m11169M2(view, view2);
                }
            }, this.f28569V, null).m23956d(this.f28593w0);
            FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(C1357a0.m37541i(55.0f), -1, 5);
            t13.rightMargin = C1357a0.m37541i(55.0f);
            C8855d dVar = new C8855d(getContext());
            this.f28548A0 = dVar;
            dVar.setOnClickListener(this);
            this.f28548A0.setId(R.id.btn_mosaic);
            this.f28548A0.setScaleType(ImageView.ScaleType.CENTER);
            this.f28548A0.setImageResource(R.drawable.deproko_baseline_mosaic_group_24);
            int i = this.f28550C0 ? R.id.theme_color_iconActive : R.id.theme_color_icon;
            this.f28548A0.setColorFilter(C11524j.m228N(i));
            this.f28569V.m75e(this.f28548A0, i);
            this.f28548A0.setLayoutParams(t13);
            this.f28565R.addView(this.f28548A0);
            C8856e eVar = new C8856e(getContext());
            this.f28595y0 = eVar;
            eVar.setId(R.id.btn_close);
            C10189d.m5794j(this.f28595y0);
            this.f28595y0.setButtonFactor(4);
            this.f28595y0.setOnClickListener(this);
            this.f28595y0.setColor(C11524j.m159q0());
            this.f28569V.m77c(this.f28595y0, R.id.theme_color_icon);
            this.f28595y0.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), -1, 3));
            this.f28565R.addView(this.f28595y0);
            this.f28592v0.setAlpha(0.0f);
            this.f28593w0.setAlpha(0.0f);
            this.f28595y0.setAlpha(0.0f);
            this.f28596z0.setAlpha(0.0f);
            this.f28548A0.setAlpha(0.0f);
            setCounterEnabled(false);
        }
        C9279r rVar2 = this.f28592v0;
        if (rVar2 != null) {
            rVar2.setTranslationY(0.0f);
            m11136h2(false);
        }
    }

    @Override
    public void mo6904d6() {
        getCurrentController().mo6904d6();
    }

    public void m11139e3() {
        GestureDetector$OnGestureListenerC8768h hVar = this.f28565R;
        int currentIndex = hVar != null ? hVar.getCurrentIndex() : 0;
        getCurrentController();
        if (this.f28557J0 == null) {
            C8857f fVar = new C8857f(getContext());
            this.f28557J0 = fVar;
            fVar.m10045m3(getCurrentController(), true);
            this.f28557J0.setAlpha(0.0f);
            this.f28557J0.setTranslationY((-View$OnClickListenerC9170d1.m10066c3(false)) - this.f28557J0.getFilling().m9008s());
            addView(this.f28557J0);
            this.f28558K0 = currentIndex;
        }
        if (this.f28558K0 != currentIndex) {
            this.f28557J0.setTitle(getCurrentController());
            this.f28558K0 = currentIndex;
        }
    }

    public final void m11138f2() {
        TextView textView;
        C9279r rVar = this.f28592v0;
        if (rVar != null && (textView = this.f28596z0) != null) {
            if (this.f28550C0) {
                int ceil = (int) Math.ceil(rVar.getCounter() / 10.0f);
                if (ceil > 1) {
                    this.f28596z0.setText(C4403w.m27844o2(R.string.AsXMessages, ceil));
                } else {
                    this.f28596z0.setText(C4403w.m27869i1(R.string.AsOneMessage));
                }
            } else {
                textView.setText(C4403w.m27869i1(R.string.AsSeparateMessages));
            }
        }
    }

    @Override
    public boolean mo10135g0(boolean z) {
        AbstractC8809o<?> currentController = getCurrentController();
        if (currentController.m11326Kf() || currentController.mo404jc(z)) {
            return true;
        }
        C9279r rVar = this.f28592v0;
        if (rVar != null && rVar.isEnabled()) {
            if (!currentController.mo11204ng(false)) {
                m11145b2();
            }
            return true;
        } else if (!currentController.m11325Lf()) {
            return currentController.mo11204ng(false);
        } else {
            currentController.m11295gf();
            return true;
        }
    }

    public final void m11137g3() {
        this.f28588r0 = this.f28567T.m11333Cf();
        this.f28567T.get().setTranslationY(this.f28588r0);
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
        setBottomBarFactor(0.0f);
    }

    public float getCounterFactor() {
        return this.f28552E0;
    }

    public int getCurrentBottomBarHeight() {
        return (int) (getBottomBarHeight() * Math.max(this.f28585o0, this.f28552E0));
    }

    public int getCurrentContentWidth() {
        GestureDetector$OnGestureListenerC8768h hVar = this.f28565R;
        return hVar != null ? hVar.getCurrentBarWidth() : C1357a0.m37543g();
    }

    public View$OnClickListenerC9170d1 getHeaderView() {
        if (this.f28557J0 == null) {
            m11139e3();
        }
        return this.f28557J0;
    }

    public View$OnClickListenerC2971rh getTarget() {
        return this.f28563P;
    }

    public long getTargetChatId() {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        if (rhVar != null) {
            return rhVar.mo9464C9();
        }
        return 0L;
    }

    public long getTargetMessageThreadId() {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        if (rhVar != null) {
            return rhVar.m32266qk();
        }
        return 0L;
    }

    public final void m11136h2(boolean z) {
        ArrayList<C6246h> J0;
        AbstractC8809o<?> currentController = getCurrentController();
        int i = 1;
        if (!(currentController instanceof View$OnClickListenerC8833u0) || (J0 = ((View$OnClickListenerC8833u0) currentController).mo11250J0(false)) == null || J0.isEmpty()) {
            C9279r rVar = this.f28592v0;
            rVar.m9678F(C4403w.m27844o2(R.string.SelectedSuffix, Math.max(1, rVar.getCounter())), z);
            return;
        }
        Iterator<C6246h> it = J0.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C6246h next = it.next();
            if (next.m20943M() || !(next instanceof C6253l)) {
                break;
            } else if (((C6253l) next).m20843e1()) {
                i3++;
                if (i2 > 0) {
                    break;
                }
            } else {
                i2++;
                if (i3 > 0) {
                    break;
                }
            }
        }
        i = 0;
        if (i > 0 || (i2 > 0 && i3 > 0)) {
            this.f28592v0.m9678F(C4403w.m27844o2(R.string.AttachMediasSuffix, i + i2 + i3), z);
        } else if (i3 > 0) {
            this.f28592v0.m9678F(C4403w.m27844o2(R.string.AttachVideosSuffix, i3), z);
        } else {
            this.f28592v0.m9678F(C4403w.m27844o2(R.string.AttachPhotosSuffix, i2), z);
        }
    }

    public void m11135h3(final C4618d7 d7Var) {
        m11144b3(new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                View$OnClickListenerC8851y1.this.m11167N2(d7Var, z, messageSchedulingState, z2);
            }
        });
    }

    @Override
    public void mo11134i1(int i) {
        AbstractC8809o<?>[] oVarArr = this.f28564Q;
        if (oVarArr[i] != null) {
            oVarArr[i].m11288kf();
        }
    }

    public void m11133i2(C4618d7 d7Var) {
        View$OnClickListenerC2971rh rhVar;
        if (!(d7Var.m26870r() == null || (rhVar = this.f28563P) == null)) {
            rhVar.m32158yo(d7Var.m26870r().username);
        }
        this.f28591u0 = true;
        m11112u2(false);
    }

    public void m11132i3(C6035e<C4618d7> eVar, TdApi.MessageSendOptions messageSendOptions) {
        int p;
        if (eVar != null && eVar.m21496p() != 0) {
            if (this.f28563P != null && (p = eVar.m21496p()) > 0) {
                int i = 0;
                while (i < p) {
                    this.f28563P.m32209up(eVar.m21495q(i).m26870r(), i == 0, messageSendOptions);
                    i++;
                }
            }
            m11112u2(true);
        }
    }

    @Override
    public void mo3000j2(C6924j2 j2Var) {
        C6941k2.m18400a(this, j2Var);
    }

    public void m11131j3(final String str) {
        m11144b3(new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                View$OnClickListenerC8851y1.this.m11165O2(str, z, messageSchedulingState, z2);
            }
        });
    }

    public void m11130k2(String str) {
        View$OnClickListenerC2971rh rhVar = this.f28563P;
        if (rhVar != null) {
            rhVar.m32158yo(str);
        }
        this.f28591u0 = true;
        m11112u2(false);
    }

    public void m11129k3(List<String> list, ArrayList<View$OnClickListenerC8750f0.C8759h> arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z) {
        boolean z2;
        if ((list != null && !list.isEmpty()) || (arrayList != null && !arrayList.isEmpty())) {
            if (z) {
                z2 = this.f28550C0;
                C4868i.m24726c2().m24761X4(z2);
            } else {
                z2 = !C4868i.m24726c2().m24895E3() || C4868i.m24726c2().m24889F2();
            }
            View$OnClickListenerC2971rh rhVar = this.f28563P;
            if (rhVar != null) {
                if (list != null) {
                    rhVar.m32157yp(list, z2, true, messageSendOptions.disableNotification, messageSendOptions.schedulingState);
                }
                if (arrayList != null) {
                    this.f28563P.m32808Ap(arrayList, z2, true, messageSendOptions.disableNotification, messageSendOptions.schedulingState);
                }
            }
            m11112u2(z);
        }
    }

    @Override
    public boolean mo11128l0(int i, int i2) {
        C3950k kVar;
        boolean z;
        if (this.f28552E0 != 0.0f || (((kVar = this.f28553F0) != null && kVar.m29531v()) || getCurrentController().m11326Kf())) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 3) {
                try {
                    C4488d.m27518a(getContext());
                    z = C2059c.m35730b(getContext(), "com.google.android.apps.maps");
                } catch (Throwable unused) {
                    z = false;
                }
                if (!z) {
                    AbstractC9323v4<?> t = C1379j0.m37303t(getContext());
                    if (t != null) {
                        t.m9337Tc();
                    } else {
                        C1379j0.m37292y0(R.string.NoGoogleMaps, 1);
                    }
                    return false;
                }
            } else if (i2 == 4 && this.f28572b0) {
                View$OnClickListenerC2971rh rhVar = this.f28563P;
                if (rhVar != null && rhVar.m9339Ta()) {
                    long targetChatId = getTargetChatId();
                    if (targetChatId != 0) {
                        View$OnClickListenerC2280d6 d6Var = new View$OnClickListenerC2280d6(this.f28563P.mo4347s(), this.f28563P.mo4348c());
                        d6Var.m35111kh(new View$OnClickListenerC2280d6.C2285d(targetChatId, this.f28563P.m32279pk(), this.f28563P));
                        this.f28570W.m9291ac(d6Var);
                        m11112u2(false);
                    }
                }
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 23 && !(getContext().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
            this.f28584n0 = i2;
            ((AbstractView$OnTouchListenerC7889a) getContext()).m14551P2();
            return false;
        }
        AbstractC8809o<?> oVar = this.f28564Q[i];
        this.f28578h0 = oVar;
        this.f28581k0 = oVar.m11277rf();
        View v9 = this.f28578h0.get();
        this.f28579i0 = v9;
        this.f28583m0 = v9.getTranslationY();
        AbstractC8809o<?> t2 = m11114t2(i2);
        this.f28580j0 = t2.get();
        int Cf = t2.m11333Cf();
        this.f28582l0 = Cf;
        this.f28580j0.setTranslationY(Cf);
        if (t2.m9312Xa()) {
            t2.mo6871o6();
        }
        addView(this.f28580j0, 1);
        return true;
    }

    public void m11127l2() {
        m11148Z1(0.0f);
        getCurrentController().mo11232Wf();
    }

    public void m11126l3(final C6246h hVar, final boolean z) {
        m11144b3(new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
                View$OnClickListenerC8851y1.this.m11164P2(z, hVar, z2, messageSchedulingState, z3);
            }
        });
    }

    public AbstractC8809o<?> mo384m2(int i) {
        int i2 = this.f28560M;
        if (i2 == 1) {
            return new View$OnClickListenerC8723c1(this);
        }
        if (i2 == 2) {
            return new View$OnClickListenerC8833u0(this);
        }
        if (this.f28571a0) {
            i = (this.f28564Q.length - i) - 1;
        }
        if (i == 0) {
            return new C8829t(this);
        }
        if (i == 1) {
            return new View$OnClickListenerC8750f0(this);
        }
        if (i == 2) {
            return new View$OnClickListenerC8833u0(this);
        }
        if (i == 3) {
            return new View$OnClickListenerC8723c1(this);
        }
        if (i == 4) {
            return new C8861z0(this);
        }
        throw new IllegalArgumentException("Unknown index passed: " + i);
    }

    public void m11125m3(final double d, final double d2, final double d3, final int i, final int i2) {
        m11144b3(new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                View$OnClickListenerC8851y1.this.m11162Q2(d, d2, d3, i, i2, z, messageSchedulingState, z2);
            }
        });
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        AbstractC8809o<?> currentController;
        this.f28569V.m66n(z);
        if (this.f28557J0 != null && (currentController = getCurrentController()) != null) {
            this.f28557J0.m10124E3(currentController, null);
        }
    }

    @Override
    public void mo11124n(int i) {
        View$OnClickListenerC2971rh rhVar;
        removeView(this.f28579i0);
        this.f28578h0.m11294gg();
        this.f28578h0.mo6904d6();
        AbstractC8809o<?>[] oVarArr = this.f28564Q;
        this.f28567T = oVarArr[i];
        oVarArr[i].mo11229Xf(false);
        m11151X2();
        if (this.f28560M == 0 && (rhVar = this.f28563P) != null) {
            rhVar.m32651Mp(this.f28564Q[i].mo11268pf());
        }
    }

    public Animator m11123n2() {
        C8852a aVar = new C8852a();
        if (Build.VERSION.SDK_INT < 21 || !this.f28576f0) {
            ValueAnimator b = C2057b.m35734b();
            b.setDuration(220L);
            final float f = this.f28585o0;
            final float f2 = -f;
            final float f3 = this.f28552E0;
            final float f4 = -f3;
            final float f5 = this.f28556I0;
            final float f6 = -f5;
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View$OnClickListenerC8851y1.this.m11187C2(f, f2, f3, f4, f5, f6, valueAnimator);
                }
            });
            b.addListener(aVar);
            b.setInterpolator(C2057b.f7280b);
            getCurrentController().m11308Vf(true);
            return b;
        }
        int measuredWidth = getMeasuredWidth() - ((int) (this.f28593w0.getMeasuredWidth() * 0.5f));
        int measuredHeight = getMeasuredHeight() - ((int) (this.f28593w0.getMeasuredHeight() * 0.5f));
        if (this.f28556I0 != 0.0f) {
            setContentVisible(true);
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, measuredWidth, measuredHeight, (float) Math.hypot(getMeasuredWidth(), getMeasuredHeight()), 0.0f);
        createCircularReveal.setInterpolator(C2057b.f7280b);
        createCircularReveal.setDuration(285L);
        createCircularReveal.addListener(aVar);
        C6924j2 j2Var = this.f28575e0;
        if (j2Var != null) {
            j2Var.m18415n2(0.0f);
        }
        return createCircularReveal;
    }

    public void m11122n3(final View$OnClickListenerC8750f0.C8759h hVar) {
        m11144b3(new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                View$OnClickListenerC8851y1.this.m11161R2(hVar, z, messageSchedulingState, z2);
            }
        });
    }

    public void m11121o3(ArrayList<C6246h> arrayList, boolean z, TdApi.MessageSendOptions messageSendOptions, boolean z2, boolean z3) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                Iterator<C6246h> it = arrayList.iterator();
                boolean z4 = true;
                while (it.hasNext()) {
                    C6246h next = it.next();
                    if (next instanceof C8774h1) {
                        C8774h1 h1Var = (C8774h1) next;
                        long D0 = h1Var.m11429D0();
                        String E0 = h1Var.m11428E0();
                        View$OnClickListenerC2971rh rhVar = this.f28563P;
                        if (rhVar != null) {
                            rhVar.m32144zp(D0, E0, z4, false, messageSendOptions.disableNotification, messageSendOptions.schedulingState);
                        }
                        z4 = false;
                    }
                }
                m11112u2(true);
                return;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator<C6246h> it2 = arrayList.iterator();
            boolean z5 = true;
            while (it2.hasNext()) {
                C6246h next2 = it2.next();
                if (next2 instanceof C6253l) {
                    C6253l lVar = (C6253l) next2;
                    if (lVar.mo20875q() != null) {
                        arrayList2.add(lVar);
                    }
                    AbstractC8858g gVar = this.f28561N;
                    if (gVar != null && (gVar instanceof AbstractC8859h)) {
                        if (lVar.m20843e1()) {
                            ((AbstractC8859h) this.f28561N).mo11102r(lVar, z5);
                        } else {
                            ((AbstractC8859h) this.f28561N).mo11103P2(lVar, z5);
                        }
                    }
                    z5 = false;
                } else {
                    throw new IllegalArgumentException("rawFile instanceof " + next2.getClass().getName());
                }
            }
            if (this.f28563P != null) {
                C6253l[] lVarArr = new C6253l[arrayList2.size()];
                arrayList2.toArray(lVarArr);
                C4868i.m24726c2().m24761X4(this.f28550C0);
                this.f28563P.m32782Cp(lVarArr, this.f28550C0, messageSendOptions, z2, z3);
            }
            m11112u2(true);
        }
    }

    @Override
    public void mo6871o6() {
        getCurrentController().mo6871o6();
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.btn_close) {
            if (id2 == R.id.btn_mosaic) {
                m11116r3(!this.f28550C0, true);
            } else if (id2 == R.id.btn_send) {
                m11144b3(new HandlerC10770jj.AbstractC10786o() {
                    @Override
                    public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                        View$OnClickListenerC8851y1.this.m11181F2(z, messageSchedulingState, z2);
                    }
                });
            }
        } else if (!getCurrentController().mo11204ng(true)) {
            m11145b2();
        }
    }

    public Animator m11120p2() {
        ValueAnimator b = C2057b.m35734b();
        b.setDuration(220L);
        b.setInterpolator(C2057b.f7280b);
        b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View$OnClickListenerC8851y1.this.m11183E2(valueAnimator);
            }
        });
        b.addListener(new C8853b());
        m11137g3();
        return b;
    }

    public void m11119p3(final C8862z1 z1Var) {
        m11144b3(new HandlerC10770jj.AbstractC10786o() {
            @Override
            public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                View$OnClickListenerC8851y1.this.m11158T2(z1Var, z, messageSchedulingState, z2);
            }
        });
    }

    @Override
    public void mo133q0(int i) {
        C11525k.m140a(this, i);
    }

    public void m11118q3() {
        if (!this.f28577g0) {
            this.f28577g0 = true;
            m11151X2();
        }
    }

    public void m11117r2() {
        if (!this.f28577g0) {
            this.f28577g0 = true;
            this.f28573c0.m18408y2(false);
        }
    }

    public final void m11116r3(boolean z, boolean z2) {
        if (this.f28550C0 != z) {
            this.f28550C0 = z;
            C4868i.m24726c2().m24761X4(z);
            this.f28569V.m65o(this.f28548A0);
            this.f28569V.m75e(this.f28548A0, z ? R.id.theme_color_iconActive : R.id.theme_color_icon);
            m11138f2();
            float f = 1.0f;
            if (z2) {
                if (this.f28551D0 == null) {
                    this.f28551D0 = new C3950k(1, this, C2057b.f7280b, 180L, this.f28549B0);
                }
                C3950k kVar = this.f28551D0;
                if (!z) {
                    f = 0.0f;
                }
                kVar.m29544i(f);
                return;
            }
            C3950k kVar2 = this.f28551D0;
            if (kVar2 != null) {
                kVar2.m29541l(0.0f);
            }
            if (!z) {
                f = 0.0f;
            }
            setGroupMediaFactor(f);
        }
    }

    public void m11115s3() {
        this.f28562O = true;
    }

    public void setBottomBarFactor(float f) {
        if (this.f28585o0 != f) {
            this.f28585o0 = f;
            m11107w3();
        }
    }

    public void setCallback(AbstractC8858g gVar) {
        this.f28561N = gVar;
    }

    public void setContentVisible(boolean z) {
        if (this.f28559L0 != z) {
            this.f28559L0 = z;
            C9270q1 x = C1379j0.m37295x();
            if (x != null) {
                x.get().setVisibility(z ? 0 : 4);
            }
        }
    }

    public void setCounter(int i) {
        float f = 0.0f;
        boolean z = this.f28552E0 == 0.0f && i == 1;
        if (z) {
            m11140d3();
        }
        if (i > 0) {
            f = 1.0f;
        }
        m11148Z1(f);
        C9279r rVar = this.f28592v0;
        if (rVar != null) {
            if (z) {
                rVar.m9653w(i, false);
                m11136h2(false);
            } else if (i != 0) {
                rVar.m9679E(i);
            }
        }
        if (!z && i > 0) {
            m11136h2(true);
            m11138f2();
        }
    }

    public void setHeaderFactor(float f) {
        if (this.f28556I0 != f) {
            this.f28556I0 = f;
            View$OnClickListenerC9170d1 d1Var = this.f28557J0;
            if (d1Var != null && !this.f28589s0) {
                d1Var.setAlpha(f);
                int c3 = View$OnClickListenerC9170d1.m10066c3(false) + this.f28557J0.getFilling().m9008s();
                this.f28557J0.setTranslationY((-c3) + ((int) (c3 * f)));
            }
        }
    }

    @Override
    public void mo10182t(int i, int i2, Intent intent) {
        if (i == 110) {
            mo6938O0(110, C7389v0.m16558z());
            return;
        }
        AbstractC8809o<?> currentController = getCurrentController();
        if (currentController instanceof AbstractC9142a) {
            ((AbstractC9142a) currentController).mo10182t(i, i2, intent);
        }
    }

    public final AbstractC8809o<?> m11114t2(int i) {
        AbstractC8809o<?> oVar = this.f28564Q[i];
        if (oVar != null) {
            return oVar;
        }
        AbstractC8809o<?> m2 = mo384m2(i);
        m2.m9376O8(this.f28569V);
        this.f28564Q[i] = m2;
        return m2;
    }

    public void m11113t3() {
        C6924j2 j2Var = new C6924j2(getContext());
        this.f28573c0 = j2Var;
        j2Var.setTouchDownInterceptor(this);
        this.f28573c0.setActivityListener(this);
        this.f28573c0.m18436M2();
        this.f28573c0.setDismissListener(this);
        this.f28573c0.m18435N2();
        this.f28573c0.m18045Q1(true);
        this.f28573c0.m18433P2(this, this);
    }

    public void m11112u2(boolean z) {
        if (!this.f28577g0) {
            m11118q3();
            this.f28576f0 = z;
            this.f28573c0.m18408y2(true);
        }
    }

    @Override
    public boolean mo11111v(C6924j2 j2Var, MotionEvent motionEvent) {
        AbstractC8809o<?> currentController = getCurrentController();
        return currentController != null && currentController.mo11204ng(false);
    }

    public void m11110v2() {
        this.f28587q0 = true;
        m11112u2(false);
    }

    public C10930q6 m11109v3() {
        return this.f28570W.mo4348c();
    }

    @Override
    public boolean mo11108w2(C6924j2 j2Var, C3950k kVar) {
        this.f28575e0 = j2Var;
        Animator n2 = m11123n2();
        if (n2 != null) {
            n2.start();
            return true;
        }
        this.f28575e0 = null;
        return false;
    }

    public final void m11107w3() {
        int bottomBarHeight = getBottomBarHeight();
        float max = bottomBarHeight - ((int) (bottomBarHeight * Math.max(this.f28585o0, this.f28552E0)));
        if (!m11106x2()) {
            GestureDetector$OnGestureListenerC8768h hVar = this.f28565R;
            if (hVar != null) {
                hVar.setTranslationY(max);
                m11151X2();
            }
            ViewGroup viewGroup = this.f28568U;
            if (viewGroup != null) {
                viewGroup.setTranslationY(max);
                m11151X2();
            }
            C6879f3 f3Var = this.f28566S;
            if (f3Var != null) {
                f3Var.setTranslationY(max);
            }
        }
    }

    public boolean m11106x2() {
        return this.f28560M != 0;
    }

    public void m11105y2(int i, View$OnClickListenerC2971rh rhVar) {
        GestureDetector$OnGestureListenerC8768h.C8770b[] bVarArr;
        GestureDetector$OnGestureListenerC8768h.C8770b bVar;
        GestureDetector$OnGestureListenerC8768h.C8770b bVar2;
        int i2 = i;
        this.f28560M = i2;
        this.f28563P = rhVar;
        this.f28571a0 = C4403w.m27984G2();
        int i3 = 0;
        this.f28572b0 = false;
        if (i2 == 1) {
            bVarArr = new GestureDetector$OnGestureListenerC8768h.C8770b[]{new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_location_on_24, R.string.Location, R.id.theme_color_attachLocation, C1357a0.m37541i(1.0f))};
        } else if (i2 != 2) {
            boolean K2 = m11109v3().m2788K2(getTargetChatId());
            this.f28572b0 = K2;
            if (this.f28571a0) {
                bVarArr = new GestureDetector$OnGestureListenerC8768h.C8770b[5];
                if (K2) {
                    bVar2 = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_poll_24, R.string.CreatePoll, R.id.theme_color_attachInlineBot);
                } else {
                    bVar2 = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.deproko_baseline_bots_24, R.string.InlineBot, R.id.theme_color_attachInlineBot);
                }
                bVarArr[0] = bVar2;
                bVarArr[1] = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_location_on_24, R.string.Location, R.id.theme_color_attachLocation, C1357a0.m37541i(1.0f));
                bVarArr[2] = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_image_24, R.string.Gallery, R.id.theme_color_attachPhoto);
                bVarArr[3] = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_insert_drive_file_24, R.string.File, R.id.theme_color_attachFile);
                bVarArr[4] = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_person_24, R.string.AttachContact, R.id.theme_color_attachContact, C1357a0.m37541i(1.0f));
            } else {
                GestureDetector$OnGestureListenerC8768h.C8770b[] bVarArr2 = new GestureDetector$OnGestureListenerC8768h.C8770b[5];
                bVarArr2[0] = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_person_24, R.string.AttachContact, R.id.theme_color_attachContact, C1357a0.m37541i(1.0f));
                bVarArr2[1] = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_insert_drive_file_24, R.string.File, R.id.theme_color_attachFile);
                bVarArr2[2] = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_image_24, R.string.Gallery, R.id.theme_color_attachPhoto);
                bVarArr2[3] = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_location_on_24, R.string.Location, R.id.theme_color_attachLocation, C1357a0.m37541i(1.0f));
                if (this.f28572b0) {
                    bVar = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_poll_24, R.string.CreatePoll, R.id.theme_color_attachInlineBot);
                } else {
                    bVar = new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.deproko_baseline_bots_24, R.string.InlineBot, R.id.theme_color_attachInlineBot);
                }
                bVarArr2[4] = bVar;
                bVarArr = bVarArr2;
            }
            i2 = 0;
            i3 = 2;
        } else {
            bVarArr = new GestureDetector$OnGestureListenerC8768h.C8770b[]{new GestureDetector$OnGestureListenerC8768h.C8770b(R.drawable.baseline_location_on_24, R.string.Gallery, R.id.theme_color_attachPhoto, C1357a0.m37541i(1.0f))};
        }
        this.f28564Q = new AbstractC8809o[bVarArr.length];
        if (i2 == 0) {
            GestureDetector$OnGestureListenerC8768h hVar = new GestureDetector$OnGestureListenerC8768h(getContext());
            this.f28565R = hVar;
            hVar.m11442n2(bVarArr, i3);
            this.f28565R.setCallback(this);
            C6879f3 f3Var = new C6879f3(getContext());
            this.f28566S = f3Var;
            f3Var.setSimpleTopShadow(true);
            this.f28569V.m74f(this.f28565R);
            FrameLayout.LayoutParams v1 = FrameLayoutFix.m18005v1(this.f28566S.getLayoutParams());
            v1.bottomMargin = this.f28565R.getLayoutParams().height;
            v1.gravity = 80;
            this.f28566S.setLayoutParams(v1);
            this.f28569V.m74f(this.f28566S);
        }
        AbstractC8809o<?> t2 = m11114t2(i3);
        this.f28567T = t2;
        addView(t2.get());
        if (i2 == 0) {
            addView(this.f28565R);
            addView(this.f28566S);
        }
        setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C11541z.m7t().m23f(this);
        C4403w.m27875h(this);
    }

    @Override
    public void mo2999y4(C6924j2 j2Var) {
        mo4501a3();
    }

    public void m11104z2() {
        this.f28560M = 3;
        this.f28564Q = new AbstractC8809o[1];
        AbstractC8809o<?> t2 = m11114t2(0);
        this.f28567T = t2;
        addView(t2.get());
        if (this.f28560M == 0) {
            ViewGroup hf = this.f28567T.mo405hf();
            this.f28568U = hf;
            addView(hf);
            this.f28569V.m74f(this.f28568U);
            this.f28568U.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 80));
            this.f28568U.measure(0, Log.TAG_TDLIB_OPTIONS);
        }
        setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C11541z.m7t().m23f(this);
        C4403w.m27875h(this);
    }
}
