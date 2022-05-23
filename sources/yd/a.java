package yd;

import android.graphics.Canvas;
import android.graphics.Rect;
import ce.a0;
import ce.y;

public class a extends e {
    public a(int i10, float f10, boolean z10) {
        super(i10, f10, z10);
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        int i10 = a0.i(this.M) / 2;
        int b10 = b();
        if (b10 != 0) {
            canvas.drawCircle(centerX, centerY, i10, y.g(b10));
        }
    }
}
