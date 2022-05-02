package p292ud;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p080fb.C4335b;
import p080fb.C4336c;
import p108hb.C5064d;
import p364zd.C11524j;

public class C9722a0 extends View implements C3950k.AbstractC3952b, C4336c.AbstractC4337a {
    public View.OnClickListener f31612N;
    public float f31613O;
    public float f31614P;
    public C3950k f31615Q;
    public boolean f31616R;
    public float f31617S;
    public int f31619b;
    public int f31620c;
    public final C4336c f31611M = new C4336c(this);
    public int f31618a = C1357a0.m37544i(20.0f);

    public class C9723a extends ViewOutlineProvider {
        public C9723a() {
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (C9722a0.this.f31613O <= 0.0f) {
                outline.setEmpty();
                return;
            }
            int i = (int) (C9722a0.this.f31619b * C9722a0.this.f31613O);
            outline.setRoundRect(C9722a0.this.f31620c - i, C9722a0.this.f31620c - i, C9722a0.this.f31620c + i, C9722a0.this.f31620c + i, i);
        }
    }

    public C9722a0(Context context) {
        super(context);
        int i = C1357a0.m37544i(41.0f);
        this.f31619b = i;
        int i2 = (int) (i + (this.f31618a * 3.0f));
        this.f31620c = i2;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(i2 * 2, i2 * 2, 51);
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C9723a());
            setElevation(C1357a0.m37544i(1.0f));
            setTranslationZ(C1357a0.m37544i(2.0f));
        }
        setLayoutParams(t1);
    }

    private void setVolume(float f) {
        if (this.f31614P != f) {
            this.f31614P = f;
            invalidate();
        }
    }

    @Override
    public boolean mo7429B(float f, float f2) {
        return C4335b.m28260d(this, f, f2);
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        if (C7389v0.m16604n1(f, f2, getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.f31619b * this.f31613O)) {
            this.f31612N.onClick(this);
        }
    }

    @Override
    public void mo7427F(View view, float f, float f2) {
        C4335b.m28256h(this, view, f, f2);
    }

    @Override
    public boolean mo7426K4() {
        return C4335b.m28263a(this);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setVolume(f);
    }

    @Override
    public boolean mo7425W6(float f, float f2) {
        return C4335b.m28261c(this, f, f2);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (this.f31616R) {
            this.f31615Q.m29546i(this.f31617S);
        }
    }

    @Override
    public void mo7424Z4(View view, float f, float f2) {
        C4335b.m28258f(this, view, f, f2);
    }

    public void m7420d(float f, boolean z) {
        float min = Math.min(3.0f, f / 150.0f);
        if (!z) {
            this.f31616R = false;
            C3950k kVar = this.f31615Q;
            if (kVar != null) {
                kVar.m29543l(min);
            }
            setVolume(min);
        } else if (Math.round(this.f31618a * this.f31617S) != Math.round(this.f31618a * min)) {
            if (this.f31615Q == null) {
                float f2 = this.f31614P;
                if (f2 != min) {
                    this.f31615Q = new C3950k(0, this, C2057b.f7280b, 190L, f2);
                } else {
                    return;
                }
            }
            this.f31617S = min;
            if (min >= min || min > 0.0f || !this.f31615Q.m29533v()) {
                this.f31616R = false;
                this.f31615Q.m29546i(min);
                return;
            }
            this.f31616R = true;
        }
    }

    @Override
    public void mo7419f3(View view, float f, float f2) {
        C4335b.m28259e(this, view, f, f2);
    }

    public float getCenter() {
        return this.f31620c;
    }

    public float getExpand() {
        return this.f31613O;
    }

    @Override
    public long getLongPressDuration() {
        return C4335b.m28262b(this);
    }

    public int getSize() {
        return this.f31620c * 2;
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return C7389v0.m16604n1(f, f2, getMeasuredWidth() / 2, getMeasuredHeight() / 2, this.f31619b * this.f31613O);
    }

    @Override
    public void mo7417o2(View view, float f, float f2) {
        C4335b.m28257g(this, view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int N = C11524j.m228N(R.id.theme_color_circleButtonRegular);
        int i = this.f31620c;
        canvas.drawCircle(i, i, (this.f31619b + (this.f31618a * this.f31614P)) * this.f31613O, C1410y.m37042g(C5064d.m24132a(0.3f, N)));
        int i2 = this.f31620c;
        canvas.drawCircle(i2, i2, this.f31619b * this.f31613O, C1410y.m37042g(N));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f31612N != null && (motionEvent.getAction() != 0 || (this.f31613O == 1.0f && C7389v0.m16604n1(motionEvent.getX(), motionEvent.getY(), (float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), ((float) this.f31619b) * this.f31613O))) && this.f31611M.m28248e(this, motionEvent);
    }

    @Override
    public void mo7416p(View view, float f, float f2) {
        C4335b.m28255i(this, view, f, f2);
    }

    public void setExpand(float f) {
        if (this.f31613O != f) {
            this.f31613O = f;
            if (Build.VERSION.SDK_INT >= 21) {
                invalidateOutline();
            }
            invalidate();
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f31612N = onClickListener;
    }

    @Override
    public boolean mo7415z4(View view, float f, float f2) {
        return C4335b.m28253k(this, view, f, f2);
    }

    @Override
    public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        C4335b.m28254j(this, view, motionEvent, f, f2, f3, f4);
    }
}
