package p114i1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p028c1.C1489y;

public class C5163a {
    public static final Interpolator f17256w = new animationInterpolatorC5164a();
    public int f17257a;
    public int f17258b;
    public float[] f17260d;
    public float[] f17261e;
    public float[] f17262f;
    public float[] f17263g;
    public int[] f17264h;
    public int[] f17265i;
    public int[] f17266j;
    public int f17267k;
    public VelocityTracker f17268l;
    public float f17269m;
    public float f17270n;
    public int f17271o;
    public int f17272p;
    public OverScroller f17273q;
    public final AbstractC5166c f17274r;
    public View f17275s;
    public boolean f17276t;
    public final ViewGroup f17277u;
    public int f17259c = -1;
    public final Runnable f17278v = new RunnableC5165b();

    public static class animationInterpolatorC5164a implements Interpolator {
        @Override
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class RunnableC5165b implements Runnable {
        public RunnableC5165b() {
        }

        @Override
        public void run() {
            C5163a.this.m23776K(0);
        }
    }

    public static abstract class AbstractC5166c {
        public abstract int mo23743a(View view, int i, int i2);

        public abstract int mo23742b(View view, int i, int i2);

        public int m23741c(int i) {
            return i;
        }

        public abstract int mo23740d(View view);

        public int m23739e(View view) {
            return 0;
        }

        public abstract void mo23738f(int i, int i2);

        public boolean mo23737g(int i) {
            return false;
        }

        public void mo23736h(int i, int i2) {
        }

        public abstract void mo23735i(View view, int i);

        public abstract void mo23734j(int i);

        public abstract void mo23733k(View view, int i, int i2, int i3, int i4);

        public abstract void mo23732l(View view, float f, float f2);

        public abstract boolean mo23731m(View view, int i);
    }

