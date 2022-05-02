package p265s9;

import java.nio.ByteBuffer;
import p107ha.C5060q;
import pa.AbstractC8077a;
import qa.C8298k;

public final class C8708h {
    public final ByteBuffer f28055a;
    public final long f28056b;
    public final int f28057c;
    public final AbstractC8077a<C5060q> f28058d;

    public C8708h(ByteBuffer byteBuffer, long j, int i, AbstractC8077a<C5060q> aVar) {
        C8298k.m12934e(byteBuffer, "buffer");
        C8298k.m12934e(aVar, "release");
        this.f28055a = byteBuffer;
        this.f28056b = j;
        this.f28057c = i;
        this.f28058d = aVar;
    }

    public final ByteBuffer m11707a() {
        return this.f28055a;
    }

    public final long m11706b() {
        return this.f28056b;
    }

    public final int m11705c() {
        return this.f28057c;
    }

    public final AbstractC8077a<C5060q> m11704d() {
        return this.f28058d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8708h)) {
            return false;
        }
        C8708h hVar = (C8708h) obj;
        return C8298k.m12937b(this.f28055a, hVar.f28055a) && this.f28056b == hVar.f28056b && this.f28057c == hVar.f28057c && C8298k.m12937b(this.f28058d, hVar.f28058d);
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f28055a;
        int i = 0;
        int hashCode = byteBuffer != null ? byteBuffer.hashCode() : 0;
        long j = this.f28056b;
        int i2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f28057c) * 31;
        AbstractC8077a<C5060q> aVar = this.f28058d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "WriterData(buffer=" + this.f28055a + ", timeUs=" + this.f28056b + ", flags=" + this.f28057c + ", release=" + this.f28058d + ")";
    }
}
