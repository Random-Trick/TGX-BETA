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
    public long f31030A;
    public float f31034d;
    public float f31035e;
    public float f31036f;
    public float f31037g;
    public float f31038h;
    public float f31039i;
    public AbstractC9575e f31041k;
    public int f31043m;
    public int f31045o;
    public RecyclerView f31046p;
    public VelocityTracker f31048r;
    public List<RecyclerView.AbstractC0886d0> f31049s;
    public List<Integer> f31050t;
    public C1441d f31054x;
    public Rect f31056z;
    public final List<View> f31031a = new ArrayList();
    public final float[] f31032b = new float[2];
    public RecyclerView.AbstractC0886d0 f31033c = null;
    public int f31040j = -1;
    public int f31042l = 0;
    public List<C9577g> f31044n = new ArrayList();
    public final Runnable f31047q = new RunnableC9571a();
    public RecyclerView.AbstractC0894k f31051u = null;
    public View f31052v = null;
    public int f31053w = -1;
    public final RecyclerView.AbstractC0909s f31055y = new C9572b();

    public class RunnableC9571a implements Runnable {
        public RunnableC9571a() {
        }

        @Override
        public void run() {
            C9570j jVar = C9570j.this;
            if (jVar.f31033c != null && jVar.m8199Z()) {
                C9570j jVar2 = C9570j.this;
                RecyclerView.AbstractC0886d0 d0Var = jVar2.f31033c;
                if (d0Var != null) {
                    jVar2.m8204U(d0Var);
                }
                C9570j.this.f31046p.removeCallbacks(C9570j.this.f31047q);
                C1489y.m36752U(C9570j.this.f31046p, this);
            }
        }
    }

    public class C9572b implements RecyclerView.AbstractC0909s {
        public C9572b() {
        }

        @Override
        public void mo8175a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C9570j.this.f31054x.m36913a(motionEvent);
            if (C9570j.this.f31048r != null) {
                C9570j.this.f31048r.addMovement(motionEvent);
            }
            if (C9570j.this.f31040j != -1) {
                int c = C1476l.m36810c(motionEvent);
                int a = C1476l.m36812a(motionEvent, C9570j.this.f31040j);
                if (a >= 0) {
                    C9570j.this.m8218G(c, motionEvent, a);
                }
                C9570j jVar = C9570j.this;
                RecyclerView.AbstractC0886d0 d0Var = jVar.f31033c;
                if (d0Var != null) {
                    int i = 0;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c == 6) {
                                    int b = C1476l.m36811b(motionEvent);
                                    int d = C1476l.m36809d(motionEvent, b);
                                    C9570j jVar2 = C9570j.this;
                                    if (d == jVar2.f31040j) {
                                        if (jVar2.f31048r != null) {
                                            C9570j.this.f31048r.computeCurrentVelocity(1000, C9570j.this.f31046p.getMaxFlingVelocity());
                                        }
                                        if (b == 0) {
                                            i = 1;
                                        }
                                        C9570j.this.f31040j = C1476l.m36809d(motionEvent, i);
                                        C9570j jVar3 = C9570j.this;
                                        jVar3.m8192e0(motionEvent, jVar3.f31043m, b);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        } else if (a >= 0) {
                            jVar.m8192e0(motionEvent, jVar.f31043m, a);
                            C9570j.this.m8204U(d0Var);
                            C9570j.this.f31046p.removeCallbacks(C9570j.this.f31047q);
                            C9570j.this.f31047q.run();
                            C9570j.this.f31046p.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    if (jVar.f31048r != null) {
                        C9570j.this.f31048r.computeCurrentVelocity(1000, C9570j.this.f31046p.getMaxFlingVelocity());
                    }
                    C9570j.this.m8198a0(null, 0);
                    C9570j.this.f31040j = -1;
                }
            }
        }

        @Override
        public boolean mo8174c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int a;
            C9577g K;
            C9570j.this.f31054x.m36913a(motionEvent);
            int c = C1476l.m36810c(motionEvent);
            if (c == 0) {
                C9570j.this.f31040j = C1476l.m36809d(motionEvent, 0);
                C9570j.this.f31034d = motionEvent.getX();
                C9570j.this.f31035e = motionEvent.getY();
                C9570j.this.m8203V();
                C9570j jVar = C9570j.this;
                if (jVar.f31033c == null && (K = jVar.m8214K(motionEvent)) != null) {
                    C9570j jVar2 = C9570j.this;
                    jVar2.f31034d -= K.f31078j;
                    jVar2.f31035e -= K.f31079k;
                    jVar2.m8215J(K.f31073e, true);
                    if (C9570j.this.f31031a.remove(K.f31073e.f3479a)) {
                        C9570j jVar3 = C9570j.this;
                        jVar3.f31041k.m8154i(jVar3.f31046p, K.f31073e);
                    }
                    C9570j.this.m8198a0(K.f31073e, K.f31074f);
                    C9570j jVar4 = C9570j.this;
                    jVar4.m8192e0(motionEvent, jVar4.f31043m, 0);
                }
            } else if (c == 3 || c == 1) {
                C9570j jVar5 = C9570j.this;
                jVar5.f31040j = -1;
                jVar5.m8198a0(null, 0);
            } else {
                int i = C9570j.this.f31040j;
                if (i != -1 && (a = C1476l.m36812a(motionEvent, i)) >= 0) {
                    C9570j.this.m8218G(c, motionEvent, a);
                }
            }
            if (C9570j.this.f31048r != null) {
                C9570j.this.f31048r.addMovement(motionEvent);
            }
            return C9570j.this.f31033c != null;
        }

        @Override
        public void mo8173e(boolean z) {
            if (z) {
                C9570j.this.m8198a0(null, 0);
            }
        }
    }

    public class C9573c extends C9577g {
        public final int f31059p;
        public final RecyclerView.AbstractC0886d0 f31060q;

        public C9573c(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.AbstractC0886d0 d0Var2) {
            super(d0Var, i, i2, f, f2, f3, f4);
            this.f31059p = i3;
            this.f31060q = d0Var2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f31080l) {
                if (this.f31059p <= 0) {
                    C9570j jVar = C9570j.this;
                    jVar.f31041k.m8154i(jVar.f31046p, this.f31060q);
                } else {
                    C9570j.this.f31031a.add(this.f31060q.f3479a);
                    this.f31077i = true;
                    int i = this.f31059p;
                    if (i > 0) {
                        C9570j.this.m8202W(this, i);
                    }
                }
                View view = C9570j.this.f31052v;
                View view2 = this.f31060q.f3479a;
                if (view == view2) {
                    C9570j.this.m8200Y(view2);
                }
            }
        }
    }

    public class RunnableC9574d implements Runnable {
        public final C9577g f31062a;
        public final int f31063b;

        public RunnableC9574d(C9577g gVar, int i) {
            this.f31062a = gVar;
            this.f31063b = i;
        }

        @Override
        public void run() {
            if (C9570j.this.f31046p != null && C9570j.this.f31046p.isAttachedToWindow()) {
                C9577g gVar = this.f31062a;
                if (!gVar.f31080l && gVar.f31073e.m39338k() != -1) {
                    RecyclerView.AbstractC0896m itemAnimator = C9570j.this.f31046p.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.m39287q(null)) && !C9570j.this.m8209P()) {
                        C9570j.this.f31041k.mo8163J(this.f31062a.f31073e, this.f31063b);
                    } else {
                        C9570j.this.f31046p.post(this);
                    }
                }
            }
        }
    }

    public static abstract class AbstractC9575e {
        public static final Interpolator f31065b = animationInterpolatorC9595l.f31117a;
        public static final Interpolator f31066c = animationInterpolatorC9584k.f31092a;
        public int f31067a = -1;

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
                mo8170C(canvas, recyclerView, gVar.f31073e, gVar.f31078j, gVar.f31079k, gVar.f31074f, false);
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
                m8169D(canvas, recyclerView, gVar.f31073e, gVar.f31078j, gVar.f31079k, gVar.f31074f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                m8169D(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C9577g gVar2 = list.get(i3);
                if (gVar2.f31081m && !gVar2.f31077i) {
                    list.remove(i3);
                } else if (!gVar2.f31081m) {
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
            if (layoutManager.mo39046k()) {
                if (layoutManager.m39240Q(d0Var2.f3479a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.m39404r1(i2);
                }
                if (layoutManager.m39235T(d0Var2.f3479a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.m39404r1(i2);
                }
            }
            if (layoutManager.mo39044l()) {
                if (layoutManager.m39234U(d0Var2.f3479a) <= recyclerView.getPaddingTop()) {
                    recyclerView.m39404r1(i2);
                }
                if (layoutManager.m39244O(d0Var2.f3479a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.m39404r1(i2);
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
            return m8153j(mo8146q(recyclerView, d0Var), C1489y.m36708v(recyclerView));
        }

        public long m8150m(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.AbstractC0896m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 120L;
            }
            if (i == 8) {
                return itemAnimator.m39289n();
            }
            return itemAnimator.m39288o();
        }

        public int m8149n() {
            return 0;
        }

        @SuppressLint({"PrivateResource"})
        public final int m8148o(RecyclerView recyclerView) {
            if (this.f31067a == -1) {
                try {
                    int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.d_res_0x7f050064);
                    this.f31067a = dimensionPixelSize;
                    Log.m14714v("mCachedMaxScrollSpeed = %d", Integer.valueOf(dimensionPixelSize));
                } catch (Throwable th) {
                    Log.m14710w("Cannot resolve maxScrollSpeed", th, new Object[0]);
                }
            }
            return this.f31067a;
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
            int signum = (int) (((int) Math.signum(i2)) * m8148o(recyclerView) * f31066c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * f31065b.getInterpolation(f));
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
            if (L != null && (l0 = C9570j.this.f31046p.m39421l0(L)) != null) {
                C9570j jVar = C9570j.this;
                if (jVar.f31041k.m8144s(jVar.f31046p, l0)) {
                    int d = C1476l.m36809d(motionEvent, 0);
                    int i = C9570j.this.f31040j;
                    if (d == i) {
                        int a = C1476l.m36812a(motionEvent, i);
                        float e = C1476l.m36808e(motionEvent, a);
                        float f = C1476l.m36807f(motionEvent, a);
                        C9570j jVar2 = C9570j.this;
                        jVar2.f31034d = e;
                        jVar2.f31035e = f;
                        jVar2.f31037g = 0.0f;
                        jVar2.f31036f = 0.0f;
                        if (jVar2.f31041k.mo8140w()) {
                            C9570j.this.m8198a0(l0, 2);
                        }
                    }
                }
            }
        }
    }

    public class C9577g implements Animator.AnimatorListener {
        public final float f31069a;
        public final float f31070b;
        public final float f31071c;
        public final float f31072d;
        public final RecyclerView.AbstractC0886d0 f31073e;
        public final int f31074f;
        public final ValueAnimator f31075g;
        public final int f31076h;
        public boolean f31077i;
        public float f31078j;
        public float f31079k;
        public boolean f31080l = false;
        public boolean f31081m = false;
        public float f31082n;

        public C9577g(RecyclerView.AbstractC0886d0 d0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f31074f = i2;
            this.f31076h = i;
            this.f31073e = d0Var;
            this.f31069a = f;
            this.f31070b = f2;
            this.f31071c = f3;
            this.f31072d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f31075g = ofFloat;
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
            m8130g(C2057b.m35738a(valueAnimator));
        }

        public void m8133d() {
            this.f31075g.cancel();
        }

        public void m8131f(long j) {
            this.f31075g.setDuration(j);
        }

        public void m8130g(float f) {
            this.f31082n = f;
        }

        public void m8129h() {
            this.f31073e.m39354I(false);
            this.f31075g.start();
        }

        public void m8128i() {
            float f = this.f31069a;
            float f2 = this.f31071c;
            if (f == f2) {
                this.f31078j = C1489y.m36770C(this.f31073e.f3479a);
            } else {
                this.f31078j = f + (this.f31082n * (f2 - f));
            }
            float f3 = this.f31070b;
            float f4 = this.f31072d;
            if (f3 == f4) {
                this.f31079k = C1489y.m36769D(this.f31073e.f3479a);
            } else {
                this.f31079k = f3 + (this.f31082n * (f4 - f3));
            }
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            m8130g(1.0f);
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!this.f31081m) {
                this.f31073e.m39354I(true);
            }
            this.f31081m = true;
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
        this.f31041k = eVar;
    }

    public static boolean m8208Q(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public int m8205T(int i, int i2) {
        View view = this.f31052v;
        if (view == null) {
            return i2;
        }
        int i3 = this.f31053w;
        if (i3 == -1) {
            i3 = this.f31046p.indexOfChild(view);
            this.f31053w = i3;
        }
        return i2 == i + (-1) ? i3 : i2 < i3 ? i2 : i2 + 1;
    }

    public final void m8221D() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.f31051u == null) {
                this.f31051u = new RecyclerView.AbstractC0894k() {
                    @Override
                    public final int mo8318a(int i, int i2) {
                        int T;
                        T = C9570j.this.m8205T(i, i2);
                        return T;
                    }
                };
            }
            this.f31046p.setChildDrawingOrderCallback(this.f31051u);
        }
    }

    public void m8220E(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f31046p;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m8216I();
            }
            this.f31046p = recyclerView;
            if (recyclerView != null) {
                m8196b0();
            }
        }
    }

    public final int m8219F(RecyclerView.AbstractC0886d0 d0Var, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 8;
            int i4 = this.f31036f > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f31048r;
            if (velocityTracker != null && (i2 = this.f31040j) > -1) {
                float a = C1487w.m36774a(velocityTracker, i2);
                if (a <= 0.0f) {
                    i3 = 4;
                }
                if ((i3 & i) != 0 && i4 == i3 && Math.abs(a) >= this.f31046p.getMinFlingVelocity()) {
                    if (this.f31041k.mo8171B(d0Var, i3)) {
                        return 0;
                    }
                    return i3;
                }
            }
            float width = this.f31046p.getWidth() * this.f31041k.mo8145r(d0Var);
            if ((i & i4) != 0 && Math.abs(this.f31036f) > width && !this.f31041k.mo8171B(d0Var, i4)) {
                return i4;
            }
        }
        return 0;
    }

    public final boolean m8218G(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.AbstractC0886d0 N;
        int l;
        if (this.f31033c != null || i != 2 || this.f31042l == 2 || !this.f31041k.mo8141v() || this.f31046p.getScrollState() == 1 || (N = m8211N(motionEvent)) == null || (l = (this.f31041k.m8151l(this.f31046p, N) & 65280) >> 8) == 0) {
            return false;
        }
        float e = C1476l.m36808e(motionEvent, i2);
        float f = C1476l.m36807f(motionEvent, i2);
        float f2 = e - this.f31034d;
        float f3 = f - this.f31035e;
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        int i3 = this.f31045o;
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
        this.f31037g = 0.0f;
        this.f31036f = 0.0f;
        this.f31040j = C1476l.m36809d(motionEvent, 0);
        m8198a0(N, 1);
        return true;
    }

    public final int m8217H(RecyclerView.AbstractC0886d0 d0Var, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 2;
            int i4 = this.f31037g > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f31048r;
            if (velocityTracker != null && (i2 = this.f31040j) > -1) {
                float b = C1487w.m36773b(velocityTracker, i2);
                if (b <= 0.0f) {
                    i3 = 1;
                }
                if ((i3 & i) != 0 && i3 == i4 && Math.abs(b) >= this.f31046p.getMinFlingVelocity()) {
                    if (this.f31041k.mo8171B(d0Var, i3)) {
                        return 0;
                    }
                    return i3;
                }
            }
            float height = this.f31046p.getHeight() * this.f31041k.mo8145r(d0Var);
            if ((i & i4) != 0 && Math.abs(this.f31037g) > height && !this.f31041k.mo8171B(d0Var, i4)) {
                return i4;
            }
        }
        return 0;
    }

    public final void m8216I() {
        this.f31046p.m39438f1(this);
        this.f31046p.m39432h1(this.f31055y);
        this.f31046p.m39435g1(this);
        for (int size = this.f31044n.size() - 1; size >= 0; size--) {
            this.f31041k.m8154i(this.f31046p, this.f31044n.get(0).f31073e);
        }
        this.f31044n.clear();
        this.f31052v = null;
        this.f31053w = -1;
        m8201X();
    }

    public final int m8215J(RecyclerView.AbstractC0886d0 d0Var, boolean z) {
        for (int size = this.f31044n.size() - 1; size >= 0; size--) {
            C9577g gVar = this.f31044n.get(size);
            if (gVar.f31073e == d0Var) {
                gVar.f31080l |= z;
                if (!gVar.f31081m) {
                    gVar.m8133d();
                }
                this.f31044n.remove(size);
                return gVar.f31076h;
            }
        }
        return 0;
    }

    public final C9577g m8214K(MotionEvent motionEvent) {
        if (this.f31044n.isEmpty()) {
            return null;
        }
        View L = m8213L(motionEvent);
        for (int size = this.f31044n.size() - 1; size >= 0; size--) {
            C9577g gVar = this.f31044n.get(size);
            if (gVar.f31073e.f3479a == L) {
                return gVar;
            }
        }
        return null;
    }

    public final View m8213L(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.AbstractC0886d0 d0Var = this.f31033c;
        if (d0Var != null) {
            View view = d0Var.f3479a;
            if (m8208Q(view, x, y, this.f31038h + this.f31036f, this.f31039i + this.f31037g)) {
                return view;
            }
        }
        for (int size = this.f31044n.size() - 1; size >= 0; size--) {
            C9577g gVar = this.f31044n.get(size);
            View view2 = gVar.f31073e.f3479a;
            if (m8208Q(view2, x, y, gVar.f31078j, gVar.f31079k)) {
                return view2;
            }
        }
        return this.f31046p.m39460X(x, y);
    }

    public final List<RecyclerView.AbstractC0886d0> m8212M(RecyclerView.AbstractC0886d0 d0Var) {
        RecyclerView.AbstractC0886d0 d0Var2 = d0Var;
        List<RecyclerView.AbstractC0886d0> list = this.f31049s;
        if (list == null) {
            this.f31049s = new ArrayList();
            this.f31050t = new ArrayList();
        } else {
            list.clear();
            this.f31050t.clear();
        }
        int n = this.f31041k.m8149n();
        int round = Math.round(this.f31038h + this.f31036f) - n;
        int round2 = Math.round(this.f31039i + this.f31037g) - n;
        int i = n * 2;
        int width = d0Var2.f3479a.getWidth() + round + i;
        int height = d0Var2.f3479a.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.AbstractC0902p layoutManager = this.f31046p.getLayoutManager();
        int J = layoutManager.m39251J();
        int i4 = 0;
        while (i4 < J) {
            View I = layoutManager.m39254I(i4);
            if (I != d0Var2.f3479a && I.getBottom() >= round2 && I.getTop() <= height && I.getRight() >= round && I.getLeft() <= width) {
                RecyclerView.AbstractC0886d0 l0 = this.f31046p.m39421l0(I);
                if (this.f31041k.m8156g(this.f31046p, this.f31033c, l0)) {
                    int abs = Math.abs(i2 - ((I.getLeft() + I.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((I.getTop() + I.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f31049s.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.f31050t.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.f31049s.add(i6, l0);
                    this.f31050t.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            d0Var2 = d0Var;
        }
        return this.f31049s;
    }

    public final RecyclerView.AbstractC0886d0 m8211N(MotionEvent motionEvent) {
        View L;
        RecyclerView.AbstractC0902p layoutManager = this.f31046p.getLayoutManager();
        int i = this.f31040j;
        if (i == -1) {
            return null;
        }
        int a = C1476l.m36812a(motionEvent, i);
        float abs = Math.abs(C1476l.m36808e(motionEvent, a) - this.f31034d);
        float abs2 = Math.abs(C1476l.m36807f(motionEvent, a) - this.f31035e);
        int i2 = this.f31045o;
        if (abs < i2 && abs2 < i2) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo39046k()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.mo39044l()) && (L = m8213L(motionEvent)) != null) {
            return this.f31046p.m39421l0(L);
        }
        return null;
    }

    public final void m8210O(float[] fArr) {
        if ((this.f31043m & 12) != 0) {
            fArr[0] = (this.f31038h + this.f31036f) - this.f31033c.f3479a.getLeft();
        } else {
            fArr[0] = C1489y.m36770C(this.f31033c.f3479a);
        }
        if ((this.f31043m & 3) != 0) {
            fArr[1] = (this.f31039i + this.f31037g) - this.f31033c.f3479a.getTop();
        } else {
            fArr[1] = C1489y.m36769D(this.f31033c.f3479a);
        }
    }

    public final boolean m8209P() {
        int size = this.f31044n.size();
        for (int i = 0; i < size; i++) {
            if (!this.f31044n.get(i).f31081m) {
                return true;
            }
        }
        return false;
    }

    public void m8207R(RecyclerView.AbstractC0886d0 d0Var, int i) {
        m8215J(d0Var, false);
        if (this.f31031a.remove(d0Var.f3479a)) {
            this.f31041k.m8154i(this.f31046p, d0Var);
        }
        m8198a0(null, 0);
    }

    public final void m8206S() {
        if (this.f31054x == null) {
            this.f31054x = new C1441d(this.f31046p.getContext(), new C9576f());
        }
    }

    public final void m8204U(RecyclerView.AbstractC0886d0 d0Var) {
        if (!this.f31046p.isLayoutRequested() && this.f31042l == 2) {
            float p = this.f31041k.m8147p(d0Var);
            int i = (int) (this.f31038h + this.f31036f);
            int i2 = (int) (this.f31039i + this.f31037g);
            if (Math.abs(i2 - d0Var.f3479a.getTop()) >= d0Var.f3479a.getHeight() * p || Math.abs(i - d0Var.f3479a.getLeft()) >= d0Var.f3479a.getWidth() * p) {
                List<RecyclerView.AbstractC0886d0> M = m8212M(d0Var);
                if (M.size() != 0) {
                    RecyclerView.AbstractC0886d0 h = this.f31041k.m8155h(d0Var, M, i, i2);
                    if (h == null) {
                        this.f31049s.clear();
                        this.f31050t.clear();
                        return;
                    }
                    int k = h.m39338k();
                    int k2 = d0Var.m39338k();
                    if (this.f31041k.mo8166G(this.f31046p, d0Var, h)) {
                        this.f31041k.m8165H(this.f31046p, d0Var, k2, h, k, i, i2);
                    }
                }
            }
        }
    }

    public final void m8203V() {
        VelocityTracker velocityTracker = this.f31048r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f31048r = VelocityTracker.obtain();
    }

    public final void m8202W(C9577g gVar, int i) {
        this.f31046p.post(new RunnableC9574d(gVar, i));
    }

    public final void m8201X() {
        VelocityTracker velocityTracker = this.f31048r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f31048r = null;
        }
    }

    public final void m8200Y(View view) {
        if (view == this.f31052v) {
            this.f31052v = null;
            if (this.f31051u != null) {
                this.f31046p.setChildDrawingOrderCallback(null);
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
        RecyclerView.AbstractC0886d0 l0 = this.f31046p.m39421l0(view);
        if (l0 != null) {
            RecyclerView.AbstractC0886d0 d0Var = this.f31033c;
            if (d0Var == null || l0 != d0Var) {
                m8215J(l0, false);
                if (this.f31031a.remove(l0.f3479a)) {
                    this.f31041k.m8154i(this.f31046p, l0);
                    return;
                }
                return;
            }
            m8198a0(null, 0);
        }
    }

    public final void m8196b0() {
        this.f31045o = ViewConfiguration.get(this.f31046p.getContext()).getScaledTouchSlop();
        this.f31046p.m39437g(this);
        this.f31046p.m39428j(this.f31055y);
        this.f31046p.m39431i(this);
        m8206S();
    }

    public void m8195c0(RecyclerView.AbstractC0886d0 d0Var) {
        if (this.f31041k.m8143t(this.f31046p, d0Var)) {
            if (d0Var.f3479a.getParent() != this.f31046p) {
                Log.m14724e("Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.", new Object[0]);
                return;
            }
            m8203V();
            this.f31037g = 0.0f;
            this.f31036f = 0.0f;
            m8198a0(d0Var, 1);
        }
    }

    @Override
    public void mo8194d(View view) {
    }

    public final int m8193d0(RecyclerView.AbstractC0886d0 d0Var) {
        if (this.f31042l == 2) {
            return 0;
        }
        int q = this.f31041k.mo8146q(this.f31046p, d0Var);
        int j = (this.f31041k.m8153j(q, C1489y.m36708v(this.f31046p)) & 65280) >> 8;
        if (j == 0) {
            return 0;
        }
        int i = (q & 65280) >> 8;
        if (Math.abs(this.f31036f) > Math.abs(this.f31037g)) {
            int F = m8219F(d0Var, j);
            if (F > 0) {
                return (i & F) == 0 ? AbstractC9575e.m8152k(F, C1489y.m36708v(this.f31046p)) : F;
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
                return (i & F2) == 0 ? AbstractC9575e.m8152k(F2, C1489y.m36708v(this.f31046p)) : F2;
            }
        }
        return 0;
    }

    public final void m8192e0(MotionEvent motionEvent, int i, int i2) {
        float e = C1476l.m36808e(motionEvent, i2);
        float f = C1476l.m36807f(motionEvent, i2);
        float f2 = e - this.f31034d;
        this.f31036f = f2;
        this.f31037g = f - this.f31035e;
        if ((i & 4) == 0) {
            this.f31036f = Math.max(0.0f, f2);
        }
        if ((i & 8) == 0) {
            this.f31036f = Math.min(0.0f, this.f31036f);
        }
        if ((i & 1) == 0) {
            this.f31037g = Math.max(0.0f, this.f31037g);
        }
        if ((i & 2) == 0) {
            this.f31037g = Math.min(0.0f, this.f31037g);
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
        this.f31053w = -1;
        if (this.f31033c != null) {
            m8210O(this.f31032b);
            float[] fArr = this.f31032b;
            f2 = fArr[0];
            f = fArr[1];
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f31041k.m8168E(canvas, recyclerView, this.f31033c, this.f31044n, this.f31042l, f2, f);
    }

    @Override
    public void mo8031k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
        float f;
        float f2;
        if (this.f31033c != null) {
            m8210O(this.f31032b);
            float[] fArr = this.f31032b;
            f2 = fArr[0];
            f = fArr[1];
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f31041k.m8167F(canvas, recyclerView, this.f31033c, this.f31044n, this.f31042l, f2, f);
    }
}
