package a6;

import g6.i;
import l5.d;
import m5.r;

public final class s extends j {
    public d<i> f582a;

    public s(d<i> dVar) {
        r.b(dVar != null, "listener can't be null.");
        this.f582a = dVar;
    }

    @Override
    public final void T(i iVar) {
        this.f582a.a(iVar);
        this.f582a = null;
    }
}
