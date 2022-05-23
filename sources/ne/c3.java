package ne;

import ae.j;
import ae.z;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import ce.a0;
import ce.c;
import ce.p0;
import db.b;
import eb.f;
import eb.k;
import org.thunderdog.challegram.R;
import ud.x2;

public class c3 extends View implements k.b, x2.f {
    public static Paint Q;
    public final f M;
    public final f N;
    public float O;
    public k P;
    public final Drawable f17929a;
    public boolean f17930b;
    public final f f17931c;

    public c3(Context context, int i10) {
        super(context);
        DecelerateInterpolator decelerateInterpolator = b.f7287b;
        this.f17931c = new f(0, this, decelerateInterpolator, 180L);
        this.M = new f(1, this, decelerateInterpolator, 220L, true);
        this.N = new f(2, this, decelerateInterpolator, 180L);
        this.f17929a = c.g(getResources(), i10);
        if (Q == null) {
            Paint paint = new Paint(5);
            Q = paint;
            paint.setStyle(Paint.Style.STROKE);
            Q.setColor(j.o0());
            z.f(Q, R.id.theme_color_icon);
            Q.setStrokeWidth(a0.i(2.0f));
        }
    }

    private void setInInlineMode(boolean z10) {
        this.N.p(z10, true);
    }

    private void setInInlineProgress(boolean z10) {
        if (this.f17930b != z10) {
            this.f17930b = z10;
            a();
        }
    }

    public final void a() {
        if (this.f17930b) {
            k kVar = this.P;
            if (kVar == null) {
                this.P = new k(3, this, b.f7290e, 890L);
            } else if (!kVar.v()) {
                this.O = 0.0f;
                this.P.l(0.0f);
            } else {
                return;
            }
            this.P.i(1.0f);
        }
    }

    public void c(boolean z10, boolean z11) {
        this.f17931c.p(z10, false);
        this.M.p(z11, false);
    }

    public boolean d() {
        return this.N.h();
    }

    @Override
    public void d1(View view, Rect rect) {
        rect.top += a0.i(8.0f);
        rect.bottom -= a0.i(8.0f);
    }

    public boolean f() {
        return !this.f17931c.h() && !this.N.h();
    }

    public void g(boolean z10, boolean z11) {
        setInInlineMode(z10);
        setInInlineProgress(z11);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 3) {
            this.O = f10;
        }
        invalidate();
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 3) {
            a();
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: ne.c3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return p0.J(this, motionEvent) && super.onTouchEvent(motionEvent);
    }

    public void setInEditMode(boolean z10) {
        this.f17931c.p(z10, true);
    }

    public void setIsActive(boolean z10) {
        this.M.p(z10, this.f17931c.g() > 0.0f);
    }
}
