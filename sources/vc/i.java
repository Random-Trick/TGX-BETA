package vc;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import c1.l;
import c1.t;
import c1.v;
import java.util.ArrayList;
import java.util.List;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import vc.i;

public class i extends RecyclerView.o implements RecyclerView.q {
    public long A;
    public float f25006d;
    public float f25007e;
    public float f25008f;
    public float f25009g;
    public float f25010h;
    public float f25011i;
    public e f25013k;
    public int f25015m;
    public int f25017o;
    public RecyclerView f25018p;
    public VelocityTracker f25020r;
    public List<RecyclerView.c0> f25021s;
    public List<Integer> f25022t;
    public c1.d f25026x;
    public Rect f25028z;
    public final List<View> f25003a = new ArrayList();
    public final float[] f25004b = new float[2];
    public RecyclerView.c0 f25005c = null;
    public int f25012j = -1;
    public int f25014l = 0;
    public List<g> f25016n = new ArrayList();
    public final Runnable f25019q = new a();
    public RecyclerView.k f25023u = null;
    public View f25024v = null;
    public int f25025w = -1;
    public final RecyclerView.s f25027y = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override
        public void run() {
            i iVar = i.this;
            if (iVar.f25005c != null && iVar.X()) {
                i iVar2 = i.this;
                RecyclerView.c0 c0Var = iVar2.f25005c;
                if (c0Var != null) {
                    iVar2.S(c0Var);
                }
                i.this.f25018p.removeCallbacks(i.this.f25019q);
                v.T(i.this.f25018p, this);
            }
        }
    }

    public class b implements RecyclerView.s {
        public b() {
        }

        @Override
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            i.this.f25026x.a(motionEvent);
            if (i.this.f25020r != null) {
                i.this.f25020r.addMovement(motionEvent);
            }
            if (i.this.f25012j != -1) {
                int c10 = l.c(motionEvent);
                int a10 = l.a(motionEvent, i.this.f25012j);
                if (a10 >= 0) {
                    i.this.F(c10, motionEvent, a10);
                }
                i iVar = i.this;
                RecyclerView.c0 c0Var = iVar.f25005c;
                if (c0Var != null) {
                    int i10 = 0;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 == 6) {
                                    int b10 = l.b(motionEvent);
                                    int d10 = l.d(motionEvent, b10);
                                    i iVar2 = i.this;
                                    if (d10 == iVar2.f25012j) {
                                        if (iVar2.f25020r != null) {
                                            i.this.f25020r.computeCurrentVelocity(1000, i.this.f25018p.getMaxFlingVelocity());
                                        }
                                        if (b10 == 0) {
                                            i10 = 1;
                                        }
                                        i.this.f25012j = l.d(motionEvent, i10);
                                        i iVar3 = i.this;
                                        iVar3.c0(motionEvent, iVar3.f25015m, b10);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        } else if (a10 >= 0) {
                            iVar.c0(motionEvent, iVar.f25015m, a10);
                            i.this.S(c0Var);
                            i.this.f25018p.removeCallbacks(i.this.f25019q);
                            i.this.f25019q.run();
                            i.this.f25018p.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    if (iVar.f25020r != null) {
                        i.this.f25020r.computeCurrentVelocity(1000, i.this.f25018p.getMaxFlingVelocity());
                    }
                    i.this.Y(null, 0);
                    i.this.f25012j = -1;
                }
            }
        }

        @Override
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int a10;
            g J;
            i.this.f25026x.a(motionEvent);
            int c10 = l.c(motionEvent);
            if (c10 == 0) {
                i.this.f25012j = l.d(motionEvent, 0);
                i.this.f25006d = motionEvent.getX();
                i.this.f25007e = motionEvent.getY();
                i.this.T();
                i iVar = i.this;
                if (iVar.f25005c == null && (J = iVar.J(motionEvent)) != null) {
                    i iVar2 = i.this;
                    iVar2.f25006d -= J.f25050j;
                    iVar2.f25007e -= J.f25051k;
                    iVar2.I(J.f25045e, true);
                    if (i.this.f25003a.remove(J.f25045e.f2982a)) {
                        i iVar3 = i.this;
                        iVar3.f25013k.i(iVar3.f25018p, J.f25045e);
                    }
                    i.this.Y(J.f25045e, J.f25046f);
                    i iVar4 = i.this;
                    iVar4.c0(motionEvent, iVar4.f25015m, 0);
                }
            } else if (c10 == 3 || c10 == 1) {
                i iVar5 = i.this;
                iVar5.f25012j = -1;
                iVar5.Y(null, 0);
            } else {
                int i10 = i.this.f25012j;
                if (i10 != -1 && (a10 = l.a(motionEvent, i10)) >= 0) {
                    i.this.F(c10, motionEvent, a10);
                }
            }
            if (i.this.f25020r != null) {
                i.this.f25020r.addMovement(motionEvent);
            }
            return i.this.f25005c != null;
        }

        @Override
        public void e(boolean z10) {
            if (z10) {
                i.this.Y(null, 0);
            }
        }
    }

    public class c extends g {
        public final int f25031p;
        public final RecyclerView.c0 f25032q;

        public c(RecyclerView.c0 c0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.c0 c0Var2) {
            super(c0Var, i10, i11, f10, f11, f12, f13);
            this.f25031p = i12;
            this.f25032q = c0Var2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f25052l) {
                if (this.f25031p <= 0) {
                    i iVar = i.this;
                    iVar.f25013k.i(iVar.f25018p, this.f25032q);
                } else {
                    i.this.f25003a.add(this.f25032q.f2982a);
                    this.f25049i = true;
                    int i10 = this.f25031p;
                    if (i10 > 0) {
                        i.this.U(this, i10);
                    }
                }
                View view = i.this.f25024v;
                View view2 = this.f25032q.f2982a;
                if (view == view2) {
                    i.this.W(view2);
                }
            }
        }
    }

    public class d implements Runnable {
        public final g f25034a;
        public final int f25035b;

        public d(g gVar, int i10) {
            this.f25034a = gVar;
            this.f25035b = i10;
        }

        @Override
        public void run() {
            if (i.this.f25018p != null && i.this.f25018p.isAttachedToWindow()) {
                g gVar = this.f25034a;
                if (!gVar.f25052l && gVar.f25045e.k() != -1) {
                    RecyclerView.m itemAnimator = i.this.f25018p.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.q(null)) && !i.this.O()) {
                        i.this.f25013k.J(this.f25034a.f25045e, this.f25035b);
                    } else {
                        i.this.f25018p.post(this);
                    }
                }
            }
        }
    }

    public static abstract class e {
        public static final Interpolator f25037b = k.f25071a;
        public static final Interpolator f25038c = j.f25059a;
        public int f25039a = -1;

        public static int A(int i10, int i11) {
            int z10 = z(0, i11 | i10);
            return z(2, i10) | z(1, i11) | z10;
        }

        public static int k(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        public static float x(float f10) {
            return f10 * f10 * f10 * f10 * f10;
        }

        public static float y(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }

        public static int z(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public abstract boolean B(RecyclerView.c0 c0Var, int i10);

        public abstract void C(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f10, float f11, int i10, boolean z10);

        public void D(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f10, float f11, int i10, boolean z10) {
        }

        public final void E(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, List<g> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                gVar.i();
                int save = canvas.save();
                C(canvas, recyclerView, gVar.f25045e, gVar.f25050j, gVar.f25051k, gVar.f25046f, false);
                canvas.restoreToCount(save);
            }
            if (c0Var != null) {
                int save2 = canvas.save();
                C(canvas, recyclerView, c0Var, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
        }

        public final void F(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, List<g> list, int i10, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                int save = canvas.save();
                D(canvas, recyclerView, gVar.f25045e, gVar.f25050j, gVar.f25051k, gVar.f25046f, false);
                canvas.restoreToCount(save);
            }
            if (c0Var != null) {
                int save2 = canvas.save();
                D(canvas, recyclerView, c0Var, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                g gVar2 = list.get(i12);
                if (gVar2.f25053m && !gVar2.f25049i) {
                    list.remove(i12);
                } else if (!gVar2.f25053m) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean G(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2);

        public void H(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10, RecyclerView.c0 c0Var2, int i11, int i12, int i13) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).a(c0Var.f2982a, c0Var2.f2982a, i12, i13);
                return;
            }
            if (layoutManager.k()) {
                if (layoutManager.Q(c0Var2.f2982a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.q1(i11);
                }
                if (layoutManager.T(c0Var2.f2982a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.q1(i11);
                }
            }
            if (layoutManager.l()) {
                if (layoutManager.U(c0Var2.f2982a) <= recyclerView.getPaddingTop()) {
                    recyclerView.q1(i11);
                }
                if (layoutManager.O(c0Var2.f2982a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.q1(i11);
                }
            }
        }

        public void I(RecyclerView.c0 c0Var, int i10) {
            if (c0Var != null) {
                c0Var.f2982a.invalidate();
            }
        }

        public abstract void J(RecyclerView.c0 c0Var, int i10);

        public boolean g(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            return true;
        }

        public RecyclerView.c0 h(RecyclerView.c0 c0Var, List<RecyclerView.c0> list, int i10, int i11) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i10 + c0Var.f2982a.getWidth();
            int height = i11 + c0Var.f2982a.getHeight();
            int left2 = i10 - c0Var.f2982a.getLeft();
            int top2 = i11 - c0Var.f2982a.getTop();
            int size = list.size();
            RecyclerView.c0 c0Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.c0 c0Var3 = list.get(i13);
                if (left2 > 0 && (right = c0Var3.f2982a.getRight() - width) < 0 && c0Var3.f2982a.getRight() > c0Var.f2982a.getRight() && (abs4 = Math.abs(right)) > i12) {
                    c0Var2 = c0Var3;
                    i12 = abs4;
                }
                if (left2 < 0 && (left = c0Var3.f2982a.getLeft() - i10) > 0 && c0Var3.f2982a.getLeft() < c0Var.f2982a.getLeft() && (abs3 = Math.abs(left)) > i12) {
                    c0Var2 = c0Var3;
                    i12 = abs3;
                }
                if (top2 < 0 && (top = c0Var3.f2982a.getTop() - i11) > 0 && c0Var3.f2982a.getTop() < c0Var.f2982a.getTop() && (abs2 = Math.abs(top)) > i12) {
                    c0Var2 = c0Var3;
                    i12 = abs2;
                }
                if (top2 > 0 && (bottom = c0Var3.f2982a.getBottom() - height) < 0 && c0Var3.f2982a.getBottom() > c0Var.f2982a.getBottom() && (abs = Math.abs(bottom)) > i12) {
                    c0Var2 = c0Var3;
                    i12 = abs;
                }
            }
            return c0Var2;
        }

        public void i(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        }

        public int j(int i10, int i11) {
            int i12;
            int i13 = i10 & 3158064;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (i15 & 3158064) >> 2;
            }
            return i14 | i12;
        }

        public final int l(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            return j(q(recyclerView, c0Var), v.v(recyclerView));
        }

        public long m(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i10 == 8 ? 200L : 120L;
            }
            if (i10 == 8) {
                return itemAnimator.n();
            }
            return itemAnimator.o();
        }

        public int n() {
            return 0;
        }

        @SuppressLint({"PrivateResource"})
        public final int o(RecyclerView recyclerView) {
            if (this.f25039a == -1) {
                try {
                    int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.d_res_0x7f050064);
                    this.f25039a = dimensionPixelSize;
                    Log.v("mCachedMaxScrollSpeed = %d", Integer.valueOf(dimensionPixelSize));
                } catch (Throwable th) {
                    Log.w("Cannot resolve maxScrollSpeed", th, new Object[0]);
                }
            }
            return this.f25039a;
        }

        public float p(RecyclerView.c0 c0Var) {
            return 0.5f;
        }

        public abstract int q(RecyclerView recyclerView, RecyclerView.c0 c0Var);

        public abstract float r(RecyclerView.c0 c0Var);

        public final boolean s(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            return (l(recyclerView, c0Var) & 16711680) != 0;
        }

        public final boolean t(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            return (l(recyclerView, c0Var) & 65280) != 0;
        }

        public int u(RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            float f10 = 1.0f;
            int signum = (int) (((int) Math.signum(i11)) * o(recyclerView) * f25038c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)));
            if (j10 <= 2000) {
                f10 = ((float) j10) / 2000.0f;
            }
            int interpolation = (int) (signum * f25037b.getInterpolation(f10));
            return interpolation == 0 ? i11 > 0 ? 1 : -1 : interpolation;
        }

        public abstract boolean v();

        public abstract boolean w();
    }

    public class f extends GestureDetector.SimpleOnGestureListener {
        public f() {
        }

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
            RecyclerView.c0 l02;
            View K = i.this.K(motionEvent);
            if (K != null && (l02 = i.this.f25018p.l0(K)) != null) {
                i iVar = i.this;
                if (iVar.f25013k.s(iVar.f25018p, l02)) {
                    int d10 = l.d(motionEvent, 0);
                    int i10 = i.this.f25012j;
                    if (d10 == i10) {
                        int a10 = l.a(motionEvent, i10);
                        float e10 = l.e(motionEvent, a10);
                        float f10 = l.f(motionEvent, a10);
                        i iVar2 = i.this;
                        iVar2.f25006d = e10;
                        iVar2.f25007e = f10;
                        iVar2.f25009g = 0.0f;
                        iVar2.f25008f = 0.0f;
                        if (iVar2.f25013k.w()) {
                            i.this.Y(l02, 2);
                        }
                    }
                }
            }
        }
    }

    public class g implements Animator.AnimatorListener {
        public final float f25041a;
        public final float f25042b;
        public final float f25043c;
        public final float f25044d;
        public final RecyclerView.c0 f25045e;
        public final int f25046f;
        public final ValueAnimator f25047g;
        public final int f25048h;
        public boolean f25049i;
        public float f25050j;
        public float f25051k;
        public boolean f25052l = false;
        public boolean f25053m = false;
        public float f25054n;

        public g(RecyclerView.c0 c0Var, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f25046f = i11;
            this.f25048h = i10;
            this.f25045e = c0Var;
            this.f25041a = f10;
            this.f25042b = f11;
            this.f25043c = f12;
            this.f25044d = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f25047g = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    i.g.this.e(valueAnimator);
                }
            });
            ofFloat.setTarget(c0Var.f2982a);
            ofFloat.addListener(this);
            g(0.0f);
        }

        public void e(ValueAnimator valueAnimator) {
            g(db.b.a(valueAnimator));
        }

        public void d() {
            this.f25047g.cancel();
        }

        public void f(long j10) {
            this.f25047g.setDuration(j10);
        }

        public void g(float f10) {
            this.f25054n = f10;
        }

        public void h() {
            this.f25045e.I(false);
            this.f25047g.start();
        }

        public void i() {
            float f10 = this.f25041a;
            float f11 = this.f25043c;
            if (f10 == f11) {
                this.f25050j = v.C(this.f25045e.f2982a);
            } else {
                this.f25050j = f10 + (this.f25054n * (f11 - f10));
            }
            float f12 = this.f25042b;
            float f13 = this.f25044d;
            if (f12 == f13) {
                this.f25051k = v.D(this.f25045e.f2982a);
            } else {
                this.f25051k = f12 + (this.f25054n * (f13 - f12));
            }
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            g(1.0f);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!this.f25053m) {
                this.f25045e.I(true);
            }
            this.f25053m = true;
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
        }

        @Override
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface h {
        void a(View view, View view2, int i10, int i11);
    }

    public i(e eVar) {
        this.f25013k = eVar;
    }

    public static boolean P(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    public final void C() {
    }

    public void D(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f25018p;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                H();
            }
            this.f25018p = recyclerView;
            if (recyclerView != null) {
                Z();
            }
        }
    }

    public final int E(RecyclerView.c0 c0Var, int i10) {
        int i11;
        if ((i10 & 12) != 0) {
            int i12 = 8;
            int i13 = this.f25008f > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f25020r;
            if (velocityTracker != null && (i11 = this.f25012j) > -1) {
                float a10 = t.a(velocityTracker, i11);
                if (a10 <= 0.0f) {
                    i12 = 4;
                }
                if ((i12 & i10) != 0 && i13 == i12 && Math.abs(a10) >= this.f25018p.getMinFlingVelocity()) {
                    if (this.f25013k.B(c0Var, i12)) {
                        return 0;
                    }
                    return i12;
                }
            }
            float width = this.f25018p.getWidth() * this.f25013k.r(c0Var);
            if ((i10 & i13) != 0 && Math.abs(this.f25008f) > width && !this.f25013k.B(c0Var, i13)) {
                return i13;
            }
        }
        return 0;
    }

    public final boolean F(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.c0 M;
        int l10;
        if (this.f25005c != null || i10 != 2 || this.f25014l == 2 || !this.f25013k.v() || this.f25018p.getScrollState() == 1 || (M = M(motionEvent)) == null || (l10 = (this.f25013k.l(this.f25018p, M) & 65280) >> 8) == 0) {
            return false;
        }
        float e10 = l.e(motionEvent, i11);
        float f10 = l.f(motionEvent, i11);
        float f11 = e10 - this.f25006d;
        float f12 = f10 - this.f25007e;
        float abs = Math.abs(f11);
        float abs2 = Math.abs(f12);
        int i12 = this.f25017o;
        if (abs < i12 && abs2 < i12) {
            return false;
        }
        if (abs > abs2) {
            if (f11 < 0.0f && (l10 & 4) == 0) {
                return false;
            }
            if (f11 > 0.0f && (l10 & 8) == 0) {
                return false;
            }
        } else if (f12 < 0.0f && (l10 & 1) == 0) {
            return false;
        } else {
            if (f12 > 0.0f && (l10 & 2) == 0) {
                return false;
            }
        }
        this.f25009g = 0.0f;
        this.f25008f = 0.0f;
        this.f25012j = l.d(motionEvent, 0);
        Y(M, 1);
        return true;
    }

    public final int G(RecyclerView.c0 c0Var, int i10) {
        int i11;
        if ((i10 & 3) != 0) {
            int i12 = 2;
            int i13 = this.f25009g > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f25020r;
            if (velocityTracker != null && (i11 = this.f25012j) > -1) {
                float b10 = t.b(velocityTracker, i11);
                if (b10 <= 0.0f) {
                    i12 = 1;
                }
                if ((i12 & i10) != 0 && i12 == i13 && Math.abs(b10) >= this.f25018p.getMinFlingVelocity()) {
                    if (this.f25013k.B(c0Var, i12)) {
                        return 0;
                    }
                    return i12;
                }
            }
            float height = this.f25018p.getHeight() * this.f25013k.r(c0Var);
            if ((i10 & i13) != 0 && Math.abs(this.f25009g) > height && !this.f25013k.B(c0Var, i13)) {
                return i13;
            }
        }
        return 0;
    }

    public final void H() {
        this.f25018p.e1(this);
        this.f25018p.g1(this.f25027y);
        this.f25018p.f1(this);
        for (int size = this.f25016n.size() - 1; size >= 0; size--) {
            this.f25013k.i(this.f25018p, this.f25016n.get(0).f25045e);
        }
        this.f25016n.clear();
        this.f25024v = null;
        this.f25025w = -1;
        V();
    }

    public final int I(RecyclerView.c0 c0Var, boolean z10) {
        for (int size = this.f25016n.size() - 1; size >= 0; size--) {
            g gVar = this.f25016n.get(size);
            if (gVar.f25045e == c0Var) {
                gVar.f25052l |= z10;
                if (!gVar.f25053m) {
                    gVar.d();
                }
                this.f25016n.remove(size);
                return gVar.f25048h;
            }
        }
        return 0;
    }

    public final g J(MotionEvent motionEvent) {
        if (this.f25016n.isEmpty()) {
            return null;
        }
        View K = K(motionEvent);
        for (int size = this.f25016n.size() - 1; size >= 0; size--) {
            g gVar = this.f25016n.get(size);
            if (gVar.f25045e.f2982a == K) {
                return gVar;
            }
        }
        return null;
    }

    public final View K(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.c0 c0Var = this.f25005c;
        if (c0Var != null) {
            View view = c0Var.f2982a;
            if (P(view, x10, y10, this.f25010h + this.f25008f, this.f25011i + this.f25009g)) {
                return view;
            }
        }
        for (int size = this.f25016n.size() - 1; size >= 0; size--) {
            g gVar = this.f25016n.get(size);
            View view2 = gVar.f25045e.f2982a;
            if (P(view2, x10, y10, gVar.f25050j, gVar.f25051k)) {
                return view2;
            }
        }
        return this.f25018p.X(x10, y10);
    }

    public final List<RecyclerView.c0> L(RecyclerView.c0 c0Var) {
        RecyclerView.c0 c0Var2 = c0Var;
        List<RecyclerView.c0> list = this.f25021s;
        if (list == null) {
            this.f25021s = new ArrayList();
            this.f25022t = new ArrayList();
        } else {
            list.clear();
            this.f25022t.clear();
        }
        int n10 = this.f25013k.n();
        int round = Math.round(this.f25010h + this.f25008f) - n10;
        int round2 = Math.round(this.f25011i + this.f25009g) - n10;
        int i10 = n10 * 2;
        int width = c0Var2.f2982a.getWidth() + round + i10;
        int height = c0Var2.f2982a.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.p layoutManager = this.f25018p.getLayoutManager();
        int J = layoutManager.J();
        int i13 = 0;
        while (i13 < J) {
            View I = layoutManager.I(i13);
            if (I != c0Var2.f2982a && I.getBottom() >= round2 && I.getTop() <= height && I.getRight() >= round && I.getLeft() <= width) {
                RecyclerView.c0 l02 = this.f25018p.l0(I);
                if (this.f25013k.g(this.f25018p, this.f25005c, l02)) {
                    int abs = Math.abs(i11 - ((I.getLeft() + I.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((I.getTop() + I.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.f25021s.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > this.f25022t.get(i16).intValue(); i16++) {
                        i15++;
                    }
                    this.f25021s.add(i15, l02);
                    this.f25022t.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            c0Var2 = c0Var;
        }
        return this.f25021s;
    }

    public final RecyclerView.c0 M(MotionEvent motionEvent) {
        View K;
        RecyclerView.p layoutManager = this.f25018p.getLayoutManager();
        int i10 = this.f25012j;
        if (i10 == -1) {
            return null;
        }
        int a10 = l.a(motionEvent, i10);
        float abs = Math.abs(l.e(motionEvent, a10) - this.f25006d);
        float abs2 = Math.abs(l.f(motionEvent, a10) - this.f25007e);
        int i11 = this.f25017o;
        if (abs < i11 && abs2 < i11) {
            return null;
        }
        if (abs > abs2 && layoutManager.k()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.l()) && (K = K(motionEvent)) != null) {
            return this.f25018p.l0(K);
        }
        return null;
    }

    public final void N(float[] fArr) {
        if ((this.f25015m & 12) != 0) {
            fArr[0] = (this.f25010h + this.f25008f) - this.f25005c.f2982a.getLeft();
        } else {
            fArr[0] = v.C(this.f25005c.f2982a);
        }
        if ((this.f25015m & 3) != 0) {
            fArr[1] = (this.f25011i + this.f25009g) - this.f25005c.f2982a.getTop();
        } else {
            fArr[1] = v.D(this.f25005c.f2982a);
        }
    }

    public final boolean O() {
        int size = this.f25016n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f25016n.get(i10).f25053m) {
                return true;
            }
        }
        return false;
    }

    public void Q(RecyclerView.c0 c0Var, int i10) {
        I(c0Var, false);
        if (this.f25003a.remove(c0Var.f2982a)) {
            this.f25013k.i(this.f25018p, c0Var);
        }
        Y(null, 0);
    }

    public final void R() {
        if (this.f25026x == null) {
            this.f25026x = new c1.d(this.f25018p.getContext(), new f());
        }
    }

    public final void S(RecyclerView.c0 c0Var) {
        if (!this.f25018p.isLayoutRequested() && this.f25014l == 2) {
            float p10 = this.f25013k.p(c0Var);
            int i10 = (int) (this.f25010h + this.f25008f);
            int i11 = (int) (this.f25011i + this.f25009g);
            if (Math.abs(i11 - c0Var.f2982a.getTop()) >= c0Var.f2982a.getHeight() * p10 || Math.abs(i10 - c0Var.f2982a.getLeft()) >= c0Var.f2982a.getWidth() * p10) {
                List<RecyclerView.c0> L = L(c0Var);
                if (L.size() != 0) {
                    RecyclerView.c0 h10 = this.f25013k.h(c0Var, L, i10, i11);
                    if (h10 == null) {
                        this.f25021s.clear();
                        this.f25022t.clear();
                        return;
                    }
                    int k10 = h10.k();
                    int k11 = c0Var.k();
                    if (this.f25013k.G(this.f25018p, c0Var, h10)) {
                        this.f25013k.H(this.f25018p, c0Var, k11, h10, k10, i10, i11);
                    }
                }
            }
        }
    }

    public final void T() {
        VelocityTracker velocityTracker = this.f25020r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f25020r = VelocityTracker.obtain();
    }

    public final void U(g gVar, int i10) {
        this.f25018p.post(new d(gVar, i10));
    }

    public final void V() {
        VelocityTracker velocityTracker = this.f25020r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f25020r = null;
        }
    }

    public final void W(View view) {
        if (view == this.f25024v) {
            this.f25024v = null;
            if (this.f25023u != null) {
                this.f25018p.setChildDrawingOrderCallback(null);
            }
        }
    }

    public final boolean X() {
        throw new UnsupportedOperationException("Method not decompiled: vc.i.X():boolean");
    }

    public final void Y(androidx.recyclerview.widget.RecyclerView.c0 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: vc.i.Y(androidx.recyclerview.widget.RecyclerView$c0, int):void");
    }

    public final void Z() {
        this.f25017o = ViewConfiguration.get(this.f25018p.getContext()).getScaledTouchSlop();
        this.f25018p.g(this);
        this.f25018p.j(this.f25027y);
        this.f25018p.i(this);
        R();
    }

    public void a0(RecyclerView.c0 c0Var) {
        if (this.f25013k.t(this.f25018p, c0Var)) {
            if (c0Var.f2982a.getParent() != this.f25018p) {
                Log.e("Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.", new Object[0]);
                return;
            }
            T();
            this.f25009g = 0.0f;
            this.f25008f = 0.0f;
            Y(c0Var, 1);
        }
    }

    @Override
    public void b(View view) {
        W(view);
        RecyclerView.c0 l02 = this.f25018p.l0(view);
        if (l02 != null) {
            RecyclerView.c0 c0Var = this.f25005c;
            if (c0Var == null || l02 != c0Var) {
                I(l02, false);
                if (this.f25003a.remove(l02.f2982a)) {
                    this.f25013k.i(this.f25018p, l02);
                    return;
                }
                return;
            }
            Y(null, 0);
        }
    }

    public final int b0(RecyclerView.c0 c0Var) {
        if (this.f25014l == 2) {
            return 0;
        }
        int q10 = this.f25013k.q(this.f25018p, c0Var);
        int j10 = (this.f25013k.j(q10, v.v(this.f25018p)) & 65280) >> 8;
        if (j10 == 0) {
            return 0;
        }
        int i10 = (q10 & 65280) >> 8;
        if (Math.abs(this.f25008f) > Math.abs(this.f25009g)) {
            int E = E(c0Var, j10);
            if (E > 0) {
                return (i10 & E) == 0 ? e.k(E, v.v(this.f25018p)) : E;
            }
            int G = G(c0Var, j10);
            if (G > 0) {
                return G;
            }
        } else {
            int G2 = G(c0Var, j10);
            if (G2 > 0) {
                return G2;
            }
            int E2 = E(c0Var, j10);
            if (E2 > 0) {
                return (i10 & E2) == 0 ? e.k(E2, v.v(this.f25018p)) : E2;
            }
        }
        return 0;
    }

    public final void c0(MotionEvent motionEvent, int i10, int i11) {
        float e10 = l.e(motionEvent, i11);
        float f10 = l.f(motionEvent, i11);
        float f11 = e10 - this.f25006d;
        this.f25008f = f11;
        this.f25009g = f10 - this.f25007e;
        if ((i10 & 4) == 0) {
            this.f25008f = Math.max(0.0f, f11);
        }
        if ((i10 & 8) == 0) {
            this.f25008f = Math.min(0.0f, this.f25008f);
        }
        if ((i10 & 1) == 0) {
            this.f25009g = Math.max(0.0f, this.f25009g);
        }
        if ((i10 & 2) == 0) {
            this.f25009g = Math.min(0.0f, this.f25009g);
        }
    }

    @Override
    public void d(View view) {
    }

    @Override
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.setEmpty();
    }

    @Override
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f10;
        float f11;
        this.f25025w = -1;
        if (this.f25005c != null) {
            N(this.f25004b);
            float[] fArr = this.f25004b;
            f11 = fArr[0];
            f10 = fArr[1];
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.f25013k.E(canvas, recyclerView, this.f25005c, this.f25016n, this.f25014l, f11, f10);
    }

    @Override
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f10;
        float f11;
        if (this.f25005c != null) {
            N(this.f25004b);
            float[] fArr = this.f25004b;
            f11 = fArr[0];
            f10 = fArr[1];
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        this.f25013k.F(canvas, recyclerView, this.f25005c, this.f25016n, this.f25014l, f11, f10);
    }
}
