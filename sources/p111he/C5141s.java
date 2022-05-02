package p111he;

import android.graphics.drawable.Drawable;
import be.C1362c;
import p143k0.C6038h;

public final class C5141s {
    public static Drawable m23833a(AbstractC5143t tVar, int i, int i2) {
        if (i == 0) {
            return null;
        }
        C6038h<Drawable> sparseDrawableHolder = tVar.getSparseDrawableHolder();
        Drawable e = sparseDrawableHolder.m21471e(i);
        if (e != null) {
            return e;
        }
        Drawable g = C1362c.m37482g(tVar.getSparseDrawableResources(), i);
        sparseDrawableHolder.m21466j(i, g);
        return g;
    }
}
