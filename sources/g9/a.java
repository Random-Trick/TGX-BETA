package g9;

import android.graphics.RectF;
import ra.k;

public abstract class a extends b {
    public final int f12167f = 2;

    @Override
    public final int b() {
        return this.f12167f;
    }

    public final void h(RectF rectF) {
        k.e(rectF, "rect");
        float f10 = Float.MAX_VALUE;
        float f11 = Float.MAX_VALUE;
        float f12 = -3.4028235E38f;
        float f13 = -3.4028235E38f;
        int i10 = 0;
        while (d().hasRemaining()) {
            float f14 = d().get();
            if (i10 % 2 == 0) {
                f10 = Math.min(f10, f14);
                f13 = Math.max(f13, f14);
            } else {
                f12 = Math.max(f12, f14);
                f11 = Math.min(f11, f14);
            }
            i10++;
        }
        d().rewind();
        rectF.set(f10, f12, f13, f11);
    }
}
