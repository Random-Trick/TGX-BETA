package od;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.y;
import db.b;
import eb.f;
import eb.k;
import eb.l;
import gb.h;
import ib.d;
import kb.c;
import ne.m2;

public class e extends View implements c {
    public Runnable M;
    public m2 f19502b;
    public final RectF f19501a = new RectF();
    public final f f19503c = new f(0, new k.b() {
        @Override
        public final void n4(int i10, float f10, float f11, k kVar) {
            e.this.c(i10, f10, f11, kVar);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            l.a(this, i10, f10, kVar);
        }
    }, b.f7292g, 210);

    public e(Context context) {
        super(context);
        setWillNotDraw(false);
        m2 m2Var = new m2(j0.r(getContext()), a0.i(18.0f));
        this.f19502b = m2Var;
        m2Var.d(-1);
        this.f19502b.D();
        this.f19502b.C(a0.i(4.0f));
        this.f19502b.E(new h(this));
        this.f19502b.o(0.0f);
        this.f19502b.a(this);
    }

    public void c(int i10, float f10, float f11, k kVar) {
        this.f19502b.o(f10);
    }

    public void d() {
        this.f19503c.p(true, true);
        this.M = null;
    }

    @Override
    public void Q2() {
        this.f19502b.b(this);
        this.f19502b.Q2();
    }

    public void e(boolean z10, boolean z11) {
        if (!z10) {
            Runnable runnable = this.M;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.M = null;
            }
            this.f19503c.p(false, true);
        } else if (!z11) {
            this.f19503c.p(true, true);
        } else if (this.M == null) {
            Runnable dVar = new Runnable() {
                @Override
                public final void run() {
                    e.this.d();
                }
            };
            this.M = dVar;
            postDelayed(dVar, 350L);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f19501a, a0.i(12.0f), a0.i(12.0f), y.W(d.b((int) (Color.alpha(1275068416) * this.f19503c.g()), 1275068416)));
        this.f19502b.c(canvas);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i12 = a0.i(42.0f);
        this.f19502b.p(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f19501a.set(measuredWidth - i12, measuredHeight - i12, measuredWidth + i12, measuredHeight + i12);
    }

    public void setProgressVisibleInstant(boolean z10) {
        Runnable runnable = this.M;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.M = null;
        }
        this.f19503c.p(z10, false);
    }
}
