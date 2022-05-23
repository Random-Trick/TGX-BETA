package i1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import c1.v;
import java.util.Arrays;

public class a {
    public static final Interpolator f13900w = new animation.InterpolatorC0120a();
    public int f13901a;
    public int f13902b;
    public float[] f13904d;
    public float[] f13905e;
    public float[] f13906f;
    public float[] f13907g;
    public int[] f13908h;
    public int[] f13909i;
    public int[] f13910j;
    public int f13911k;
    public VelocityTracker f13912l;
    public float f13913m;
    public float f13914n;
    public int f13915o;
    public int f13916p;
    public OverScroller f13917q;
    public final c f13918r;
    public View f13919s;
    public boolean f13920t;
    public final ViewGroup f13921u;
    public int f13903c = -1;
    public final Runnable f13922v = new b();

    public static class animation.InterpolatorC0120a implements Interpolator {
        @Override
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override
        public void run() {
            a.this.K(0);
        }
    }

    public static abstract class c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public abstract int d(View view);

        public int e(View view) {
            return 0;
        }

        public abstract void f(int i10, int i11);

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public abstract void i(View view, int i10);

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    public a(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f13921u = viewGroup;
            this.f13918r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f13915o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f13902b = viewConfiguration.getScaledTouchSlop();
            this.f13913m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f13914n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f13917q = new OverScroller(context, f13900w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static a o(ViewGroup viewGroup, float f10, c cVar) {
        a p10 = p(viewGroup, cVar);
        p10.f13902b = (int) (p10.f13902b * (1.0f / f10));
        return p10;
    }

    public static a p(ViewGroup viewGroup, c cVar) {
        return new a(viewGroup.getContext(), viewGroup, cVar);
    }

    public int A() {
        return this.f13901a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f13919s, i10, i11);
    }

    public boolean C(int i10) {
        return ((1 << i10) & this.f13911k) != 0;
    }

    public final boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void F(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f13912l == null) {
            this.f13912l = VelocityTracker.obtain();
        }
        this.f13912l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View u10 = u((int) x10, (int) y10);
            I(x10, y10, pointerId);
            Q(u10, pointerId);
            int i12 = this.f13908h[pointerId];
            int i13 = this.f13916p;
            if ((i12 & i13) != 0) {
                this.f13918r.h(i12 & i13, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f13901a == 1) {
                G();
            }
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f13901a == 1) {
                    q(0.0f, 0.0f);
                }
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                I(x11, y11, pointerId2);
                if (this.f13901a == 0) {
                    Q(u((int) x11, (int) y11), pointerId2);
                    int i14 = this.f13908h[pointerId2];
                    int i15 = this.f13916p;
                    if ((i14 & i15) != 0) {
                        this.f13918r.h(i14 & i15, pointerId2);
                    }
                } else if (B((int) x11, (int) y11)) {
                    Q(this.f13919s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f13901a == 1 && pointerId3 == this.f13903c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount) {
                            i10 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i11);
                        if (pointerId4 != this.f13903c) {
                            View u11 = u((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view = this.f13919s;
                            if (u11 == view && Q(view, pointerId4)) {
                                i10 = this.f13903c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        G();
                    }
                }
                k(pointerId3);
            }
        } else if (this.f13901a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i11 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i11);
                if (D(pointerId5)) {
                    float x12 = motionEvent.getX(i11);
                    float y12 = motionEvent.getY(i11);
                    float f10 = x12 - this.f13904d[pointerId5];
                    float f11 = y12 - this.f13905e[pointerId5];
                    H(f10, f11, pointerId5);
                    if (this.f13901a != 1) {
                        View u12 = u((int) x12, (int) y12);
                        if (g(u12, f10, f11) && Q(u12, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i11++;
            }
            J(motionEvent);
        } else if (D(this.f13903c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f13903c);
            float x13 = motionEvent.getX(findPointerIndex);
            float y13 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f13906f;
            int i16 = this.f13903c;
            int i17 = (int) (x13 - fArr[i16]);
            int i18 = (int) (y13 - this.f13907g[i16]);
            s(this.f13919s.getLeft() + i17, this.f13919s.getTop() + i18, i17, i18);
            J(motionEvent);
        }
    }

    public final void G() {
        this.f13912l.computeCurrentVelocity(1000, this.f13913m);
        q(h(this.f13912l.getXVelocity(this.f13903c), this.f13914n, this.f13913m), h(this.f13912l.getYVelocity(this.f13903c), this.f13914n, this.f13913m));
    }

    public final void H(float f10, float f11, int i10) {
        boolean d10 = d(f10, f11, i10, 1);
        if (d(f11, f10, i10, 4)) {
            d10 |= true;
        }
        if (d(f10, f11, i10, 2)) {
            boolean z10 = d10 ? 1 : 0;
            char c10 = d10 ? 1 : 0;
            d10 = z10 | true;
        }
        if (d(f11, f10, i10, 8)) {
            boolean z11 = d10 ? 1 : 0;
            char c11 = d10 ? 1 : 0;
            d10 = z11 | true;
        }
        if (d10) {
            int[] iArr = this.f13909i;
            iArr[i10] = iArr[i10] | (d10 ? 1 : 0);
            c cVar = this.f13918r;
            int i11 = d10 ? 1 : 0;
            int i12 = d10 ? 1 : 0;
            int i13 = d10 ? 1 : 0;
            cVar.f(i11, i10);
        }
    }

    public final void I(float f10, float f11, int i10) {
        t(i10);
        float[] fArr = this.f13904d;
        this.f13906f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f13905e;
        this.f13907g[i10] = f11;
        fArr2[i10] = f11;
        this.f13908h[i10] = y((int) f10, (int) f11);
        this.f13911k |= 1 << i10;
    }

    public final void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f13906f[pointerId] = x10;
                this.f13907g[pointerId] = y10;
            }
        }
    }

