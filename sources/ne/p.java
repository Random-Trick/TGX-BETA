package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import db.g;
import eb.f;
import eb.k;
import hb.b;
import ib.h;
import org.thunderdog.challegram.R;
import ud.v4;

public class p extends b implements k.b {
    public float M = 1.0f;
    public final v4<?> N;
    public final boolean O;
    public f P;
    public float Q;
    public int R;
    public boolean S;
    public final Drawable f18307b;
    public final Drawable f18308c;

    public class a extends Drawable {
        public final boolean f18309a;

        public a(boolean z10) {
            this.f18309a = z10;
        }

        @Override
        public void draw(Canvas canvas) {
            int measuredWidth = p.this.getMeasuredWidth();
            int measuredHeight = p.this.getMeasuredHeight();
            int i10 = a0.i(18.0f);
            int i11 = a0.i(8.0f);
            if (this.f18309a) {
                p.this.f18307b.setBounds(0, i11 - a0.i(2.0f), measuredWidth, measuredHeight);
                p.this.f18307b.draw(canvas);
                int i12 = (measuredWidth / 2) - (i10 / 2);
                p.this.f18308c.setBounds(i12, 0, i10 + i12, i11);
                canvas.save();
                canvas.rotate(180.0f, measuredWidth / 2.0f, i11 / 2.0f);
                p.this.f18308c.draw(canvas);
                canvas.restore();
                return;
            }
            int i13 = (measuredHeight - i11) - a0.i(1.0f);
            p.this.f18307b.setBounds(0, 0, measuredWidth, a0.i(0.5f) + i13);
            p.this.f18307b.draw(canvas);
            int i14 = i13 - a0.i(4.0f);
            int i15 = p.this.R - (i10 / 2);
            p.this.f18308c.setBounds(i15, i14, i10 + i15, i11 + i14);
            p.this.f18308c.draw(canvas);
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i10) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public p(Context context, v4<?> v4Var, boolean z10) {
        super(context);
        setOrientation(1);
        this.N = v4Var;
        this.O = z10;
        this.f18307b = j.A(R.drawable.stickers_back_all, R.id.theme_color_overlayFilling, v4Var);
        this.f18308c = j.A(R.drawable.stickers_back_arrow, R.id.theme_color_overlayFilling, v4Var);
        if (v4Var != null) {
            v4Var.t8(this);
        }
        int i10 = a0.i(2.0f);
        int i11 = a0.i(4.0f) + a0.i(8.0f) + a0.i(1.0f);
        if (z10) {
            setPadding(a0.i(1.0f), (i11 - a0.i(4.0f)) - a0.i(2.0f), a0.i(1.0f), i10 + a0.i(2.0f));
        } else {
            setPadding(a0.i(1.0f), i10, a0.i(1.0f), i11);
        }
        g.d(this, new a(z10));
    }

    public boolean d() {
        f fVar = this.P;
        return fVar != null && fVar.h();
    }

    public void e() {
        v4<?> v4Var = this.N;
        if (v4Var != null) {
            v4Var.qd(this.f18307b);
            this.N.qd(this.f18308c);
            this.N.qd(this);
        }
    }

    public void f(boolean z10, View view) {
        if (d() != z10) {
            f fVar = this.P;
            if (fVar == null) {
                this.P = new f(0, this, db.b.f7291f, 210L);
            } else if (!z10 || fVar.g() != 0.0f) {
                this.P.n(db.b.f7287b);
                this.P.l(100L);
            } else {
                this.P.n(db.b.f7291f);
                this.P.l(210L);
            }
            this.P.q(z10, this.M > 0.0f, view);
        }
    }

    public final void g() {
        float f10 = this.M * this.Q;
        float f11 = (0.2f * f10) + 0.8f;
        setScaleX(f11);
        setScaleY(f11);
        setAlpha(h.d(f10));
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0 && this.Q != f10) {
            this.Q = f10;
            g();
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || getAlpha() == 0.0f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.S) {
            setPivotX(getMeasuredWidth() / 2.0f);
        }
        if (this.O) {
            setPivotY((a0.i(8.0f) / 2.0f) + a0.i(1.0f));
        } else {
            setPivotY((getMeasuredHeight() - (a0.i(8.0f) / 2.0f)) - a0.i(1.0f));
        }
    }

    public void setCornerCenterX(int i10) {
        if (!this.S || this.R != i10) {
            this.S = true;
            this.R = i10;
            setPivotX(i10);
            invalidate();
        }
    }

    public void setMaxAllowedVisibility(float f10) {
        if (this.M != f10) {
            this.M = f10;
            g();
        }
    }
}
