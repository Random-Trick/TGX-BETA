package me;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p364zd.C11524j;
import p364zd.C11541z;
import td.C9357x2;

public class C6855c3 extends View implements C3950k.AbstractC3952b, C9357x2.AbstractC9363f {
    public static Paint f21523Q;
    public final C3940f f21524M;
    public final C3940f f21525N;
    public float f21526O;
    public C3950k f21527P;
    public final Drawable f21528a;
    public boolean f21529b;
    public final C3940f f21530c;

    public C6855c3(Context context, int i) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f21530c = new C3940f(0, this, decelerateInterpolator, 180L);
        this.f21524M = new C3940f(1, this, decelerateInterpolator, 220L, true);
        this.f21525N = new C3940f(2, this, decelerateInterpolator, 180L);
        this.f21528a = C1362c.m37485g(getResources(), i);
        if (f21523Q == null) {
            Paint paint = new Paint(5);
            f21523Q = paint;
            paint.setStyle(Paint.Style.STROKE);
            f21523Q.setColor(C11524j.m159q0());
            C11541z.m24e(f21523Q, R.id.theme_color_icon);
            f21523Q.setStrokeWidth(C1357a0.m37544i(2.0f));
        }
    }

    private void setInInlineMode(boolean z) {
        this.f21525N.m29577p(z, true);
    }

    private void setInInlineProgress(boolean z) {
        if (this.f21529b != z) {
            this.f21529b = z;
            m18765a();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 3) {
            this.f21526O = f;
        }
        invalidate();
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 3) {
            m18765a();
        }
    }

    public final void m18765a() {
        if (this.f21529b) {
            C3950k kVar = this.f21527P;
            if (kVar == null) {
                this.f21527P = new C3950k(3, this, C2057b.f7283e, 890L);
            } else if (!kVar.m29533v()) {
                this.f21526O = 0.0f;
                this.f21527P.m29543l(0.0f);
            } else {
                return;
            }
            this.f21527P.m29546i(1.0f);
        }
    }

    public void m18764c(boolean z, boolean z2) {
        this.f21530c.m29577p(z, false);
        this.f21524M.m29577p(z2, false);
    }

    public boolean m18763d() {
        return this.f21525N.m29585h();
    }

    public boolean m18762e() {
        return !this.f21530c.m29585h() && !this.f21525N.m29585h();
    }

    @Override
    public void mo8098f1(View view, Rect rect) {
        rect.top += C1357a0.m37544i(8.0f);
        rect.bottom -= C1357a0.m37544i(8.0f);
    }

    public void m18761g(boolean z, boolean z2) {
        setInInlineMode(z);
        setInInlineProgress(z2);
    }

    @Override
    public void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: me.C6855c3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return C1399s0.m37208P(this, motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setInEditMode(boolean z) {
        this.f21530c.m29577p(z, true);
    }

    public void setIsActive(boolean z) {
        this.f21524M.m29577p(z, this.f21530c.m29586g() > 0.0f);
    }
}
