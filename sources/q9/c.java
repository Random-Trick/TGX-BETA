package q9;

import ja.e;
import java.nio.ShortBuffer;
import qa.a;
import qa.q;
import ra.k;

public final class c {
    public final e<b> f21487a = new e<>();
    public final int f21488b;
    public final int f21489c;

    public c(int i10, int i11) {
        this.f21488b = i10;
        this.f21489c = i11;
    }

    public final <T> T a(T t10, q<? super ShortBuffer, ? super Long, ? super Double, ? extends T> qVar) {
        k.e(qVar, "action");
        b y10 = this.f21487a.y();
        if (y10 == b.f21481f.a()) {
            return t10;
        }
        int remaining = y10.d().remaining();
        int limit = y10.d().limit();
        T c10 = qVar.c(y10.d(), Long.valueOf(y10.g()), Double.valueOf(y10.f()));
        y10.d().limit(limit);
        if (y10.d().hasRemaining()) {
            this.f21487a.g(b.c(y10, null, d.d(remaining - y10.d().remaining(), this.f21488b, this.f21489c), 0.0d, null, 13, null));
        } else {
            y10.e().b();
        }
        return c10;
    }

    public final void b(ShortBuffer shortBuffer, long j10, double d10, a<ia.q> aVar) {
        k.e(shortBuffer, "buffer");
        k.e(aVar, "release");
        if (shortBuffer.hasRemaining()) {
            this.f21487a.m(new b(shortBuffer, j10, d10, aVar));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void c() {
        this.f21487a.m(b.f21481f.a());
    }

    public final boolean d() {
        return this.f21487a.isEmpty();
    }
}
