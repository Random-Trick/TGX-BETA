package xa;

import ra.g;

public final class j extends h implements d<Long> {
    public static final a N = new a(null);
    public static final j O = new j(1, 0);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public j(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (!(r() == jVar.r() && s() == jVar.s())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (r() ^ (r() >>> 32))) + (s() ^ (s() >>> 32)));
    }

    public boolean isEmpty() {
        return r() > s();
    }

    public String toString() {
        return r() + ".." + s();
    }

    public boolean u(long j10) {
        return r() <= j10 && j10 <= s();
    }
}
