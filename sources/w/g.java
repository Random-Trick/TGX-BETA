package w;

import android.util.Size;
import v.i;
import v.s;
import y.g2;

public class g {
    public final s f25682a;

    public g() {
        this((s) i.a(s.class));
    }

    public Size a(Size size) {
        Size c10;
        s sVar = this.f25682a;
        if (sVar == null || (c10 = sVar.c(g2.b.PRIV)) == null) {
            return size;
        }
        return c10.getWidth() * c10.getHeight() > size.getWidth() * size.getHeight() ? c10 : size;
    }

    public g(s sVar) {
        this.f25682a = sVar;
    }
}
