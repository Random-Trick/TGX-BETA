package me;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1379j0;
import be.C1408x;
import ge.C4862d;
import java.util.Objects;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import p067ed.C4184b;
import p139jb.AbstractRunnableC5910b;
import td.AbstractC9323v4;

public class C7031t2 extends FrameLayoutFix {
    public Object f22311M;
    public boolean f22312N;
    public boolean f22313O;
    public boolean f22314P;
    public final ViewTreeObserver.OnPreDrawListener f22315Q = ViewTreeObserver$OnPreDrawListenerC7024s2.f22289a;
    public C1408x.AbstractC1409a f22316R;
    public boolean f22317S;
    public AbstractRunnableC5910b f22318T;
    public int f22319U;
    public long f22320V;
    public boolean f22321W;
    public int f22322a0;
    public int f22323b0;

    public class C7032a extends AbstractRunnableC5910b {
        public C7032a() {
        }

        @Override
        public void mo1364b() {
            C7031t2.this.getViewTreeObserver().removeOnPreDrawListener(C7031t2.this.f22315Q);
            C7031t2.this.invalidate();
        }
    }

    public class C7033b extends AbstractRunnableC5910b {
        public final boolean f22325M;

        public C7033b(boolean z) {
            this.f22325M = z;
        }

        @Override
        public void mo1364b() {
            C7031t2.this.f22316R.mo14480j(this.f22325M);
            C7031t2.this.getViewTreeObserver().removeOnPreDrawListener(C7031t2.this.f22315Q);
            C7031t2.this.invalidate();
        }
    }

    public static class C7034c extends RuntimeException {
        public C7034c(String str) {
            super(str);
        }
    }

    public C7031t2(Context context) {
        super(context);
    }

    public static void m18051I1(View view) {
        Objects.requireNonNull(view);
        if (view.getParent() != null) {
            throw new C7034c(view.getClass().getName() + " already has root");
        }
    }

    public static int m18048M1(Object obj) {
        if (Build.VERSION.SDK_INT < 21 || obj == null) {
            return 0;
        }
        return ((WindowInsets) obj).getSystemWindowInsetBottom();
    }

    public static int m18047N1(Object obj) {
        if (Build.VERSION.SDK_INT < 21 || obj == null) {
            return 0;
        }
        return ((WindowInsets) obj).getSystemWindowInsetLeft();
    }

    public static int m18046O1(Object obj) {
        if (Build.VERSION.SDK_INT < 21 || obj == null) {
            return 0;
        }
        return ((WindowInsets) obj).getSystemWindowInsetRight();
    }

    public WindowInsets m18044S1(View view, WindowInsets windowInsets) {
        m18041V1(windowInsets);
        return windowInsets.consumeSystemWindowInsets();
    }

    public static boolean m18043T1() {
        return false;
    }

