package y;

import android.util.Size;
import android.view.Surface;

public abstract class u1 {
    public static u1 a(Surface surface, Size size, int i10) {
        return new d(surface, size, i10);
    }

    public abstract int b();

    public abstract Size c();

    public abstract Surface d();
}
