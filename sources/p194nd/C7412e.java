package p194nd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import me.RunnableC6969m2;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p080fb.C4343h;
import p108hb.C5064d;
import p139jb.AbstractC5911c;

public class C7412e extends View implements AbstractC5911c {
    public Runnable f23409M;
    public RunnableC6969m2 f23411b;
    public final RectF f23410a = new RectF();
    public final C3940f f23412c = new C3940f(0, new C3950k.AbstractC3952b() {
        @Override
        public final void mo45P5(int i, float f, float f2, C3950k kVar) {
            C7412e.this.m16506c(i, f, f2, kVar);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3953l.m29528a(this, i, f, kVar);
        }
    }, C2057b.f7285g, 210);

    public C7412e(Context context) {
        super(context);
        setWillNotDraw(false);
        RunnableC6969m2 m2Var = new RunnableC6969m2(C1379j0.m37310r(getContext()), C1357a0.m37544i(18.0f));
        this.f23411b = m2Var;
        m2Var.m18286d(-1);
        this.f23411b.m18292D();
        this.f23411b.m18293C(C1357a0.m37544i(4.0f));
        this.f23411b.m18291E(new C4343h(this));
        this.f23411b.m18275o(0.0f);
        this.f23411b.m18289a(this);
    }

    public void m16506c(int i, float f, float f2, C3950k kVar) {
        this.f23411b.m18275o(f);
    }

    public void m16505d() {
        this.f23412c.m29577p(true, true);
        this.f23409M = null;
    }

    @Override
    public void mo4501a3() {
        this.f23411b.m18288b(this);
        this.f23411b.mo4501a3();
    }

    public void m16504e(boolean z, boolean z2) {
        if (!z) {
            Runnable runnable = this.f23409M;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f23409M = null;
            }
            this.f23412c.m29577p(false, true);
        } else if (!z2) {
            this.f23412c.m29577p(true, true);
        } else if (this.f23409M == null) {
            Runnable dVar = new Runnable() {
                @Override
                public final void run() {
                    C7412e.this.m16505d();
                }
            };
            this.f23409M = dVar;
            postDelayed(dVar, 350L);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f23410a, C1357a0.m37544i(12.0f), C1357a0.m37544i(12.0f), C1410y.m37058W(C5064d.m24131b((int) (Color.alpha(1275068416) * this.f23412c.m29586g()), 1275068416)));
        this.f23411b.m18287c(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int i3 = C1357a0.m37544i(42.0f);
        this.f23411b.m18274p(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f23410a.set(measuredWidth - i3, measuredHeight - i3, measuredWidth + i3, measuredHeight + i3);
    }

    public void setProgressVisibleInstant(boolean z) {
        Runnable runnable = this.f23409M;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f23409M = null;
        }
        this.f23412c.m29577p(z, false);
    }
}
