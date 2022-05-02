package p264s8;

import java.nio.ByteBuffer;
import p258s2.C8630c;

public class C8698f extends AbstractC8693b {
    public ByteBuffer f28034a;
    public String f28035b;

    public C8698f(String str) {
        this.f28035b = str;
    }

    @Override
    public ByteBuffer mo11722a() {
        return this.f28034a.duplicate();
    }

    @Override
    public String mo11721b() {
        return this.f28035b;
    }

    @Override
    public void mo11720c(ByteBuffer byteBuffer) {
        this.f28034a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f28034a;
        ByteBuffer byteBuffer2 = ((C8698f) obj).f28034a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f28034a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public String toString() {
        ByteBuffer duplicate = this.f28034a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return "UnknownEntry{content=" + C8630c.m11879b(bArr) + '}';
    }
}
