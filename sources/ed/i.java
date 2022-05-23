package ed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import db.g;
import ed.a;
import gd.l;
import gd.w;
import hd.d7;
import java.util.ArrayList;
import java.util.Iterator;

public class i extends View {
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public int T;
    public int U;
    public int V;
    public int W;
    public TextPaint f11566a;
    public ed.a f11568c;
    public int S = -1;
    public ArrayList<d> f11567b = new ArrayList<>(10);

    public class a extends AnimatorListenerAdapter {
        public final d f11569a;

        public a(d dVar) {
            this.f11569a = dVar;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f11569a.h();
            if (i.this.O) {
                i.this.f11568c.G1();
            }
            i.this.setBoundLayerType(0);
            i.this.N = false;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final boolean f11571a;

        public b(boolean z10) {
            this.f11571a = z10;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            i.this.n();
            if (i.this.O) {
                i.this.f11568c.G1();
            }
            if (this.f11571a) {
                i.this.requestLayout();
            }
            i.this.setBoundLayerType(0);
            i.this.N = false;
        }
    }

    public i(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(7);
        this.f11566a = textPaint;
        textPaint.setStyle(Paint.Style.FILL);
        this.f11566a.setTypeface(o.k());
        this.f11566a.setTextSize(a0.i(14.0f));
    }

    public void r(ValueAnimator valueAnimator) {
        setFactor(db.b.a(valueAnimator));
    }

