package i8;

import java.util.List;

public final class d {
    public final byte[] f14070a;
    public int f14071b;
    public final String f14072c;
    public final List<byte[]> f14073d;
    public final String f14074e;
    public Object f14075f;
    public final int f14076g;
    public final int f14077h;

    public d(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f14070a = bArr;
        this.f14071b = bArr == null ? 0 : bArr.length * 8;
        this.f14072c = str;
        this.f14073d = list;
        this.f14074e = str2;
        this.f14076g = i11;
        this.f14077h = i10;
    }

    public List<byte[]> a() {
        return this.f14073d;
    }

    public String b() {
        return this.f14074e;
    }

    public Object c() {
        return this.f14075f;
    }

    public byte[] d() {
        return this.f14070a;
    }

    public int e() {
        return this.f14076g;
    }

    public int f() {
        return this.f14077h;
    }

    public String g() {
        return this.f14072c;
    }

    public boolean h() {
        return this.f14076g >= 0 && this.f14077h >= 0;
    }

    public void i(Object obj) {
        this.f14075f = obj;
    }
}
