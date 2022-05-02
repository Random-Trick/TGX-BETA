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
    public int f23293a;
    public AbstractC11531p f23294b;
    public float f23295c;
    public float f23296d = 1.0f;

    public C7368l(int i) {
        this.f23293a = i;
    }

    public final int m16763a() {
        return this.f23293a;
    }

    public int mo9863b() {
        float f = this.f23296d;
        AbstractC11531p pVar = this.f23294b;
        return C5064d.m24132a(f, pVar != null ? pVar.mo92e(this.f23293a) : C11524j.m228N(this.f23293a));
    }

    public void m16762c(float f) {
        if (this.f23296d != f) {
            this.f23296d = f;
            invalidateSelf();
        }
    }

    public final void m16761d(int i) {
        if (this.f23293a != i) {
            this.f23293a = i;
            invalidateSelf();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f23293a == 0) {
            return;
        }
        if (this.f23295c != 0.0f) {
            RectF a0 = C1410y.m37053a0();
            a0.set(getBounds());
            float i = C1357a0.m37544i(this.f23295c);
            canvas.drawRoundRect(a0, i, i, C1410y.m37042g(mo9863b()));
            return;
        }
        canvas.drawRect(getBounds(), C1410y.m37042g(mo9863b()));
    }

    public void m16760e(float f) {
        if (this.f23295c != f) {
            this.f23295c = f;
            invalidateSelf();
        }
    }

    public final void m16759f(AbstractC11531p pVar) {
        if (this.f23294b != pVar) {
            this.f23294b = pVar;
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
