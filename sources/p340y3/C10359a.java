package p340y3;

import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p174m3.C6556a2;
import p270t3.AbstractC8959g;

public final class C10359a implements AbstractC10363c {
    public final byte[] f33238a = new byte[8];
    public final ArrayDeque<C10361b> f33239b = new ArrayDeque<>();
    public final C10370g f33240c = new C10370g();
    public AbstractC10362b f33241d;
    public int f33242e;
    public int f33243f;
    public long f33244g;

    public static final class C10361b {
        public final int f33245a;
        public final long f33246b;

        public C10361b(int i, long j) {
            this.f33245a = i;
            this.f33246b = j;
        }
    }

    public static String m5356g(AbstractC8959g gVar, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        gVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override
    public boolean mo5353a(AbstractC8959g gVar) {
        C1186a.m38185h(this.f33241d);
        while (true) {
            C10361b peek = this.f33239b.peek();
            if (peek == null || gVar.mo6043r() < peek.f33246b) {
                if (this.f33242e == 0) {
                    long d = this.f33240c.m5290d(gVar, true, false, 4);
                    if (d == -2) {
                        d = m5359d(gVar);
                    }
                    if (d == -1) {
                        return false;
                    }
                    this.f33243f = (int) d;
                    this.f33242e = 1;
                }
                if (this.f33242e == 1) {
                    this.f33244g = this.f33240c.m5290d(gVar, false, true, 8);
                    this.f33242e = 2;
                }
                int b = this.f33241d.mo5315b(this.f33243f);
                if (b == 0) {
                    gVar.mo10807n((int) this.f33244g);
                    this.f33242e = 0;
                } else if (b == 1) {
                    long r = gVar.mo6043r();
                    this.f33239b.push(new C10361b(this.f33243f, this.f33244g + r));
                    this.f33241d.mo5310g(this.f33243f, r, this.f33244g);
                    this.f33242e = 0;
                    return true;
                } else if (b == 2) {
                    long j = this.f33244g;
                    if (j <= 8) {
                        this.f33241d.mo5309h(this.f33243f, m5357f(gVar, (int) j));
                        this.f33242e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid integer size: ");
                    sb2.append(j);
                    throw C6556a2.m20113a(sb2.toString(), null);
                } else if (b == 3) {
                    long j2 = this.f33244g;
                    if (j2 <= 2147483647L) {
                        this.f33241d.mo5312e(this.f33243f, m5356g(gVar, (int) j2));
                        this.f33242e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j2);
                    throw C6556a2.m20113a(sb3.toString(), null);
                } else if (b == 4) {
                    this.f33241d.mo5313d(this.f33243f, (int) this.f33244g, gVar);
                    this.f33242e = 0;
                    return true;
                } else if (b == 5) {
                    long j3 = this.f33244g;
                    if (j3 == 4 || j3 == 8) {
                        this.f33241d.mo5311f(this.f33243f, m5358e(gVar, (int) j3));
                        this.f33242e = 0;
                        return true;
                    }
                    StringBuilder sb4 = new StringBuilder(40);
                    sb4.append("Invalid float size: ");
                    sb4.append(j3);
                    throw C6556a2.m20113a(sb4.toString(), null);
                } else {
                    StringBuilder sb5 = new StringBuilder(32);
                    sb5.append("Invalid element type ");
                    sb5.append(b);
                    throw C6556a2.m20113a(sb5.toString(), null);
                }
            } else {
                this.f33241d.mo5316a(this.f33239b.pop().f33245a);
                return true;
            }
        }
    }

    @Override
    public void mo5352b(AbstractC10362b bVar) {
        this.f33241d = bVar;
    }

    @Override
    public void mo5351c() {
        this.f33242e = 0;
        this.f33239b.clear();
        this.f33240c.m5289e();
    }

    @RequiresNonNull({"processor"})
    public final long m5359d(AbstractC8959g gVar) {
        gVar.mo10808m();
        while (true) {
            gVar.mo10805q(this.f33238a, 0, 4);
            int c = C10370g.m5291c(this.f33238a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) C10370g.m5293a(this.f33238a, c, false);
                if (this.f33241d.mo5314c(a)) {
                    gVar.mo10807n(c);
                    return a;
                }
            }
            gVar.mo10807n(1);
        }
    }

    public final double m5358e(AbstractC8959g gVar, int i) {
        long f = m5357f(gVar, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) f);
        }
        return Double.longBitsToDouble(f);
    }

    public final long m5357f(AbstractC8959g gVar, int i) {
        gVar.readFully(this.f33238a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f33238a[i2] & 255);
        }
        return j;
    }
}
