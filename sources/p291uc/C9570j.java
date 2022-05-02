package p291uc;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p028c1.C1441d;
import p028c1.C1476l;
import p028c1.C1487w;
import p028c1.C1489y;
import p037cb.C2057b;
import p291uc.C9570j;

public class C9570j extends RecyclerView.AbstractC0901o implements RecyclerView.AbstractC0907q {
    public long f31027A;
    public float f31031d;
    public float f31032e;
    public float f31033f;
    public float f31034g;
    public float f31035h;
    public float f31036i;
    public AbstractC9575e f31038k;
    public int f31040m;
    public int f31042o;
    public RecyclerView f31043p;
    public VelocityTracker f31045r;
    public List<RecyclerView.AbstractC0886d0> f31046s;
    public List<Integer> f31047t;
    public C1441d f31051x;
    public Rect f31053z;
    public final List<View> f31028a = new ArrayList();
    public final float[] f31029b = new float[2];
    public RecyclerView.AbstractC0886d0 f31030c = null;
    public int f31037j = -1;
    public int f31039l = 0;
    public List<C9577g> f31041n = new ArrayList();
    public final Runnable f31044q = new RunnableC9571a();
    public RecyclerView.AbstractC0894k f31048u = null;
    public View f31049v = null;
    public int f31050w = -1;
    public final RecyclerView.AbstractC0909s f31052y = new C9572b();

    public class RunnableC9571a implements Runnable {
        public RunnableC9571a() {
        }

        @Override
        public void run() {
            C9570j jVar = C9570j.this;
            if (jVar.f31030c != null && jVar.m8199Z()) {
                C9570j jVar2 = C9570j.this;
                RecyclerView.AbstractC0886d0 d0Var = jVar2.f31030c;
                if (d0Var != null) {
                    jVar2.m8204U(d0Var);
                }
                C9570j.this.f31043p.removeCallbacks(C9570j.this.f31044q);
                C1489y.m36749U(C9570j.this.f31043p, this);
            }
        }
    }

    public class C9572b implements RecyclerView.AbstractC0909s {
        public C9572b() {
        }

        @Override
        public void mo8175a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C9570j.this.f31051x.m36910a(motionEvent);
            if (C9570j.this.f31045r != null) {
                C9570j.this.f31045r.addMovement(motionEvent);
            }
            if (C9570j.this.f31037j != -1) {
                int c = C1476l.m36807c(motionEvent);
                int a = C1476l.m36809a(motionEvent, C9570j.this.f31037j);
                if (a >= 0) {
                    C9570j.this.m8218G(c, motionEvent, a);
                }
                C9570j jVar = C9570j.this;
                RecyclerView.AbstractC0886d0 d0Var = jVar.f31030c;
                if (d0Var != null) {
                    int i = 0;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c == 6) {
                                    int b = C1476l.m36808b(motionEvent);
                                    int d = C1476l.m36806d(motionEvent, b);
                                    C9570j jVar2 = C9570j.this;
                                    if (d == jVar2.f31037j) {
                                        if (jVar2.f31045r != null) {
                                            C9570j.this.f31045r.computeCurrentVelocity(1000, C9570j.this.f31043p.getMaxFlingVelocity());
                                        }
                                        if (b == 0) {
                                            i = 1;
                                        }
                                        C9570j.this.f31037j = C1476l.m36806d(motionEvent, i);
                                        C9570j jVar3 = C9570j.this;
                                        jVar3.m8192e0(motionEvent, jVar3.f31040m, b);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        } else if (a >= 0) {
                            jVar.m8192e0(motionEvent, jVar.f31040m, a);
                            C9570j.this.m8204U(d0Var);
                            C9570j.this.f31043p.removeCallbacks(C9570j.this.f31044q);
                            C9570j.this.f31044q.run();
                            C9570j.this.f31043p.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    if (jVar.f31045r != null) {
                        C9570j.this.f31045r.computeCurrentVelocity(1000, C9570j.this.f31043p.getMaxFlingVelocity());
                    }
                    C9570j.this.m8198a0(null, 0);
                    C9570j.this.f31037j = -1;
                }
            }
        }

