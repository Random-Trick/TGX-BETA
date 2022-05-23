package b3;

import y2.b;
import y2.c;
import y2.e;
import y2.f;
import y2.h;

public final class p<T> implements f<T> {
    public final m f3739a;
    public final String f3740b;
    public final b f3741c;
    public final e<T, byte[]> f3742d;
    public final q f3743e;

    public p(m mVar, String str, b bVar, e<T, byte[]> eVar, q qVar) {
        this.f3739a = mVar;
        this.f3740b = str;
        this.f3741c = bVar;
        this.f3742d = eVar;
        this.f3743e = qVar;
    }

    public static void c(Exception exc) {
    }

    @Override
    public void a(c<T> cVar) {
        d(cVar, o.f3738a);
    }

    public void d(c<T> cVar, h hVar) {
        this.f3743e.a(l.a().e(this.f3739a).c(cVar).f(this.f3740b).d(this.f3742d).b(this.f3741c).a(), hVar);
    }
}
