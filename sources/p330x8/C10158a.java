package p330x8;

import java.io.InputStream;
import p302v8.C9883a;

public class C10158a {
    public static int f32858f;
    public InputStream f32859a;
    public int f32860b;
    public int f32861c;
    public int f32862d;
    public C9883a f32863e = new C9883a(50);

    public C10158a(InputStream inputStream) {
        this.f32859a = inputStream;
        this.f32860b = inputStream.read();
        this.f32861c = inputStream.read();
    }

    public final void m5890a() {
        this.f32860b = this.f32861c;
        this.f32861c = this.f32859a.read();
        this.f32862d = 0;
    }

    public boolean m5889b() {
        if (this.f32862d == 8) {
            m5890a();
        }
        int i = 1 << ((8 - this.f32862d) - 1);
        int i2 = this.f32860b;
        return i2 != -1 && (this.f32861c != -1 || !((((i << 1) - 1) & i2) == i));
    }

    public int m5888c() {
        if (this.f32862d == 8) {
            m5890a();
            if (this.f32860b == -1) {
                return -1;
            }
        }
        int i = this.f32860b;
        int i2 = this.f32862d;
        int i3 = (i >> (7 - i2)) & 1;
        this.f32862d = i2 + 1;
        this.f32863e.m6694a(i3 == 0 ? '0' : '1');
        f32858f++;
        return i3;
    }

    public long m5887d(int i) {
        if (i <= 64) {
            long j = 0;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j << 1) | m5888c();
            }
            return j;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public long m5886e() {
        return m5887d(8 - this.f32862d);
    }
}
