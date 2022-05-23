package ud;

import ae.j;
import ae.q;
import ae.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import ce.a0;
import ce.o;
import ce.p0;
import ce.y;
import db.g;
import gd.w;
import he.n;
import ib.d;
import ib.i;
import ie.x0;
import java.util.ArrayList;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.g0;
import ne.j2;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.HeaderEditText;
import zd.s1;
import zd.t1;

public class d1 extends FrameLayoutFix implements View.OnClickListener, View.OnLongClickListener, kb.c, w.a, a0.a, t1.a {
    public static boolean f24090f1 = true;
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public int F0;
    public boolean G0;
    public s0 H0;
    public boolean I0;
    public nb.c J0;
    public boolean K0;
    public int L0;
    public u1 M;
    public int M0;
    public boolean N;
    public nb.c N0;
    public q1 O;
    public boolean O0;
    public LinearLayout P;
    public nb.c P0;
    public LinearLayout Q;
    public Window Q0;
    public ud.b R;
    public boolean R0;
    public View S;
    public nb.c S0;
    public View T;
    public boolean T0;
    public v4<?> U;
    public boolean U0;
    public v4<?> V;
    public boolean V0;
    public TextView W;
    public boolean W0;
    public float X0;
    public boolean Y0;
    public int Z0;
    public TextView f24091a0;
    public float f24092a1;
    public float f24093b0;
    public float f24094b1;
    public x0 f24095c0;
    public float f24096c1;
    public boolean f24097d0;
    public boolean f24100e1;
    public boolean f24101f0;
    public boolean f24102g0;
    public int f24104i0;
    public View.OnClickListener f24105j0;
    public View.OnClickListener f24106k0;
    public v f24107l0;
    public i1 f24108m0;
    public View.OnClickListener f24109n0;
    public int f24110o0;
    public boolean f24111p0;
    public int f24112q0;
    public boolean f24113r0;
    public boolean f24114s0;
    public boolean f24115t0;
    public float f24116u0;
    public float f24117v0;
    public boolean f24118w0;
    public boolean f24119x0;
    public boolean f24120y0;
    public boolean f24121z0;
    public int f24099e0 = -1;
    public int f24103h0 = -1;
    public boolean f24098d1 = false;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            Rect bounds = d1.this.f24095c0.getBounds();
            int i10 = bounds.left;
            int i11 = bounds.top;
            outline.setRect(i10, i11, bounds.right, d1.this.f24095c0.u() + i11 + d1.this.getCurrentHeaderOffset());
            outline.setAlpha(0.0f);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final boolean f24123a;
        public final int f24124b;
        public final v4 f24125c;
        public final Runnable f24126d;

        public b(boolean z10, int i10, v4 v4Var, Runnable runnable) {
            this.f24123a = z10;
            this.f24124b = i10;
            this.f24125c = v4Var;
            this.f24126d = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!this.f24123a) {
                int i10 = this.f24124b;
                if (i10 == 1) {
                    this.f24125c.Tb();
                    this.f24125c.yc();
                } else if (i10 == 2) {
                    this.f24125c.Sb();
                } else if (i10 == 3) {
                    this.f24125c.Rb();
                }
            } else {
                int i11 = this.f24124b;
                if (i11 == 2) {
                    this.f24125c.Ee(true);
                } else if (i11 == 3) {
                    this.f24125c.De(true);
                }
            }
            d1.this.k2(this.f24125c);
            d1.this.f24095c0.W();
            d1.this.Z0 = 0;
            d1.this.Y0 = false;
            Runnable runnable = this.f24126d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public interface c {
        void m(d1 d1Var, int i10);
    }

    public d1(Context context) {
        super(context);
        ud.b bVar = new ud.b(context);
        this.R = bVar;
        bVar.setParentHeader(this);
        ud.b bVar2 = this.R;
        bVar2.setOnClickListener(bVar2);
        this.R.setVisibility(8);
        this.R.setLayoutParams(FrameLayoutFix.r1(a0.i(56.0f), n.e(), (w.G2() ? 5 : 3) | 48));
        addView(this.R);
        LinearLayout z22 = z2(context);
        this.P = z22;
        addView(z22);
        this.W = G2(context);
        this.f24093b0 = n.e();
        setOutlineProvider(new a());
    }

