package b4;

import a7.q;
import b4.i;
import c5.b0;
import com.google.android.exoplayer2.extractor.h;
import java.util.ArrayList;
import java.util.Arrays;
import m3.k2;
import m3.q1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public final class j extends i {
    public a f3811n;
    public int f3812o;
    public boolean f3813p;
    public h.d f3814q;
    public h.b f3815r;

    public static final class a {
        public final h.d f3816a;
        public final h.b f3817b;
        public final byte[] f3818c;
        public final h.c[] f3819d;
        public final int f3820e;

        public a(h.d dVar, h.b bVar, byte[] bArr, h.c[] cVarArr, int i10) {
            this.f3816a = dVar;
            this.f3817b = bVar;
            this.f3818c = bArr;
            this.f3819d = cVarArr;
            this.f3820e = i10;
        }
    }

    public static void n(b0 b0Var, long j10) {
        if (b0Var.b() < b0Var.f() + 4) {
            b0Var.M(Arrays.copyOf(b0Var.d(), b0Var.f() + 4));
        } else {
            b0Var.O(b0Var.f() + 4);
        }
        byte[] d10 = b0Var.d();
        d10[b0Var.f() - 4] = (byte) (j10 & 255);
        d10[b0Var.f() - 3] = (byte) ((j10 >>> 8) & 255);
        d10[b0Var.f() - 2] = (byte) ((j10 >>> 16) & 255);
        d10[b0Var.f() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    public static int o(byte b10, a aVar) {
        if (!aVar.f3819d[p(b10, aVar.f3820e, 1)].f5592a) {
            return aVar.f3816a.f5602g;
        }
        return aVar.f3816a.f5603h;
    }

    public static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(b0 b0Var) {
        try {
            return h.m(1, b0Var, true);
        } catch (k2 unused) {
            return false;
        }
    }

    @Override
    public void e(long j10) {
        super.e(j10);
        int i10 = 0;
        this.f3813p = j10 != 0;
        h.d dVar = this.f3814q;
        if (dVar != null) {
            i10 = dVar.f5602g;
        }
        this.f3812o = i10;
    }

    @Override
    public long f(b0 b0Var) {
        int i10 = 0;
        if ((b0Var.d()[0] & 1) == 1) {
            return -1L;
        }
        int o10 = o(b0Var.d()[0], (a) c5.a.h(this.f3811n));
        if (this.f3813p) {
            i10 = (this.f3812o + o10) / 4;
        }
        long j10 = i10;
        n(b0Var, j10);
        this.f3813p = true;
        this.f3812o = o10;
        return j10;
    }

    @Override
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean h(b0 b0Var, long j10, i.b bVar) {
        if (this.f3811n != null) {
            c5.a.e(bVar.f3809a);
            return false;
        }
        a q10 = q(b0Var);
        this.f3811n = q10;
        if (q10 == null) {
            return true;
        }
        h.d dVar = q10.f3816a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f5605j);
        arrayList.add(q10.f3818c);
        bVar.f3809a = new q1.b().e0("audio/vorbis").G(dVar.f5600e).Z(dVar.f5599d).H(dVar.f5597b).f0(dVar.f5598c).T(arrayList).X(h.c(q.A(q10.f3817b.f5590b))).E();
        return true;
    }

    @Override
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f3811n = null;
            this.f3814q = null;
            this.f3815r = null;
        }
        this.f3812o = 0;
        this.f3813p = false;
    }

    public a q(b0 b0Var) {
        h.d dVar = this.f3814q;
        if (dVar == null) {
            this.f3814q = h.k(b0Var);
            return null;
        }
        h.b bVar = this.f3815r;
        if (bVar == null) {
            this.f3815r = h.i(b0Var);
            return null;
        }
        byte[] bArr = new byte[b0Var.f()];
        System.arraycopy(b0Var.d(), 0, bArr, 0, b0Var.f());
        h.c[] l10 = h.l(b0Var, dVar.f5597b);
        return new a(dVar, bVar, bArr, l10, h.a(l10.length - 1));
    }
}
