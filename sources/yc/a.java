package yc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ce.p0;
import eb.k;
import ed.j;
import hd.o;
import ie.k0;
import kb.c;
import ld.b;
import ne.i3;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.SparseDrawableView;
import yd.d;

public class a extends SparseDrawableView implements c, k0, k.b, j.d {
    public o<?> N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public i3 T;
    public k U;
    public j V;
    public int f26704c;
    public int M = -1;
    public final b f26703b = new b(this);

    public a(Context context) {
        super(context);
        p0.T(this);
        d.j(this);
    }

    private void setSelectFactor(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            invalidate();
        }
    }

    @Override
    public void Q2() {
        setInlineResult(null);
        i3 i3Var = this.T;
        if (i3Var != null) {
            i3Var.a();
            this.T = null;
        }
    }

    @Override
    public void U0() {
        if (this.V == null) {
            this.V = new j(this, R.drawable.baseline_remove_circle_24);
        }
        this.V.c();
    }

    public void b() {
        int i10 = this.f26704c;
        if ((i10 & 1) == 0) {
            this.f26704c = i10 | 1;
            this.f26703b.i();
            o<?> oVar = this.N;
            if (oVar != null) {
                oVar.h(this);
            }
        }
    }

    public void e() {
        int i10 = this.f26704c;
        if (!((i10 & 1) == 0)) {
            this.f26704c = i10 & (-2);
            this.f26703b.b();
            o<?> oVar = this.N;
            if (oVar != null) {
                oVar.b(this);
            }
        }
    }

    @Override
    public void h(boolean z10, int i10) {
        int i11 = this.f26704c;
        if (((i11 & 4) != 0) != z10) {
            this.f26704c = ib.c.h(i11, 4, z10);
            boolean y10 = y(i10);
            this.M = i10;
            this.R = this.O;
            this.S = this.P;
            v(z10 ? 1.0f : 0.0f);
            if (y10) {
                invalidate();
            }
        } else if (z10 && y(i10)) {
            invalidate();
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setSelectFactor(f10);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.N != null) {
            j jVar = this.V;
            if (jVar != null) {
                jVar.e(canvas);
            }
            this.N.i(this, canvas, this.f26703b, getMeasuredWidth(), getMeasuredHeight(), this.R, this.S, this.Q, this.M, this.T);
            j jVar2 = this.V;
            if (jVar2 != null) {
                jVar2.d(canvas);
                this.V.b(canvas);
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.N == null) {
            super.onMeasure(i10, i11);
            return;
        }
        this.N.D(((View) getParent()).getMeasuredWidth(), this.f26703b);
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.MeasureSpec.makeMeasureSpec(this.N.o(), Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o<?> oVar;
        o<?> oVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.O = motionEvent.getX();
            this.P = motionEvent.getY();
            boolean z10 = this.Q == 0.0f && (oVar2 = this.N) != null && oVar2.I(this, motionEvent);
            this.f26704c = ib.c.h(this.f26704c, 2, z10);
            if (z10) {
                return true;
            }
        } else if (action == 2) {
            this.O = motionEvent.getX();
            this.P = motionEvent.getY();
        }
        return ((this.f26704c & 2) == 0 || (oVar = this.N) == null) ? super.onTouchEvent(motionEvent) : oVar.I(this, motionEvent);
    }

    public void setInlineResult(o<?> oVar) {
        o<?> oVar2;
        boolean z10 = true;
        if ((this.f26704c & 1) != 0) {
            z10 = false;
        }
        if (z10 && (oVar2 = this.N) != null) {
            oVar2.h(this);
        }
        this.N = oVar;
        if (oVar != null) {
            oVar.D(getMeasuredWidth(), this.f26703b);
            this.N.M(this.f26703b);
            if (z10) {
                this.N.b(this);
                return;
            }
            return;
        }
        this.f26703b.d();
    }

    @Override
    public void setRemoveDx(float f10) {
        if (this.V == null) {
            this.V = new j(this, R.drawable.baseline_remove_circle_24);
        }
        this.V.f(f10);
    }

    public final void v(float f10) {
        if (this.U == null) {
            this.U = new k(0, this, db.b.f7287b, 180L, this.Q);
        }
        this.U.i(f10);
    }

    public void w(boolean z10, int i10) {
        k kVar = this.U;
        float f10 = 1.0f;
        if (kVar != null) {
            kVar.l(z10 ? 1.0f : 0.0f);
        }
        this.f26704c = ib.c.h(this.f26704c, 4, z10);
        boolean y10 = y(i10);
        if (!z10) {
            f10 = 0.0f;
        }
        setSelectFactor(f10);
        if (y10) {
            invalidate();
        }
    }

    public void x(o<?> oVar) {
        o<?> oVar2 = this.N;
        if (oVar2 == oVar && oVar != null) {
            oVar2.L(this.f26703b, true);
        }
    }

    public final boolean y(int i10) {
        if (this.M == i10) {
            return false;
        }
        this.M = i10;
        if (i10 != -1 && this.T == null) {
            this.T = i3.h(this.Q, String.valueOf(i10 + 1));
        }
        return true;
    }
}
