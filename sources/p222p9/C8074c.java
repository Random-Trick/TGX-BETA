package p222p9;

import java.nio.ShortBuffer;
import p107ha.C5060q;
import p123ia.C5287e;
import pa.AbstractC8077a;
import pa.AbstractC8093q;
import qa.C8298k;

public final class C8074c {
    public final C5287e<C8071b> f26301a = new C5287e<>();
    public final int f26302b;
    public final int f26303c;

    public C8074c(int i, int i2) {
        this.f26302b = i;
        this.f26303c = i2;
    }

    public final <T> T m13617a(T t, AbstractC8093q<? super ShortBuffer, ? super Long, ? super Double, ? extends T> qVar) {
        C8298k.m12934e(qVar, "action");
        C8071b E = this.f26301a.m23453E();
        if (E == C8071b.f26295f.m13618a()) {
            return t;
        }
        int remaining = E.m13623d().remaining();
        int limit = E.m13623d().limit();
        T c = qVar.mo13608c(E.m13623d(), Long.valueOf(E.m13620g()), Double.valueOf(E.m13621f()));
        E.m13623d().limit(limit);
        if (E.m13623d().hasRemaining()) {
            this.f26301a.m23444v(C8071b.m13624c(E, null, C8075d.m13610d(remaining - E.m13623d().remaining(), this.f26302b, this.f26303c), 0.0d, null, 13, null));
        } else {
            E.m13622e().mo4925b();
        }
        return c;
    }

    public final void m13616b(ShortBuffer shortBuffer, long j, double d, AbstractC8077a<C5060q> aVar) {
        C8298k.m12934e(shortBuffer, "buffer");
        C8298k.m12934e(aVar, "release");
        if (shortBuffer.hasRemaining()) {
            this.f26301a.m23443w(new C8071b(shortBuffer, j, d, aVar));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void m13615c() {
        this.f26301a.m23443w(C8071b.f26295f.m13618a());
    }

    public final boolean m13614d() {
        return this.f26301a.isEmpty();
    }
}
