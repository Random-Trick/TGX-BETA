package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import be.C1408x;
import be.C1410y;
import ge.C4896n;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import p037cb.C2057b;
import p051db.C3950k;
import p067ed.C4183a;
import p067ed.C4184b;
import p082fd.C4403w;
import p108hb.C5064d;
import p111he.AbstractC5131n0;
import p139jb.AbstractC5911c;
import p194nd.View$OnClickListenerC7430j1;
import p364zd.C11524j;
import td.AbstractC9142a;
import td.AbstractC9162c;
import td.AbstractC9323v4;
import td.C9145a2;
import td.C9207i1;
import td.C9319v1;
import td.View$OnClickListenerC9170d1;

public class C6924j2 extends C7031t2 implements C3950k.AbstractC3952b, AbstractView$OnTouchListenerC7889a.AbstractC7897h, C1408x.AbstractC1409a, AbstractC9142a, AbstractC5911c {
    public boolean f21875A0;
    public boolean f21876B0;
    public int f21877C0;
    public boolean f21878D0;
    public AbstractC6931g f21879E0;
    public C3950k f21880F0;
    public C6929e f21881G0;
    public float f21882H0;
    public boolean f21883I0;
    public PopupWindow f21884c0;
    public View f21885d0;
    public AbstractView$OnTouchListenerC7889a.AbstractC7897h f21886e0;
    public AbstractC6934j f21887f0;
    public C1408x.AbstractC1409a f21888g0;
    public boolean f21889h0;
    public AbstractC6930f f21890i0;
    public AbstractC6932h f21891j0;
    public AbstractC9162c f21892k0;
    public boolean f21893l0;
    public boolean f21894m0;
    public boolean f21895n0;
    public boolean f21896o0;
    public AbstractC9323v4<?> f21897p0;
    public boolean f21898q0;
    public int f21899r0;
    public boolean f21900s0;
    public boolean f21901t0;
    public AbstractC6933i f21902u0;
    public View f21903v0;
    public boolean f21904w0;
    public AbstractC6928d f21905x0;
    public boolean f21906y0;
    public int f21907z0;

    public class C6925a implements AbstractView$OnTouchListenerC7889a.AbstractC7902m {
        public final AbstractView$OnTouchListenerC7889a f21908a;
        public final View f21909b;

        public C6925a(AbstractView$OnTouchListenerC7889a aVar, View view) {
            this.f21908a = aVar;
            this.f21909b = view;
        }

        @Override
        public void mo14403U(AbstractView$OnTouchListenerC7889a aVar, int i, int i2) {
            if (C6924j2.this.f21906y0 || C6924j2.this.f21900s0) {
                this.f21908a.m14407z2(this);
            } else if (i == 0) {
                this.f21908a.m14407z2(this);
                if (!C6924j2.this.f21898q0) {
                    C6924j2.this.m18429U2(this.f21909b);
                }
            }
        }
    }

