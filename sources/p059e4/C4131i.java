package p059e4;

import java.nio.ByteBuffer;
import p020b5.C1186a;
import p020b5.C1230s;
import p174m3.C6600g1;
import p199o3.C7614g0;
import p216p3.C8026g;

public final class C4131i {
    public long f13932a;
    public long f13933b;
    public boolean f13934c;

    public final long m28821a(long j) {
        return this.f13932a + Math.max(0L, ((this.f13933b - 529) * 1000000) / j);
    }

    public long m28820b(C6600g1 g1Var) {
        return m28821a(g1Var.f20592i0);
    }

    public void m28819c() {
        this.f13932a = 0L;
        this.f13933b = 0L;
        this.f13934c = false;
    }

    public long m28818d(C6600g1 g1Var, C8026g gVar) {
        if (this.f13933b == 0) {
            this.f13932a = gVar.f26126N;
        }
        if (this.f13934c) {
            return gVar.f26126N;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C1186a.m38185e(gVar.f26132c);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int m = C7614g0.m15474m(i);
        if (m == -1) {
            this.f13934c = true;
            this.f13933b = 0L;
            this.f13932a = gVar.f26126N;
            C1230s.m37881i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f26126N;
        }
        long a = m28821a(g1Var.f20592i0);
        this.f13933b += m;
        return a;
    }
}
