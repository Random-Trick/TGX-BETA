package p330x8;

import java.io.InputStream;
import p302v8.C9884b;

public class C10159b extends C10158a {
    public C10159b(InputStream inputStream) {
        super(inputStream);
    }

    public boolean m5885f(String str) {
        boolean z = m5888c() != 0;
        m5878m(str, z ? "1" : "0");
        return z;
    }

    public long m5884g(int i, String str) {
        long d = m5887d(i);
        m5878m(str, String.valueOf(d));
        return d;
    }

    public int m5883h(String str) {
        int k = m5880k();
        int i = k & 1;
        int i2 = ((k >> 1) + i) * ((i << 1) - 1);
        m5878m(str, String.valueOf(i2));
        return i2;
    }

    public void m5882i() {
        m5888c();
        m5886e();
    }

    public int m5881j(int i, String str) {
        return (int) m5884g(i, str);
    }

    public final int m5880k() {
        int i = 0;
        while (m5888c() == 0) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((1 << i) - 1) + m5887d(i));
    }

    public int m5879l(String str) {
        int k = m5880k();
        m5878m(str, String.valueOf(k));
        return k;
    }

    public final void m5878m(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        String valueOf = String.valueOf(C10158a.f32858f - this.f32863e.m6692c());
        int length = 8 - valueOf.length();
        sb2.append("@" + valueOf);
        for (int i = 0; i < length; i++) {
            sb2.append(' ');
        }
        sb2.append(str);
        int length2 = (100 - sb2.length()) - this.f32863e.m6692c();
        for (int i2 = 0; i2 < length2; i2++) {
            sb2.append(' ');
        }
        sb2.append(this.f32863e);
        sb2.append(" (" + str2 + ")");
        this.f32863e.m6693b();
        C9884b.m6691a(sb2.toString());
    }
}
