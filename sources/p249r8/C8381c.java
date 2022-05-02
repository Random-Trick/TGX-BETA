package p249r8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class C8381c {
    public ByteBuffer f27216a;
    public int f27217b;
    public int f27218c;

    public C8381c(ByteBuffer byteBuffer) {
        this.f27216a = byteBuffer;
        this.f27217b = byteBuffer.position();
    }

    public int m12633a(int i) {
        int i2;
        int i3 = this.f27216a.get(this.f27217b + (this.f27218c / 8));
        if (i3 < 0) {
            i3 += Log.TAG_CRASH;
        }
        int i4 = this.f27218c;
        int i5 = 8 - (i4 % 8);
        if (i <= i5) {
            i2 = ((i3 << (i4 % 8)) & 255) >> ((i4 % 8) + (i5 - i));
            this.f27218c = i4 + i;
        } else {
            int i6 = i - i5;
            i2 = (m12633a(i5) << i6) + m12633a(i6);
        }
        this.f27216a.position(this.f27217b + ((int) Math.ceil(this.f27218c / 8.0d)));
        return i2;
    }

    public boolean m12632b() {
        return m12633a(1) == 1;
    }

    public int m12631c() {
        return (this.f27216a.limit() * 8) - this.f27218c;
    }
}
