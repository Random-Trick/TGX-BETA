package p156kd;

import id.C5335c;
import id.C5349g0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p108hb.C5063c;
import p108hb.C5069h;
import p193nb.C7321e;
import p209od.C7856c;

public class C6253l extends C6246h implements Comparable<C6253l> {
    public static int f19716t0 = -2000000;
    public final long f19717a0;
    public final Long f19718b0;
    public final long f19719c0;
    public final int f19720d0;
    public final int f19721e0;
    public final long f19722f0;
    public int f19723g0;
    public int f19724h0;
    public long f19725i0;
    public long f19726j0;
    public long f19727k0;
    public double f19728l0;
    public double f19729m0;
    public long f19730n0;
    public int f19731o0;
    public long f19732p0;
    public String f19733q0;
    public TdApi.FormattedText f19734r0;
    public List<File> f19735s0;

    public C6253l(long r4, java.lang.String r6, long r7, int r9, int r10, long r11, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: p156kd.C6253l.<init>(long, java.lang.String, long, int, int, long, boolean):void");
    }

    @Override
    public byte mo20778C() {
        return (byte) 2;
    }

    @Override
    public int mo20873D() {
        return C5069h.m24082l(this.f19694Q + this.f19724h0, 360);
    }

    public boolean m20872D0() {
        return true ^ C7321e.m16993N(m20868H0(true, true), m20868H0(true, false), true);
    }

    public boolean m20871E0() {
        if (m20956A() > 0) {
            return false;
        }
        if (m20844e1()) {
            return C5349g0.m23170j(this);
        }
        return C5335c.m23213q(this);
    }

    public int compareTo(C6253l lVar) {
        long I0 = m20867I0();
        long I02 = lVar.m20867I0();
        if (I0 != I02) {
            return Long.compare(I02, I0);
        }
        return Long.compare(lVar.m20864K0(), m20864K0());
    }

    public List<File> m20869G0() {
        return this.f19735s0;
    }

    public TdApi.FormattedText m20868H0(boolean z, boolean z2) {
        if (!z) {
            return this.f19734r0;
        }
        if (C7321e.m16965a1(this.f19734r0)) {
            return null;
        }
        TdApi.FormattedText formattedText = this.f19734r0;
        TdApi.FormattedText formattedText2 = new TdApi.FormattedText(formattedText.text, formattedText.entities);
        if (z2) {
            C7321e.m16935k1(formattedText2);
        }
        return formattedText2;
    }

    public long m20867I0() {
        return this.f19719c0;
    }

    @Override
    public boolean mo20866J() {
        return true;
    }

    public long m20865J0() {
        return this.f19726j0;
    }

    public long m20864K0() {
        return this.f19717a0;
    }

    public int m20863L0() {
        return C7389v0.m16564x1(mo20873D()) ? this.f19720d0 : this.f19721e0;
    }

    public int m20862M0() {
        return C7389v0.m16564x1(m20851X0()) ? this.f19720d0 : this.f19721e0;
    }

