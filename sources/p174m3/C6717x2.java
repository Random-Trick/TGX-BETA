package p174m3;

import p020b5.C1186a;
import p020b5.C1216l0;

public final class C6717x2 {
    public static final C6717x2 f21068c;
    public static final C6717x2 f21069d = new C6717x2(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C6717x2 f21070e = new C6717x2(Long.MAX_VALUE, 0);
    public static final C6717x2 f21071f = new C6717x2(0, Long.MAX_VALUE);
    public static final C6717x2 f21072g;
    public final long f21073a;
    public final long f21074b;

    static {
        C6717x2 x2Var = new C6717x2(0L, 0L);
        f21068c = x2Var;
        f21072g = x2Var;
    }

    public C6717x2(long j, long j2) {
        boolean z = true;
        C1186a.m38189a(j >= 0);
        C1186a.m38189a(j2 < 0 ? false : z);
        this.f21073a = j;
        this.f21074b = j2;
    }

    public long m19394a(long j, long j2, long j3) {
        long j4 = this.f21073a;
        if (j4 == 0 && this.f21074b == 0) {
            return j;
        }
        long C0 = C1216l0.m38016C0(j, j4, Long.MIN_VALUE);
        long b = C1216l0.m37984b(j, this.f21074b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = C0 <= j2 && j2 <= b;
        if (C0 > j3 || j3 > b) {
            z = false;
        }
        return (!z2 || !z) ? z2 ? j2 : z ? j3 : C0 : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6717x2.class != obj.getClass()) {
            return false;
        }
        C6717x2 x2Var = (C6717x2) obj;
        return this.f21073a == x2Var.f21073a && this.f21074b == x2Var.f21074b;
    }

    public int hashCode() {
        return (((int) this.f21073a) * 31) + ((int) this.f21074b);
    }
}
