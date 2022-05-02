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
    public Object f22314M;
    public boolean f22315N;
    public boolean f22316O;
    public boolean f22317P;
    public final ViewTreeObserver.OnPreDrawListener f22318Q = ViewTreeObserver$OnPreDrawListenerC7024s2.f22292a;
    public C1408x.AbstractC1409a f22319R;
    public boolean f22320S;
    public AbstractRunnableC5910b f22321T;
    public int f22322U;
    public long f22323V;
    public boolean f22324W;
    public int f22325a0;
    public int f22326b0;

    public class C7032a extends AbstractRunnableC5910b {
        public C7032a() {
        }

        @Override
        public void mo1364b() {
            C7031t2.this.getViewTreeObserver().removeOnPreDrawListener(C7031t2.this.f22318Q);
            C7031t2.this.invalidate();
        }
    }

    public class C7033b extends AbstractRunnableC5910b {
        public final boolean f22328M;

        public C7033b(boolean z) {
            this.f22328M = z;
        }

        @Override
        public void mo1364b() {
            C7031t2.this.f22319R.mo14479j(this.f22328M);
            C7031t2.this.getViewTreeObserver().removeOnPreDrawListener(C7031t2.this.f22318Q);
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
        if (this.f22320S != z) {
            this.f22320S = z;
            AbstractRunnableC5910b bVar = this.f22321T;
            if (bVar != null) {
                bVar.m21858c();
                this.f22321T = null;
            }
            if (this.f22319R != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.f22318Q);
                getViewTreeObserver().addOnPreDrawListener(this.f22318Q);
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f22319R.mo14479j(z);
                    AbstractRunnableC5910b e = new C7032a().m21856e(C1379j0.m37316o());
                    this.f22321T = e;
                    C1379j0.m37335e0(e, 20L);
                    return;
                }
                AbstractRunnableC5910b e2 = new C7033b(z).m21856e(C1379j0.m37316o());
                this.f22321T = e2;
                C1379j0.m37335e0(e2, 2L);
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
        marginLayoutParams.leftMargin = this.f22324W ? 0 : windowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = z ? 0 : windowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = this.f22324W ? 0 : windowInsets.getSystemWindowInsetRight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        marginLayoutParams.bottomMargin = (this.f22315N || m18039X1(view, systemWindowInsetBottom)) ? 0 : systemWindowInsetBottom;
        if (C1379j0.m37310r(getContext()).m14616B0(view, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, systemWindowInsetBottom)) {
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
            int i = this.f22325a0;
            if (i != measuredHeight && i != 0 && measuredWidth == this.f22326b0 && measuredWidth > 0) {
                m18042U1(measuredHeight - i, measuredHeight < i ? i - measuredHeight : 0);
            }
            this.f22325a0 = measuredHeight;
            this.f22326b0 = measuredWidth;
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
        if (this.f22317P || C1379j0.m37310r(getContext()).m14616B0(view, systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom)) {
            windowInsets.replaceSystemWindowInsets(0, 0, 0, 0);
        } else {
            if (this.f22315N || m18039X1(view, systemWindowInsetBottom)) {
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
        this.f22315N = z;
        if (Build.VERSION.SDK_INT >= 21) {
            C1379j0.m37327i0(this);
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
        if (Math.abs(i) > Math.max(C1357a0.m37539n(), Math.max(C1357a0.m37544i(116.0f), (int) Log.TAG_YOUTUBE))) {
            if (!this.f22315N && !this.f22317P) {
                if (!C4184b.f14123p) {
                    C1408x.m37089e(Math.abs(i));
                } else if (i < 0) {
                    if (this.f22323V != 0 && Math.signum(this.f22322U) == Math.signum(i) && SystemClock.uptimeMillis() - this.f22323V < 250) {
                        i += this.f22322U;
                    }
                    C1408x.m37089e(-i);
                }
            }
            setKeyboardVisible(i < 0);
            this.f22323V = 0L;
            return;
        }
        this.f22323V = SystemClock.uptimeMillis();
        this.f22322U = i;
    }

    public void m18041V1(Object obj) {
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets windowInsets = (WindowInsets) obj;
            if (this instanceof C6864e) {
                C1357a0.m37527z(windowInsets.getSystemWindowInsetTop());
            }
            boolean z = true;
            if (this.f22314M != null) {
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                int abs = Math.abs(((WindowInsets) this.f22314M).getSystemWindowInsetTop() - windowInsets.getSystemWindowInsetTop());
                int M1 = this.f22315N ? 0 : m18048M1(this.f22314M) - systemWindowInsetBottom;
                int O1 = m18046O1(this.f22314M) - m18046O1(windowInsets);
                int N1 = m18047N1(this.f22314M) - m18047N1(windowInsets);
                if (O1 == 0 && N1 == 0 && M1 != 0) {
                    m18042U1(M1, systemWindowInsetBottom);
                }
                if (abs == 0 && M1 == 0 && O1 == 0 && N1 == 0) {
                    z = false;
                }
            }
            this.f22314M = windowInsets;
            if (z) {
                requestLayout();
            }
        }
    }

    public void m18040W1() {
        this.f22324W = true;
    }

    public final boolean m18039X1(View view, int i) {
        return this.f22316O && i <= C1357a0.m37539n();
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
            C4862d.m24935w().m24962T(false);
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
        if (Build.VERSION.SDK_INT >= 21 && this.f22314M != null) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    if (childAt.getFitsSystemWindows()) {
                        m18049L1(childAt, this.f22314M, 0);
                    } else {
                        m18052G1(childAt, layoutParams, this.f22314M, layoutParams.gravity, true);
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
        this.f22317P = z;
    }

    public void setIgnoreBottom(boolean z) {
        this.f22315N = z;
    }

    public void setIgnoreSystemNavigationBar(boolean z) {
        this.f22316O = z;
    }

    public void setKeyboardListener(C1408x.AbstractC1409a aVar) {
        this.f22319R = aVar;
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
