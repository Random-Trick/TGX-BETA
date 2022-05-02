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
    public static boolean f29556f1 = true;
    public boolean f29557A0;
    public float f29558B0;
    public float f29559C0;
    public float f29560D0;
    public float f29561E0;
    public int f29562F0;
    public boolean f29563G0;
    public C9290s0 f29564H0;
    public boolean f29565I0;
    public C6812c f29566J0;
    public boolean f29567K0;
    public int f29568L0;
    public C9312u1 f29569M;
    public int f29570M0;
    public boolean f29571N;
    public C6812c f29572N0;
    public C9270q1 f29573O;
    public boolean f29574O0;
    public LinearLayout f29575P;
    public C6812c f29576P0;
    public LinearLayout f29577Q;
    public Window f29578Q0;
    public View$OnClickListenerC9150b f29579R;
    public boolean f29580R0;
    public View f29581S;
    public C6812c f29582S0;
    public View f29583T;
    public boolean f29584T0;
    public AbstractC9323v4<?> f29585U;
    public boolean f29586U0;
    public AbstractC9323v4<?> f29587V;
    public boolean f29588V0;
    public TextView f29589W;
    public boolean f29590W0;
    public float f29591X0;
    public boolean f29592Y0;
    public int f29593Z0;
    public TextView f29594a0;
    public float f29595a1;
    public float f29596b0;
    public float f29597b1;
    public RunnableC9355x0 f29598c0;
    public float f29599c1;
    public boolean f29600d0;
    public boolean f29603e1;
    public boolean f29604f0;
    public boolean f29605g0;
    public int f29607i0;
    public View.OnClickListener f29608j0;
    public View.OnClickListener f29609k0;
    public C11537v f29610l0;
    public C9207i1 f29611m0;
    public View.OnClickListener f29612n0;
    public int f29613o0;
    public boolean f29614p0;
    public int f29615q0;
    public boolean f29616r0;
    public boolean f29617s0;
    public boolean f29618t0;
    public float f29619u0;
    public float f29620v0;
    public boolean f29621w0;
    public boolean f29622x0;
    public boolean f29623y0;
    public boolean f29624z0;
    public int f29602e0 = -1;
    public int f29606h0 = -1;
    public boolean f29601d1 = false;

    public class C9171a extends ViewOutlineProvider {
        public C9171a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            Rect bounds = View$OnClickListenerC9170d1.this.f29598c0.getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            outline.setRect(i, i2, bounds.right, View$OnClickListenerC9170d1.this.f29598c0.m9006t() + i2 + View$OnClickListenerC9170d1.this.getCurrentHeaderOffset());
            outline.setAlpha(0.0f);
        }
    }

    public class C9172b extends AnimatorListenerAdapter {
        public final boolean f29626a;
        public final int f29627b;
        public final AbstractC9323v4 f29628c;
        public final Runnable f29629d;

        public C9172b(boolean z, int i, AbstractC9323v4 v4Var, Runnable runnable) {
            this.f29626a = z;
            this.f29627b = i;
            this.f29628c = v4Var;
            this.f29629d = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!this.f29626a) {
                int i = this.f29627b;
                if (i == 1) {
                    this.f29628c.m9338Tb();
                    this.f29628c.mo8830yc();
                } else if (i == 2) {
                    this.f29628c.m9346Sb();
                } else if (i == 3) {
                    this.f29628c.m9352Rb();
                }
            } else {
                int i2 = this.f29627b;
                if (i2 == 2) {
                    this.f29628c.mo9445Ee(true);
                } else if (i2 == 3) {
                    this.f29628c.m9452De(true);
                }
            }
            View$OnClickListenerC9170d1.this.m10042n2(this.f29628c);
            View$OnClickListenerC9170d1.this.f29598c0.m9045V();
            View$OnClickListenerC9170d1.this.f29593Z0 = 0;
            View$OnClickListenerC9170d1.this.f29592Y0 = false;
            Runnable runnable = this.f29629d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public interface AbstractC9173c {
        void mo9774k0(View$OnClickListenerC9170d1 d1Var, int i);
    }

    public View$OnClickListenerC9170d1(Context context) {
        super(context);
        View$OnClickListenerC9150b bVar = new View$OnClickListenerC9150b(context);
        this.f29579R = bVar;
        bVar.setParentHeader(this);
        View$OnClickListenerC9150b bVar2 = this.f29579R;
        bVar2.setOnClickListener(bVar2);
        this.f29579R.setVisibility(8);
        this.f29579R.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37544i(56.0f), C4896n.m24479e(), (C4403w.m27986G2() ? 5 : 3) | 48));
        addView(this.f29579R);
        LinearLayout C2 = m10128C2(context);
        this.f29575P = C2;
        addView(C2);
        this.f29589W = m10108L2(context);
        this.f29596b0 = C4896n.m24479e();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C9171a());
        }
    }

    public static C9279r m10124E2(Context context, int i) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, C1357a0.m37544i(53.0f), (C4403w.m27986G2() ? 5 : 3) | 48);
        if (C4403w.m27986G2()) {
            t1.rightMargin = C1357a0.m37544i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37544i(68.0f);
        }
        C9279r rVar = new C9279r(context);
        rVar.m9650y(i);
        rVar.setLayoutParams(t1);
        return rVar;
    }

    public static HeaderEditText m10121F2(ViewGroup viewGroup, AbstractC9323v4<?> v4Var) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37544i(53.0f), (C4403w.m27986G2() ? 5 : 3) | 48);
        if (C4403w.m27986G2()) {
            t1.rightMargin = C1357a0.m37544i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37544i(68.0f);
        }
        HeaderEditText A = HeaderEditText.m14153A(viewGroup);
        A.setTextColor(C11524j.m217S0());
        v4Var.m9178r8(A, R.id.theme_color_textSelectionHighlight);
        A.mo8255s();
        v4Var.m9119z8(A, R.id.theme_color_text);
        A.setHintTextColor(C11524j.m213U0());
        v4Var.m9170s8(A, R.id.theme_color_textLight);
        A.setLayoutParams(t1);
        return A;
    }

    public static void m10120F3(ViewGroup viewGroup) {
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

    public static void m10117G3(View view) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        if (view != null && (i = (layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams()).leftMargin) != (i2 = layoutParams.rightMargin)) {
            layoutParams.rightMargin = i;
            layoutParams.leftMargin = i2;
            C1399s0.m37148y0(view);
        }
    }

    public static HeaderEditText m10111J2(ViewGroup viewGroup, boolean z, AbstractC9323v4<?> v4Var) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C1357a0.m37544i(53.0f), (C4403w.m27986G2() ? 5 : 3) | 48);
        if (C4403w.m27986G2()) {
            t1.rightMargin = C1357a0.m37544i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37544i(68.0f);
        }
        HeaderEditText B = HeaderEditText.m14152B(viewGroup, z);
        B.setTextColor(C11524j.m228N(R.id.theme_color_headerText));
        if (v4Var != null) {
            v4Var.m9178r8(B, R.id.theme_color_textSelectionHighlight);
        }
        B.mo8255s();
        if (v4Var != null) {
            v4Var.m9119z8(B, R.id.theme_color_headerText);
        }
        B.setHintTextColor(C5064d.m24132a(C11524j.f36591a, C11524j.m161p0()));
        if (v4Var != null) {
            v4Var.m9170s8(B, R.id.theme_color_headerText).m85e(C11524j.f36591a);
        }
        B.setLayoutParams(t1);
        return B;
    }

    public static int m10097P2(AbstractC9323v4<?> v4Var, boolean z) {
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

    public static int m10094Q2(AbstractC9323v4<?> v4Var, boolean z) {
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

    public static int m10092R2(AbstractC9323v4<?> v4Var, boolean z) {
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

    public static int m10088T2(boolean z) {
        return z ? C4896n.m24477g() + getTopOffset() : C4896n.m24477g();
    }

    public static int m10085U2(AbstractC9323v4<?> v4Var) {
        if (v4Var == null) {
            return 0;
        }
        return v4Var.mo9413J9();
    }

    public static void m10084U3(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                m10084U3((ViewGroup) childAt, i);
            } else if (childAt instanceof C9310u0) {
                childAt.invalidate();
            }
        }
    }

    public static int m10082V2(AbstractC9323v4<?> v4Var, boolean z) {
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

    public static int m10077X2(AbstractC9323v4<?> v4Var) {
        return v4Var == null ? C4896n.m24479e() : v4Var.mo8865M9();
    }

    public static int m10074Y2(AbstractC9323v4<?> v4Var, boolean z) {
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

    public static float m10071Z2(float f) {
        return (f - C4896n.m24479e()) / C4896n.m24476h();
    }

    public static void m10069a4(View view, int i, int i2) {
        if (view instanceof AbstractC9165c2) {
            ((AbstractC9165c2) view).mo8255s();
        }
        if (view instanceof HeaderEditText) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i3 = (C4403w.m27986G2() ? 5 : 3) | 48;
            boolean z = true;
            boolean z2 = layoutParams.gravity != i3;
            layoutParams.gravity = i3;
            if (C4403w.m27986G2()) {
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
                C1399s0.m37148y0(view);
            }
        }
    }

    public static int m10067b3(AbstractC9323v4<?> v4Var, boolean z) {
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

    public static void m10066b4(View view, int i, int i2) {
        if (view instanceof C9279r) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i3 = (C4403w.m27986G2() ? 5 : 3) | 48;
            boolean z = true;
            boolean z2 = layoutParams.gravity != i3;
            layoutParams.gravity = i3;
            if (C4403w.m27986G2()) {
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
                C1399s0.m37148y0(view);
            }
        }
    }

    public static int m10065c3(boolean z) {
        return z ? C4896n.m24479e() + getTopOffset() : C4896n.m24479e();
    }

    public static int m10063d3(boolean z, boolean z2) {
        return z ? m10088T2(z2) : m10065c3(z2);
    }

    public static int m10061e3(AbstractC9323v4<?> v4Var, boolean z) {
        if (v4Var == null) {
            return 1275068416;
        }
        return v4Var.m9306Y9();
    }

    public int getCurrentHeaderOffset() {
        int i = this.f29602e0;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private float getHeightFactor() {
        return (this.f29596b0 - C4896n.m24479e()) / C4896n.m24476h();
    }

    public static int getPlayerSize() {
        return C4896n.m24480d();
    }

    private C11537v getThemeListeners() {
        if (this.f29610l0 == null) {
            this.f29610l0 = new C11537v();
        }
        return this.f29610l0;
    }

    public static int getTopOffset() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1357a0.m37538o();
        }
        return 0;
    }

    public static int m10054h3(AbstractC9323v4<?> v4Var) {
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

    public static int m10052i3(AbstractC9323v4<?> v4Var) {
        if (v4Var.m9390Ma()) {
            return 3;
        }
        if (v4Var.m9374Oa()) {
            return 1;
        }
        return v4Var.m9382Na() ? 2 : 0;
    }

    public static void m10050j4(View view, AbstractC9323v4<?> v4Var, int i, int i2) {
        boolean z;
        if (view != null && v4Var != null) {
            int i3 = C1357a0.m37544i(15.0f) + i2;
            if (v4Var.mo408A9() != 1) {
                if (C4403w.m27986G2()) {
                    z = C1399s0.m37180i0((FrameLayout.LayoutParams) view.getLayoutParams(), i, i3, C1357a0.m37544i(68.0f), 0);
                } else {
                    z = C1399s0.m37180i0((FrameLayout.LayoutParams) view.getLayoutParams(), C1357a0.m37544i(68.0f), i3, i, 0);
                }
            } else if (C4403w.m27986G2()) {
                z = C1399s0.m37180i0((FrameLayout.LayoutParams) view.getLayoutParams(), i, i3, C1357a0.m37544i(18.0f), 0);
            } else {
                z = C1399s0.m37180i0((FrameLayout.LayoutParams) view.getLayoutParams(), C1357a0.m37544i(18.0f), i3, i, 0);
            }
            if (z) {
                C1399s0.m37148y0(view);
            }
        }
    }

    public void m10037p3(View view) {
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (l instanceof AbstractC5153x0) {
            m10104M3(((AbstractC5153x0) l).mo23798N4());
        }
    }

    public static boolean m10036p4(AbstractC9323v4<?> v4Var) {
        return v4Var == null || v4Var.mo9423He();
    }

    public void m10035q3(View view) {
        ((C6924j2) view.getParent().getParent()).m18408y2(true);
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (l instanceof AbstractC9213j1) {
            ((AbstractC9213j1) l).mo8864N0(view.getId());
        }
    }

    public static boolean m10034q4(AbstractC9323v4<?> v4Var) {
        return v4Var == null || v4Var.mo9416Ie();
    }

    public void m10032r3(View view) {
        ((C6924j2) view.getParent().getParent()).m18408y2(true);
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (l instanceof AbstractC5153x0) {
            ((AbstractC5153x0) l).mo23797Z2(view.getId());
        }
    }

    public static int m10031r4() {
        return m10023x2(-1);
    }

    public void m10030s3(float f, int i, AbstractC9323v4 v4Var, ValueAnimator valueAnimator) {
        float a = f - (C2057b.m35738a(valueAnimator) * f);
        setTranslation(a);
        if (i == 2) {
            v4Var.m9410Jd(1.0f - a, true);
        }
    }

    private void setHeaderOffset(int i) {
        if (this.f29602e0 != i) {
            this.f29602e0 = i;
            C1399s0.m37158t0(this.f29579R, i);
            C1399s0.m37158t0(this.f29575P, i);
            C1399s0.m37158t0(this.f29577Q, i);
            C1399s0.m37158t0(this.f29589W, C1357a0.m37544i(15.0f) + i);
            C1399s0.m37158t0(this.f29594a0, C1357a0.m37544i(15.0f) + i);
            C9207i1 i1Var = this.f29611m0;
            if (i1Var != null) {
                i1Var.setTranslationY(getTranslationY() + getCurrentHeaderOffset());
            }
            View view = this.f29581S;
            if (view != this.f29589W) {
                m10019z2(view);
            }
            View view2 = this.f29583T;
            if (!(view2 == null || view2 == this.f29594a0)) {
                m10019z2(view2);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
            if (this.f29571N) {
                setLayoutParams(FrameLayoutFix.m18007t1(-1, m10065c3(true) + this.f29598c0.m9008s(), 48));
            } else {
                setLayoutParams(FrameLayoutFix.m18007t1(-1, C4896n.m24477g() + getTopOffset() + this.f29598c0.m9008s() + C4896n.m24479e(), 48));
            }
        }
    }

    public void m10028t3(float f, float f2, int i, AbstractC9323v4 v4Var, ValueAnimator valueAnimator) {
        float a = f + (f2 * C2057b.m35738a(valueAnimator));
        setTranslation(a);
        if (i == 2) {
            v4Var.m9410Jd(1.0f - a, false);
        }
    }

    public static int m10023x2(int i) {
        return C5064d.m24130c(i, 855638016);
    }

    public static int m10021y2() {
        return m10023x2(C11524j.m167m0());
    }

    public C9310u0 m10133A2(int i, int i2, int i3, AbstractC9323v4<?> v4Var, int i4, int i5, View.OnClickListener onClickListener) {
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

    public void m10132A3(int i, boolean z) {
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (!this.f29592Y0 && l != null && !l.m9374Oa() && !l.m9382Na()) {
            this.f29592Y0 = true;
            l.m9225k9();
            this.f29591X0 = 1.0f;
            m10101N3(l, 1, i, true, z, null);
        }
    }

    public C9310u0 m10131B2(int i, int i2, int i3, AbstractC9323v4<?> v4Var, int i4, View.OnClickListener onClickListener) {
        return m10133A2(i, i2, i3, v4Var, i4, C11532q.m113b(), onClickListener);
    }

    public void m10130B3() {
        this.f29604f0 = true;
    }

    public final LinearLayout m10128C2(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, C4896n.m24479e(), (C4403w.m27986G2() ? 3 : 5) | 48);
        t1.topMargin = getCurrentHeaderOffset();
        linearLayout.setLayoutParams(t1);
        return linearLayout;
    }

    public final void m10127C3() {
        AbstractC9323v4<?> v4Var;
        AbstractC9323v4<?> v4Var2;
        int i;
        int i2;
        AbstractC9323v4<?> v4Var3;
        boolean z = this.f29617s0;
        if (z) {
            v4Var2 = this.f29585U;
            v4Var = this.f29587V;
        } else {
            v4Var = this.f29585U;
            v4Var2 = this.f29587V;
        }
        AbstractC9323v4<?> v4Var4 = this.f29585U;
        boolean z2 = false;
        boolean z3 = v4Var4 != null && v4Var4.mo9386Me() && !z;
        AbstractC9323v4<?> v4Var5 = this.f29587V;
        boolean z4 = v4Var5 != null && v4Var5.mo9386Me() && z;
        boolean z5 = v4Var2 == null && m10052i3(v4Var) != 0;
        if (this.f29565I0) {
            if (!z5 || z) {
                i = z4 ? C5064d.m24131b(0, C11524j.m167m0()) : m10082V2(this.f29587V, !z5);
            } else {
                i = m10082V2(v4Var, true);
            }
            if (!z5 || !z) {
                i2 = z3 ? C5064d.m24131b(0, C11524j.m167m0()) : m10082V2(this.f29585U, !z5);
            } else {
                i2 = m10082V2(v4Var, true);
            }
            this.f29566J0.m18909b(i, i2);
        } else {
            this.f29598c0.m9023j0(m10082V2(this.f29585U, true));
            i2 = 0;
            i = 0;
        }
        if (this.f29567K0) {
            if (!z5 || z) {
                z2 = !z5;
            }
            int Y2 = m10074Y2(v4Var, z2);
            int Y22 = (!z5 || !z) ? m10074Y2(v4Var2, !z5) : m10074Y2(v4Var, true);
            int i3 = z ? Y2 : Y22;
            if (z) {
                Y2 = Y22;
            }
            this.f29572N0.m18909b(i3, Y2);
            View view = this.f29581S;
            if (view instanceof AbstractC9168d) {
                ((AbstractC9168d) view).mo9846G0(i3, Y2);
            }
            View view2 = this.f29583T;
            if (view2 instanceof AbstractC9168d) {
                ((AbstractC9168d) view2).mo9846G0(i3, Y2);
            }
        }
        int Y23 = m10074Y2(this.f29585U, true);
        TextView textView = this.f29589W;
        if (textView != null && (!this.f29567K0 || this.f29581S != textView)) {
            textView.setTextColor(Y23);
        }
        TextView textView2 = this.f29594a0;
        if (textView2 != null && (!this.f29567K0 || this.f29583T != textView2)) {
            textView2.setTextColor(Y23);
        }
        if (this.f29574O0) {
            int Q2 = m10094Q2(v4Var, !z5);
            int Q22 = z5 ? m10094Q2(v4Var, true) : m10094Q2(v4Var2, !z5);
            int i4 = z ? Q2 : Q22;
            if (z) {
                Q2 = Q22;
            }
            this.f29576P0.m18909b(i4, Q2);
        } else {
            this.f29579R.setColor(m10094Q2(this.f29585U, true));
        }
        setTranslation(this.f29591X0);
        if (this.f29565I0 && this.f29591X0 == 0.0f && (v4Var3 = this.f29587V) != null && v4Var3.mo9386Me()) {
            RunnableC9355x0 filling = getFilling();
            if (z) {
                i2 = i;
            }
            filling.m9023j0(i2);
        }
    }

    public void m10123E3(AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2) {
        int W9;
        C9270q1 q1Var = this.f29573O;
        boolean z = false;
        boolean z2 = q1Var != null && q1Var.m9741S();
        if (z2) {
            if (this.f29601d1) {
                m10127C3();
            } else {
                this.f29598c0.m9023j0(v4Var.m9406K9());
            }
            C9290s0 s0Var = this.f29564H0;
            if (s0Var != null) {
                s0Var.invalidate();
            }
            m10041n3();
        }
        int Q2 = m10094Q2(v4Var, true);
        int b3 = m10067b3(v4Var, true);
        if (b3 != 0) {
            m10081V3(v4Var, b3, Q2);
        }
        if (v4Var.m9366Pa() && (W9 = v4Var.mo418W9()) != 0) {
            m10081V3(v4Var, W9, v4Var.mo9383N9());
        }
        int la2 = v4Var.mo415la();
        if (la2 != 0) {
            m10081V3(v4Var, la2, v4Var.m9244ha());
        }
        int xa = v4Var.mo8831xa();
        if (xa != 0) {
            m10081V3(v4Var, xa, v4Var.m9146va());
        }
        C9290s0 s0Var2 = this.f29564H0;
        if (s0Var2 != null) {
            s0Var2.invalidate();
        }
        if (v4Var2 != null) {
            z = z2;
        }
        if (!z || v4Var2.mo9375O9() == v4Var.mo9375O9()) {
            this.f29579R.setColor(Q2);
        }
        if (!z || v4Var2.mo9360Q9() == v4Var.mo9360Q9()) {
            int Y2 = m10074Y2(v4Var, true);
            TextView textView = this.f29589W;
            if (textView != null) {
                textView.setTextColor(Y2);
            }
            TextView textView2 = this.f29594a0;
            if (textView2 != null) {
                textView2.setTextColor(Y2);
            }
        }
        if (!z || v4Var2.mo9398L9() == v4Var.mo9398L9()) {
            this.f29598c0.m9023j0(m10082V2(v4Var, true));
            m10041n3();
        }
    }

    public HeaderEditText m10118G2(AbstractC9323v4<?> v4Var) {
        return m10121F2(this, v4Var);
    }

    public final void m10116H2(AbstractC9323v4<?> v4Var, AbstractC9323v4<?> v4Var2, boolean z) {
        AbstractC9201h1 h1Var;
        AbstractC9323v4<?> v4Var3;
        AbstractC9323v4<?> v4Var4;
        if (z) {
            this.f29585U = v4Var2;
            this.f29587V = v4Var;
        } else {
            this.f29585U = v4Var;
            this.f29587V = v4Var2;
        }
        this.f29617s0 = z;
        if (v4Var2 == null) {
            this.f29583T = z ? v4Var.m9441Fa(this) : v4Var.mo8869G9();
        } else {
            AbstractC9323v4<?> v4Var5 = this.f29585U;
            this.f29583T = v4Var5 == null ? null : v4Var5.m9366Pa() ? this.f29585U.m9441Fa(this) : this.f29585U.mo8869G9();
        }
        boolean z2 = true;
        int i = 0;
        if (v4Var2 == null && v4Var.m9259f9()) {
            this.f29615q0 = 0;
            this.f29616r0 = false;
            this.f29583T = this.f29581S;
        } else if (v4Var2 == null || v4Var2.mo9177r9()) {
            this.f29616r0 = false;
            this.f29615q0 = 3;
        } else {
            boolean z3 = this.f29583T != null && v4Var2.m9363Pd() && !v4Var2.m9366Pa() && !v4Var.m9366Pa();
            this.f29616r0 = z3;
            this.f29615q0 = (z3 || !v4Var2.mo9401Ke()) ? 0 : this.f29615q0;
        }
        View view = this.f29583T;
        boolean z4 = view == null;
        if (z4) {
            if (this.f29594a0 == null) {
                this.f29594a0 = m10108L2(getContext());
            }
            this.f29594a0.setId(this.f29585U.mo407R9());
            C1399s0.m37178j0(this.f29594a0, this.f29585U.mo9313X9());
            this.f29583T = this.f29594a0;
        } else {
            m10019z2(view);
        }
        View view2 = this.f29583T;
        if (view2 != this.f29581S) {
            if (view2.getParent() != null) {
                removeView(this.f29583T);
            }
            if (z) {
                addView(this.f29583T, !f29556f1 ? 1 : 0);
            } else {
                addView(this.f29583T, f29556f1 ? 1 : 2);
            }
        }
        if (this.f29616r0) {
            this.f29581S.setVisibility(8);
        }
        int b3 = m10067b3(v4Var, v4Var2 != null);
        int h3 = v4Var2 == null ? m10054h3(v4Var) : m10067b3(v4Var2, true);
        int i2 = z ? h3 : b3;
        if (i2 == 0 || b3 == h3) {
            this.f29614p0 = false;
        } else {
            this.f29614p0 = true;
            if (this.f29577Q == null) {
                this.f29577Q = m10128C2(getContext());
            }
            if (v4Var2 != null || !z ? (v4Var3 = this.f29585U) == null || !v4Var3.m9458D8() : (v4Var4 = this.f29587V) == null || !v4Var4.m9458D8()) {
                z2 = false;
            }
            if (this.f29577Q.getId() != i2 || !z2) {
                this.f29577Q.removeAllViews();
                this.f29577Q.setId(i2);
                if (v4Var2 != null || !z) {
                    h1Var = (AbstractC9201h1) this.f29585U;
                } else {
                    h1Var = (AbstractC9201h1) this.f29587V;
                }
                h1Var.mo414p0(i2, this, this.f29577Q);
            }
            if (z4) {
                int i3 = 0;
                while (i < this.f29577Q.getChildCount()) {
                    View childAt = this.f29577Q.getChildAt(i);
                    if (childAt != null) {
                        i3 += childAt.getLayoutParams().width;
                    }
                    i++;
                }
                i = i3;
            }
            if (this.f29577Q.getParent() != null) {
                removeView(this.f29577Q);
            }
            if (z) {
                addView(this.f29577Q, -1);
            } else {
                addView(this.f29577Q, 3);
            }
        }
        if (z4) {
            m10050j4(this.f29583T, this.f29585U, i, getCurrentHeaderOffset());
        }
    }

    public final boolean m10115H3() {
        return this.f29603e1 || Color.alpha(this.f29613o0) > 0 || getAlpha() == 0.0f || getVisibility() != 0;
    }

    public void m10113I3(int[] r10, java.lang.String[] r11, int[] r12, int r13, boolean r14, td.AbstractC9323v4<?> r15) {
        throw new UnsupportedOperationException("Method not decompiled: td.View$OnClickListenerC9170d1.m10113I3(int[], java.lang.String[], int[], int, boolean, td.v4):void");
    }

    public HeaderEditText m10110K2(boolean z, AbstractC9323v4<?> v4Var) {
        return m10111J2(this, z, v4Var);
    }

    public TextView m10108L2(Context context) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, (C4403w.m27986G2() ? 5 : 3) | 48);
        t1.topMargin = C1357a0.m37544i(15.0f) + getCurrentHeaderOffset();
        C6847b2 b2Var = new C6847b2(context);
        b2Var.setTag(this);
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        b2Var.setHighlightColor(C11524j.m209W0());
        b2Var.setTypeface(C1389o.m37263i());
        b2Var.setGravity(3);
        b2Var.setSingleLine();
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setTextSize(1, 19.0f);
        b2Var.setTextColor(-1);
        b2Var.setLayoutParams(t1);
        return b2Var;
    }

    public final void m10107L3(int[] iArr, String[] strArr, int[] iArr2, View.OnClickListener onClickListener, boolean z, C11537v vVar) {
        int length = iArr == null ? strArr.length : iArr.length;
        int childCount = this.f29611m0.getChildCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (i2 < length) {
                this.f29611m0.m9963g(i2, iArr == null ? i2 : iArr[i2], strArr[i2], iArr2 != null ? iArr2[i2] : 0, onClickListener, vVar);
                i2++;
                i++;
            } else {
                for (int i3 = childCount - 1; i3 >= length; i3--) {
                    this.f29611m0.removeViewAt(i3);
                }
            }
        }
        if (length > this.f29611m0.getChildCount()) {
            while (i2 < length) {
                this.f29611m0.m9969a(iArr == null ? i2 : iArr[i2], strArr[i2], iArr2 != null ? iArr2[i2] : 0, null, onClickListener);
                i2++;
            }
        }
        C6924j2 j2Var = new C6924j2(getContext());
        j2Var.m18045Q1(true);
        j2Var.m18435N2();
        j2Var.setOverlayStatusBar(true);
        j2Var.m18431R2(this.f29611m0);
    }

    public final void m10105M2(AbstractC9323v4<?> v4Var) {
        View G9 = v4Var.mo8869G9();
        if (G9 == null) {
            m10050j4(this.f29589W, v4Var, 0, getCurrentHeaderOffset());
            this.f29589W.setId(v4Var.mo407R9());
            C1399s0.m37178j0(this.f29589W, v4Var.mo9313X9());
            G9 = this.f29589W;
        } else {
            m10019z2(G9);
        }
        View view = this.f29581S;
        if (!(view == null || view == G9)) {
            removeView(view);
        }
        this.f29581S = G9;
        if (G9.getParent() == null) {
            addView(this.f29581S, !f29556f1 ? 1 : 0);
        }
    }

    public final void m10104M3(String[] strArr) {
        if (this.f29611m0 == null) {
            C9207i1 i1Var = new C9207i1(getContext());
            this.f29611m0 = i1Var;
            i1Var.m9968b(null, null);
        }
        if (this.f29609k0 == null) {
            this.f29609k0 = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnClickListenerC9170d1.this.m10032r3(view);
                }
            };
        }
        this.f29611m0.setAnchorMode(1);
        this.f29611m0.setTranslationY(getTranslationY() + getCurrentHeaderOffset());
        m10107L3(null, strArr, null, this.f29609k0, false, getThemeListeners());
    }

    public C9310u0 m10103N1(LinearLayout linearLayout, int i, int i2, int i3, AbstractC9323v4<?> v4Var, int i4) {
        C9310u0 B2 = m10131B2(i, i2, i3, v4Var, i4, this);
        linearLayout.addView(B2, C4403w.m27986G2() ? 0 : -1);
        return B2;
    }

    public C9351w2 m10102N2(Context context, AbstractC9323v4<?> v4Var) {
        if (this.f29608j0 == null) {
            this.f29608j0 = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnClickListenerC9170d1.this.m10037p3(view);
                }
            };
        }
        return m10099O2(context, v4Var, this.f29608j0);
    }

    public final void m10101N3(final AbstractC9323v4<?> v4Var, final int i, int i2, boolean z, boolean z2, Runnable runnable) {
        this.f29593Z0 = i;
        m10020y3(v4Var, null, z, 3, this.f29591X0);
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
            ValueAnimator b = C2057b.m35737b();
            if (z) {
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View$OnClickListenerC9170d1.this.m10030s3(translation, i, v4Var, valueAnimator);
                    }
                });
            } else {
                final float f = 1.0f - translation;
                b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View$OnClickListenerC9170d1.this.m10028t3(translation, f, i, v4Var, valueAnimator);
                    }
                });
            }
            b.setInterpolator(v4Var.mo9176ra());
            b.setDuration(v4Var.mo9189pa());
            b.addListener(bVar);
            v4Var.mo9150ue(b, i, z);
        }
    }

    public C9310u0 m10100O1(LinearLayout linearLayout, int i, int i2, AbstractC9323v4<?> v4Var, int i3, int i4, int i5) {
        C9310u0 A2 = m10133A2(i, i3, i2, v4Var, i4, i5, this);
        linearLayout.addView(A2, C4403w.m27986G2() ? 0 : -1);
        return A2;
    }

    public C9351w2 m10099O2(Context context, AbstractC9323v4<?> v4Var, View.OnClickListener onClickListener) {
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, C1357a0.m37544i(38.0f), (C4403w.m27986G2() ? 5 : 3) | 48);
        t1.topMargin = C1357a0.m37544i(15.0f) + getCurrentHeaderOffset();
        if (C4403w.m27986G2()) {
            t1.rightMargin = C1357a0.m37544i(68.0f);
        } else {
            t1.leftMargin = C1357a0.m37544i(68.0f);
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

    public void m10098O3(AbstractC9323v4<?> v4Var, int i) {
        if (v4Var.m9339Ta()) {
            this.f29579R.setColor(i);
        }
    }

    public void m10096P3(int i, int i2, int i3, int i4) {
        View findViewById;
        View findViewById2;
        if (this.f29575P.getId() == i && (findViewById2 = this.f29575P.findViewById(i2)) != null) {
            findViewById2.setVisibility(i3);
            if (i4 != 0) {
                ((C9310u0) findViewById2).setImageResource(i4);
            }
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29577Q.findViewById(i2)) != null) {
            findViewById.setVisibility(i3);
            if (i4 != 0) {
                ((C9310u0) findViewById).setImageResource(i4);
            }
        }
    }

    public C6882g0 m10095Q1(LinearLayout linearLayout, int i, int i2) {
        C6882g0 g0Var = new C6882g0(getContext());
        g0Var.setId(R.id.menu_btn_clear);
        g0Var.setColorId(i);
        g0Var.setButtonBackground(i2);
        g0Var.setOnClickListener(this);
        linearLayout.addView(g0Var, C4403w.m27986G2() ? 0 : -1);
        return g0Var;
    }

    public void m10093Q3(int i, int i2, AbstractC5918j<C9310u0> jVar) {
        View findViewById;
        View findViewById2;
        if (this.f29575P.getId() == i && (findViewById2 = this.f29575P.findViewById(i2)) != null) {
            jVar.mo1330a((C9310u0) findViewById2);
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29577Q.findViewById(i2)) != null) {
            jVar.mo1330a((C9310u0) findViewById);
        }
    }

    public void m10091R3(int i, int i2, float f) {
        View findViewById;
        View findViewById2;
        if (this.f29575P.getId() == i && (findViewById2 = this.f29575P.findViewById(i2)) != null) {
            findViewById2.setAlpha(f);
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29577Q.findViewById(i2)) != null) {
            findViewById.setAlpha(f);
        }
    }

    public C6882g0 m10090S1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10095Q1(linearLayout, v4Var.mo9375O9(), v4Var.mo9472B9());
    }

    public C9310u0 m10089T1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10133A2(R.id.menu_btn_copy, R.drawable.baseline_content_copy_24, i, v4Var, C1357a0.m37544i(50.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27986G2() ? 0 : -1);
        return A2;
    }

    public void m10087T3(AbstractC9323v4<?> v4Var, int i, float f) {
        if (this.f29575P.getId() == i) {
            int childCount = this.f29575P.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f29575P.getChildAt(i2);
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
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i) {
            int childCount2 = this.f29577Q.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = this.f29577Q.getChildAt(i3);
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
        if (C4403w.m27983H1(i, i2)) {
            int i3 = 5;
            if (C1399s0.m37192c0(this.f29579R, (C4403w.m27986G2() ? 5 : 3) | 48)) {
                C1399s0.m37148y0(this.f29579R);
            }
            if (C1399s0.m37192c0(this.f29575P, (C4403w.m27986G2() ? 3 : 5) | 48)) {
                C1399s0.m37148y0(this.f29575P);
                m10120F3(this.f29575P);
            }
            if (C1399s0.m37192c0(this.f29577Q, (C4403w.m27986G2() ? 3 : 5) | 48)) {
                C1399s0.m37148y0(this.f29577Q);
                m10120F3(this.f29577Q);
            }
            if (C1399s0.m37192c0(this.f29589W, (C4403w.m27986G2() ? 5 : 3) | 48)) {
                m10117G3(this.f29589W);
            }
            TextView textView = this.f29594a0;
            if (!C4403w.m27986G2()) {
                i3 = 3;
            }
            if (C1399s0.m37192c0(textView, i3 | 48)) {
                m10117G3(this.f29594a0);
            }
            C9207i1 i1Var = this.f29611m0;
            if (i1Var != null) {
                i1Var.m9964f();
            }
        }
    }

    public C9310u0 m10086U1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10133A2(R.id.menu_btn_delete, R.drawable.baseline_delete_24, i, v4Var, C1357a0.m37544i(52.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27986G2() ? 0 : -1);
        return A2;
    }

    public C9310u0 m10083V1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10080W1(linearLayout, v4Var, v4Var.mo9375O9());
    }

    public void m10081V3(AbstractC9323v4<?> v4Var, int i, int i2) {
        LinearLayout linearLayout = this.f29575P;
        if (linearLayout != null && linearLayout.getId() == i) {
            m10084U3(this.f29575P, i2);
        }
        LinearLayout linearLayout2 = this.f29577Q;
        if (linearLayout2 != null && linearLayout2.getId() == i) {
            m10084U3(this.f29577Q, i2);
        }
    }

    public C9310u0 m10080W1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 B2 = m10131B2(R.id.menu_btn_done, R.drawable.baseline_check_24, i, v4Var, C1357a0.m37544i(56.0f), this);
        linearLayout.addView(B2, C4403w.m27986G2() ? 0 : -1);
        return B2;
    }

    public void m10079W3(int i, AbstractC9323v4<?> v4Var, float f) {
        if (this.f29575P.getId() == i) {
            v4Var.mo9429H8(this.f29575P, f);
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i) {
            v4Var.mo9429H8(this.f29577Q, f);
        }
    }

    public C9310u0 m10078X1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10133A2(R.id.menu_btn_edit, R.drawable.baseline_edit_24, i, v4Var, C1357a0.m37544i(52.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27986G2() ? 0 : -1);
        return A2;
    }

    public void m10076X3(int i, int i2, AbstractC5918j<View> jVar) {
        View findViewById;
        View findViewById2;
        if (this.f29575P.getId() == i && (findViewById2 = this.f29575P.findViewById(i2)) != null) {
            jVar.mo1330a(findViewById2);
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29577Q.findViewById(i2)) != null) {
            jVar.mo1330a(findViewById);
        }
    }

    public C9310u0 m10075Y1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10072Z1(linearLayout, v4Var, v4Var.mo9375O9());
    }

    public void m10073Y3(AbstractC9323v4<?> v4Var, int i) {
        if (this.f29575P.getId() == i) {
            v4Var.mo9460Ce(i, this.f29575P);
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i) {
            v4Var.mo9460Ce(i, this.f29577Q);
        }
    }

    public C9310u0 m10072Z1(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10133A2(R.id.menu_btn_forward, R.drawable.baseline_forward_24, i, v4Var, C1357a0.m37544i(52.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27986G2() ? 0 : -1);
        return A2;
    }

    public View$OnClickListenerC9195g1 m10070a2(LinearLayout linearLayout) {
        View$OnClickListenerC9195g1 g1Var = new View$OnClickListenerC9195g1(getContext());
        linearLayout.addView(g1Var);
        return g1Var;
    }

    @Override
    public void mo4501a3() {
        C11052v1.m1768b().m1766d(this);
        C4403w.m27990F2(this);
        C1357a0.m37531v(this);
        RunnableC9355x0 x0Var = this.f29598c0;
        if (x0Var != null) {
            x0Var.mo4501a3();
        }
    }

    public C9310u0 m10068b2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10064d2(linearLayout, v4Var, v4Var.mo9375O9());
    }

    public C9310u0 m10064d2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 B2 = m10131B2(R.id.menu_btn_more, R.drawable.baseline_more_vert_24, i, v4Var, C1357a0.m37544i(49.0f), this);
        linearLayout.addView(B2, C4403w.m27986G2() ? 0 : -1);
        return B2;
    }

    public void m10062d4(int i) {
        View findViewById;
        View findViewById2;
        if (this.f29575P.getId() == i && (findViewById2 = this.f29575P.findViewById(R.id.menu_btn_lock)) != null) {
            ((View$OnClickListenerC9195g1) findViewById2).m9984j();
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29577Q.findViewById(R.id.menu_btn_lock)) != null) {
            ((View$OnClickListenerC9195g1) findViewById).m9984j();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (Color.alpha(this.f29613o0) > 0) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f29598c0.m9012q(), C1410y.m37042g(this.f29613o0));
        }
    }

    public void m10060e4(int i, int i2, boolean z, boolean z2) {
        View findViewById;
        View findViewById2;
        if (this.f29575P.getId() == i && (findViewById2 = this.f29575P.findViewById(i2)) != null) {
            ((C6882g0) findViewById2).m18686m(z, z2);
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29577Q.findViewById(i2)) != null) {
            ((C6882g0) findViewById).m18686m(z, z2);
        }
    }

    public C9310u0 m10059f2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 g = m10133A2(R.id.menu_btn_reply, R.drawable.baseline_reply_24, i, v4Var, C1357a0.m37544i(52.0f), C11532q.m113b(), this).m9518g(i);
        linearLayout.addView(g, C4403w.m27986G2() ? 0 : -1);
        return g;
    }

    public void m10058f4(int i, int i2, boolean z) {
        View findViewById;
        View findViewById2;
        if (this.f29575P.getId() == i && (findViewById2 = this.f29575P.findViewById(i2)) != null) {
            ((C6882g0) findViewById2).setInProgress(z);
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29577Q.findViewById(i2)) != null) {
            ((C6882g0) findViewById).setInProgress(z);
        }
    }

    @Override
    public void mo452g2() {
        TextView textView = this.f29589W;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f29594a0;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }

    public final int m10057g3(View view) {
        if ((view instanceof TextView) && view.getTag() == this) {
            return 1;
        }
        if (view instanceof AbstractC9321v2) {
            return 3;
        }
        return view instanceof C9351w2 ? 2 : 0;
    }

    public void m10056g4(int i, int i2, String str, boolean z, boolean z2) {
        View findViewById;
        View findViewById2;
        if (this.f29575P.getId() == i && (findViewById2 = this.f29575P.findViewById(i2)) != null) {
            if (z2) {
                ((C9202h2) findViewById2).m9978l(str, z);
            } else {
                C9202h2 h2Var = (C9202h2) findViewById2;
                h2Var.setIsVisible(z);
                h2Var.setValue(str);
            }
        }
        LinearLayout linearLayout = this.f29577Q;
        if (linearLayout != null && linearLayout.getId() == i && (findViewById = this.f29577Q.findViewById(i2)) != null) {
            if (z2) {
                ((C9202h2) findViewById).m9978l(str, z);
                return;
            }
            C9202h2 h2Var2 = (C9202h2) findViewById;
            h2Var2.setIsVisible(z);
            h2Var2.setValue(str);
        }
    }

    public View$OnClickListenerC9150b getBackButton() {
        return this.f29579R;
    }

    public float getBackFactor() {
        return this.f29595a1;
    }

    public float getCurrentHeight() {
        return this.f29596b0;
    }

    public int getCurrentTransformMode() {
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (l == null) {
            return 0;
        }
        if (l.m9382Na()) {
            return 2;
        }
        return l.m9374Oa() ? 1 : 0;
    }

    public RunnableC9355x0 getFilling() {
        return this.f29598c0;
    }

    public float getTranslation() {
        return this.f29591X0;
    }

    public C9310u0 m10055h2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10133A2(R.id.menu_btn_retry, R.drawable.baseline_repeat_24, i, v4Var, C1357a0.m37544i(52.0f), C11532q.m113b(), this);
        linearLayout.addView(A2, C4403w.m27986G2() ? 0 : -1);
        return A2;
    }

    public C9310u0 m10053i2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        return m10049k2(linearLayout, v4Var, v4Var.mo9375O9());
    }

    @Override
    public boolean isLayoutRequested() {
        return this.f29605g0;
    }

    public boolean m10051j3() {
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        return l != null && l.m9382Na();
    }

    public C9310u0 m10049k2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 B2 = m10131B2(R.id.menu_btn_search, R.drawable.baseline_search_24, i, v4Var, C1357a0.m37544i(49.0f), this);
        linearLayout.addView(B2, C4403w.m27986G2() ? 0 : -1);
        return B2;
    }

    public boolean m10048k3() {
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        return l != null && l.m9374Oa();
    }

    public C9202h2 m10047l2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var) {
        C9202h2 h2Var = new C9202h2(getContext());
        h2Var.setOnClickListener(this);
        if (v4Var != null) {
            h2Var.m9518g(v4Var.mo9375O9());
            v4Var.m9163t8(h2Var);
        }
        linearLayout.addView(h2Var);
        return h2Var;
    }

    public void m10046l3(C9270q1 q1Var) {
        this.f29573O = q1Var;
        this.f29600d0 = true;
        this.f29569M = q1Var.m9748M();
        RunnableC9355x0 x0Var = new RunnableC9355x0(this, q1Var);
        this.f29598c0 = x0Var;
        x0Var.m9019l0();
        this.f29598c0.m9056K((int) this.f29596b0, getHeightFactor());
        setHeaderOffset(getTopOffset());
        C2065g.m35721d(this, this.f29598c0);
        C1357a0.m37552a(this);
        C11052v1.m1768b().m1769a(this);
    }

    public C9310u0 m10045m2(LinearLayout linearLayout, AbstractC9323v4<?> v4Var, int i) {
        C9310u0 A2 = m10133A2(R.id.menu_btn_view, R.drawable.baseline_visibility_24, i, v4Var, C1357a0.m37544i(52.0f), C11532q.m114a(), this);
        linearLayout.addView(A2, C4403w.m27986G2() ? 0 : -1);
        return A2;
    }

    public void m10044m3(AbstractC9323v4<?> v4Var, boolean z) {
        this.f29573O = null;
        this.f29569M = new C9312u1(v4Var);
        this.f29571N = true;
        this.f29600d0 = z;
        RunnableC9355x0 x0Var = new RunnableC9355x0(this, null);
        this.f29598c0 = x0Var;
        if (z) {
            x0Var.m9019l0();
            setHeaderOffset(getTopOffset());
            setClipToPadding(false);
        } else {
            setLayoutParams(FrameLayoutFix.m18007t1(-1, m10065c3(false) + this.f29598c0.m9008s(), 48));
        }
        this.f29598c0.m9056K((int) this.f29596b0, getHeightFactor());
        C2065g.m35721d(this, this.f29598c0);
        setTitle(v4Var);
        C11052v1.m1768b().m1769a(this);
        C4403w.m27877h(this);
        v4Var.m9226k8(this);
        if (z) {
            C1357a0.m37552a(this);
        }
    }

    public void m10043m4(int i, CharSequence charSequence) {
        TextView textView = this.f29589W;
        if (textView != null && textView.getId() == i) {
            C1399s0.m37178j0(this.f29589W, charSequence);
        }
        TextView textView2 = this.f29594a0;
        if (textView2 != null && textView2.getId() == i) {
            C1399s0.m37178j0(this.f29594a0, charSequence);
        }
    }

    @Override
    public void mo9611n1(int i) {
        setHeaderOffset(getTopOffset());
    }

    public void m10042n2(AbstractC9323v4<?> v4Var) {
        this.f29601d1 = false;
        if (this.f29616r0) {
            this.f29581S.setVisibility(0);
        }
        View view = this.f29583T;
        View view2 = this.f29581S;
        if (view != view2) {
            this.f29581S = view;
            this.f29583T = view2;
            removeView(view2);
            TextView textView = this.f29589W;
            this.f29589W = this.f29594a0;
            this.f29594a0 = textView;
        }
        if (v4Var != null) {
            int P2 = m10097P2(v4Var, true);
            int R2 = m10092R2(v4Var, true);
            if (P2 == 1) {
                this.f29579R.setVisibility(8);
            } else {
                this.f29579R.setButtonFactor(P2);
                this.f29579R.invalidate();
            }
            this.f29579R.setButtonBackground(R2);
            this.f29598c0.m9015o(v4Var.m9437Fe());
        }
        if (this.f29614p0) {
            LinearLayout linearLayout = this.f29575P;
            this.f29575P = this.f29577Q;
            this.f29577Q = linearLayout;
            removeView(linearLayout);
            this.f29614p0 = false;
        }
        int b3 = m10067b3(v4Var, true);
        if (v4Var == null || b3 == 0) {
            this.f29575P.setVisibility(8);
        }
        this.f29585U = null;
        this.f29587V = null;
    }

    public final void m10041n3() {
        invalidate(0, 0, getMeasuredWidth(), this.f29598c0.m9012q() + this.f29598c0.m9008s());
    }

    public void m10040n4(int i, int i2) {
        TextView textView = this.f29589W;
        if (textView != null && textView.getId() == i) {
            this.f29589W.setTextColor(i2);
        }
        TextView textView2 = this.f29594a0;
        if (textView2 != null && textView2.getId() == i) {
            this.f29594a0.setTextColor(i2);
        }
    }

    public boolean m10039o3() {
        return this.f29592Y0;
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onClick(View view) {
        AbstractC9323v4<?> l;
        C9270q1 q1Var = this.f29573O;
        if ((q1Var != null && (q1Var.m9737W() || this.f29573O.m9741S())) || (l = this.f29569M.m9501l()) == null) {
            return;
        }
        if ((!l.m9374Oa() && l.mo418W9() != 0) || (l.m9374Oa() && l.mo8831xa() != 0)) {
            ((AbstractC9201h1) l).mo419J(view.getId(), view);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m10115H3();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f29598c0.m9055L(getMeasuredWidth(), (int) this.f29596b0, getHeightFactor());
            invalidate();
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getTag() != null && (view.getTag() instanceof String)) {
            String str = (String) view.getTag();
            if (!C5070i.m24062i(str)) {
                Toast makeText = Toast.makeText(getContext(), str, 0);
                makeText.setGravity(53, view.getRight(), m10065c3(true) - C1357a0.m37544i(8.0f));
                makeText.show();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m10115H3()) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.f29598c0.m9050Q(motionEvent);
    }

    public void m10038p2() {
        this.f29604f0 = false;
        this.f29605g0 = false;
    }

    public void m10033r2() {
        this.f29601d1 = false;
        this.f29585U = null;
        this.f29587V = null;
        if (this.f29616r0) {
            this.f29581S.setVisibility(0);
        }
        this.f29581S.setAlpha(1.0f);
        this.f29581S.setTranslationX(0.0f);
        removeView(this.f29583T);
        removeView(this.f29577Q);
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (l != null) {
            if (l.mo408A9() == 1) {
                this.f29579R.setVisibility(8);
            } else {
                this.f29579R.setButtonFactor(l.mo408A9());
                this.f29579R.invalidate();
            }
            if (m10067b3(l, true) == 0) {
                this.f29575P.setVisibility(8);
            }
            this.f29598c0.m9023j0(m10082V2(l, true));
        }
        float f = this.f29560D0;
        this.f29596b0 = f;
        this.f29598c0.m9056K((int) f, getHeightFactor());
        if (this.f29557A0) {
            View view = this.f29581S;
            if (view instanceof AbstractC9208i2) {
                ((AbstractC9208i2) view).mo8402i0(getHeightFactor(), getHeightFactor(), getHeightFactor(), false);
            }
        }
        invalidate();
    }

    @Override
    public void requestLayout() {
        if (!this.f29604f0) {
            int i = this.f29606h0;
            if (i == -1) {
                super.requestLayout();
                return;
            }
            int i2 = this.f29607i0;
            if (i2 < i) {
                this.f29607i0 = i2 + 1;
                super.requestLayout();
                return;
            }
            return;
        }
        this.f29605g0 = true;
    }

    public void setBackFactor(float f) {
        if (this.f29595a1 != f) {
            this.f29595a1 = f;
            this.f29579R.setColor(this.f29576P0.m18910a(f));
        }
    }

    public void setBackgroundHeight(int i) {
        float f = i;
        if (this.f29596b0 != f) {
            this.f29596b0 = f;
            this.f29598c0.m9056K(i, getHeightFactor());
            invalidate();
        }
    }

    public void setHeaderDisabled(boolean z) {
        if (this.f29603e1 != z) {
            this.f29603e1 = z;
            setVisibility(z ? 4 : 0);
        }
    }

    public void setOverlayColor(int i) {
        if (this.f29613o0 != i) {
            this.f29613o0 = i;
            setWillNotDraw(Color.alpha(i) <= 0);
            invalidate();
        }
    }

    public void setTitle(AbstractC9323v4<?> v4Var) {
        int J9;
        if (this.f29571N) {
            this.f29569M.m9515A(v4Var);
        }
        m10105M2(v4Var);
        if (v4Var.mo418W9() != this.f29575P.getId()) {
            this.f29575P.removeAllViews();
            this.f29575P.setId(v4Var.mo418W9());
            if (v4Var.mo418W9() != 0) {
                ((AbstractC9201h1) v4Var).mo414p0(v4Var.mo418W9(), this, this.f29575P);
                this.f29575P.setVisibility(0);
                int i = 0;
                for (int i2 = 0; i2 < this.f29575P.getChildCount(); i2++) {
                    i += this.f29575P.getChildAt(i2).getLayoutParams().width;
                }
                View view = this.f29581S;
                if (view == this.f29589W) {
                    m10050j4(view, v4Var, i, getCurrentHeaderOffset());
                }
            } else {
                this.f29575P.setVisibility(8);
                View view2 = this.f29581S;
                if (view2 == this.f29589W) {
                    m10050j4(view2, v4Var, 0, getCurrentHeaderOffset());
                }
            }
        }
        View G9 = v4Var.mo8869G9();
        if (G9 != null && (G9 instanceof AbstractC9208i2)) {
            float Z2 = m10071Z2(v4Var.mo8865M9());
            if (Z2 > 0.0f) {
                ((AbstractC9208i2) G9).mo8402i0(Z2, Z2, Z2, false);
            }
        }
        if (v4Var.mo408A9() != 1) {
            this.f29579R.setButtonFactor(v4Var.mo408A9());
            this.f29579R.setVisibility(0);
            if (v4Var.mo9472B9() != 0) {
                this.f29579R.setBackgroundResource(v4Var.mo9472B9());
            }
            this.f29579R.setColor(C11524j.m228N(v4Var.mo9375O9()));
        } else {
            this.f29579R.setVisibility(8);
        }
        this.f29579R.setColor(v4Var.mo9383N9());
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
            this.f29589W.setTextColor(v4Var.m9367P9());
        }
        setBackgroundHeight(v4Var.mo8865M9());
        if (!(this.f29573O == null || (J9 = v4Var.mo9413J9()) == 0)) {
            C9290s0 H = this.f29573O.m9758H();
            H.m9617k(0, J9);
            H.m9621g(getHeightFactor(), 0.0f, 1.0f, false, false);
        }
        this.f29598c0.m9023j0(v4Var.m9406K9());
        float f = 1.0f;
        this.f29598c0.m9007s0(v4Var.mo9416Ie() ? 1.0f : 0.0f);
        RunnableC9355x0 x0Var = this.f29598c0;
        if (!v4Var.mo9423He()) {
            f = 0.0f;
        }
        x0Var.m9014o0(f);
        if (v4Var.mo9386Me()) {
            this.f29581S.setTranslationY(-C4896n.m24479e());
            this.f29598c0.m9026i(0.0f);
        }
        v4Var.m9218l9();
    }

    public void setTranslation(float f) {
        this.f29591X0 = f;
        if (this.f29617s0) {
            f = 1.0f - f;
        }
        boolean z = false;
        if (this.f29557A0) {
            float f2 = this.f29560D0 + (this.f29561E0 * f);
            this.f29596b0 = f2;
            float e = (f2 - C4896n.m24479e()) / C4896n.m24476h();
            this.f29598c0.m9056K((int) this.f29596b0, e);
            View view = this.f29583T;
            if (view instanceof AbstractC9208i2) {
                ((AbstractC9208i2) view).mo8402i0(e, this.f29559C0, this.f29558B0, false);
            }
            View view2 = this.f29581S;
            if (view2 instanceof AbstractC9208i2) {
                ((AbstractC9208i2) view2).mo8402i0(e, this.f29558B0, this.f29559C0, false);
            }
            int i = this.f29562F0;
            if (i != 0) {
                C9290s0 s0Var = this.f29564H0;
                float f3 = this.f29563G0 ? 1.0f - f : f;
                if (i != 1) {
                    z = true;
                }
                s0Var.m9618j(e, f3, z);
                if (this.f29615q0 == 2) {
                    float Z2 = m10071Z2(this.f29617s0 ? this.f29560D0 : this.f29560D0 + this.f29561E0);
                    C9290s0 s0Var2 = this.f29564H0;
                    s0Var2.setTranslationY(s0Var2.getTranslationY() - ((C4896n.m24479e() * Z2) * (1.0f - e)));
                }
            }
        } else if (this.f29562F0 == 1) {
            this.f29564H0.m9618j(m10071Z2(this.f29560D0), this.f29563G0 ? 1.0f - f : f, false);
        }
        int i2 = this.f29615q0;
        if (i2 == 1) {
            if (C4403w.m27986G2()) {
                if (this.f29617s0) {
                    this.f29581S.setTranslationX(this.f29597b1 * f);
                    this.f29583T.setTranslationX((-this.f29597b1) * (1.0f - f));
                } else {
                    this.f29581S.setTranslationX((-this.f29597b1) * f);
                    this.f29583T.setTranslationX(this.f29597b1 * (1.0f - f));
                }
            } else if (this.f29617s0) {
                this.f29581S.setTranslationX((-this.f29597b1) * f);
                this.f29583T.setTranslationX(this.f29597b1 * (1.0f - f));
            } else {
                this.f29581S.setTranslationX(this.f29597b1 * f);
                this.f29583T.setTranslationX((-this.f29597b1) * (1.0f - f));
            }
            this.f29581S.setAlpha(1.0f - f);
            this.f29583T.setAlpha(f);
        } else if (i2 == 2) {
            if (this.f29617s0) {
                this.f29581S.setTranslationY((-(C4896n.m24479e() + getTopOffset())) * f);
                this.f29583T.setTranslationY(this.f29599c1 * (1.0f - f));
                AbstractC9323v4<?> v4Var = this.f29585U;
                if (v4Var != null) {
                    v4Var.mo9435G8(f);
                }
            } else {
                this.f29581S.setTranslationY(this.f29599c1 * f);
                float f4 = 1.0f - f;
                this.f29583T.setTranslationY(-((C4896n.m24479e() + getTopOffset()) * f4));
                AbstractC9323v4<?> v4Var2 = this.f29587V;
                if (v4Var2 != null) {
                    v4Var2.mo9435G8(f4);
                }
            }
            this.f29581S.setAlpha(1.0f - f);
            this.f29583T.setAlpha(f);
        } else if (i2 == 3) {
            this.f29581S.setAlpha(1.0f - f);
            this.f29583T.setAlpha(f);
        }
        if (this.f29622x0) {
            if (this.f29623y0) {
                this.f29575P.setAlpha(1.0f - f);
                if (this.f29615q0 == 2) {
                    this.f29575P.setTranslationY((this.f29617s0 ? -(C4896n.m24479e() + getTopOffset()) : this.f29599c1) * f);
                }
            }
            if (this.f29624z0) {
                this.f29577Q.setAlpha(f);
                if (this.f29615q0 == 2) {
                    this.f29577Q.setTranslationY(this.f29617s0 ? this.f29599c1 * (1.0f - f) : -((C4896n.m24479e() + getTopOffset()) * (1.0f - f)));
                }
            }
        }
        if (!this.f29618t0) {
            float f5 = this.f29619u0;
            float f6 = this.f29620v0;
            if (f5 != f6) {
                this.f29579R.setFactor(f5 + ((f6 - f5) * f));
            }
        } else if (this.f29621w0) {
            this.f29579R.setAlpha(f);
            if (this.f29615q0 == 2) {
                this.f29579R.setTranslationY((-(C4896n.m24479e() + getTopOffset())) * (1.0f - f));
            }
            this.f29579R.setTranslationX(this.f29583T.getTranslationX());
        } else {
            this.f29579R.setAlpha(1.0f - f);
            if (this.f29615q0 == 2) {
                this.f29579R.setTranslationY((C4896n.m24479e() + getTopOffset()) * f);
            }
            this.f29579R.setTranslationX(this.f29581S.getTranslationX());
        }
        if (this.f29562F0 == 2) {
            this.f29564H0.setFactor(f);
        }
        if (this.f29565I0) {
            this.f29598c0.m9023j0(this.f29566J0.m18910a(f));
            if (this.f29593Z0 == 2) {
                if (this.f29617s0) {
                    this.f29598c0.m9013p0(f, this.f29566J0.m18910a(1.0f));
                } else {
                    this.f29598c0.m9013p0(1.0f - f, this.f29566J0.m18910a(0.0f));
                }
            }
        }
        if (this.f29567K0) {
            int a = this.f29572N0.m18910a(f);
            int i3 = this.f29568L0;
            if (i3 == 1) {
                ((TextView) this.f29581S).setTextColor(a);
            } else if (i3 == 2) {
                ((C9351w2) this.f29581S).setTextColor(a);
            } else if (i3 == 3) {
                ((AbstractC9321v2) this.f29581S).setTextColor(a);
            }
            int i4 = this.f29570M0;
            if (i4 == 1) {
                ((TextView) this.f29583T).setTextColor(a);
            } else if (i4 == 2) {
                ((C9351w2) this.f29583T).setTextColor(a);
            } else if (i4 == 3) {
                ((AbstractC9321v2) this.f29583T).setTextColor(a);
            }
        }
        if (this.f29574O0) {
            int a2 = this.f29576P0.m18910a(f);
            this.f29579R.setColor(a2);
            if (this.f29567K0) {
                if (this.f29568L0 == 2) {
                    ((C9351w2) this.f29581S).setTriangleColor(a2);
                }
                if (this.f29570M0 == 2) {
                    ((C9351w2) this.f29583T).setTriangleColor(a2);
                }
            }
        }
        if (this.f29584T0) {
            this.f29598c0.m9007s0(this.f29586U0 ? f : 1.0f - f);
        }
        if (this.f29588V0) {
            this.f29598c0.m9014o0(this.f29590W0 ? f : 1.0f - f);
        }
        if (Build.VERSION.SDK_INT >= 21 && this.f29580R0) {
            this.f29578Q0.setStatusBarColor(this.f29582S0.m18910a(f));
        }
        if (this.f29557A0 || this.f29565I0 || this.f29584T0 || this.f29574O0) {
            invalidate();
        }
        if (this.f29567K0) {
            if (this.f29568L0 == 2) {
                this.f29581S.invalidate();
            }
            if (this.f29570M0 == 2) {
                this.f29583T.invalidate();
            }
        }
    }

    public void m10029t2(boolean z, Runnable runnable) {
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (!this.f29592Y0 && l != null && l.m9382Na()) {
            this.f29592Y0 = true;
            this.f29591X0 = 0.0f;
            m10101N3(l, 2, 0, false, z, runnable);
        }
    }

    public void m10027u2() {
        m10026v2(false, true);
    }

    public void m10026v2(boolean z, boolean z2) {
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (!this.f29592Y0 && l != null && l.m9374Oa()) {
            this.f29592Y0 = true;
            this.f29591X0 = 0.0f;
            if (z && (l instanceof AbstractC9174d2)) {
                ((AbstractC9174d2) l).mo8837u5(-1);
            }
            m10101N3(l, 1, 0, false, z2, null);
        }
    }

    public void m10025v3() {
        this.f29604f0 = false;
        if (this.f29605g0) {
            this.f29605g0 = false;
            requestLayout();
        }
    }

    public boolean m10024w3() {
        return this.f29600d0;
    }

    public final void m10022x3(MotionEvent motionEvent) {
        AbstractC9323v4<?> v4Var;
        C9312u1 u1Var;
        C9270q1 q1Var = this.f29573O;
        if (q1Var != null) {
            v4Var = q1Var.m9762F();
        } else {
            v4Var = (!this.f29571N || (u1Var = this.f29569M) == null || u1Var.m9496q()) ? null : this.f29569M.m9501l();
        }
        if (v4Var != null && m10097P2(v4Var, true) == 3) {
            if (v4Var.m9348S9() || v4Var.mo9263ec()) {
                v4Var.mo9397La();
            }
        }
    }

    public void m10020y3(td.AbstractC9323v4<?> r23, td.AbstractC9323v4<?> r24, boolean r25, int r26, float r27) {
        throw new UnsupportedOperationException("Method not decompiled: td.View$OnClickListenerC9170d1.m10020y3(td.v4, td.v4, boolean, int, float):void");
    }

    public final void m10019z2(View view) {
        int currentHeaderOffset = getCurrentHeaderOffset();
        if (view instanceof AbstractC9173c) {
            ((AbstractC9173c) view).mo9774k0(this, currentHeaderOffset);
        } else if (view instanceof C9351w2) {
            C1399s0.m37158t0(view, C1357a0.m37544i(15.0f) + currentHeaderOffset);
        } else {
            C1399s0.m37158t0(view, currentHeaderOffset);
        }
    }

    public void m10018z3() {
        AbstractC9323v4<?> l = this.f29569M.m9501l();
        if (!this.f29592Y0 && l != null && !l.m9366Pa() && Color.alpha(this.f29613o0) <= 0) {
            this.f29592Y0 = true;
            l.m9231j9();
            this.f29591X0 = 1.0f;
            m10101N3(l, 2, 0, true, true, null);
        }
    }
}
