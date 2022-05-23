package pc;

import android.graphics.PointF;
import android.view.animation.Interpolator;

public class n implements Interpolator {
    public static final n f21131f = new n(0.25d, 0.1d, 0.25d, 1.0d);
    public static final n f21132g = new n(0.0d, 0.0d, 0.58d, 1.0d);
    public static final n f21133h = new n(0.23d, 1.0d, 0.32d, 1.0d);
    public static final n f21134i = new n(0.42d, 0.0d, 1.0d, 1.0d);
    public static final n f21135j = new n(0.42d, 0.0d, 0.58d, 1.0d);
    public PointF f21136a;
    public PointF f21137b;
    public PointF f21138c;
    public PointF f21139d;
    public PointF f21140e;

    public n(PointF pointF, PointF pointF2) {
        this.f21138c = new PointF();
        this.f21139d = new PointF();
        this.f21140e = new PointF();
        float f10 = pointF.x;
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        float f11 = pointF2.x;
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        this.f21136a = pointF;
        this.f21137b = pointF2;
    }

    public final float a(float f10) {
        PointF pointF = this.f21140e;
        PointF pointF2 = this.f21136a;
        float f11 = pointF2.x * 3.0f;
        pointF.x = f11;
        PointF pointF3 = this.f21139d;
        float f12 = ((this.f21137b.x - pointF2.x) * 3.0f) - f11;
        pointF3.x = f12;
        PointF pointF4 = this.f21138c;
        float f13 = (1.0f - pointF.x) - f12;
        pointF4.x = f13;
        return f10 * (pointF.x + ((pointF3.x + (f13 * f10)) * f10));
    }

    public float b(float f10) {
        PointF pointF = this.f21140e;
        PointF pointF2 = this.f21136a;
        float f11 = pointF2.y * 3.0f;
        pointF.y = f11;
        PointF pointF3 = this.f21139d;
        float f12 = ((this.f21137b.y - pointF2.y) * 3.0f) - f11;
        pointF3.y = f12;
        PointF pointF4 = this.f21138c;
        float f13 = (1.0f - pointF.y) - f12;
        pointF4.y = f13;
        return f10 * (pointF.y + ((pointF3.y + (f13 * f10)) * f10));
    }

    public final float c(float f10) {
        return this.f21140e.x + (f10 * ((this.f21139d.x * 2.0f) + (this.f21138c.x * 3.0f * f10)));
    }

    public float d(float f10) {
        float f11 = f10;
        for (int i10 = 1; i10 < 14; i10++) {
            float a10 = a(f11) - f10;
            if (Math.abs(a10) < 0.001d) {
                break;
            }
            f11 -= a10 / c(f11);
        }
        return f11;
    }

    @Override
    public float getInterpolation(float f10) {
        return b(d(f10));
    }

    public n(float f10, float f11, float f12, float f13) {
        this(new PointF(f10, f11), new PointF(f12, f13));
    }

    public n(double d10, double d11, double d12, double d13) {
        this((float) d10, (float) d11, (float) d12, (float) d13);
    }
}
