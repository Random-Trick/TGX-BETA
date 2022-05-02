package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import gb.C4535b;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3940f;
import p051db.C3950k;
import p108hb.C5069h;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C6990p extends C4535b implements C3950k.AbstractC3952b {
    public float f22159M = 1.0f;
    public final AbstractC9323v4<?> f22160N;
    public final boolean f22161O;
    public C3940f f22162P;
    public float f22163Q;
    public int f22164R;
    public boolean f22165S;
    public final Drawable f22166b;
    public final Drawable f22167c;

    public class C6991a extends Drawable {
        public final boolean f22168a;

        public C6991a(boolean z) {
            this.f22168a = z;
        }

        @Override
        public void draw(Canvas canvas) {
            int measuredWidth = C6990p.this.getMeasuredWidth();
            int measuredHeight = C6990p.this.getMeasuredHeight();
            int i = C1357a0.m37544i(18.0f);
            int i2 = C1357a0.m37544i(8.0f);
            if (this.f22168a) {
                C6990p.this.f22166b.setBounds(0, i2 - C1357a0.m37544i(2.0f), measuredWidth, measuredHeight);
                C6990p.this.f22166b.draw(canvas);
                int i3 = (measuredWidth / 2) - (i / 2);
                C6990p.this.f22167c.setBounds(i3, 0, i + i3, i2);
                canvas.save();
                canvas.rotate(180.0f, measuredWidth / 2.0f, i2 / 2.0f);
                C6990p.this.f22167c.draw(canvas);
                canvas.restore();
                return;
            }
            int i4 = (measuredHeight - i2) - C1357a0.m37544i(1.0f);
            C6990p.this.f22166b.setBounds(0, 0, measuredWidth, C1357a0.m37544i(0.5f) + i4);
            C6990p.this.f22166b.draw(canvas);
            int i5 = i4 - C1357a0.m37544i(4.0f);
            int i6 = C6990p.this.f22164R - (i / 2);
            C6990p.this.f22167c.setBounds(i6, i5, i + i6, i2 + i5);
            C6990p.this.f22167c.draw(canvas);
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public C6990p(Context context, AbstractC9323v4<?> v4Var, boolean z) {
        super(context);
        setOrientation(1);
        this.f22160N = v4Var;
        this.f22161O = z;
        this.f22166b = C11524j.m250C(R.drawable.stickers_back_all, R.id.theme_color_overlayFilling, v4Var);
        this.f22167c = C11524j.m250C(R.drawable.stickers_back_arrow, R.id.theme_color_overlayFilling, v4Var);
        if (v4Var != null) {
            v4Var.m9163t8(this);
        }
        int i = C1357a0.m37544i(2.0f);
        int i2 = C1357a0.m37544i(4.0f) + C1357a0.m37544i(8.0f) + C1357a0.m37544i(1.0f);
        if (z) {
            setPadding(C1357a0.m37544i(1.0f), (i2 - C1357a0.m37544i(4.0f)) - C1357a0.m37544i(2.0f), C1357a0.m37544i(1.0f), i + C1357a0.m37544i(2.0f));
        } else {
            setPadding(C1357a0.m37544i(1.0f), i, C1357a0.m37544i(1.0f), i2);
        }
        C2065g.m35721d(this, new C6991a(z));
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0 && this.f22163Q != f) {
            this.f22163Q = f;
            m18149g();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public boolean m18152d() {
        C3940f fVar = this.f22162P;
        return fVar != null && fVar.m29585h();
    }

    public void m18151e() {
        AbstractC9323v4<?> v4Var = this.f22160N;
        if (v4Var != null) {
            v4Var.m9180qd(this.f22166b);
            this.f22160N.m9180qd(this.f22167c);
            this.f22160N.m9180qd(this);
        }
    }

    public void m18150f(boolean z, View view) {
        if (m18152d() != z) {
            C3940f fVar = this.f22162P;
            if (fVar == null) {
                this.f22162P = new C3940f(0, this, C2057b.f7284f, 210L);
            } else if (!z || fVar.m29586g() != 0.0f) {
                this.f22162P.m29579n(C2057b.f7280b);
                this.f22162P.m29581l(100L);
            } else {
                this.f22162P.m29579n(C2057b.f7284f);
                this.f22162P.m29581l(210L);
            }
            this.f22162P.m29576q(z, this.f22159M > 0.0f, view);
        }
    }

    public final void m18149g() {
        float f = this.f22159M * this.f22163Q;
        float f2 = (0.2f * f) + 0.8f;
        setScaleX(f2);
        setScaleY(f2);
        setAlpha(C5069h.m24090d(f));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || getAlpha() == 0.0f;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f22165S) {
            setPivotX(getMeasuredWidth() / 2.0f);
        }
        if (this.f22161O) {
            setPivotY((C1357a0.m37544i(8.0f) / 2.0f) + C1357a0.m37544i(1.0f));
        } else {
            setPivotY((getMeasuredHeight() - (C1357a0.m37544i(8.0f) / 2.0f)) - C1357a0.m37544i(1.0f));
        }
    }

    public void setCornerCenterX(int i) {
        if (!this.f22165S || this.f22164R != i) {
            this.f22165S = true;
            this.f22164R = i;
            setPivotX(i);
            invalidate();
        }
    }

    public void setMaxAllowedVisibility(float f) {
        if (this.f22159M != f) {
            this.f22159M = f;
            m18149g();
        }
    }
}
