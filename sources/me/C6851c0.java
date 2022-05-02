package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1362c;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import nc.C7389v0;
import p037cb.C2057b;
import p051db.C3950k;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p335xd.C10189d;
import p364zd.C11524j;

public class C6851c0 extends View implements C3950k.AbstractC3952b {
    public boolean f21457M;
    public int f21458N;
    public int f21459O;
    public int f21460P;
    public String f21461Q;
    public float f21462R;
    public boolean f21463S;
    public float f21464T;
    public float f21465U;
    public Drawable f21466V;
    public float f21467W;
    public Drawable f21468a;
    public int f21469a0;
    public int f21470b;
    public C3950k f21471b0;
    public int f21472c;
    public float f21473c0;
    public boolean f21474d0;
    public C3950k f21475e0;
    public float f21476f0 = 1.0f;
    public float f21477g0;
    public boolean f21478h0;
    public C3950k f21479i0;
    public RunnableC6969m2 f21480j0;
    public C3950k f21481k0;
    public float f21482l0;
    public boolean f21483m0;
    public float f21484n0;
    public C3950k f21485o0;
    public Paint f21486p0;

    public C6851c0(Context context) {
        super(context);
        C1399s0.m37193a0(this);
    }

    private void setDragFactor(float f) {
        if (this.f21477g0 != f) {
            this.f21477g0 = f;
            m18778o();
        }
    }

