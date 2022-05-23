package ld;

import ib.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jd.c;
import jd.g0;
import ob.e;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;

public class l extends h implements Comparable<l> {
    public static int f16373t0 = -2000000;
    public final long f16374a0;
    public final Long f16375b0;
    public final long f16376c0;
    public final int f16377d0;
    public final int f16378e0;
    public final long f16379f0;
    public int f16380g0;
    public int f16381h0;
    public long f16382i0;
    public long f16383j0;
    public long f16384k0;
    public double f16385l0;
    public double f16386m0;
    public long f16387n0;
    public int f16388o0;
    public long f16389p0;
    public String f16390q0;
    public TdApi.FormattedText f16391r0;
    public List<File> f16392s0;

    public l(long r4, java.lang.String r6, long r7, int r9, int r10, long r11, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: ld.l.<init>(long, java.lang.String, long, int, int, long, boolean):void");
    }

    @Override
    public byte C() {
        return (byte) 2;
    }

    @Override
    public int D() {
        return h.l(this.Q + this.f16381h0, 360);
    }

    public boolean D0() {
        return true ^ e.P(H0(true, true), H0(true, false), true);
    }

    public boolean E0() {
        if (A() > 0) {
            return false;
        }
        if (e1()) {
            return g0.j(this);
        }
        return c.q(this);
    }

    public int compareTo(l lVar) {
        long I0 = I0();
        long I02 = lVar.I0();
        if (I0 != I02) {
            return Long.compare(I02, I0);
        }
        return Long.compare(lVar.K0(), K0());
    }

    public List<File> G0() {
        return this.f16392s0;
    }

    public TdApi.FormattedText H0(boolean z10, boolean z11) {
        if (!z10) {
            return this.f16391r0;
        }
        if (e.c1(this.f16391r0)) {
            return null;
        }
        TdApi.FormattedText formattedText = this.f16391r0;
        TdApi.FormattedText formattedText2 = new TdApi.FormattedText(formattedText.text, formattedText.entities);
        if (z11) {
            e.m1(formattedText2);
        }
        return formattedText2;
    }

    public long I0() {
        return this.f16376c0;
    }

    @Override
    public boolean J() {
        return true;
    }

    public long J0() {
        return this.f16383j0;
    }

    public long K0() {
        return this.f16374a0;
    }

    public int L0() {
        return v0.x1(D()) ? this.f16377d0 : this.f16378e0;
    }

    public int M0() {
        return v0.x1(X0()) ? this.f16377d0 : this.f16378e0;
    }

    public void N0(int[] iArr) {
        int i10;
        int i11;
        pd.c j10 = j();
        if (j10 == null || j10.l()) {
            i11 = Y0();
            i10 = L0();
        } else {
            if (v0.x1(D() + j10.h())) {
                i11 = this.f16378e0;
                i10 = this.f16377d0;
            } else {
                i11 = this.f16377d0;
                i10 = this.f16378e0;
            }
            if (!j10.m()) {
                i11 = (int) (i11 * j10.f());
                i10 = (int) (i10 * j10.e());
            }
        }
        float f10 = i11;
        float f11 = i10;
        float min = Math.min(1280.0f / f10, 1280.0f / f11);
        if (min < 1.0f) {
            i11 = (int) (f10 * min);
            i10 = (int) (f11 * min);
        }
        iArr[0] = i11;
        iArr[1] = i10;
    }

    public int O0() {
        return this.f16381h0;
    }

    public long P0() {
        return this.f16382i0;
    }

    public long Q0() {
        return this.f16384k0;
    }

    public long R0() {
        return this.f16387n0;
    }

    public int S0(boolean z10) {
        return (int) T0(z10, TimeUnit.SECONDS);
    }

    public long T0(boolean z10, TimeUnit timeUnit) {
        TimeUnit timeUnit2;
        long j10;
        if (!z10 || !a1()) {
            j10 = this.f16389p0;
            timeUnit2 = TimeUnit.MILLISECONDS;
        } else {
            j10 = this.f16383j0 - this.f16382i0;
            timeUnit2 = TimeUnit.MICROSECONDS;
        }
        return timeUnit.convert(j10, timeUnit2);
    }

    public int U0() {
        return this.f16388o0;
    }

    public double V0() {
        return this.f16386m0;
    }

    public double W0() {
        return this.f16385l0;
    }

