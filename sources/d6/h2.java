package d6;

import h7.c;
import h7.e;
import h7.f;

public final class h2 implements e {
    public static final h2 f6531a = new h2();

    @Override
    public final void a(Object obj, f fVar) {
        int i10 = i2.f6561e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new c(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