    public void s(d dVar) {
        ArrayList<d> arrayList;
        dVar.z();
        if (this.f11567b.size() == 0) {
            dVar.C(a0.i(4.0f), a0.i(12.0f));
        } else {
            d dVar2 = this.f11567b.get(arrayList.size() - 1);
            float i10 = a0.i(8.0f);
            float o10 = dVar2.o() + dVar2.n() + i10;
            float p10 = dVar2.p();
            if (dVar.n() + o10 > getMeasuredWidth() - i10) {
                o10 = a0.i(4.0f);
                p10 = p10 + dVar2.m() + i10;
            }
            dVar.C((int) o10, (int) p10);
        }
        this.R = 0.0f;
        int size = this.f11567b.size();
        this.P = size;
        this.Q = size + 1;
        int currentHeight = getCurrentHeight();
        this.f11567b.add(dVar);
        int currentHeight2 = getCurrentHeight();
        if (currentHeight2 != currentHeight) {
            requestLayout();
        }
        this.O = this.f11568c.K1(currentHeight2, false);
        dVar.y();
        setBoundLayerType(2);
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i.this.r(valueAnimator);
            }
        });
        b10.setInterpolator(db.b.f7287b);
        b10.setDuration(150L);
        b10.setStartDelay(20L);
        b10.addListener(new a(dVar));
        b10.start();
    }

    public void setBoundLayerType(int i10) {
        if (getMeasuredHeight() < 512) {
            p0.Y(this, i10);
        }
        p0.Y(j0.v(), i10);
        a.c cVar = this.f11568c.P;
        if (cVar != null) {
            p0.Y(cVar.n(), i10);
        }
    }

    public void t(d7 d7Var) {
        int i10 = a0.i(100.0f);
        int B = (((int) ((a0.B() - a0.i(60.0f)) * 0.5f)) - a0.i(8.0f)) - a0.i(44.0f);
        if (B >= i10) {
            i10 = B > a0.i(200.0f) ? a0.i(200.0f) : B;
        }
        final d dVar = new d(this, d7Var, i10);
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                i.this.s(dVar);
            }
        });
    }

    public void u(ValueAnimator valueAnimator) {
        setFactor(db.b.a(valueAnimator));
    }

    public int getCurrentHeight() {
        int size = this.f11567b.size();
        if (size == 0) {
            return 0;
        }
        d dVar = null;
        while (size != 0) {
            dVar = this.f11567b.get(size - 1);
            if (!dVar.q()) {
                break;
            }
            size--;
        }
        if (dVar.q()) {
            return 0;
        }
        return dVar.m() + dVar.p();
    }

    public float getFactor() {
        return this.R;
    }

    public void i(final d7 d7Var) {
        this.N = true;
        this.O = false;
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                i.this.t(d7Var);
            }
        });
    }

    public void j(d7 d7Var) {
        ArrayList<d> arrayList;
        int i10 = a0.i(100.0f);
        int B = (((int) ((a0.B() - a0.i(60.0f)) * 0.5f)) - a0.i(8.0f)) - a0.i(44.0f);
        if (B >= i10) {
            i10 = B > a0.i(200.0f) ? a0.i(200.0f) : B;
        }
        d dVar = new d(this, d7Var, i10);
        if (this.f11567b.size() == 0) {
            dVar.C(a0.i(4.0f), a0.i(12.0f));
        } else {
            d dVar2 = this.f11567b.get(arrayList.size() - 1);
            float i11 = a0.i(8.0f);
            float o10 = dVar2.o() + dVar2.n() + i11;
            float p10 = dVar2.p();
            if (dVar.n() + o10 > getMeasuredWidth() - i11) {
                o10 = a0.i(4.0f);
                p10 = p10 + dVar2.m() + i11;
            }
            dVar.C((int) o10, (int) p10);
        }
        dVar.z();
        this.f11567b.add(dVar);
    }

    public void k() {
        int size = this.f11567b.size();
        if (size != 0) {
            float i10 = a0.i(8.0f);
            float g10 = (getMeasuredWidth() == 0 ? a0.g() - a0.i(60.0f) : getMeasuredWidth()) - i10;
            float i11 = a0.i(4.0f);
            float i12 = a0.i(12.0f);
            float f10 = i11;
            for (int i13 = 0; i13 < size; i13++) {
                d dVar = this.f11567b.get(i13);
                if (!dVar.q()) {
                    if (dVar.n() + f10 > g10) {
                        i12 = i12 + dVar.m() + i10;
                        f10 = i11;
                    }
                    dVar.C((int) f10, (int) i12);
                    f10 = f10 + dVar.n() + i10;
                }
            }
        }
    }

    public final void l() {
        this.f11567b.get(this.S).f();
        this.S = -1;
    }

    public final void m() {
        g.c(this);
        d dVar = this.f11567b.get(this.S);
        p(this.S, true);
        a.c cVar = this.f11568c.P;
        if (cVar != null) {
            cVar.e3(dVar.k());
        }
    }

    public void n() {
        for (int i10 = this.P; i10 < this.Q; i10++) {
            this.f11567b.get(i10).g();
        }
        this.f11567b.remove(this.P).i();
        this.Q = 0;
        this.P = 0;
    }

    public void o() {
        Iterator<d> it = this.f11567b.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<d> it = this.f11567b.iterator();
        while (it.hasNext()) {
            it.next().u();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<d> it = this.f11567b.iterator();
        while (it.hasNext()) {
            it.next().v();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        Iterator<d> it = this.f11567b.iterator();
        while (it.hasNext()) {
            it.next().j(canvas, this);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), getCurrentHeight());
        int measuredWidth = getMeasuredWidth();
        if (this.M != measuredWidth) {
            this.M = measuredWidth;
            k();
            int currentHeight = getCurrentHeight();
            this.f11568c.H1(currentHeight);
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), currentHeight);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.T = (int) motionEvent.getX();
            this.U = (int) motionEvent.getY();
            int i11 = (int) (a0.i(8.0f) * 0.5f);
            this.S = -1;
            if (this.N) {
                return false;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= this.f11567b.size()) {
                    break;
                }
                d dVar = this.f11567b.get(i12);
                int o10 = dVar.o();
                int p10 = dVar.p();
                int n10 = dVar.n();
                int m10 = dVar.m();
                if (w.G2()) {
                    o10 = (getMeasuredWidth() - o10) - n10;
                }
                int i13 = this.T;
                if (i13 >= o10 - i11 && i13 < o10 + n10 + i11 && (i10 = this.U) >= p10 - i11 && i10 < p10 + m10 + i11) {
                    this.S = i12;
                    this.V = a0.i(1.0f);
                    this.W = a0.i(7.0f);
                    dVar.D();
                    break;
                }
                i12++;
            }
            return this.S != -1;
        } else if (action != 1) {
            if (action == 2) {
                if (this.S != -1 && (Math.abs(this.T - motionEvent.getX()) > a0.p() || Math.abs(this.U - motionEvent.getY()) > a0.p())) {
                    l();
                }
                return true;
            } else if (action != 3) {
                return false;
            } else {
                if (this.S != -1) {
                    l();
                }
                return true;
            }
        } else if (this.S == -1) {
            return false;
        } else {
            m();
            return true;
        }
    }

    public final void p(int i10, boolean z10) {
        int currentHeight = getCurrentHeight();
        this.f11567b.get(i10).w();
        int i11 = i10 + 1;
        if (i11 < this.f11567b.size()) {
            while (i11 < this.f11567b.size()) {
                this.f11567b.get(i11).x();
                i11++;
            }
            k();
        }
        this.P = i10;
        this.Q = this.f11567b.size();
        this.R = 0.0f;
        boolean z11 = false;
        this.O = false;
        this.N = true;
        int currentHeight2 = getCurrentHeight();
        if (currentHeight2 != currentHeight) {
            z11 = true;
        }
        this.O = this.f11568c.K1(currentHeight2, z10);
        setBoundLayerType(2);
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i.this.u(valueAnimator);
            }
        });
        b10.setInterpolator(db.b.f7287b);
        b10.setDuration(150L);
        b10.addListener(new b(z11));
        b10.start();
    }

    public boolean q() {
        return this.N;
    }

    public void setFactor(float f10) {
        if (this.R != f10) {
            this.R = f10;
            for (int i10 = this.P; i10 < this.Q; i10++) {
                this.f11567b.get(i10).B(f10);
            }
            if (this.O) {
                this.f11568c.setFactor(f10);
            }
            invalidate();
        }
    }

    public void setHeaderView(ed.a aVar) {
        this.f11568c = aVar;
    }

    public void v(d7 d7Var) {
        long h10 = d7Var.h();
        Iterator<d> it = this.f11567b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().k() == h10) {
                p(i10, false);
                return;
            }
            i10++;
        }
    }
}
