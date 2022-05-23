package o4;

import b5.b;
import b5.h;
import c5.b0;
import c5.l0;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o4.i0;
import p3.c;
import p3.g;
import t3.t;

public class g0 {
    public final b f19076a;
    public final int f19077b;
    public final b0 f19078c = new b0(32);
    public a f19079d;
    public a f19080e;
    public a f19081f;
    public long f19082g;

    public static final class a implements b.a {
        public long f19083a;
        public long f19084b;
        public b5.a f19085c;
        public a f19086d;

        public a(long j10, int i10) {
            d(j10, i10);
        }

        @Override
        public b5.a a() {
            return (b5.a) c5.a.e(this.f19085c);
        }

        public a b() {
            this.f19085c = null;
            a aVar = this.f19086d;
            this.f19086d = null;
            return aVar;
        }

        public void c(b5.a aVar, a aVar2) {
            this.f19085c = aVar;
            this.f19086d = aVar2;
        }

        public void d(long j10, int i10) {
            c5.a.f(this.f19085c == null);
            this.f19083a = j10;
            this.f19084b = j10 + i10;
        }

        public int e(long j10) {
            return ((int) (j10 - this.f19083a)) + this.f19085c.f3822b;
        }

        @Override
        public b.a next() {
            a aVar = this.f19086d;
            if (aVar == null || aVar.f19085c == null) {
                return null;
            }
            return aVar;
        }
    }

    public g0(b bVar) {
        this.f19076a = bVar;
        int e10 = bVar.e();
        this.f19077b = e10;
        a aVar = new a(0L, e10);
        this.f19079d = aVar;
        this.f19080e = aVar;
        this.f19081f = aVar;
    }

    public static a c(a aVar, long j10) {
        while (j10 >= aVar.f19084b) {
            aVar = aVar.f19086d;
        }
        return aVar;
    }

    public static a h(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a c10 = c(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (c10.f19084b - j10));
            byteBuffer.put(c10.f19085c.f3821a, c10.e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == c10.f19084b) {
                c10 = c10.f19086d;
            }
        }
        return c10;
    }

    public static a i(a aVar, long j10, byte[] bArr, int i10) {
        a c10 = c(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (c10.f19084b - j10));
            System.arraycopy(c10.f19085c.f3821a, c10.e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == c10.f19084b) {
                c10 = c10.f19086d;
            }
        }
        return c10;
    }

    public static a j(a aVar, g gVar, i0.b bVar, b0 b0Var) {
        int i10;
        long j10 = bVar.f19116b;
        b0Var.L(1);
        a i11 = i(aVar, j10, b0Var.d(), 1);
        long j11 = j10 + 1;
        byte b10 = b0Var.d()[0];
        boolean z10 = (b10 & 128) != 0;
        int i12 = b10 & Byte.MAX_VALUE;
        c cVar = gVar.f20487b;
        byte[] bArr = cVar.f20462a;
        if (bArr == null) {
            cVar.f20462a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a i13 = i(i11, j11, cVar.f20462a, i12);
        long j12 = j11 + i12;
        if (z10) {
            b0Var.L(2);
            i13 = i(i13, j12, b0Var.d(), 2);
            j12 += 2;
            i10 = b0Var.J();
        } else {
            i10 = 1;
        }
        int[] iArr = cVar.f20465d;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f20466e;
        if (iArr3 == null || iArr3.length < i10) {
            iArr3 = new int[i10];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i14 = i10 * 6;
            b0Var.L(i14);
            i13 = i(i13, j12, b0Var.d(), i14);
            j12 += i14;
            b0Var.P(0);
            for (int i15 = 0; i15 < i10; i15++) {
                iArr2[i15] = b0Var.J();
                iArr4[i15] = b0Var.H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f19115a - ((int) (j12 - bVar.f19116b));
        }
        t.a aVar2 = (t.a) l0.j(bVar.f19117c);
        cVar.c(i10, iArr2, iArr4, aVar2.f22904b, cVar.f20462a, aVar2.f22903a, aVar2.f22905c, aVar2.f22906d);
        long j13 = bVar.f19116b;
        int i16 = (int) (j12 - j13);
        bVar.f19116b = j13 + i16;
        bVar.f19115a -= i16;
        return i13;
    }

    public static a k(a aVar, g gVar, i0.b bVar, b0 b0Var) {
        if (gVar.h()) {
            aVar = j(aVar, gVar, bVar, b0Var);
        }
        if (gVar.hasSupplementalData()) {
            b0Var.L(4);
            a i10 = i(aVar, bVar.f19116b, b0Var.d(), 4);
            int H = b0Var.H();
            bVar.f19116b += 4;
            bVar.f19115a -= 4;
            gVar.f(H);
            a h10 = h(i10, bVar.f19116b, gVar.f20488c, H);
            bVar.f19116b += H;
            int i11 = bVar.f19115a - H;
            bVar.f19115a = i11;
            gVar.j(i11);
            return h(h10, bVar.f19116b, gVar.O, bVar.f19115a);
        }
        gVar.f(bVar.f19115a);
        return h(aVar, bVar.f19116b, gVar.f20488c, bVar.f19115a);
    }

    public final void a(a aVar) {
        if (aVar.f19085c != null) {
            this.f19076a.a(aVar);
            aVar.b();
        }
    }

    public void b(long j10) {
        a aVar;
        if (j10 != -1) {
            while (true) {
                aVar = this.f19079d;
                if (j10 < aVar.f19084b) {
                    break;
                }
                this.f19076a.d(aVar.f19085c);
                this.f19079d = this.f19079d.b();
            }
            if (this.f19080e.f19083a < aVar.f19083a) {
                this.f19080e = aVar;
            }
        }
    }

    public long d() {
        return this.f19082g;
    }

    public void e(g gVar, i0.b bVar) {
        k(this.f19080e, gVar, bVar, this.f19078c);
    }

    public final void f(int i10) {
        long j10 = this.f19082g + i10;
        this.f19082g = j10;
        a aVar = this.f19081f;
        if (j10 == aVar.f19084b) {
            this.f19081f = aVar.f19086d;
        }
    }

    public final int g(int i10) {
        a aVar = this.f19081f;
        if (aVar.f19085c == null) {
            aVar.c(this.f19076a.b(), new a(this.f19081f.f19084b, this.f19077b));
        }
        return Math.min(i10, (int) (this.f19081f.f19084b - this.f19082g));
    }

    public void l(g gVar, i0.b bVar) {
        this.f19080e = k(this.f19080e, gVar, bVar, this.f19078c);
    }

    public void m() {
        a(this.f19079d);
        this.f19079d.d(0L, this.f19077b);
        a aVar = this.f19079d;
        this.f19080e = aVar;
        this.f19081f = aVar;
        this.f19082g = 0L;
        this.f19076a.c();
    }

    public void n() {
        this.f19080e = this.f19079d;
    }

    public int o(h hVar, int i10, boolean z10) {
        int g10 = g(i10);
        a aVar = this.f19081f;
        int b10 = hVar.b(aVar.f19085c.f3821a, aVar.e(this.f19082g), g10);
        if (b10 != -1) {
            f(b10);
            return b10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void p(b0 b0Var, int i10) {
        while (i10 > 0) {
            int g10 = g(i10);
            a aVar = this.f19081f;
            b0Var.j(aVar.f19085c.f3821a, aVar.e(this.f19082g), g10);
            i10 -= g10;
            f(g10);
        }
    }
}
