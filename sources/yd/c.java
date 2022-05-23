package yd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import ce.a0;
import ce.y;

public class c extends e {
    public final float P;

    public c(int i10, float f10, float f11, boolean z10) {
        super(i10, f10, z10);
        this.P = f11;
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF a02 = y.a0();
        int i10 = a0.i(this.P);
        a02.set(bounds.left + i10, bounds.top + i10, bounds.right - i10, bounds.bottom - i10);
        float i11 = a0.i(this.M);
        canvas.drawRoundRect(a02, i11, i11, y.g(b()));
    }
}
