package e6;

import h7.c;
import h7.e;
import h7.f;

public final class b implements e {
    public static final b f10642a = new b();

    @Override
    public final void a(Object obj, f fVar) {
        int i10 = c.f10663e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new c(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
