package p137j9;

import p064e9.C4166a;
import p106h9.C5037e;
import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC5903c extends C5901a {
    public static final String f18805e;
    public static final C5904a f18806f = new C5904a(null);

    public static final class C5904a {
        public C5904a() {
        }

        public C5904a(C8294g gVar) {
            this();
        }
    }

    static {
        String simpleName = C5037e.class.getSimpleName();
        C8298k.m12934d(simpleName, "EglSurface::class.java.simpleName");
        f18805e = simpleName;
    }

    public AbstractC5903c(C4166a aVar, C5037e eVar) {
        super(aVar, eVar);
        C8298k.m12933e(aVar, "eglCore");
        C8298k.m12933e(eVar, "eglSurface");
    }
}
