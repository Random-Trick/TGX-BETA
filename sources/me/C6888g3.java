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
    public int f21731N;
    public C4630f0 f21732O;
    public boolean f21733P;
    public final C6240c f21734b = new C6240c(this, 0);
    public final C6257p f21735c = new C6257p(this, 0);
    public final AbstractC4345j f21730M = new C6889a(this);

    public class C6889a extends C4343h {
        public C6889a(View view) {
            super(view);
        }

        @Override
        public boolean mo18573a() {
            if (C6888g3.this.f21732O == null) {
                return true;
            }
            C6888g3.this.f21732O.m26736m0(C6888g3.this.f21735c);
            return true;
        }
    }

    public C6888g3(Context context) {
        super(context);
    }

    public void m18580b() {
        this.f21735c.mo20248b();
        this.f21734b.mo20248b();
    }

    public void clear() {
        setWrapper(null);
    }

    public void m18579f() {
        this.f21735c.mo20246f();
        this.f21734b.mo20246f();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f21731N != 0) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom(), C1410y.m37042g(C11524j.m228N(this.f21731N)));
        }
        if (this.f21732O != null) {
            int paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
            C4630f0 f0Var = this.f21732O;
            f0Var.m26725s(this, canvas, paddingLeft - (f0Var.m26791B() / 2), getPaddingTop(), this.f21734b, this.f21735c, 1.0f);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m18576v();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C4630f0 f0Var = this.f21732O;
        return f0Var != null && f0Var.m26744i0(this, motionEvent);
    }

    public void setBackgroundColorId(int i) {
        this.f21731N = i;
    }

    public void setWrapper(C4630f0 f0Var) {
        C4630f0 f0Var2 = this.f21732O;
        if (f0Var2 != f0Var) {
            if (f0Var2 != null) {
                f0Var2.m26790B0(null);
            }
            this.f21732O = f0Var;
            if (f0Var != null) {
                m18576v();
                m18575x();
                f0Var.m26781G().m18623j();
                f0Var.m26790B0(this.f21730M);
            }
        }
    }

    public final void m18576v() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C4630f0 f0Var = this.f21732O;
        if (f0Var != null && measuredWidth > 0 && measuredHeight > 0) {
            if (this.f21733P) {
                float F = f0Var.m26783F();
                float E = this.f21732O.m26785E();
                float min = Math.min(measuredWidth / F, measuredHeight / E);
                this.f21732O.m26741k((int) (F * min), (int) (E * min));
                return;
            }
            f0Var.m26741k(measuredWidth, measuredHeight);
        }
    }

    public void m18575x() {
        C4630f0 f0Var = this.f21732O;
        if (f0Var != null) {
            f0Var.m26734n0(this.f21734b);
            this.f21732O.m26736m0(this.f21735c);
            return;
        }
        this.f21734b.clear();
        this.f21735c.clear();
    }

    public void m18574y() {
        this.f21733P = true;
    }
}