    public void K(int i10) {
        this.f13921u.removeCallbacks(this.f13922v);
        if (this.f13901a != i10) {
            this.f13901a = i10;
            this.f13918r.j(i10);
            if (this.f13901a == 0) {
                this.f13919s = null;
            }
        }
    }

    public void L(int i10) {
        this.f13916p = i10;
    }

    public void M(float f10) {
        this.f13914n = f10;
    }

    public boolean N(int i10, int i11) {
        if (this.f13920t) {
            return v(i10, i11, (int) this.f13912l.getXVelocity(this.f13903c), (int) this.f13912l.getYVelocity(this.f13903c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean O(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: i1.a.O(android.view.MotionEvent):boolean");
    }

    public boolean P(View view, int i10, int i11) {
        this.f13919s = view;
        this.f13903c = -1;
        boolean v10 = v(i10, i11, 0, 0);
        if (!v10 && this.f13901a == 0 && this.f13919s != null) {
            this.f13919s = null;
        }
        return v10;
    }

    public boolean Q(View view, int i10) {
        if (view == this.f13919s && this.f13903c == i10) {
            return true;
        }
        if (view == null || !this.f13918r.m(view, i10)) {
            return false;
        }
        this.f13903c = i10;
        c(view, i10);
        return true;
    }

    public void a() {
        b();
        if (this.f13901a == 2) {
            int currX = this.f13917q.getCurrX();
            int currY = this.f13917q.getCurrY();
            this.f13917q.abortAnimation();
            int currX2 = this.f13917q.getCurrX();
            int currY2 = this.f13917q.getCurrY();
            this.f13918r.k(this.f13919s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        K(0);
    }

    public void b() {
        this.f13903c = -1;
        j();
        VelocityTracker velocityTracker = this.f13912l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13912l = null;
        }
    }

    public void c(View view, int i10) {
        if (view.getParent() == this.f13921u) {
            this.f13919s = view;
            this.f13903c = i10;
            this.f13918r.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f13921u + ")");
    }

    public final boolean d(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f13908h[i10] & i11) != i11 || (this.f13916p & i11) == 0 || (this.f13910j[i10] & i11) == i11 || (this.f13909i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f13902b;
        if (abs <= i12 && abs2 <= i12) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f13918r.g(i11)) {
            return (this.f13909i[i10] & i11) == 0 && abs > ((float) this.f13902b);
        }
        int[] iArr = this.f13910j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    public boolean e(int i10) {
        int length = this.f13904d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (f(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f13906f[i11] - this.f13904d[i11];
        float f11 = this.f13907g[i11] - this.f13905e[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f13902b) : z11 && Math.abs(f11) > ((float) this.f13902b);
        }
        int i12 = this.f13902b;
        return (f10 * f10) + (f11 * f11) > ((float) (i12 * i12));
    }

    public final boolean g(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f13918r.d(view) > 0;
        boolean z11 = this.f13918r.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f13902b) : z11 && Math.abs(f11) > ((float) this.f13902b);
        }
        int i10 = this.f13902b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    public final float h(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        return abs > f12 ? f10 > 0.0f ? f12 : -f12 : f10;
    }

    public final int i(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        return abs > i12 ? i10 > 0 ? i12 : -i12 : i10;
    }

    public final void j() {
        float[] fArr = this.f13904d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f13905e, 0.0f);
            Arrays.fill(this.f13906f, 0.0f);
            Arrays.fill(this.f13907g, 0.0f);
            Arrays.fill(this.f13908h, 0);
            Arrays.fill(this.f13909i, 0);
            Arrays.fill(this.f13910j, 0);
            this.f13911k = 0;
        }
    }

    public final void k(int i10) {
        if (this.f13904d != null && C(i10)) {
            this.f13904d[i10] = 0.0f;
            this.f13905e[i10] = 0.0f;
            this.f13906f[i10] = 0.0f;
            this.f13907g[i10] = 0.0f;
            this.f13908h[i10] = 0;
            this.f13909i[i10] = 0;
            this.f13910j[i10] = 0;
            this.f13911k = (~(1 << i10)) & this.f13911k;
        }
    }

    public final int l(int i10, int i11, int i12) {
        int i13;
        if (i10 == 0) {
            return 0;
        }
        int width = this.f13921u.getWidth();
        float f10 = width / 2;
        float r10 = f10 + (r(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int abs = Math.abs(i11);
        if (abs > 0) {
            i13 = Math.round(Math.abs(r10 / abs) * 1000.0f) * 4;
        } else {
            i13 = (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f);
        }
        return Math.min(i13, 600);
    }

    public final int m(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i14 = i(i12, (int) this.f13914n, (int) this.f13913m);
        int i15 = i(i13, (int) this.f13914n, (int) this.f13913m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(i14);
        int abs4 = Math.abs(i15);
        int i16 = abs3 + abs4;
        int i17 = abs + abs2;
        if (i14 != 0) {
            f11 = abs3;
            f10 = i16;
        } else {
            f11 = abs;
            f10 = i17;
        }
        float f14 = f11 / f10;
        if (i15 != 0) {
            f13 = abs4;
            f12 = i16;
        } else {
            f13 = abs2;
            f12 = i17;
        }
        return (int) ((l(i10, i14, this.f13918r.d(view)) * f14) + (l(i11, i15, this.f13918r.e(view)) * (f13 / f12)));
    }

    public boolean n(boolean z10) {
        if (this.f13901a == 2) {
            boolean computeScrollOffset = this.f13917q.computeScrollOffset();
            int currX = this.f13917q.getCurrX();
            int currY = this.f13917q.getCurrY();
            int left = currX - this.f13919s.getLeft();
            int top = currY - this.f13919s.getTop();
            if (left != 0) {
                v.O(this.f13919s, left);
            }
            if (top != 0) {
                v.P(this.f13919s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f13918r.k(this.f13919s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f13917q.getFinalX() && currY == this.f13917q.getFinalY()) {
                this.f13917q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z10) {
                    this.f13921u.post(this.f13922v);
                } else {
                    K(0);
                }
            }
        }
        return this.f13901a == 2;
    }

    public final void q(float f10, float f11) {
        this.f13920t = true;
        this.f13918r.l(this.f13919s, f10, f11);
        this.f13920t = false;
        if (this.f13901a == 1) {
            K(0);
        }
    }

    public final float r(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public final void s(int i10, int i11, int i12, int i13) {
        int left = this.f13919s.getLeft();
        int top = this.f13919s.getTop();
        if (i12 != 0) {
            i10 = this.f13918r.a(this.f13919s, i10, i12);
            v.O(this.f13919s, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f13918r.b(this.f13919s, i11, i13);
            v.P(this.f13919s, i11 - top);
        }
        int i15 = i11;
        if (i12 != 0 || i13 != 0) {
            this.f13918r.k(this.f13919s, i14, i15, i14 - left, i15 - top);
        }
    }

    public final void t(int i10) {
        float[] fArr = this.f13904d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f13905e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f13906f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f13907g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f13908h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f13909i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f13910j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f13904d = fArr2;
            this.f13905e = fArr3;
            this.f13906f = fArr4;
            this.f13907g = fArr5;
            this.f13908h = iArr;
            this.f13909i = iArr2;
            this.f13910j = iArr3;
        }
    }

    public View u(int i10, int i11) {
        for (int childCount = this.f13921u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f13921u.getChildAt(this.f13918r.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean v(int i10, int i11, int i12, int i13) {
        int left = this.f13919s.getLeft();
        int top = this.f13919s.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f13917q.abortAnimation();
            K(0);
            return false;
        }
        this.f13917q.startScroll(left, top, i14, i15, m(this.f13919s, i14, i15, i12, i13));
        K(2);
        return true;
    }

    public View w() {
        return this.f13919s;
    }

    public int x() {
        return this.f13915o;
    }

    public final int y(int i10, int i11) {
        int i12 = i10 < this.f13921u.getLeft() + this.f13915o ? 1 : 0;
        if (i11 < this.f13921u.getTop() + this.f13915o) {
            i12 |= 4;
        }
        if (i10 > this.f13921u.getRight() - this.f13915o) {
            i12 |= 2;
        }
        return i11 > this.f13921u.getBottom() - this.f13915o ? i12 | 8 : i12;
    }

    public int z() {
        return this.f13902b;
    }
}
