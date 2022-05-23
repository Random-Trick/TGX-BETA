package y9;

import android.opengl.EGL14;
import android.view.Surface;
import f9.a;
import ra.k;
import s9.h;
import s9.i;
import v9.b;
import v9.i;
import v9.j;

public final class d implements j<Long, b, i, h> {
    public final b.a f26667b = b.f24786a;
    public final a f26668c = new a(EGL14.EGL_NO_CONTEXT, 1);
    public k9.d f26669d;

    @Override
    public void a() {
        k9.d dVar = this.f26669d;
        if (dVar == null) {
            k.n("surface");
        }
        dVar.d();
        this.f26668c.g();
    }

    public b.a f() {
        return this.f26667b;
    }

    public void d(h hVar) {
        k.e(hVar, "next");
        j.a.a(this, hVar);
        a aVar = this.f26668c;
        Surface b10 = hVar.b();
        k.c(b10);
        k9.d dVar = new k9.d(aVar, b10, false);
        this.f26669d = dVar;
        dVar.c();
    }

    @Override
    public v9.i<i> i(i.b<Long> bVar, boolean z10) {
        k.e(bVar, "state");
        if (bVar instanceof i.a) {
            return new i.a(s9.i.f22685e.a());
        }
        k9.d dVar = this.f26669d;
        if (dVar == null) {
            k.n("surface");
        }
        dVar.e(bVar.a().longValue() * 1000);
        k9.d dVar2 = this.f26669d;
        if (dVar2 == null) {
            k.n("surface");
        }
        dVar2.f();
        return new i.b(s9.i.f22685e.a());
    }
}