    public class C6926b extends AnimatorListenerAdapter {
        public C6926b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C6924j2.this.m18413r2();
        }
    }

    public class C6927c extends AnimatorListenerAdapter {
        public C6927c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            C6924j2.this.f21882H0 = 1.0f;
            C6924j2.this.mo18440H2();
        }
    }

    public interface AbstractC6928d {
        void mo11175I2(C6924j2 j2Var);

        void mo11141d0();

        boolean mo11107w2(C6924j2 j2Var, C3950k kVar);
    }

    public class C6929e extends View {
        public C6929e(Context context) {
            super(context);
            setAlpha(0.0f);
        }

        @Override
        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (C6924j2.this.f21883I0) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), View$OnClickListenerC9170d1.getTopOffset(), C1410y.m37042g(C5064d.m24131b(76, 0)));
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int b = C5064d.m24131b((int) (C11524j.m204Z() * 255.0f), 0);
            int topOffset = View$OnClickListenerC9170d1.getTopOffset();
            if (!C6924j2.this.f21883I0 || topOffset == 0) {
                canvas.drawColor(b);
            } else {
                canvas.drawRect(0.0f, topOffset, getMeasuredWidth(), getMeasuredHeight(), C1410y.m37042g(b));
            }
        }
    }

    public interface AbstractC6930f {
        void mo3000j2(C6924j2 j2Var);

        void mo2999y4(C6924j2 j2Var);
    }

    public interface AbstractC6931g {
        int getCurrentPopupHeight();
    }

    public interface AbstractC6932h {
        void mo18406f0(C6924j2 j2Var);
    }

    public interface AbstractC6933i {
        boolean mo11110v(C6924j2 j2Var, MotionEvent motionEvent);
    }

    public interface AbstractC6934j {
        boolean mo16405K1(float f, float f2);
    }

    public C6924j2(Context context) {
        super(context);
        setKeyboardListener(this);
        setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C6929e eVar = new C6929e(context);
        this.f21881G0 = eVar;
        eVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        addView(this.f21881G0);
    }

    public void m18445B2() {
        if (!this.f21906y0) {
            m18442F2();
        }
    }

    public void m18444C2(AbstractView$OnTouchListenerC7889a aVar, View view) {
        if (!this.f21906y0 && !this.f21900s0) {
            if (aVar.m14582I0() == 0) {
                try {
                    PopupWindow popupWindow = this.f21884c0;
                    this.f21885d0 = view;
                    popupWindow.showAtLocation(view, 0, 0, 0);
                    this.f21884c0.setBackgroundDrawable(new C9145a2(C1379j0.m37310r(getContext())));
                    if (this.f21895n0) {
                        m18439J2(this.f21884c0);
                    }
                } catch (Throwable th) {
                    Log.m14725e("Cannot show window", th, new Object[0]);
                }
            } else {
                aVar.m14519Y(new C6925a(aVar, view));
            }
        }
    }

    public static void m18439J2(PopupWindow popupWindow) {
        View rootView = popupWindow.getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= Log.TAG_GIF_LOADER;
        ((WindowManager) popupWindow.getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    private View getContentChild() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!(childAt instanceof C6929e)) {
                return childAt;
            }
        }
        return null;
    }

    public boolean m18446A2() {
        return this.f21906y0;
    }

    public final void m18443E2() {
        if (!this.f21876B0) {
            this.f21876B0 = true;
            AbstractC9323v4<?> v4Var = this.f21897p0;
            if (v4Var != null) {
                v4Var.m9115zc();
            }
            AbstractC6930f fVar = this.f21890i0;
            if (fVar != null) {
                fVar.mo3000j2(this);
            }
            int i = this.f21907z0;
            int i2 = 0;
            if (i == 0) {
                AbstractC6928d dVar = this.f21905x0;
                if (dVar != null) {
                    this.f21907z0 = 1;
                    if (!dVar.mo11107w2(this, this.f21880F0)) {
                        this.f21907z0 = 0;
                    } else {
                        return;
                    }
                }
                AbstractC6931g gVar = this.f21879E0;
                if (gVar != null) {
                    this.f21877C0 = gVar.getCurrentPopupHeight();
                } else {
                    View contentChild = getContentChild();
                    if (contentChild != null) {
                        i2 = contentChild.getMeasuredHeight();
                    }
                    this.f21877C0 = i2;
                }
                m18415n2(0.0f);
            } else if (i != 1) {
                if (i == 2 || i == 3) {
                    m18411u2();
                }
            } else if (!this.f21905x0.mo11107w2(this, this.f21880F0)) {
                AbstractC6931g gVar2 = this.f21879E0;
                if (gVar2 != null) {
                    this.f21877C0 = gVar2.getCurrentPopupHeight();
                } else {
                    View contentChild2 = getContentChild();
                    this.f21877C0 = contentChild2 != null ? contentChild2.getMeasuredHeight() : 0;
                }
                this.f21907z0 = 0;
                m18415n2(0.0f);
            }
        }
    }

    public final void m18442F2() {
        Throwable th;
        if (!this.f21875A0) {
            boolean z = true;
            this.f21875A0 = true;
            int i = this.f21907z0;
            if (i == 0) {
                m18415n2(1.0f);
            } else if (i == 1) {
                this.f21905x0.mo11175I2(this);
            } else if (i == 2 || i == 3) {
                C6927c cVar = new C6927c();
                C9207i1 i1Var = (C9207i1) getContentChild();
                if (i1Var != null) {
                    if (this.f21907z0 == 2) {
                        i1Var.m9967c(cVar);
                        return;
                    }
                    if (i1Var.getAnchorMode() != 0) {
                        z = false;
                    }
                    int i2 = C1357a0.m37544i(8.0f);
                    int itemsWidth = i1Var.getItemsWidth();
                    int i3 = z != C4403w.m27986G2() ? itemsWidth - i2 : C1357a0.m37544i(17.0f);
                    if (i1Var.m9965e()) {
                        i2 = i1Var.getItemsHeight() - i2;
                    }
                    if (this.f21907z0 == 3 && C4183a.f14107y) {
                        try {
                            int i4 = C4403w.m27986G2() ? (int) (C1357a0.m37544i(49.0f) * 0.5f) : itemsWidth - ((int) (C1357a0.m37544i(49.0f) * 0.5f));
                            int e = C4896n.m24479e() / 2;
                            if (i1Var.m9965e()) {
                                e = i1Var.getItemsHeight() - e;
                            }
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(i1Var, i4, e, 0.0f, i1Var.getRevealRadius());
                            createCircularReveal.addListener(cVar);
                            createCircularReveal.setInterpolator(C9207i1.f29725O);
                            createCircularReveal.setDuration(258L);
                            this.f21907z0 = 3;
                            try {
                                i1Var.setPivotX(i4);
                                i1Var.setPivotY(e);
                                createCircularReveal.start();
                                i1Var.setAlpha(1.0f);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                i3 = i4;
                                i2 = e;
                                Log.m14710w("Cannot create circular reveal", th, new Object[0]);
                                i1Var.setAlpha(0.0f);
                                i1Var.setScaleX(0.56f);
                                i1Var.setScaleY(0.56f);
                                i1Var.setPivotX(i3);
                                i1Var.setPivotY(i2);
                                this.f21907z0 = 2;
                                i1Var.m9967c(cVar);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    i1Var.setAlpha(0.0f);
                    i1Var.setScaleX(0.56f);
                    i1Var.setScaleY(0.56f);
                    i1Var.setPivotX(i3);
                    i1Var.setPivotY(i2);
                    this.f21907z0 = 2;
                    i1Var.m9967c(cVar);
                }
            }
        }
    }

    public void m18441G2() {
        m18413r2();
    }

    public void mo18440H2() {
        this.f21878D0 = true;
        AbstractC6932h hVar = this.f21891j0;
        if (hVar != null) {
            hVar.mo18406f0(this);
        }
    }

    public final void m18438K2() {
        if (this.f21894m0) {
            C1379j0.m37310r(getContext()).removeFromRoot(this);
            return;
        }
        PopupWindow popupWindow = this.f21884c0;
        if (popupWindow != null) {
            try {
                popupWindow.dismiss();
            } catch (Throwable unused) {
            }
        }
    }

    public void m18437L2() {
        if (this.f21898q0) {
            this.f21898q0 = false;
            if (this.f21894m0) {
                C1379j0.m37310r(getContext()).m14517Z(this, m18434O2());
                return;
            }
            View view = this.f21885d0;
            if (view != null) {
                m18429U2(view);
            }
        }
    }

    public void m18436M2() {
        this.f21896o0 = true;
    }

    public void m18435N2() {
        this.f21894m0 = true;
    }

    @Override
    public void mo6938O0(int i, boolean z) {
        AbstractView$OnTouchListenerC7889a.AbstractC7897h hVar = this.f21886e0;
        if (hVar != null) {
            hVar.mo6938O0(i, z);
        }
    }

    public boolean m18434O2() {
        return this.f21889h0;
    }

    public void m18433P2(View view, AbstractC6928d dVar) {
        this.f21907z0 = 1;
        this.f21905x0 = dVar;
        dVar.mo11141d0();
        this.f21903v0 = view;
        addView(view);
        ((AbstractView$OnTouchListenerC7889a) getContext()).m14613B3(this);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setRevealFactor(f);
        }
    }

    public void m18432Q2(View view) {
        AbstractC9323v4<?> F;
        if ((this.f21896o0 || C4184b.f14120m) && (F = C1379j0.m37310r(getContext()).m14551P1().m9762F()) != null) {
            F.mo9397La();
        }
        if (this.f21894m0) {
            C1379j0.m37310r(getContext()).m14517Z(this, m18434O2());
        } else {
            m18429U2(view);
        }
        mo8061R(this, new Runnable() {
            @Override
            public final void run() {
                C6924j2.this.m18445B2();
            }
        });
    }

    public void m18431R2(C9207i1 i1Var) {
        if (i1Var != null) {
            if (i1Var.getParent() != null) {
                ((ViewGroup) i1Var.getParent()).removeView(i1Var);
            }
            boolean z = i1Var.getAnchorMode() == 0;
            int i = C1357a0.m37544i(8.0f);
            int itemsWidth = z != C4403w.m27986G2() ? i1Var.getItemsWidth() - i : C1357a0.m37544i(17.0f);
            if (i1Var.m9965e()) {
                i = i1Var.getItemsHeight() - i;
            }
            if (!C4183a.f14107y || !z) {
                this.f21907z0 = 2;
                i1Var.setAlpha(0.0f);
                i1Var.setScaleX(0.56f);
                i1Var.setScaleY(0.56f);
            } else {
                this.f21907z0 = 3;
                i1Var.setAlpha(0.0f);
                i1Var.setScaleX(1.0f);
                i1Var.setScaleY(1.0f);
            }
            i1Var.setPivotX(itemsWidth);
            i1Var.setPivotY(i);
            this.f21903v0 = i1Var;
            addView(i1Var);
            ((AbstractView$OnTouchListenerC7889a) getContext()).m14613B3(this);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void mo6929S4() {
        AbstractView$OnTouchListenerC7889a.AbstractC7897h hVar = this.f21886e0;
        if (hVar != null) {
            hVar.mo6929S4();
        }
        m18413r2();
    }

    public void m18430T2(View view, int i) {
        if (view == null || view.getParent() != null) {
            throw new IllegalArgumentException();
        }
        if ((view instanceof C9319v1) && C1379j0.m37310r(getContext()).m14497e1()) {
            this.f21904w0 = true;
        }
        this.f21907z0 = 0;
        this.f21877C0 = i;
        view.setTranslationY(i);
        this.f21903v0 = view;
        addView(view);
        ((AbstractView$OnTouchListenerC7889a) getContext()).m14613B3(this);
    }

    public final void m18429U2(final View view) {
        final AbstractView$OnTouchListenerC7889a r = C1379j0.m37310r(getContext());
        PopupWindow popupWindow = new PopupWindow(this, -1, -1);
        this.f21884c0 = popupWindow;
        int i = this.f21899r0;
        if (i != 0) {
            popupWindow.setSoftInputMode(i);
            this.f21884c0.setFocusable(true);
            this.f21884c0.setOutsideTouchable(false);
        } else {
            popupWindow.setFocusable(false);
            this.f21884c0.setOutsideTouchable(true);
        }
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C6924j2.this.m18444C2(r, view);
            }
        });
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            if (f == 0.0f) {
                m18413r2();
            } else if (f == 1.0f) {
                mo18440H2();
            }
        }
    }

    @Override
    public void mo4501a3() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof AbstractC5911c) {
                ((AbstractC5911c) childAt).mo4501a3();
            } else if (childAt instanceof ViewGroup) {
                C1399s0.m37167p((ViewGroup) childAt);
            }
            removeViewAt(childCount);
        }
        AbstractC9323v4<?> v4Var = this.f21897p0;
        if (v4Var != null) {
            v4Var.mo417Z8();
        }
    }

    public boolean m18424c1() {
        AbstractC9323v4<?> v4Var = this.f21897p0;
        if (v4Var != null && v4Var.mo9350Rd()) {
            return true;
        }
        View view = this.f21903v0;
        if (view instanceof AbstractC5131n0) {
            return ((AbstractC5131n0) view).mo18347c1();
        }
        return false;
    }

    @Override
    public void mo6904d6() {
        AbstractView$OnTouchListenerC7889a.AbstractC7897h hVar = this.f21886e0;
        if (hVar != null) {
            hVar.mo6904d6();
        }
    }

    public boolean m18421g0(boolean z) {
        AbstractC9323v4<?> v4Var;
        View view;
        AbstractC9162c cVar = this.f21892k0;
        return (cVar != null && cVar.mo10134g0(z)) || ((v4Var = this.f21897p0) != null && v4Var.mo404jc(false)) || ((view = this.f21903v0) != null && (view instanceof AbstractC9162c) && ((AbstractC9162c) view).mo10134g0(z));
    }

    public AbstractC9323v4<?> getBoundController() {
        return this.f21897p0;
    }

    public View getBoundView() {
        return this.f21903v0;
    }

    @Override
    public View getChildAt(int i) {
        return super.getChildAt(i);
    }

    @Override
    public View getMeasureTarget() {
        AbstractC9323v4<?> v4Var = this.f21897p0;
        return v4Var != null ? v4Var.get() : this;
    }

    @Override
    public void mo14479j(boolean z) {
        if (this.f21893l0 != z) {
            this.f21893l0 = z;
            C1408x.AbstractC1409a aVar = this.f21888g0;
            if (aVar != null) {
                aVar.mo14479j(z);
                return;
            }
            AbstractC9323v4<?> v4Var = this.f21897p0;
            if (v4Var != null) {
                v4Var.mo9136wc(z);
            }
        }
    }

    @Override
    public void mo14478j0() {
        C1408x.AbstractC1409a aVar = this.f21888g0;
        if (aVar != null) {
            aVar.mo14478j0();
            return;
        }
        AbstractC9323v4<?> v4Var = this.f21897p0;
        if (v4Var != null && (v4Var instanceof C1408x.AbstractC1409a)) {
            ((C1408x.AbstractC1409a) v4Var).mo14478j0();
        }
    }

    public void m18417l2() {
        this.f21883I0 = true;
    }

    public void m18416m2(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.m9163t8(this);
        }
    }

    public void m18415n2(float f) {
        if (this.f21880F0 == null) {
            this.f21880F0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f21882H0);
        }
        if (f != 1.0f || !this.f21904w0) {
            this.f21880F0.m29555F(0L);
        } else {
            this.f21880F0.m29555F(258L);
        }
        this.f21880F0.m29546i(f);
    }

    @Override
    public void mo6871o6() {
        AbstractView$OnTouchListenerC7889a.AbstractC7897h hVar = this.f21886e0;
        if (hVar != null) {
            hVar.mo6871o6();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        if (this.f21882H0 != 1.0f || this.f21901t0) {
            AbstractC6934j jVar = this.f21887f0;
            return jVar != null && !jVar.mo16405K1(motionEvent.getX(), motionEvent.getY());
        }
        AbstractC6933i iVar = this.f21902u0;
        if (iVar != null && iVar.mo11110v(this, motionEvent)) {
            return true;
        }
        m18408y2(true);
        return true;
    }

    public boolean m18414p2() {
        return this.f21894m0 || (this.f21899r0 != 0 && this.f21893l0);
    }

    public final void m18413r2() {
        if (!this.f21900s0) {
            this.f21900s0 = true;
            ((AbstractView$OnTouchListenerC7889a) getContext()).m14619A2(this);
            m18438K2();
            AbstractC6930f fVar = this.f21890i0;
            if (fVar != null) {
                fVar.mo2999y4(this);
            }
            mo4501a3();
        }
    }

    public void setActivityListener(AbstractView$OnTouchListenerC7889a.AbstractC7897h hVar) {
        this.f21886e0 = hVar;
    }

    public void setAnimationProvider(AbstractC6928d dVar) {
        this.f21905x0 = dVar;
    }

    public void setBackListener(AbstractC9162c cVar) {
        this.f21892k0 = cVar;
    }

    public void setBoundController(AbstractC9323v4<?> v4Var) {
        this.f21897p0 = v4Var;
    }

    public void setDisableCancelOnTouchDown(boolean z) {
        this.f21901t0 = z;
    }

    public void setDismissListener(AbstractC6930f fVar) {
        this.f21890i0 = fVar;
    }

    public void setHideBackground(boolean z) {
        this.f21881G0.setVisibility(z ? 4 : 0);
    }

    public void setKeyboardChangeListener(C1408x.AbstractC1409a aVar) {
        this.f21888g0 = aVar;
    }

    public void setNeedFullScreen(boolean z) {
        this.f21895n0 = z;
    }

    public void setOverlayStatusBar(boolean z) {
        this.f21889h0 = z;
    }

    public void setPopupHeightProvider(AbstractC6931g gVar) {
        this.f21879E0 = gVar;
    }

    public void setRevealFactor(float f) {
        View contentChild;
        if (this.f21882H0 != f) {
            this.f21882H0 = f;
            if (this.f21907z0 == 0 && (contentChild = getContentChild()) != null) {
                contentChild.setTranslationY(this.f21877C0 * (1.0f - f));
            }
            this.f21881G0.setAlpha(f);
        }
    }

    public void setShowListener(AbstractC6932h hVar) {
        this.f21891j0 = hVar;
    }

    public void setSoftInputMode(int i) {
        this.f21899r0 = i;
    }

    public void setTouchDownInterceptor(AbstractC6933i iVar) {
        this.f21902u0 = iVar;
    }

    public void setTouchProvider(AbstractC6934j jVar) {
        this.f21887f0 = jVar;
    }

    @Override
    public void mo10181t(int i, int i2, Intent intent) {
        AbstractC9323v4<?> v4Var = this.f21897p0;
        if (v4Var instanceof AbstractC9142a) {
            ((AbstractC9142a) v4Var).mo10181t(i, i2, intent);
            return;
        }
        View view = this.f21903v0;
        if (view instanceof AbstractC9142a) {
            ((AbstractC9142a) view).mo10181t(i, i2, intent);
        }
    }

    public boolean m18412t2() {
        return this.f21878D0;
    }

    public final void m18411u2() {
        C9207i1 i1Var = (C9207i1) getContentChild();
        if (i1Var != null) {
            C6926b bVar = new C6926b();
            Animator animator = null;
            if (C4183a.f14107y && i1Var.getAnchorMode() == 0) {
                try {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(i1Var, (int) i1Var.getPivotX(), (int) i1Var.getPivotY(), i1Var.getRevealRadius(), 0.0f);
                    createCircularReveal.setInterpolator(C9207i1.f29725O);
                    createCircularReveal.setDuration(258L);
                    animator = createCircularReveal;
                } catch (Throwable th) {
                    Log.m14710w("Cannot create circular reveal", th, new Object[0]);
                }
            }
            if (animator != null) {
                animator.addListener(bVar);
                animator.start();
                return;
            }
            i1Var.m9966d(bVar);
        }
    }

    public boolean m18410v2() {
        AbstractC9323v4<?> v4Var = this.f21897p0;
        if (v4Var == null) {
            return false;
        }
        if (!v4Var.m9348S9()) {
            AbstractC9323v4<?> v4Var2 = this.f21897p0;
            if (!(v4Var2 instanceof View$OnClickListenerC7430j1) || !((View$OnClickListenerC7430j1) v4Var2).m16298Xi()) {
                return false;
            }
        }
        this.f21897p0.mo9397La();
        return true;
    }

    public void m18409x2() {
        if (!this.f21898q0) {
            this.f21898q0 = true;
            m18438K2();
        }
    }

    public void m18408y2(boolean z) {
        if (!this.f21906y0) {
            this.f21906y0 = true;
            if (z) {
                m18443E2();
                return;
            }
            AbstractC6930f fVar = this.f21890i0;
            if (fVar != null) {
                fVar.mo3000j2(this);
            }
            m18413r2();
        }
    }

    public boolean m18407z2() {
        if (!this.f21894m0) {
            PopupWindow popupWindow = this.f21884c0;
            if (popupWindow != null && popupWindow.isShowing()) {
                return true;
            }
        } else if (getParent() != null) {
            return true;
        }
        return false;
    }
}
