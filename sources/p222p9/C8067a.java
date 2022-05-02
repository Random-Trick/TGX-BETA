package p222p9;

import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import p050da.AbstractC3930a;
import p107ha.C5048h;
import p107ha.C5060q;
import p236q9.AbstractC8281a;
import p250r9.AbstractC8400b;
import p250r9.AbstractC8412h;
import p250r9.C8401c;
import p250r9.C8404f;
import p250r9.C8413i;
import p289u9.AbstractC9474h;
import p289u9.AbstractC9475i;
import p316w9.C10007i;
import p346y9.AbstractC10456a;
import pa.AbstractC8077a;
import pa.AbstractC8093q;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;

public final class C8067a extends AbstractC9474h<C8401c, AbstractC8400b, C8413i, AbstractC8412h> implements AbstractC8400b {
    public final C10007i f26283c = new C10007i("AudioEngine(" + f26281l.getAndIncrement() + ')');
    public final C8067a f26284d = this;
    public final C8076e f26285e = new C8076e();
    public MediaFormat f26286f;
    public C8074c f26287g;
    public AbstractC8281a f26288h;
    public final AbstractC3930a f26289i;
    public final AbstractC10456a f26290j;
    public final MediaFormat f26291k;
    public static final C8068a f26282m = new C8068a(null);
    public static final AtomicInteger f26281l = new AtomicInteger(0);

    public static final class C8068a {
        public C8068a() {
        }

        public C8068a(C8294g gVar) {
            this();
        }
    }

    public static final class C8069b extends AbstractC8299l implements AbstractC8093q<ShortBuffer, Long, Double, AbstractC9475i.C9477b<C8413i>> {
        public final ByteBuffer f26292M;
        public final int f26293N;
        public final ShortBuffer f26295c;

        public C8069b(ShortBuffer shortBuffer, ByteBuffer byteBuffer, int i) {
            super(3);
            this.f26295c = shortBuffer;
            this.f26292M = byteBuffer;
            this.f26293N = i;
        }

        @Override
        public AbstractC9475i.C9477b<C8413i> mo13607c(ShortBuffer shortBuffer, Long l, Double d) {
            return m13627f(shortBuffer, l.longValue(), d.doubleValue());
        }

        public final AbstractC9475i.C9477b<C8413i> m13627f(ShortBuffer shortBuffer, long j, double d) {
            C8298k.m12933e(shortBuffer, "inBuffer");
            int remaining = this.f26295c.remaining();
            int remaining2 = shortBuffer.remaining();
            double d2 = remaining2;
            double ceil = Math.ceil(d2 * d);
            C8067a aVar = C8067a.this;
            double b = C8067a.m13637q(C8067a.this).mo12950b((int) ceil) * aVar.m13628z(aVar.f26291k);
            C8067a aVar2 = C8067a.this;
            double ceil2 = Math.ceil(b / aVar2.m13628z(C8067a.m13638p(aVar2)));
            double d3 = remaining;
            if (ceil2 > d3) {
                remaining2 = (int) Math.floor(d3 / (ceil2 / d2));
            }
            shortBuffer.limit(shortBuffer.position() + remaining2);
            int ceil3 = (int) Math.ceil(remaining2 * d);
            ShortBuffer a = C8067a.this.f26285e.m13608a("stretch", ceil3);
            AbstractC3930a aVar3 = C8067a.this.f26289i;
            C8067a aVar4 = C8067a.this;
            aVar3.mo29596a(shortBuffer, a, aVar4.m13629y(C8067a.m13638p(aVar4)));
            a.flip();
            ShortBuffer a2 = C8067a.this.f26285e.m13608a("remix", C8067a.m13637q(C8067a.this).mo12950b(ceil3));
            C8067a.m13637q(C8067a.this).mo12951a(a, a2);
            a2.flip();
            AbstractC10456a aVar5 = C8067a.this.f26290j;
            C8067a aVar6 = C8067a.this;
            int z = aVar6.m13628z(C8067a.m13638p(aVar6));
            ShortBuffer shortBuffer2 = this.f26295c;
            C8067a aVar7 = C8067a.this;
            int z2 = aVar7.m13628z(aVar7.f26291k);
            C8067a aVar8 = C8067a.this;
            aVar5.mo5080a(a2, z, shortBuffer2, z2, aVar8.m13629y(aVar8.f26291k));
            this.f26295c.flip();
            this.f26292M.clear();
            this.f26292M.limit(this.f26295c.limit() * 2);
            this.f26292M.position(this.f26295c.position() * 2);
            return new AbstractC9475i.C9477b<>(new C8413i(this.f26292M, this.f26293N, j));
        }
    }

