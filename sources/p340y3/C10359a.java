package p340y3;

import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p020b5.C1186a;
import p174m3.C6556a2;
import p270t3.AbstractC8959g;

public final class C10359a implements AbstractC10363c {
    public final byte[] f33235a = new byte[8];
    public final ArrayDeque<C10361b> f33236b = new ArrayDeque<>();
    public final C10370g f33237c = new C10370g();
    public AbstractC10362b f33238d;
    public int f33239e;
    public int f33240f;
    public long f33241g;

    public static final class C10361b {
        public final int f33242a;
        public final long f33243b;

        public C10361b(int i, long j) {
            this.f33242a = i;
            this.f33243b = j;
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
        C1186a.m38182h(this.f33238d);
        while (true) {
            C10361b peek = this.f33236b.peek();
            if (peek == null || gVar.mo6043r() < peek.f33243b) {
                if (this.f33239e == 0) {
                    long d = this.f33237c.m5290d(gVar, true, false, 4);
                    if (d == -2) {
                        d = m5359d(gVar);
                    }
                    if (d == -1) {
                        return false;
                    }
                    this.f33240f = (int) d;
                    this.f33239e = 1;
                }
                if (this.f33239e == 1) {
                    this.f33241g = this.f33237c.m5290d(gVar, false, true, 8);
                    this.f33239e = 2;
                }
                int b = this.f33238d.mo5315b(this.f33240f);
                if (b == 0) {
                    gVar.mo10808n((int) this.f33241g);
                    this.f33239e = 0;
                } else if (b == 1) {
                    long r = gVar.mo6043r();
                    this.f33236b.push(new C10361b(this.f33240f, this.f33241g + r));
                    this.f33238d.mo5310g(this.f33240f, r, this.f33241g);
                    this.f33239e = 0;
                    return true;
                } else if (b == 2) {
                    long j = this.f33241g;
                    if (j <= 8) {
                        this.f33238d.mo5309h(this.f33240f, m5357f(gVar, (int) j));
                        this.f33239e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid integer size: ");
                    sb2.append(j);
                    throw C6556a2.m20112a(sb2.toString(), null);
                } else if (b == 3) {
                    long j2 = this.f33241g;
                    if (j2 <= 2147483647L) {
                        this.f33238d.mo5312e(this.f33240f, m5356g(gVar, (int) j2));
                        this.f33239e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j2);
                    throw C6556a2.m20112a(sb3.toString(), null);
                } else if (b == 4) {
                    this.f33238d.mo5313d(this.f33240f, (int) this.f33241g, gVar);
                    this.f33239e = 0;
                    return true;
                } else if (b == 5) {
                    long j3 = this.f33241g;
                    if (j3 == 4 || j3 == 8) {
                        this.f33238d.mo5311f(this.f33240f, m5358e(gVar, (int) j3));
                        this.f33239e = 0;
                        return true;
                    }
                    StringBuilder sb4 = new StringBuilder(40);
                    sb4.append("Invalid float size: ");
                    sb4.append(j3);
                    throw C6556a2.m20112a(sb4.toString(), null);
                } else {
                    StringBuilder sb5 = new StringBuilder(32);
                    sb5.append("Invalid element type ");
                    sb5.append(b);
                    throw C6556a2.m20112a(sb5.toString(), null);
                }
            } else {
                this.f33238d.mo5316a(this.f33236b.pop().f33242a);
                return true;
            }
        }
    }

    @Override
    public void mo5352b(AbstractC10362b bVar) {
        this.f33238d = bVar;
    }

    @Override
    public void mo5351c() {
        this.f33239e = 0;
        this.f33236b.clear();
        this.f33237c.m5289e();
    }

    @RequiresNonNull({"processor"})
    public final long m5359d(AbstractC8959g gVar) {
        gVar.mo10809m();
        while (true) {
            gVar.mo10806q(this.f33235a, 0, 4);
            int c = C10370g.m5291c(this.f33235a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) C10370g.m5293a(this.f33235a, c, false);
                if (this.f33238d.mo5314c(a)) {
                    gVar.mo10808n(c);
                    return a;
                }
            }
            gVar.mo10808n(1);
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
        gVar.readFully(this.f33235a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f33235a[i2] & 255);
        }
        return j;
    }
}
