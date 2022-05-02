package p289u9;

import android.media.MediaFormat;
import ba.AbstractC1296b;
import p011aa.AbstractC0237a;
import p050da.AbstractC3930a;
import p065ea.AbstractC4177b;
import p107ha.C5046f;
import p192n9.EnumC7313d;
import p205o9.C7795b;
import p222p9.C8067a;
import p250r9.C8394a;
import p250r9.C8403e;
import p250r9.C8405g;
import p265s9.C8700a;
import p265s9.C8702b;
import p265s9.C8705e;
import p265s9.C8706f;
import p289u9.C9464d;
import p331x9.C10165d;
import p331x9.C10166e;
import p346y9.AbstractC10456a;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8298k;

public final class C9469f {

    public static final class C9470a extends AbstractC8299l implements AbstractC8077a<C9464d.C9465a<?, AbstractC9461b>> {
        public final AbstractC3930a f30698M;
        public final AbstractC10456a f30699N;
        public final MediaFormat f30700O;
        public final C7795b f30701P;
        public final AbstractC0237a f30702Q;
        public final AbstractC1296b f30703b;
        public final AbstractC4177b f30704c;

        public C9470a(AbstractC1296b bVar, AbstractC4177b bVar2, AbstractC3930a aVar, AbstractC10456a aVar2, MediaFormat mediaFormat, C7795b bVar3, AbstractC0237a aVar3) {
            super(0);
            this.f30703b = bVar;
            this.f30704c = bVar2;
            this.f30698M = aVar;
            this.f30699N = aVar2;
            this.f30700O = mediaFormat;
            this.f30701P = bVar3;
            this.f30702Q = aVar3;
        }

        public final C9464d.C9465a<?, AbstractC9461b> mo4925b() {
            AbstractC1296b bVar = this.f30703b;
            EnumC7313d dVar = EnumC7313d.AUDIO;
            C8702b bVar2 = new C8702b(bVar, dVar);
            MediaFormat n = this.f30703b.mo6281n(dVar);
            C8298k.m12935c(n);
            C8298k.m12934d(n, "source.getTrackFormat(TrackType.AUDIO)!!");
            return C9468e.m8570a(bVar2, new C8394a(n, true)).m8574b(new C8403e(dVar, this.f30704c)).m8574b(new C8067a(this.f30698M, this.f30699N, this.f30700O)).m8574b(new C8405g(this.f30701P, dVar)).m8574b(new C8706f(this.f30702Q, dVar));
        }
    }

    public static final class C9471b extends AbstractC8299l implements AbstractC8077a<C9464d.C9465a<?, AbstractC9461b>> {
        public final AbstractC4177b f30705M;
        public final AbstractC0237a f30706N;
        public final AbstractC1296b f30707b;
        public final EnumC7313d f30708c;

        public C9471b(AbstractC1296b bVar, EnumC7313d dVar, AbstractC4177b bVar2, AbstractC0237a aVar) {
            super(0);
            this.f30707b = bVar;
            this.f30708c = dVar;
            this.f30705M = bVar2;
            this.f30706N = aVar;
        }

        public final C9464d.C9465a<?, AbstractC9461b> mo4925b() {
            C9464d.C9465a a = C9468e.m8570a(new C8702b(this.f30707b, this.f30708c), new C8705e(this.f30708c, this.f30705M));
            MediaFormat n = this.f30707b.mo6281n(this.f30708c);
            C8298k.m12935c(n);
            C8298k.m12934d(n, "source.getTrackFormat(track)!!");
            return a.m8574b(new C8700a(n)).m8574b(new C8706f(this.f30706N, this.f30708c));
        }
    }

    public static final class C9472c extends AbstractC8299l implements AbstractC8077a<C9464d.C9465a<?, AbstractC9461b>> {
        public final int f30709M;
        public final MediaFormat f30710N;
        public final C7795b f30711O;
        public final AbstractC0237a f30712P;
        public final AbstractC1296b f30713b;
        public final AbstractC4177b f30714c;

