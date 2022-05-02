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
    public int f30122M;
    public float f30123N = -1.0f;
    public AbstractC9311a f30124O;
    public int f30125P;
    public int f30126Q;
    public C3940f f30127R;
    public RunnableC6969m2 f30128S;
    public float f30129T;
    public Drawable f30130a;
    public int f30131b;
    public int f30132c;

    public interface AbstractC9311a {
        void mo9516a(C9310u0 u0Var, MotionEvent motionEvent);
    }

    public C9310u0(Context context) {
        super(context);
        C1399s0.m37193a0(this);
    }

    public static boolean m9523b(View view) {
        return view == null || (view.getVisibility() == 0 && view.getAlpha() > 0.0f);
    }

    public void m9521d(int i, float f, float f2, C3950k kVar) {
        if (this.f30129T != f) {
            this.f30129T = f;
            invalidate();
        }
    }

    public final int m9522c(int i) {
        int i2 = this.f30132c;
        if (i2 == 0) {
            return i;
        }
        if (this.f30123N != -1.0f) {
            return C5064d.m24128d(C11524j.m228N(i2), C11524j.m228N(this.f30122M), this.f30123N);
        }
        return C11524j.m228N(i2);
    }

    public void m9520e(boolean z, float f) {
        if (this.f30127R == null) {
            if (z) {
                this.f30127R = new C3940f(0, new C3950k.AbstractC3952b() {
                    @Override
                    public final void mo45P5(int i, float f2, float f3, C3950k kVar) {
                        C9310u0.this.m9521d(i, f2, f3, kVar);
                    }

                    @Override
                    public void mo35Y0(int i, float f2, C3950k kVar) {
                        C3953l.m29526a(this, i, f2, kVar);
                    }
                }, C2057b.f7280b, 180L);
            } else {
                return;
            }
        }
        if (this.f30128S == null) {
            RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(15.0f));
            this.f30128S = m2Var;
            if (f >= 0.0f) {
                m2Var.m18268v(f, false);
                this.f30128S.m18272r();
            }
            this.f30128S.m18286d(C5064d.m24131a(this.f30129T, m9522c(C11524j.m239H0())));
            this.f30128S.m18293C(C1357a0.m37541i(2.5f));
            this.f30128S.m18274p(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.f30128S.m18292D();
            this.f30128S.m18291E(new C4343h(this));
        }
        this.f30127R.m29575p(z, true);
    }

    public C9310u0 m9519f(float f) {
        float f2 = this.f30123N;
        if (!(f2 == f || f2 == -1.0f)) {
            this.f30123N = f;
            invalidate();
        }
        return this;
    }

    public C9310u0 m9518g(int i) {
        this.f30132c = i;
        this.f30123N = -1.0f;
        invalidate();
        return this;
    }

    public Drawable getDrawable() {
        return this.f30130a;
    }

    public C9310u0 m9517h(int i, int i2, float f) {
        this.f30132c = i;
        this.f30122M = i2;
        this.f30123N = f;
        invalidate();
        return this;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        RunnableC6969m2 m2Var;
        float f = this.f30129T;
        if (f > 0.0f && (m2Var = this.f30128S) != null) {
            m2Var.m18286d(C5064d.m24131a(f, m9522c(C11524j.m239H0())));
            this.f30128S.m18287c(canvas);
        }
        if (this.f30130a != null) {
            if (this.f30132c == 0) {
                paint = C1410y.m37033j();
            } else {
                paint = C1410y.m37055W(m9522c(0));
            }
            boolean l = C1362c.m37477l(this.f30131b);
            if (l) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
            float f2 = ((1.0f - this.f30129T) * 0.2f) + 0.8f;
            int i = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
            if (i != 0) {
                canvas.save();
                canvas.scale(f2, f2, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
            C1362c.m37487b(canvas, this.f30130a, (getMeasuredWidth() / 2) - (this.f30130a.getMinimumWidth() / 2), (getMeasuredHeight() / 2) - (this.f30130a.getMinimumHeight() / 2), paint);
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
        RunnableC6969m2 m2Var = this.f30128S;
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
        if (this.f30124O != null && motionEvent.getAction() == 0) {
            this.f30124O.mo9516a(this, motionEvent);
        }
        return onTouchEvent;
    }

    public void setButtonBackground(int i) {
        if (this.f30126Q != i) {
            this.f30126Q = i;
            setBackgroundResource(i);
        }
    }

    public void setCurrentProgress(float f) {
        RunnableC6969m2 m2Var = this.f30128S;
        if (m2Var != null) {
            m2Var.m18268v(f, this.f30129T > 0.0f);
        }
    }

    public void setImageResource(int i) {
        if (this.f30125P != i) {
            this.f30125P = i;
            boolean z = this.f30130a != null;
            this.f30130a = i != 0 ? C1362c.m37482g(getResources(), i) : null;
            this.f30131b = i;
            if (z) {
                invalidate();
            }
        }
    }

    public void setTouchDownListener(AbstractC9311a aVar) {
        this.f30124O = aVar;
    }
}
