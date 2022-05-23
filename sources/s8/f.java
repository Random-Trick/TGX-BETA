package s8;

import java.nio.ByteBuffer;
import java.util.Arrays;
import s2.c;

@g(tags = {5})
public class f extends b {
    public byte[] f22603d;

    @Override
    public void e(ByteBuffer byteBuffer) {
        int i10 = this.f22584b;
        if (i10 > 0) {
            byte[] bArr = new byte[i10];
            this.f22603d = bArr;
            byteBuffer.get(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f22603d, ((f) obj).f22603d);
    }

    public int hashCode() {
        byte[] bArr = this.f22603d;
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
        byte[] bArr = this.f22603d;
        sb2.append(bArr == null ? "null" : c.b(bArr));
        sb2.append('}');
        return sb2.toString();
    }
}
