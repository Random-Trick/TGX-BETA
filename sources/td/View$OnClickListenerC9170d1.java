package td;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
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
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import ge.C4896n;
import java.util.ArrayList;
import me.C6847b2;
import me.C6882g0;
import me.C6924j2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.HeaderEditText;
import p037cb.C2057b;
import p037cb.C2065g;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5153x0;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5918j;
import p181mb.C6812c;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;
import p364zd.C11532q;
import p364zd.C11537v;

public class View$OnClickListenerC9170d1 extends FrameLayoutFix implements View.OnClickListener, View.OnLongClickListener, AbstractC5911c, C4403w.AbstractC4404a, C1357a0.AbstractC1358a, C11052v1.AbstractC11053a {
    public static boolean f29553f1 = true;
    public boolean f29554A0;
    public float f29555B0;
    public float f29556C0;
    public float f29557D0;
    public float f29558E0;
    public int f29559F0;
    public boolean f29560G0;
    public C9290s0 f29561H0;
    public boolean f29562I0;
    public C6812c f29563J0;
    public boolean f29564K0;
    public int f29565L0;
    public C9312u1 f29566M;
    public int f29567M0;
    public boolean f29568N;
    public C6812c f29569N0;
    public C9270q1 f29570O;
    public boolean f29571O0;
    public LinearLayout f29572P;
    public C6812c f29573P0;
    public LinearLayout f29574Q;
    public Window f29575Q0;
    public View$OnClickListenerC9150b f29576R;
    public boolean f29577R0;
    public View f29578S;
    public C6812c f29579S0;
    public View f29580T;
    public boolean f29581T0;
    public AbstractC9323v4<?> f29582U;
    public boolean f29583U0;
    public AbstractC9323v4<?> f29584V;
    public boolean f29585V0;
    public TextView f29586W;
    public boolean f29587W0;
    public float f29588X0;
    public boolean f29589Y0;
    public int f29590Z0;
    public TextView f29591a0;
    public float f29592a1;
    public float f29593b0;
    public float f29594b1;
    public RunnableC9355x0 f29595c0;
    public float f29596c1;
    public boolean f29597d0;
    public boolean f29600e1;
    public boolean f29601f0;
    public boolean f29602g0;
    public int f29604i0;
    public View.OnClickListener f29605j0;
    public View.OnClickListener f29606k0;
    public C11537v f29607l0;
    public C9207i1 f29608m0;
    public View.OnClickListener f29609n0;
    public int f29610o0;
    public boolean f29611p0;
    public int f29612q0;
    public boolean f29613r0;
    public boolean f29614s0;
    public boolean f29615t0;
    public float f29616u0;
    public float f29617v0;
    public boolean f29618w0;
    public boolean f29619x0;
    public boolean f29620y0;
    public boolean f29621z0;
    public int f29599e0 = -1;
    public int f29603h0 = -1;
    public boolean f29598d1 = false;

