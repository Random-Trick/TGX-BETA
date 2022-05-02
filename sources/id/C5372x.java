package id;

import ge.C4868i;

public class C5372x extends AbstractC5333b implements AbstractC5331a {
    public final int f17654f;
    public int f17655g;
    public long f17656h;

    public C5372x(long j, String str, String str2, int i, String str3) {
        super(j, str, str2, str3, false);
        this.f17654f = i;
    }

    public static String m23063m(int i, String str, int i2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i == 2 ? "mthumb" : i == 1 ? "vthumb" : "pthumb");
        sb2.append((i2 == 90 || i2 == 0) ? "" : Integer.toString(i2));
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public void mo23067a(int i, boolean z, C4868i.C4889t tVar, int i2, long j, long j2, boolean z2) {
        this.f17655g = i2;
        this.f17656h = j;
    }

    public int m23066j() {
        return this.f17655g;
    }

    public long m23065k() {
        return this.f17656h;
    }

    public int m23064l() {
        return this.f17654f;
    }
}