    public void m20861N0(int[] iArr) {
        int i;
        int i2;
        C7856c j = m20913j();
        if (j == null || j.m14818l()) {
            i2 = m20850Y0();
            i = m20863L0();
        } else {
            if (C7389v0.m16564x1(mo20873D() + j.m14822h())) {
                i2 = this.f19721e0;
                i = this.f19720d0;
            } else {
                i2 = this.f19720d0;
                i = this.f19721e0;
            }
            if (!j.m14817m()) {
                i2 = (int) (i2 * j.m14824f());
                i = (int) (i * j.m14825e());
            }
        }
        float f = i2;
        float f2 = i;
        float min = Math.min(1280.0f / f, 1280.0f / f2);
        if (min < 1.0f) {
            i2 = (int) (f * min);
            i = (int) (f2 * min);
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    public int m20860O0() {
        return this.f19724h0;
    }

    public long m20859P0() {
        return this.f19725i0;
    }

    public long m20858Q0() {
        return this.f19727k0;
    }

    public long m20857R0() {
        return this.f19730n0;
    }

    public int m20856S0(boolean z) {
        return (int) m20855T0(z, TimeUnit.SECONDS);
    }

    public long m20855T0(boolean z, TimeUnit timeUnit) {
        TimeUnit timeUnit2;
        long j;
        if (!z || !m20848a1()) {
            j = this.f19732p0;
            timeUnit2 = TimeUnit.MILLISECONDS;
        } else {
            j = this.f19726j0 - this.f19725i0;
            timeUnit2 = TimeUnit.MICROSECONDS;
        }
        return timeUnit.convert(j, timeUnit2);
    }

    public int m20854U0() {
        return this.f19731o0;
    }

    public double m20853V0() {
        return this.f19729m0;
    }

    public double m20852W0() {
        return this.f19728l0;
    }

    public int m20851X0() {
        C7856c j = m20913j();
        if (j != null) {
            return C5069h.m24082l(mo20873D() + j.m14822h(), 360);
        }
        return mo20873D();
    }

    public int m20850Y0() {
        return C7389v0.m16564x1(mo20873D()) ? this.f19721e0 : this.f19720d0;
    }

    public int m20849Z0() {
        return C7389v0.m16564x1(m20851X0()) ? this.f19721e0 : this.f19720d0;
    }

    public boolean m20848a1() {
        return (this.f19725i0 == -1 || this.f19726j0 == -1 || this.f19727k0 == -1) ? false : true;
    }

    public boolean m20847b1() {
        return (this.f19723g0 & 8) != 0;
    }

    public boolean m20846c1() {
        return (this.f19723g0 & 16) == 0;
    }

    @Override
    public String mo20769d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19704a.local.path);
        sb2.append("?");
        long j = this.f19725i0;
        String str = "";
        sb2.append(j > 0 ? Long.valueOf(j) : str);
        if (m20843f1()) {
            str = "thumb" + this.f19717a0;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public boolean m20845d1() {
        return m20911k().local.path.toLowerCase().contains("screen");
    }

    public boolean m20844e1() {
        return (this.f19723g0 & 2) != 0;
    }

    public boolean m20843f1() {
        return (this.f19723g0 & 1) != 0;
    }

    public int m20842g1() {
        int l = C5069h.m24082l(this.f19724h0 - 90, 360);
        this.f19724h0 = l;
        return l;
    }

    public void m20841h1(TdApi.FormattedText formattedText) {
        if (C7321e.m16965a1(formattedText)) {
            this.f19734r0 = null;
        } else {
            this.f19734r0 = formattedText;
        }
    }

    public void m20840i1() {
        this.f19723g0 |= 8;
    }

    public void m20839j1(long j, String str) {
        this.f19723g0 |= 2;
        this.f19732p0 = j;
        this.f19733q0 = str;
    }

    public void m20838k1(boolean z) {
        this.f19723g0 = C5063c.m24139h(this.f19723g0, 1, z);
    }

    public void m20837l1(int i) {
        this.f19724h0 = i;
    }

    public void m20836m1() {
        this.f19723g0 &= -17;
    }

    public boolean m20835n1(long j, long j2, long j3) {
        if (this.f19725i0 == j && this.f19726j0 == j2 && this.f19727k0 == j3) {
            return false;
        }
        this.f19725i0 = j;
        this.f19726j0 = j2;
        this.f19727k0 = j3;
        m20936U();
        return true;
    }

    public boolean m20834o1(long j, double d, double d2, int i, long j2) {
        if (this.f19727k0 == j && this.f19728l0 == d && this.f19729m0 == d2 && this.f19731o0 == i && this.f19730n0 == j2) {
            return false;
        }
        this.f19727k0 = j;
        this.f19728l0 = d;
        this.f19729m0 = d2;
        this.f19731o0 = i;
        this.f19730n0 = j2;
        return true;
    }

    public boolean m20833p1() {
        return (this.f19723g0 & 4) != 0;
    }

    public boolean m20832q1() {
        this.f19723g0 ^= 4;
        return m20833p1();
    }

    public void m20831r1(File file) {
        if (this.f19735s0 == null) {
            this.f19735s0 = new ArrayList();
        }
        this.f19735s0.add(file);
    }

    @Override
    public int mo20826s() {
        return mo20876q().hashCode();
    }

    public C6253l(C6253l lVar) {
        super(null, lVar.f19704a);
        this.f19725i0 = -1L;
        this.f19726j0 = -1L;
        this.f19727k0 = -1L;
        this.f19717a0 = lVar.f19717a0;
        this.f19718b0 = lVar.f19718b0;
        this.f19719c0 = lVar.f19719c0;
        this.f19720d0 = lVar.f19720d0;
        this.f19721e0 = lVar.f19721e0;
        this.f19722f0 = lVar.f19722f0;
        this.f19723g0 = lVar.f19723g0;
        this.f19694Q = lVar.f19694Q;
        this.f19724h0 = lVar.f19724h0;
        this.f19725i0 = lVar.f19725i0;
        this.f19726j0 = lVar.f19726j0;
        this.f19727k0 = lVar.f19727k0;
        this.f19728l0 = lVar.f19728l0;
        this.f19729m0 = lVar.f19729m0;
        this.f19730n0 = lVar.f19730n0;
        this.f19731o0 = lVar.f19731o0;
        this.f19732p0 = lVar.f19732p0;
        this.f19733q0 = lVar.f19733q0;
        mo20768t0(lVar.m20887z());
    }
}