    public static r A2(Context context, int i10) {
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, a0.i(53.0f), (w.G2() ? 5 : 3) | 48);
        if (w.G2()) {
            r12.rightMargin = a0.i(68.0f);
        } else {
            r12.leftMargin = a0.i(68.0f);
        }
        r rVar = new r(context);
        rVar.y(i10);
        rVar.setLayoutParams(r12);
        return rVar;
    }

    public static HeaderEditText B2(ViewGroup viewGroup, v4<?> v4Var) {
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, a0.i(53.0f), (w.G2() ? 5 : 3) | 48);
        if (w.G2()) {
            r12.rightMargin = a0.i(68.0f);
        } else {
            r12.leftMargin = a0.i(68.0f);
        }
        HeaderEditText A = HeaderEditText.A(viewGroup);
        A.setTextColor(j.P0());
        v4Var.r8(A, R.id.theme_color_textSelectionHighlight);
        A.s();
        v4Var.z8(A, R.id.theme_color_text);
        A.setHintTextColor(j.R0());
        v4Var.s8(A, R.id.theme_color_textLight);
        A.setLayoutParams(r12);
        return A;
    }

    public static HeaderEditText E2(ViewGroup viewGroup, boolean z10, v4<?> v4Var) {
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, a0.i(53.0f), (w.G2() ? 5 : 3) | 48);
        if (w.G2()) {
            r12.rightMargin = a0.i(68.0f);
        } else {
            r12.leftMargin = a0.i(68.0f);
        }
        HeaderEditText B = HeaderEditText.B(viewGroup, z10);
        B.setTextColor(j.L(R.id.theme_color_headerText));
        if (v4Var != null) {
            v4Var.r8(B, R.id.theme_color_textSelectionHighlight);
        }
        B.s();
        if (v4Var != null) {
            v4Var.z8(B, R.id.theme_color_headerText);
        }
        B.setHintTextColor(d.a(j.f856a, j.n0()));
        if (v4Var != null) {
            v4Var.s8(B, R.id.theme_color_headerText).e(j.f856a);
        }
        B.setLayoutParams(r12);
        return B;
    }

    public static void H3(ViewGroup viewGroup) {
        int childCount;
        if (viewGroup != null && (childCount = viewGroup.getChildCount()) > 1) {
            ArrayList<View> arrayList = new ArrayList(childCount);
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                arrayList.add(viewGroup.getChildAt(i10));
                viewGroup.removeViewAt(i10);
            }
            for (View view : arrayList) {
                if (view != null) {
                    viewGroup.addView(view);
                }
            }
        }
    }

    public static void I3(View view) {
        FrameLayout.LayoutParams layoutParams;
        int i10;
        int i11;
        if (view != null && (i10 = (layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams()).leftMargin) != (i11 = layoutParams.rightMargin)) {
            layoutParams.rightMargin = i10;
            layoutParams.leftMargin = i11;
            p0.r0(view);
        }
    }

    public static int M2(v4<?> v4Var, boolean z10) {
        if (v4Var == null) {
            return 1;
        }
        if (z10) {
            if (v4Var.Oa()) {
                return 4;
            }
            if (v4Var.Na()) {
                return v4Var.da();
            }
            if (v4Var.Ma()) {
                return 3;
            }
        }
        return v4Var.A9();
    }

    public static int N2(v4<?> v4Var, boolean z10) {
        if (v4Var == null) {
            return j.j0();
        }
        if (z10) {
            if (v4Var.Na()) {
                return v4Var.ha();
            }
            if (v4Var.Oa()) {
                return v4Var.va();
            }
        }
        return v4Var.N9();
    }

    public static int P2(v4<?> v4Var, boolean z10) {
        if (v4Var == null) {
            return q.b();
        }
        if (z10) {
            if (v4Var.Oa()) {
                return v4Var.sa();
            }
            if (v4Var.Na()) {
                return v4Var.ea();
            }
        }
        return v4Var.B9();
    }

    public static int R2(boolean z10) {
        return z10 ? n.g() + getTopOffset() : n.g();
    }

    public static int S2(v4<?> v4Var) {
        if (v4Var == null) {
            return 0;
        }
        return v4Var.J9();
    }

    public static int T2(v4<?> v4Var, boolean z10) {
        if (v4Var == null) {
            return j.k0();
        }
        if (z10) {
            if (v4Var.Oa()) {
                return v4Var.ta();
            }
            if (v4Var.Na()) {
                return v4Var.fa();
            }
        }
        return v4Var.K9();
    }

    public static int V2(v4<?> v4Var) {
        return v4Var == null ? n.e() : v4Var.M9();
    }

    public static int X2(v4<?> v4Var, boolean z10) {
        if (v4Var == null) {
            return j.n0();
        }
        if (z10) {
            if (v4Var.Oa()) {
                return j.L(v4Var.ya());
            }
            if (v4Var.Na()) {
                return v4Var.na();
            }
        }
        return v4Var.P9();
    }

    public static void X3(ViewGroup viewGroup, int i10) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof ViewGroup) {
                X3((ViewGroup) childAt, i10);
            } else if (childAt instanceof u0) {
                childAt.invalidate();
            }
        }
    }

    public static float Y2(float f10) {
        return (f10 - n.e()) / n.h();
    }

    public static int Z2(v4<?> v4Var, boolean z10) {
        if (v4Var == null) {
            return 0;
        }
        if (z10) {
            if (v4Var.Oa()) {
                return v4Var.xa();
            }
            if (v4Var.Na()) {
                return v4Var.la();
            }
            if (v4Var.Ma()) {
                return 0;
            }
        }
        return v4Var.W9();
    }

    public static int a3(boolean z10) {
        return z10 ? n.e() + getTopOffset() : n.e();
    }

    public static int b3(boolean z10, boolean z11) {
        return z10 ? R2(z11) : a3(z11);
    }

    public static int d3(v4<?> v4Var, boolean z10) {
        if (v4Var == null) {
            return 1275068416;
        }
        return v4Var.Y9();
    }

    public static int f3(v4<?> v4Var) {
        if (v4Var == null || v4Var.Ma()) {
            return 0;
        }
        if (v4Var.Oa()) {
            return v4Var.xa();
        }
        if (v4Var.Na()) {
            return v4Var.la();
        }
        return 0;
    }

    public static int g3(v4<?> v4Var) {
        if (v4Var.Ma()) {
            return 3;
        }
        if (v4Var.Oa()) {
            return 1;
        }
        return v4Var.Na() ? 2 : 0;
    }

    public int getCurrentHeaderOffset() {
        int i10 = this.f24099e0;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    private float getHeightFactor() {
        return (this.f24093b0 - n.e()) / n.h();
    }

    public static int getPlayerSize() {
        return n.d();
    }

    private v getThemeListeners() {
        if (this.f24107l0 == null) {
            this.f24107l0 = new v();
        }
        return this.f24107l0;
    }

    public static int getTopOffset() {
        return a0.o();
    }

    public static void h4(View view, int i10, int i11) {
        if (view instanceof c2) {
            ((c2) view).s();
        }
        if (view instanceof HeaderEditText) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i12 = (w.G2() ? 5 : 3) | 48;
            boolean z10 = true;
            boolean z11 = layoutParams.gravity != i12;
            layoutParams.gravity = i12;
            if (w.G2()) {
                if (!z11 && layoutParams.leftMargin == i11 && layoutParams.rightMargin == i10) {
                    z10 = false;
                }
                layoutParams.rightMargin = i10;
                layoutParams.leftMargin = i11;
            } else {
                if (!z11 && layoutParams.leftMargin == i10 && layoutParams.rightMargin == i11) {
                    z10 = false;
                }
                layoutParams.leftMargin = i10;
                layoutParams.rightMargin = i11;
            }
            if (z10) {
                p0.r0(view);
            }
        }
    }

    public static void i4(View view, int i10, int i11) {
        if (view instanceof r) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i12 = (w.G2() ? 5 : 3) | 48;
            boolean z10 = true;
            boolean z11 = layoutParams.gravity != i12;
            layoutParams.gravity = i12;
            if (w.G2()) {
                if (!z11 && layoutParams.leftMargin == i11 && layoutParams.rightMargin == i10) {
                    z10 = false;
                }
                layoutParams.rightMargin = i10;
                layoutParams.leftMargin = i11;
            } else {
                if (!z11 && layoutParams.leftMargin == i10 && layoutParams.rightMargin == i11) {
                    z10 = false;
                }
                layoutParams.leftMargin = i10;
                layoutParams.rightMargin = i11;
            }
            if (z10) {
                p0.r0(view);
            }
        }
    }

    public static void p4(View view, v4<?> v4Var, int i10, int i11) {
        boolean z10;
        if (view != null && v4Var != null) {
            int i12 = a0.i(15.0f) + i11;
            if (v4Var.A9() != 1) {
                if (w.G2()) {
                    z10 = p0.b0((FrameLayout.LayoutParams) view.getLayoutParams(), i10, i12, a0.i(68.0f), 0);
                } else {
                    z10 = p0.b0((FrameLayout.LayoutParams) view.getLayoutParams(), a0.i(68.0f), i12, i10, 0);
                }
            } else if (w.G2()) {
                z10 = p0.b0((FrameLayout.LayoutParams) view.getLayoutParams(), i10, i12, a0.i(18.0f), 0);
            } else {
                z10 = p0.b0((FrameLayout.LayoutParams) view.getLayoutParams(), a0.i(18.0f), i12, i10, 0);
            }
            if (z10) {
                p0.r0(view);
            }
        }
    }

    public void q3(View view) {
        v4<?> l10 = this.M.l();
        if (l10 instanceof x0) {
            N3(((x0) l10).G4());
        }
    }

    public void r3(View view) {
        ((j2) view.getParent().getParent()).s2(true);
        v4<?> l10 = this.M.l();
        if (l10 instanceof j1) {
            ((j1) l10).P0(view.getId());
        }
    }

    public static int s2(int i10) {
        return d.c(i10, 855638016);
    }

    public void s3(View view) {
        ((j2) view.getParent().getParent()).s2(true);
        v4<?> l10 = this.M.l();
        if (l10 instanceof x0) {
            ((x0) l10).P2(view.getId());
        }
    }

    private void setHeaderOffset(int i10) {
        if (this.f24099e0 != i10) {
            this.f24099e0 = i10;
            p0.m0(this.R, i10);
            p0.m0(this.P, i10);
            p0.m0(this.Q, i10);
            p0.m0(this.W, a0.i(15.0f) + i10);
            p0.m0(this.f24091a0, a0.i(15.0f) + i10);
            i1 i1Var = this.f24108m0;
            if (i1Var != null) {
                i1Var.setTranslationY(getTranslationY() + getCurrentHeaderOffset());
            }
            View view = this.S;
            if (view != this.W) {
                u2(view);
            }
            View view2 = this.T;
            if (!(view2 == null || view2 == this.f24091a0)) {
                u2(view2);
            }
            invalidateOutline();
            if (this.N) {
                setLayoutParams(FrameLayoutFix.r1(-1, a3(true) + this.f24095c0.t(), 48));
            } else {
                setLayoutParams(FrameLayoutFix.r1(-1, n.g() + getTopOffset() + this.f24095c0.t() + n.e(), 48));
            }
        }
    }

    public static int t2() {
        return s2(j.k0());
    }

    public void t3(float f10, int i10, v4 v4Var, ValueAnimator valueAnimator) {
        float a10 = f10 - (db.b.a(valueAnimator) * f10);
        setTranslation(a10);
        if (i10 == 2) {
            v4Var.Jd(1.0f - a10, true);
        }
    }

    public void v3(float f10, float f11, int i10, v4 v4Var, ValueAnimator valueAnimator) {
        float a10 = f10 + (f11 * db.b.a(valueAnimator));
        setTranslation(a10);
        if (i10 == 2) {
            v4Var.Jd(1.0f - a10, false);
        }
    }

    public static boolean v4(v4<?> v4Var) {
        return v4Var == null || v4Var.He();
    }

    public static boolean w4(v4<?> v4Var) {
        return v4Var == null || v4Var.Ie();
    }

    public static int x4() {
        return s2(-1);
    }

    public HeaderEditText C2(v4<?> v4Var) {
        return B2(this, v4Var);
    }

    public void C3() {
        v4<?> l10 = this.M.l();
        if (!this.Y0 && l10 != null && !l10.Pa() && Color.alpha(this.f24110o0) <= 0) {
            this.Y0 = true;
            l10.j9();
            this.X0 = 1.0f;
            O3(l10, 2, 0, true, true, null);
        }
    }

    public final void D2(v4<?> v4Var, v4<?> v4Var2, boolean z10) {
        h1 h1Var;
        v4<?> v4Var3;
        v4<?> v4Var4;
        if (z10) {
            this.U = v4Var2;
            this.V = v4Var;
        } else {
            this.U = v4Var;
            this.V = v4Var2;
        }
        this.f24114s0 = z10;
        if (v4Var2 == null) {
            this.T = z10 ? v4Var.Fa(this) : v4Var.G9();
        } else {
            v4<?> v4Var5 = this.U;
            this.T = v4Var5 == null ? null : v4Var5.Pa() ? this.U.Fa(this) : this.U.G9();
        }
        boolean z11 = true;
        int i10 = 0;
        if (v4Var2 == null && v4Var.f9()) {
            this.f24112q0 = 0;
            this.f24113r0 = false;
            this.T = this.S;
        } else if (v4Var2 == null || v4Var2.r9()) {
            this.f24113r0 = false;
            this.f24112q0 = 3;
        } else {
            boolean z12 = this.T != null && v4Var2.Pd() && !v4Var2.Pa() && !v4Var.Pa();
            this.f24113r0 = z12;
            this.f24112q0 = (z12 || !v4Var2.Ke()) ? 0 : this.f24112q0;
        }
        View view = this.T;
        boolean z13 = view == null;
        if (z13) {
            if (this.f24091a0 == null) {
                this.f24091a0 = G2(getContext());
            }
            this.f24091a0.setId(this.U.R9());
            p0.c0(this.f24091a0, this.U.X9());
            this.T = this.f24091a0;
        } else {
            u2(view);
        }
        View view2 = this.T;
        if (view2 != this.S) {
            if (view2.getParent() != null) {
                removeView(this.T);
            }
            if (z10) {
                addView(this.T, !f24090f1 ? 1 : 0);
            } else {
                addView(this.T, f24090f1 ? 1 : 2);
            }
        }
        if (this.f24113r0) {
            this.S.setVisibility(8);
        }
        int Z2 = Z2(v4Var, v4Var2 != null);
        int f32 = v4Var2 == null ? f3(v4Var) : Z2(v4Var2, true);
        int i11 = z10 ? f32 : Z2;
        if (i11 == 0 || Z2 == f32) {
            this.f24111p0 = false;
        } else {
            this.f24111p0 = true;
            if (this.Q == null) {
                this.Q = z2(getContext());
            }
            if (v4Var2 != null || !z10 ? (v4Var3 = this.U) == null || !v4Var3.D8() : (v4Var4 = this.V) == null || !v4Var4.D8()) {
                z11 = false;
            }
            if (this.Q.getId() != i11 || !z11) {
                this.Q.removeAllViews();
                this.Q.setId(i11);
                if (v4Var2 != null || !z10) {
                    h1Var = (h1) this.U;
                } else {
                    h1Var = (h1) this.V;
                }
                h1Var.u1(i11, this, this.Q);
            }
            if (z13) {
                int i12 = 0;
                while (i10 < this.Q.getChildCount()) {
                    View childAt = this.Q.getChildAt(i10);
                    if (childAt != null) {
                        i12 += childAt.getLayoutParams().width;
                    }
                    i10++;
                }
                i10 = i12;
            }
            if (this.Q.getParent() != null) {
                removeView(this.Q);
            }
            if (z10) {
                addView(this.Q, -1);
            } else {
                addView(this.Q, 3);
            }
        }
        if (z13) {
            p4(this.T, this.U, i10, getCurrentHeaderOffset());
        }
    }

    public void D3(int i10, boolean z10) {
        v4<?> l10 = this.M.l();
        if (!this.Y0 && l10 != null && !l10.Oa() && !l10.Na()) {
            this.Y0 = true;
            l10.k9();
            this.X0 = 1.0f;
            O3(l10, 1, i10, true, z10, null);
        }
    }

    public void E3() {
        this.f24101f0 = true;
    }

    public HeaderEditText F2(boolean z10, v4<?> v4Var) {
        return E2(this, z10, v4Var);
    }

    public final void F3() {
        v4<?> v4Var;
        v4<?> v4Var2;
        int i10;
        int i11;
        v4<?> v4Var3;
        boolean z10 = this.f24114s0;
        if (z10) {
            v4Var2 = this.U;
            v4Var = this.V;
        } else {
            v4Var = this.U;
            v4Var2 = this.V;
        }
        v4<?> v4Var4 = this.U;
        boolean z11 = false;
        boolean z12 = v4Var4 != null && v4Var4.Me() && !z10;
        v4<?> v4Var5 = this.V;
        boolean z13 = v4Var5 != null && v4Var5.Me() && z10;
        boolean z14 = v4Var2 == null && g3(v4Var) != 0;
        if (this.I0) {
            if (!z14 || z10) {
                i10 = z13 ? d.b(0, j.k0()) : T2(this.V, !z14);
            } else {
                i10 = T2(v4Var, true);
            }
            if (!z14 || !z10) {
                i11 = z12 ? d.b(0, j.k0()) : T2(this.U, !z14);
            } else {
                i11 = T2(v4Var, true);
            }
            this.J0.b(i10, i11);
        } else {
            this.f24095c0.k0(T2(this.U, true));
            i11 = 0;
            i10 = 0;
        }
        if (this.K0) {
            if (!z14 || z10) {
                z11 = !z14;
            }
            int X2 = X2(v4Var, z11);
            int X22 = (!z14 || !z10) ? X2(v4Var2, !z14) : X2(v4Var, true);
            int i12 = z10 ? X2 : X22;
            if (z10) {
                X2 = X22;
            }
            this.N0.b(i12, X2);
            View view = this.S;
            if (view instanceof d) {
                ((d) view).I0(i12, X2);
            }
            View view2 = this.T;
            if (view2 instanceof d) {
                ((d) view2).I0(i12, X2);
            }
        }
        int X23 = X2(this.U, true);
        TextView textView = this.W;
        if (textView != null && (!this.K0 || this.S != textView)) {
            textView.setTextColor(X23);
        }
        TextView textView2 = this.f24091a0;
        if (textView2 != null && (!this.K0 || this.T != textView2)) {
            textView2.setTextColor(X23);
        }
        if (this.O0) {
            int N2 = N2(v4Var, !z14);
            int N22 = z14 ? N2(v4Var, true) : N2(v4Var2, !z14);
            int i13 = z10 ? N2 : N22;
            if (z10) {
                N2 = N22;
            }
            this.P0.b(i13, N2);
        } else {
            this.R.setColor(N2(this.U, true));
        }
        setTranslation(this.X0);
        if (this.I0 && this.X0 == 0.0f && (v4Var3 = this.V) != null && v4Var3.Me()) {
            x0 filling = getFilling();
            if (z10) {
                i11 = i10;
            }
            filling.k0(i11);
        }
    }

    public TextView G2(Context context) {
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, (w.G2() ? 5 : 3) | 48);
        r12.topMargin = a0.i(15.0f) + getCurrentHeaderOffset();
        b2 b2Var = new b2(context);
        b2Var.setTag(this);
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        b2Var.setHighlightColor(j.T0());
        b2Var.setTypeface(o.i());
        b2Var.setGravity(3);
        b2Var.setSingleLine();
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setTextSize(1, 19.0f);
        b2Var.setTextColor(-1);
        b2Var.setLayoutParams(r12);
        return b2Var;
    }

    public void G3(v4<?> v4Var, v4<?> v4Var2) {
        int W9;
        q1 q1Var = this.O;
        boolean z10 = false;
        boolean z11 = q1Var != null && q1Var.S();
        if (z11) {
            if (this.f24098d1) {
                F3();
            } else {
                this.f24095c0.k0(v4Var.K9());
            }
            s0 s0Var = this.H0;
            if (s0Var != null) {
                s0Var.invalidate();
            }
            o3();
        }
        int N2 = N2(v4Var, true);
        int Z2 = Z2(v4Var, true);
        if (Z2 != 0) {
            Z3(v4Var, Z2, N2);
        }
        if (v4Var.Pa() && (W9 = v4Var.W9()) != 0) {
            Z3(v4Var, W9, v4Var.N9());
        }
        int la2 = v4Var.la();
        if (la2 != 0) {
            Z3(v4Var, la2, v4Var.ha());
        }
        int xa2 = v4Var.xa();
        if (xa2 != 0) {
            Z3(v4Var, xa2, v4Var.va());
        }
        s0 s0Var2 = this.H0;
        if (s0Var2 != null) {
            s0Var2.invalidate();
        }
        if (v4Var2 != null) {
            z10 = z11;
        }
        if (!z10 || v4Var2.O9() == v4Var.O9()) {
            this.R.setColor(N2);
        }
        if (!z10 || v4Var2.Q9() == v4Var.Q9()) {
            int X2 = X2(v4Var, true);
            TextView textView = this.W;
            if (textView != null) {
                textView.setTextColor(X2);
            }
            TextView textView2 = this.f24091a0;
            if (textView2 != null) {
                textView2.setTextColor(X2);
            }
        }
        if (!z10 || v4Var2.L9() == v4Var.L9()) {
            this.f24095c0.k0(T2(v4Var, true));
            o3();
        }
    }

    public final void I2(v4<?> v4Var) {
        View G9 = v4Var.G9();
        if (G9 == null) {
            p4(this.W, v4Var, 0, getCurrentHeaderOffset());
            this.W.setId(v4Var.R9());
            p0.c0(this.W, v4Var.X9());
            G9 = this.W;
        } else {
            u2(G9);
        }
        View view = this.S;
        if (!(view == null || view == G9)) {
            removeView(view);
        }
        this.S = G9;
        if (G9.getParent() == null) {
            addView(this.S, !f24090f1 ? 1 : 0);
        }
    }

    public w2 J2(Context context, v4<?> v4Var) {
        if (this.f24105j0 == null) {
            this.f24105j0 = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    d1.this.q3(view);
                }
            };
        }
        return L2(context, v4Var, this.f24105j0);
    }

    public final boolean J3() {
        return this.f24100e1 || Color.alpha(this.f24110o0) > 0 || getAlpha() == 0.0f || getVisibility() != 0;
    }

    public u0 K1(LinearLayout linearLayout, int i10, int i11, int i12, v4<?> v4Var, int i13) {
        u0 y22 = y2(i10, i11, i12, v4Var, i13, this);
        linearLayout.addView(y22, w.G2() ? 0 : -1);
        return y22;
    }

    public u0 L1(LinearLayout linearLayout, int i10, int i11, v4<?> v4Var, int i12, int i13, int i14) {
        u0 v22 = v2(i10, i12, i11, v4Var, i13, i14, this);
        linearLayout.addView(v22, w.G2() ? 0 : -1);
        return v22;
    }

    public w2 L2(Context context, v4<?> v4Var, View.OnClickListener onClickListener) {
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, a0.i(38.0f), (w.G2() ? 5 : 3) | 48);
        r12.topMargin = a0.i(15.0f) + getCurrentHeaderOffset();
        if (w.G2()) {
            r12.rightMargin = a0.i(68.0f);
        } else {
            r12.leftMargin = a0.i(68.0f);
        }
        w2 w2Var = new w2(context);
        if (v4Var != null) {
            w2Var.setTextColor(v4Var.P9());
            w2Var.setTriangleColor(v4Var.N9());
        }
        w2Var.setLayoutParams(r12);
        w2Var.setOnClickListener(onClickListener);
        return w2Var;
    }

    public void L3(int[] r10, java.lang.String[] r11, int[] r12, int r13, boolean r14, ud.v4<?> r15) {
        throw new UnsupportedOperationException("Method not decompiled: ud.d1.L3(int[], java.lang.String[], int[], int, boolean, ud.v4):void");
    }

    public final void M3(int[] iArr, String[] strArr, int[] iArr2, View.OnClickListener onClickListener, boolean z10, v vVar) {
        int length = iArr == null ? strArr.length : iArr.length;
        int childCount = this.f24108m0.getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (i11 < length) {
                this.f24108m0.g(i11, iArr == null ? i11 : iArr[i11], strArr[i11], iArr2 != null ? iArr2[i11] : 0, onClickListener, vVar);
                i11++;
                i10++;
            } else {
                for (int i12 = childCount - 1; i12 >= length; i12--) {
                    this.f24108m0.removeViewAt(i12);
                }
            }
        }
        if (length > this.f24108m0.getChildCount()) {
            while (i11 < length) {
                this.f24108m0.a(iArr == null ? i11 : iArr[i11], strArr[i11], iArr2 != null ? iArr2[i11] : 0, null, onClickListener);
                i11++;
            }
        }
        j2 j2Var = new j2(getContext());
        j2Var.L1(true);
        j2Var.I2();
        j2Var.setOverlayStatusBar(true);
        j2Var.N2(this.f24108m0);
    }

    public final void N3(String[] strArr) {
        if (this.f24108m0 == null) {
            i1 i1Var = new i1(getContext());
            this.f24108m0 = i1Var;
            i1Var.b(null, null);
        }
        if (this.f24106k0 == null) {
            this.f24106k0 = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    d1.this.s3(view);
                }
            };
        }
        this.f24108m0.setAnchorMode(1);
        this.f24108m0.setTranslationY(getTranslationY() + getCurrentHeaderOffset());
        M3(null, strArr, null, this.f24106k0, false, getThemeListeners());
    }

    public g0 O1(LinearLayout linearLayout, int i10, int i11) {
        g0 g0Var = new g0(getContext());
        g0Var.setId(R.id.menu_btn_clear);
        g0Var.setColorId(i10);
        g0Var.setButtonBackground(i11);
        g0Var.setOnClickListener(this);
        linearLayout.addView(g0Var, w.G2() ? 0 : -1);
        return g0Var;
    }

    public final void O3(final v4<?> v4Var, final int i10, int i11, boolean z10, boolean z11, Runnable runnable) {
        this.Z0 = i10;
        z3(v4Var, null, z10, 3, this.X0);
        if (z10) {
            if (i10 == 1) {
                v4Var.Qa(i11);
                v4Var.qc();
            } else if (i10 == 2) {
                v4Var.pc();
            }
        } else if (i10 == 2) {
            v4Var.xc();
            v4Var.Ee(false);
        } else if (i10 == 3) {
            v4Var.De(false);
        }
        b bVar = new b(z10, i10, v4Var, runnable);
        if (!z11) {
            if (z10) {
                setTranslation(0.0f);
                if (i10 == 2) {
                    v4Var.Jd(1.0f, true);
                }
            } else {
                setTranslation(1.0f);
                if (i10 == 2) {
                    v4Var.Jd(0.0f, false);
                }
            }
            bVar.onAnimationEnd(null);
        } else if (!v4Var.Qb(z10, i10, bVar)) {
            final float translation = getTranslation();
            ValueAnimator b10 = db.b.b();
            if (z10) {
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        d1.this.t3(translation, i10, v4Var, valueAnimator);
                    }
                });
            } else {
                final float f10 = 1.0f - translation;
                b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        d1.this.v3(translation, f10, i10, v4Var, valueAnimator);
                    }
                });
            }
            b10.setInterpolator(v4Var.ra());
            b10.setDuration(v4Var.pa());
            b10.addListener(bVar);
            v4Var.ue(b10, i10, z10);
        }
    }

    public g0 P1(LinearLayout linearLayout, v4<?> v4Var) {
        return O1(linearLayout, v4Var.O9(), v4Var.B9());
    }

    public void P3(v4<?> v4Var, int i10) {
        if (v4Var.Ta()) {
            this.R.setColor(i10);
        }
    }

    @Override
    public void Q2() {
        t1.b().d(this);
        w.F2(this);
        a0.v(this);
        x0 x0Var = this.f24095c0;
        if (x0Var != null) {
            x0Var.Q2();
        }
    }

    public void Q3(int i10, int i11, int i12, int i13) {
        View findViewById;
        View findViewById2;
        if (this.P.getId() == i10 && (findViewById2 = this.P.findViewById(i11)) != null) {
            findViewById2.setVisibility(i12);
            if (i13 != 0) {
                ((u0) findViewById2).setImageResource(i13);
            }
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10 && (findViewById = this.Q.findViewById(i11)) != null) {
            findViewById.setVisibility(i12);
            if (i13 != 0) {
                ((u0) findViewById).setImageResource(i13);
            }
        }
    }

    @Override
    public void Q5(int i10, int i11) {
        if (w.H1(i10, i11)) {
            int i12 = 5;
            if (p0.V(this.R, (w.G2() ? 5 : 3) | 48)) {
                p0.r0(this.R);
            }
            if (p0.V(this.P, (w.G2() ? 3 : 5) | 48)) {
                p0.r0(this.P);
                H3(this.P);
            }
            if (p0.V(this.Q, (w.G2() ? 3 : 5) | 48)) {
                p0.r0(this.Q);
                H3(this.Q);
            }
            if (p0.V(this.W, (w.G2() ? 5 : 3) | 48)) {
                I3(this.W);
            }
            TextView textView = this.f24091a0;
            if (!w.G2()) {
                i12 = 3;
            }
            if (p0.V(textView, i12 | 48)) {
                I3(this.f24091a0);
            }
            i1 i1Var = this.f24108m0;
            if (i1Var != null) {
                i1Var.f();
            }
        }
    }

    public u0 R1(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 v22 = v2(R.id.menu_btn_copy, R.drawable.baseline_content_copy_24, i10, v4Var, a0.i(50.0f), q.b(), this);
        linearLayout.addView(v22, w.G2() ? 0 : -1);
        return v22;
    }

    public u0 S1(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 v22 = v2(R.id.menu_btn_delete, R.drawable.baseline_delete_24, i10, v4Var, a0.i(52.0f), q.b(), this);
        linearLayout.addView(v22, w.G2() ? 0 : -1);
        return v22;
    }

    public void S3(int i10, int i11, kb.j<u0> jVar) {
        View findViewById;
        View findViewById2;
        if (this.P.getId() == i10 && (findViewById2 = this.P.findViewById(i11)) != null) {
            jVar.a((u0) findViewById2);
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10 && (findViewById = this.Q.findViewById(i11)) != null) {
            jVar.a((u0) findViewById);
        }
    }

    public u0 T1(LinearLayout linearLayout, v4<?> v4Var) {
        return V1(linearLayout, v4Var, v4Var.O9());
    }

    public void T3(int i10, int i11, float f10) {
        View findViewById;
        View findViewById2;
        if (this.P.getId() == i10 && (findViewById2 = this.P.findViewById(i11)) != null) {
            findViewById2.setAlpha(f10);
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10 && (findViewById = this.Q.findViewById(i11)) != null) {
            findViewById.setAlpha(f10);
        }
    }

    public u0 V1(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 y22 = y2(R.id.menu_btn_done, R.drawable.baseline_check_24, i10, v4Var, a0.i(56.0f), this);
        linearLayout.addView(y22, w.G2() ? 0 : -1);
        return y22;
    }

    public u0 W1(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 v22 = v2(R.id.menu_btn_edit, R.drawable.baseline_edit_24, i10, v4Var, a0.i(52.0f), q.b(), this);
        linearLayout.addView(v22, w.G2() ? 0 : -1);
        return v22;
    }

    public void W3(v4<?> v4Var, int i10, float f10) {
        if (this.P.getId() == i10) {
            int childCount = this.P.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.P.getChildAt(i11);
                if (childAt != null) {
                    if (childAt instanceof u0) {
                        ((u0) childAt).f(f10);
                        childAt.invalidate();
                    } else {
                        v4Var.Be(childAt, i10, f10);
                    }
                }
            }
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10) {
            int childCount2 = this.Q.getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = this.Q.getChildAt(i12);
                if (childAt2 != null) {
                    if (childAt2 instanceof u0) {
                        ((u0) childAt2).f(f10);
                        childAt2.invalidate();
                    } else {
                        v4Var.Be(childAt2, i10, f10);
                    }
                }
            }
        }
    }

    public u0 X1(LinearLayout linearLayout, v4<?> v4Var) {
        return Y1(linearLayout, v4Var, v4Var.O9());
    }

    public u0 Y1(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 v22 = v2(R.id.menu_btn_forward, R.drawable.baseline_forward_24, i10, v4Var, a0.i(52.0f), q.b(), this);
        linearLayout.addView(v22, w.G2() ? 0 : -1);
        return v22;
    }

    public g1 Z1(LinearLayout linearLayout) {
        g1 g1Var = new g1(getContext());
        linearLayout.addView(g1Var);
        return g1Var;
    }

    public void Z3(v4<?> v4Var, int i10, int i11) {
        LinearLayout linearLayout = this.P;
        if (linearLayout != null && linearLayout.getId() == i10) {
            X3(this.P, i11);
        }
        LinearLayout linearLayout2 = this.Q;
        if (linearLayout2 != null && linearLayout2.getId() == i10) {
            X3(this.Q, i11);
        }
    }

    public u0 a2(LinearLayout linearLayout, v4<?> v4Var) {
        return c2(linearLayout, v4Var, v4Var.O9());
    }

    public void a4(int i10, v4<?> v4Var, float f10) {
        if (this.P.getId() == i10) {
            v4Var.H8(this.P, f10);
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10) {
            v4Var.H8(this.Q, f10);
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public u0 c2(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 y22 = y2(R.id.menu_btn_more, R.drawable.baseline_more_vert_24, i10, v4Var, a0.i(49.0f), this);
        linearLayout.addView(y22, w.G2() ? 0 : -1);
        return y22;
    }

    public u0 d2(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 g10 = v2(R.id.menu_btn_reply, R.drawable.baseline_reply_24, i10, v4Var, a0.i(52.0f), q.b(), this).g(i10);
        linearLayout.addView(g10, w.G2() ? 0 : -1);
        return g10;
    }

    public void d4(int i10, int i11, kb.j<View> jVar) {
        View findViewById;
        View findViewById2;
        if (this.P.getId() == i10 && (findViewById2 = this.P.findViewById(i11)) != null) {
            jVar.a(findViewById2);
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10 && (findViewById = this.Q.findViewById(i11)) != null) {
            jVar.a(findViewById);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (Color.alpha(this.f24110o0) > 0) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f24095c0.r(), y.g(this.f24110o0));
        }
    }

    @Override
    public void e2() {
        TextView textView = this.W;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f24091a0;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }

    public final int e3(View view) {
        if ((view instanceof TextView) && view.getTag() == this) {
            return 1;
        }
        if (view instanceof v2) {
            return 3;
        }
        return view instanceof w2 ? 2 : 0;
    }

    public void e4(v4<?> v4Var, int i10) {
        if (this.P.getId() == i10) {
            v4Var.Ce(i10, this.P);
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10) {
            v4Var.Ce(i10, this.Q);
        }
    }

    public u0 f2(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 v22 = v2(R.id.menu_btn_retry, R.drawable.baseline_repeat_24, i10, v4Var, a0.i(52.0f), q.b(), this);
        linearLayout.addView(v22, w.G2() ? 0 : -1);
        return v22;
    }

    public u0 g2(LinearLayout linearLayout, v4<?> v4Var) {
        return h2(linearLayout, v4Var, v4Var.O9());
    }

    public ud.b getBackButton() {
        return this.R;
    }

    public float getBackFactor() {
        return this.f24092a1;
    }

    public float getCurrentHeight() {
        return this.f24093b0;
    }

    public int getCurrentTransformMode() {
        v4<?> l10 = this.M.l();
        if (l10 == null) {
            return 0;
        }
        if (l10.Na()) {
            return 2;
        }
        return l10.Oa() ? 1 : 0;
    }

    public x0 getFilling() {
        return this.f24095c0;
    }

    public float getTranslation() {
        return this.X0;
    }

    public u0 h2(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 y22 = y2(R.id.menu_btn_search, R.drawable.baseline_search_24, i10, v4Var, a0.i(49.0f), this);
        linearLayout.addView(y22, w.G2() ? 0 : -1);
        return y22;
    }

    public h2 i2(LinearLayout linearLayout, v4<?> v4Var) {
        h2 h2Var = new h2(getContext());
        h2Var.setOnClickListener(this);
        if (v4Var != null) {
            h2Var.g(v4Var.O9());
            v4Var.t8(h2Var);
        }
        linearLayout.addView(h2Var);
        return h2Var;
    }

    @Override
    public boolean isLayoutRequested() {
        return this.f24102g0;
    }

    public u0 j2(LinearLayout linearLayout, v4<?> v4Var, int i10) {
        u0 v22 = v2(R.id.menu_btn_view, R.drawable.baseline_visibility_24, i10, v4Var, a0.i(52.0f), q.a(), this);
        linearLayout.addView(v22, w.G2() ? 0 : -1);
        return v22;
    }

    public boolean j3() {
        v4<?> l10 = this.M.l();
        return l10 != null && l10.Na();
    }

    public void j4(int i10) {
        View findViewById;
        View findViewById2;
        if (this.P.getId() == i10 && (findViewById2 = this.P.findViewById(R.id.menu_btn_lock)) != null) {
            ((g1) findViewById2).j();
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10 && (findViewById = this.Q.findViewById(R.id.menu_btn_lock)) != null) {
            ((g1) findViewById).j();
        }
    }

    @Override
    public void k1(int i10) {
        setHeaderOffset(getTopOffset());
    }

    public void k2(v4<?> v4Var) {
        this.f24098d1 = false;
        if (this.f24113r0) {
            this.S.setVisibility(0);
        }
        View view = this.T;
        View view2 = this.S;
        if (view != view2) {
            this.S = view;
            this.T = view2;
            removeView(view2);
            TextView textView = this.W;
            this.W = this.f24091a0;
            this.f24091a0 = textView;
        }
        if (v4Var != null) {
            int M2 = M2(v4Var, true);
            int P2 = P2(v4Var, true);
            if (M2 == 1) {
                this.R.setVisibility(8);
            } else {
                this.R.setButtonFactor(M2);
                this.R.invalidate();
            }
            this.R.setButtonBackground(P2);
            this.f24095c0.q(v4Var.Fe());
        }
        if (this.f24111p0) {
            LinearLayout linearLayout = this.P;
            this.P = this.Q;
            this.Q = linearLayout;
            removeView(linearLayout);
            this.f24111p0 = false;
        }
        int Z2 = Z2(v4Var, true);
        if (v4Var == null || Z2 == 0) {
            this.P.setVisibility(8);
        }
        this.U = null;
        this.V = null;
    }

    public void k4(int i10, int i11, boolean z10, boolean z11) {
        View findViewById;
        View findViewById2;
        if (this.P.getId() == i10 && (findViewById2 = this.P.findViewById(i11)) != null) {
            ((g0) findViewById2).m(z10, z11);
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10 && (findViewById = this.Q.findViewById(i11)) != null) {
            ((g0) findViewById).m(z10, z11);
        }
    }

    public void l2() {
        this.f24101f0 = false;
        this.f24102g0 = false;
    }

    public boolean l3() {
        v4<?> l10 = this.M.l();
        return l10 != null && l10.Oa();
    }

    public void l4(int i10, int i11, boolean z10) {
        View findViewById;
        View findViewById2;
        if (this.P.getId() == i10 && (findViewById2 = this.P.findViewById(i11)) != null) {
            ((g0) findViewById2).setInProgress(z10);
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10 && (findViewById = this.Q.findViewById(i11)) != null) {
            ((g0) findViewById).setInProgress(z10);
        }
    }

    public void m2() {
        this.f24098d1 = false;
        this.U = null;
        this.V = null;
        if (this.f24113r0) {
            this.S.setVisibility(0);
        }
        this.S.setAlpha(1.0f);
        this.S.setTranslationX(0.0f);
        removeView(this.T);
        removeView(this.Q);
        v4<?> l10 = this.M.l();
        if (l10 != null) {
            if (l10.A9() == 1) {
                this.R.setVisibility(8);
            } else {
                this.R.setButtonFactor(l10.A9());
                this.R.invalidate();
            }
            if (Z2(l10, true) == 0) {
                this.P.setVisibility(8);
            }
            this.f24095c0.k0(T2(l10, true));
        }
        float f10 = this.D0;
        this.f24093b0 = f10;
        this.f24095c0.L((int) f10, getHeightFactor());
        if (this.A0) {
            View view = this.S;
            if (view instanceof i2) {
                ((i2) view).k0(getHeightFactor(), getHeightFactor(), getHeightFactor(), false);
            }
        }
        invalidate();
    }

    public void m3(q1 q1Var) {
        this.O = q1Var;
        this.f24097d0 = true;
        this.M = q1Var.M();
        x0 x0Var = new x0(this, q1Var);
        this.f24095c0 = x0Var;
        x0Var.n0();
        this.f24095c0.L((int) this.f24093b0, getHeightFactor());
        setHeaderOffset(getTopOffset());
        g.d(this, this.f24095c0);
        a0.a(this);
        t1.b().a(this);
    }

    public void m4(int i10, int i11, String str, boolean z10, boolean z11) {
        View findViewById;
        View findViewById2;
        if (this.P.getId() == i10 && (findViewById2 = this.P.findViewById(i11)) != null) {
            if (z11) {
                ((h2) findViewById2).l(str, z10);
            } else {
                h2 h2Var = (h2) findViewById2;
                h2Var.setIsVisible(z10);
                h2Var.setValue(str);
            }
        }
        LinearLayout linearLayout = this.Q;
        if (linearLayout != null && linearLayout.getId() == i10 && (findViewById = this.Q.findViewById(i11)) != null) {
            if (z11) {
                ((h2) findViewById).l(str, z10);
                return;
            }
            h2 h2Var2 = (h2) findViewById;
            h2Var2.setIsVisible(z10);
            h2Var2.setValue(str);
        }
    }

    public void n2(boolean z10, Runnable runnable) {
        v4<?> l10 = this.M.l();
        if (!this.Y0 && l10 != null && l10.Na()) {
            this.Y0 = true;
            this.X0 = 0.0f;
            O3(l10, 2, 0, false, z10, runnable);
        }
    }

    public void n3(v4<?> v4Var, boolean z10) {
        this.O = null;
        this.M = new u1(v4Var);
        this.N = true;
        this.f24097d0 = z10;
        x0 x0Var = new x0(this, null);
        this.f24095c0 = x0Var;
        if (z10) {
            x0Var.n0();
            setHeaderOffset(getTopOffset());
            setClipToPadding(false);
        } else {
            setLayoutParams(FrameLayoutFix.r1(-1, a3(false) + this.f24095c0.t(), 48));
        }
        this.f24095c0.L((int) this.f24093b0, getHeightFactor());
        g.d(this, this.f24095c0);
        setTitle(v4Var);
        t1.b().a(this);
        w.h(this);
        v4Var.k8(this);
        if (z10) {
            a0.a(this);
        }
    }

    public final void o3() {
        invalidate(0, 0, getMeasuredWidth(), this.f24095c0.r() + this.f24095c0.t());
    }

    @Override
    public void onClick(View view) {
        v4<?> l10;
        q1 q1Var = this.O;
        if ((q1Var != null && (q1Var.W() || this.O.S())) || (l10 = this.M.l()) == null) {
            return;
        }
        if ((!l10.Oa() && l10.W9() != 0) || (l10.Oa() && l10.xa() != 0)) {
            ((h1) l10).J(view.getId(), view);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return J3();
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.f24095c0.M(getMeasuredWidth(), (int) this.f24093b0, getHeightFactor());
            invalidate();
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getTag() != null && (view.getTag() instanceof String)) {
            String str = (String) view.getTag();
            if (!i.i(str)) {
                Toast makeText = Toast.makeText(getContext(), str, 0);
                makeText.setGravity(53, view.getRight(), a3(true) - a0.i(8.0f));
                makeText.show();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (J3()) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.f24095c0.R(motionEvent);
    }

    public void p2() {
        r2(false, true);
    }

    public boolean p3() {
        return this.Y0;
    }

    public void q4(int i10, CharSequence charSequence) {
        TextView textView = this.W;
        if (textView != null && textView.getId() == i10) {
            p0.c0(this.W, charSequence);
        }
        TextView textView2 = this.f24091a0;
        if (textView2 != null && textView2.getId() == i10) {
            p0.c0(this.f24091a0, charSequence);
        }
    }

    public void r2(boolean z10, boolean z11) {
        v4<?> l10 = this.M.l();
        if (!this.Y0 && l10 != null && l10.Oa()) {
            this.Y0 = true;
            this.X0 = 0.0f;
            if (z10 && (l10 instanceof d2)) {
                ((d2) l10).p5(-1);
            }
            O3(l10, 1, 0, false, z11, null);
        }
    }

    @Override
    public void requestLayout() {
        if (!this.f24101f0) {
            int i10 = this.f24103h0;
            if (i10 == -1) {
                super.requestLayout();
                return;
            }
            int i11 = this.f24104i0;
            if (i11 < i10) {
                this.f24104i0 = i11 + 1;
                super.requestLayout();
                return;
            }
            return;
        }
        this.f24102g0 = true;
    }

    public void setBackFactor(float f10) {
        if (this.f24092a1 != f10) {
            this.f24092a1 = f10;
            this.R.setColor(this.P0.a(f10));
        }
    }

    public void setBackgroundHeight(int i10) {
        float f10 = i10;
        if (this.f24093b0 != f10) {
            this.f24093b0 = f10;
            this.f24095c0.L(i10, getHeightFactor());
            invalidate();
        }
    }

    public void setHeaderDisabled(boolean z10) {
        if (this.f24100e1 != z10) {
            this.f24100e1 = z10;
            setVisibility(z10 ? 4 : 0);
        }
    }

    public void setOverlayColor(int i10) {
        if (this.f24110o0 != i10) {
            this.f24110o0 = i10;
            setWillNotDraw(Color.alpha(i10) <= 0);
            invalidate();
        }
    }

    public void setTitle(v4<?> v4Var) {
        int J9;
        if (this.N) {
            this.M.A(v4Var);
        }
        I2(v4Var);
        if (v4Var.W9() != this.P.getId()) {
            this.P.removeAllViews();
            this.P.setId(v4Var.W9());
            if (v4Var.W9() != 0) {
                ((h1) v4Var).u1(v4Var.W9(), this, this.P);
                this.P.setVisibility(0);
                int i10 = 0;
                for (int i11 = 0; i11 < this.P.getChildCount(); i11++) {
                    i10 += this.P.getChildAt(i11).getLayoutParams().width;
                }
                View view = this.S;
                if (view == this.W) {
                    p4(view, v4Var, i10, getCurrentHeaderOffset());
                }
            } else {
                this.P.setVisibility(8);
                View view2 = this.S;
                if (view2 == this.W) {
                    p4(view2, v4Var, 0, getCurrentHeaderOffset());
                }
            }
        }
        View G9 = v4Var.G9();
        if (G9 != null && (G9 instanceof i2)) {
            float Y2 = Y2(v4Var.M9());
            if (Y2 > 0.0f) {
                ((i2) G9).k0(Y2, Y2, Y2, false);
            }
        }
        if (v4Var.A9() != 1) {
            this.R.setButtonFactor(v4Var.A9());
            this.R.setVisibility(0);
            if (v4Var.B9() != 0) {
                this.R.setBackgroundResource(v4Var.B9());
            }
            this.R.setColor(j.L(v4Var.O9()));
        } else {
            this.R.setVisibility(8);
        }
        this.R.setColor(v4Var.N9());
        if (v4Var.G9() != null) {
            View G92 = v4Var.G9();
            if (G92 instanceof w2) {
                w2 w2Var = (w2) G92;
                w2Var.setTextColor(v4Var.P9());
                w2Var.setTriangleColor(v4Var.N9());
            } else if (G92 instanceof r) {
                ((r) G92).setTextColorId(v4Var.Q9());
            }
        } else {
            this.W.setTextColor(v4Var.P9());
        }
        setBackgroundHeight(v4Var.M9());
        if (!(this.O == null || (J9 = v4Var.J9()) == 0)) {
            s0 H = this.O.H();
            H.k(0, J9);
            H.g(getHeightFactor(), 0.0f, 1.0f, false, false);
        }
        this.f24095c0.k0(v4Var.K9());
        float f10 = 1.0f;
        this.f24095c0.t0(v4Var.Ie() ? 1.0f : 0.0f);
        x0 x0Var = this.f24095c0;
        if (!v4Var.He()) {
            f10 = 0.0f;
        }
        x0Var.p0(f10);
        if (v4Var.Me()) {
            this.S.setTranslationY(-n.e());
            this.f24095c0.j(0.0f);
        }
        v4Var.l9();
    }

    public void setTranslation(float f10) {
        this.X0 = f10;
        if (this.f24114s0) {
            f10 = 1.0f - f10;
        }
        boolean z10 = false;
        if (this.A0) {
            float f11 = this.D0 + (this.E0 * f10);
            this.f24093b0 = f11;
            float e10 = (f11 - n.e()) / n.h();
            this.f24095c0.L((int) this.f24093b0, e10);
            View view = this.T;
            if (view instanceof i2) {
                ((i2) view).k0(e10, this.C0, this.B0, false);
            }
            View view2 = this.S;
            if (view2 instanceof i2) {
                ((i2) view2).k0(e10, this.B0, this.C0, false);
            }
            int i10 = this.F0;
            if (i10 != 0) {
                s0 s0Var = this.H0;
                float f12 = this.G0 ? 1.0f - f10 : f10;
                if (i10 != 1) {
                    z10 = true;
                }
                s0Var.j(e10, f12, z10);
                if (this.f24112q0 == 2) {
                    float Y2 = Y2(this.f24114s0 ? this.D0 : this.D0 + this.E0);
                    s0 s0Var2 = this.H0;
                    s0Var2.setTranslationY(s0Var2.getTranslationY() - ((n.e() * Y2) * (1.0f - e10)));
                }
            }
        } else if (this.F0 == 1) {
            this.H0.j(Y2(this.D0), this.G0 ? 1.0f - f10 : f10, false);
        }
        int i11 = this.f24112q0;
        if (i11 == 1) {
            if (w.G2()) {
                if (this.f24114s0) {
                    this.S.setTranslationX(this.f24094b1 * f10);
                    this.T.setTranslationX((-this.f24094b1) * (1.0f - f10));
                } else {
                    this.S.setTranslationX((-this.f24094b1) * f10);
                    this.T.setTranslationX(this.f24094b1 * (1.0f - f10));
                }
            } else if (this.f24114s0) {
                this.S.setTranslationX((-this.f24094b1) * f10);
                this.T.setTranslationX(this.f24094b1 * (1.0f - f10));
            } else {
                this.S.setTranslationX(this.f24094b1 * f10);
                this.T.setTranslationX((-this.f24094b1) * (1.0f - f10));
            }
            this.S.setAlpha(1.0f - f10);
            this.T.setAlpha(f10);
        } else if (i11 == 2) {
            if (this.f24114s0) {
                this.S.setTranslationY((-(n.e() + getTopOffset())) * f10);
                this.T.setTranslationY(this.f24096c1 * (1.0f - f10));
                v4<?> v4Var = this.U;
                if (v4Var != null) {
                    v4Var.G8(f10);
                }
            } else {
                this.S.setTranslationY(this.f24096c1 * f10);
                float f13 = 1.0f - f10;
                this.T.setTranslationY(-((n.e() + getTopOffset()) * f13));
                v4<?> v4Var2 = this.V;
                if (v4Var2 != null) {
                    v4Var2.G8(f13);
                }
            }
            this.S.setAlpha(1.0f - f10);
            this.T.setAlpha(f10);
        } else if (i11 == 3) {
            this.S.setAlpha(1.0f - f10);
            this.T.setAlpha(f10);
        }
        if (this.f24119x0) {
            if (this.f24120y0) {
                this.P.setAlpha(1.0f - f10);
                if (this.f24112q0 == 2) {
                    this.P.setTranslationY((this.f24114s0 ? -(n.e() + getTopOffset()) : this.f24096c1) * f10);
                }
            }
            if (this.f24121z0) {
                this.Q.setAlpha(f10);
                if (this.f24112q0 == 2) {
                    this.Q.setTranslationY(this.f24114s0 ? this.f24096c1 * (1.0f - f10) : -((n.e() + getTopOffset()) * (1.0f - f10)));
                }
            }
        }
        if (!this.f24115t0) {
            float f14 = this.f24116u0;
            float f15 = this.f24117v0;
            if (f14 != f15) {
                this.R.setFactor(f14 + ((f15 - f14) * f10));
            }
        } else if (this.f24118w0) {
            this.R.setAlpha(f10);
            if (this.f24112q0 == 2) {
                this.R.setTranslationY((-(n.e() + getTopOffset())) * (1.0f - f10));
            }
            this.R.setTranslationX(this.T.getTranslationX());
        } else {
            this.R.setAlpha(1.0f - f10);
            if (this.f24112q0 == 2) {
                this.R.setTranslationY((n.e() + getTopOffset()) * f10);
            }
            this.R.setTranslationX(this.S.getTranslationX());
        }
        if (this.F0 == 2) {
            this.H0.setFactor(f10);
        }
        if (this.I0) {
            this.f24095c0.k0(this.J0.a(f10));
            if (this.Z0 == 2) {
                if (this.f24114s0) {
                    this.f24095c0.q0(f10, this.J0.a(1.0f));
                } else {
                    this.f24095c0.q0(1.0f - f10, this.J0.a(0.0f));
                }
            }
        }
        if (this.K0) {
            int a10 = this.N0.a(f10);
            int i12 = this.L0;
            if (i12 == 1) {
                ((TextView) this.S).setTextColor(a10);
            } else if (i12 == 2) {
                ((w2) this.S).setTextColor(a10);
            } else if (i12 == 3) {
                ((v2) this.S).setTextColor(a10);
            }
            int i13 = this.M0;
            if (i13 == 1) {
                ((TextView) this.T).setTextColor(a10);
            } else if (i13 == 2) {
                ((w2) this.T).setTextColor(a10);
            } else if (i13 == 3) {
                ((v2) this.T).setTextColor(a10);
            }
        }
        if (this.O0) {
            int a11 = this.P0.a(f10);
            this.R.setColor(a11);
            if (this.K0) {
                if (this.L0 == 2) {
                    ((w2) this.S).setTriangleColor(a11);
                }
                if (this.M0 == 2) {
                    ((w2) this.T).setTriangleColor(a11);
                }
            }
        }
        if (this.T0) {
            this.f24095c0.t0(this.U0 ? f10 : 1.0f - f10);
        }
        if (this.V0) {
            this.f24095c0.p0(this.W0 ? f10 : 1.0f - f10);
        }
        if (this.R0) {
            this.Q0.setStatusBarColor(this.S0.a(f10));
        }
        if (this.A0 || this.I0 || this.T0 || this.O0) {
            invalidate();
        }
        if (this.K0) {
            if (this.L0 == 2) {
                this.S.invalidate();
            }
            if (this.M0 == 2) {
                this.T.invalidate();
            }
        }
    }

    public final void u2(View view) {
        int currentHeaderOffset = getCurrentHeaderOffset();
        if (view instanceof c) {
            ((c) view).m(this, currentHeaderOffset);
        } else if (view instanceof w2) {
            p0.m0(view, a0.i(15.0f) + currentHeaderOffset);
        } else {
            p0.m0(view, currentHeaderOffset);
        }
    }

    public void u4(int i10, int i11) {
        TextView textView = this.W;
        if (textView != null && textView.getId() == i10) {
            this.W.setTextColor(i11);
        }
        TextView textView2 = this.f24091a0;
        if (textView2 != null && textView2.getId() == i10) {
            this.f24091a0.setTextColor(i11);
        }
    }

    public u0 v2(int i10, int i11, int i12, v4<?> v4Var, int i13, int i14, View.OnClickListener onClickListener) {
        u0 u0Var = new u0(getContext());
        u0Var.setButtonBackground(i14);
        u0Var.setId(i10);
        if (i11 != 0) {
            u0Var.setImageResource(i11);
        }
        if (i12 != 0) {
            u0Var.g(i12);
        }
        if (v4Var != null) {
            v4Var.t8(u0Var);
        }
        if (onClickListener != null) {
            u0Var.setOnClickListener(onClickListener);
        }
        u0Var.setOnLongClickListener(this);
        u0Var.setLayoutParams(new ViewGroup.LayoutParams(i13, -1));
        return u0Var;
    }

    public void w3() {
        this.f24101f0 = false;
        if (this.f24102g0) {
            this.f24102g0 = false;
            requestLayout();
        }
    }

    public boolean x3() {
        return this.f24097d0;
    }

    public u0 y2(int i10, int i11, int i12, v4<?> v4Var, int i13, View.OnClickListener onClickListener) {
        return v2(i10, i11, i12, v4Var, i13, q.b(), onClickListener);
    }

    public final void y3(MotionEvent motionEvent) {
        v4<?> v4Var;
        u1 u1Var;
        q1 q1Var = this.O;
        if (q1Var != null) {
            v4Var = q1Var.F();
        } else {
            v4Var = (!this.N || (u1Var = this.M) == null || u1Var.q()) ? null : this.M.l();
        }
        if (v4Var != null && M2(v4Var, true) == 3) {
            if (v4Var.S9() || v4Var.ec()) {
                v4Var.La();
            }
        }
    }

    public final LinearLayout z2(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, n.e(), (w.G2() ? 3 : 5) | 48);
        r12.topMargin = getCurrentHeaderOffset();
        linearLayout.setLayoutParams(r12);
        return linearLayout;
    }

    public void z3(ud.v4<?> r23, ud.v4<?> r24, boolean r25, int r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: ud.d1.z3(ud.v4, ud.v4, boolean, int, float):void");
    }
}
