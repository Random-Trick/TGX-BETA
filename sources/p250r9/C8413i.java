package p250r9;

import java.nio.ByteBuffer;
import qa.C8294g;
import qa.C8298k;

public final class C8413i {
    public final ByteBuffer f27319a;
    public final int f27320b;
    public final long f27321c;
    public static final C8414a f27318e = new C8414a(null);
    public static final C8413i f27317d = new C8413i(null, 0, 0);

    public static final class C8414a {
        public C8414a() {
        }

        public final C8413i m12542a() {
            return C8413i.f27317d;
        }

        public C8414a(C8294g gVar) {
            this();
        }
    }

    public C8413i(ByteBuffer byteBuffer, int i, long j) {
        this.f27319a = byteBuffer;
        this.f27320b = i;
        this.f27321c = j;
    }

    public final ByteBuffer m12545b() {
        return this.f27319a;
    }

    public final int m12544c() {
        return this.f27320b;
    }

    public final long m12543d() {
        return this.f27321c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8413i)) {
            return false;
        }
        C8413i iVar = (C8413i) obj;
        return C8298k.m12936b(this.f27319a, iVar.f27319a) && this.f27320b == iVar.f27320b && this.f27321c == iVar.f27321c;
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f27319a;
        int hashCode = byteBuffer != null ? byteBuffer.hashCode() : 0;
        long j = this.f27321c;
        return (((hashCode * 31) + this.f27320b) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "EncoderData(buffer=" + this.f27319a + ", id=" + this.f27320b + ", timeUs=" + this.f27321c + ")";
    }
}
