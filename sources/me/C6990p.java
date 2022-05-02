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
    public float f22156M = 1.0f;
    public final AbstractC9323v4<?> f22157N;
    public final boolean f22158O;
    public C3940f f22159P;
    public float f22160Q;
    public int f22161R;
    public boolean f22162S;
    public final Drawable f22163b;
    public final Drawable f22164c;

    public class C6991a extends Drawable {
        public final boolean f22165a;

        public C6991a(boolean z) {
            this.f22165a = z;
        }

        @Override
        public void draw(Canvas canvas) {
            int measuredWidth = C6990p.this.getMeasuredWidth();
            int measuredHeight = C6990p.this.getMeasuredHeight();
            int i = C1357a0.m37541i(18.0f);
            int i2 = C1357a0.m37541i(8.0f);
            if (this.f22165a) {
                C6990p.this.f22163b.setBounds(0, i2 - C1357a0.m37541i(2.0f), measuredWidth, measuredHeight);
                C6990p.this.f22163b.draw(canvas);
                int i3 = (measuredWidth / 2) - (i / 2);
                C6990p.this.f22164c.setBounds(i3, 0, i + i3, i2);
                canvas.save();
                canvas.rotate(180.0f, measuredWidth / 2.0f, i2 / 2.0f);
                C6990p.this.f22164c.draw(canvas);
                canvas.restore();
                return;
            }
            int i4 = (measuredHeight - i2) - C1357a0.m37541i(1.0f);
            C6990p.this.f22163b.setBounds(0, 0, measuredWidth, C1357a0.m37541i(0.5f) + i4);
            C6990p.this.f22163b.draw(canvas);
            int i5 = i4 - C1357a0.m37541i(4.0f);
            int i6 = C6990p.this.f22161R - (i / 2);
            C6990p.this.f22164c.setBounds(i6, i5, i + i6, i2 + i5);
            C6990p.this.f22164c.draw(canvas);
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
        this.f22157N = v4Var;
        this.f22158O = z;
        this.f22163b = C11524j.m250C(R.drawable.stickers_back_all, R.id.theme_color_overlayFilling, v4Var);
        this.f22164c = C11524j.m250C(R.drawable.stickers_back_arrow, R.id.theme_color_overlayFilling, v4Var);
        if (v4Var != null) {
            v4Var.m9163t8(this);
        }
        int i = C1357a0.m37541i(2.0f);
        int i2 = C1357a0.m37541i(4.0f) + C1357a0.m37541i(8.0f) + C1357a0.m37541i(1.0f);
        if (z) {
            setPadding(C1357a0.m37541i(1.0f), (i2 - C1357a0.m37541i(4.0f)) - C1357a0.m37541i(2.0f), C1357a0.m37541i(1.0f), i + C1357a0.m37541i(2.0f));
        } else {
            setPadding(C1357a0.m37541i(1.0f), i, C1357a0.m37541i(1.0f), i2);
        }
        C2065g.m35718d(this, new C6991a(z));
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0 && this.f22160Q != f) {
            this.f22160Q = f;
            m18149g();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public boolean m18152d() {
        C3940f fVar = this.f22159P;
        return fVar != null && fVar.m29583h();
    }

    public void m18151e() {
        AbstractC9323v4<?> v4Var = this.f22157N;
        if (v4Var != null) {
            v4Var.m9180qd(this.f22163b);
            this.f22157N.m9180qd(this.f22164c);
            this.f22157N.m9180qd(this);
        }
    }

    public void m18150f(boolean z, View view) {
        if (m18152d() != z) {
            C3940f fVar = this.f22159P;
            if (fVar == null) {
                this.f22159P = new C3940f(0, this, C2057b.f7284f, 210L);
            } else if (!z || fVar.m29584g() != 0.0f) {
                this.f22159P.m29577n(C2057b.f7280b);
                this.f22159P.m29579l(100L);
            } else {
                this.f22159P.m29577n(C2057b.f7284f);
                this.f22159P.m29579l(210L);
            }
            this.f22159P.m29574q(z, this.f22156M > 0.0f, view);
        }
    }

    public final void m18149g() {
        float f = this.f22156M * this.f22160Q;
        float f2 = (0.2f * f) + 0.8f;
        setScaleX(f2);
        setScaleY(f2);
        setAlpha(C5069h.m24089d(f));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || getAlpha() == 0.0f;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f22162S) {
            setPivotX(getMeasuredWidth() / 2.0f);
        }
        if (this.f22158O) {
            setPivotY((C1357a0.m37541i(8.0f) / 2.0f) + C1357a0.m37541i(1.0f));
        } else {
            setPivotY((getMeasuredHeight() - (C1357a0.m37541i(8.0f) / 2.0f)) - C1357a0.m37541i(1.0f));
        }
    }

    public void setCornerCenterX(int i) {
        if (!this.f22162S || this.f22161R != i) {
            this.f22162S = true;
            this.f22161R = i;
            setPivotX(i);
            invalidate();
        }
    }

    public void setMaxAllowedVisibility(float f) {
        if (this.f22156M != f) {
            this.f22156M = f;
            m18149g();
        }
    }
}
