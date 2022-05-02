package p222p9;

import java.nio.ShortBuffer;
import p107ha.C5060q;
import p123ia.C5287e;
import pa.AbstractC8077a;
import pa.AbstractC8093q;
import qa.C8298k;

public final class C8074c {
    public final C5287e<C8071b> f26304a = new C5287e<>();
    public final int f26305b;
    public final int f26306c;

    public C8074c(int i, int i2) {
        this.f26305b = i;
        this.f26306c = i2;
    }

    public final <T> T m13616a(T t, AbstractC8093q<? super ShortBuffer, ? super Long, ? super Double, ? extends T> qVar) {
        C8298k.m12933e(qVar, "action");
        C8071b E = this.f26304a.m23454E();
        if (E == C8071b.f26298f.m13617a()) {
            return t;
        }
        int remaining = E.m13622d().remaining();
        int limit = E.m13622d().limit();
        T c = qVar.mo13607c(E.m13622d(), Long.valueOf(E.m13619g()), Double.valueOf(E.m13620f()));
        E.m13622d().limit(limit);
        if (E.m13622d().hasRemaining()) {
            this.f26304a.m23445v(C8071b.m13623c(E, null, C8075d.m13609d(remaining - E.m13622d().remaining(), this.f26305b, this.f26306c), 0.0d, null, 13, null));
        } else {
            E.m13621e().mo4925b();
        }
        return c;
    }

    public final void m13615b(ShortBuffer shortBuffer, long j, double d, AbstractC8077a<C5060q> aVar) {
        C8298k.m12933e(shortBuffer, "buffer");
        C8298k.m12933e(aVar, "release");
        if (shortBuffer.hasRemaining()) {
            this.f26304a.m23444w(new C8071b(shortBuffer, j, d, aVar));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void m13614c() {
        this.f26304a.m23444w(C8071b.f26298f.m13617a());
    }

    public final boolean m13613d() {
        return this.f26304a.isEmpty();
    }
}
