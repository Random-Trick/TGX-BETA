package p303v9;

import android.media.MediaFormat;
import ba.AbstractC1296b;
import ca.AbstractC2055f;
import java.util.List;
import p011aa.AbstractC0237a;
import p050da.AbstractC3930a;
import p065ea.AbstractC4177b;
import p079fa.AbstractC4333b;
import p107ha.C5046f;
import p107ha.C5049i;
import p107ha.C5052j;
import p107ha.C5060q;
import p123ia.C5304n;
import p123ia.C5312v;
import p192n9.EnumC7311c;
import p192n9.EnumC7313d;
import p205o9.C7795b;
import p205o9.C7802d;
import p205o9.C7803e;
import p205o9.C7805g;
import p205o9.C7806h;
import p205o9.C7811i;
import p289u9.C9464d;
import p289u9.C9469f;
import p316w9.AbstractC10012l;
import p316w9.C10005g;
import p316w9.C10007i;
import p346y9.AbstractC10456a;
import p347ya.C10471i;
import pa.AbstractC8077a;
import pa.AbstractC8088l;
import pa.AbstractC8094r;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8297j;
import qa.C8298k;

public final class C9885a extends AbstractC9897d {
    public final C10007i f32172c;
    public final C7811i f32173d;
    public final C7805g f32174e;
    public final C7806h f32175f;
    public final C7795b f32176g;
    public final C7802d f32177h;
    public final AbstractC0237a f32178i;
    public final AbstractC4333b f32179j;
    public final int f32180k;
    public final AbstractC3930a f32181l;
    public final AbstractC10456a f32182m;
    public static final C9886a f32171p = new C9886a(null);
    public static final long f32169n = 10;
    public static final long f32170o = 10;

    public static final class C9886a {
        public C9886a() {
        }

        public C9886a(C8294g gVar) {
            this();
        }
    }

    public static final class C9887b extends AbstractC8299l implements AbstractC8077a<Boolean> {
        public final int f32183b;
        public final List f32184c;

        public C9887b(int i, List list) {
            super(0);
            this.f32183b = i;
            this.f32184c = list;
        }

        @Override
        public Boolean mo4925b() {
            return Boolean.valueOf(m6687f());
        }

        public final boolean m6687f() {
            return this.f32183b < C5304n.m23366g(this.f32184c);
        }
    }

    public static final class C9888c extends AbstractC8299l implements AbstractC8077a<Boolean> {
        public final EnumC7313d f32186c;

        public C9888c(EnumC7313d dVar) {
            super(0);
            this.f32186c = dVar;
        }

        @Override
        public Boolean mo4925b() {
            return Boolean.valueOf(m6686f());
        }

        public final boolean m6686f() {
            return C9885a.this.f32175f.m15014j().mo6239d(this.f32186c).longValue() > C9885a.this.f32175f.m15012l() + 100;
        }
    }

    public static final class C9889d extends AbstractC8299l implements AbstractC8088l<AbstractC1296b, double[]> {
        public static final C9889d f32187b = new C9889d();

        public C9889d() {
            super(1);
        }

        public final double[] mo568a(AbstractC1296b bVar) {
            C8298k.m12933e(bVar, "it");
            return bVar.mo6280o();
        }
    }

    public static final class C9890e extends C8297j implements AbstractC8094r<EnumC7313d, Integer, EnumC7311c, MediaFormat, C9464d> {
        public C9890e(C9885a aVar) {
            super(4, aVar, C9885a.class, "createPipeline", "createPipeline(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", 0);
        }

        @Override
        public C9464d mo6684c(EnumC7313d dVar, Integer num, EnumC7311c cVar, MediaFormat mediaFormat) {
            return m6683m(dVar, num.intValue(), cVar, mediaFormat);
        }

        public final C9464d m6683m(EnumC7313d dVar, int i, EnumC7311c cVar, MediaFormat mediaFormat) {
            C8298k.m12933e(dVar, "p1");
            C8298k.m12933e(cVar, "p3");
            C8298k.m12933e(mediaFormat, "p4");
            return ((C9885a) this.f26774b).m6688h(dVar, i, cVar, mediaFormat);
        }
    }

    public C9885a(C7802d dVar, AbstractC0237a aVar, AbstractC10012l<AbstractC2055f> lVar, AbstractC4333b bVar, int i, AbstractC3930a aVar2, AbstractC10456a aVar3, AbstractC4177b bVar2) {
        C8298k.m12933e(dVar, "dataSources");
        C8298k.m12933e(aVar, "dataSink");
        C8298k.m12933e(lVar, "strategies");
        C8298k.m12933e(bVar, "validator");
        C8298k.m12933e(aVar2, "audioStretcher");
        C8298k.m12933e(aVar3, "audioResampler");
        C8298k.m12933e(bVar2, "interpolator");
        this.f32177h = dVar;
        this.f32178i = aVar;
        this.f32179j = bVar;
        this.f32180k = i;
        this.f32181l = aVar2;
        this.f32182m = aVar3;
        C10007i iVar = new C10007i("TranscodeEngine");
        this.f32172c = iVar;
        C7811i iVar2 = new C7811i(lVar, dVar, i, false);
        this.f32173d = iVar2;
        C7805g gVar = new C7805g(dVar, iVar2, new C9890e(this));
        this.f32174e = gVar;
        this.f32175f = new C7806h(bVar2, dVar, iVar2, gVar.m15029b());
        this.f32176g = new C7795b(dVar, iVar2, gVar.m15029b());
        iVar.m6267c("Created Tracks, Segments, Timer...");
        aVar.mo6275d(0);
        double[] dArr = (double[]) C10471i.m5065e(C10471i.m5060j(C5312v.m23323y(dVar.m15047h()), C9889d.f32187b));
        if (dArr != null) {
            aVar.mo6273f(dArr[0], dArr[1]);
        }
        aVar.mo6276c(EnumC7313d.VIDEO, iVar2.m14989b().mo6240b());
        aVar.mo6276c(EnumC7313d.AUDIO, iVar2.m14989b().mo6241a());
        iVar.m6267c("Set up the DataSink...");
    }

