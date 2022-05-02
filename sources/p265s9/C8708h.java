package p265s9;

import java.nio.ByteBuffer;
import p107ha.C5060q;
import pa.AbstractC8077a;
import qa.C8298k;

public final class C8708h {
    public final ByteBuffer f28058a;
    public final long f28059b;
    public final int f28060c;
    public final AbstractC8077a<C5060q> f28061d;

    public C8708h(ByteBuffer byteBuffer, long j, int i, AbstractC8077a<C5060q> aVar) {
        C8298k.m12933e(byteBuffer, "buffer");
        C8298k.m12933e(aVar, "release");
        this.f28058a = byteBuffer;
        this.f28059b = j;
        this.f28060c = i;
        this.f28061d = aVar;
    }

    public final ByteBuffer m11706a() {
        return this.f28058a;
    }

    public final long m11705b() {
        return this.f28059b;
    }

    public final int m11704c() {
        return this.f28060c;
    }

    public final AbstractC8077a<C5060q> m11703d() {
        return this.f28061d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8708h)) {
            return false;
        }
        C8708h hVar = (C8708h) obj;
        return C8298k.m12936b(this.f28058a, hVar.f28058a) && this.f28059b == hVar.f28059b && this.f28060c == hVar.f28060c && C8298k.m12936b(this.f28061d, hVar.f28061d);
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f28058a;
        int i = 0;
        int hashCode = byteBuffer != null ? byteBuffer.hashCode() : 0;
        long j = this.f28059b;
        int i2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f28060c) * 31;
        AbstractC8077a<C5060q> aVar = this.f28061d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "WriterData(buffer=" + this.f28058a + ", timeUs=" + this.f28059b + ", flags=" + this.f28060c + ", release=" + this.f28061d + ")";
    }
}