        public C9472c(AbstractC1296b bVar, AbstractC4177b bVar2, int i, MediaFormat mediaFormat, C7795b bVar3, AbstractC0237a aVar) {
            super(0);
            this.f30713b = bVar;
            this.f30714c = bVar2;
            this.f30709M = i;
            this.f30710N = mediaFormat;
            this.f30711O = bVar3;
            this.f30712P = aVar;
        }

        public final C9464d.C9465a<?, AbstractC9461b> mo4925b() {
            AbstractC1296b bVar = this.f30713b;
            EnumC7313d dVar = EnumC7313d.VIDEO;
            C8702b bVar2 = new C8702b(bVar, dVar);
            MediaFormat n = this.f30713b.mo6281n(dVar);
            C8298k.m12935c(n);
            C8298k.m12934d(n, "source.getTrackFormat(TrackType.VIDEO)!!");
            return C9468e.m8570a(bVar2, new C8394a(n, true)).m8574b(new C8403e(dVar, this.f30714c)).m8574b(new C10166e(this.f30713b.mo6286i(), this.f30709M, this.f30710N, false, 8, null)).m8574b(new C10165d()).m8574b(new C8405g(this.f30711O, dVar)).m8574b(new C8706f(this.f30712P, dVar));
        }
    }

    public static final C9464d m8569a(AbstractC1296b bVar, AbstractC0237a aVar, AbstractC4177b bVar2, MediaFormat mediaFormat, C7795b bVar3, AbstractC3930a aVar2, AbstractC10456a aVar3) {
        return C9464d.f30691e.m8573a("Audio", new C9470a(bVar, bVar2, aVar2, aVar3, mediaFormat, bVar3, aVar));
    }

    public static final C9464d m8568b() {
        return C9464d.C9466b.m8572b(C9464d.f30691e, "Empty", null, 2, null);
    }

    public static final C9464d m8567c(EnumC7313d dVar, AbstractC1296b bVar, AbstractC0237a aVar, AbstractC4177b bVar2) {
        C8298k.m12933e(dVar, "track");
        C8298k.m12933e(bVar, "source");
        C8298k.m12933e(aVar, "sink");
        C8298k.m12933e(bVar2, "interpolator");
        C9464d.C9466b bVar3 = C9464d.f30691e;
        return bVar3.m8573a("PassThrough(" + dVar + ')', new C9471b(bVar, dVar, bVar2, aVar));
    }

    public static final C9464d m8566d(EnumC7313d dVar, AbstractC1296b bVar, AbstractC0237a aVar, AbstractC4177b bVar2, MediaFormat mediaFormat, C7795b bVar3, int i, AbstractC3930a aVar2, AbstractC10456a aVar3) {
        C8298k.m12933e(dVar, "track");
        C8298k.m12933e(bVar, "source");
        C8298k.m12933e(aVar, "sink");
        C8298k.m12933e(bVar2, "interpolator");
        C8298k.m12933e(mediaFormat, "format");
        C8298k.m12933e(bVar3, "codecs");
        C8298k.m12933e(aVar2, "audioStretcher");
        C8298k.m12933e(aVar3, "audioResampler");
        int i2 = C9473g.f30715a[dVar.ordinal()];
        if (i2 == 1) {
            return m8565e(bVar, aVar, bVar2, mediaFormat, bVar3, i);
        }
        if (i2 == 2) {
            return m8569a(bVar, aVar, bVar2, mediaFormat, bVar3, aVar2, aVar3);
        }
        throw new C5046f();
    }

    public static final C9464d m8565e(AbstractC1296b bVar, AbstractC0237a aVar, AbstractC4177b bVar2, MediaFormat mediaFormat, C7795b bVar3, int i) {
        return C9464d.f30691e.m8573a("Video", new C9472c(bVar, bVar2, i, mediaFormat, bVar3, aVar));
    }
}
