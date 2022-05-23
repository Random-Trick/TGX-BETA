package ne;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.j0;
import ce.y;
import db.g;
import eb.k;
import gb.b;
import gb.c;
import gd.w;
import je.e;
import oc.v0;
import org.thunderdog.challegram.Log;

public class c2 extends View implements k.b, c.a {
    public boolean M;
    public a N;
    public e O;
    public int P;
    public Drawable Q;
    public int R;
    public float S;
    public float T;
    public int U;
    public int V;
    public boolean W;
    public View.OnClickListener f17912a0;
    public View.OnLongClickListener f17914b0;
    public k f17916c0;
    public float f17917d0;
    public k f17918e0;
    public float f17919f0;
    public m2 f17920g0;
    public k f17921h0;
    public float f17922i0;
    public boolean f17923j0;
    public k f17924k0;
    public boolean f17925l0;
    public float f17926m0;
    public int f17927n0;
    public float f17928o0 = 1.0f;
    public final Path f17911a = new Path();
    public final RectF f17913b = new RectF();
    public final c f17915c = new c(this);

    public interface a {
        void h(c2 c2Var, boolean z10);
    }

    public c2(Context context) {
        super(context);
    }

    public static int c() {
        return a0.i(32.0f);
    }

    private int getRadius() {
        return this.f17926m0 == 0.0f ? a0.i(3.0f) : a0.i(3.0f) + ((int) ((a0.i(14.0f) - a0.i(3.0f)) * this.f17926m0));
    }

    private int getStrokeWidth() {
        return a0.i(1.5f);
    }

    private void setDoneFactor(float f10) {
        if (this.f17926m0 != f10) {
            this.f17926m0 = f10;
            invalidate();
        }
    }

    private void setFadeFactor(float f10) {
        if (this.f17919f0 != f10) {
            this.f17919f0 = f10;
            invalidate();
        }
    }

    private void setInnerAlpha(float f10) {
        if (this.f17928o0 != f10) {
            this.f17928o0 = f10;
            invalidate();
        }
    }

