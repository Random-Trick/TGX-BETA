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
    public static Paint f23416N;
    public C3950k f23417M;
    public int f23418a;
    public boolean f23419b;
    public float f23420c;

    public C7415f(Context context) {
        super(context);
        if (f23416N == null) {
            Paint paint = new Paint(5);
            f23416N = paint;
            paint.setStrokeWidth(C1357a0.m37544i(2.0f));
            f23416N.setStyle(Paint.Style.STROKE);
        }
        C1399s0.m37196a0(this);
    }

    private void setFactor(float f) {
        if (this.f23420c != f) {
            this.f23420c = f;
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
        if (this.f23417M == null) {
            float f2 = this.f23420c;
            if (f2 != f) {
                this.f23417M = new C3950k(0, this, C2057b.f7280b, 180L, f2);
            } else {
                return;
            }
        }
        this.f23417M.m29546i(f);
    }

    public final void m16502b(float f) {
        C3950k kVar = this.f23417M;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setFactor(f);
    }

    public void m16501c(boolean z, boolean z2) {
        if (this.f23419b != z) {
            this.f23419b = z;
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
        int i = C1357a0.m37544i(10.0f);
        int i2 = C1357a0.m37544i(5.0f);
        int i3 = C1357a0.m37544i(8.0f);
        int N = C11524j.m228N(this.f23418a);
        f23416N.setColor(N);
        float measuredWidth = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.drawCircle(measuredWidth, measuredHeight, i - (f23416N.getStrokeWidth() / 2.0f), f23416N);
        float f = 1.0f;
        float f2 = 1.0f - this.f23420c;
        if (f2 <= 0.5f) {
            f = f2 / 0.5f;
        }
        float f3 = f2 > 0.5f ? (f2 - 0.5f) / 0.5f : 0.0f;
        canvas.drawCircle(measuredWidth, measuredHeight, i2 + ((i - i2) * f), C1410y.m37042g(N));
        if (f3 > 0.0f) {
            canvas.drawCircle(measuredWidth, measuredHeight, (int) (i3 * f3), C1410y.m37042g(-16777216));
        }
    }

    public void setColorId(int i) {
        this.f23418a = i;
    }
}
