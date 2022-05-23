package w9;

import android.media.MediaFormat;
import da.f;
import ia.i;
import ia.q;
import ja.n;
import ja.v;
import java.util.List;
import p9.g;
import p9.h;
import qa.r;
import ra.j;
import ra.k;
import ra.l;
import x9.i;

public final class a extends w9.d {
    public final i f25817c;
    public final p9.i f25818d;
    public final g f25819e;
    public final h f25820f;
    public final p9.b f25821g;
    public final p9.d f25822h;
    public final ba.a f25823i;
    public final ga.b f25824j;
    public final int f25825k;
    public final ea.a f25826l;
    public final z9.a f25827m;
    public static final C0237a f25816p = new C0237a(null);
    public static final long f25814n = 10;
    public static final long f25815o = 10;

    public static final class C0237a {
        public C0237a() {
        }

        public C0237a(ra.g gVar) {
            this();
        }
    }

    public static final class b extends l implements qa.a<Boolean> {
        public final int f25828b;
        public final List f25829c;

        public b(int i10, List list) {
            super(0);
            this.f25828b = i10;
            this.f25829c = list;
        }

        @Override
        public Boolean b() {
            return Boolean.valueOf(f());
        }

        public final boolean f() {
            return this.f25828b < n.g(this.f25829c);
        }
    }

    public static final class c extends l implements qa.a<Boolean> {
        public final o9.d f25831c;

        public c(o9.d dVar) {
            super(0);
            this.f25831c = dVar;
        }

        @Override
        public Boolean b() {
            return Boolean.valueOf(f());
        }

        public final boolean f() {
            return a.this.f25820f.j().n(this.f25831c).longValue() > a.this.f25820f.l() + 100;
        }
    }

    public static final class d extends l implements qa.l<ca.b, double[]> {
        public static final d f25832b = new d();

        public d() {
            super(1);
        }

        public final double[] a(ca.b bVar) {
            k.e(bVar, "it");
            return bVar.o();
        }
    }

    public static final class e extends j implements r<o9.d, Integer, o9.c, MediaFormat, v9.d> {
        public e(a aVar) {
            super(4, aVar, a.class, "createPipeline", "createPipeline(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", 0);
        }

        @Override
        public v9.d c(o9.d dVar, Integer num, o9.c cVar, MediaFormat mediaFormat) {
            return m(dVar, num.intValue(), cVar, mediaFormat);
        }

        public final v9.d m(o9.d dVar, int i10, o9.c cVar, MediaFormat mediaFormat) {
            k.e(dVar, "p1");
            k.e(cVar, "p3");
            k.e(mediaFormat, "p4");
            return ((a) this.f21803b).h(dVar, i10, cVar, mediaFormat);
        }
    }

    public a(p9.d dVar, ba.a aVar, x9.l<f> lVar, ga.b bVar, int i10, ea.a aVar2, z9.a aVar3, fa.b bVar2) {
        k.e(dVar, "dataSources");
        k.e(aVar, "dataSink");
        k.e(lVar, "strategies");
        k.e(bVar, "validator");
        k.e(aVar2, "audioStretcher");
        k.e(aVar3, "audioResampler");
        k.e(bVar2, "interpolator");
        this.f25822h = dVar;
        this.f25823i = aVar;
        this.f25824j = bVar;
        this.f25825k = i10;
        this.f25826l = aVar2;
        this.f25827m = aVar3;
        i iVar = new i("TranscodeEngine");
        this.f25817c = iVar;
        p9.i iVar2 = new p9.i(lVar, dVar, i10, false);
        this.f25818d = iVar2;
        g gVar = new g(dVar, iVar2, new e(this));
        this.f25819e = gVar;
        this.f25820f = new h(bVar2, dVar, iVar2, gVar.b());
        this.f25821g = new p9.b(dVar, iVar2, gVar.b());
        iVar.c("Created Tracks, Segments, Timer...");
        aVar.d(0);
        double[] dArr = (double[]) za.i.e(za.i.j(v.y(dVar.f()), d.f25832b));
        if (dArr != null) {
            aVar.f(dArr[0], dArr[1]);
        }
        aVar.c(o9.d.VIDEO, iVar2.b().b());
        aVar.c(o9.d.AUDIO, iVar2.b().a());
        iVar.c("Set up the DataSink...");
    }

