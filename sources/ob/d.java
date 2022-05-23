package ob;

import ib.b;
import ja.h;
import ja.i;
import org.thunderdog.challegram.Log;
import ra.g;
import ra.k;

public final class d {
    public static final a f19340d = new a(null);
    public final long f19341a;
    public final long f19342b;
    public final long[] f19343c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final long a(long j10) {
            if (j10 % ((long) Log.TAG_NDK) == 0) {
                return j10 >> 20;
            }
            return 0L;
        }
    }

    public d(long j10, long j11) {
        this(j10, j11, null, 4, null);
    }

    public d(long j10, long j11, long[] jArr) {
        this.f19341a = j10;
        this.f19342b = j11;
        this.f19343c = jArr;
    }

    public static final long i(long j10) {
        return f19340d.a(j10);
    }

    public final boolean a(long j10, long j11) {
        if (this.f19341a == j10) {
            if (this.f19342b == j11) {
                return true;
            }
            long[] jArr = this.f19343c;
            if (jArr != null && i.n(jArr, j11)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(d dVar) {
        k.e(dVar, "messageId");
        if (this.f19341a == dVar.f19341a) {
            long j10 = this.f19342b;
            long j11 = dVar.f19342b;
            if (j10 != j11) {
                long[] jArr = this.f19343c;
                if (!(jArr != null && i.n(jArr, j11))) {
                    long[] jArr2 = dVar.f19343c;
                    if (jArr2 != null) {
                        for (long j12 : jArr2) {
                            if (this.f19342b != j12) {
                                long[] jArr3 = this.f19343c;
                                if (!(jArr3 != null && i.n(jArr3, j12))) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final long c() {
        return this.f19341a;
    }

    public final long d() {
        return this.f19342b;
    }

    public final long[] e() {
        return this.f19343c;
    }

    public final boolean f() {
        long j10 = this.f19342b;
        return j10 == -1048576 || j10 == 0;
    }

    public final boolean g() {
        return this.f19342b == 9;
    }

    public final d h(long j10, long j11) {
        if (this.f19342b == j10) {
            return new d(this.f19341a, j11, this.f19343c);
        }
        long[] jArr = this.f19343c;
        int w10 = jArr != null ? i.w(jArr, j10) : -1;
        if (w10 == -1) {
            return this;
        }
        long[] jArr2 = this.f19343c;
        k.c(jArr2);
        long[] b10 = b.b(b.y(jArr2, w10), j11);
        h.k(b10);
        return new d(this.f19341a, this.f19342b, b10);
    }

    public d(long j10, long j11, long[] jArr, int i10, g gVar) {
        this(j10, j11, (i10 & 4) != 0 ? null : jArr);
    }
}
