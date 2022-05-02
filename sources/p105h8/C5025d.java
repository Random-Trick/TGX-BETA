package p105h8;

import java.util.List;

public final class C5025d {
    public final byte[] f16974a;
    public int f16975b;
    public final String f16976c;
    public final List<byte[]> f16977d;
    public final String f16978e;
    public Object f16979f;
    public final int f16980g;
    public final int f16981h;

    public C5025d(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f16974a = bArr;
        this.f16975b = bArr == null ? 0 : bArr.length * 8;
        this.f16976c = str;
        this.f16977d = list;
        this.f16978e = str2;
        this.f16980g = i2;
        this.f16981h = i;
    }

    public List<byte[]> m24270a() {
        return this.f16977d;
    }

    public String m24269b() {
        return this.f16978e;
    }

    public Object m24268c() {
        return this.f16979f;
    }

    public byte[] m24267d() {
        return this.f16974a;
    }

    public int m24266e() {
        return this.f16980g;
    }

    public int m24265f() {
        return this.f16981h;
    }

    public String m24264g() {
        return this.f16976c;
    }

    public boolean m24263h() {
        return this.f16980g >= 0 && this.f16981h >= 0;
    }

    public void m24262i(Object obj) {
        this.f16979f = obj;
    }
}
