package p249r8;

import java.nio.ByteBuffer;
import p258s2.C8630c;

@AbstractC8385g(tags = {19})
public class C8388j extends AbstractC8380b {
    public byte[] f27253d;

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        if (m12636a() > 0) {
            byte[] bArr = new byte[m12636a()];
            this.f27253d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.f27253d;
        sb2.append(bArr == null ? "null" : C8630c.m11879b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
