package p078f9;

import android.graphics.RectF;
import qa.C8298k;

public abstract class AbstractC4328a extends AbstractC4329b {
    public final int f14398f = 2;

    @Override
    public final int mo28269b() {
        return this.f14398f;
    }

    public final void m28270h(RectF rectF) {
        C8298k.m12934e(rectF, "rect");
        float f = Float.MAX_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = -3.4028235E38f;
        float f4 = -3.4028235E38f;
        int i = 0;
        while (mo28263d().hasRemaining()) {
            float f5 = mo28263d().get();
            if (i % 2 == 0) {
                f = Math.min(f, f5);
                f4 = Math.max(f4, f5);
            } else {
                f3 = Math.max(f3, f5);
                f2 = Math.min(f2, f5);
            }
            i++;
        }
        mo28263d().rewind();
        rectF.set(f, f3, f4, f2);
    }
}
