package p249r8;

import java.nio.ByteBuffer;
import p258s2.C8630c;

@AbstractC8385g(tags = {19})
public class C8388j extends AbstractC8380b {
    public byte[] f27250d;

    @Override
    public void mo12590e(ByteBuffer byteBuffer) {
        if (m12637a() > 0) {
            byte[] bArr = new byte[m12637a()];
            this.f27250d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.f27250d;
        sb2.append(bArr == null ? "null" : C8630c.m11880b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
