package y8;

import java.io.InputStream;

public class b extends a {
    public b(InputStream inputStream) {
        super(inputStream);
    }

    public boolean f(String str) {
        boolean z10 = c() != 0;
        m(str, z10 ? "1" : "0");
        return z10;
    }

    public long g(int i10, String str) {
        long d10 = d(i10);
        m(str, String.valueOf(d10));
        return d10;
    }

    public int h(String str) {
        int k10 = k();
        int i10 = k10 & 1;
        int i11 = ((k10 >> 1) + i10) * ((i10 << 1) - 1);
        m(str, String.valueOf(i11));
        return i11;
    }

    public void i() {
        c();
        e();
    }

    public int j(int i10, String str) {
        return (int) g(i10, str);
    }

    public final int k() {
        int i10 = 0;
        while (c() == 0) {
            i10++;
        }
        if (i10 <= 0) {
            return 0;
        }
        return (int) (((1 << i10) - 1) + d(i10));
    }

    public int l(String str) {
        int k10 = k();
        m(str, String.valueOf(k10));
        return k10;
    }

    public final void m(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        String valueOf = String.valueOf(a.f26642f - this.f26647e.c());
        int length = 8 - valueOf.length();
        sb2.append("@" + valueOf);
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - this.f26647e.c();
        for (int i11 = 0; i11 < length2; i11++) {
            sb2.append(' ');
        }
        sb2.append(this.f26647e);
        sb2.append(" (" + str2 + ")");
        this.f26647e.b();
        w8.b.a(sb2.toString());
    }
}
