package p335xd;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import be.C1357a0;
import be.C1410y;

public class C10186a extends AbstractC10190e {
    public C10186a(int i, float f, boolean z) {
        super(i, f, z);
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        int i = C1357a0.m37544i(this.f32936M) / 2;
        int b = mo5791b();
        if (Build.VERSION.SDK_INT < 21) {
            canvas.drawCircle(centerX, centerY, i, C1410y.m37084B0(b));
        } else if (b != 0) {
            canvas.drawCircle(centerX, centerY, i, C1410y.m37042g(b));
        }
    }
}
