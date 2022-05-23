package e4;

import c5.a;
import c5.s;
import java.nio.ByteBuffer;
import m3.q1;
import o3.h0;
import p3.g;

public final class i {
    public long f10492a;
    public long f10493b;
    public boolean f10494c;

    public final long a(long j10) {
        return this.f10492a + Math.max(0L, ((this.f10493b - 529) * 1000000) / j10);
    }

    public long b(q1 q1Var) {
        return a(q1Var.f16909i0);
    }

    public void c() {
        this.f10492a = 0L;
        this.f10493b = 0L;
        this.f10494c = false;
    }

    public long d(q1 q1Var, g gVar) {
        if (this.f10493b == 0) {
            this.f10492a = gVar.N;
        }
        if (this.f10494c) {
            return gVar.N;
        }
        ByteBuffer byteBuffer = (ByteBuffer) a.e(gVar.f20488c);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int m10 = h0.m(i10);
        if (m10 == -1) {
            this.f10494c = true;
            this.f10493b = 0L;
            this.f10492a = gVar.N;
            s.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.N;
        }
        long a10 = a(q1Var.f16909i0);
        this.f10493b += m10;
        return a10;
    }
}
