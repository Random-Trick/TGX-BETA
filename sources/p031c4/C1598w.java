package p031c4;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p020b5.C1230s;
import p031c4.AbstractC1571i0;
import p270t3.AbstractC8960h;

public final class C1598w implements AbstractC1571i0 {
    public final AbstractC1581m f5852a;
    public final C1187a0 f5853b = new C1187a0(new byte[10]);
    public int f5854c = 0;
    public int f5855d;
    public C1205i0 f5856e;
    public boolean f5857f;
    public boolean f5858g;
    public boolean f5859h;
    public int f5860i;
    public int f5861j;
    public boolean f5862k;
    public long f5863l;

    public C1598w(AbstractC1581m mVar) {
        this.f5852a = mVar;
    }

    @Override
    public void mo36321a(C1205i0 i0Var, AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        this.f5856e = i0Var;
        this.f5852a.mo36333e(hVar, dVar);
    }

    @Override
    public final void mo36320b(C1189b0 b0Var, int i) {
        C1186a.m38185h(this.f5856e);
        if ((i & 1) != 0) {
            int i2 = this.f5854c;
            if (!(i2 == 0 || i2 == 1)) {
                if (i2 == 2) {
                    C1230s.m37884i("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    int i3 = this.f5861j;
                    if (i3 != -1) {
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i3);
                        sb2.append(" more bytes");
                        C1230s.m37884i("PesReader", sb2.toString());
                    }
                    this.f5852a.mo36334d();
                } else {
                    throw new IllegalStateException();
                }
            }
            m36315g(1);
        }
        while (b0Var.m38145a() > 0) {
            int i4 = this.f5854c;
            if (i4 != 0) {
                int i5 = 0;
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (m36318d(b0Var, this.f5853b.f4469a, Math.min(10, this.f5860i)) && m36318d(b0Var, null, this.f5860i)) {
                            m36316f();
                            if (this.f5862k) {
                                i5 = 4;
                            }
                            i |= i5;
                            this.f5852a.mo36332f(this.f5863l, i);
                            m36315g(3);
                        }
                    } else if (i4 == 3) {
                        int a = b0Var.m38145a();
                        int i6 = this.f5861j;
                        if (i6 != -1) {
                            i5 = a - i6;
                        }
                        if (i5 > 0) {
                            a -= i5;
                            b0Var.m38148O(b0Var.m38141e() + a);
                        }
                        this.f5852a.mo36336b(b0Var);
                        int i7 = this.f5861j;
                        if (i7 != -1) {
                            int i8 = i7 - a;
                            this.f5861j = i8;
                            if (i8 == 0) {
                                this.f5852a.mo36334d();
                                m36315g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m36318d(b0Var, this.f5853b.f4469a, 9)) {
                    if (m36317e()) {
                        i5 = 2;
                    }
                    m36315g(i5);
                }
            } else {
                b0Var.m38146Q(b0Var.m38145a());
            }
        }
    }

    @Override
    public final void mo36319c() {
        this.f5854c = 0;
        this.f5855d = 0;
        this.f5859h = false;
        this.f5852a.mo36335c();
    }

    public final boolean m36318d(C1189b0 b0Var, byte[] bArr, int i) {
        int min = Math.min(b0Var.m38145a(), i - this.f5855d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            b0Var.m38146Q(min);
        } else {
            b0Var.m38136j(bArr, this.f5855d, min);
        }
        int i2 = this.f5855d + min;
        this.f5855d = i2;
        return i2 == i;
    }

    public final boolean m36317e() {
        this.f5853b.m38168p(0);
        int h = this.f5853b.m38176h(24);
        if (h != 1) {
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Unexpected start code prefix: ");
            sb2.append(h);
            C1230s.m37884i("PesReader", sb2.toString());
            this.f5861j = -1;
            return false;
        }
        this.f5853b.m38166r(8);
        int h2 = this.f5853b.m38176h(16);
        this.f5853b.m38166r(5);
        this.f5862k = this.f5853b.m38177g();
        this.f5853b.m38166r(2);
        this.f5857f = this.f5853b.m38177g();
        this.f5858g = this.f5853b.m38177g();
        this.f5853b.m38166r(6);
        int h3 = this.f5853b.m38176h(8);
        this.f5860i = h3;
        if (h2 == 0) {
            this.f5861j = -1;
        } else {
            int i = ((h2 + 6) - 9) - h3;
            this.f5861j = i;
            if (i < 0) {
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("Found negative packet payload size: ");
                sb3.append(i);
                C1230s.m37884i("PesReader", sb3.toString());
                this.f5861j = -1;
            }
        }
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    public final void m36316f() {
        this.f5853b.m38168p(0);
        this.f5863l = -9223372036854775807L;
        if (this.f5857f) {
            this.f5853b.m38166r(4);
            this.f5853b.m38166r(1);
            this.f5853b.m38166r(1);
            long h = (this.f5853b.m38176h(3) << 30) | (this.f5853b.m38176h(15) << 15) | this.f5853b.m38176h(15);
            this.f5853b.m38166r(1);
            if (!this.f5859h && this.f5858g) {
                this.f5853b.m38166r(4);
                this.f5853b.m38166r(1);
                this.f5853b.m38166r(1);
                this.f5853b.m38166r(1);
                this.f5856e.m38055b((this.f5853b.m38176h(3) << 30) | (this.f5853b.m38176h(15) << 15) | this.f5853b.m38176h(15));
                this.f5859h = true;
            }
            this.f5863l = this.f5856e.m38055b(h);
        }
    }

    public final void m36315g(int i) {
        this.f5854c = i;
        this.f5855d = 0;
    }
}
