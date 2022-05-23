package t9;

import ia.q;
import java.nio.ByteBuffer;
import qa.a;
import ra.k;

public final class h {
    public final ByteBuffer f23015a;
    public final long f23016b;
    public final int f23017c;
    public final a<q> f23018d;

    public h(ByteBuffer byteBuffer, long j10, int i10, a<q> aVar) {
        k.e(byteBuffer, "buffer");
        k.e(aVar, "release");
        this.f23015a = byteBuffer;
        this.f23016b = j10;
        this.f23017c = i10;
        this.f23018d = aVar;
    }

    public final ByteBuffer a() {
        return this.f23015a;
    }

    public final long b() {
        return this.f23016b;
    }

    public final int c() {
        return this.f23017c;
    }

    public final a<q> d() {
        return this.f23018d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.f23015a, hVar.f23015a) && this.f23016b == hVar.f23016b && this.f23017c == hVar.f23017c && k.b(this.f23018d, hVar.f23018d);
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f23015a;
        int i10 = 0;
        int hashCode = byteBuffer != null ? byteBuffer.hashCode() : 0;
        long j10 = this.f23016b;
        int i11 = ((((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f23017c) * 31;
        a<q> aVar = this.f23018d;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "WriterData(buffer=" + this.f23015a + ", timeUs=" + this.f23016b + ", flags=" + this.f23017c + ", release=" + this.f23018d + ")";
    }
}
