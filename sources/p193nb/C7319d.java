package p193nb;

import org.thunderdog.challegram.Log;
import p108hb.C5062b;
import p123ia.C5294h;
import p123ia.C5296i;
import qa.C8294g;
import qa.C8298k;

public final class C7319d {
    public static final C7320a f23229d = new C7320a(null);
    public final long f23230a;
    public final long f23231b;
    public final long[] f23232c;

    public static final class C7320a {
        public C7320a() {
        }

        public C7320a(C8294g gVar) {
            this();
        }

        public final long m17020a(long j) {
            if (j % ((long) Log.TAG_NDK) == 0) {
                return j >> 20;
            }
            return 0L;
        }
    }

    public C7319d(long j, long j2) {
        this(j, j2, null, 4, null);
    }

    public C7319d(long j, long j2, long[] jArr) {
        this.f23230a = j;
        this.f23231b = j2;
        this.f23232c = jArr;
    }

    public static final long m17021i(long j) {
        return f23229d.m17020a(j);
    }

    public final boolean m17029a(long j, long j2) {
        if (this.f23230a == j) {
            if (this.f23231b == j2) {
                return true;
            }
            long[] jArr = this.f23232c;
            if (jArr != null && C5296i.m23394n(jArr, j2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m17028b(C7319d dVar) {
        boolean z;
        C8298k.m12933e(dVar, "messageId");
        if (this.f23230a == dVar.f23230a) {
            long j = this.f23231b;
            long j2 = dVar.f23231b;
            if (j != j2) {
                long[] jArr = this.f23232c;
                if (!(jArr != null && C5296i.m23394n(jArr, j2))) {
                    long[] jArr2 = dVar.f23232c;
                    if (jArr2 != null) {
                        int length = jArr2.length;
                        int i = 0;
                        while (i < length) {
                            long j3 = jArr2[i];
                            i++;
                            if (this.f23231b != j3) {
                                long[] jArr3 = this.f23232c;
                                if (jArr3 != null && C5296i.m23394n(jArr3, j3)) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
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

    public final long m17027c() {
        return this.f23230a;
    }

    public final long m17026d() {
        return this.f23231b;
    }

    public final long[] m17025e() {
        return this.f23232c;
    }

    public final boolean m17024f() {
        long j = this.f23231b;
        return j == -1048576 || j == 0;
    }

    public final boolean m17023g() {
        return this.f23231b == 9;
    }

    public final C7319d m17022h(long j, long j2) {
        if (this.f23231b == j) {
            return new C7319d(this.f23230a, j2, this.f23232c);
        }
        long[] jArr = this.f23232c;
        int w = jArr == null ? -1 : C5296i.m23385w(jArr, j);
        if (w == -1) {
            return this;
        }
        long[] jArr2 = this.f23232c;
        C8298k.m12935c(jArr2);
        long[] b = C5062b.m24171b(C5062b.m24148y(jArr2, w), j2);
        C5294h.m23426k(b);
        return new C7319d(this.f23230a, this.f23231b, b);
    }

    public C7319d(long j, long j2, long[] jArr, int i, C8294g gVar) {
        this(j, j2, (i & 4) != 0 ? null : jArr);
    }
}