        @Override
        public boolean mo8174c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int a;
            C9577g K;
            C9570j.this.f31051x.m36910a(motionEvent);
            int c = C1476l.m36807c(motionEvent);
            if (c == 0) {
                C9570j.this.f31037j = C1476l.m36806d(motionEvent, 0);
                C9570j.this.f31031d = motionEvent.getX();
                C9570j.this.f31032e = motionEvent.getY();
                C9570j.this.m8203V();
                C9570j jVar = C9570j.this;
                if (jVar.f31030c == null && (K = jVar.m8214K(motionEvent)) != null) {
                    C9570j jVar2 = C9570j.this;
                    jVar2.f31031d -= K.f31075j;
                    jVar2.f31032e -= K.f31076k;
                    jVar2.m8215J(K.f31070e, true);
                    if (C9570j.this.f31028a.remove(K.f31070e.f3479a)) {
                        C9570j jVar3 = C9570j.this;
                        jVar3.f31038k.m8154i(jVar3.f31043p, K.f31070e);
                    }
                    C9570j.this.m8198a0(K.f31070e, K.f31071f);
                    C9570j jVar4 = C9570j.this;
                    jVar4.m8192e0(motionEvent, jVar4.f31040m, 0);
                }
            } else if (c == 3 || c == 1) {
                C9570j jVar5 = C9570j.this;
                jVar5.f31037j = -1;
                jVar5.m8198a0(null, 0);
            } else {
                int i = C9570j.this.f31037j;
                if (i != -1 && (a = C1476l.m36809a(motionEvent, i)) >= 0) {
                    C9570j.this.m8218G(c, motionEvent, a);
                }
            }
            if (C9570j.this.f31045r != null) {
                C9570j.this.f31045r.addMovement(motionEvent);
            }
            return C9570j.this.f31030c != null;
        }

