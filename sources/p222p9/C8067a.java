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
    public final C10007i f26280c = new C10007i("AudioEngine(" + f26278l.getAndIncrement() + ')');
    public final C8067a f26281d = this;
    public final C8076e f26282e = new C8076e();
    public MediaFormat f26283f;
    public C8074c f26284g;
    public AbstractC8281a f26285h;
    public final AbstractC3930a f26286i;
    public final AbstractC10456a f26287j;
    public final MediaFormat f26288k;
    public static final C8068a f26279m = new C8068a(null);
    public static final AtomicInteger f26278l = new AtomicInteger(0);

    public static final class C8068a {
        public C8068a() {
        }

        public C8068a(C8294g gVar) {
            this();
        }
    }

    public static final class C8069b extends AbstractC8299l implements AbstractC8093q<ShortBuffer, Long, Double, AbstractC9475i.C9477b<C8413i>> {
        public final ByteBuffer f26289M;
        public final int f26290N;
        public final ShortBuffer f26292c;

        public C8069b(ShortBuffer shortBuffer, ByteBuffer byteBuffer, int i) {
            super(3);
            this.f26292c = shortBuffer;
            this.f26289M = byteBuffer;
            this.f26290N = i;
        }

        @Override
        public AbstractC9475i.C9477b<C8413i> mo13608c(ShortBuffer shortBuffer, Long l, Double d) {
            return m13628f(shortBuffer, l.longValue(), d.doubleValue());
        }

        public final AbstractC9475i.C9477b<C8413i> m13628f(ShortBuffer shortBuffer, long j, double d) {
            C8298k.m12934e(shortBuffer, "inBuffer");
            int remaining = this.f26292c.remaining();
            int remaining2 = shortBuffer.remaining();
            double d2 = remaining2;
            double ceil = Math.ceil(d2 * d);
            C8067a aVar = C8067a.this;
            double b = C8067a.m13638q(C8067a.this).mo12951b((int) ceil) * aVar.m13629z(aVar.f26288k);
            C8067a aVar2 = C8067a.this;
            double ceil2 = Math.ceil(b / aVar2.m13629z(C8067a.m13639p(aVar2)));
            double d3 = remaining;
            if (ceil2 > d3) {
                remaining2 = (int) Math.floor(d3 / (ceil2 / d2));
            }
            shortBuffer.limit(shortBuffer.position() + remaining2);
            int ceil3 = (int) Math.ceil(remaining2 * d);
            ShortBuffer a = C8067a.this.f26282e.m13609a("stretch", ceil3);
            AbstractC3930a aVar3 = C8067a.this.f26286i;
            C8067a aVar4 = C8067a.this;
            aVar3.mo29594a(shortBuffer, a, aVar4.m13630y(C8067a.m13639p(aVar4)));
            a.flip();
            ShortBuffer a2 = C8067a.this.f26282e.m13609a("remix", C8067a.m13638q(C8067a.this).mo12951b(ceil3));
            C8067a.m13638q(C8067a.this).mo12952a(a, a2);
            a2.flip();
            AbstractC10456a aVar5 = C8067a.this.f26287j;
            C8067a aVar6 = C8067a.this;
            int z = aVar6.m13629z(C8067a.m13639p(aVar6));
            ShortBuffer shortBuffer2 = this.f26292c;
            C8067a aVar7 = C8067a.this;
            int z2 = aVar7.m13629z(aVar7.f26288k);
            C8067a aVar8 = C8067a.this;
            aVar5.mo5080a(a2, z, shortBuffer2, z2, aVar8.m13630y(aVar8.f26288k));
            this.f26292c.flip();
            this.f26289M.clear();
            this.f26289M.limit(this.f26292c.limit() * 2);
            this.f26289M.position(this.f26292c.position() * 2);
            return new AbstractC9475i.C9477b<>(new C8413i(this.f26289M, this.f26290N, j));
        }
    }

    public static final class C8070c extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public final C8401c f26293b;

        public C8070c(C8401c cVar) {
            super(0);
            this.f26293b = cVar;
        }

        @Override
        public C5060q mo4925b() {
            m13627f();
            return C5060q.f17066a;
        }

        public final void m13627f() {
            this.f26293b.m12572b().mo568a(Boolean.FALSE);
        }
    }

    public C8067a(AbstractC3930a aVar, AbstractC10456a aVar2, MediaFormat mediaFormat) {
        C8298k.m12934e(aVar, "stretcher");
        C8298k.m12934e(aVar2, "resampler");
        C8298k.m12934e(mediaFormat, "targetFormat");
        this.f26286i = aVar;
        this.f26287j = aVar2;
        this.f26288k = mediaFormat;
    }

    public static final MediaFormat m13639p(C8067a aVar) {
        MediaFormat mediaFormat = aVar.f26283f;
        if (mediaFormat == null) {
            C8298k.m12925n("rawFormat");
        }
        return mediaFormat;
    }

    public static final AbstractC8281a m13638q(C8067a aVar) {
        AbstractC8281a aVar2 = aVar.f26285h;
        if (aVar2 == null) {
            C8298k.m12925n("remixer");
        }
        return aVar2;
    }

    @Override
    public void mo5859f(MediaFormat mediaFormat) {
        C8298k.m12934e(mediaFormat, "rawFormat");
        C10007i iVar = this.f26280c;
        iVar.m6267c("handleRawFormat(" + mediaFormat + ')');
        this.f26283f = mediaFormat;
        this.f26285h = AbstractC8281a.f26762a.m12953a(m13630y(mediaFormat), m13630y(this.f26288k));
        this.f26284g = new C8074c(m13629z(mediaFormat), m13630y(mediaFormat));
    }

    @Override
    public Surface mo5857h(MediaFormat mediaFormat) {
        C8298k.m12934e(mediaFormat, "sourceFormat");
        return null;
    }

    @Override
    public AbstractC9475i<C8413i> mo8561k() {
        C8074c cVar = this.f26284g;
        if (cVar == null) {
            C8298k.m12925n("chunks");
        }
        if (cVar.m13614d()) {
            this.f26280c.m6267c("drain(): no chunks, waiting...");
            return AbstractC9475i.C9479d.f30715a;
        }
        C5048h<ByteBuffer, Integer> c = ((AbstractC8412h) m8580j()).mo12548c();
        if (c != null) {
            ByteBuffer a = c.m24196a();
            int intValue = c.m24195b().intValue();
            ShortBuffer asShortBuffer = a.asShortBuffer();
            C8074c cVar2 = this.f26284g;
            if (cVar2 == null) {
                C8298k.m12925n("chunks");
            }
            return (AbstractC9475i) cVar2.m13617a(new AbstractC9475i.C9476a(new C8413i(a, intValue, 0L)), new C8069b(asShortBuffer, a, intValue));
        }
        this.f26280c.m6267c("drain(): no next buffer, waiting...");
        return AbstractC9475i.C9479d.f30715a;
    }

    public void mo8560l(C8401c cVar) {
        C8298k.m12934e(cVar, "data");
        C8404f fVar = (C8404f) (!(cVar instanceof C8404f) ? null : cVar);
        double d = fVar != null ? fVar.m12566d() : 1.0d;
        C8074c cVar2 = this.f26284g;
        if (cVar2 == null) {
            C8298k.m12925n("chunks");
        }
        ShortBuffer asShortBuffer = cVar.m12573a().asShortBuffer();
        C8298k.m12935d(asShortBuffer, "data.buffer.asShortBuffer()");
        cVar2.m13616b(asShortBuffer, cVar.m12571c(), d, new C8070c(cVar));
    }

    public void mo8559m(C8401c cVar) {
        C8298k.m12934e(cVar, "data");
        this.f26280c.m6267c("enqueueEos()");
        cVar.m12572b().mo568a(Boolean.FALSE);
        C8074c cVar2 = this.f26284g;
        if (cVar2 == null) {
            C8298k.m12925n("chunks");
        }
        cVar2.m13615c();
    }

    public C8067a mo5860e() {
        return this.f26281d;
    }

    public final int m13630y(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("channel-count");
    }

    public final int m13629z(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("sample-rate");
    }
}