    private void setIsPressed(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            a aVar = this.N;
            if (aVar != null) {
                aVar.h(this, z10);
            }
        }
    }

    private void setPressedFactor(float f10) {
        if (this.f17917d0 != f10) {
            this.f17917d0 = f10;
            invalidate();
        }
    }

    private void setProgressFactor(float f10) {
        if (this.f17922i0 != f10) {
            this.f17922i0 = f10;
            invalidate();
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        return this.f17914b0 != null;
    }

    @Override
    public void C(View view, float f10, float f11) {
        d();
    }

    @Override
    public boolean E4() {
        return b.a(this);
    }

    @Override
    public void G(View view, float f10, float f11) {
        b.h(this, view, f10, f11);
    }

    @Override
    public void U2(View view, float f10, float f11) {
        b.e(this, view, f10, f11);
    }

    @Override
    public void U4(View view, float f10, float f11) {
        b.f(this, view, f10, f11);
    }

    @Override
    public boolean X6(float f10, float f11) {
        return b.c(this, f10, f11);
    }

    public final void a(float f10) {
        if (this.f17918e0 == null) {
            this.f17918e0 = new k(1, this, db.b.f7287b, 180L, this.f17919f0);
        }
        this.f17918e0.i(f10);
    }

    public final void b(float f10) {
        if (this.f17916c0 == null) {
            this.f17916c0 = new k(0, this, db.b.f7287b, 180L, this.f17917d0);
        }
        this.f17916c0.i(f10);
    }

    public final void d() {
        g.c(this);
        View.OnClickListener onClickListener = this.f17912a0;
        if (onClickListener != null && !this.f17923j0) {
            onClickListener.onClick(this);
        }
    }

    public final boolean e() {
        View.OnLongClickListener onLongClickListener = this.f17914b0;
        return onLongClickListener != null && onLongClickListener.onLongClick(this);
    }

    public final void f() {
        this.f17918e0.l(0.0f);
        this.f17919f0 = 0.0f;
        k kVar = this.f17916c0;
        if (kVar != null) {
            kVar.l(0.0f);
        }
        this.f17917d0 = 0.0f;
    }

    public void g(boolean z10, boolean z11) {
        if (z10 && this.f17920g0 == null) {
            m2 m2Var = new m2(j0.r(getContext()), a0.i(3.5f));
            this.f17920g0 = m2Var;
            m2Var.a(this);
            i();
        }
        float f10 = 1.0f;
        if (this.f17923j0 == z10 || !z11) {
            this.f17923j0 = z10;
            k kVar = this.f17921h0;
            if (kVar != null) {
                kVar.l(z10 ? 1.0f : 0.0f);
            }
            if (!z10) {
                f10 = 0.0f;
            }
            setProgressFactor(f10);
            return;
        }
        this.f17923j0 = z10;
        if (this.f17921h0 == null) {
            this.f17921h0 = new k(2, this, db.b.f7287b, 180L, this.f17922i0);
        }
        k kVar2 = this.f17921h0;
        if (!z10) {
            f10 = 0.0f;
        }
        kVar2.i(f10);
    }

    @Override
    public long getLongPressDuration() {
        return b.b(this);
    }

    public void h(boolean z10, boolean z11) {
        float f10 = 1.0f;
        if (this.f17925l0 != z10 && z11) {
            this.f17925l0 = z10;
            if (this.f17924k0 == null) {
                this.f17924k0 = new k(3, this, db.b.f7287b, 180L, this.f17926m0);
            }
            k kVar = this.f17924k0;
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.i(f10);
        } else if (!z11) {
            this.f17925l0 = z10;
            k kVar2 = this.f17924k0;
            if (kVar2 != null) {
                kVar2.l(z10 ? 1.0f : 0.0f);
            }
            if (!z10) {
                f10 = 0.0f;
            }
            setDoneFactor(f10);
        }
    }

    public final void i() {
        if (this.f17920g0 != null) {
            int strokeWidth = getStrokeWidth() / 2;
            int measuredWidth = getMeasuredWidth();
            this.f17920g0.p((measuredWidth - a0.i(13.0f)) - strokeWidth, strokeWidth, measuredWidth - strokeWidth, a0.i(13.0f) + strokeWidth);
        }
    }

    public final void j() {
        int strokeWidth;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float strokeWidth2 = getStrokeWidth() / 2;
        this.f17913b.set(strokeWidth2, strokeWidth2, measuredWidth - strokeWidth, measuredHeight - strokeWidth);
        this.f17911a.reset();
        this.f17911a.addRoundRect(this.f17913b, a0.i(3.0f), a0.i(3.0f), Path.Direction.CCW);
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return this.f17912a0 != null && !this.f17925l0 && isEnabled() && getVisibility() == 0;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setPressedFactor(f10);
        } else if (i10 == 1) {
            setFadeFactor(f10);
        } else if (i10 == 2) {
            setProgressFactor(f10);
        } else if (i10 == 3) {
            setDoneFactor(f10);
        }
    }

    @Override
    public void o(View view, float f10, float f11) {
        b.i(this, view, f10, f11);
    }

    @Override
    public void o2(View view, float f10, float f11) {
        b.g(this, view, f10, f11);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 1) {
            f();
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: ne.c2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.P + (a0.i(15.0f) * 2) + getPaddingLeft() + getPaddingRight(), Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        j();
        i();
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: ne.c2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return e();
    }

    public void setBackgroundColorId(int i10) {
        if (this.f17927n0 != i10) {
            this.f17927n0 = i10;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        if (isEnabled() != z10) {
            super.setEnabled(z10);
            setInnerAlpha(z10 ? 1.0f : 0.3f);
        }
    }

    public void setForceActive(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            invalidate();
        }
    }

    public void setIcon(int i10) {
        this.Q = i10 != 0 ? this.R == i10 ? this.Q : ce.c.g(getResources(), i10) : null;
        this.R = i10;
        this.O = null;
        this.P = 0;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f17912a0 = onClickListener;
    }

    @Override
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17914b0 = onLongClickListener;
    }

    public void setPressureListener(a aVar) {
        this.N = aVar;
    }

    public void setText(int i10) {
        e eVar = i10 != 0 ? new e(w.i1(i10).toUpperCase()) : null;
        this.O = eVar;
        this.P = eVar != null ? (int) v0.T1(eVar.f15363a, y.o(eVar.f15364b)) : 0;
        this.Q = null;
        this.R = 0;
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
