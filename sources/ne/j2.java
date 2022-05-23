package ne;

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
import ce.a0;
import ce.j0;
import ce.p0;
import ce.x;
import ce.y;
import eb.k;
import gd.w;
import he.n;
import ie.n0;
import me.vkryl.android.widget.FrameLayoutFix;
import od.j1;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.a;
import ud.a2;
import ud.d1;
import ud.i1;
import ud.v1;
import ud.v4;

public class j2 extends t2 implements k.b, a.h, x.a, ud.a, kb.c {
    public boolean A0;
    public boolean B0;
    public int C0;
    public boolean D0;
    public g E0;
    public k F0;
    public e G0;
    public float H0;
    public boolean I0;
    public PopupWindow f18129c0;
    public View f18130d0;
    public a.h f18131e0;
    public j f18132f0;
    public x.a f18133g0;
    public boolean f18134h0;
    public f f18135i0;
    public h f18136j0;
    public ud.c f18137k0;
    public boolean f18138l0;
    public boolean f18139m0;
    public boolean f18140n0;
    public boolean f18141o0;
    public v4<?> f18142p0;
    public boolean f18143q0;
    public int f18144r0;
    public boolean f18145s0;
    public boolean f18146t0;
    public i f18147u0;
    public View f18148v0;
    public boolean f18149w0;
    public d f18150x0;
    public boolean f18151y0;
    public int f18152z0;

    public class a implements a.m {
        public final org.thunderdog.challegram.a f18153a;
        public final View f18154b;

        public a(org.thunderdog.challegram.a aVar, View view) {
            this.f18153a = aVar;
            this.f18154b = view;
        }

