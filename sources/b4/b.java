package b4;

import b4.i;
import c5.b0;
import c5.l0;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.d;
import com.google.android.exoplayer2.extractor.e;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import t3.g;
import t3.m;

public final class b extends i {
    public FlacStreamMetadata f3767n;
    public a f3768o;

    public static final class a implements g {
        public FlacStreamMetadata f3769a;
        public FlacStreamMetadata.a f3770b;
        public long f3771c = -1;
        public long f3772d = -1;

        public a(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.a aVar) {
            this.f3769a = flacStreamMetadata;
            this.f3770b = aVar;
        }

        @Override
        public long a(g gVar) {
            long j10 = this.f3772d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f3772d = -1L;
            return j11;
        }

        @Override
        public com.google.android.exoplayer2.extractor.g b() {
            c5.a.f(this.f3771c != -1);
            return new e(this.f3769a, this.f3771c);
        }

        @Override
        public void c(long j10) {
            long[] jArr = this.f3770b.f5535a;
            this.f3772d = jArr[l0.i(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f3771c = j10;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(b0 b0Var) {
        return b0Var.a() >= 5 && b0Var.D() == 127 && b0Var.F() == 1179402563;
    }

    @Override
    public long f(b0 b0Var) {
        if (!o(b0Var.d())) {
            return -1L;
        }
        return n(b0Var);
    }

    @Override
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean h(b0 b0Var, long j10, i.b bVar) {
        byte[] d10 = b0Var.d();
        FlacStreamMetadata flacStreamMetadata = this.f3767n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(d10, 17);
            this.f3767n = flacStreamMetadata2;
            bVar.f3809a = flacStreamMetadata2.getFormat(Arrays.copyOfRange(d10, 9, b0Var.f()), null);
            return true;
        } else if ((d10[0] & Byte.MAX_VALUE) == 3) {
            FlacStreamMetadata.a f10 = d.f(b0Var);
            FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(f10);
            this.f3767n = copyWithSeekTable;
            this.f3768o = new a(copyWithSeekTable, f10);
            return true;
        } else if (!o(d10)) {
            return true;
        } else {
            a aVar = this.f3768o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f3810b = this.f3768o;
            }
            c5.a.e(bVar.f3809a);
            return false;
        }
    }

    @Override
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f3767n = null;
            this.f3768o = null;
        }
    }

    public final int n(b0 b0Var) {
        int i10 = (b0Var.d()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            b0Var.Q(4);
            b0Var.K();
        }
        int j10 = m.j(b0Var, i10);
        b0Var.P(0);
        return j10;
    }
}