    public int X0() {
        pd.c j10 = j();
        if (j10 != null) {
            return h.l(D() + j10.h(), 360);
        }
        return D();
    }

    public int Y0() {
        return v0.x1(D()) ? this.f16378e0 : this.f16377d0;
    }

    public int Z0() {
        return v0.x1(X0()) ? this.f16378e0 : this.f16377d0;
    }

    public boolean a1() {
        return (this.f16382i0 == -1 || this.f16383j0 == -1 || this.f16384k0 == -1) ? false : true;
    }

    public boolean b1() {
        return (this.f16380g0 & 8) != 0;
    }

    public boolean c1() {
        return (this.f16380g0 & 16) == 0;
    }

    @Override
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16361a.local.path);
        sb2.append("?");
        long j10 = this.f16382i0;
        String str = "";
        sb2.append(j10 > 0 ? Long.valueOf(j10) : str);
        if (f1()) {
            str = "thumb" + this.f16374a0;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public boolean d1() {
        return k().local.path.toLowerCase().contains("screen");
    }

    public boolean e1() {
        return (this.f16380g0 & 2) != 0;
    }

    public boolean f1() {
        return (this.f16380g0 & 1) != 0;
    }

    public int g1() {
        int l10 = h.l(this.f16381h0 - 90, 360);
        this.f16381h0 = l10;
        return l10;
    }

    public void h1(TdApi.FormattedText formattedText) {
        if (e.c1(formattedText)) {
            this.f16391r0 = null;
        } else {
            this.f16391r0 = formattedText;
        }
    }

    public void i1() {
        this.f16380g0 |= 8;
    }

    public void j1(long j10, String str) {
        this.f16380g0 |= 2;
        this.f16389p0 = j10;
        this.f16390q0 = str;
    }

    public void k1(boolean z10) {
        this.f16380g0 = ib.c.h(this.f16380g0, 1, z10);
    }

    public void l1(int i10) {
        this.f16381h0 = i10;
    }

    public void m1() {
        this.f16380g0 &= -17;
    }

    public boolean n1(long j10, long j11, long j12) {
        if (this.f16382i0 == j10 && this.f16383j0 == j11 && this.f16384k0 == j12) {
            return false;
        }
        this.f16382i0 = j10;
        this.f16383j0 = j11;
        this.f16384k0 = j12;
        U();
        return true;
    }

    public boolean o1(long j10, double d10, double d11, int i10, long j11) {
        if (this.f16384k0 == j10 && this.f16385l0 == d10 && this.f16386m0 == d11 && this.f16388o0 == i10 && this.f16387n0 == j11) {
            return false;
        }
        this.f16384k0 = j10;
        this.f16385l0 = d10;
        this.f16386m0 = d11;
        this.f16388o0 = i10;
        this.f16387n0 = j11;
        return true;
    }

    public boolean p1() {
        return (this.f16380g0 & 4) != 0;
    }

    public boolean q1() {
        this.f16380g0 ^= 4;
        return p1();
    }

    public void r1(File file) {
        if (this.f16392s0 == null) {
            this.f16392s0 = new ArrayList();
        }
        this.f16392s0.add(file);
    }

    @Override
    public int s() {
        return q().hashCode();
    }

    public l(l lVar) {
        super(null, lVar.f16361a);
        this.f16382i0 = -1L;
        this.f16383j0 = -1L;
        this.f16384k0 = -1L;
        this.f16374a0 = lVar.f16374a0;
        this.f16375b0 = lVar.f16375b0;
        this.f16376c0 = lVar.f16376c0;
        this.f16377d0 = lVar.f16377d0;
        this.f16378e0 = lVar.f16378e0;
        this.f16379f0 = lVar.f16379f0;
        this.f16380g0 = lVar.f16380g0;
        this.Q = lVar.Q;
        this.f16381h0 = lVar.f16381h0;
        this.f16382i0 = lVar.f16382i0;
        this.f16383j0 = lVar.f16383j0;
        this.f16384k0 = lVar.f16384k0;
        this.f16385l0 = lVar.f16385l0;
        this.f16386m0 = lVar.f16386m0;
        this.f16387n0 = lVar.f16387n0;
        this.f16388o0 = lVar.f16388o0;
        this.f16389p0 = lVar.f16389p0;
        this.f16390q0 = lVar.f16390q0;
        t0(lVar.z());
    }
}
