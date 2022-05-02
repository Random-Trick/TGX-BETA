package p187n4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p006a5.AbstractC0117b;
import p006a5.AbstractC0147h;
import p006a5.C0115a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p187n4.C7200k0;
import p216p3.C8020c;
import p216p3.C8026g;
import p270t3.AbstractC8974t;

public class C7194i0 {
    public final AbstractC0117b f22891a;
    public final int f22892b;
    public final C1189b0 f22893c = new C1189b0(32);
    public C7195a f22894d;
    public C7195a f22895e;
    public C7195a f22896f;
    public long f22897g;

    public static final class C7195a {
        public final long f22898a;
        public final long f22899b;
        public boolean f22900c;
        public C0115a f22901d;
        public C7195a f22902e;

        public C7195a(long j, int i) {
            this.f22898a = j;
            this.f22899b = j + i;
        }

        public C7195a m17404a() {
            this.f22901d = null;
            C7195a aVar = this.f22902e;
            this.f22902e = null;
            return aVar;
        }

        public void m17403b(C0115a aVar, C7195a aVar2) {
            this.f22901d = aVar;
            this.f22902e = aVar2;
            this.f22900c = true;
        }

        public int m17402c(long j) {
            return ((int) (j - this.f22898a)) + this.f22901d.f460b;
        }
    }

    public C7194i0(AbstractC0117b bVar) {
        this.f22891a = bVar;
        int e = bVar.mo42187e();
        this.f22892b = e;
        C7195a aVar = new C7195a(0L, e);
        this.f22894d = aVar;
        this.f22895e = aVar;
        this.f22896f = aVar;
    }

    public static C7195a m17418c(C7195a aVar, long j) {
        while (j >= aVar.f22899b) {
            aVar = aVar.f22902e;
        }
        return aVar;
    }

