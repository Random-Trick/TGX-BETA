package s8;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;

public class c {
    public ByteBuffer f22586a;
    public int f22587b;
    public int f22588c;

    public c(ByteBuffer byteBuffer) {
        this.f22586a = byteBuffer;
        this.f22587b = byteBuffer.position();
    }

    public int a(int i10) {
        int i11;
        int i12 = this.f22586a.get(this.f22587b + (this.f22588c / 8));
        if (i12 < 0) {
            i12 += Log.TAG_CRASH;
        }
        int i13 = this.f22588c;
        int i14 = 8 - (i13 % 8);
        if (i10 <= i14) {
            i11 = ((i12 << (i13 % 8)) & 255) >> ((i13 % 8) + (i14 - i10));
            this.f22588c = i13 + i10;
        } else {
            int i15 = i10 - i14;
            i11 = (a(i14) << i15) + a(i15);
        }
        this.f22586a.position(this.f22587b + ((int) Math.ceil(this.f22588c / 8.0d)));
        return i11;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public int c() {
        return (this.f22586a.limit() * 8) - this.f22588c;
    }
}
