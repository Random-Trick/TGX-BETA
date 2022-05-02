package me;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1410y;
import ie.C5386e;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;

public class C6853c2 extends View implements C3950k.AbstractC3952b, C4336c.AbstractC4337a {
    public boolean f21494M;
    public AbstractC6854a f21495N;
    public C5386e f21496O;
    public int f21497P;
    public Drawable f21498Q;
    public int f21499R;
    public float f21500S;
    public float f21501T;
    public int f21502U;
    public int f21503V;
    public boolean f21504W;
    public View.OnClickListener f21506a0;
    public View.OnLongClickListener f21508b0;
    public C3950k f21510c0;
    public float f21511d0;
    public C3950k f21512e0;
    public float f21513f0;
    public RunnableC6969m2 f21514g0;
    public C3950k f21515h0;
    public float f21516i0;
    public boolean f21517j0;
    public C3950k f21518k0;
    public boolean f21519l0;
    public float f21520m0;
    public int f21521n0;
    public float f21522o0 = 1.0f;
    public final Path f21505a = new Path();
    public final RectF f21507b = new RectF();
    public final C4336c f21509c = new C4336c(this);

    public interface AbstractC6854a {
        void mo18765l(C6853c2 c2Var, boolean z);
    }

    public C6853c2(Context context) {
        super(context);
    }

    public static int m18773c() {
        return C1357a0.m37541i(32.0f);
    }

    private int getRadius() {
        return this.f21520m0 == 0.0f ? C1357a0.m37541i(3.0f) : C1357a0.m37541i(3.0f) + ((int) ((C1357a0.m37541i(14.0f) - C1357a0.m37541i(3.0f)) * this.f21520m0));
    }

    private int getStrokeWidth() {
        return C1357a0.m37541i(1.5f);
    }

    private void setDoneFactor(float f) {
        if (this.f21520m0 != f) {
            this.f21520m0 = f;
            invalidate();
        }
    }

    private void setFadeFactor(float f) {
        if (this.f21513f0 != f) {
            this.f21513f0 = f;
            invalidate();
        }
    }

    private void setInnerAlpha(float f) {
        if (this.f21522o0 != f) {
            this.f21522o0 = f;
            invalidate();
        }
    }

    private void setIsPressed(boolean z) {
        if (this.f21504W != z) {
            this.f21504W = z;
            AbstractC6854a aVar = this.f21495N;
            if (aVar != null) {
                aVar.mo18765l(this, z);
            }
        }
    }

    private void setPressedFactor(float f) {
        if (this.f21511d0 != f) {
            this.f21511d0 = f;
            invalidate();
        }
    }

    private void setProgressFactor(float f) {
        if (this.f21516i0 != f) {
            this.f21516i0 = f;
            invalidate();
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return this.f21508b0 != null;
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        m18772d();
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28254h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28261a(this);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setPressedFactor(f);
        } else if (i == 1) {
            setFadeFactor(f);
        } else if (i == 2) {
            setProgressFactor(f);
        } else if (i == 3) {
            setDoneFactor(f);
        }
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28259c(this, f, f2);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 1) {
            m18770f();
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28256f(this, view, f, f2);
    }

    public final void m18775a(float f) {
        if (this.f21512e0 == null) {
            this.f21512e0 = new C3950k(1, this, C2057b.f7280b, 180L, this.f21513f0);
        }
        this.f21512e0.m29544i(f);
    }

