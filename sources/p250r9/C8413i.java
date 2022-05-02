package p250r9;

import java.nio.ByteBuffer;
import qa.C8294g;
import qa.C8298k;

public final class C8413i {
    public final ByteBuffer f27316a;
    public final int f27317b;
    public final long f27318c;
    public static final C8414a f27315e = new C8414a(null);
    public static final C8413i f27314d = new C8413i(null, 0, 0);

    public static final class C8414a {
        public C8414a() {
        }

        public final C8413i m12543a() {
            return C8413i.f27314d;
        }

        public C8414a(C8294g gVar) {
            this();
        }
    }

    public C8413i(ByteBuffer byteBuffer, int i, long j) {
        this.f27316a = byteBuffer;
        this.f27317b = i;
        this.f27318c = j;
    }

    public final ByteBuffer m12546b() {
        return this.f27316a;
    }

    public final int m12545c() {
        return this.f27317b;
    }

    public final long m12544d() {
        return this.f27318c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8413i)) {
            return false;
        }
        C8413i iVar = (C8413i) obj;
        return C8298k.m12937b(this.f27316a, iVar.f27316a) && this.f27317b == iVar.f27317b && this.f27318c == iVar.f27318c;
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f27316a;
        int hashCode = byteBuffer != null ? byteBuffer.hashCode() : 0;
        long j = this.f27318c;
        return (((hashCode * 31) + this.f27317b) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "EncoderData(buffer=" + this.f27316a + ", id=" + this.f27317b + ", timeUs=" + this.f27318c + ")";
    }
}
