package p111he;

import android.graphics.drawable.Drawable;
import be.C1362c;
import p143k0.C6038h;

public final class C5141s {
    public static Drawable m23834a(AbstractC5143t tVar, int i, int i2) {
        if (i == 0) {
            return null;
        }
        C6038h<Drawable> sparseDrawableHolder = tVar.getSparseDrawableHolder();
        Drawable e = sparseDrawableHolder.m21472e(i);
        if (e != null) {
            return e;
        }
        Drawable g = C1362c.m37485g(tVar.getSparseDrawableResources(), i);
        sparseDrawableHolder.m21467j(i, g);
        return g;
    }
}