    private void setKeyboardVisible(boolean z) {
        if (this.f22317S != z) {
            this.f22317S = z;
            AbstractRunnableC5910b bVar = this.f22318T;
            if (bVar != null) {
                bVar.m21857c();
                this.f22318T = null;
            }
            if (this.f22316R != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.f22315Q);
                getViewTreeObserver().addOnPreDrawListener(this.f22315Q);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f22316R.mo14480j(z);
                    AbstractRunnableC5910b e = new C7032a().m21855e(C1379j0.m37313o());
                    this.f22318T = e;
                    C1379j0.m37332e0(e, 20L);
                    return;
                }
                AbstractRunnableC5910b e2 = new C7033b(z).m21855e(C1379j0.m37313o());
                this.f22318T = e2;
                C1379j0.m37332e0(e2, 2L);
            }
        }
    }

    @TargetApi(21)
    public final void m18052G1(View view, ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i, boolean z) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = this.f22321W ? 0 : windowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = z ? 0 : windowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = this.f22321W ? 0 : windowInsets.getSystemWindowInsetRight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        marginLayoutParams.bottomMargin = (this.f22312N || m18039X1(view, systemWindowInsetBottom)) ? 0 : systemWindowInsetBottom;
        if (C1379j0.m37307r(getContext()).m14616B0(view, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, systemWindowInsetBottom)) {
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            return;
        }
        AbstractC9323v4<?> o9 = AbstractC9323v4.m9196o9(view);
        if (o9 != null) {
            o9.mo9251g9(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, systemWindowInsetBottom);
        }
    }

    public final void m18050J1() {
        View measureTarget = getMeasureTarget();
        if (measureTarget != null) {
            int measuredWidth = measureTarget.getMeasuredWidth();
            int measuredHeight = measureTarget.getMeasuredHeight();
            int i = this.f22322a0;
            if (i != measuredHeight && i != 0 && measuredWidth == this.f22323b0 && measuredWidth > 0) {
                m18042U1(measuredHeight - i, measuredHeight < i ? i - measuredHeight : 0);
            }
            this.f22322a0 = measuredHeight;
            this.f22323b0 = measuredWidth;
        }
    }

    @TargetApi(21)
    public final void m18049L1(View view, Object obj, int i) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.f22314P || C1379j0.m37307r(getContext()).m14616B0(view, systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom)) {
            windowInsets.replaceSystemWindowInsets(0, 0, 0, 0);
        } else {
            if (this.f22312N || m18039X1(view, systemWindowInsetBottom)) {
                windowInsets.replaceSystemWindowInsets(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, 0);
            }
            AbstractC9323v4<?> o9 = AbstractC9323v4.m9196o9(view);
            if (o9 != null) {
                o9.mo9251g9(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
            }
        }
        view.dispatchApplyWindowInsets(windowInsets);
    }

    public void m18045Q1(boolean z) {
        this.f22312N = z;
        if (Build.VERSION.SDK_INT >= 21) {
            C1379j0.m37324i0(this);
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets S1;
                    S1 = C7031t2.this.m18044S1(view, windowInsets);
                    return S1;
                }
            });
        }
    }

    public final void m18042U1(int i, int i2) {
        if (Math.abs(i) > Math.max(C1357a0.m37536n(), Math.max(C1357a0.m37541i(116.0f), (int) Log.TAG_YOUTUBE))) {
            if (!this.f22312N && !this.f22314P) {
                if (!C4184b.f14123p) {
                    C1408x.m37086e(Math.abs(i));
                } else if (i < 0) {
                    if (this.f22320V != 0 && Math.signum(this.f22319U) == Math.signum(i) && SystemClock.uptimeMillis() - this.f22320V < 250) {
                        i += this.f22319U;
                    }
                    C1408x.m37086e(-i);
                }
            }
            setKeyboardVisible(i < 0);
            this.f22320V = 0L;
            return;
        }
        this.f22320V = SystemClock.uptimeMillis();
        this.f22319U = i;
    }

    public void m18041V1(Object obj) {
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets windowInsets = (WindowInsets) obj;
            if (this instanceof C6864e) {
                C1357a0.m37524z(windowInsets.getSystemWindowInsetTop());
            }
            boolean z = true;
            if (this.f22311M != null) {
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                int abs = Math.abs(((WindowInsets) this.f22311M).getSystemWindowInsetTop() - windowInsets.getSystemWindowInsetTop());
                int M1 = this.f22312N ? 0 : m18048M1(this.f22311M) - systemWindowInsetBottom;
                int O1 = m18046O1(this.f22311M) - m18046O1(windowInsets);
                int N1 = m18047N1(this.f22311M) - m18047N1(windowInsets);
                if (O1 == 0 && N1 == 0 && M1 != 0) {
                    m18042U1(M1, systemWindowInsetBottom);
                }
                if (abs == 0 && M1 == 0 && O1 == 0 && N1 == 0) {
                    z = false;
                }
            }
            this.f22311M = windowInsets;
            if (z) {
                requestLayout();
            }
        }
    }

    public void m18040W1() {
        this.f22321W = true;
    }

    public final boolean m18039X1(View view, int i) {
        return this.f22313O && i <= C1357a0.m37536n();
    }

    @Override
    public void addView(View view) {
        m18051I1(view);
        super.addView(view);
    }

    public View getMeasureTarget() {
        return this;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C4862d.m24934w().m24961T(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (Throwable th) {
            Log.critical(th);
            throw th;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21 && this.f22311M != null) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    if (childAt.getFitsSystemWindows()) {
                        m18049L1(childAt, this.f22311M, 0);
                    } else {
                        m18052G1(childAt, layoutParams, this.f22311M, layoutParams.gravity, true);
                    }
                }
            }
        }
        try {
            super.onMeasure(i, i2);
            m18050J1();
        } catch (Throwable th) {
            Log.critical(th);
            throw th;
        }
    }

    public void setIgnoreAll(boolean z) {
        this.f22314P = z;
    }

    public void setIgnoreBottom(boolean z) {
        this.f22312N = z;
    }

    public void setIgnoreSystemNavigationBar(boolean z) {
        this.f22313O = z;
    }

    public void setKeyboardListener(C1408x.AbstractC1409a aVar) {
        this.f22316R = aVar;
    }

    @Override
    public void addView(View view, int i) {
        m18051I1(view);
        super.addView(view, i);
    }

    @Override
    public void addView(View view, int i, int i2) {
        m18051I1(view);
        super.addView(view, i, i2);
    }

    @Override
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m18051I1(view);
        super.addView(view, layoutParams);
    }

    @Override
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m18051I1(view);
        super.addView(view, i, layoutParams);
    }
}
