package p317wa;

import p123ia.AbstractC5289e0;
import p153ka.C6223c;
import p251ra.AbstractC8415a;
import qa.C8294g;

public class C10024h implements Iterable<Long>, AbstractC8415a {
    public static final C10025a f32633M = new C10025a(null);
    public final long f32634a;
    public final long f32635b;
    public final long f32636c;

    public static final class C10025a {
        public C10025a() {
        }

        public C10025a(C8294g gVar) {
            this();
        }
    }

    public C10024h(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f32634a = j;
            this.f32635b = C6223c.m21036d(j, j2, j3);
            this.f32636c = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long m6201r() {
        return this.f32634a;
    }

    public final long m6200s() {
        return this.f32635b;
    }

    public AbstractC5289e0 iterator() {
        return new C10026i(this.f32634a, this.f32635b, this.f32636c);
    }
}
