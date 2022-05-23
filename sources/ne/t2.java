package ne;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import ce.a0;
import ce.j0;
import ce.x;
import he.d;
import java.util.Objects;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import ud.v4;

public class t2 extends FrameLayoutFix {
    public Object M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final ViewTreeObserver.OnPreDrawListener Q = s2.f18380a;
    public x.a R;
    public boolean S;
    public kb.b T;
    public int U;
    public long V;
    public boolean W;
    public int f18384a0;
    public int f18385b0;

    public class a extends kb.b {
        public a() {
        }

        @Override
        public void b() {
            t2.this.getViewTreeObserver().removeOnPreDrawListener(t2.this.Q);
            t2.this.invalidate();
        }
    }

    public static class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }

    public t2(Context context) {
        super(context);
    }

    public static void D1(View view) {
        Objects.requireNonNull(view);
        if (view.getParent() != null) {
            throw new b(view.getClass().getName() + " already has root");
        }
    }

    public static int H1(Object obj) {
        if (obj != null) {
            return ((WindowInsets) obj).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public static int I1(Object obj) {
        if (obj != null) {
            return ((WindowInsets) obj).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public static int K1(Object obj) {
        if (obj != null) {
            return ((WindowInsets) obj).getSystemWindowInsetRight();
        }
        return 0;
    }

    public WindowInsets O1(View view, WindowInsets windowInsets) {
        S1(windowInsets);
        return windowInsets.consumeSystemWindowInsets();
    }

    public static boolean P1() {
        return false;
    }

    private void setKeyboardVisible(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            kb.b bVar = this.T;
            if (bVar != null) {
                bVar.c();
                this.T = null;
            }
            if (this.R != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.Q);
                getViewTreeObserver().addOnPreDrawListener(this.Q);
                this.R.j(z10);
                kb.b e10 = new a().e(j0.o());
                this.T = e10;
                j0.e0(e10, 20L);
            }
        }
    }

    @TargetApi(21)
    public final void C1(View view, ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i10, boolean z10) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i10 == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i10 == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = this.W ? 0 : windowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = z10 ? 0 : windowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = this.W ? 0 : windowInsets.getSystemWindowInsetRight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        marginLayoutParams.bottomMargin = (this.N || V1(view, systemWindowInsetBottom)) ? 0 : systemWindowInsetBottom;
        if (j0.r(getContext()).E0(view, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, systemWindowInsetBottom)) {
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            return;
        }
        v4<?> o92 = v4.o9(view);
        if (o92 != null) {
            o92.g9(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, systemWindowInsetBottom);
        }
    }

    public final void E1() {
        View measureTarget = getMeasureTarget();
        if (measureTarget != null) {
            int measuredWidth = measureTarget.getMeasuredWidth();
            int measuredHeight = measureTarget.getMeasuredHeight();
            int i10 = this.f18384a0;
            if (i10 != measuredHeight && i10 != 0 && measuredWidth == this.f18385b0 && measuredWidth > 0) {
                R1(measuredHeight - i10, measuredHeight < i10 ? i10 - measuredHeight : 0);
            }
            this.f18384a0 = measuredHeight;
            this.f18385b0 = measuredWidth;
        }
    }

    @TargetApi(21)
    public final void G1(View view, Object obj, int i10) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i10 == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        } else if (i10 == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        int systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        int systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.P || j0.r(getContext()).E0(view, systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom)) {
            windowInsets.replaceSystemWindowInsets(0, 0, 0, 0);
        } else {
            if (this.N || V1(view, systemWindowInsetBottom)) {
                windowInsets.replaceSystemWindowInsets(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, 0);
            }
            v4<?> o92 = v4.o9(view);
            if (o92 != null) {
                o92.g9(systemWindowInsetLeft, systemWindowInsetTop, systemWindowInsetRight, systemWindowInsetBottom);
            }
        }
        view.dispatchApplyWindowInsets(windowInsets);
    }

    public void L1(boolean z10) {
        this.N = z10;
        j0.i0(this);
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets O1;
                O1 = t2.this.O1(view, windowInsets);
                return O1;
            }
        });
    }

    public final void R1(int i10, int i11) {
        if (Math.abs(i10) > Math.max(a0.n(), Math.max(a0.i(116.0f), (int) Log.TAG_YOUTUBE))) {
            if (!this.N && !this.P) {
                if (!fd.b.f11919p) {
                    x.e(Math.abs(i10));
                } else if (i10 < 0) {
                    if (this.V != 0 && Math.signum(this.U) == Math.signum(i10) && SystemClock.uptimeMillis() - this.V < 250) {
                        i10 += this.U;
                    }
                    x.e(-i10);
                }
            }
            setKeyboardVisible(i10 < 0);
            this.V = 0L;
            return;
        }
        this.V = SystemClock.uptimeMillis();
        this.U = i10;
    }

    public void S1(Object obj) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (this instanceof e) {
            a0.z(windowInsets.getSystemWindowInsetTop());
        }
        boolean z10 = true;
        if (this.M != null) {
            int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            int abs = Math.abs(((WindowInsets) this.M).getSystemWindowInsetTop() - windowInsets.getSystemWindowInsetTop());
            int H1 = this.N ? 0 : H1(this.M) - systemWindowInsetBottom;
            int K1 = K1(this.M) - K1(windowInsets);
            int I1 = I1(this.M) - I1(windowInsets);
            if (K1 == 0 && I1 == 0 && H1 != 0) {
                R1(H1, systemWindowInsetBottom);
            }
            if (abs == 0 && H1 == 0 && K1 == 0 && I1 == 0) {
                z10 = false;
            }
        }
        this.M = windowInsets;
        if (z10) {
            requestLayout();
        }
    }

    public void T1() {
        this.W = true;
    }

    public final boolean V1(View view, int i10) {
        return this.O && i10 <= a0.n();
    }

    @Override
    public void addView(View view) {
        D1(view);
        super.addView(view);
    }

    public View getMeasureTarget() {
        return this;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            d.w().T(false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } catch (Throwable th) {
            Log.critical(th);
            throw th;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.M != null) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    if (childAt.getFitsSystemWindows()) {
                        G1(childAt, this.M, 0);
                    } else {
                        C1(childAt, layoutParams, this.M, layoutParams.gravity, true);
                    }
                }
            }
        }
        try {
            super.onMeasure(i10, i11);
            E1();
        } catch (Throwable th) {
            Log.critical(th);
            throw th;
        }
    }

    public void setIgnoreAll(boolean z10) {
        this.P = z10;
    }

    public void setIgnoreBottom(boolean z10) {
        this.N = z10;
    }

    public void setIgnoreSystemNavigationBar(boolean z10) {
        this.O = z10;
    }

    public void setKeyboardListener(x.a aVar) {
        this.R = aVar;
    }

    @Override
    public void addView(View view, int i10) {
        D1(view);
        super.addView(view, i10);
    }

    @Override
    public void addView(View view, int i10, int i11) {
        D1(view);
        super.addView(view, i10, i11);
    }

    @Override
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        D1(view);
        super.addView(view, layoutParams);
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        D1(view);
        super.addView(view, i10, layoutParams);
    }
}
