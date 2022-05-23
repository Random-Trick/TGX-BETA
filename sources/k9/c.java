package k9;

import i9.e;
import ra.g;
import ra.k;

public abstract class c extends k9.a {
    public static final String f15741e;
    public static final a f15742f = new a(null);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    static {
        String simpleName = e.class.getSimpleName();
        k.d(simpleName, "EglSurface::class.java.simpleName");
        f15741e = simpleName;
    }

    public c(f9.a aVar, e eVar) {
        super(aVar, eVar);
        k.e(aVar, "eglCore");
        k.e(eVar, "eglSurface");
    }
}
