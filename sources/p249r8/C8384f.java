package p249r8;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p258s2.C8630c;

@AbstractC8385g(tags = {5})
public class C8384f extends AbstractC8380b {
    public byte[] f27236d;

    @Override
    public void mo12589e(ByteBuffer byteBuffer) {
        int i = this.f27217b;
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.f27236d = bArr;
            byteBuffer.get(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f27236d, ((C8384f) obj).f27236d);
    }

    public int hashCode() {
        byte[] bArr = this.f27236d;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DecoderSpecificInfo");
        sb2.append("{bytes=");
        byte[] bArr = this.f27236d;
        sb2.append(bArr == null ? "null" : C8630c.m11879b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
