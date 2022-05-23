package ie;

import android.graphics.drawable.Drawable;
import ce.c;
import k0.h;

public final class s {
    public static Drawable a(t tVar, int i10, int i11) {
        if (i10 == 0) {
            return null;
        }
        h<Drawable> sparseDrawableHolder = tVar.getSparseDrawableHolder();
        Drawable e10 = sparseDrawableHolder.e(i10);
        if (e10 != null) {
            return e10;
        }
        Drawable g10 = c.g(tVar.getSparseDrawableResources(), i10);
        sparseDrawableHolder.j(i10, g10);
        return g10;
    }
}