    private void setIconRotationInternal(float f) {
        float f2 = f % 360.0f;
        if (this.f21484n0 != f2) {
            this.f21484n0 = f2;
            invalidate();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    setHideFactor(f);
                } else if (i == 3) {
                    setDragFactor(f);
                }
            } else if (this.f21482l0 != f) {
                this.f21482l0 = f;
                this.f21480j0.m18275o(C5069h.m24089d(f < 0.5f ? 0.0f : (f - 0.5f) / 0.5f));
                invalidate();
            }
        } else if (this.f21467W != f) {
            this.f21467W = f;
            if (f > 0.5f) {
                m18792a();
            }
            invalidate();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            m18792a();
        }
    }

    public final void m18792a() {
        Drawable drawable = this.f21466V;
        if (drawable != null) {
            this.f21468a = drawable;
            this.f21470b = this.f21469a0;
            this.f21466V = null;
        }
    }

    public void m18791b() {
        RunnableC6969m2 m2Var = this.f21480j0;
        if (m2Var != null) {
            m2Var.m18288b(this);
        }
    }

    public final Paint m18790c(int i) {
        Paint paint = this.f21486p0;
        if (paint == null || paint.getColor() != i) {
            this.f21486p0 = C1410y.m37047c(this.f21486p0, i);
        }
        return this.f21486p0;
    }

    public final void m18789d(int i, float f, float f2, int i2, int i3) {
        m18788e(i, 0, f, f2, i2, i3);
    }

    public void m18788e(int i, int i2, float f, float f2, int i3, int i4) {
        this.f21468a = C1362c.m37483f(i);
        this.f21470b = i2;
        this.f21458N = i3;
        this.f21457M = true;
        this.f21472c = i4;
        C10189d.m5801c(this, f, f2, i3);
    }

    public boolean m18787f() {
        return this.f21483m0;
    }

    public void m18786g(int i) {
        m18785h(i, 0);
    }

    public void m18785h(int i, int i2) {
        this.f21466V = C1362c.m37483f(i);
        this.f21469a0 = i2;
        if (this.f21471b0 == null) {
            this.f21471b0 = new C3950k(0, this, C2057b.f7280b, 220L);
        }
        if (!this.f21471b0.m29531v()) {
            C3950k kVar = this.f21471b0;
            this.f21467W = 0.0f;
            kVar.m29541l(0.0f);
        } else if (this.f21471b0.m29538o() >= 0.5f) {
            C3950k kVar2 = this.f21471b0;
            float o = kVar2.m29538o() - 0.5f;
            this.f21467W = o;
            kVar2.m29541l(o);
        }
        this.f21471b0.m29544i(1.0f);
    }

    public void m18784i(int i, int i2) {
        this.f21459O = i;
        this.f21460P = i2;
    }

    public void m18783j(int i, int i2, float f) {
        C10189d.m5803a(this, i, i2, f);
    }

    public void m18782k(int i, int i2) {
        this.f21468a = C1362c.m37483f(i);
        this.f21470b = i2;
        invalidate();
    }

    public void m18781l(float f, boolean z) {
        if (z) {
            if (this.f21485o0 == null) {
                float f2 = this.f21484n0;
                if (f2 != f) {
                    this.f21485o0 = new C3950k(3, this, C2057b.f7280b, 180L, f2);
                } else {
                    return;
                }
            }
            this.f21485o0.m29544i(f);
            return;
        }
        C3950k kVar = this.f21485o0;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setIconRotationInternal(f);
    }

    public void m18780m(boolean z, boolean z2) {
        if (this.f21474d0 != z) {
            this.f21474d0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f21475e0 == null) {
                    this.f21475e0 = new C3950k(2, this, C2057b.f7280b, 100L, this.f21473c0);
                }
                if (f == 0.0f && this.f21473c0 == 1.0f) {
                    this.f21475e0.m29557B(C2057b.f7284f);
                    this.f21475e0.m29528y(290L);
                } else {
                    this.f21475e0.m29557B(C2057b.f7280b);
                    this.f21475e0.m29528y(140L);
                }
                this.f21475e0.m29544i(f);
                return;
            }
            C3950k kVar = this.f21475e0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            setHideFactor(f);
        }
    }

    public void m18779n(boolean z, float f) {
        if (this.f21464T != f) {
            this.f21464T = f;
            this.f21463S = z;
            C10189d.m5803a(this, this.f21458N, this.f21459O, f);
            invalidate();
        }
    }

    public final void m18778o() {
        float f = this.f21473c0;
        float f2 = (((1.0f - f) * 0.4f) + 0.6f + (this.f21477g0 * 0.2f * (1.0f - f))) * this.f21476f0;
        setScaleX(f2);
        setScaleY(f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        int measuredWidth = ((int) (getMeasuredWidth() * 0.5f)) + this.f21470b;
        int measuredHeight = (int) (getMeasuredHeight() * 0.5f);
        boolean z = !C5070i.m24061i(this.f21461Q);
        if (this.f21468a != null) {
            int N = this.f21457M ? C11524j.m228N(this.f21472c) : this.f21472c;
            int i = this.f21460P;
            int d = C5064d.m24128d(N, i != 0 ? C11524j.m228N(i) : N, this.f21464T);
            Paint c = m18790c(N);
            int alpha = c.getAlpha();
            float f = this.f21464T;
            if (f == 0.0f) {
                float f2 = this.f21467W;
                float f3 = (1.0f - (f2 <= 0.5f ? f2 / 0.5f : 1.0f - ((f2 - 0.5f) / 0.5f))) * (1.0f - this.f21482l0);
                boolean z2 = f3 != 1.0f;
                if (z2) {
                    canvas.save();
                    float f4 = (0.4f * f3) + 0.6f;
                    canvas.scale(f4, f4, measuredWidth, measuredHeight);
                    c.setAlpha((int) (alpha * f3));
                }
                boolean z3 = this.f21484n0 != 0.0f;
                if (z3) {
                    canvas.save();
                    canvas.rotate(this.f21484n0, measuredWidth, measuredHeight);
                }
                if (z) {
                    canvas.drawText(this.f21461Q, measuredWidth - (this.f21462R / 2.0f), C1357a0.m37541i(17.0f) + measuredHeight, C1410y.m37046c0(14.0f, C5064d.m24131a(f3, N)));
                }
                C1362c.m37487b(canvas, this.f21468a, measuredWidth - (drawable2.getMinimumWidth() / 2), (measuredHeight - (this.f21468a.getMinimumHeight() / 2)) - (z ? C1357a0.m37541i(8.0f) : 0), c);
                if (z3) {
                    canvas.restore();
                }
                if (z2) {
                    c.setAlpha(alpha);
                    canvas.restore();
                }
                RunnableC6969m2 m2Var = this.f21480j0;
                if (m2Var != null && this.f21482l0 >= 0.5f) {
                    m2Var.m18286d(N);
                    this.f21480j0.m18287c(canvas);
                }
            } else {
                float f5 = f * (this.f21463S ? -135.0f : 135.0f);
                boolean z4 = f5 != 0.0f;
                if (z4) {
                    canvas.save();
                    canvas.rotate(f5, measuredWidth, measuredHeight);
                }
                float f6 = this.f21464T;
                if (f6 <= 0.85f) {
                    c.setAlpha((int) (alpha * (1.0f - (f6 / 0.85f))));
                    C1362c.m37487b(canvas, this.f21468a, measuredWidth - (drawable.getMinimumWidth() / 2), measuredHeight - (this.f21468a.getMinimumHeight() / 2), c);
                    c.setAlpha(alpha);
                }
                float f7 = this.f21464T;
                if (f7 >= 0.15f) {
                    float f8 = (f7 - 0.15f) / 0.85f;
                    int i2 = C1357a0.m37541i(1.0f);
                    int i3 = (int) (C1357a0.m37541i(7.0f) * f8);
                    Paint g = C1410y.m37039g(C5064d.m24131a(f8, d));
                    canvas.drawRect(measuredWidth - i2, measuredHeight - i3, measuredWidth + i2, measuredHeight + i3, g);
                    canvas.drawRect(measuredWidth - i3, measuredHeight - i2, i3 + measuredWidth, i2 + measuredHeight, g);
                }
                if (z4) {
                    canvas.restore();
                }
            }
            if (this.f21465U > 0.0f) {
                C1359b.m37509j(canvas, measuredWidth, measuredHeight - C1357a0.m37541i(6.0f), this.f21465U, N, C10189d.m5802b(this), C1357a0.m37541i(27.0f));
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() != 0 || (getAlpha() != 0.0f && isEnabled() && (getParent() == null || ((View) getParent()).getAlpha() != 0.0f))) && super.onTouchEvent(motionEvent);
    }

    public void setBaseScale(float f) {
        if (this.f21476f0 != f) {
            this.f21476f0 = f;
            m18778o();
        }
    }

    public void setBottomText(String str) {
        if (str != null && str.isEmpty()) {
            str = null;
        }
        if (!C5070i.m24067c(this.f21461Q, str)) {
            this.f21461Q = str;
            this.f21462R = C7389v0.m16680T1(str, C1410y.m37048b0(14.0f));
            invalidate();
        }
    }

    public void setCrossFactor(float f) {
        if (this.f21465U != f) {
            this.f21465U = f;
            invalidate();
        }
    }

    public void setCustomIconColor(int i) {
        if (this.f21457M || this.f21472c != i) {
            this.f21457M = false;
            this.f21472c = i;
            invalidate();
        }
    }

    public void setHideFactor(float f) {
        if (this.f21473c0 != f) {
            this.f21473c0 = f;
            m18778o();
            setAlpha(C5069h.m24089d(1.0f - f));
        }
    }

    public void setIcon(int i) {
        m18782k(i, 0);
    }

    public void setIconColorId(int i) {
        if (!this.f21457M || this.f21472c != i) {
            this.f21457M = true;
            this.f21472c = i;
            invalidate();
        }
    }

    public void setInProgress(boolean z) {
        if (this.f21483m0 != z) {
            this.f21483m0 = z;
            float f = 0.0f;
            if (this.f21480j0 == null) {
                RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(8.0f));
                this.f21480j0 = m2Var;
                m2Var.m18294B();
                this.f21480j0.m18265y();
                this.f21480j0.m18286d(-1);
                this.f21480j0.m18275o(0.0f);
                this.f21480j0.m18274p(0, 0, getLayoutParams().width, getLayoutParams().height);
                this.f21480j0.m18289a(this);
            }
            if (this.f21481k0 == null) {
                this.f21481k0 = new C3950k(1, this, C2057b.f7280b, 220L);
            }
            C3950k kVar = this.f21481k0;
            if (z) {
                f = 1.0f;
            }
            kVar.m29544i(f);
        }
    }

    public void setIsDragging(boolean z) {
        if (this.f21478h0 != z) {
            this.f21478h0 = z;
            float f = z ? 1.0f : 0.0f;
            if (this.f21479i0 == null) {
                this.f21479i0 = new C3950k(3, this, C2057b.f7280b, 180L, this.f21477g0);
            }
            this.f21479i0.m29544i(f);
        }
    }
}
