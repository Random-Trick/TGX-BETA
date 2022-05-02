package p317wa;

import qa.C8294g;

public final class C10027j extends C10024h implements AbstractC10018d<Long> {
    public static final C10028a f32641N = new C10028a(null);
    public static final C10027j f32642O = new C10027j(1, 0);

    public static final class C10028a {
        public C10028a() {
        }

        public C10028a(C8294g gVar) {
            this();
        }
    }

    public C10027j(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10027j) {
            if (!isEmpty() || !((C10027j) obj).isEmpty()) {
                C10027j jVar = (C10027j) obj;
                if (!(m6201r() == jVar.m6201r() && m6200s() == jVar.m6200s())) {
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
        return (int) ((31 * (m6201r() ^ (m6201r() >>> 32))) + (m6200s() ^ (m6200s() >>> 32)));
    }

    public boolean isEmpty() {
        return m6201r() > m6200s();
    }

    public String toString() {
        return m6201r() + ".." + m6200s();
    }

    public boolean m6197u(long j) {
        return m6201r() <= j && j <= m6200s();
    }
}
