package p194nd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import be.C1357a0;
import be.C1399s0;
import be.C1410y;
import p037cb.C2057b;
import p051db.C3950k;
import p364zd.C11524j;

public class C7415f extends View implements C3950k.AbstractC3952b {
    public static Paint f23413N;
    public C3950k f23414M;
    public int f23415a;
    public boolean f23416b;
    public float f23417c;

    public C7415f(Context context) {
        super(context);
        if (f23413N == null) {
            Paint paint = new Paint(5);
            f23413N = paint;
            paint.setStrokeWidth(C1357a0.m37541i(2.0f));
            f23413N.setStyle(Paint.Style.STROKE);
        }
        C1399s0.m37193a0(this);
    }

    private void setFactor(float f) {
        if (this.f23417c != f) {
            this.f23417c = f;
            invalidate();
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        setFactor(f);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m16503a(float f) {
        if (this.f23414M == null) {
            float f2 = this.f23417c;
            if (f2 != f) {
                this.f23414M = new C3950k(0, this, C2057b.f7280b, 180L, f2);
            } else {
                return;
            }
        }
        this.f23414M.m29544i(f);
    }

    public final void m16502b(float f) {
        C3950k kVar = this.f23414M;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setFactor(f);
    }

    public void m16501c(boolean z, boolean z2) {
        if (this.f23416b != z) {
            this.f23416b = z;
            float f = 1.0f;
            if (z2) {
                if (!z) {
                    f = 0.0f;
                }
                m16503a(f);
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            m16502b(f);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i = C1357a0.m37541i(10.0f);
        int i2 = C1357a0.m37541i(5.0f);
        int i3 = C1357a0.m37541i(8.0f);
        int N = C11524j.m228N(this.f23415a);
        f23413N.setColor(N);
        float measuredWidth = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.drawCircle(measuredWidth, measuredHeight, i - (f23413N.getStrokeWidth() / 2.0f), f23413N);
        float f = 1.0f;
        float f2 = 1.0f - this.f23417c;
        if (f2 <= 0.5f) {
            f = f2 / 0.5f;
        }
        float f3 = f2 > 0.5f ? (f2 - 0.5f) / 0.5f : 0.0f;
        canvas.drawCircle(measuredWidth, measuredHeight, i2 + ((i - i2) * f), C1410y.m37039g(N));
        if (f3 > 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, (int) (i3 * f3), C1410y.m37039g(-16777216));
        }
    }

    public void setColorId(int i) {
        this.f23415a = i;
    }
}
