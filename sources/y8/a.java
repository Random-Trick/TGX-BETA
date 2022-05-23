package y8;

import java.io.InputStream;

public class a {
    public static int f26642f;
    public InputStream f26643a;
    public int f26644b;
    public int f26645c;
    public int f26646d;
    public w8.a f26647e = new w8.a(50);

    public a(InputStream inputStream) {
        this.f26643a = inputStream;
        this.f26644b = inputStream.read();
        this.f26645c = inputStream.read();
    }

    public final void a() {
        this.f26644b = this.f26645c;
        this.f26645c = this.f26643a.read();
        this.f26646d = 0;
    }

    public boolean b() {
        if (this.f26646d == 8) {
            a();
        }
        int i10 = 1 << ((8 - this.f26646d) - 1);
        int i11 = this.f26644b;
        return i11 != -1 && (this.f26645c != -1 || !((((i10 << 1) - 1) & i11) == i10));
    }

    public int c() {
        if (this.f26646d == 8) {
            a();
            if (this.f26644b == -1) {
                return -1;
            }
        }
        int i10 = this.f26644b;
        int i11 = this.f26646d;
        int i12 = (i10 >> (7 - i11)) & 1;
        this.f26646d = i11 + 1;
        this.f26647e.a(i12 == 0 ? '0' : '1');
        f26642f++;
        return i12;
    }

    public long d(int i10) {
        if (i10 <= 64) {
            long j10 = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                j10 = (j10 << 1) | c();
            }
            return j10;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public long e() {
        return d(8 - this.f26646d);
    }
}
