package p249r8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class C8382d {
    public ByteBuffer f27219a;
    public int f27220b;
    public int f27221c = 0;

    public C8382d(ByteBuffer byteBuffer) {
        this.f27219a = byteBuffer;
        this.f27220b = byteBuffer.position();
    }

    public void m12630a(int i, int i2) {
        int i3 = this.f27221c;
        int i4 = 8 - (i3 % 8);
        int i5 = 1;
        if (i2 <= i4) {
            int i6 = this.f27219a.get(this.f27220b + (i3 / 8));
            if (i6 < 0) {
                i6 += Log.TAG_CRASH;
            }
            int i7 = i6 + (i << (i4 - i2));
            ByteBuffer byteBuffer = this.f27219a;
            int i8 = this.f27220b + (this.f27221c / 8);
            if (i7 > 127) {
                i7 -= 256;
            }
            byteBuffer.put(i8, (byte) i7);
            this.f27221c += i2;
        } else {
            int i9 = i2 - i4;
            m12630a(i >> i9, i4);
            m12630a(i & ((1 << i9) - 1), i9);
        }
        ByteBuffer byteBuffer2 = this.f27219a;
        int i10 = this.f27220b;
        int i11 = this.f27221c;
        int i12 = i10 + (i11 / 8);
        if (i11 % 8 <= 0) {
            i5 = 0;
        }
        byteBuffer2.position(i12 + i5);
    }
}
