package nc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import be.C1357a0;
import be.C1410y;
import p108hb.C5064d;
import p364zd.AbstractC11531p;
import p364zd.C11524j;

public class C7368l extends Drawable {
    public int f23290a;
    public AbstractC11531p f23291b;
    public float f23292c;
    public float f23293d = 1.0f;

    public C7368l(int i) {
        this.f23290a = i;
    }

    public final int m16763a() {
        return this.f23290a;
    }

    public int mo9864b() {
        float f = this.f23293d;
        AbstractC11531p pVar = this.f23291b;
        return C5064d.m24131a(f, pVar != null ? pVar.mo92e(this.f23290a) : C11524j.m228N(this.f23290a));
    }

    public void m16762c(float f) {
        if (this.f23293d != f) {
            this.f23293d = f;
            invalidateSelf();
        }
    }

    public final void m16761d(int i) {
        if (this.f23290a != i) {
            this.f23290a = i;
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f23290a == 0) {
            return;
        }
        if (this.f23292c != 0.0f) {
            RectF a0 = C1410y.m37050a0();
            a0.set(getBounds());
            float i = C1357a0.m37541i(this.f23292c);
            canvas.drawRoundRect(a0, i, i, C1410y.m37039g(mo9864b()));
            return;
        }
        canvas.drawRect(getBounds(), C1410y.m37039g(mo9864b()));
    }

    public void m16760e(float f) {
        if (this.f23292c != f) {
            this.f23292c = f;
            invalidateSelf();
        }
    }

    public final void m16759f(AbstractC11531p pVar) {
        if (this.f23291b != pVar) {
            this.f23291b = pVar;
            invalidateSelf();
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