        @Override
        public void mo8173e(boolean z) {
            if (z) {
                C9570j.this.m8198a0(null, 0);
            }
        }
    }

    public class C9573c extends C9577g {
        public final int f31056p;
        public final RecyclerView.AbstractC0886d0 f31057q;

        public C9573c(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.AbstractC0886d0 d0Var2) {
            super(d0Var, i, i2, f, f2, f3, f4);
            this.f31056p = i3;
            this.f31057q = d0Var2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f31077l) {
                if (this.f31056p <= 0) {
                    C9570j jVar = C9570j.this;
                    jVar.f31038k.m8154i(jVar.f31043p, this.f31057q);
                } else {
                    C9570j.this.f31028a.add(this.f31057q.f3479a);
                    this.f31074i = true;
                    int i = this.f31056p;
                    if (i > 0) {
                        C9570j.this.m8202W(this, i);
                    }
                }
                View view = C9570j.this.f31049v;
                View view2 = this.f31057q.f3479a;
                if (view == view2) {
                    C9570j.this.m8200Y(view2);
                }
            }
        }
    }

    public class RunnableC9574d implements Runnable {
        public final C9577g f31059a;
        public final int f31060b;

        public RunnableC9574d(C9577g gVar, int i) {
            this.f31059a = gVar;
            this.f31060b = i;
        }

        @Override
        public void run() {
            if (C9570j.this.f31043p != null && C9570j.this.f31043p.isAttachedToWindow()) {
                C9577g gVar = this.f31059a;
                if (!gVar.f31077l && gVar.f31070e.m39335k() != -1) {
                    RecyclerView.AbstractC0896m itemAnimator = C9570j.this.f31043p.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.m39284q(null)) && !C9570j.this.m8209P()) {
                        C9570j.this.f31038k.mo8163J(this.f31059a.f31070e, this.f31060b);
                    } else {
                        C9570j.this.f31043p.post(this);
                    }
                }
            }
        }
    }

    public static abstract class AbstractC9575e {
        public static final Interpolator f31062b = animationInterpolatorC9595l.f31114a;
        public static final Interpolator f31063c = animationInterpolatorC9584k.f31089a;
        public int f31064a = -1;

        public static int m8172A(int i, int i2) {
            int z = m8137z(0, i2 | i);
            return m8137z(2, i) | m8137z(1, i2) | z;
        }

        public static int m8152k(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        public static float m8139x(float f) {
            return f * f * f * f * f;
        }

        public static float m8138y(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }

        public static int m8137z(int i, int i2) {
            return i2 << (i * 8);
        }

        public abstract boolean mo8171B(RecyclerView.AbstractC0886d0 d0Var, int i);

        public abstract void mo8170C(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, float f, float f2, int i, boolean z);

        public void m8169D(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, float f, float f2, int i, boolean z) {
        }

        public final void m8168E(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, List<C9577g> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C9577g gVar = list.get(i2);
                gVar.m8128i();
                int save = canvas.save();
                mo8170C(canvas, recyclerView, gVar.f31070e, gVar.f31075j, gVar.f31076k, gVar.f31071f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                mo8170C(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public final void m8167F(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, List<C9577g> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C9577g gVar = list.get(i2);
                int save = canvas.save();
                m8169D(canvas, recyclerView, gVar.f31070e, gVar.f31075j, gVar.f31076k, gVar.f31071f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                m8169D(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C9577g gVar2 = list.get(i3);
                if (gVar2.f31078m && !gVar2.f31074i) {
                    list.remove(i3);
                } else if (!gVar2.f31078m) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean mo8166G(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2);

        public void m8165H(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i, RecyclerView.AbstractC0886d0 d0Var2, int i2, int i3, int i4) {
            RecyclerView.AbstractC0902p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof AbstractC9578h) {
                ((AbstractC9578h) layoutManager).m8127a(d0Var.f3479a, d0Var2.f3479a, i3, i4);
                return;
            }
            if (layoutManager.mo39043k()) {
                if (layoutManager.m39237Q(d0Var2.f3479a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.m39401r1(i2);
                }
                if (layoutManager.m39232T(d0Var2.f3479a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.m39401r1(i2);
                }
            }
            if (layoutManager.mo39041l()) {
                if (layoutManager.m39231U(d0Var2.f3479a) <= recyclerView.getPaddingTop()) {
                    recyclerView.m39401r1(i2);
                }
                if (layoutManager.m39241O(d0Var2.f3479a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.m39401r1(i2);
                }
            }
        }

        public void m8164I(RecyclerView.AbstractC0886d0 d0Var, int i) {
            if (d0Var != null) {
                d0Var.f3479a.invalidate();
            }
        }

        public abstract void mo8163J(RecyclerView.AbstractC0886d0 d0Var, int i);

        public boolean m8156g(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            return true;
        }

        public RecyclerView.AbstractC0886d0 m8155h(RecyclerView.AbstractC0886d0 d0Var, List<RecyclerView.AbstractC0886d0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + d0Var.f3479a.getWidth();
            int height = i2 + d0Var.f3479a.getHeight();
            int left2 = i - d0Var.f3479a.getLeft();
            int top2 = i2 - d0Var.f3479a.getTop();
            int size = list.size();
            RecyclerView.AbstractC0886d0 d0Var2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.AbstractC0886d0 d0Var3 = list.get(i4);
                if (left2 > 0 && (right = d0Var3.f3479a.getRight() - width) < 0 && d0Var3.f3479a.getRight() > d0Var.f3479a.getRight() && (abs4 = Math.abs(right)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = d0Var3.f3479a.getLeft() - i) > 0 && d0Var3.f3479a.getLeft() < d0Var.f3479a.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = d0Var3.f3479a.getTop() - i2) > 0 && d0Var3.f3479a.getTop() < d0Var.f3479a.getTop() && (abs2 = Math.abs(top)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = d0Var3.f3479a.getBottom() - height) < 0 && d0Var3.f3479a.getBottom() > d0Var.f3479a.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = abs;
                }
            }
            return d0Var2;
        }

        public void m8154i(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
        }

        public int m8153j(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public final int m8151l(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            return m8153j(mo8146q(recyclerView, d0Var), C1489y.m36705v(recyclerView));
        }

        public long m8150m(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.AbstractC0896m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 120L;
            }
            if (i == 8) {
                return itemAnimator.m39286n();
            }
            return itemAnimator.m39285o();
        }

        public int m8149n() {
            return 0;
        }

        @SuppressLint({"PrivateResource"})
        public final int m8148o(RecyclerView recyclerView) {
            if (this.f31064a == -1) {
                try {
                    int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.d_res_0x7f050064);
                    this.f31064a = dimensionPixelSize;
                    Log.m14714v("mCachedMaxScrollSpeed = %d", Integer.valueOf(dimensionPixelSize));
                } catch (Throwable th) {
                    Log.m14710w("Cannot resolve maxScrollSpeed", th, new Object[0]);
                }
            }
            return this.f31064a;
        }

        public float m8147p(RecyclerView.AbstractC0886d0 d0Var) {
            return 0.5f;
        }

        public abstract int mo8146q(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var);

        public abstract float mo8145r(RecyclerView.AbstractC0886d0 d0Var);

        public final boolean m8144s(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            return (m8151l(recyclerView, d0Var) & 16711680) != 0;
        }

        public final boolean m8143t(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            return (m8151l(recyclerView, d0Var) & 65280) != 0;
        }

        public int m8142u(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((int) Math.signum(i2)) * m8148o(recyclerView) * f31063c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * f31062b.getInterpolation(f));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        public abstract boolean mo8141v();

        public abstract boolean mo8140w();
    }

    public class C9576f extends GestureDetector.SimpleOnGestureListener {
        public C9576f() {
        }

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
            RecyclerView.AbstractC0886d0 l0;
            View L = C9570j.this.m8213L(motionEvent);
            if (L != null && (l0 = C9570j.this.f31043p.m39418l0(L)) != null) {
                C9570j jVar = C9570j.this;
                if (jVar.f31038k.m8144s(jVar.f31043p, l0)) {
                    int d = C1476l.m36806d(motionEvent, 0);
                    int i = C9570j.this.f31037j;
                    if (d == i) {
                        int a = C1476l.m36809a(motionEvent, i);
                        float e = C1476l.m36805e(motionEvent, a);
                        float f = C1476l.m36804f(motionEvent, a);
                        C9570j jVar2 = C9570j.this;
                        jVar2.f31031d = e;
                        jVar2.f31032e = f;
                        jVar2.f31034g = 0.0f;
                        jVar2.f31033f = 0.0f;
                        if (jVar2.f31038k.mo8140w()) {
                            C9570j.this.m8198a0(l0, 2);
                        }
                    }
                }
            }
        }
    }

    public class C9577g implements Animator.AnimatorListener {
        public final float f31066a;
        public final float f31067b;
        public final float f31068c;
        public final float f31069d;
        public final RecyclerView.AbstractC0886d0 f31070e;
        public final int f31071f;
        public final ValueAnimator f31072g;
        public final int f31073h;
        public boolean f31074i;
        public float f31075j;
        public float f31076k;
        public boolean f31077l = false;
        public boolean f31078m = false;
        public float f31079n;

        public C9577g(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f31071f = i2;
            this.f31073h = i;
            this.f31070e = d0Var;
            this.f31066a = f;
            this.f31067b = f2;
            this.f31068c = f3;
            this.f31069d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31072g = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C9570j.C9577g.this.m8132e(valueAnimator);
                }
            });
            ofFloat.setTarget(d0Var.f3479a);
            ofFloat.addListener(this);
            m8130g(0.0f);
        }

        public void m8132e(ValueAnimator valueAnimator) {
            m8130g(C2057b.m35735a(valueAnimator));
        }

        public void m8133d() {
            this.f31072g.cancel();
        }

        public void m8131f(long j) {
            this.f31072g.setDuration(j);
        }

        public void m8130g(float f) {
            this.f31079n = f;
        }

        public void m8129h() {
            this.f31070e.m39351I(false);
            this.f31072g.start();
        }

        public void m8128i() {
            float f = this.f31066a;
            float f2 = this.f31068c;
            if (f == f2) {
                this.f31075j = C1489y.m36767C(this.f31070e.f3479a);
            } else {
                this.f31075j = f + (this.f31079n * (f2 - f));
            }
            float f3 = this.f31067b;
            float f4 = this.f31069d;
            if (f3 == f4) {
                this.f31076k = C1489y.m36766D(this.f31070e.f3479a);
            } else {
                this.f31076k = f3 + (this.f31079n * (f4 - f3));
            }
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            m8130g(1.0f);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!this.f31078m) {
                this.f31070e.m39351I(true);
            }
            this.f31078m = true;
        }

        @Override
        public void onAnimationRepeat(Animator animator) {
        }

        @Override
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface AbstractC9578h {
        void m8127a(View view, View view2, int i, int i2);
    }

    public C9570j(AbstractC9575e eVar) {
        this.f31038k = eVar;
    }

    public static boolean m8208Q(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public int m8205T(int i, int i2) {
        View view = this.f31049v;
        if (view == null) {
            return i2;
        }
        int i3 = this.f31050w;
        if (i3 == -1) {
            i3 = this.f31043p.indexOfChild(view);
            this.f31050w = i3;
        }
        return i2 == i + (-1) ? i3 : i2 < i3 ? i2 : i2 + 1;
    }

    public final void m8221D() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.f31048u == null) {
                this.f31048u = new RecyclerView.AbstractC0894k() {
                    @Override
                    public final int mo8318a(int i, int i2) {
                        int T;
                        T = C9570j.this.m8205T(i, i2);
                        return T;
                    }
                };
            }
            this.f31043p.setChildDrawingOrderCallback(this.f31048u);
        }
    }

    public void m8220E(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f31043p;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m8216I();
            }
            this.f31043p = recyclerView;
            if (recyclerView != null) {
                m8196b0();
            }
        }
    }

    public final int m8219F(RecyclerView.AbstractC0886d0 d0Var, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 8;
            int i4 = this.f31033f > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f31045r;
            if (velocityTracker != null && (i2 = this.f31037j) > -1) {
                float a = C1487w.m36771a(velocityTracker, i2);
                if (a <= 0.0f) {
                    i3 = 4;
                }
                if ((i3 & i) != 0 && i4 == i3 && Math.abs(a) >= this.f31043p.getMinFlingVelocity()) {
                    if (this.f31038k.mo8171B(d0Var, i3)) {
                        return 0;
                    }
                    return i3;
                }
            }
            float width = this.f31043p.getWidth() * this.f31038k.mo8145r(d0Var);
            if ((i & i4) != 0 && Math.abs(this.f31033f) > width && !this.f31038k.mo8171B(d0Var, i4)) {
                return i4;
            }
        }
        return 0;
    }

    public final boolean m8218G(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.AbstractC0886d0 N;
        int l;
        if (this.f31030c != null || i != 2 || this.f31039l == 2 || !this.f31038k.mo8141v() || this.f31043p.getScrollState() == 1 || (N = m8211N(motionEvent)) == null || (l = (this.f31038k.m8151l(this.f31043p, N) & 65280) >> 8) == 0) {
            return false;
        }
        float e = C1476l.m36805e(motionEvent, i2);
        float f = C1476l.m36804f(motionEvent, i2);
        float f2 = e - this.f31031d;
        float f3 = f - this.f31032e;
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        int i3 = this.f31042o;
        if (abs < i3 && abs2 < i3) {
            return false;
        }
        if (abs > abs2) {
            if (f2 < 0.0f && (l & 4) == 0) {
                return false;
            }
            if (f2 > 0.0f && (l & 8) == 0) {
                return false;
            }
        } else if (f3 < 0.0f && (l & 1) == 0) {
            return false;
        } else {
            if (f3 > 0.0f && (l & 2) == 0) {
                return false;
            }
        }
        this.f31034g = 0.0f;
        this.f31033f = 0.0f;
        this.f31037j = C1476l.m36806d(motionEvent, 0);
        m8198a0(N, 1);
        return true;
    }

    public final int m8217H(RecyclerView.AbstractC0886d0 d0Var, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 2;
            int i4 = this.f31034g > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f31045r;
            if (velocityTracker != null && (i2 = this.f31037j) > -1) {
                float b = C1487w.m36770b(velocityTracker, i2);
                if (b <= 0.0f) {
                    i3 = 1;
                }
                if ((i3 & i) != 0 && i3 == i4 && Math.abs(b) >= this.f31043p.getMinFlingVelocity()) {
                    if (this.f31038k.mo8171B(d0Var, i3)) {
                        return 0;
                    }
                    return i3;
                }
            }
            float height = this.f31043p.getHeight() * this.f31038k.mo8145r(d0Var);
            if ((i & i4) != 0 && Math.abs(this.f31034g) > height && !this.f31038k.mo8171B(d0Var, i4)) {
                return i4;
            }
        }
        return 0;
    }

    public final void m8216I() {
        this.f31043p.m39435f1(this);
        this.f31043p.m39429h1(this.f31052y);
        this.f31043p.m39432g1(this);
        for (int size = this.f31041n.size() - 1; size >= 0; size--) {
            this.f31038k.m8154i(this.f31043p, this.f31041n.get(0).f31070e);
        }
        this.f31041n.clear();
        this.f31049v = null;
        this.f31050w = -1;
        m8201X();
    }

    public final int m8215J(RecyclerView.AbstractC0886d0 d0Var, boolean z) {
        for (int size = this.f31041n.size() - 1; size >= 0; size--) {
            C9577g gVar = this.f31041n.get(size);
            if (gVar.f31070e == d0Var) {
                gVar.f31077l |= z;
                if (!gVar.f31078m) {
                    gVar.m8133d();
                }
                this.f31041n.remove(size);
                return gVar.f31073h;
            }
        }
        return 0;
    }

    public final C9577g m8214K(MotionEvent motionEvent) {
        if (this.f31041n.isEmpty()) {
            return null;
        }
        View L = m8213L(motionEvent);
        for (int size = this.f31041n.size() - 1; size >= 0; size--) {
            C9577g gVar = this.f31041n.get(size);
            if (gVar.f31070e.f3479a == L) {
                return gVar;
            }
        }
        return null;
    }

    public final View m8213L(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.AbstractC0886d0 d0Var = this.f31030c;
        if (d0Var != null) {
            View view = d0Var.f3479a;
            if (m8208Q(view, x, y, this.f31035h + this.f31033f, this.f31036i + this.f31034g)) {
                return view;
            }
        }
        for (int size = this.f31041n.size() - 1; size >= 0; size--) {
            C9577g gVar = this.f31041n.get(size);
            View view2 = gVar.f31070e.f3479a;
            if (m8208Q(view2, x, y, gVar.f31075j, gVar.f31076k)) {
                return view2;
            }
        }
        return this.f31043p.m39457X(x, y);
    }

    public final List<RecyclerView.AbstractC0886d0> m8212M(RecyclerView.AbstractC0886d0 d0Var) {
        RecyclerView.AbstractC0886d0 d0Var2 = d0Var;
        List<RecyclerView.AbstractC0886d0> list = this.f31046s;
        if (list == null) {
            this.f31046s = new ArrayList();
            this.f31047t = new ArrayList();
        } else {
            list.clear();
            this.f31047t.clear();
        }
        int n = this.f31038k.m8149n();
        int round = Math.round(this.f31035h + this.f31033f) - n;
        int round2 = Math.round(this.f31036i + this.f31034g) - n;
        int i = n * 2;
        int width = d0Var2.f3479a.getWidth() + round + i;
        int height = d0Var2.f3479a.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.AbstractC0902p layoutManager = this.f31043p.getLayoutManager();
        int J = layoutManager.m39248J();
        int i4 = 0;
        while (i4 < J) {
            View I = layoutManager.m39251I(i4);
            if (I != d0Var2.f3479a && I.getBottom() >= round2 && I.getTop() <= height && I.getRight() >= round && I.getLeft() <= width) {
                RecyclerView.AbstractC0886d0 l0 = this.f31043p.m39418l0(I);
                if (this.f31038k.m8156g(this.f31043p, this.f31030c, l0)) {
                    int abs = Math.abs(i2 - ((I.getLeft() + I.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((I.getTop() + I.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f31046s.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.f31047t.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.f31046s.add(i6, l0);
                    this.f31047t.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            d0Var2 = d0Var;
        }
        return this.f31046s;
    }

    public final RecyclerView.AbstractC0886d0 m8211N(MotionEvent motionEvent) {
        View L;
        RecyclerView.AbstractC0902p layoutManager = this.f31043p.getLayoutManager();
        int i = this.f31037j;
        if (i == -1) {
            return null;
        }
        int a = C1476l.m36809a(motionEvent, i);
        float abs = Math.abs(C1476l.m36805e(motionEvent, a) - this.f31031d);
        float abs2 = Math.abs(C1476l.m36804f(motionEvent, a) - this.f31032e);
        int i2 = this.f31042o;
        if (abs < i2 && abs2 < i2) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo39043k()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.mo39041l()) && (L = m8213L(motionEvent)) != null) {
            return this.f31043p.m39418l0(L);
        }
        return null;
    }

    public final void m8210O(float[] fArr) {
        if ((this.f31040m & 12) != 0) {
            fArr[0] = (this.f31035h + this.f31033f) - this.f31030c.f3479a.getLeft();
        } else {
            fArr[0] = C1489y.m36767C(this.f31030c.f3479a);
        }
        if ((this.f31040m & 3) != 0) {
            fArr[1] = (this.f31036i + this.f31034g) - this.f31030c.f3479a.getTop();
        } else {
            fArr[1] = C1489y.m36766D(this.f31030c.f3479a);
        }
    }

    public final boolean m8209P() {
        int size = this.f31041n.size();
        for (int i = 0; i < size; i++) {
            if (!this.f31041n.get(i).f31078m) {
                return true;
            }
        }
        return false;
    }

    public void m8207R(RecyclerView.AbstractC0886d0 d0Var, int i) {
        m8215J(d0Var, false);
        if (this.f31028a.remove(d0Var.f3479a)) {
            this.f31038k.m8154i(this.f31043p, d0Var);
        }
        m8198a0(null, 0);
    }

    public final void m8206S() {
        if (this.f31051x == null) {
            this.f31051x = new C1441d(this.f31043p.getContext(), new C9576f());
        }
    }

    public final void m8204U(RecyclerView.AbstractC0886d0 d0Var) {
        if (!this.f31043p.isLayoutRequested() && this.f31039l == 2) {
            float p = this.f31038k.m8147p(d0Var);
            int i = (int) (this.f31035h + this.f31033f);
            int i2 = (int) (this.f31036i + this.f31034g);
            if (Math.abs(i2 - d0Var.f3479a.getTop()) >= d0Var.f3479a.getHeight() * p || Math.abs(i - d0Var.f3479a.getLeft()) >= d0Var.f3479a.getWidth() * p) {
                List<RecyclerView.AbstractC0886d0> M = m8212M(d0Var);
                if (M.size() != 0) {
                    RecyclerView.AbstractC0886d0 h = this.f31038k.m8155h(d0Var, M, i, i2);
                    if (h == null) {
                        this.f31046s.clear();
                        this.f31047t.clear();
                        return;
                    }
                    int k = h.m39335k();
                    int k2 = d0Var.m39335k();
                    if (this.f31038k.mo8166G(this.f31043p, d0Var, h)) {
                        this.f31038k.m8165H(this.f31043p, d0Var, k2, h, k, i, i2);
                    }
                }
            }
        }
    }

    public final void m8203V() {
        VelocityTracker velocityTracker = this.f31045r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f31045r = VelocityTracker.obtain();
    }

    public final void m8202W(C9577g gVar, int i) {
        this.f31043p.post(new RunnableC9574d(gVar, i));
    }

    public final void m8201X() {
        VelocityTracker velocityTracker = this.f31045r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f31045r = null;
        }
    }

    public final void m8200Y(View view) {
        if (view == this.f31049v) {
            this.f31049v = null;
            if (this.f31048u != null) {
                this.f31043p.setChildDrawingOrderCallback(null);
            }
        }
    }

    public final boolean m8199Z() {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.C9570j.m8199Z():boolean");
    }

    public final void m8198a0(androidx.recyclerview.widget.RecyclerView.AbstractC0886d0 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.C9570j.m8198a0(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    @Override
    public void mo8197b(View view) {
        m8200Y(view);
        RecyclerView.AbstractC0886d0 l0 = this.f31043p.m39418l0(view);
        if (l0 != null) {
            RecyclerView.AbstractC0886d0 d0Var = this.f31030c;
            if (d0Var == null || l0 != d0Var) {
                m8215J(l0, false);
                if (this.f31028a.remove(l0.f3479a)) {
                    this.f31038k.m8154i(this.f31043p, l0);
                    return;
                }
                return;
            }
            m8198a0(null, 0);
        }
    }

    public final void m8196b0() {
        this.f31042o = ViewConfiguration.get(this.f31043p.getContext()).getScaledTouchSlop();
        this.f31043p.m39434g(this);
        this.f31043p.m39425j(this.f31052y);
        this.f31043p.m39428i(this);
        m8206S();
    }

    public void m8195c0(RecyclerView.AbstractC0886d0 d0Var) {
        if (this.f31038k.m8143t(this.f31043p, d0Var)) {
            if (d0Var.f3479a.getParent() != this.f31043p) {
                Log.m14724e("Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.", new Object[0]);
                return;
            }
            m8203V();
            this.f31034g = 0.0f;
            this.f31033f = 0.0f;
            m8198a0(d0Var, 1);
        }
    }

    @Override
    public void mo8194d(View view) {
    }

    public final int m8193d0(RecyclerView.AbstractC0886d0 d0Var) {
        if (this.f31039l == 2) {
            return 0;
        }
        int q = this.f31038k.mo8146q(this.f31043p, d0Var);
        int j = (this.f31038k.m8153j(q, C1489y.m36705v(this.f31043p)) & 65280) >> 8;
        if (j == 0) {
            return 0;
        }
        int i = (q & 65280) >> 8;
        if (Math.abs(this.f31033f) > Math.abs(this.f31034g)) {
            int F = m8219F(d0Var, j);
            if (F > 0) {
                return (i & F) == 0 ? AbstractC9575e.m8152k(F, C1489y.m36705v(this.f31043p)) : F;
            }
            int H = m8217H(d0Var, j);
            if (H > 0) {
                return H;
            }
        } else {
            int H2 = m8217H(d0Var, j);
            if (H2 > 0) {
                return H2;
            }
            int F2 = m8219F(d0Var, j);
            if (F2 > 0) {
                return (i & F2) == 0 ? AbstractC9575e.m8152k(F2, C1489y.m36705v(this.f31043p)) : F2;
            }
        }
        return 0;
    }

    public final void m8192e0(MotionEvent motionEvent, int i, int i2) {
        float e = C1476l.m36805e(motionEvent, i2);
        float f = C1476l.m36804f(motionEvent, i2);
        float f2 = e - this.f31031d;
        this.f31033f = f2;
        this.f31034g = f - this.f31032e;
        if ((i & 4) == 0) {
            this.f31033f = Math.max(0.0f, f2);
        }
        if ((i & 8) == 0) {
            this.f31033f = Math.min(0.0f, this.f31033f);
        }
        if ((i & 1) == 0) {
            this.f31034g = Math.max(0.0f, this.f31034g);
        }
        if ((i & 2) == 0) {
            this.f31034g = Math.min(0.0f, this.f31034g);
        }
    }

    @Override
    public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        rect.setEmpty();
    }

    @Override
    public void mo8191i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        float f;
        float f2;
        this.f31050w = -1;
        if (this.f31030c != null) {
            m8210O(this.f31029b);
            float[] fArr = this.f31029b;
            f2 = fArr[0];
            f = fArr[1];
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f31038k.m8168E(canvas, recyclerView, this.f31030c, this.f31041n, this.f31039l, f2, f);
    }

    @Override
    public void mo8031k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        float f;
        float f2;
        if (this.f31030c != null) {
            m8210O(this.f31029b);
            float[] fArr = this.f31029b;
            f2 = fArr[0];
            f = fArr[1];
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f31038k.m8167F(canvas, recyclerView, this.f31030c, this.f31041n, this.f31039l, f2, f);
    }
}
