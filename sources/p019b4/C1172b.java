package p019b4;

import com.google.android.exoplayer2.extractor.AbstractC3470g;
import com.google.android.exoplayer2.extractor.C3466d;
import com.google.android.exoplayer2.extractor.C3468e;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p019b4.AbstractC1180i;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p270t3.AbstractC8959g;
import p270t3.C8966m;

public final class C1172b extends AbstractC1180i {
    public FlacStreamMetadata f4415n;
    public C1173a f4416o;

    public static final class C1173a implements AbstractC1178g {
        public FlacStreamMetadata f4417a;
        public FlacStreamMetadata.C3456a f4418b;
        public long f4419c = -1;
        public long f4420d = -1;

        public C1173a(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.C3456a aVar) {
            this.f4417a = flacStreamMetadata;
            this.f4418b = aVar;
        }

        @Override
        public long mo38204a(AbstractC8959g gVar) {
            long j = this.f4420d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f4420d = -1L;
            return j2;
        }

        @Override
        public AbstractC3470g mo38203b() {
            C1186a.m38187f(this.f4419c != -1);
            return new C3468e(this.f4417a, this.f4419c);
        }

        @Override
        public void mo38202c(long j) {
            long[] jArr = this.f4418b.f11424a;
            this.f4420d = jArr[C1216l0.m37973i(jArr, j, true, true)];
        }

        public void m38230d(long j) {
            this.f4419c = j;
        }
    }

    public static boolean m38232o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean m38231p(C1189b0 b0Var) {
        return b0Var.m38145a() >= 5 && b0Var.m38159D() == 127 && b0Var.m38157F() == 1179402563;
    }

    @Override
    public long mo38200f(C1189b0 b0Var) {
        if (!m38232o(b0Var.m38142d())) {
            return -1L;
        }
        return m38233n(b0Var);
    }

    @Override
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean mo38199h(C1189b0 b0Var, long j, AbstractC1180i.C1182b bVar) {
        byte[] d = b0Var.m38142d();
        FlacStreamMetadata flacStreamMetadata = this.f4415n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(d, 17);
            this.f4415n = flacStreamMetadata2;
            bVar.f4457a = flacStreamMetadata2.getFormat(Arrays.copyOfRange(d, 9, b0Var.m38140f()), null);
            return true;
        } else if ((d[0] & Byte.MAX_VALUE) == 3) {
            FlacStreamMetadata.C3456a g = C3466d.m30457g(b0Var);
            FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(g);
            this.f4415n = copyWithSeekTable;
            this.f4416o = new C1173a(copyWithSeekTable, g);
            return true;
        } else if (!m38232o(d)) {
            return true;
        } else {
            C1173a aVar = this.f4416o;
            if (aVar != null) {
                aVar.m38230d(j);
                bVar.f4458b = this.f4416o;
            }
            C1186a.m38188e(bVar.f4457a);
            return false;
        }
    }

    @Override
    public void mo38198l(boolean z) {
        super.mo38198l(z);
        if (z) {
            this.f4415n = null;
            this.f4416o = null;
        }
    }

    public final int m38233n(C1189b0 b0Var) {
        int i = (b0Var.m38142d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            b0Var.m38146Q(4);
            b0Var.m38152K();
        }
        int j = C8966m.m10814j(b0Var, i);
        b0Var.m38147P(0);
        return j;
    }
}
