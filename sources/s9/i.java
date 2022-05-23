package s9;

import java.nio.ByteBuffer;
import ra.g;
import ra.k;

public final class i {
    public final ByteBuffer f22686a;
    public final int f22687b;
    public final long f22688c;
    public static final a f22685e = new a(null);
    public static final i f22684d = new i(null, 0, 0);

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final i a() {
            return i.f22684d;
        }
    }

    public i(ByteBuffer byteBuffer, int i10, long j10) {
        this.f22686a = byteBuffer;
        this.f22687b = i10;
        this.f22688c = j10;
    }

    public final ByteBuffer b() {
        return this.f22686a;
    }

    public final int c() {
        return this.f22687b;
    }

    public final long d() {
        return this.f22688c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k.b(this.f22686a, iVar.f22686a) && this.f22687b == iVar.f22687b && this.f22688c == iVar.f22688c;
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f22686a;
        int hashCode = byteBuffer != null ? byteBuffer.hashCode() : 0;
        long j10 = this.f22688c;
        return (((hashCode * 31) + this.f22687b) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "EncoderData(buffer=" + this.f22686a + ", id=" + this.f22687b + ", timeUs=" + this.f22688c + ")";
    }
}