    @Override
    public void b() {
        try {
            i.a aVar = ia.i.f14152a;
            this.f25819e.f();
            ia.i.a(q.f14159a);
        } catch (Throwable th) {
            i.a aVar2 = ia.i.f14152a;
            ia.i.a(ia.j.a(th));
        }
        try {
            i.a aVar3 = ia.i.f14152a;
            this.f25823i.a();
            ia.i.a(q.f14159a);
        } catch (Throwable th2) {
            i.a aVar4 = ia.i.f14152a;
            ia.i.a(ia.j.a(th2));
        }
        try {
            i.a aVar5 = ia.i.f14152a;
            this.f25822h.y();
            ia.i.a(q.f14159a);
        } catch (Throwable th3) {
            i.a aVar6 = ia.i.f14152a;
            ia.i.a(ia.j.a(th3));
        }
        try {
            i.a aVar7 = ia.i.f14152a;
            this.f25821g.g();
            ia.i.a(q.f14159a);
        } catch (Throwable th4) {
            i.a aVar8 = ia.i.f14152a;
            ia.i.a(ia.j.a(th4));
        }
    }

    @Override
    public void d(qa.l<? super Double, q> lVar) {
        k.e(lVar, "progress");
        x9.i iVar = this.f25817c;
        iVar.c("transcode(): about to start, durationUs=" + this.f25820f.l() + ", audioUs=" + this.f25820f.i().k() + ", videoUs=" + this.f25820f.i().j());
        long j10 = 0L;
        while (true) {
            p9.e e10 = this.f25819e.e(o9.d.AUDIO);
            p9.e e11 = this.f25819e.e(o9.d.VIDEO);
            boolean z10 = false;
            boolean a10 = (e10 != null ? e10.a() : false) | (e11 != null ? e11.a() : false);
            if (!a10 && !this.f25819e.c()) {
                z10 = true;
            }
            x9.i iVar2 = this.f25817c;
            iVar2.h("transcode(): executed step=" + j10 + " advanced=" + a10 + " completed=" + z10);
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (z10) {
                lVar.a(Double.valueOf(1.0d));
                this.f25823i.stop();
                return;
            } else if (!a10) {
                Thread.sleep(f25814n);
            } else {
                j10++;
                if (j10 % f25815o == 0) {
                    double doubleValue = this.f25820f.k().a().doubleValue();
                    double doubleValue2 = this.f25820f.k().b().doubleValue();
                    x9.i iVar3 = this.f25817c;
                    iVar3.h("transcode(): got progress, video=" + doubleValue2 + " audio=" + doubleValue);
                    lVar.a(Double.valueOf((doubleValue2 + doubleValue) / ((double) this.f25818d.a().getSize())));
                }
            }
        }
    }

    @Override
    public boolean e() {
        if (this.f25824j.a(this.f25818d.b().b(), this.f25818d.b().a())) {
            return true;
        }
        this.f25817c.c("Validator has decided that the input is fine and transcoding is not necessary.");
        return false;
    }

    public final v9.d h(o9.d dVar, int i10, o9.c cVar, MediaFormat mediaFormat) {
        x9.i iVar = this.f25817c;
        iVar.j("createPipeline(" + dVar + ", " + i10 + ", " + cVar + "), format=" + mediaFormat);
        fa.b m10 = this.f25820f.m(dVar, i10);
        List<ca.b> s10 = this.f25822h.n(dVar);
        ca.b a10 = x9.g.a(s10.get(i10), new c(dVar));
        ba.a b10 = x9.g.b(this.f25823i, new b(i10, s10));
        int i11 = w9.b.f25833a[cVar.ordinal()];
        if (i11 == 1) {
            return v9.f.b();
        }
        if (i11 == 2) {
            return v9.f.b();
        }
        if (i11 == 3) {
            return v9.f.c(dVar, a10, b10, m10);
        }
        if (i11 == 4) {
            return v9.f.d(dVar, a10, b10, m10, mediaFormat, this.f25821g, this.f25825k, this.f25826l, this.f25827m);
        }
        throw new ia.f();
    }
}
