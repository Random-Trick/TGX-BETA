package e8;

import android.content.Context;
import b8.e;
import b8.i;
import d6.cb;
import d6.ob;
import d8.c;

public final class f extends e<c, i> {
    public final i f11362b;

    public f(i iVar) {
        this.f11362b = iVar;
    }

    @Override
    public final i a(c cVar) {
        j jVar;
        c cVar2 = cVar;
        Context b10 = this.f11362b.b();
        cb b11 = ob.b(b.d());
        if (m.b(b10) || j5.e.h().b(b10) >= 204500000) {
            jVar = new m(b10, cVar2, b11);
        } else {
            jVar = new o(b10, cVar2, b11);
        }
        return new i(this.f11362b, cVar2, jVar, b11);
    }
}
