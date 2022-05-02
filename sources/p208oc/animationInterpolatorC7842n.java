package p208oc;

import android.graphics.PointF;
import android.view.animation.Interpolator;

public class animationInterpolatorC7842n implements Interpolator {
    public static final animationInterpolatorC7842n f25238f = new animationInterpolatorC7842n(0.25d, 0.1d, 0.25d, 1.0d);
    public static final animationInterpolatorC7842n f25239g = new animationInterpolatorC7842n(0.0d, 0.0d, 0.58d, 1.0d);
    public static final animationInterpolatorC7842n f25240h = new animationInterpolatorC7842n(0.23d, 1.0d, 0.32d, 1.0d);
    public static final animationInterpolatorC7842n f25241i = new animationInterpolatorC7842n(0.42d, 0.0d, 1.0d, 1.0d);
    public static final animationInterpolatorC7842n f25242j = new animationInterpolatorC7842n(0.42d, 0.0d, 0.58d, 1.0d);
    public PointF f25243a;
    public PointF f25244b;
    public PointF f25245c;
    public PointF f25246d;
    public PointF f25247e;

    public animationInterpolatorC7842n(PointF pointF, PointF pointF2) {
        this.f25245c = new PointF();
        this.f25246d = new PointF();
        this.f25247e = new PointF();
        float f = pointF.x;
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        }
        float f2 = pointF2.x;
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        this.f25243a = pointF;
        this.f25244b = pointF2;
    }

    public final float m14888a(float f) {
        PointF pointF = this.f25247e;
        PointF pointF2 = this.f25243a;
        float f2 = pointF2.x * 3.0f;
        pointF.x = f2;
        PointF pointF3 = this.f25246d;
        float f3 = ((this.f25244b.x - pointF2.x) * 3.0f) - f2;
        pointF3.x = f3;
        PointF pointF4 = this.f25245c;
        float f4 = (1.0f - pointF.x) - f3;
        pointF4.x = f4;
        return f * (pointF.x + ((pointF3.x + (f4 * f)) * f));
    }

    public float m14887b(float f) {
        PointF pointF = this.f25247e;
        PointF pointF2 = this.f25243a;
        float f2 = pointF2.y * 3.0f;
        pointF.y = f2;
        PointF pointF3 = this.f25246d;
        float f3 = ((this.f25244b.y - pointF2.y) * 3.0f) - f2;
        pointF3.y = f3;
        PointF pointF4 = this.f25245c;
        float f4 = (1.0f - pointF.y) - f3;
        pointF4.y = f4;
        return f * (pointF.y + ((pointF3.y + (f4 * f)) * f));
    }

    public final float m14886c(float f) {
        return this.f25247e.x + (f * ((this.f25246d.x * 2.0f) + (this.f25245c.x * 3.0f * f)));
    }

    public float m14885d(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            float a = m14888a(f2) - f;
            if (Math.abs(a) < 0.001d) {
                break;
            }
            f2 -= a / m14886c(f2);
        }
        return f2;
    }

    @Override
    public float getInterpolation(float f) {
        return m14887b(m14885d(f));
    }

    public animationInterpolatorC7842n(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, f4));
    }

    public animationInterpolatorC7842n(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4);
    }
}
