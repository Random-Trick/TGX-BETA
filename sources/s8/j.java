package s8;

import java.nio.ByteBuffer;
import s2.c;

@g(tags = {19})
public class j extends b {
    public byte[] f22620d;

    @Override
    public void e(ByteBuffer byteBuffer) {
        if (a() > 0) {
            byte[] bArr = new byte[a()];
            this.f22620d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExtensionDescriptor");
        sb2.append("{bytes=");
        byte[] bArr = this.f22620d;
        sb2.append(bArr == null ? "null" : c.b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
