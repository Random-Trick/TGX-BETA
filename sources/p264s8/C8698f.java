package p264s8;

import java.nio.ByteBuffer;
import p258s2.C8630c;

public class C8698f extends AbstractC8693b {
    public ByteBuffer f28031a;
    public String f28032b;

    public C8698f(String str) {
        this.f28032b = str;
    }

    @Override
    public ByteBuffer mo11723a() {
        return this.f28031a.duplicate();
    }

    @Override
    public String mo11722b() {
        return this.f28032b;
    }

    @Override
    public void mo11721c(ByteBuffer byteBuffer) {
        this.f28031a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f28031a;
        ByteBuffer byteBuffer2 = ((C8698f) obj).f28031a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f28031a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public String toString() {
        ByteBuffer duplicate = this.f28031a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return "UnknownEntry{content=" + C8630c.m11880b(bArr) + '}';
    }
}
