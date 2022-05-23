package t8;

import java.nio.ByteBuffer;
import s2.c;

public class f extends b {
    public ByteBuffer f22991a;
    public String f22992b;

    public f(String str) {
        this.f22992b = str;
    }

    @Override
    public ByteBuffer a() {
        return this.f22991a.duplicate();
    }

    @Override
    public String b() {
        return this.f22992b;
    }

    @Override
    public void c(ByteBuffer byteBuffer) {
        this.f22991a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f22991a;
        ByteBuffer byteBuffer2 = ((f) obj).f22991a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f22991a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public String toString() {
        ByteBuffer duplicate = this.f22991a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return "UnknownEntry{content=" + c.b(bArr) + '}';
    }
}
