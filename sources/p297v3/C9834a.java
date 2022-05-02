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
        public final FlacStreamMetadata f32095a;
        public final int f32096b;
        public final C8966m.C8967a f32097c;

        @Override
        public AbstractC3457a.C3462e mo6780a(AbstractC8959g gVar, long j) {
            long r = gVar.mo6043r();
            long c = m6778c(gVar);
            long f = gVar.mo6045f();
            gVar.mo10812h(Math.max(6, this.f32095a.minFrameSize));
            long c2 = m6778c(gVar);
            long f2 = gVar.mo6045f();
            if (c <= j && c2 > j) {
                return AbstractC3457a.C3462e.m30467e(f);
            }
            if (c2 <= j) {
                return AbstractC3457a.C3462e.m30466f(c2, f2);
            }
            return AbstractC3457a.C3462e.m30468d(c, r);
        }

        @Override
        public void mo6779b() {
            C8952a.m10847a(this);
        }

        public final long m6778c(AbstractC8959g gVar) {
            while (gVar.mo6045f() < gVar.mo6046a() - 6 && !C8966m.m10817h(gVar, this.f32095a, this.f32096b, this.f32097c)) {
                gVar.mo10812h(1);
            }
            if (gVar.mo6045f() < gVar.mo6046a() - 6) {
                return this.f32097c.f28851a;
            }
            gVar.mo10812h((int) (gVar.mo6046a() - gVar.mo6045f()));
            return this.f32095a.totalSamples;
        }

        public C9836b(FlacStreamMetadata flacStreamMetadata, int i) {
            this.f32095a = flacStreamMetadata;
            this.f32096b = i;
            this.f32097c = new C8966m.C8967a();
        }
    }

    public C9834a(FlacStreamMetadata flacStreamMetadata, int i, long j, long j2) {
        super(new C3443a(flacStreamMetadata), new C9836b(flacStreamMetadata, i), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j, j2, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
