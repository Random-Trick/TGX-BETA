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
        public long mo38201a(AbstractC8959g gVar) {
            long j = this.f4420d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.f4420d = -1L;
            return j2;
        }

        @Override
        public AbstractC3470g mo38200b() {
            C1186a.m38184f(this.f4419c != -1);
            return new C3468e(this.f4417a, this.f4419c);
        }

        @Override
        public void mo38199c(long j) {
            long[] jArr = this.f4418b.f11424a;
            this.f4420d = jArr[C1216l0.m37970i(jArr, j, true, true)];
        }

        public void m38227d(long j) {
            this.f4419c = j;
        }
    }

    public static boolean m38229o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean m38228p(C1189b0 b0Var) {
        return b0Var.m38142a() >= 5 && b0Var.m38156D() == 127 && b0Var.m38154F() == 1179402563;
    }

    @Override
    public long mo38197f(C1189b0 b0Var) {
        if (!m38229o(b0Var.m38139d())) {
            return -1L;
        }
        return m38230n(b0Var);
    }

    @Override
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean mo38196h(C1189b0 b0Var, long j, AbstractC1180i.C1182b bVar) {
        byte[] d = b0Var.m38139d();
        FlacStreamMetadata flacStreamMetadata = this.f4415n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(d, 17);
            this.f4415n = flacStreamMetadata2;
            bVar.f4457a = flacStreamMetadata2.getFormat(Arrays.copyOfRange(d, 9, b0Var.m38137f()), null);
            return true;
        } else if ((d[0] & Byte.MAX_VALUE) == 3) {
            FlacStreamMetadata.C3456a g = C3466d.m30455g(b0Var);
            FlacStreamMetadata copyWithSeekTable = flacStreamMetadata.copyWithSeekTable(g);
            this.f4415n = copyWithSeekTable;
            this.f4416o = new C1173a(copyWithSeekTable, g);
            return true;
        } else if (!m38229o(d)) {
            return true;
        } else {
            C1173a aVar = this.f4416o;
            if (aVar != null) {
                aVar.m38227d(j);
                bVar.f4458b = this.f4416o;
            }
            C1186a.m38185e(bVar.f4457a);
            return false;
        }
    }

    @Override
    public void mo38195l(boolean z) {
        super.mo38195l(z);
        if (z) {
            this.f4415n = null;
            this.f4416o = null;
        }
    }

    public final int m38230n(C1189b0 b0Var) {
        int i = (b0Var.m38139d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            b0Var.m38143Q(4);
            b0Var.m38149K();
        }
        int j = C8966m.m10815j(b0Var, i);
        b0Var.m38144P(0);
        return j;
    }
}
