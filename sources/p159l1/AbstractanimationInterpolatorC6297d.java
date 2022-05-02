package p159l1;

import android.view.animation.Interpolator;

public abstract class AbstractanimationInterpolatorC6297d implements Interpolator {
    public final float[] f19834a;
    public final float f19835b;

    public AbstractanimationInterpolatorC6297d(float[] fArr) {
        this.f19834a = fArr;
        this.f19835b = 1.0f / (fArr.length - 1);
    }

    @Override
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f19834a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f19835b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f19834a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