    public static final class C8070c extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public final C8401c f26296b;

        public C8070c(C8401c cVar) {
            super(0);
            this.f26296b = cVar;
        }

        @Override
        public C5060q mo4925b() {
            m13626f();
            return C5060q.f17066a;
        }

        public final void m13626f() {
            this.f26296b.m12571b().mo568a(Boolean.FALSE);
        }
    }

    public C8067a(AbstractC3930a aVar, AbstractC10456a aVar2, MediaFormat mediaFormat) {
        C8298k.m12933e(aVar, "stretcher");
        C8298k.m12933e(aVar2, "resampler");
        C8298k.m12933e(mediaFormat, "targetFormat");
        this.f26289i = aVar;
        this.f26290j = aVar2;
        this.f26291k = mediaFormat;
    }

    public static final MediaFormat m13638p(C8067a aVar) {
        MediaFormat mediaFormat = aVar.f26286f;
        if (mediaFormat == null) {
            C8298k.m12924n("rawFormat");
        }
        return mediaFormat;
    }

    public static final AbstractC8281a m13637q(C8067a aVar) {
        AbstractC8281a aVar2 = aVar.f26288h;
        if (aVar2 == null) {
            C8298k.m12924n("remixer");
        }
        return aVar2;
    }

    @Override
    public void mo5859f(MediaFormat mediaFormat) {
        C8298k.m12933e(mediaFormat, "rawFormat");
        C10007i iVar = this.f26283c;
        iVar.m6267c("handleRawFormat(" + mediaFormat + ')');
        this.f26286f = mediaFormat;
        this.f26288h = AbstractC8281a.f26765a.m12952a(m13629y(mediaFormat), m13629y(this.f26291k));
        this.f26287g = new C8074c(m13628z(mediaFormat), m13629y(mediaFormat));
    }

    @Override
    public Surface mo5857h(MediaFormat mediaFormat) {
        C8298k.m12933e(mediaFormat, "sourceFormat");
        return null;
    }

    @Override
    public AbstractC9475i<C8413i> mo8561k() {
        C8074c cVar = this.f26287g;
        if (cVar == null) {
            C8298k.m12924n("chunks");
        }
        if (cVar.m13613d()) {
            this.f26283c.m6267c("drain(): no chunks, waiting...");
            return AbstractC9475i.C9479d.f30718a;
        }
        C5048h<ByteBuffer, Integer> c = ((AbstractC8412h) m8580j()).mo12547c();
        if (c != null) {
            ByteBuffer a = c.m24197a();
            int intValue = c.m24196b().intValue();
            ShortBuffer asShortBuffer = a.asShortBuffer();
            C8074c cVar2 = this.f26287g;
            if (cVar2 == null) {
                C8298k.m12924n("chunks");
            }
            return (AbstractC9475i) cVar2.m13616a(new AbstractC9475i.C9476a(new C8413i(a, intValue, 0L)), new C8069b(asShortBuffer, a, intValue));
        }
        this.f26283c.m6267c("drain(): no next buffer, waiting...");
        return AbstractC9475i.C9479d.f30718a;
    }

    public void mo8560l(C8401c cVar) {
        C8298k.m12933e(cVar, "data");
        C8404f fVar = (C8404f) (!(cVar instanceof C8404f) ? null : cVar);
        double d = fVar != null ? fVar.m12565d() : 1.0d;
        C8074c cVar2 = this.f26287g;
        if (cVar2 == null) {
            C8298k.m12924n("chunks");
        }
        ShortBuffer asShortBuffer = cVar.m12572a().asShortBuffer();
        C8298k.m12934d(asShortBuffer, "data.buffer.asShortBuffer()");
        cVar2.m13615b(asShortBuffer, cVar.m12570c(), d, new C8070c(cVar));
    }

    public void mo8559m(C8401c cVar) {
        C8298k.m12933e(cVar, "data");
        this.f26283c.m6267c("enqueueEos()");
        cVar.m12571b().mo568a(Boolean.FALSE);
        C8074c cVar2 = this.f26287g;
        if (cVar2 == null) {
            C8298k.m12924n("chunks");
        }
        cVar2.m13614c();
    }

    public C8067a mo5860e() {
        return this.f26284d;
    }

    public final int m13629y(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("channel-count");
    }

    public final int m13628z(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("sample-rate");
    }
}