    public static C7195a m17413h(C7195a aVar, long j, ByteBuffer byteBuffer, int i) {
        C7195a c = m17418c(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (c.f22899b - j));
            byteBuffer.put(c.f22901d.f459a, c.m17402c(j), min);
            i -= min;
            j += min;
            if (j == c.f22899b) {
                c = c.f22902e;
            }
        }
        return c;
    }

    public static C7195a m17412i(C7195a aVar, long j, byte[] bArr, int i) {
        C7195a c = m17418c(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c.f22899b - j));
            System.arraycopy(c.f22901d.f459a, c.m17402c(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c.f22899b) {
                c = c.f22902e;
            }
        }
        return c;
    }

    public static C7195a m17411j(C7195a aVar, C8026g gVar, C7200k0.C7202b bVar, C1189b0 b0Var) {
        int i;
        long j = bVar.f22945b;
        b0Var.m38148L(1);
        C7195a i2 = m17412i(aVar, j, b0Var.m38139d(), 1);
        long j2 = j + 1;
        byte b = b0Var.m38139d()[0];
        boolean z = (b & 128) != 0;
        int i3 = b & Byte.MAX_VALUE;
        C8020c cVar = gVar.f26131b;
        byte[] bArr = cVar.f26102a;
        if (bArr == null) {
            cVar.f26102a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C7195a i4 = m17412i(i2, j2, cVar.f26102a, i3);
        long j3 = j2 + i3;
        if (z) {
            b0Var.m38148L(2);
            i4 = m17412i(i4, j3, b0Var.m38139d(), 2);
            j3 += 2;
            i = b0Var.m38150J();
        } else {
            i = 1;
        }
        int[] iArr = cVar.f26105d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f26106e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i5 = i * 6;
            b0Var.m38148L(i5);
            i4 = m17412i(i4, j3, b0Var.m38139d(), i5);
            j3 += i5;
            b0Var.m38144P(0);
            for (int i6 = 0; i6 < i; i6++) {
                iArr2[i6] = b0Var.m38150J();
                iArr4[i6] = b0Var.m38152H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f22944a - ((int) (j3 - bVar.f22945b));
        }
        AbstractC8974t.C8975a aVar2 = (AbstractC8974t.C8975a) C1216l0.m37968j(bVar.f22946c);
        cVar.m13786c(i, iArr2, iArr4, aVar2.f28862b, cVar.f26102a, aVar2.f28861a, aVar2.f28863c, aVar2.f28864d);
        long j4 = bVar.f22945b;
        int i7 = (int) (j3 - j4);
        bVar.f22945b = j4 + i7;
        bVar.f22944a -= i7;
        return i4;
    }

    public static C7195a m17410k(C7195a aVar, C8026g gVar, C7200k0.C7202b bVar, C1189b0 b0Var) {
        if (gVar.m13777h()) {
            aVar = m17411j(aVar, gVar, bVar, b0Var);
        }
        if (gVar.hasSupplementalData()) {
            b0Var.m38148L(4);
            C7195a i = m17412i(aVar, bVar.f22945b, b0Var.m38139d(), 4);
            int H = b0Var.m38152H();
            bVar.f22945b += 4;
            bVar.f22944a -= 4;
            gVar.m13779f(H);
            C7195a h = m17413h(i, bVar.f22945b, gVar.f26132c, H);
            bVar.f22945b += H;
            int i2 = bVar.f22944a - H;
            bVar.f22944a = i2;
            gVar.m13775j(i2);
            return m17413h(h, bVar.f22945b, gVar.f26127O, bVar.f22944a);
        }
        gVar.m13779f(bVar.f22944a);
        return m17413h(aVar, bVar.f22945b, gVar.f26132c, bVar.f22944a);
    }

    public final void m17420a(C7195a aVar) {
        if (aVar.f22900c) {
            C7195a aVar2 = this.f22896f;
            int i = (aVar2.f22900c ? 1 : 0) + (((int) (aVar2.f22898a - aVar.f22898a)) / this.f22892b);
            C0115a[] aVarArr = new C0115a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = aVar.f22901d;
                aVar = aVar.m17404a();
            }
            this.f22891a.mo42189c(aVarArr);
        }
    }

    public void m17419b(long j) {
        C7195a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f22894d;
                if (j < aVar.f22899b) {
                    break;
                }
                this.f22891a.mo42191a(aVar.f22901d);
                this.f22894d = this.f22894d.m17404a();
            }
            if (this.f22895e.f22898a < aVar.f22898a) {
                this.f22895e = aVar;
            }
        }
    }

    public long m17417d() {
        return this.f22897g;
    }

    public void m17416e(C8026g gVar, C7200k0.C7202b bVar) {
        m17410k(this.f22895e, gVar, bVar, this.f22893c);
    }

    public final void m17415f(int i) {
        long j = this.f22897g + i;
        this.f22897g = j;
        C7195a aVar = this.f22896f;
        if (j == aVar.f22899b) {
            this.f22896f = aVar.f22902e;
        }
    }

    public final int m17414g(int i) {
        C7195a aVar = this.f22896f;
        if (!aVar.f22900c) {
            aVar.m17403b(this.f22891a.mo42190b(), new C7195a(this.f22896f.f22899b, this.f22892b));
        }
        return Math.min(i, (int) (this.f22896f.f22899b - this.f22897g));
    }

    public void m17409l(C8026g gVar, C7200k0.C7202b bVar) {
        this.f22895e = m17410k(this.f22895e, gVar, bVar, this.f22893c);
    }

    public void m17408m() {
        m17420a(this.f22894d);
        C7195a aVar = new C7195a(0L, this.f22892b);
        this.f22894d = aVar;
        this.f22895e = aVar;
        this.f22896f = aVar;
        this.f22897g = 0L;
        this.f22891a.mo42188d();
    }

    public void m17407n() {
        this.f22895e = this.f22894d;
    }

    public int m17406o(AbstractC0147h hVar, int i, boolean z) {
        int g = m17414g(i);
        C7195a aVar = this.f22896f;
        int b = hVar.mo4414b(aVar.f22901d.f459a, aVar.m17402c(this.f22897g), g);
        if (b != -1) {
            m17415f(b);
            return b;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void m17405p(C1189b0 b0Var, int i) {
        while (i > 0) {
            int g = m17414g(i);
            C7195a aVar = this.f22896f;
            b0Var.m38133j(aVar.f22901d.f459a, aVar.m17402c(this.f22897g), g);
            i -= g;
            m17415f(g);
        }
    }
}