    public class C9171a extends ViewOutlineProvider {
        public C9171a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            Rect bounds = View$OnClickListenerC9170d1.this.f29595c0.getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            outline.setRect(i, i2, bounds.right, View$OnClickListenerC9170d1.this.f29595c0.m9006t() + i2 + View$OnClickListenerC9170d1.this.getCurrentHeaderOffset());
            outline.setAlpha(0.0f);
        }
    }

    public class C9172b extends AnimatorListenerAdapter {
        public final boolean f29623a;
        public final int f29624b;
        public final AbstractC9323v4 f29625c;
        public final Runnable f29626d;

        public C9172b(boolean z, int i, AbstractC9323v4 v4Var, Runnable runnable) {
            this.f29623a = z;
            this.f29624b = i;
            this.f29625c = v4Var;
            this.f29626d = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!this.f29623a) {
                int i = this.f29624b;
                if (i == 1) {
                    this.f29625c.m9338Tb();
                    this.f29625c.mo8830yc();
                } else if (i == 2) {
                    this.f29625c.m9346Sb();
                } else if (i == 3) {
                    this.f29625c.m9352Rb();
                }
            } else {
                int i2 = this.f29624b;
                if (i2 == 2) {
                    this.f29625c.mo9445Ee(true);
                } else if (i2 == 3) {
                    this.f29625c.m9452De(true);
                }
            }
            View$OnClickListenerC9170d1.this.m10043n2(this.f29625c);
            View$OnClickListenerC9170d1.this.f29595c0.m9045V();
            View$OnClickListenerC9170d1.this.f29590Z0 = 0;
            View$OnClickListenerC9170d1.this.f29589Y0 = false;
            Runnable runnable = this.f29626d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public interface AbstractC9173c {
        void mo9775k0(View$OnClickListenerC9170d1 d1Var, int i);
    }

    public View$OnClickListenerC9170d1(Context context) {
        super(context);
        View$OnClickListenerC9150b bVar = new View$OnClickListenerC9150b(context);
        this.f29576R = bVar;
        bVar.setParentHeader(this);
        View$OnClickListenerC9150b bVar2 = this.f29576R;
        bVar2.setOnClickListener(bVar2);
        this.f29576R.setVisibility(8);
        this.f29576R.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), C4896n.m24478e(), (C4403w.m27984G2() ? 5 : 3) | 48));
        addView(this.f29576R);
        LinearLayout C2 = m10129C2(context);
        this.f29572P = C2;
        addView(C2);
        this.f29586W = m10109L2(context);
        this.f29593b0 = C4896n.m24478e();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C9171a());
        }
    }

    public static C9279r m10125E2(Context context, int i) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, C1357a0.m37541i(53.0f), (C4403w.m27984G2() ? 5 : 3) | 48);
        if (C4403w.m27984G2()) {
            t1.rightMargin = C1357a0.m37541i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37541i(68.0f);
        }
        C9279r rVar = new C9279r(context);
        rVar.m9651y(i);
        rVar.setLayoutParams(t1);
        return rVar;
    }

    public static HeaderEditText m10122F2(ViewGroup viewGroup, AbstractC9323v4<?> v4Var) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(53.0f), (C4403w.m27984G2() ? 5 : 3) | 48);
        if (C4403w.m27984G2()) {
            t1.rightMargin = C1357a0.m37541i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37541i(68.0f);
        }
        HeaderEditText A = HeaderEditText.m14154A(viewGroup);
        A.setTextColor(C11524j.m217S0());
        v4Var.m9178r8(A, R.id.theme_color_textSelectionHighlight);
        A.mo8255s();
        v4Var.m9119z8(A, R.id.theme_color_text);
        A.setHintTextColor(C11524j.m213U0());
        v4Var.m9170s8(A, R.id.theme_color_textLight);
        A.setLayoutParams(t1);
        return A;
    }

    public static void m10121F3(ViewGroup viewGroup) {
        int childCount;
        if (viewGroup != null && (childCount = viewGroup.getChildCount()) > 1) {
            ArrayList<View> arrayList = new ArrayList(childCount);
            for (int i = childCount - 1; i >= 0; i--) {
                arrayList.add(viewGroup.getChildAt(i));
                viewGroup.removeViewAt(i);
            }
            for (View view : arrayList) {
                if (view != null) {
                    viewGroup.addView(view);
                }
            }
        }
    }

    public static void m10118G3(View view) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        if (view != null && (i = (layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams()).leftMargin) != (i2 = layoutParams.rightMargin)) {
            layoutParams.rightMargin = i;
            layoutParams.leftMargin = i2;
            C1399s0.m37145y0(view);
        }
    }

    public static HeaderEditText m10112J2(ViewGroup viewGroup, boolean z, AbstractC9323v4<?> v4Var) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(53.0f), (C4403w.m27984G2() ? 5 : 3) | 48);
        if (C4403w.m27984G2()) {
            t1.rightMargin = C1357a0.m37541i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37541i(68.0f);
        }
        HeaderEditText B = HeaderEditText.m14153B(viewGroup, z);
        B.setTextColor(C11524j.m228N(R.id.theme_color_headerText));
        if (v4Var != null) {
            v4Var.m9178r8(B, R.id.theme_color_textSelectionHighlight);
        }
        B.mo8255s();
        if (v4Var != null) {
            v4Var.m9119z8(B, R.id.theme_color_headerText);
        }
        B.setHintTextColor(C5064d.m24131a(C11524j.f36589a, C11524j.m161p0()));
        if (v4Var != null) {
            v4Var.m9170s8(B, R.id.theme_color_headerText).m85e(C11524j.f36589a);
        }
        B.setLayoutParams(t1);
        return B;
    }

    public static int m10098P2(AbstractC9323v4<?> v4Var, boolean z) {
        if (v4Var == null) {
            return 1;
        }
        if (z) {
            if (v4Var.m9374Oa()) {
                return 4;
            }
            if (v4Var.m9382Na()) {
                return v4Var.m9272da();
            }
            if (v4Var.m9390Ma()) {
                return 3;
            }
        }
        return v4Var.mo408A9();
    }

    public static int m10095Q2(AbstractC9323v4<?> v4Var, boolean z) {
        if (v4Var == null) {
            return C11524j.m169l0();
        }
        if (z) {
            if (v4Var.m9382Na()) {
                return v4Var.m9244ha();
            }
            if (v4Var.m9374Oa()) {
                return v4Var.m9146va();
            }
        }
        return v4Var.mo9383N9();
    }

    public static int m10093R2(AbstractC9323v4<?> v4Var, boolean z) {
        if (v4Var == null) {
            return C11532q.m113b();
        }
        if (z) {
            if (v4Var.m9374Oa()) {
                return v4Var.m9168sa();
            }
            if (v4Var.m9382Na()) {
                return v4Var.m9265ea();
            }
        }
        return v4Var.mo9472B9();
    }

    public static int m10089T2(boolean z) {
        return z ? C4896n.m24476g() + getTopOffset() : C4896n.m24476g();
    }

    public static int m10086U2(AbstractC9323v4<?> v4Var) {
        if (v4Var == null) {
            return 0;
        }
        return v4Var.mo9413J9();
    }

    public static void m10085U3(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                m10085U3((ViewGroup) childAt, i);
            } else if (childAt instanceof C9310u0) {
                childAt.invalidate();
            }
        }
    }

    public static int m10083V2(AbstractC9323v4<?> v4Var, boolean z) {
        if (v4Var == null) {
            return C11524j.m167m0();
        }
        if (z) {
            if (v4Var.m9374Oa()) {
                return v4Var.m9161ta();
            }
            if (v4Var.m9382Na()) {
                return v4Var.m9258fa();
            }
        }
        return v4Var.m9406K9();
    }

    public static int m10078X2(AbstractC9323v4<?> v4Var) {
        return v4Var == null ? C4896n.m24478e() : v4Var.mo8865M9();
    }

    public static int m10075Y2(AbstractC9323v4<?> v4Var, boolean z) {
        if (v4Var == null) {
            return C11524j.m161p0();
        }
        if (z) {
            if (v4Var.m9374Oa()) {
                return C11524j.m228N(v4Var.m9124ya());
            }
            if (v4Var.m9382Na()) {
                return v4Var.m9203na();
            }
        }
        return v4Var.m9367P9();
    }

    public static float m10072Z2(float f) {
        return (f - C4896n.m24478e()) / C4896n.m24475h();
    }

    public static void m10070a4(View view, int i, int i2) {
        if (view instanceof AbstractC9165c2) {
            ((AbstractC9165c2) view).mo8255s();
        }
        if (view instanceof HeaderEditText) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i3 = (C4403w.m27984G2() ? 5 : 3) | 48;
            boolean z = true;
            boolean z2 = layoutParams.gravity != i3;
            layoutParams.gravity = i3;
            if (C4403w.m27984G2()) {
                if (!z2 && layoutParams.leftMargin == i2 && layoutParams.rightMargin == i) {
                    z = false;
                }
                layoutParams.rightMargin = i;
                layoutParams.leftMargin = i2;
            } else {
                if (!z2 && layoutParams.leftMargin == i && layoutParams.rightMargin == i2) {
                    z = false;
                }
                layoutParams.leftMargin = i;
                layoutParams.rightMargin = i2;
            }
            if (z) {
                C1399s0.m37145y0(view);
            }
        }
    }

    public static int m10068b3(AbstractC9323v4<?> v4Var, boolean z) {
        if (v4Var == null) {
            return 0;
        }
        if (z) {
            if (v4Var.m9374Oa()) {
                return v4Var.mo8831xa();
            }
            if (v4Var.m9382Na()) {
                return v4Var.mo415la();
            }
            if (v4Var.m9390Ma()) {
                return 0;
            }
        }
        return v4Var.mo418W9();
    }

    public static void m10067b4(View view, int i, int i2) {
        if (view instanceof C9279r) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i3 = (C4403w.m27984G2() ? 5 : 3) | 48;
            boolean z = true;
            boolean z2 = layoutParams.gravity != i3;
            layoutParams.gravity = i3;
            if (C4403w.m27984G2()) {
                if (!z2 && layoutParams.leftMargin == i2 && layoutParams.rightMargin == i) {
                    z = false;
                }
                layoutParams.rightMargin = i;
                layoutParams.leftMargin = i2;
            } else {
                if (!z2 && layoutParams.leftMargin == i && layoutParams.rightMargin == i2) {
                    z = false;
                }
                layoutParams.leftMargin = i;
                layoutParams.rightMargin = i2;
            }
            if (z) {
                C1399s0.m37145y0(view);
            }
        }
    }

    public static int m10066c3(boolean z) {
        return z ? C4896n.m24478e() + getTopOffset() : C4896n.m24478e();
    }

    public static int m10064d3(boolean z, boolean z2) {
        return z ? m10089T2(z2) : m10066c3(z2);
    }

    public static int m10062e3(AbstractC9323v4<?> v4Var, boolean z) {
        if (v4Var == null) {
            return 1275068416;
        }
        return v4Var.m9306Y9();
    }

    public int getCurrentHeaderOffset() {
        int i = this.f29599e0;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private float getHeightFactor() {
        return (this.f29593b0 - C4896n.m24478e()) / C4896n.m24475h();
    }

    public static int getPlayerSize() {
        return C4896n.m24479d();
    }

    private C11537v getThemeListeners() {
        if (this.f29607l0 == null) {
            this.f29607l0 = new C11537v();
        }
        return this.f29607l0;
    }

    public static int getTopOffset() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1357a0.m37535o();
        }
        return 0;
    }

    public static int m10055h3(AbstractC9323v4<?> v4Var) {
        if (v4Var == null || v4Var.m9390Ma()) {
            return 0;
        }
        if (v4Var.m9374Oa()) {
            return v4Var.mo8831xa();
        }
        if (v4Var.m9382Na()) {
            return v4Var.mo415la();
        }
        return 0;
    }

    public static int m10053i3(AbstractC9323v4<?> v4Var) {
        if (v4Var.m9390Ma()) {
            return 3;
        }
        if (v4Var.m9374Oa()) {
            return 1;
        }
        return v4Var.m9382Na() ? 2 : 0;
    }

    public static void m10051j4(View view, AbstractC9323v4<?> v4Var, int i, int i2) {
        boolean z;
        if (view != null && v4Var != null) {
            int i3 = C1357a0.m37541i(15.0f) + i2;
            if (v4Var.mo408A9() != 1) {
                if (C4403w.m27984G2()) {
                    z = C1399s0.m37177i0((FrameLayout.LayoutParams) view.getLayoutParams(), i, i3, C1357a0.m37541i(68.0f), 0);
                } else {
                    z = C1399s0.m37177i0((FrameLayout.LayoutParams) view.getLayoutParams(), C1357a0.m37541i(68.0f), i3, i, 0);
                }
            } else if (C4403w.m27984G2()) {
                z = C1399s0.m37177i0((FrameLayout.LayoutParams) view.getLayoutParams(), i, i3, C1357a0.m37541i(18.0f), 0);
            } else {
                z = C1399s0.m37177i0((FrameLayout.LayoutParams) view.getLayoutParams(), C1357a0.m37541i(18.0f), i3, i, 0);
            }
            if (z) {
                C1399s0.m37145y0(view);
            }
        }
    }

    public void m10038p3(View view) {
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (l instanceof AbstractC5153x0) {
            m10105M3(((AbstractC5153x0) l).mo23797N4());
        }
    }

    public static boolean m10037p4(AbstractC9323v4<?> v4Var) {
        return v4Var == null || v4Var.mo9423He();
    }

    public void m10036q3(View view) {
        ((C6924j2) view.getParent().getParent()).m18408y2(true);
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (l instanceof AbstractC9213j1) {
            ((AbstractC9213j1) l).mo8864N0(view.getId());
        }
    }

    public static boolean m10035q4(AbstractC9323v4<?> v4Var) {
        return v4Var == null || v4Var.mo9416Ie();
    }

    public void m10033r3(View view) {
        ((C6924j2) view.getParent().getParent()).m18408y2(true);
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (l instanceof AbstractC5153x0) {
            ((AbstractC5153x0) l).mo23796Z2(view.getId());
        }
    }

    public static int m10032r4() {
        return m10024x2(-1);
    }

    public void m10031s3(float f, int i, AbstractC9323v4 v4Var, ValueAnimator valueAnimator) {
        float a = f - (C2057b.m35735a(valueAnimator) * f);
        setTranslation(a);
        if (i == 2) {
            v4Var.m9410Jd(1.0f - a, true);
        }
    }

    private void setHeaderOffset(int i) {
        if (this.f29599e0 != i) {
            this.f29599e0 = i;
            C1399s0.m37155t0(this.f29576R, i);
            C1399s0.m37155t0(this.f29572P, i);
            C1399s0.m37155t0(this.f29574Q, i);
            C1399s0.m37155t0(this.f29586W, C1357a0.m37541i(15.0f) + i);
            C1399s0.m37155t0(this.f29591a0, C1357a0.m37541i(15.0f) + i);
            C9207i1 i1Var = this.f29608m0;
            if (i1Var != null) {
                i1Var.setTranslationY(getTranslationY() + getCurrentHeaderOffset());
            }
            View view = this.f29578S;
            if (view != this.f29586W) {
                m10020z2(view);
            }
            View view2 = this.f29580T;
            if (!(view2 == null || view2 == this.f29591a0)) {
                m10020z2(view2);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
            if (this.f29568N) {
                setLayoutParams(FrameLayoutFix.m18007t1(-1, m10066c3(true) + this.f29595c0.m9008s(), 48));
            } else {
                setLayoutParams(FrameLayoutFix.m18007t1(-1, C4896n.m24476g() + getTopOffset() + this.f29595c0.m9008s() + C4896n.m24478e(), 48));
            }
        }
    }

    public void m10029t3(float f, float f2, int i, AbstractC9323v4 v4Var, ValueAnimator valueAnimator) {
        float a = f + (f2 * C2057b.m35735a(valueAnimator));
        setTranslation(a);
        if (i == 2) {
            v4Var.m9410Jd(1.0f - a, false);
        }
    }

    public static int m10024x2(int i) {
        return C5064d.m24129c(i, 855638016);
    }

    public static int m10022y2() {
        return m10024x2(C11524j.m167m0());
    }

    public C9310u0 m10134A2(int i, int i2, int i3, AbstractC9323v4<?> v4Var, int i4, int i5, View.OnClickListener onClickListener) {
        C9310u0 u0Var = new C9310u0(getContext());
        u0Var.setButtonBackground(i5);
        u0Var.setId(i);
        if (i2 != 0) {
            u0Var.setImageResource(i2);
        }
        if (i3 != 0) {
            u0Var.m9518g(i3);
        }
        if (v4Var != null) {
            v4Var.m9163t8(u0Var);
        }
        if (onClickListener != null) {
            u0Var.setOnClickListener(onClickListener);
        }
        u0Var.setOnLongClickListener(this);
        u0Var.setLayoutParams(new ViewGroup.LayoutParams(i4, -1));
        return u0Var;
    }

    public void m10133A3(int i, boolean z) {
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (!this.f29589Y0 && l != null && !l.m9374Oa() && !l.m9382Na()) {
            this.f29589Y0 = true;
            l.m9225k9();
            this.f29588X0 = 1.0f;
            m10102N3(l, 1, i, true, z, null);
        }
    }

    public C9310u0 m10132B2(int i, int i2, int i3, AbstractC9323v4<?> v4Var, int i4, View.OnClickListener onClickListener) {
        return m10134A2(i, i2, i3, v4Var, i4, C11532q.m113b(), onClickListener);
    }

    public void m10131B3() {
        this.f29601f0 = true;
    }

    public final LinearLayout m10129C2(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, C4896n.m24478e(), (C4403w.m27984G2() ? 3 : 5) | 48);
        t1.topMargin = getCurrentHeaderOffset();
        linearLayout.setLayoutParams(t1);
        return linearLayout;
    }

    public final void m10128C3() {
        AbstractC9323v4<?> v4Var;
        AbstractC9323v4<?> v4Var2;
        int i;
        int i2;
        AbstractC9323v4<?> v4Var3;
        boolean z = this.f29614s0;
        if (z) {
            v4Var2 = this.f29582U;
            v4Var = this.f29584V;
        } else {
            v4Var = this.f29582U;
            v4Var2 = this.f29584V;
        }
        AbstractC9323v4<?> v4Var4 = this.f29582U;
        boolean z2 = false;
        boolean z3 = v4Var4 != null && v4Var4.mo9386Me() && !z;
        AbstractC9323v4<?> v4Var5 = this.f29584V;
        boolean z4 = v4Var5 != null && v4Var5.mo9386Me() && z;
        boolean z5 = v4Var2 == null && m10053i3(v4Var) != 0;
        if (this.f29562I0) {
            if (!z5 || z) {
                i = z4 ? C5064d.m24130b(0, C11524j.m167m0()) : m10083V2(this.f29584V, !z5);
            } else {
                i = m10083V2(v4Var, true);
            }
            if (!z5 || !z) {
                i2 = z3 ? C5064d.m24130b(0, C11524j.m167m0()) : m10083V2(this.f29582U, !z5);
            } else {
                i2 = m10083V2(v4Var, true);
            }
            this.f29563J0.m18908b(i, i2);
        } else {
            this.f29595c0.m9023j0(m10083V2(this.f29582U, true));
            i2 = 0;
            i = 0;
        }
        if (this.f29564K0) {
            if (!z5 || z) {
                z2 = !z5;
            }
            int Y2 = m10075Y2(v4Var, z2);
            int Y22 = (!z5 || !z) ? m10075Y2(v4Var2, !z5) : m10075Y2(v4Var, true);
            int i3 = z ? Y2 : Y22;
            if (z) {
                Y2 = Y22;
            }
            this.f29569N0.m18908b(i3, Y2);
            View view = this.f29578S;
            if (view instanceof AbstractC9168d) {
                ((AbstractC9168d) view).mo9847G0(i3, Y2);
            }
            View view2 = this.f29580T;
            if (view2 instanceof AbstractC9168d) {
                ((AbstractC9168d) view2).mo9847G0(i3, Y2);
            }
        }
        int Y23 = m10075Y2(this.f29582U, true);
        TextView textView = this.f29586W;
        if (textView != null && (!this.f29564K0 || this.f29578S != textView)) {
            textView.setTextColor(Y23);
        }
        TextView textView2 = this.f29591a0;
        if (textView2 != null && (!this.f29564K0 || this.f29580T != textView2)) {
            textView2.setTextColor(Y23);
        }
        if (this.f29571O0) {
            int Q2 = m10095Q2(v4Var, !z5);
            int Q22 = z5 ? m10095Q2(v4Var, true) : m10095Q2(v4Var2, !z5);
            int i4 = z ? Q2 : Q22;
            if (z) {
                Q2 = Q22;
            }
            this.f29573P0.m18908b(i4, Q2);
        } else {
            this.f29576R.setColor(m10095Q2(this.f29582U, true));
        }
        setTranslation(this.f29588X0);
        if (this.f29562I0 && this.f29588X0 == 0.0f && (v4Var3 = this.f29584V) != null && v4Var3.mo9386Me()) {
            RunnableC9355x0 filling = getFilling();
            if (z) {
                i2 = i;
            }
            filling.m9023j0(i2);
        }
    }

    public void m10124E3(AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2) {
        int W9;
        C9270q1 q1Var = this.f29570O;
        boolean z = false;
        boolean z2 = q1Var != null && q1Var.m9742S();
        if (z2) {
            if (this.f29598d1) {
                m10128C3();
            } else {
                this.f29595c0.m9023j0(v4Var.m9406K9());
            }
            C9290s0 s0Var = this.f29561H0;
            if (s0Var != null) {
                s0Var.invalidate();
            }
            m10042n3();
        }
        int Q2 = m10095Q2(v4Var, true);
        int b3 = m10068b3(v4Var, true);
        if (b3 != 0) {
            m10082V3(v4Var, b3, Q2);
        }
        if (v4Var.m9366Pa() && (W9 = v4Var.mo418W9()) != 0) {
            m10082V3(v4Var, W9, v4Var.mo9383N9());
        }
        int la2 = v4Var.mo415la();
        if (la2 != 0) {
            m10082V3(v4Var, la2, v4Var.m9244ha());
        }
        int xa = v4Var.mo8831xa();
        if (xa != 0) {
            m10082V3(v4Var, xa, v4Var.m9146va());
        }
        C9290s0 s0Var2 = this.f29561H0;
        if (s0Var2 != null) {
            s0Var2.invalidate();
        }
        if (v4Var2 != null) {
            z = z2;
        }
        if (!z || v4Var2.mo9375O9() == v4Var.mo9375O9()) {
            this.f29576R.setColor(Q2);
        }
        if (!z || v4Var2.mo9360Q9() == v4Var.mo9360Q9()) {
            int Y2 = m10075Y2(v4Var, true);
            TextView textView = this.f29586W;
            if (textView != null) {
                textView.setTextColor(Y2);
            }
            TextView textView2 = this.f29591a0;
            if (textView2 != null) {
                textView2.setTextColor(Y2);
            }
        }
        if (!z || v4Var2.mo9398L9() == v4Var.mo9398L9()) {
            this.f29595c0.m9023j0(m10083V2(v4Var, true));
            m10042n3();
        }
    }

    public HeaderEditText m10119G2(AbstractC9323v4<?> v4Var) {
        return m10122F2(this, v4Var);
    }

    public final void m10117H2(AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2, boolean z) {
        AbstractC9201h1 h1Var;
        AbstractC9323v4<?> v4Var3;
        AbstractC9323v4<?> v4Var4;
        if (z) {
            this.f29582U = v4Var2;
            this.f29584V = v4Var;
        } else {
            this.f29582U = v4Var;
            this.f29584V = v4Var2;
        }
        this.f29614s0 = z;
        if (v4Var2 == null) {
            this.f29580T = z ? v4Var.m9441Fa(this) : v4Var.mo8869G9();
        } else {
            AbstractC9323v4<?> v4Var5 = this.f29582U;
            this.f29580T = v4Var5 == null ? null : v4Var5.m9366Pa() ? this.f29582U.m9441Fa(this) : this.f29582U.mo8869G9();
        }
        boolean z2 = true;
        int i = 0;
        if (v4Var2 == null && v4Var.m9259f9()) {
            this.f29612q0 = 0;
            this.f29613r0 = false;
            this.f29580T = this.f29578S;
        } else if (v4Var2 == null || v4Var2.mo9177r9()) {
            this.f29613r0 = false;
            this.f29612q0 = 3;
        } else {
            boolean z3 = this.f29580T != null && v4Var2.m9363Pd() && !v4Var2.m9366Pa() && !v4Var.m9366Pa();
            this.f29613r0 = z3;
            this.f29612q0 = (z3 || !v4Var2.mo9401Ke()) ? 0 : this.f29612q0;
        }
        View view = this.f29580T;
        boolean z4 = view == null;
        if (z4) {
            if (this.f29591a0 == null) {
                this.f29591a0 = m10109L2(getContext());
            }
            this.f29591a0.setId(this.f29582U.mo407R9());
            C1399s0.m37175j0(this.f29591a0, this.f29582U.mo9313X9());
            this.f29580T = this.f29591a0;
        } else {
            m10020z2(view);
        }
        View view2 = this.f29580T;
        if (view2 != this.f29578S) {
            if (view2.getParent() != null) {
                removeView(this.f29580T);
            }
            if (z) {
                addView(this.f29580T, !f29553f1 ? 1 : 0);
            } else {
                addView(this.f29580T, f29553f1 ? 1 : 2);
            }
        }
        if (this.f29613r0) {
            this.f29578S.setVisibility(8);
        }
        int b3 = m10068b3(v4Var, v4Var2 != null);
        int h3 = v4Var2 == null ? m10055h3(v4Var) : m10068b3(v4Var2, true);
        int i2 = z ? h3 : b3;
        if (i2 == 0 || b3 == h3) {
            this.f29611p0 = false;
        } else {
            this.f29611p0 = true;
            if (this.f29574Q == null) {
                this.f29574Q = m10129C2(getContext());
            }
            if (v4Var2 != null || !z ? (v4Var3 = this.f29582U) == null || !v4Var3.m9458D8() : (v4Var4 = this.f29584V) == null || !v4Var4.m9458D8()) {
                z2 = false;
            }
            if (this.f29574Q.getId() != i2 || !z2) {
                this.f29574Q.removeAllViews();
                this.f29574Q.setId(i2);
                if (v4Var2 != null || !z) {
                    h1Var = (AbstractC9201h1) this.f29582U;
                } else {
                    h1Var = (AbstractC9201h1) this.f29584V;
                }
                h1Var.mo414p0(i2, this, this.f29574Q);
            }
            if (z4) {
                int i3 = 0;
                while (i < this.f29574Q.getChildCount()) {
                    View childAt = this.f29574Q.getChildAt(i);
                    if (childAt != null) {
                        i3 += childAt.getLayoutParams().width;
                    }
                    i++;
                }
                i = i3;
            }
            if (this.f29574Q.getParent() != null) {
                removeView(this.f29574Q);
            }
            if (z) {
                addView(this.f29574Q, -1);
            } else {
                addView(this.f29574Q, 3);
            }
        }
        if (z4) {
            m10051j4(this.f29580T, this.f29582U, i, getCurrentHeaderOffset());
        }
    }

    public final boolean m10116H3() {
        return this.f29600e1 || Color.alpha(this.f29610o0) > 0 || getAlpha() == 0.0f || getVisibility() != 0;
    }

    public void m10114I3(int[] r10, java.lang.String[] r11, int[] r12, int r13, boolean r14, td.AbstractC9323v4<?> r15) {
        throw new UnsupportedOperationException("Method not decompiled: td.View$OnClickListenerC9170d1.m10114I3(int[], java.lang.String[], int[], int, boolean, td.v4):void");
    }

    public HeaderEditText m10111K2(boolean z, AbstractC9323v4<?> v4Var) {
        return m10112J2(this, z, v4Var);
    }

    public TextView m10109L2(Context context) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, (C4403w.m27984G2() ? 5 : 3) | 48);
        t1.topMargin = C1357a0.m37541i(15.0f) + getCurrentHeaderOffset();
        C6847b2 b2Var = new C6847b2(context);
        b2Var.setTag(this);
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        b2Var.setHighlightColor(C11524j.m209W0());
        b2Var.setTypeface(C1389o.m37260i());
        b2Var.setGravity(3);
        b2Var.setSingleLine();
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setTextSize(1, 19.0f);
        b2Var.setTextColor(-1);
        b2Var.setLayoutParams(t1);
        return b2Var;
    }

    public final void m10108L3(int[] iArr, String[] strArr, int[] iArr2, View.OnClickListener onClickListener, boolean z, C11537v vVar) {
        int length = iArr == null ? strArr.length : iArr.length;
        int childCount = this.f29608m0.getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (i2 < length) {
                this.f29608m0.m9964g(i2, iArr == null ? i2 : iArr[i2], strArr[i2], iArr2 != null ? iArr2[i2] : 0, onClickListener, vVar);
                i2++;
                i++;
            } else {
                for (int i3 = childCount - 1; i3 >= length; i3--) {
                    this.f29608m0.removeViewAt(i3);
                }
            }
        }
        if (length > this.f29608m0.getChildCount()) {
            while (i2 < length) {
                this.f29608m0.m9970a(iArr == null ? i2 : iArr[i2], strArr[i2], iArr2 != null ? iArr2[i2] : 0, null, onClickListener);
                i2++;
            }
        }
        C6924j2 j2Var = new C6924j2(getContext());
        j2Var.m18045Q1(true);
        j2Var.m18435N2();
        j2Var.setOverlayStatusBar(true);
        j2Var.m18431R2(this.f29608m0);
    }

    public final void m10106M2(AbstractC9323v4<?> v4Var) {
        View G9 = v4Var.mo8869G9();
        if (G9 == null) {
            m10051j4(this.f29586W, v4Var, 0, getCurrentHeaderOffset());
            this.f29586W.setId(v4Var.mo407R9());
            C1399s0.m37175j0(this.f29586W, v4Var.mo9313X9());
            G9 = this.f29586W;
        } else {
            m10020z2(G9);
        }
        View view = this.f29578S;
        if (!(view == null || view == G9)) {
            removeView(view);
        }
        this.f29578S = G9;
        if (G9.getParent() == null) {
            addView(this.f29578S, !f29553f1 ? 1 : 0);
        }
    }

    public final void m10105M3(String[] strArr) {
        if (this.f29608m0 == null) {
            C9207i1 i1Var = new C9207i1(getContext());
            this.f29608m0 = i1Var;
            i1Var.m9969b(null, null);
        }
        if (this.f29606k0 == null) {
            this.f29606k0 = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnClickListenerC9170d1.this.m10033r3(view);
                }
            };
        }
        this.f29608m0.setAnchorMode(1);
        this.f29608m0.setTranslationY(getTranslationY() + getCurrentHeaderOffset());
        m10108L3(null, strArr, null, this.f29606k0, false, getThemeListeners());
    }

    public C9310u0 m10104N1(LinearLayout linearLayout, int i, int i2, int i3, AbstractC9323v4<?> v4Var, int i4) {
        C9310u0 B2 = m10132B2(i, i2, i3, v4Var, i4, this);
        linearLayout.addView(B2, C4403w.m27984G2() ? 0 : -1);
        return B2;
    }

    public C9351w2 m10103N2(Context context, AbstractC9323v4<?> v4Var) {
        if (this.f29605j0 == null) {
            this.f29605j0 = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnClickListenerC9170d1.this.m10038p3(view);
                }
            };
        }
        return m10100O2(context, v4Var, this.f29605j0);
    }

    public final void m10102N3(final AbstractC9323v4<?> v4Var, final int i, int i2, boolean z, boolean z2, Runnable runnable) {
        this.f29590Z0 = i;
        m10021y3(v4Var, null, z, 3, this.f29588X0);
        if (z) {
            if (i == 1) {
                v4Var.m9359Qa(i2);
                v4Var.mo8842qc();
            } else if (i == 2) {
                v4Var.mo9187pc();
            }
        } else if (i == 2) {
            v4Var.mo409xc();
            v4Var.mo9445Ee(false);
        } else if (i == 3) {
            v4Var.m9452De(false);
        }
        C9172b bVar = new C9172b(z, i, v4Var, runnable);
        if (!z2) {
            if (z) {
                setTranslation(0.0f);
                if (i == 2) {
                    v4Var.m9410Jd(1.0f, true);
                }
            } else {
                setTranslation(1.0f);
                if (i == 2) {
                    v4Var.m9410Jd(0.0f, false);
                }
            }
            bVar.onAnimationEnd(null);
        } else if (!v4Var.mo9358Qb(z, i, bVar)) {
            final float translation = getTranslation();
            ValueAnimator b = C2057b.m35734b();
            if (z) {
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View$OnClickListenerC9170d1.this.m10031s3(translation, i, v4Var, valueAnimator);
                    }
                });
            } else {
                final float f = 1.0f - translation;
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View$OnClickListenerC9170d1.this.m10029t3(translation, f, i, v4Var, valueAnimator);
                    }
                });
            }
            b.setInterpolator(v4Var.mo9176ra());
            b.setDuration(v4Var.mo9189pa());
            b.addListener(bVar);
            v4Var.mo9150ue(b, i, z);
        }
    }

    public C9310u0 m10101O1(LinearLayout linearLayout, int i, int i2, AbstractC9323v4<?> v4Var, int i3, int i4, int i5) {
        C9310u0 A2 = m10134A2(i, i3, i2, v4Var, i4, i5, this);
        linearLayout.addView(A2, C4403w.m27984G2() ? 0 : -1);
        return A2;
    }

    public C9351w2 m10100O2(Context context, AbstractC9323v4<?> v4Var, View.OnClickListener onClickListener) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, C1357a0.m37541i(38.0f), (C4403w.m27984G2() ? 5 : 3) | 48);
        t1.topMargin = C1357a0.m37541i(15.0f) + getCurrentHeaderOffset();
        if (C4403w.m27984G2()) {
            t1.rightMargin = C1357a0.m37541i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37541i(68.0f);
        }
        C9351w2 w2Var = new C9351w2(context);
        if (v4Var != null) {
            w2Var.setTextColor(v4Var.m9367P9());
            w2Var.setTriangleColor(v4Var.mo9383N9());
        }
        w2Var.setLayoutParams(t1);
        w2Var.setOnClickListener(onClickListener);
        return w2Var;
    }

    public void m10099O3(AbstractC9323v4<?> v4Var, int i) {
        if (v4Var.m9339Ta()) {
            this.f29576R.setColor(i);
        }
    }

    public void m10097P3(int i, int i2, int i3, int i4) {
        View findViewById;
        View findViewById2;
        if (this.f29572P.getId() == i && (findViewById2 = this.f29572P.findViewById(i2)) != null) {
            findViewById2.setVisibility(i3);
            if (i4 != 0) {
                ((C9310u0) findViewById2).setImageResource(i4);
            }
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29574Q.findViewById(i2)) != null) {
            findViewById.setVisibility(i3);
            if (i4 != 0) {
                ((C9310u0) findViewById).setImageResource(i4);
            }
        }
    }

    public C6882g0 m10096Q1(LinearLayout linearLayout, int i, int i2) {
        C6882g0 g0Var = new C6882g0(getContext());
        g0Var.setId(R.id.menu_btn_clear);
        g0Var.setColorId(i);
        g0Var.setButtonBackground(i2);
        g0Var.setOnClickListener(this);
        linearLayout.addView(g0Var, C4403w.m27984G2() ? 0 : -1);
        return g0Var;
    }

    public void m10094Q3(int i, int i2, AbstractC5918j<C9310u0> jVar) {
        View findViewById;
        View findViewById2;
        if (this.f29572P.getId() == i && (findViewById2 = this.f29572P.findViewById(i2)) != null) {
            jVar.mo1330a((C9310u0) findViewById2);
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29574Q.findViewById(i2)) != null) {
            jVar.mo1330a((C9310u0) findViewById);
        }
    }

    public void m10092R3(int i, int i2, float f) {
        View findViewById;
        View findViewById2;
        if (this.f29572P.getId() == i && (findViewById2 = this.f29572P.findViewById(i2)) != null) {
            findViewById2.setAlpha(f);
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29574Q.findViewById(i2)) != null) {
            findViewById.setAlpha(f);
        }
    }

    public C6882g0 m10091S1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10096Q1(linearLayout, v4Var.mo9375O9(), v4Var.mo9472B9());
    }

    public C9310u0 m10090T1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10134A2(R.id.menu_btn_copy, R.drawable.baseline_content_copy_24, i, v4Var, C1357a0.m37541i(50.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27984G2() ? 0 : -1);
        return A2;
    }

    public void m10088T3(AbstractC9323v4<?> v4Var, int i, float f) {
        if (this.f29572P.getId() == i) {
            int childCount = this.f29572P.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f29572P.getChildAt(i2);
                if (childAt != null) {
                    if (childAt instanceof C9310u0) {
                        ((C9310u0) childAt).m9519f(f);
                        childAt.invalidate();
                    } else {
                        v4Var.m9467Be(childAt, i, f);
                    }
                }
            }
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i) {
            int childCount2 = this.f29574Q.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = this.f29574Q.getChildAt(i3);
                if (childAt2 != null) {
                    if (childAt2 instanceof C9310u0) {
                        ((C9310u0) childAt2).m9519f(f);
                        childAt2.invalidate();
                    } else {
                        v4Var.m9467Be(childAt2, i, f);
                    }
                }
            }
        }
    }

    @Override
    public void mo9343T5(int i, int i2) {
        if (C4403w.m27981H1(i, i2)) {
            int i3 = 5;
            if (C1399s0.m37189c0(this.f29576R, (C4403w.m27984G2() ? 5 : 3) | 48)) {
                C1399s0.m37145y0(this.f29576R);
            }
            if (C1399s0.m37189c0(this.f29572P, (C4403w.m27984G2() ? 3 : 5) | 48)) {
                C1399s0.m37145y0(this.f29572P);
                m10121F3(this.f29572P);
            }
            if (C1399s0.m37189c0(this.f29574Q, (C4403w.m27984G2() ? 3 : 5) | 48)) {
                C1399s0.m37145y0(this.f29574Q);
                m10121F3(this.f29574Q);
            }
            if (C1399s0.m37189c0(this.f29586W, (C4403w.m27984G2() ? 5 : 3) | 48)) {
                m10118G3(this.f29586W);
            }
            TextView textView = this.f29591a0;
            if (!C4403w.m27984G2()) {
                i3 = 3;
            }
            if (C1399s0.m37189c0(textView, i3 | 48)) {
                m10118G3(this.f29591a0);
            }
            C9207i1 i1Var = this.f29608m0;
            if (i1Var != null) {
                i1Var.m9965f();
            }
        }
    }

    public C9310u0 m10087U1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10134A2(R.id.menu_btn_delete, R.drawable.baseline_delete_24, i, v4Var, C1357a0.m37541i(52.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27984G2() ? 0 : -1);
        return A2;
    }

    public C9310u0 m10084V1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10081W1(linearLayout, v4Var, v4Var.mo9375O9());
    }

    public void m10082V3(AbstractC9323v4<?> v4Var, int i, int i2) {
        LinearLayout linearLayout = this.f29572P;
        if (linearLayout != null && linearLayout.getId() == i) {
            m10085U3(this.f29572P, i2);
        }
        LinearLayout linearLayout2 = this.f29574Q;
        if (linearLayout2 != null && linearLayout2.getId() == i) {
            m10085U3(this.f29574Q, i2);
        }
    }

    public C9310u0 m10081W1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 B2 = m10132B2(R.id.menu_btn_done, R.drawable.baseline_check_24, i, v4Var, C1357a0.m37541i(56.0f), this);
        linearLayout.addView(B2, C4403w.m27984G2() ? 0 : -1);
        return B2;
    }

    public void m10080W3(int i, AbstractC9323v4<?> v4Var, float f) {
        if (this.f29572P.getId() == i) {
            v4Var.mo9429H8(this.f29572P, f);
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i) {
            v4Var.mo9429H8(this.f29574Q, f);
        }
    }

    public C9310u0 m10079X1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10134A2(R.id.menu_btn_edit, R.drawable.baseline_edit_24, i, v4Var, C1357a0.m37541i(52.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27984G2() ? 0 : -1);
        return A2;
    }

    public void m10077X3(int i, int i2, AbstractC5918j<View> jVar) {
        View findViewById;
        View findViewById2;
        if (this.f29572P.getId() == i && (findViewById2 = this.f29572P.findViewById(i2)) != null) {
            jVar.mo1330a(findViewById2);
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29574Q.findViewById(i2)) != null) {
            jVar.mo1330a(findViewById);
        }
    }

    public C9310u0 m10076Y1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10073Z1(linearLayout, v4Var, v4Var.mo9375O9());
    }

    public void m10074Y3(AbstractC9323v4<?> v4Var, int i) {
        if (this.f29572P.getId() == i) {
            v4Var.mo9460Ce(i, this.f29572P);
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i) {
            v4Var.mo9460Ce(i, this.f29574Q);
        }
    }

    public C9310u0 m10073Z1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10134A2(R.id.menu_btn_forward, R.drawable.baseline_forward_24, i, v4Var, C1357a0.m37541i(52.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27984G2() ? 0 : -1);
        return A2;
    }

    public View$OnClickListenerC9195g1 m10071a2(LinearLayout linearLayout) {
        View$OnClickListenerC9195g1 g1Var = new View$OnClickListenerC9195g1(getContext());
        linearLayout.addView(g1Var);
        return g1Var;
    }

    @Override
    public void mo4501a3() {
        C11052v1.m1768b().m1766d(this);
        C4403w.m27988F2(this);
        C1357a0.m37528v(this);
        RunnableC9355x0 x0Var = this.f29595c0;
        if (x0Var != null) {
            x0Var.mo4501a3();
        }
    }

    public C9310u0 m10069b2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10065d2(linearLayout, v4Var, v4Var.mo9375O9());
    }

    public C9310u0 m10065d2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 B2 = m10132B2(R.id.menu_btn_more, R.drawable.baseline_more_vert_24, i, v4Var, C1357a0.m37541i(49.0f), this);
        linearLayout.addView(B2, C4403w.m27984G2() ? 0 : -1);
        return B2;
    }

    public void m10063d4(int i) {
        View findViewById;
        View findViewById2;
        if (this.f29572P.getId() == i && (findViewById2 = this.f29572P.findViewById(R.id.menu_btn_lock)) != null) {
            ((View$OnClickListenerC9195g1) findViewById2).m9985j();
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29574Q.findViewById(R.id.menu_btn_lock)) != null) {
            ((View$OnClickListenerC9195g1) findViewById).m9985j();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (Color.alpha(this.f29610o0) > 0) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f29595c0.m9012q(), C1410y.m37039g(this.f29610o0));
        }
    }

    public void m10061e4(int i, int i2, boolean z, boolean z2) {
        View findViewById;
        View findViewById2;
        if (this.f29572P.getId() == i && (findViewById2 = this.f29572P.findViewById(i2)) != null) {
            ((C6882g0) findViewById2).m18685m(z, z2);
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29574Q.findViewById(i2)) != null) {
            ((C6882g0) findViewById).m18685m(z, z2);
        }
    }

    public C9310u0 m10060f2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 g = m10134A2(R.id.menu_btn_reply, R.drawable.baseline_reply_24, i, v4Var, C1357a0.m37541i(52.0f), C11532q.m113b(), this).m9518g(i);
        linearLayout.addView(g, C4403w.m27984G2() ? 0 : -1);
        return g;
    }

    public void m10059f4(int i, int i2, boolean z) {
        View findViewById;
        View findViewById2;
        if (this.f29572P.getId() == i && (findViewById2 = this.f29572P.findViewById(i2)) != null) {
            ((C6882g0) findViewById2).setInProgress(z);
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29574Q.findViewById(i2)) != null) {
            ((C6882g0) findViewById).setInProgress(z);
        }
    }

    @Override
    public void mo452g2() {
        TextView textView = this.f29586W;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f29591a0;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }

    public final int m10058g3(View view) {
        if ((view instanceof TextView) && view.getTag() == this) {
            return 1;
        }
        if (view instanceof AbstractC9321v2) {
            return 3;
        }
        return view instanceof C9351w2 ? 2 : 0;
    }

    public void m10057g4(int i, int i2, String str, boolean z, boolean z2) {
        View findViewById;
        View findViewById2;
        if (this.f29572P.getId() == i && (findViewById2 = this.f29572P.findViewById(i2)) != null) {
            if (z2) {
                ((C9202h2) findViewById2).m9979l(str, z);
            } else {
                C9202h2 h2Var = (C9202h2) findViewById2;
                h2Var.setIsVisible(z);
                h2Var.setValue(str);
            }
        }
        LinearLayout linearLayout = this.f29574Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29574Q.findViewById(i2)) != null) {
            if (z2) {
                ((C9202h2) findViewById).m9979l(str, z);
                return;
            }
            C9202h2 h2Var2 = (C9202h2) findViewById;
            h2Var2.setIsVisible(z);
            h2Var2.setValue(str);
        }
    }

    public View$OnClickListenerC9150b getBackButton() {
        return this.f29576R;
    }

    public float getBackFactor() {
        return this.f29592a1;
    }

    public float getCurrentHeight() {
        return this.f29593b0;
    }

    public int getCurrentTransformMode() {
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (l == null) {
            return 0;
        }
        if (l.m9382Na()) {
            return 2;
        }
        return l.m9374Oa() ? 1 : 0;
    }

    public RunnableC9355x0 getFilling() {
        return this.f29595c0;
    }

    public float getTranslation() {
        return this.f29588X0;
    }

    public C9310u0 m10056h2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10134A2(R.id.menu_btn_retry, R.drawable.baseline_repeat_24, i, v4Var, C1357a0.m37541i(52.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27984G2() ? 0 : -1);
        return A2;
    }

    public C9310u0 m10054i2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10050k2(linearLayout, v4Var, v4Var.mo9375O9());
    }

    @Override
    public boolean isLayoutRequested() {
        return this.f29602g0;
    }

    public boolean m10052j3() {
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        return l != null && l.m9382Na();
    }

    public C9310u0 m10050k2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 B2 = m10132B2(R.id.menu_btn_search, R.drawable.baseline_search_24, i, v4Var, C1357a0.m37541i(49.0f), this);
        linearLayout.addView(B2, C4403w.m27984G2() ? 0 : -1);
        return B2;
    }

    public boolean m10049k3() {
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        return l != null && l.m9374Oa();
    }

    public C9202h2 m10048l2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        C9202h2 h2Var = new C9202h2(getContext());
        h2Var.setOnClickListener(this);
        if (v4Var != null) {
            h2Var.m9518g(v4Var.mo9375O9());
            v4Var.m9163t8(h2Var);
        }
        linearLayout.addView(h2Var);
        return h2Var;
    }

    public void m10047l3(C9270q1 q1Var) {
        this.f29570O = q1Var;
        this.f29597d0 = true;
        this.f29566M = q1Var.m9749M();
        RunnableC9355x0 x0Var = new RunnableC9355x0(this, q1Var);
        this.f29595c0 = x0Var;
        x0Var.m9019l0();
        this.f29595c0.m9056K((int) this.f29593b0, getHeightFactor());
        setHeaderOffset(getTopOffset());
        C2065g.m35718d(this, this.f29595c0);
        C1357a0.m37549a(this);
        C11052v1.m1768b().m1769a(this);
    }

    public C9310u0 m10046m2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10134A2(R.id.menu_btn_view, R.drawable.baseline_visibility_24, i, v4Var, C1357a0.m37541i(52.0f), C11532q.m114a(), this);
        linearLayout.addView(A2, C4403w.m27984G2() ? 0 : -1);
        return A2;
    }

    public void m10045m3(AbstractC9323v4<?> v4Var, boolean z) {
        this.f29570O = null;
        this.f29566M = new C9312u1(v4Var);
        this.f29568N = true;
        this.f29597d0 = z;
        RunnableC9355x0 x0Var = new RunnableC9355x0(this, null);
        this.f29595c0 = x0Var;
        if (z) {
            x0Var.m9019l0();
            setHeaderOffset(getTopOffset());
            setClipToPadding(false);
        } else {
            setLayoutParams(FrameLayoutFix.m18007t1(-1, m10066c3(false) + this.f29595c0.m9008s(), 48));
        }
        this.f29595c0.m9056K((int) this.f29593b0, getHeightFactor());
        C2065g.m35718d(this, this.f29595c0);
        setTitle(v4Var);
        C11052v1.m1768b().m1769a(this);
        C4403w.m27875h(this);
        v4Var.m9226k8(this);
        if (z) {
            C1357a0.m37549a(this);
        }
    }

    public void m10044m4(int i, CharSequence charSequence) {
        TextView textView = this.f29586W;
        if (textView != null && textView.getId() == i) {
            C1399s0.m37175j0(this.f29586W, charSequence);
        }
        TextView textView2 = this.f29591a0;
        if (textView2 != null && textView2.getId() == i) {
            C1399s0.m37175j0(this.f29591a0, charSequence);
        }
    }

    @Override
    public void mo9612n1(int i) {
        setHeaderOffset(getTopOffset());
    }

    public void m10043n2(AbstractC9323v4<?> v4Var) {
        this.f29598d1 = false;
        if (this.f29613r0) {
            this.f29578S.setVisibility(0);
        }
        View view = this.f29580T;
        View view2 = this.f29578S;
        if (view != view2) {
            this.f29578S = view;
            this.f29580T = view2;
            removeView(view2);
            TextView textView = this.f29586W;
            this.f29586W = this.f29591a0;
            this.f29591a0 = textView;
        }
        if (v4Var != null) {
            int P2 = m10098P2(v4Var, true);
            int R2 = m10093R2(v4Var, true);
            if (P2 == 1) {
                this.f29576R.setVisibility(8);
            } else {
                this.f29576R.setButtonFactor(P2);
                this.f29576R.invalidate();
            }
            this.f29576R.setButtonBackground(R2);
            this.f29595c0.m9015o(v4Var.m9437Fe());
        }
        if (this.f29611p0) {
            LinearLayout linearLayout = this.f29572P;
            this.f29572P = this.f29574Q;
            this.f29574Q = linearLayout;
            removeView(linearLayout);
            this.f29611p0 = false;
        }
        int b3 = m10068b3(v4Var, true);
        if (v4Var == null || b3 == 0) {
            this.f29572P.setVisibility(8);
        }
        this.f29582U = null;
        this.f29584V = null;
    }

    public final void m10042n3() {
        invalidate(0, 0, getMeasuredWidth(), this.f29595c0.m9012q() + this.f29595c0.m9008s());
    }

    public void m10041n4(int i, int i2) {
        TextView textView = this.f29586W;
        if (textView != null && textView.getId() == i) {
            this.f29586W.setTextColor(i2);
        }
        TextView textView2 = this.f29591a0;
        if (textView2 != null && textView2.getId() == i) {
            this.f29591a0.setTextColor(i2);
        }
    }

    public boolean m10040o3() {
        return this.f29589Y0;
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onClick(View view) {
        AbstractC9323v4<?> l;
        C9270q1 q1Var = this.f29570O;
        if ((q1Var != null && (q1Var.m9738W() || this.f29570O.m9742S())) || (l = this.f29566M.m9501l()) == null) {
            return;
        }
        if ((!l.m9374Oa() && l.mo418W9() != 0) || (l.m9374Oa() && l.mo8831xa() != 0)) {
            ((AbstractC9201h1) l).mo419J(view.getId(), view);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m10116H3();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f29595c0.m9055L(getMeasuredWidth(), (int) this.f29593b0, getHeightFactor());
            invalidate();
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getTag() != null && (view.getTag() instanceof String)) {
            String str = (String) view.getTag();
            if (!C5070i.m24061i(str)) {
                Toast makeText = Toast.makeText(getContext(), str, 0);
                makeText.setGravity(53, view.getRight(), m10066c3(true) - C1357a0.m37541i(8.0f));
                makeText.show();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m10116H3()) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.f29595c0.m9050Q(motionEvent);
    }

    public void m10039p2() {
        this.f29601f0 = false;
        this.f29602g0 = false;
    }

    public void m10034r2() {
        this.f29598d1 = false;
        this.f29582U = null;
        this.f29584V = null;
        if (this.f29613r0) {
            this.f29578S.setVisibility(0);
        }
        this.f29578S.setAlpha(1.0f);
        this.f29578S.setTranslationX(0.0f);
        removeView(this.f29580T);
        removeView(this.f29574Q);
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (l != null) {
            if (l.mo408A9() == 1) {
                this.f29576R.setVisibility(8);
            } else {
                this.f29576R.setButtonFactor(l.mo408A9());
                this.f29576R.invalidate();
            }
            if (m10068b3(l, true) == 0) {
                this.f29572P.setVisibility(8);
            }
            this.f29595c0.m9023j0(m10083V2(l, true));
        }
        float f = this.f29557D0;
        this.f29593b0 = f;
        this.f29595c0.m9056K((int) f, getHeightFactor());
        if (this.f29554A0) {
            View view = this.f29578S;
            if (view instanceof AbstractC9208i2) {
                ((AbstractC9208i2) view).mo8402i0(getHeightFactor(), getHeightFactor(), getHeightFactor(), false);
            }
        }
        invalidate();
    }

    @Override
    public void requestLayout() {
        if (!this.f29601f0) {
            int i = this.f29603h0;
            if (i == -1) {
                super.requestLayout();
                return;
            }
            int i2 = this.f29604i0;
            if (i2 < i) {
                this.f29604i0 = i2 + 1;
                super.requestLayout();
                return;
            }
            return;
        }
        this.f29602g0 = true;
    }

    public void setBackFactor(float f) {
        if (this.f29592a1 != f) {
            this.f29592a1 = f;
            this.f29576R.setColor(this.f29573P0.m18909a(f));
        }
    }

    public void setBackgroundHeight(int i) {
        float f = i;
        if (this.f29593b0 != f) {
            this.f29593b0 = f;
            this.f29595c0.m9056K(i, getHeightFactor());
            invalidate();
        }
    }

    public void setHeaderDisabled(boolean z) {
        if (this.f29600e1 != z) {
            this.f29600e1 = z;
            setVisibility(z ? 4 : 0);
        }
    }

    public void setOverlayColor(int i) {
        if (this.f29610o0 != i) {
            this.f29610o0 = i;
            setWillNotDraw(Color.alpha(i) <= 0);
            invalidate();
        }
    }

    public void setTitle(AbstractC9323v4<?> v4Var) {
        int J9;
        if (this.f29568N) {
            this.f29566M.m9515A(v4Var);
        }
        m10106M2(v4Var);
        if (v4Var.mo418W9() != this.f29572P.getId()) {
            this.f29572P.removeAllViews();
            this.f29572P.setId(v4Var.mo418W9());
            if (v4Var.mo418W9() != 0) {
                ((AbstractC9201h1) v4Var).mo414p0(v4Var.mo418W9(), this, this.f29572P);
                this.f29572P.setVisibility(0);
                int i = 0;
                for (int i2 = 0; i2 < this.f29572P.getChildCount(); i2++) {
                    i += this.f29572P.getChildAt(i2).getLayoutParams().width;
                }
                View view = this.f29578S;
                if (view == this.f29586W) {
                    m10051j4(view, v4Var, i, getCurrentHeaderOffset());
                }
            } else {
                this.f29572P.setVisibility(8);
                View view2 = this.f29578S;
                if (view2 == this.f29586W) {
                    m10051j4(view2, v4Var, 0, getCurrentHeaderOffset());
                }
            }
        }
        View G9 = v4Var.mo8869G9();
        if (G9 != null && (G9 instanceof AbstractC9208i2)) {
            float Z2 = m10072Z2(v4Var.mo8865M9());
            if (Z2 > 0.0f) {
                ((AbstractC9208i2) G9).mo8402i0(Z2, Z2, Z2, false);
            }
        }
        if (v4Var.mo408A9() != 1) {
            this.f29576R.setButtonFactor(v4Var.mo408A9());
            this.f29576R.setVisibility(0);
            if (v4Var.mo9472B9() != 0) {
                this.f29576R.setBackgroundResource(v4Var.mo9472B9());
            }
            this.f29576R.setColor(C11524j.m228N(v4Var.mo9375O9()));
        } else {
            this.f29576R.setVisibility(8);
        }
        this.f29576R.setColor(v4Var.mo9383N9());
        if (v4Var.mo8869G9() != null) {
            View G92 = v4Var.mo8869G9();
            if (G92 instanceof C9351w2) {
                C9351w2 w2Var = (C9351w2) G92;
                w2Var.setTextColor(v4Var.m9367P9());
                w2Var.setTriangleColor(v4Var.mo9383N9());
            } else if (G92 instanceof C9279r) {
                ((C9279r) G92).setTextColorId(v4Var.mo9360Q9());
            }
        } else {
            this.f29586W.setTextColor(v4Var.m9367P9());
        }
        setBackgroundHeight(v4Var.mo8865M9());
        if (!(this.f29570O == null || (J9 = v4Var.mo9413J9()) == 0)) {
            C9290s0 H = this.f29570O.m9759H();
            H.m9618k(0, J9);
            H.m9622g(getHeightFactor(), 0.0f, 1.0f, false, false);
        }
        this.f29595c0.m9023j0(v4Var.m9406K9());
        float f = 1.0f;
        this.f29595c0.m9007s0(v4Var.mo9416Ie() ? 1.0f : 0.0f);
        RunnableC9355x0 x0Var = this.f29595c0;
        if (!v4Var.mo9423He()) {
            f = 0.0f;
        }
        x0Var.m9014o0(f);
        if (v4Var.mo9386Me()) {
            this.f29578S.setTranslationY(-C4896n.m24478e());
            this.f29595c0.m9026i(0.0f);
        }
        v4Var.m9218l9();
    }

    public void setTranslation(float f) {
        this.f29588X0 = f;
        if (this.f29614s0) {
            f = 1.0f - f;
        }
        boolean z = false;
        if (this.f29554A0) {
            float f2 = this.f29557D0 + (this.f29558E0 * f);
            this.f29593b0 = f2;
            float e = (f2 - C4896n.m24478e()) / C4896n.m24475h();
            this.f29595c0.m9056K((int) this.f29593b0, e);
            View view = this.f29580T;
            if (view instanceof AbstractC9208i2) {
                ((AbstractC9208i2) view).mo8402i0(e, this.f29556C0, this.f29555B0, false);
            }
            View view2 = this.f29578S;
            if (view2 instanceof AbstractC9208i2) {
                ((AbstractC9208i2) view2).mo8402i0(e, this.f29555B0, this.f29556C0, false);
            }
            int i = this.f29559F0;
            if (i != 0) {
                C9290s0 s0Var = this.f29561H0;
                float f3 = this.f29560G0 ? 1.0f - f : f;
                if (i != 1) {
                    z = true;
                }
                s0Var.m9619j(e, f3, z);
                if (this.f29612q0 == 2) {
                    float Z2 = m10072Z2(this.f29614s0 ? this.f29557D0 : this.f29557D0 + this.f29558E0);
                    C9290s0 s0Var2 = this.f29561H0;
                    s0Var2.setTranslationY(s0Var2.getTranslationY() - ((C4896n.m24478e() * Z2) * (1.0f - e)));
                }
            }
        } else if (this.f29559F0 == 1) {
            this.f29561H0.m9619j(m10072Z2(this.f29557D0), this.f29560G0 ? 1.0f - f : f, false);
        }
        int i2 = this.f29612q0;
        if (i2 == 1) {
            if (C4403w.m27984G2()) {
                if (this.f29614s0) {
                    this.f29578S.setTranslationX(this.f29594b1 * f);
                    this.f29580T.setTranslationX((-this.f29594b1) * (1.0f - f));
                } else {
                    this.f29578S.setTranslationX((-this.f29594b1) * f);
                    this.f29580T.setTranslationX(this.f29594b1 * (1.0f - f));
                }
            } else if (this.f29614s0) {
                this.f29578S.setTranslationX((-this.f29594b1) * f);
                this.f29580T.setTranslationX(this.f29594b1 * (1.0f - f));
            } else {
                this.f29578S.setTranslationX(this.f29594b1 * f);
                this.f29580T.setTranslationX((-this.f29594b1) * (1.0f - f));
            }
            this.f29578S.setAlpha(1.0f - f);
            this.f29580T.setAlpha(f);
        } else if (i2 == 2) {
            if (this.f29614s0) {
                this.f29578S.setTranslationY((-(C4896n.m24478e() + getTopOffset())) * f);
                this.f29580T.setTranslationY(this.f29596c1 * (1.0f - f));
                AbstractC9323v4<?> v4Var = this.f29582U;
                if (v4Var != null) {
                    v4Var.mo9435G8(f);
                }
            } else {
                this.f29578S.setTranslationY(this.f29596c1 * f);
                float f4 = 1.0f - f;
                this.f29580T.setTranslationY(-((C4896n.m24478e() + getTopOffset()) * f4));
                AbstractC9323v4<?> v4Var2 = this.f29584V;
                if (v4Var2 != null) {
                    v4Var2.mo9435G8(f4);
                }
            }
            this.f29578S.setAlpha(1.0f - f);
            this.f29580T.setAlpha(f);
        } else if (i2 == 3) {
            this.f29578S.setAlpha(1.0f - f);
            this.f29580T.setAlpha(f);
        }
        if (this.f29619x0) {
            if (this.f29620y0) {
                this.f29572P.setAlpha(1.0f - f);
                if (this.f29612q0 == 2) {
                    this.f29572P.setTranslationY((this.f29614s0 ? -(C4896n.m24478e() + getTopOffset()) : this.f29596c1) * f);
                }
            }
            if (this.f29621z0) {
                this.f29574Q.setAlpha(f);
                if (this.f29612q0 == 2) {
                    this.f29574Q.setTranslationY(this.f29614s0 ? this.f29596c1 * (1.0f - f) : -((C4896n.m24478e() + getTopOffset()) * (1.0f - f)));
                }
            }
        }
        if (!this.f29615t0) {
            float f5 = this.f29616u0;
            float f6 = this.f29617v0;
            if (f5 != f6) {
                this.f29576R.setFactor(f5 + ((f6 - f5) * f));
            }
        } else if (this.f29618w0) {
            this.f29576R.setAlpha(f);
            if (this.f29612q0 == 2) {
                this.f29576R.setTranslationY((-(C4896n.m24478e() + getTopOffset())) * (1.0f - f));
            }
            this.f29576R.setTranslationX(this.f29580T.getTranslationX());
        } else {
            this.f29576R.setAlpha(1.0f - f);
            if (this.f29612q0 == 2) {
                this.f29576R.setTranslationY((C4896n.m24478e() + getTopOffset()) * f);
            }
            this.f29576R.setTranslationX(this.f29578S.getTranslationX());
        }
        if (this.f29559F0 == 2) {
            this.f29561H0.setFactor(f);
        }
        if (this.f29562I0) {
            this.f29595c0.m9023j0(this.f29563J0.m18909a(f));
            if (this.f29590Z0 == 2) {
                if (this.f29614s0) {
                    this.f29595c0.m9013p0(f, this.f29563J0.m18909a(1.0f));
                } else {
                    this.f29595c0.m9013p0(1.0f - f, this.f29563J0.m18909a(0.0f));
                }
            }
        }
        if (this.f29564K0) {
            int a = this.f29569N0.m18909a(f);
            int i3 = this.f29565L0;
            if (i3 == 1) {
                ((TextView) this.f29578S).setTextColor(a);
            } else if (i3 == 2) {
                ((C9351w2) this.f29578S).setTextColor(a);
            } else if (i3 == 3) {
                ((AbstractC9321v2) this.f29578S).setTextColor(a);
            }
            int i4 = this.f29567M0;
            if (i4 == 1) {
                ((TextView) this.f29580T).setTextColor(a);
            } else if (i4 == 2) {
                ((C9351w2) this.f29580T).setTextColor(a);
            } else if (i4 == 3) {
                ((AbstractC9321v2) this.f29580T).setTextColor(a);
            }
        }
        if (this.f29571O0) {
            int a2 = this.f29573P0.m18909a(f);
            this.f29576R.setColor(a2);
            if (this.f29564K0) {
                if (this.f29565L0 == 2) {
                    ((C9351w2) this.f29578S).setTriangleColor(a2);
                }
                if (this.f29567M0 == 2) {
                    ((C9351w2) this.f29580T).setTriangleColor(a2);
                }
            }
        }
        if (this.f29581T0) {
            this.f29595c0.m9007s0(this.f29583U0 ? f : 1.0f - f);
        }
        if (this.f29585V0) {
            this.f29595c0.m9014o0(this.f29587W0 ? f : 1.0f - f);
        }
        if (Build.VERSION.SDK_INT >= 21 && this.f29577R0) {
            this.f29575Q0.setStatusBarColor(this.f29579S0.m18909a(f));
        }
        if (this.f29554A0 || this.f29562I0 || this.f29581T0 || this.f29571O0) {
            invalidate();
        }
        if (this.f29564K0) {
            if (this.f29565L0 == 2) {
                this.f29578S.invalidate();
            }
            if (this.f29567M0 == 2) {
                this.f29580T.invalidate();
            }
        }
    }

    public void m10030t2(boolean z, Runnable runnable) {
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (!this.f29589Y0 && l != null && l.m9382Na()) {
            this.f29589Y0 = true;
            this.f29588X0 = 0.0f;
            m10102N3(l, 2, 0, false, z, runnable);
        }
    }

    public void m10028u2() {
        m10027v2(false, true);
    }

    public void m10027v2(boolean z, boolean z2) {
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (!this.f29589Y0 && l != null && l.m9374Oa()) {
            this.f29589Y0 = true;
            this.f29588X0 = 0.0f;
            if (z && (l instanceof AbstractC9174d2)) {
                ((AbstractC9174d2) l).mo8837u5(-1);
            }
            m10102N3(l, 1, 0, false, z2, null);
        }
    }

    public void m10026v3() {
        this.f29601f0 = false;
        if (this.f29602g0) {
            this.f29602g0 = false;
            requestLayout();
        }
    }

    public boolean m10025w3() {
        return this.f29597d0;
    }

    public final void m10023x3(MotionEvent motionEvent) {
        AbstractC9323v4<?> v4Var;
        C9312u1 u1Var;
        C9270q1 q1Var = this.f29570O;
        if (q1Var != null) {
            v4Var = q1Var.m9763F();
        } else {
            v4Var = (!this.f29568N || (u1Var = this.f29566M) == null || u1Var.m9496q()) ? null : this.f29566M.m9501l();
        }
        if (v4Var != null && m10098P2(v4Var, true) == 3) {
            if (v4Var.m9348S9() || v4Var.mo9263ec()) {
                v4Var.mo9397La();
            }
        }
    }

    public void m10021y3(td.AbstractC9323v4<?> r23, td.AbstractC9323v4<?> r24, boolean r25, int r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: td.View$OnClickListenerC9170d1.m10021y3(td.v4, td.v4, boolean, int, float):void");
    }

    public final void m10020z2(View view) {
        int currentHeaderOffset = getCurrentHeaderOffset();
        if (view instanceof AbstractC9173c) {
            ((AbstractC9173c) view).mo9775k0(this, currentHeaderOffset);
        } else if (view instanceof C9351w2) {
            C1399s0.m37155t0(view, C1357a0.m37541i(15.0f) + currentHeaderOffset);
        } else {
            C1399s0.m37155t0(view, currentHeaderOffset);
        }
    }

    public void m10019z3() {
        AbstractC9323v4<?> l = this.f29566M.m9501l();
        if (!this.f29589Y0 && l != null && !l.m9366Pa() && Color.alpha(this.f29610o0) <= 0) {
            this.f29589Y0 = true;
            l.m9231j9();
            this.f29588X0 = 1.0f;
            m10102N3(l, 2, 0, true, true, null);
        }
    }
}