    public C5163a(Context context, ViewGroup viewGroup, AbstractC5166c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f17277u = viewGroup;
            this.f17274r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f17271o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f17258b = viewConfiguration.getScaledTouchSlop();
            this.f17269m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f17270n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f17273q = new OverScroller(context, f17256w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public static C5163a m23755o(ViewGroup viewGroup, float f, AbstractC5166c cVar) {
        C5163a p = m23754p(viewGroup, cVar);
        p.f17258b = (int) (p.f17258b * (1.0f / f));
        return p;
    }

    public static C5163a m23754p(ViewGroup viewGroup, AbstractC5166c cVar) {
        return new C5163a(viewGroup.getContext(), viewGroup, cVar);
    }

    public int m23786A() {
        return this.f17257a;
    }

    public boolean m23785B(int i, int i2) {
        return m23782E(this.f17275s, i, i2);
    }

    public boolean m23784C(int i) {
        return ((1 << i) & this.f17267k) != 0;
    }

    public final boolean m23783D(int i) {
        if (m23784C(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean m23782E(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public void m23781F(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m23768b();
        }
        if (this.f17268l == null) {
            this.f17268l = VelocityTracker.obtain();
        }
        this.f17268l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View u = m23749u((int) x, (int) y);
            m23778I(x, y, pointerId);
            m23770Q(u, pointerId);
            int i3 = this.f17264h[pointerId];
            int i4 = this.f17272p;
            if ((i3 & i4) != 0) {
                this.f17274r.mo23736h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f17257a == 1) {
                m23780G();
            }
            m23768b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f17257a == 1) {
                    m23753q(0.0f, 0.0f);
                }
                m23768b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m23778I(x2, y2, pointerId2);
                if (this.f17257a == 0) {
                    m23770Q(m23749u((int) x2, (int) y2), pointerId2);
                    int i5 = this.f17264h[pointerId2];
                    int i6 = this.f17272p;
                    if ((i5 & i6) != 0) {
                        this.f17274r.mo23736h(i5 & i6, pointerId2);
                    }
                } else if (m23785B((int) x2, (int) y2)) {
                    m23770Q(this.f17275s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f17257a == 1 && pointerId3 == this.f17259c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f17259c) {
                            View u2 = m23749u((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f17275s;
                            if (u2 == view && m23770Q(view, pointerId4)) {
                                i = this.f17259c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m23780G();
                    }
                }
                m23759k(pointerId3);
            }
        } else if (this.f17257a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m23783D(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f17260d[pointerId5];
                    float f2 = y3 - this.f17261e[pointerId5];
                    m23779H(f, f2, pointerId5);
                    if (this.f17257a != 1) {
                        View u3 = m23749u((int) x3, (int) y3);
                        if (m23763g(u3, f, f2) && m23770Q(u3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m23777J(motionEvent);
        } else if (m23783D(this.f17259c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f17259c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f17262f;
            int i7 = this.f17259c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f17263g[i7]);
            m23751s(this.f17275s.getLeft() + i8, this.f17275s.getTop() + i9, i8, i9);
            m23777J(motionEvent);
        }
    }

    public final void m23780G() {
        this.f17268l.computeCurrentVelocity(1000, this.f17269m);
        m23753q(m23762h(this.f17268l.getXVelocity(this.f17259c), this.f17270n, this.f17269m), m23762h(this.f17268l.getYVelocity(this.f17259c), this.f17270n, this.f17269m));
    }

    public final void m23779H(float f, float f2, int i) {
        boolean d = m23766d(f, f2, i, 1);
        if (m23766d(f2, f, i, 4)) {
            d |= true;
        }
        if (m23766d(f, f2, i, 2)) {
            boolean z = d ? 1 : 0;
            char c = d ? 1 : 0;
            d = z | true;
        }
        if (m23766d(f2, f, i, 8)) {
            boolean z2 = d ? 1 : 0;
            char c2 = d ? 1 : 0;
            d = z2 | true;
        }
        if (d) {
            int[] iArr = this.f17265i;
            iArr[i] = iArr[i] | (d ? 1 : 0);
            AbstractC5166c cVar = this.f17274r;
            int i2 = d ? 1 : 0;
            int i3 = d ? 1 : 0;
            int i4 = d ? 1 : 0;
            cVar.mo23738f(i2, i);
        }
    }

    public final void m23778I(float f, float f2, int i) {
        m23750t(i);
        float[] fArr = this.f17260d;
        this.f17262f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f17261e;
        this.f17263g[i] = f2;
        fArr2[i] = f2;
        this.f17264h[i] = m23745y((int) f, (int) f2);
        this.f17267k |= 1 << i;
    }

    public final void m23777J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m23783D(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f17262f[pointerId] = x;
                this.f17263g[pointerId] = y;
            }
        }
    }

    public void m23776K(int i) {
        this.f17277u.removeCallbacks(this.f17278v);
        if (this.f17257a != i) {
            this.f17257a = i;
            this.f17274r.mo23734j(i);
            if (this.f17257a == 0) {
                this.f17275s = null;
            }
        }
    }

    public void m23775L(int i) {
        this.f17272p = i;
    }

    public void m23774M(float f) {
        this.f17270n = f;
    }

    public boolean m23773N(int i, int i2) {
        if (this.f17276t) {
            return m23748v(i, i2, (int) this.f17268l.getXVelocity(this.f17259c), (int) this.f17268l.getYVelocity(this.f17259c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public boolean m23772O(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: p114i1.C5163a.m23772O(android.view.MotionEvent):boolean");
    }

    public boolean m23771P(View view, int i, int i2) {
        this.f17275s = view;
        this.f17259c = -1;
        boolean v = m23748v(i, i2, 0, 0);
        if (!v && this.f17257a == 0 && this.f17275s != null) {
            this.f17275s = null;
        }
        return v;
    }

    public boolean m23770Q(View view, int i) {
        if (view == this.f17275s && this.f17259c == i) {
            return true;
        }
        if (view == null || !this.f17274r.mo23731m(view, i)) {
            return false;
        }
        this.f17259c = i;
        m23767c(view, i);
        return true;
    }

    public void m23769a() {
        m23768b();
        if (this.f17257a == 2) {
            int currX = this.f17273q.getCurrX();
            int currY = this.f17273q.getCurrY();
            this.f17273q.abortAnimation();
            int currX2 = this.f17273q.getCurrX();
            int currY2 = this.f17273q.getCurrY();
            this.f17274r.mo23733k(this.f17275s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m23776K(0);
    }

    public void m23768b() {
        this.f17259c = -1;
        m23760j();
        VelocityTracker velocityTracker = this.f17268l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17268l = null;
        }
    }

    public void m23767c(View view, int i) {
        if (view.getParent() == this.f17277u) {
            this.f17275s = view;
            this.f17259c = i;
            this.f17274r.mo23735i(view, i);
            m23776K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f17277u + ")");
    }

    public final boolean m23766d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f17264h[i] & i2) != i2 || (this.f17272p & i2) == 0 || (this.f17266j[i] & i2) == i2 || (this.f17265i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f17258b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f17274r.mo23737g(i2)) {
            return (this.f17265i[i] & i2) == 0 && abs > ((float) this.f17258b);
        }
        int[] iArr = this.f17266j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    public boolean m23765e(int i) {
        int length = this.f17260d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m23764f(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean m23764f(int i, int i2) {
        if (!m23784C(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f17262f[i2] - this.f17260d[i2];
        float f2 = this.f17263g[i2] - this.f17261e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f17258b) : z2 && Math.abs(f2) > ((float) this.f17258b);
        }
        int i3 = this.f17258b;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    public final boolean m23763g(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f17274r.mo23740d(view) > 0;
        boolean z2 = this.f17274r.m23739e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f17258b) : z2 && Math.abs(f2) > ((float) this.f17258b);
        }
        int i = this.f17258b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    public final float m23762h(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public final int m23761i(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final void m23760j() {
        float[] fArr = this.f17260d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f17261e, 0.0f);
            Arrays.fill(this.f17262f, 0.0f);
            Arrays.fill(this.f17263g, 0.0f);
            Arrays.fill(this.f17264h, 0);
            Arrays.fill(this.f17265i, 0);
            Arrays.fill(this.f17266j, 0);
            this.f17267k = 0;
        }
    }

    public final void m23759k(int i) {
        if (this.f17260d != null && m23784C(i)) {
            this.f17260d[i] = 0.0f;
            this.f17261e[i] = 0.0f;
            this.f17262f[i] = 0.0f;
            this.f17263g[i] = 0.0f;
            this.f17264h[i] = 0;
            this.f17265i[i] = 0;
            this.f17266j[i] = 0;
            this.f17267k = (~(1 << i)) & this.f17267k;
        }
    }

    public final int m23758l(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f17277u.getWidth();
        float f = width / 2;
        float r = f + (m23752r(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(r / abs) * 1000.0f) * 4;
        } else {
            i4 = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    public final int m23757m(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = m23761i(i3, (int) this.f17270n, (int) this.f17269m);
        int i6 = m23761i(i4, (int) this.f17270n, (int) this.f17269m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (i5 != 0) {
            f2 = abs3;
            f = i7;
        } else {
            f2 = abs;
            f = i8;
        }
        float f5 = f2 / f;
        if (i6 != 0) {
            f4 = abs4;
            f3 = i7;
        } else {
            f4 = abs2;
            f3 = i8;
        }
        return (int) ((m23758l(i, i5, this.f17274r.mo23740d(view)) * f5) + (m23758l(i2, i6, this.f17274r.m23739e(view)) * (f4 / f3)));
    }

    public boolean m23756n(boolean z) {
        if (this.f17257a == 2) {
            boolean computeScrollOffset = this.f17273q.computeScrollOffset();
            int currX = this.f17273q.getCurrX();
            int currY = this.f17273q.getCurrY();
            int left = currX - this.f17275s.getLeft();
            int top = currY - this.f17275s.getTop();
            if (left != 0) {
                C1489y.m36755O(this.f17275s, left);
            }
            if (top != 0) {
                C1489y.m36754P(this.f17275s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f17274r.mo23733k(this.f17275s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f17273q.getFinalX() && currY == this.f17273q.getFinalY()) {
                this.f17273q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f17277u.post(this.f17278v);
                } else {
                    m23776K(0);
                }
            }
        }
        return this.f17257a == 2;
    }

    public final void m23753q(float f, float f2) {
        this.f17276t = true;
        this.f17274r.mo23732l(this.f17275s, f, f2);
        this.f17276t = false;
        if (this.f17257a == 1) {
            m23776K(0);
        }
    }

    public final float m23752r(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public final void m23751s(int i, int i2, int i3, int i4) {
        int left = this.f17275s.getLeft();
        int top = this.f17275s.getTop();
        if (i3 != 0) {
            i = this.f17274r.mo23743a(this.f17275s, i, i3);
            C1489y.m36755O(this.f17275s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f17274r.mo23742b(this.f17275s, i2, i4);
            C1489y.m36754P(this.f17275s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f17274r.mo23733k(this.f17275s, i5, i6, i5 - left, i6 - top);
        }
    }

    public final void m23750t(int i) {
        float[] fArr = this.f17260d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f17261e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f17262f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f17263g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f17264h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f17265i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f17266j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f17260d = fArr2;
            this.f17261e = fArr3;
            this.f17262f = fArr4;
            this.f17263g = fArr5;
            this.f17264h = iArr;
            this.f17265i = iArr2;
            this.f17266j = iArr3;
        }
    }

    public View m23749u(int i, int i2) {
        for (int childCount = this.f17277u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f17277u.getChildAt(this.f17274r.m23741c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean m23748v(int i, int i2, int i3, int i4) {
        int left = this.f17275s.getLeft();
        int top = this.f17275s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f17273q.abortAnimation();
            m23776K(0);
            return false;
        }
        this.f17273q.startScroll(left, top, i5, i6, m23757m(this.f17275s, i5, i6, i3, i4));
        m23776K(2);
        return true;
    }

    public View m23747w() {
        return this.f17275s;
    }

    public int m23746x() {
        return this.f17271o;
    }

    public final int m23745y(int i, int i2) {
        int i3 = i < this.f17277u.getLeft() + this.f17271o ? 1 : 0;
        if (i2 < this.f17277u.getTop() + this.f17271o) {
            i3 |= 4;
        }
        if (i > this.f17277u.getRight() - this.f17271o) {
            i3 |= 2;
        }
        return i2 > this.f17277u.getBottom() - this.f17271o ? i3 | 8 : i3;
    }

    public int m23744z() {
        return this.f17258b;
    }
}
