package s8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class d {
    public ByteBuffer f22589a;
    public int f22590b;
    public int f22591c = 0;

    public d(ByteBuffer byteBuffer) {
        this.f22589a = byteBuffer;
        this.f22590b = byteBuffer.position();
    }

    public void a(int i10, int i11) {
        int i12 = this.f22591c;
        int i13 = 8 - (i12 % 8);
        int i14 = 1;
        if (i11 <= i13) {
            int i15 = this.f22589a.get(this.f22590b + (i12 / 8));
            if (i15 < 0) {
                i15 += Log.TAG_CRASH;
            }
            int i16 = i15 + (i10 << (i13 - i11));
            ByteBuffer byteBuffer = this.f22589a;
            int i17 = this.f22590b + (this.f22591c / 8);
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f22591c += i11;
        } else {
            int i18 = i11 - i13;
            a(i10 >> i18, i13);
            a(i10 & ((1 << i18) - 1), i18);
        }
        ByteBuffer byteBuffer2 = this.f22589a;
        int i19 = this.f22590b;
        int i20 = this.f22591c;
        int i21 = i19 + (i20 / 8);
        if (i20 % 8 <= 0) {
            i14 = 0;
        }
        byteBuffer2.position(i21 + i14);
    }
}