        @Override
        public void V(org.thunderdog.challegram.a aVar, int i10, int i11) {
            if (j2.this.f18151y0 || j2.this.f18145s0) {
                this.f18153a.A2(this);
            } else if (i10 == 0) {
                this.f18153a.A2(this);
                if (!j2.this.f18143q0) {
                    j2.this.R2(this.f18154b);
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            j2.this.l2();
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            j2.this.H0 = 1.0f;
            j2.this.C2();
        }
    }

    public interface d {
        void H2(j2 j2Var);

        boolean U1(j2 j2Var, k kVar);

        void c0();
    }

    public class e extends View {
        public e(Context context) {
            super(context);
            setAlpha(0.0f);
        }

        @Override
        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (j2.this.I0) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), d1.getTopOffset(), y.g(ib.d.b(76, 0)));
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int b10 = ib.d.b((int) (ae.j.X() * 255.0f), 0);
            int topOffset = d1.getTopOffset();
            if (!j2.this.I0 || topOffset == 0) {
                canvas.drawColor(b10);
            } else {
                canvas.drawRect(0.0f, topOffset, getMeasuredWidth(), getMeasuredHeight(), y.g(b10));
            }
        }
    }

    public interface f {
        void h3(j2 j2Var);

        void w(j2 j2Var);
    }

    public interface g {
        int getCurrentPopupHeight();
    }

    public interface h {
        void B0(j2 j2Var);
    }

    public interface i {
        boolean y0(j2 j2Var, MotionEvent motionEvent);
    }

    public interface j {
        boolean F1(float f10, float f11);
    }

    public j2(Context context) {
        super(context);
        setKeyboardListener(this);
        setLayoutParams(FrameLayoutFix.q1(-1, -1));
        e eVar = new e(context);
        this.G0 = eVar;
        eVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        addView(this.G0);
    }

    public static void D2(PopupWindow popupWindow) {
        View rootView = popupWindow.getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= Log.TAG_GIF_LOADER;
        ((WindowManager) popupWindow.getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    private View getContentChild() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof e)) {
                return childAt;
            }
        }
        return null;
    }

    public void v2() {
        if (!this.f18151y0) {
            A2();
        }
    }

    public void y2(org.thunderdog.challegram.a aVar, View view) {
        if (!this.f18151y0 && !this.f18145s0) {
            if (aVar.L0() == 0) {
                try {
                    PopupWindow popupWindow = this.f18129c0;
                    this.f18130d0 = view;
                    popupWindow.showAtLocation(view, 0, 0, 0);
                    this.f18129c0.setBackgroundDrawable(new a2(j0.r(getContext())));
                    if (this.f18140n0) {
                        D2(this.f18129c0);
                    }
                } catch (Throwable th) {
                    Log.e("Cannot show window", th, new Object[0]);
                }
            } else {
                aVar.Z(new a(aVar, view));
            }
        }
    }

    public final void A2() {
        Throwable th;
        if (!this.A0) {
            boolean z10 = true;
            this.A0 = true;
            int i10 = this.f18152z0;
            if (i10 == 0) {
                j2(1.0f);
            } else if (i10 == 1) {
                this.f18150x0.H2(this);
            } else if (i10 == 2 || i10 == 3) {
                c cVar = new c();
                i1 i1Var = (i1) getContentChild();
                if (i1Var != null) {
                    if (this.f18152z0 == 2) {
                        i1Var.c(cVar);
                        return;
                    }
                    if (i1Var.getAnchorMode() != 0) {
                        z10 = false;
                    }
                    int i11 = a0.i(8.0f);
                    int itemsWidth = i1Var.getItemsWidth();
                    int i12 = z10 != w.G2() ? itemsWidth - i11 : a0.i(17.0f);
                    if (i1Var.e()) {
                        i11 = i1Var.getItemsHeight() - i11;
                    }
                    if (this.f18152z0 == 3 && fd.a.f11903y) {
                        try {
                            int i13 = w.G2() ? (int) (a0.i(49.0f) * 0.5f) : itemsWidth - ((int) (a0.i(49.0f) * 0.5f));
                            int e10 = n.e() / 2;
                            if (i1Var.e()) {
                                e10 = i1Var.getItemsHeight() - e10;
                            }
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(i1Var, i13, e10, 0.0f, i1Var.getRevealRadius());
                            createCircularReveal.addListener(cVar);
                            createCircularReveal.setInterpolator(i1.O);
                            createCircularReveal.setDuration(258L);
                            this.f18152z0 = 3;
                            try {
                                i1Var.setPivotX(i13);
                                i1Var.setPivotY(e10);
                                createCircularReveal.start();
                                i1Var.setAlpha(1.0f);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                i12 = i13;
                                i11 = e10;
                                Log.w("Cannot create circular reveal", th, new Object[0]);
                                i1Var.setAlpha(0.0f);
                                i1Var.setScaleX(0.56f);
                                i1Var.setScaleY(0.56f);
                                i1Var.setPivotX(i12);
                                i1Var.setPivotY(i11);
                                this.f18152z0 = 2;
                                i1Var.c(cVar);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    i1Var.setAlpha(0.0f);
                    i1Var.setScaleX(0.56f);
                    i1Var.setScaleY(0.56f);
                    i1Var.setPivotX(i12);
                    i1Var.setPivotY(i11);
                    this.f18152z0 = 2;
                    i1Var.c(cVar);
                }
            }
        }
    }

    public void B2() {
        l2();
    }

    public void C2() {
        this.D0 = true;
        h hVar = this.f18136j0;
        if (hVar != null) {
            hVar.B0(this);
        }
    }

    public final void E2() {
        if (this.f18139m0) {
            j0.r(getContext()).removeFromRoot(this);
            return;
        }
        PopupWindow popupWindow = this.f18129c0;
        if (popupWindow != null) {
            try {
                popupWindow.dismiss();
            } catch (Throwable unused) {
            }
        }
    }

    public void F2() {
        if (this.f18143q0) {
            this.f18143q0 = false;
            if (this.f18139m0) {
                j0.r(getContext()).a0(this, J2());
                return;
            }
            View view = this.f18130d0;
            if (view != null) {
                R2(view);
            }
        }
    }

    public void G2() {
        this.f18141o0 = true;
    }

    public void I2() {
        this.f18139m0 = true;
    }

    public boolean J2() {
        return this.f18134h0;
    }

    public void L2(View view, d dVar) {
        this.f18152z0 = 1;
        this.f18150x0 = dVar;
        dVar.c0();
        this.f18148v0 = view;
        addView(view);
        ((org.thunderdog.challegram.a) getContext()).C3(this);
    }

    public void M2(View view) {
        v4<?> F;
        if ((this.f18141o0 || fd.b.f11916m) && (F = j0.r(getContext()).Q1().F()) != null) {
            F.La();
        }
        if (this.f18139m0) {
            j0.r(getContext()).a0(this, J2());
        } else {
            R2(view);
        }
        S(this, new Runnable() {
            @Override
            public final void run() {
                j2.this.v2();
            }
        });
    }

    @Override
    public void M4() {
        a.h hVar = this.f18131e0;
        if (hVar != null) {
            hVar.M4();
        }
        l2();
    }

    public void N2(i1 i1Var) {
        if (i1Var != null) {
            if (i1Var.getParent() != null) {
                ((ViewGroup) i1Var.getParent()).removeView(i1Var);
            }
            boolean z10 = i1Var.getAnchorMode() == 0;
            int i10 = a0.i(8.0f);
            int itemsWidth = z10 != w.G2() ? i1Var.getItemsWidth() - i10 : a0.i(17.0f);
            if (i1Var.e()) {
                i10 = i1Var.getItemsHeight() - i10;
            }
            if (!fd.a.f11903y || !z10) {
                this.f18152z0 = 2;
                i1Var.setAlpha(0.0f);
                i1Var.setScaleX(0.56f);
                i1Var.setScaleY(0.56f);
            } else {
                this.f18152z0 = 3;
                i1Var.setAlpha(0.0f);
                i1Var.setScaleX(1.0f);
                i1Var.setScaleY(1.0f);
            }
            i1Var.setPivotX(itemsWidth);
            i1Var.setPivotY(i10);
            this.f18148v0 = i1Var;
            addView(i1Var);
            ((org.thunderdog.challegram.a) getContext()).C3(this);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void P2(View view, int i10) {
        if (view == null || view.getParent() != null) {
            throw new IllegalArgumentException();
        }
        if ((view instanceof v1) && j0.r(getContext()).f1()) {
            this.f18149w0 = true;
        }
        this.f18152z0 = 0;
        this.C0 = i10;
        view.setTranslationY(i10);
        this.f18148v0 = view;
        addView(view);
        ((org.thunderdog.challegram.a) getContext()).C3(this);
    }

    @Override
    public void Q0(int i10, boolean z10) {
        a.h hVar = this.f18131e0;
        if (hVar != null) {
            hVar.Q0(i10, z10);
        }
    }

    @Override
    public void Q2() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof kb.c) {
                ((kb.c) childAt).Q2();
            } else if (childAt instanceof ViewGroup) {
                p0.m((ViewGroup) childAt);
            }
            removeViewAt(childCount);
        }
        v4<?> v4Var = this.f18142p0;
        if (v4Var != null) {
            v4Var.Z8();
        }
    }

    public final void R2(final View view) {
        final org.thunderdog.challegram.a r10 = j0.r(getContext());
        PopupWindow popupWindow = new PopupWindow(this, -1, -1);
        this.f18129c0 = popupWindow;
        int i10 = this.f18144r0;
        if (i10 != 0) {
            popupWindow.setSoftInputMode(i10);
            this.f18129c0.setFocusable(true);
            this.f18129c0.setOutsideTouchable(false);
        } else {
            popupWindow.setFocusable(false);
            this.f18129c0.setOutsideTouchable(true);
        }
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                j2.this.y2(r10, view);
            }
        });
    }

    public boolean T0() {
        v4<?> v4Var = this.f18142p0;
        if (v4Var != null && v4Var.Rd()) {
            return true;
        }
        View view = this.f18148v0;
        if (view instanceof n0) {
            return ((n0) view).T0();
        }
        return false;
    }

    @Override
    public void c6() {
        a.h hVar = this.f18131e0;
        if (hVar != null) {
            hVar.c6();
        }
    }

    public v4<?> getBoundController() {
        return this.f18142p0;
    }

    public View getBoundView() {
        return this.f18148v0;
    }

    @Override
    public View getChildAt(int i10) {
        return super.getChildAt(i10);
    }

    @Override
    public View getMeasureTarget() {
        v4<?> v4Var = this.f18142p0;
        return v4Var != null ? v4Var.get() : this;
    }

    public void h2() {
        this.I0 = true;
    }

    public void i2(v4<?> v4Var) {
        if (v4Var != null) {
            v4Var.t8(this);
        }
    }

    @Override
    public void j(boolean z10) {
        if (this.f18138l0 != z10) {
            this.f18138l0 = z10;
            x.a aVar = this.f18133g0;
            if (aVar != null) {
                aVar.j(z10);
                return;
            }
            v4<?> v4Var = this.f18142p0;
            if (v4Var != null) {
                v4Var.wc(z10);
            }
        }
    }

    public boolean j0(boolean z10) {
        v4<?> v4Var;
        View view;
        ud.c cVar = this.f18137k0;
        return (cVar != null && cVar.j0(z10)) || ((v4Var = this.f18142p0) != null && v4Var.jc(false)) || ((view = this.f18148v0) != null && (view instanceof ud.c) && ((ud.c) view).j0(z10));
    }

    public void j2(float f10) {
        if (this.F0 == null) {
            this.F0 = new k(0, this, db.b.f7287b, 180L, this.H0);
        }
        if (f10 != 1.0f || !this.f18149w0) {
            this.F0.F(0L);
        } else {
            this.F0.F(258L);
        }
        this.F0.i(f10);
    }

    public boolean k2() {
        return this.f18139m0 || (this.f18144r0 != 0 && this.f18138l0);
    }

    public final void l2() {
        if (!this.f18145s0) {
            this.f18145s0 = true;
            ((org.thunderdog.challegram.a) getContext()).B2(this);
            E2();
            f fVar = this.f18135i0;
            if (fVar != null) {
                fVar.h3(this);
            }
            Q2();
        }
    }

    public boolean m2() {
        return this.D0;
    }

    @Override
    public void n0() {
        x.a aVar = this.f18133g0;
        if (aVar != null) {
            aVar.n0();
            return;
        }
        v4<?> v4Var = this.f18142p0;
        if (v4Var != null && (v4Var instanceof x.a)) {
            ((x.a) v4Var).n0();
        }
    }

    public final void n2() {
        i1 i1Var = (i1) getContentChild();
        if (i1Var != null) {
            b bVar = new b();
            Animator animator = null;
            if (fd.a.f11903y && i1Var.getAnchorMode() == 0) {
                try {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(i1Var, (int) i1Var.getPivotX(), (int) i1Var.getPivotY(), i1Var.getRevealRadius(), 0.0f);
                    createCircularReveal.setInterpolator(i1.O);
                    createCircularReveal.setDuration(258L);
                    animator = createCircularReveal;
                } catch (Throwable th) {
                    Log.w("Cannot create circular reveal", th, new Object[0]);
                }
            }
            if (animator != null) {
                animator.addListener(bVar);
                animator.start();
                return;
            }
            i1Var.d(bVar);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setRevealFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0) {
            if (f10 == 0.0f) {
                l2();
            } else if (f10 == 1.0f) {
                C2();
            }
        }
    }

    @Override
    public void o6() {
        a.h hVar = this.f18131e0;
        if (hVar != null) {
            hVar.o6();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        if (this.H0 != 1.0f || this.f18146t0) {
            j jVar = this.f18132f0;
            return jVar != null && !jVar.F1(motionEvent.getX(), motionEvent.getY());
        }
        i iVar = this.f18147u0;
        if (iVar != null && iVar.y0(this, motionEvent)) {
            return true;
        }
        s2(true);
        return true;
    }

    public boolean p2() {
        v4<?> v4Var = this.f18142p0;
        if (v4Var == null) {
            return false;
        }
        if (!v4Var.S9()) {
            v4<?> v4Var2 = this.f18142p0;
            if (!(v4Var2 instanceof j1) || !((j1) v4Var2).Xi()) {
                return false;
            }
        }
        this.f18142p0.La();
        return true;
    }

    public void r2() {
        if (!this.f18143q0) {
            this.f18143q0 = true;
            E2();
        }
    }

    public void s2(boolean z10) {
        if (!this.f18151y0) {
            this.f18151y0 = true;
            if (z10) {
                z2();
                return;
            }
            f fVar = this.f18135i0;
            if (fVar != null) {
                fVar.w(this);
            }
            l2();
        }
    }

    public void setActivityListener(a.h hVar) {
        this.f18131e0 = hVar;
    }

    public void setAnimationProvider(d dVar) {
        this.f18150x0 = dVar;
    }

    public void setBackListener(ud.c cVar) {
        this.f18137k0 = cVar;
    }

    public void setBoundController(v4<?> v4Var) {
        this.f18142p0 = v4Var;
    }

    public void setDisableCancelOnTouchDown(boolean z10) {
        this.f18146t0 = z10;
    }

    public void setDismissListener(f fVar) {
        this.f18135i0 = fVar;
    }

    public void setHideBackground(boolean z10) {
        this.G0.setVisibility(z10 ? 4 : 0);
    }

    public void setKeyboardChangeListener(x.a aVar) {
        this.f18133g0 = aVar;
    }

    public void setNeedFullScreen(boolean z10) {
        this.f18140n0 = z10;
    }

    public void setOverlayStatusBar(boolean z10) {
        this.f18134h0 = z10;
    }

    public void setPopupHeightProvider(g gVar) {
        this.E0 = gVar;
    }

    public void setRevealFactor(float f10) {
        View contentChild;
        if (this.H0 != f10) {
            this.H0 = f10;
            if (this.f18152z0 == 0 && (contentChild = getContentChild()) != null) {
                contentChild.setTranslationY(this.C0 * (1.0f - f10));
            }
            this.G0.setAlpha(f10);
        }
    }

    public void setShowListener(h hVar) {
        this.f18136j0 = hVar;
    }

    public void setSoftInputMode(int i10) {
        this.f18144r0 = i10;
    }

    public void setTouchDownInterceptor(i iVar) {
        this.f18147u0 = iVar;
    }

    public void setTouchProvider(j jVar) {
        this.f18132f0 = jVar;
    }

    public boolean t2() {
        if (!this.f18139m0) {
            PopupWindow popupWindow = this.f18129c0;
            if (popupWindow != null && popupWindow.isShowing()) {
                return true;
            }
        } else if (getParent() != null) {
            return true;
        }
        return false;
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        v4<?> v4Var = this.f18142p0;
        if (v4Var instanceof ud.a) {
            ((ud.a) v4Var).u(i10, i11, intent);
            return;
        }
        View view = this.f18148v0;
        if (view instanceof ud.a) {
            ((ud.a) view).u(i10, i11, intent);
        }
    }

    public boolean u2() {
        return this.f18151y0;
    }

    public final void z2() {
        if (!this.B0) {
            this.B0 = true;
            v4<?> v4Var = this.f18142p0;
            if (v4Var != null) {
                v4Var.zc();
            }
            f fVar = this.f18135i0;
            if (fVar != null) {
                fVar.w(this);
            }
            int i10 = this.f18152z0;
            int i11 = 0;
            if (i10 == 0) {
                d dVar = this.f18150x0;
                if (dVar != null) {
                    this.f18152z0 = 1;
                    if (!dVar.U1(this, this.F0)) {
                        this.f18152z0 = 0;
                    } else {
                        return;
                    }
                }
                g gVar = this.E0;
                if (gVar != null) {
                    this.C0 = gVar.getCurrentPopupHeight();
                } else {
                    View contentChild = getContentChild();
                    if (contentChild != null) {
                        i11 = contentChild.getMeasuredHeight();
                    }
                    this.C0 = i11;
                }
                j2(0.0f);
            } else if (i10 != 1) {
                if (i10 == 2 || i10 == 3) {
                    n2();
                }
            } else if (!this.f18150x0.U1(this, this.F0)) {
                g gVar2 = this.E0;
                if (gVar2 != null) {
                    this.C0 = gVar2.getCurrentPopupHeight();
                } else {
                    View contentChild2 = getContentChild();
                    this.C0 = contentChild2 != null ? contentChild2.getMeasuredHeight() : 0;
                }
                this.f18152z0 = 0;
                j2(0.0f);
            }
        }
    }
}
