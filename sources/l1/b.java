package l1;

import android.view.animation.Interpolator;

public abstract class b implements Interpolator {
    public final float[] f15995a;
    public final float f15996b;

    public b(float[] fArr) {
        this.f15995a = fArr;
        this.f15996b = 1.0f / (fArr.length - 1);
    }

    @Override
    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f15995a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f15996b;
        float f12 = (f10 - (min * f11)) / f11;
        float[] fArr2 = this.f15995a;
        return fArr2[min] + (f12 * (fArr2[min + 1] - fArr2[min]));
    }
}
