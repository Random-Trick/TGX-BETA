package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import me.RunnableC6969m2;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p080fb.C4343h;
import p108hb.C5064d;
import p364zd.C11524j;

public class C9310u0 extends View {
    public int f30125M;
    public float f30126N = -1.0f;
    public AbstractC9311a f30127O;
    public int f30128P;
    public int f30129Q;
    public C3940f f30130R;
    public RunnableC6969m2 f30131S;
    public float f30132T;
    public Drawable f30133a;
    public int f30134b;
    public int f30135c;

    public interface AbstractC9311a {
        void mo9516a(C9310u0 u0Var, MotionEvent motionEvent);
    }

    public C9310u0(Context context) {
        super(context);
        C1399s0.m37196a0(this);
    }

    public static boolean m9523b(View view) {
        return view == null || (view.getVisibility() == 0 && view.getAlpha() > 0.0f);
    }

    public void m9521d(int i, float f, float f2, C3950k kVar) {
        if (this.f30132T != f) {
            this.f30132T = f;
            invalidate();
        }
    }

    public final int m9522c(int i) {
        int i2 = this.f30135c;
        if (i2 == 0) {
            return i;
        }
        if (this.f30126N != -1.0f) {
            return C5064d.m24129d(C11524j.m228N(i2), C11524j.m228N(this.f30125M), this.f30126N);
        }
        return C11524j.m228N(i2);
    }

    public void m9520e(boolean z, float f) {
        if (this.f30130R == null) {
            if (z) {
                this.f30130R = new C3940f(0, new C3950k.AbstractC3952b() {
                    @Override
                    public final void mo45P5(int i, float f2, float f3, C3950k kVar) {
                        C9310u0.this.m9521d(i, f2, f3, kVar);
                    }

                    @Override
                    public void mo35Y0(int i, float f2, C3950k kVar) {
                        C3953l.m29528a(this, i, f2, kVar);
                    }
                }, C2057b.f7280b, 180L);
            } else {
                return;
            }
        }
        if (this.f30131S == null) {
            RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(15.0f));
            this.f30131S = m2Var;
            if (f >= 0.0f) {
                m2Var.m18268v(f, false);
                this.f30131S.m18272r();
            }
            this.f30131S.m18286d(C5064d.m24132a(this.f30132T, m9522c(C11524j.m239H0())));
            this.f30131S.m18293C(C1357a0.m37544i(2.5f));
            this.f30131S.m18274p(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.f30131S.m18292D();
            this.f30131S.m18291E(new C4343h(this));
        }
        this.f30130R.m29577p(z, true);
    }

    public C9310u0 m9519f(float f) {
        float f2 = this.f30126N;
        if (!(f2 == f || f2 == -1.0f)) {
            this.f30126N = f;
            invalidate();
        }
        return this;
    }

    public C9310u0 m9518g(int i) {
        this.f30135c = i;
        this.f30126N = -1.0f;
        invalidate();
        return this;
    }

    public Drawable getDrawable() {
        return this.f30133a;
    }

    public C9310u0 m9517h(int i, int i2, float f) {
        this.f30135c = i;
        this.f30125M = i2;
        this.f30126N = f;
        invalidate();
        return this;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        RunnableC6969m2 m2Var;
        float f = this.f30132T;
        if (f > 0.0f && (m2Var = this.f30131S) != null) {
            m2Var.m18286d(C5064d.m24132a(f, m9522c(C11524j.m239H0())));
            this.f30131S.m18287c(canvas);
        }
        if (this.f30133a != null) {
            if (this.f30135c == 0) {
                paint = C1410y.m37036j();
            } else {
                paint = C1410y.m37058W(m9522c(0));
            }
            boolean l = C1362c.m37480l(this.f30134b);
            if (l) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
            float f2 = ((1.0f - this.f30132T) * 0.2f) + 0.8f;
            int i = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            if (i != 0) {
                canvas.save();
                canvas.scale(f2, f2, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
            C1362c.m37490b(canvas, this.f30133a, (getMeasuredWidth() / 2) - (this.f30133a.getMinimumWidth() / 2), (getMeasuredHeight() / 2) - (this.f30133a.getMinimumHeight() / 2), paint);
            if (i != 0) {
                canvas.restore();
            }
            if (l) {
                canvas.restore();
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RunnableC6969m2 m2Var = this.f30131S;
        if (m2Var != null) {
            m2Var.m18274p(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && !m9523b(this)) {
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f30127O != null && motionEvent.getAction() == 0) {
            this.f30127O.mo9516a(this, motionEvent);
        }
        return onTouchEvent;
    }

    public void setButtonBackground(int i) {
        if (this.f30129Q != i) {
            this.f30129Q = i;
            setBackgroundResource(i);
        }
    }

    public void setCurrentProgress(float f) {
        RunnableC6969m2 m2Var = this.f30131S;
        if (m2Var != null) {
            m2Var.m18268v(f, this.f30132T > 0.0f);
        }
    }

    public void setImageResource(int i) {
        if (this.f30128P != i) {
            this.f30128P = i;
            boolean z = this.f30133a != null;
            this.f30133a = i != 0 ? C1362c.m37485g(getResources(), i) : null;
            this.f30134b = i;
            if (z) {
                invalidate();
            }
        }
    }

    public void setTouchDownListener(AbstractC9311a aVar) {
        this.f30127O = aVar;
    }
}
