package jd;

import he.i;

public class x extends b implements a {
    public final int f15321f;
    public int f15322g;
    public long f15323h;

    public x(long j10, String str, String str2, int i10, String str3) {
        super(j10, str, str2, str3, false);
        this.f15321f = i10;
    }

    public static String m(int i10, String str, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 == 2 ? "mthumb" : i10 == 1 ? "vthumb" : "pthumb");
        sb2.append((i11 == 90 || i11 == 0) ? "" : Integer.toString(i11));
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public void a(int i10, boolean z10, i.t tVar, int i11, long j10, long j11, boolean z11) {
        this.f15322g = i11;
        this.f15323h = j10;
    }

    public int j() {
        return this.f15322g;
    }

    public long k() {
        return this.f15323h;
    }

    public int l() {
        return this.f15321f;
    }
}