    public final void m18774b(float f) {
        if (this.f21510c0 == null) {
            this.f21510c0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f21511d0);
        }
        this.f21510c0.m29544i(f);
    }

    public final void m18772d() {
        C2065g.m35719c(this);
        View.OnClickListener onClickListener = this.f21506a0;
        if (onClickListener != null && !this.f21517j0) {
            onClickListener.onClick(this);
        }
    }

    public final boolean m18771e() {
        View.OnLongClickListener onLongClickListener = this.f21508b0;
        return onLongClickListener != null && onLongClickListener.onLongClick(this);
    }

    public final void m18770f() {
        this.f21512e0.m29541l(0.0f);
        this.f21513f0 = 0.0f;
        C3950k kVar = this.f21510c0;
        if (kVar != null) {
            kVar.m29541l(0.0f);
        }
        this.f21511d0 = 0.0f;
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28257e(this, view, f, f2);
    }

    public void m18769g(boolean z, boolean z2) {
        if (z && this.f21514g0 == null) {
            RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37307r(getContext()), C1357a0.m37541i(3.5f));
            this.f21514g0 = m2Var;
            m2Var.m18289a(this);
            m18767i();
        }
        float f = 1.0f;
        if (this.f21517j0 == z || !z2) {
            this.f21517j0 = z;
            C3950k kVar = this.f21515h0;
            if (kVar != null) {
                kVar.m29541l(z ? 1.0f : 0.0f);
            }
            if (!z) {
                f = 0.0f;
            }
            setProgressFactor(f);
            return;
        }
        this.f21517j0 = z;
        if (this.f21515h0 == null) {
            this.f21515h0 = new C3950k(2, this, C2057b.f7280b, 180L, this.f21516i0);
        }
        C3950k kVar2 = this.f21515h0;
        if (!z) {
            f = 0.0f;
        }
        kVar2.m29544i(f);
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28260b(this);
    }

    public void m18768h(boolean z, boolean z2) {
        float f = 1.0f;
        if (this.f21519l0 != z && z2) {
            this.f21519l0 = z;
            if (this.f21518k0 == null) {
                this.f21518k0 = new C3950k(3, this, C2057b.f7280b, 180L, this.f21520m0);
            }
            C3950k kVar = this.f21518k0;
            if (!z) {
                f = 0.0f;
            }
            kVar.m29544i(f);
        } else if (!z2) {
            this.f21519l0 = z;
            C3950k kVar2 = this.f21518k0;
            if (kVar2 != null) {
                kVar2.m29541l(z ? 1.0f : 0.0f);
            }
            if (!z) {
                f = 0.0f;
            }
            setDoneFactor(f);
        }
    }

    public final void m18767i() {
        if (this.f21514g0 != null) {
            int strokeWidth = getStrokeWidth() / 2;
            int measuredWidth = getMeasuredWidth();
            this.f21514g0.m18274p((measuredWidth - C1357a0.m37541i(13.0f)) - strokeWidth, strokeWidth, measuredWidth - strokeWidth, C1357a0.m37541i(13.0f) + strokeWidth);
        }
    }

    public final void m18766j() {
        int strokeWidth;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float strokeWidth2 = getStrokeWidth() / 2;
        this.f21507b.set(strokeWidth2, strokeWidth2, measuredWidth - strokeWidth, measuredHeight - strokeWidth);
        this.f21505a.reset();
        this.f21505a.addRoundRect(this.f21507b, C1357a0.m37541i(3.0f), C1357a0.m37541i(3.0f), Path.Direction.CCW);
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f21506a0 != null && !this.f21519l0 && isEnabled() && getVisibility() == 0;
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28255g(this, view, f, f2);
    }

    @Override
    public void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: me.C6853c2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f21497P + (C1357a0.m37541i(15.0f) * 2) + getPaddingLeft() + getPaddingRight(), Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        m18766j();
        m18767i();
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: me.C6853c2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28253i(this, view, f, f2);
    }

    public void setBackgroundColorId(int i) {
        if (this.f21521n0 != i) {
            this.f21521n0 = i;
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            setInnerAlpha(z ? 1.0f : 0.3f);
        }
    }

    public void setForceActive(boolean z) {
        if (this.f21494M != z) {
            this.f21494M = z;
            invalidate();
        }
    }

    public void setIcon(int i) {
        this.f21498Q = i != 0 ? this.f21499R == i ? this.f21498Q : C1362c.m37482g(getResources(), i) : null;
        this.f21499R = i;
        this.f21496O = null;
        this.f21497P = 0;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21506a0 = onClickListener;
    }

    @Override
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f21508b0 = onLongClickListener;
    }

    public void setPressureListener(AbstractC6854a aVar) {
        this.f21495N = aVar;
    }

    public void setText(int i) {
        C5386e eVar = i != 0 ? new C5386e(C4403w.m27869i1(i).toUpperCase()) : null;
        this.f21496O = eVar;
        this.f21497P = eVar != null ? (int) C7389v0.m16680T1(eVar.f17711a, C1410y.m37023o(eVar.f17712b)) : 0;
        this.f21498Q = null;
        this.f21499R = 0;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return m18771e();
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
    }
}
