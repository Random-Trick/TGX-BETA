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
    public final AbstractC0117b f22894a;
    public final int f22895b;
    public final C1189b0 f22896c = new C1189b0(32);
    public C7195a f22897d;
    public C7195a f22898e;
    public C7195a f22899f;
    public long f22900g;

    public static final class C7195a {
        public final long f22901a;
        public final long f22902b;
        public boolean f22903c;
        public C0115a f22904d;
        public C7195a f22905e;

        public C7195a(long j, int i) {
            this.f22901a = j;
            this.f22902b = j + i;
        }

        public C7195a m17404a() {
            this.f22904d = null;
            C7195a aVar = this.f22905e;
            this.f22905e = null;
            return aVar;
        }

        public void m17403b(C0115a aVar, C7195a aVar2) {
            this.f22904d = aVar;
            this.f22905e = aVar2;
            this.f22903c = true;
        }

        public int m17402c(long j) {
            return ((int) (j - this.f22901a)) + this.f22904d.f460b;
        }
    }

    public C7194i0(AbstractC0117b bVar) {
        this.f22894a = bVar;
        int e = bVar.mo42190e();
        this.f22895b = e;
        C7195a aVar = new C7195a(0L, e);
        this.f22897d = aVar;
        this.f22898e = aVar;
        this.f22899f = aVar;
    }

    public static C7195a m17418c(C7195a aVar, long j) {
        while (j >= aVar.f22902b) {
            aVar = aVar.f22905e;
        }
        return aVar;
    }

    public static C7195a m17413h(C7195a aVar, long j, ByteBuffer byteBuffer, int i) {
        C7195a c = m17418c(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (c.f22902b - j));
            byteBuffer.put(c.f22904d.f459a, c.m17402c(j), min);
            i -= min;
            j += min;
            if (j == c.f22902b) {
                c = c.f22905e;
            }
        }
        return c;
    }

    public static C7195a m17412i(C7195a aVar, long j, byte[] bArr, int i) {
        C7195a c = m17418c(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c.f22902b - j));
            System.arraycopy(c.f22904d.f459a, c.m17402c(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == c.f22902b) {
                c = c.f22905e;
            }
        }
        return c;
    }

    public static C7195a m17411j(C7195a aVar, C8026g gVar, C7200k0.C7202b bVar, C1189b0 b0Var) {
        int i;
        long j = bVar.f22948b;
        b0Var.m38151L(1);
        C7195a i2 = m17412i(aVar, j, b0Var.m38142d(), 1);
        long j2 = j + 1;
        byte b = b0Var.m38142d()[0];
        boolean z = (b & 128) != 0;
        int i3 = b & Byte.MAX_VALUE;
        C8020c cVar = gVar.f26134b;
        byte[] bArr = cVar.f26105a;
        if (bArr == null) {
            cVar.f26105a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        C7195a i4 = m17412i(i2, j2, cVar.f26105a, i3);
        long j3 = j2 + i3;
        if (z) {
            b0Var.m38151L(2);
            i4 = m17412i(i4, j3, b0Var.m38142d(), 2);
            j3 += 2;
            i = b0Var.m38153J();
        } else {
            i = 1;
        }
        int[] iArr = cVar.f26108d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f26109e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i5 = i * 6;
            b0Var.m38151L(i5);
            i4 = m17412i(i4, j3, b0Var.m38142d(), i5);
            j3 += i5;
            b0Var.m38147P(0);
            for (int i6 = 0; i6 < i; i6++) {
                iArr2[i6] = b0Var.m38153J();
                iArr4[i6] = b0Var.m38155H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f22947a - ((int) (j3 - bVar.f22948b));
        }
        AbstractC8974t.C8975a aVar2 = (AbstractC8974t.C8975a) C1216l0.m37971j(bVar.f22949c);
        cVar.m13785c(i, iArr2, iArr4, aVar2.f28865b, cVar.f26105a, aVar2.f28864a, aVar2.f28866c, aVar2.f28867d);
        long j4 = bVar.f22948b;
        int i7 = (int) (j3 - j4);
        bVar.f22948b = j4 + i7;
        bVar.f22947a -= i7;
        return i4;
    }

    public static C7195a m17410k(C7195a aVar, C8026g gVar, C7200k0.C7202b bVar, C1189b0 b0Var) {
        if (gVar.m13776h()) {
            aVar = m17411j(aVar, gVar, bVar, b0Var);
        }
        if (gVar.hasSupplementalData()) {
            b0Var.m38151L(4);
            C7195a i = m17412i(aVar, bVar.f22948b, b0Var.m38142d(), 4);
            int H = b0Var.m38155H();
            bVar.f22948b += 4;
            bVar.f22947a -= 4;
            gVar.m13778f(H);
            C7195a h = m17413h(i, bVar.f22948b, gVar.f26135c, H);
            bVar.f22948b += H;
            int i2 = bVar.f22947a - H;
            bVar.f22947a = i2;
            gVar.m13774j(i2);
            return m17413h(h, bVar.f22948b, gVar.f26130O, bVar.f22947a);
        }
        gVar.m13778f(bVar.f22947a);
        return m17413h(aVar, bVar.f22948b, gVar.f26135c, bVar.f22947a);
    }

    public final void m17420a(C7195a aVar) {
        if (aVar.f22903c) {
            C7195a aVar2 = this.f22899f;
            int i = (aVar2.f22903c ? 1 : 0) + (((int) (aVar2.f22901a - aVar.f22901a)) / this.f22895b);
            C0115a[] aVarArr = new C0115a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = aVar.f22904d;
                aVar = aVar.m17404a();
            }
            this.f22894a.mo42192c(aVarArr);
        }
    }

    public void m17419b(long j) {
        C7195a aVar;
        if (j != -1) {
            while (true) {
                aVar = this.f22897d;
                if (j < aVar.f22902b) {
                    break;
                }
                this.f22894a.mo42194a(aVar.f22904d);
                this.f22897d = this.f22897d.m17404a();
            }
            if (this.f22898e.f22901a < aVar.f22901a) {
                this.f22898e = aVar;
            }
        }
    }

    public long m17417d() {
        return this.f22900g;
    }

    public void m17416e(C8026g gVar, C7200k0.C7202b bVar) {
        m17410k(this.f22898e, gVar, bVar, this.f22896c);
    }

    public final void m17415f(int i) {
        long j = this.f22900g + i;
        this.f22900g = j;
        C7195a aVar = this.f22899f;
        if (j == aVar.f22902b) {
            this.f22899f = aVar.f22905e;
        }
    }

    public final int m17414g(int i) {
        C7195a aVar = this.f22899f;
        if (!aVar.f22903c) {
            aVar.m17403b(this.f22894a.mo42193b(), new C7195a(this.f22899f.f22902b, this.f22895b));
        }
        return Math.min(i, (int) (this.f22899f.f22902b - this.f22900g));
    }

    public void m17409l(C8026g gVar, C7200k0.C7202b bVar) {
        this.f22898e = m17410k(this.f22898e, gVar, bVar, this.f22896c);
    }

    public void m17408m() {
        m17420a(this.f22897d);
        C7195a aVar = new C7195a(0L, this.f22895b);
        this.f22897d = aVar;
        this.f22898e = aVar;
        this.f22899f = aVar;
        this.f22900g = 0L;
        this.f22894a.mo42191d();
    }

    public void m17407n() {
        this.f22898e = this.f22897d;
    }

    public int m17406o(AbstractC0147h hVar, int i, boolean z) {
        int g = m17414g(i);
        C7195a aVar = this.f22899f;
        int b = hVar.mo4414b(aVar.f22904d.f459a, aVar.m17402c(this.f22900g), g);
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
            C7195a aVar = this.f22899f;
            b0Var.m38136j(aVar.f22904d.f459a, aVar.m17402c(this.f22900g), g);
            i -= g;
            m17415f(g);
        }
    }
}
