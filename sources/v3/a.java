package v3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.a;
import java.util.Objects;
import t3.g;
import t3.m;

public final class a extends com.google.android.exoplayer2.extractor.a {

    public static final class b implements a.f {
        public final FlacStreamMetadata f24680a;
        public final int f24681b;
        public final m.a f24682c;

        @Override
        public a.e a(g gVar, long j10) {
            long r10 = gVar.r();
            long c10 = c(gVar);
            long f10 = gVar.f();
            gVar.g(Math.max(6, this.f24680a.minFrameSize));
            long c11 = c(gVar);
            long f11 = gVar.f();
            if (c10 <= j10 && c11 > j10) {
                return a.e.e(f10);
            }
            if (c11 <= j10) {
                return a.e.f(c11, f11);
            }
            return a.e.d(c10, r10);
        }

        @Override
        public void b() {
            t3.a.a(this);
        }

        public final long c(g gVar) {
            while (gVar.f() < gVar.a() - 6 && !m.h(gVar, this.f24680a, this.f24681b, this.f24682c)) {
                gVar.g(1);
            }
            if (gVar.f() < gVar.a() - 6) {
                return this.f24682c.f22893a;
            }
            gVar.g((int) (gVar.a() - gVar.f()));
            return this.f24680a.totalSamples;
        }

        public b(FlacStreamMetadata flacStreamMetadata, int i10) {
            this.f24680a = flacStreamMetadata;
            this.f24681b = i10;
            this.f24682c = new m.a();
        }
    }

    public a(FlacStreamMetadata flacStreamMetadata, int i10, long j10, long j11) {
        super(new com.google.android.exoplayer2.ext.flac.a(flacStreamMetadata), new b(flacStreamMetadata, i10), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j10, j11, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
