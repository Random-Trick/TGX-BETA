package p249r8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class C8381c {
    public ByteBuffer f27219a;
    public int f27220b;
    public int f27221c;

    public C8381c(ByteBuffer byteBuffer) {
        this.f27219a = byteBuffer;
        this.f27220b = byteBuffer.position();
    }

    public int m12632a(int i) {
        int i2;
        int i3 = this.f27219a.get(this.f27220b + (this.f27221c / 8));
        if (i3 < 0) {
            i3 += Log.TAG_CRASH;
        }
        int i4 = this.f27221c;
        int i5 = 8 - (i4 % 8);
        if (i <= i5) {
            i2 = ((i3 << (i4 % 8)) & 255) >> ((i4 % 8) + (i5 - i));
            this.f27221c = i4 + i;
        } else {
            int i6 = i - i5;
            i2 = (m12632a(i5) << i6) + m12632a(i6);
        }
        this.f27219a.position(this.f27220b + ((int) Math.ceil(this.f27221c / 8.0d)));
        return i2;
    }

    public boolean m12631b() {
        return m12632a(1) == 1;
    }

    public int m12630c() {
        return (this.f27219a.limit() * 8) - this.f27221c;
    }
}
