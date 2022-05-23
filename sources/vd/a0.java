package vd;

import ae.j;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import ce.y;
import eb.k;
import gb.b;
import gb.c;
import ib.d;
import me.vkryl.android.widget.FrameLayoutFix;
import oc.v0;
import org.thunderdog.challegram.R;

public class a0 extends View implements k.b, c.a {
    public View.OnClickListener N;
    public float O;
    public float P;
    public k Q;
    public boolean R;
    public float S;
    public int f25412b;
    public int f25413c;
    public final c M = new c(this);
    public int f25411a = ce.a0.i(20.0f);

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (a0.this.O <= 0.0f) {
                outline.setEmpty();
                return;
            }
            int i10 = (int) (a0.this.f25412b * a0.this.O);
            outline.setRoundRect(a0.this.f25413c - i10, a0.this.f25413c - i10, a0.this.f25413c + i10, a0.this.f25413c + i10, i10);
        }
    }

    public a0(Context context) {
        super(context);
        int i10 = ce.a0.i(41.0f);
        this.f25412b = i10;
        int i11 = (int) (i10 + (this.f25411a * 3.0f));
        this.f25413c = i11;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(i11 * 2, i11 * 2, 51);
        setOutlineProvider(new a());
        setElevation(ce.a0.i(1.0f));
        setTranslationZ(ce.a0.i(2.0f));
        setLayoutParams(r12);
    }

    private void setVolume(float f10) {
        if (this.P != f10) {
            this.P = f10;
            invalidate();
        }
    }

    @Override
    public boolean B(float f10, float f11) {
        return b.d(this, f10, f11);
    }

    @Override
    public void C(View view, float f10, float f11) {
        if (v0.n1(f10, f11, getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.f25412b * this.O)) {
            this.N.onClick(this);
        }
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

    public void d(float f10, boolean z10) {
        float min = Math.min(3.0f, f10 / 150.0f);
        if (!z10) {
            this.R = false;
            k kVar = this.Q;
            if (kVar != null) {
                kVar.l(min);
            }
            setVolume(min);
        } else if (Math.round(this.f25411a * this.S) != Math.round(this.f25411a * min)) {
            if (this.Q == null) {
                float f11 = this.P;
                if (f11 != min) {
                    this.Q = new k(0, this, db.b.f7287b, 190L, f11);
                } else {
                    return;
                }
            }
            this.S = min;
            if (min >= min || min > 0.0f || !this.Q.v()) {
                this.R = false;
                this.Q.i(min);
                return;
            }
            this.R = true;
        }
    }

    public float getCenter() {
        return this.f25413c;
    }

    public float getExpand() {
        return this.O;
    }

    @Override
    public long getLongPressDuration() {
        return b.b(this);
    }

    public int getSize() {
        return this.f25413c * 2;
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return v0.n1(f10, f11, getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.f25412b * this.O);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        setVolume(f10);
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
        if (this.R) {
            this.Q.i(this.S);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int L = j.L(R.id.theme_color_circleButtonRegular);
        int i10 = this.f25413c;
        canvas.drawCircle(i10, i10, (this.f25412b + (this.f25411a * this.P)) * this.O, y.g(d.a(0.3f, L)));
        int i11 = this.f25413c;
        canvas.drawCircle(i11, i11, this.f25412b * this.O, y.g(L));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.N != null && (motionEvent.getAction() != 0 || (this.O == 1.0f && v0.n1(motionEvent.getX(), motionEvent.getY(), (float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), ((float) this.f25412b) * this.O))) && this.M.e(this, motionEvent);
    }

    @Override
    public boolean s4(View view, float f10, float f11) {
        return b.k(this, view, f10, f11);
    }

    public void setExpand(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidateOutline();
            invalidate();
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.N = onClickListener;
    }

    @Override
    public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
        b.j(this, view, motionEvent, f10, f11, f12, f13);
    }
}
