package p335xd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import be.C1357a0;
import be.C1410y;

public class C10188c extends AbstractC10190e {
    public final float f32934P;

    public C10188c(int i, float f, float f2, boolean z) {
        super(i, f, z);
        this.f32934P = f2;
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF a0 = C1410y.m37053a0();
        int i = C1357a0.m37544i(this.f32934P);
        a0.set(bounds.left + i, bounds.top + i, bounds.right - i, bounds.bottom - i);
        int i2 = C1357a0.m37544i(this.f32936M);
        int b = mo5791b();
        if (Build.VERSION.SDK_INT >= 21) {
            float f = i2;
            canvas.drawRoundRect(a0, f, f, C1410y.m37042g(b));
            return;
        }
        float f2 = i2;
        canvas.drawRoundRect(a0, f2, f2, C1410y.m37084B0(b));
    }
}
