package me;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1410y;
import gd.C4630f0;
import org.thunderdog.challegram.widget.SparseDrawableView;
import p080fb.AbstractC4345j;
import p080fb.C4343h;
import p156kd.C6240c;
import p156kd.C6257p;
import p364zd.C11524j;

public class C6888g3 extends SparseDrawableView {
    public int f21728N;
    public C4630f0 f21729O;
    public boolean f21730P;
    public final C6240c f21731b = new C6240c(this, 0);
    public final C6257p f21732c = new C6257p(this, 0);
    public final AbstractC4345j f21727M = new C6889a(this);

    public class C6889a extends C4343h {
        public C6889a(View view) {
            super(view);
        }

        @Override
        public boolean mo18573a() {
            if (C6888g3.this.f21729O == null) {
                return true;
            }
            C6888g3.this.f21729O.m26737l0(C6888g3.this.f21732c);
            return true;
        }
    }

    public C6888g3(Context context) {
        super(context);
    }

    public void m18580b() {
        this.f21732c.mo20247b();
        this.f21731b.mo20247b();
    }

    public void clear() {
        setWrapper(null);
    }

    public void m18579f() {
        this.f21732c.mo20245f();
        this.f21731b.mo20245f();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f21728N != 0) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom(), C1410y.m37039g(C11524j.m228N(this.f21728N)));
        }
        if (this.f21729O != null) {
            int paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
            C4630f0 f0Var = this.f21729O;
            f0Var.m26724s(this, canvas, paddingLeft - (f0Var.m26789B() / 2), getPaddingTop(), this.f21731b, this.f21732c, 1.0f);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m18576v();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C4630f0 f0Var = this.f21729O;
        return f0Var != null && f0Var.m26745h0(this, motionEvent);
    }

    public void setBackgroundColorId(int i) {
        this.f21728N = i;
    }

    public void setWrapper(C4630f0 f0Var) {
        C4630f0 f0Var2 = this.f21729O;
        if (f0Var2 != f0Var) {
            if (f0Var2 != null) {
                f0Var2.m26790A0(null);
            }
            this.f21729O = f0Var;
            if (f0Var != null) {
                m18576v();
                m18575x();
                f0Var.m26779G().m18623j();
                f0Var.m26790A0(this.f21727M);
            }
        }
    }

    public final void m18576v() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C4630f0 f0Var = this.f21729O;
        if (f0Var != null && measuredWidth > 0 && measuredHeight > 0) {
            if (this.f21730P) {
                float F = f0Var.m26781F();
                float E = this.f21729O.m26783E();
                float min = Math.min(measuredWidth / F, measuredHeight / E);
                this.f21729O.m26740k((int) (F * min), (int) (E * min));
                return;
            }
            f0Var.m26740k(measuredWidth, measuredHeight);
        }
    }

    public void m18575x() {
        C4630f0 f0Var = this.f21729O;
        if (f0Var != null) {
            f0Var.m26735m0(this.f21731b);
            this.f21729O.m26737l0(this.f21732c);
            return;
        }
        this.f21731b.clear();
        this.f21732c.clear();
    }

    public void m18574y() {
        this.f21730P = true;
    }
}