    @Override
    public void mo6676b() {
        try {
            C5049i.C5050a aVar = C5049i.f17059a;
            this.f32174e.m15025f();
            C5049i.m24193a(C5060q.f17066a);
        } catch (Throwable th) {
            C5049i.C5050a aVar2 = C5049i.f17059a;
            C5049i.m24193a(C5052j.m24191a(th));
        }
        try {
            C5049i.C5050a aVar3 = C5049i.f17059a;
            this.f32178i.mo6278a();
            C5049i.m24193a(C5060q.f17066a);
        } catch (Throwable th2) {
            C5049i.C5050a aVar4 = C5049i.f17059a;
            C5049i.m24193a(C5052j.m24191a(th2));
        }
        try {
            C5049i.C5050a aVar5 = C5049i.f17059a;
            this.f32177h.m15037y();
            C5049i.m24193a(C5060q.f17066a);
        } catch (Throwable th3) {
            C5049i.C5050a aVar6 = C5049i.f17059a;
            C5049i.m24193a(C5052j.m24191a(th3));
        }
        try {
            C5049i.C5050a aVar7 = C5049i.f17059a;
            this.f32176g.m15070g();
            C5049i.m24193a(C5060q.f17066a);
        } catch (Throwable th4) {
            C5049i.C5050a aVar8 = C5049i.f17059a;
            C5049i.m24193a(C5052j.m24191a(th4));
        }
    }

    @Override
    public void mo6674d(AbstractC8088l<? super Double, C5060q> lVar) {
        C8298k.m12933e(lVar, "progress");
        C10007i iVar = this.f32172c;
        iVar.m6267c("transcode(): about to start, durationUs=" + this.f32175f.m15012l() + ", audioUs=" + this.f32175f.m15015i().mo6234n() + ", videoUs=" + this.f32175f.m15015i().mo6235l());
        long j = 0L;
        while (true) {
            C7803e e = this.f32174e.m15026e(EnumC7313d.AUDIO);
            C7803e e2 = this.f32174e.m15026e(EnumC7313d.VIDEO);
            boolean z = false;
            boolean a = (e != null ? e.m15035a() : false) | (e2 != null ? e2.m15035a() : false);
            if (!a && !this.f32174e.m15028c()) {
                z = true;
            }
            C10007i iVar2 = this.f32172c;
            iVar2.m6262h("transcode(): executed step=" + j + " advanced=" + a + " completed=" + z);
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (z) {
                lVar.mo568a(Double.valueOf(1.0d));
                this.f32178i.stop();
                return;
            } else if (!a) {
                Thread.sleep(f32169n);
            } else {
                j++;
                if (j % f32170o == 0) {
                    double doubleValue = this.f32175f.m15013k().mo6241a().doubleValue();
                    double doubleValue2 = this.f32175f.m15013k().mo6240b().doubleValue();
                    C10007i iVar3 = this.f32172c;
                    iVar3.m6262h("transcode(): got progress, video=" + doubleValue2 + " audio=" + doubleValue);
                    lVar.mo568a(Double.valueOf((doubleValue2 + doubleValue) / ((double) this.f32173d.m14990a().getSize())));
                }
            }
        }
    }

    @Override
    public boolean mo6673e() {
        if (this.f32179j.mo28264a(this.f32173d.m14989b().mo6240b(), this.f32173d.m14989b().mo6241a())) {
            return true;
        }
        this.f32172c.m6267c("Validator has decided that the input is fine and transcoding is not necessary.");
        return false;
    }

    public final C9464d m6688h(EnumC7313d dVar, int i, EnumC7311c cVar, MediaFormat mediaFormat) {
        C10007i iVar = this.f32172c;
        iVar.m6260j("createPipeline(" + dVar + ", " + i + ", " + cVar + "), format=" + mediaFormat);
        AbstractC4177b m = this.f32175f.m15011m(dVar, i);
        List<AbstractC1296b> s = this.f32177h.mo6239d(dVar);
        AbstractC1296b a = C10005g.m6272a(s.get(i), new C9888c(dVar));
        AbstractC0237a b = C10005g.m6271b(this.f32178i, new C9887b(i, s));
        int i2 = C9891b.f32188a[cVar.ordinal()];
        if (i2 == 1) {
            return C9469f.m8568b();
        }
        if (i2 == 2) {
            return C9469f.m8568b();
        }
        if (i2 == 3) {
            return C9469f.m8567c(dVar, a, b, m);
        }
        if (i2 == 4) {
            return C9469f.m8566d(dVar, a, b, m, mediaFormat, this.f32176g, this.f32180k, this.f32181l, this.f32182m);
        }
        throw new C5046f();
    }
}
