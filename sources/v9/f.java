package v9;

import android.media.MediaFormat;
import ra.k;
import ra.l;
import s9.e;
import s9.g;
import v9.d;

public final class f {

    public static final class a extends l implements qa.a<d.a<?, v9.b>> {
        public final ea.a M;
        public final z9.a N;
        public final MediaFormat O;
        public final p9.b P;
        public final ba.a Q;
        public final ca.b f24796b;
        public final fa.b f24797c;

        public a(ca.b bVar, fa.b bVar2, ea.a aVar, z9.a aVar2, MediaFormat mediaFormat, p9.b bVar3, ba.a aVar3) {
            super(0);
            this.f24796b = bVar;
            this.f24797c = bVar2;
            this.M = aVar;
            this.N = aVar2;
            this.O = mediaFormat;
            this.P = bVar3;
            this.Q = aVar3;
        }

        public final d.a<?, v9.b> b() {
            ca.b bVar = this.f24796b;
            o9.d dVar = o9.d.AUDIO;
            t9.b bVar2 = new t9.b(bVar, dVar);
            MediaFormat k10 = this.f24796b.k(dVar);
            k.c(k10);
            k.d(k10, "source.getTrackFormat(TrackType.AUDIO)!!");
            return e.a(bVar2, new s9.a(k10, true)).b(new e(dVar, this.f24797c)).b(new q9.a(this.M, this.N, this.O)).b(new g(this.P, dVar)).b(new t9.f(this.Q, dVar));
        }
    }

    public static final class b extends l implements qa.a<d.a<?, v9.b>> {
        public final fa.b M;
        public final ba.a N;
        public final ca.b f24798b;
        public final o9.d f24799c;

        public b(ca.b bVar, o9.d dVar, fa.b bVar2, ba.a aVar) {
            super(0);
            this.f24798b = bVar;
            this.f24799c = dVar;
            this.M = bVar2;
            this.N = aVar;
        }

        public final d.a<?, v9.b> b() {
            d.a a10 = e.a(new t9.b(this.f24798b, this.f24799c), new t9.e(this.f24799c, this.M));
            MediaFormat k10 = this.f24798b.k(this.f24799c);
            k.c(k10);
            k.d(k10, "source.getTrackFormat(track)!!");
            return a10.b(new t9.a(k10)).b(new t9.f(this.N, this.f24799c));
        }
    }

    public static final class c extends l implements qa.a<d.a<?, v9.b>> {
        public final int M;
        public final MediaFormat N;
        public final p9.b O;
        public final ba.a P;
        public final ca.b f24800b;
        public final fa.b f24801c;

        public c(ca.b bVar, fa.b bVar2, int i10, MediaFormat mediaFormat, p9.b bVar3, ba.a aVar) {
            super(0);
            this.f24800b = bVar;
            this.f24801c = bVar2;
            this.M = i10;
            this.N = mediaFormat;
            this.O = bVar3;
            this.P = aVar;
        }

        public final d.a<?, v9.b> b() {
            ca.b bVar = this.f24800b;
            o9.d dVar = o9.d.VIDEO;
            t9.b bVar2 = new t9.b(bVar, dVar);
            MediaFormat k10 = this.f24800b.k(dVar);
            k.c(k10);
            k.d(k10, "source.getTrackFormat(TrackType.VIDEO)!!");
            return e.a(bVar2, new s9.a(k10, true)).b(new e(dVar, this.f24801c)).b(new y9.e(this.f24800b.j(), this.M, this.N, false, 8, null)).b(new y9.d()).b(new g(this.O, dVar)).b(new t9.f(this.P, dVar));
        }
    }

    public static final d a(ca.b bVar, ba.a aVar, fa.b bVar2, MediaFormat mediaFormat, p9.b bVar3, ea.a aVar2, z9.a aVar3) {
        return d.f24789e.a("Audio", new a(bVar, bVar2, aVar2, aVar3, mediaFormat, bVar3, aVar));
    }

    public static final d b() {
        return d.b.b(d.f24789e, "Empty", null, 2, null);
    }

    public static final d c(o9.d dVar, ca.b bVar, ba.a aVar, fa.b bVar2) {
        k.e(dVar, "track");
        k.e(bVar, "source");
        k.e(aVar, "sink");
        k.e(bVar2, "interpolator");
        d.b bVar3 = d.f24789e;
        return bVar3.a("PassThrough(" + dVar + ')', new b(bVar, dVar, bVar2, aVar));
    }

    public static final d d(o9.d dVar, ca.b bVar, ba.a aVar, fa.b bVar2, MediaFormat mediaFormat, p9.b bVar3, int i10, ea.a aVar2, z9.a aVar3) {
        k.e(dVar, "track");
        k.e(bVar, "source");
        k.e(aVar, "sink");
        k.e(bVar2, "interpolator");
        k.e(mediaFormat, "format");
        k.e(bVar3, "codecs");
        k.e(aVar2, "audioStretcher");
        k.e(aVar3, "audioResampler");
        int i11 = g.f24802a[dVar.ordinal()];
        if (i11 == 1) {
            return e(bVar, aVar, bVar2, mediaFormat, bVar3, i10);
        }
        if (i11 == 2) {
            return a(bVar, aVar, bVar2, mediaFormat, bVar3, aVar2, aVar3);
        }
        throw new ia.f();
    }

    public static final d e(ca.b bVar, ba.a aVar, fa.b bVar2, MediaFormat mediaFormat, p9.b bVar3, int i10) {
        return d.f24789e.a("Video", new c(bVar, bVar2, i10, mediaFormat, bVar3, aVar));
    }
}
