package p297v3;

import com.google.android.exoplayer2.ext.flac.C3443a;
import com.google.android.exoplayer2.extractor.AbstractC3457a;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.util.Objects;
import p270t3.AbstractC8959g;
import p270t3.C8952a;
import p270t3.C8966m;

public final class C9834a extends AbstractC3457a {

    public static final class C9836b implements AbstractC3457a.AbstractC3463f {
        public final FlacStreamMetadata f32098a;
        public final int f32099b;
        public final C8966m.C8967a f32100c;

        @Override
        public AbstractC3457a.C3462e mo6780a(AbstractC8959g gVar, long j) {
            long r = gVar.mo6043r();
            long c = m6778c(gVar);
            long f = gVar.mo6045f();
            gVar.mo10811h(Math.max(6, this.f32098a.minFrameSize));
            long c2 = m6778c(gVar);
            long f2 = gVar.mo6045f();
            if (c <= j && c2 > j) {
                return AbstractC3457a.C3462e.m30469e(f);
            }
            if (c2 <= j) {
                return AbstractC3457a.C3462e.m30468f(c2, f2);
            }
            return AbstractC3457a.C3462e.m30470d(c, r);
        }

        @Override
        public void mo6779b() {
            C8952a.m10846a(this);
        }

        public final long m6778c(AbstractC8959g gVar) {
            while (gVar.mo6045f() < gVar.mo6046a() - 6 && !C8966m.m10816h(gVar, this.f32098a, this.f32099b, this.f32100c)) {
                gVar.mo10811h(1);
            }
            if (gVar.mo6045f() < gVar.mo6046a() - 6) {
                return this.f32100c.f28854a;
            }
            gVar.mo10811h((int) (gVar.mo6046a() - gVar.mo6045f()));
            return this.f32098a.totalSamples;
        }

        public C9836b(FlacStreamMetadata flacStreamMetadata, int i) {
            this.f32098a = flacStreamMetadata;
            this.f32099b = i;
            this.f32100c = new C8966m.C8967a();
        }
    }

    public C9834a(FlacStreamMetadata flacStreamMetadata, int i, long j, long j2) {
        super(new C3443a(flacStreamMetadata), new C9836b(flacStreamMetadata, i), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j, j2, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
