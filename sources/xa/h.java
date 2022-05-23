package xa;

import ja.e0;
import la.c;
import ra.g;

public class h implements Iterable<Long>, sa.a {
    public static final a M = new a(null);
    public final long f26197a;
    public final long f26198b;
    public final long f26199c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public h(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j12 != Long.MIN_VALUE) {
            this.f26197a = j10;
            this.f26198b = c.d(j10, j11, j12);
            this.f26199c = j12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long r() {
        return this.f26197a;
    }

    public final long s() {
        return this.f26198b;
    }

    public e0 iterator() {
        return new i(this.f26197a, this.f26198b, this.f26199c);
    }
}
