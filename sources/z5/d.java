package z5;

import h7.c;
import h7.e;
import h7.f;

public final class d implements e {
    public static final e f26970a = new d();

    @Override
    public final void a(Object obj, f fVar) {
        int i10 = e.f26972e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new c(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
