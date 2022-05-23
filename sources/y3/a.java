package y3;

import java.util.ArrayDeque;
import m3.k2;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import t3.g;

public final class a implements c {
    public final byte[] f26493a = new byte[8];
    public final ArrayDeque<b> f26494b = new ArrayDeque<>();
    public final g f26495c = new g();
    public y3.b f26496d;
    public int f26497e;
    public int f26498f;
    public long f26499g;

    public static final class b {
        public final int f26500a;
        public final long f26501b;

        public b(int i10, long j10) {
            this.f26500a = i10;
            this.f26501b = j10;
        }
    }

    public static String g(g gVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        gVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override
    public boolean a(g gVar) {
        c5.a.h(this.f26496d);
        while (true) {
            b peek = this.f26494b.peek();
            if (peek == null || gVar.r() < peek.f26501b) {
                if (this.f26497e == 0) {
                    long d10 = this.f26495c.d(gVar, true, false, 4);
                    if (d10 == -2) {
                        d10 = d(gVar);
                    }
                    if (d10 == -1) {
                        return false;
                    }
                    this.f26498f = (int) d10;
                    this.f26497e = 1;
                }
                if (this.f26497e == 1) {
                    this.f26499g = this.f26495c.d(gVar, false, true, 8);
                    this.f26497e = 2;
                }
                int b10 = this.f26496d.b(this.f26498f);
                if (b10 == 0) {
                    gVar.n((int) this.f26499g);
                    this.f26497e = 0;
                } else if (b10 == 1) {
                    long r10 = gVar.r();
                    this.f26494b.push(new b(this.f26498f, this.f26499g + r10));
                    this.f26496d.g(this.f26498f, r10, this.f26499g);
                    this.f26497e = 0;
                    return true;
                } else if (b10 == 2) {
                    long j10 = this.f26499g;
                    if (j10 <= 8) {
                        this.f26496d.h(this.f26498f, f(gVar, (int) j10));
                        this.f26497e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(42);
                    sb2.append("Invalid integer size: ");
                    sb2.append(j10);
                    throw k2.a(sb2.toString(), null);
                } else if (b10 == 3) {
                    long j11 = this.f26499g;
                    if (j11 <= 2147483647L) {
                        this.f26496d.e(this.f26498f, g(gVar, (int) j11));
                        this.f26497e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j11);
                    throw k2.a(sb3.toString(), null);
                } else if (b10 == 4) {
                    this.f26496d.d(this.f26498f, (int) this.f26499g, gVar);
                    this.f26497e = 0;
                    return true;
                } else if (b10 == 5) {
                    long j12 = this.f26499g;
                    if (j12 == 4 || j12 == 8) {
                        this.f26496d.f(this.f26498f, e(gVar, (int) j12));
                        this.f26497e = 0;
                        return true;
                    }
                    StringBuilder sb4 = new StringBuilder(40);
                    sb4.append("Invalid float size: ");
                    sb4.append(j12);
                    throw k2.a(sb4.toString(), null);
                } else {
                    StringBuilder sb5 = new StringBuilder(32);
                    sb5.append("Invalid element type ");
                    sb5.append(b10);
                    throw k2.a(sb5.toString(), null);
                }
            } else {
                this.f26496d.a(this.f26494b.pop().f26500a);
                return true;
            }
        }
    }

    @Override
    public void b(y3.b bVar) {
        this.f26496d = bVar;
    }

    @Override
    public void c() {
        this.f26497e = 0;
        this.f26494b.clear();
        this.f26495c.e();
    }

    @RequiresNonNull({"processor"})
    public final long d(g gVar) {
        gVar.m();
        while (true) {
            gVar.q(this.f26493a, 0, 4);
            int c10 = g.c(this.f26493a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f26493a, c10, false);
                if (this.f26496d.c(a10)) {
                    gVar.n(c10);
                    return a10;
                }
            }
            gVar.n(1);
        }
    }

    public final double e(g gVar, int i10) {
        long f10 = f(gVar, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) f10);
        }
        return Double.longBitsToDouble(f10);
    }

    public final long f(g gVar, int i10) {
        gVar.readFully(this.f26493a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f26493a[i11] & 255);
        }
        return j10;
    }
}
