package b4;

import a7.q;
import b4.i;
import c5.a;
import c5.b0;
import java.util.Arrays;
import java.util.List;
import m3.q1;
import o3.i0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public final class h extends i {
    public static final byte[] f3794n = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f3795o = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean o(b0 b0Var, byte[] bArr) {
        if (b0Var.a() < bArr.length) {
            return false;
        }
        int e10 = b0Var.e();
        byte[] bArr2 = new byte[bArr.length];
        b0Var.j(bArr2, 0, bArr.length);
        b0Var.P(e10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean p(b0 b0Var) {
        return o(b0Var, f3794n);
    }

    @Override
    public long f(b0 b0Var) {
        return c(n(b0Var.d()));
    }

    @Override
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean h(b0 b0Var, long j10, i.b bVar) {
        boolean z10 = false;
        if (o(b0Var, f3794n)) {
            byte[] copyOf = Arrays.copyOf(b0Var.d(), b0Var.f());
            int c10 = i0.c(copyOf);
            List<byte[]> a10 = i0.a(copyOf);
            if (bVar.f3809a == null) {
                z10 = true;
            }
            a.f(z10);
            bVar.f3809a = new q1.b().e0("audio/opus").H(c10).f0(48000).T(a10).E();
            return true;
        }
        byte[] bArr = f3795o;
        if (o(b0Var, bArr)) {
            a.h(bVar.f3809a);
            b0Var.Q(bArr.length);
            f4.a c11 = com.google.android.exoplayer2.extractor.h.c(q.A(com.google.android.exoplayer2.extractor.h.j(b0Var, false, false).f5590b));
            if (c11 == null) {
                return true;
            }
            bVar.f3809a = bVar.f3809a.b().X(c11.b(bVar.f3809a.S)).E();
            return true;
        }
        a.h(bVar.f3809a);
        return false;
    }

    public final long n(byte[] bArr) {
        int i10 = bArr[0] & 255;
        int i11 = i10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (!(i11 == 1 || i11 == 2)) {
            i12 = bArr[1] & 63;
        }
        int i13 = i10 >> 3;
        int i14 = i13 & 3;
        return i12 * (i13 >= 16 ? 2500 << i14 : i13 >= 12 ? 10000 << (i14 & 1) : i14 == 3 ? 60000 : 10000 << i14);
    }
}
