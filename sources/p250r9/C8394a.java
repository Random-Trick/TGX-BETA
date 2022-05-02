package p250r9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import ba.AbstractC1296b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import p107ha.AbstractC5044d;
import p107ha.C5045e;
import p107ha.C5048h;
import p107ha.C5054l;
import p107ha.C5060q;
import p192n9.C7314e;
import p265s9.AbstractC8703c;
import p265s9.C8704d;
import p276t9.C9057a;
import p277ta.AbstractC9061b;
import p277ta.AbstractC9062c;
import p277ta.C9060a;
import p289u9.AbstractC9474h;
import p289u9.AbstractC9475i;
import p316w9.AbstractC10012l;
import p316w9.C10007i;
import p316w9.C10014m;
import p332xa.AbstractC10175g;
import pa.AbstractC8077a;
import pa.AbstractC8088l;
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;
import qa.C8301n;
import qa.C8307t;

public final class C8394a extends AbstractC9474h<C8704d, AbstractC8703c, C8401c, AbstractC8400b> implements AbstractC8703c {
    public final C10007i f27263c;
    public final MediaCodec f27265e;
    public final C8402d f27268h;
    public final MediaFormat f27271k;
    public static final AbstractC10175g[] f27260l = {C8307t.m12917d(new C8301n(C8394a.class, "dequeuedInputs", "getDequeuedInputs()I", 0)), C8307t.m12917d(new C8301n(C8394a.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0))};
    public static final C8397c f27262n = new C8397c(null);
    public static final AbstractC10012l<AtomicInteger> f27261m = C10014m.m6221c(new AtomicInteger(0), new AtomicInteger(0));
    public final C8394a f27264d = this;
    public final AbstractC5044d f27266f = C5045e.m24198a(new C8398d());
    public MediaCodec.BufferInfo f27267g = new MediaCodec.BufferInfo();
    public final AbstractC9062c f27269i = new C8395a(0, 0, this);
    public final AbstractC9062c f27270j = new C8396b(0, 0, this);

    public static final class C8395a extends AbstractC9061b<Integer> {
        public final Object f27272b;
        public final C8394a f27273c;

        public C8395a(Object obj, Object obj2, C8394a aVar) {
            super(obj2);
            this.f27272b = obj;
            this.f27273c = aVar;
        }

        @Override
        public void mo10584c(AbstractC10175g<?> gVar, Integer num, Integer num2) {
            C8298k.m12933e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f27273c.m12576y();
        }
    }

    public static final class C8396b extends AbstractC9061b<Integer> {
        public final Object f27274b;
        public final C8394a f27275c;

        public C8396b(Object obj, Object obj2, C8394a aVar) {
            super(obj2);
            this.f27274b = obj;
            this.f27275c = aVar;
        }

        @Override
        public void mo10584c(AbstractC10175g<?> gVar, Integer num, Integer num2) {
            C8298k.m12933e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f27275c.m12576y();
        }
    }

    public static final class C8397c {
        public C8397c() {
        }

        public C8397c(C8294g gVar) {
            this();
        }
    }

    public static final class C8398d extends AbstractC8299l implements AbstractC8077a<C9057a> {
        public C8398d() {
            super(0);
        }

        public final C9057a mo4925b() {
            return new C9057a(C8394a.this.f27265e);
        }
    }

    public static final class C8399e extends AbstractC8299l implements AbstractC8088l<Boolean, C5060q> {
        public final int f27278c;

        public C8399e(int i) {
            super(1);
            this.f27278c = i;
        }

        @Override
        public C5060q mo568a(Boolean bool) {
            m12573f(bool.booleanValue());
            return C5060q.f17066a;
        }

        public final void m12573f(boolean z) {
            C8394a.this.f27265e.releaseOutputBuffer(this.f27278c, z);
            C8394a aVar = C8394a.this;
            aVar.m12588A(aVar.m12578w() - 1);
        }
    }

    public C8394a(MediaFormat mediaFormat, boolean z) {
        C8298k.m12933e(mediaFormat, "format");
        this.f27271k = mediaFormat;
        this.f27263c = new C10007i("Decoder(" + C7314e.m17063a(mediaFormat) + ',' + f27261m.mo6239d(C7314e.m17063a(mediaFormat)).getAndIncrement() + ')');
        String string = mediaFormat.getString("mime");
        C8298k.m12935c(string);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
        C8298k.m12934d(createDecoderByType, "createDecoderByType(form…(MediaFormat.KEY_MIME)!!)");
        this.f27265e = createDecoderByType;
        this.f27268h = new C8402d(z);
        C9060a aVar = C9060a.f29041a;
    }

    public final void m12588A(int i) {
        this.f27270j.mo10581b(this, f27260l[1], Integer.valueOf(i));
    }

    @Override
    public void mo5861a() {
        C10007i iVar = this.f27263c;
        iVar.m6267c("release(): releasing codec. dequeuedInputs=" + m12579v() + " dequeuedOutputs=" + m12578w());
        this.f27265e.stop();
        this.f27265e.release();
    }

    @Override
    public C5048h<ByteBuffer, Integer> mo11713c() {
        int dequeueInputBuffer = this.f27265e.dequeueInputBuffer(0L);
        if (dequeueInputBuffer >= 0) {
            m12575z(m12579v() + 1);
            return C5054l.m24189a(m12581t().m10595a(dequeueInputBuffer), Integer.valueOf(dequeueInputBuffer));
        }
        C10007i iVar = this.f27263c;
        iVar.m6267c("buffer() failed. dequeuedInputs=" + m12579v() + " dequeuedOutputs=" + m12578w());
        return null;
    }

    @Override
    public AbstractC9475i<C8401c> mo8561k() {
        AbstractC9475i<C8401c> iVar;
        int dequeueOutputBuffer = this.f27265e.dequeueOutputBuffer(this.f27267g, 0L);
        if (dequeueOutputBuffer == -3) {
            this.f27263c.m6267c("drain(): got INFO_OUTPUT_BUFFERS_CHANGED, retrying.");
            m12581t().m10593c();
            return AbstractC9475i.C9478c.f30717a;
        } else if (dequeueOutputBuffer == -2) {
            C10007i iVar2 = this.f27263c;
            iVar2.m6267c("drain(): got INFO_OUTPUT_FORMAT_CHANGED, handling format and retrying. format=" + this.f27265e.getOutputFormat());
            MediaFormat outputFormat = this.f27265e.getOutputFormat();
            C8298k.m12934d(outputFormat, "codec.outputFormat");
            ((AbstractC8400b) m8580j()).mo5859f(outputFormat);
            return AbstractC9475i.C9478c.f30717a;
        } else if (dequeueOutputBuffer != -1) {
            MediaCodec.BufferInfo bufferInfo = this.f27267g;
            boolean z = (bufferInfo.flags & 4) != 0;
            Long d = z ? 0L : this.f27268h.m12566d(bufferInfo.presentationTimeUs);
            if (d != null) {
                m12588A(m12578w() + 1);
                ByteBuffer b = m12581t().m10594b(dequeueOutputBuffer);
                C8298k.m12934d(b, "buffers.getOutputBuffer(result)");
                C8401c cVar = new C8401c(b, d.longValue(), new C8399e(dequeueOutputBuffer));
                iVar = z ? new AbstractC9475i.C9476a<>(cVar) : new AbstractC9475i.C9477b<>(cVar);
            } else {
                this.f27265e.releaseOutputBuffer(dequeueOutputBuffer, false);
                iVar = AbstractC9475i.C9479d.f30718a;
            }
            C10007i iVar3 = this.f27263c;
            iVar3.m6262h("drain(): returning " + iVar);
            return iVar;
        } else {
            this.f27263c.m6267c("drain(): got INFO_TRY_AGAIN_LATER, waiting.");
            return AbstractC9475i.C9479d.f30718a;
        }
    }

    public void mo8560l(C8704d dVar) {
        C8298k.m12933e(dVar, "data");
        m12575z(m12579v() - 1);
        AbstractC1296b.C1297a a = dVar.m11712a();
        this.f27265e.queueInputBuffer(dVar.m11711b(), a.f4675a.position(), a.f4675a.remaining(), a.f4677c, a.f4676b ? 1 : 0);
        this.f27268h.m12567c(a.f4677c, a.f4678d);
    }

    public void mo8559m(C8704d dVar) {
        C8298k.m12933e(dVar, "data");
        this.f27263c.m6267c("enqueueEos()!");
        m12575z(m12579v() - 1);
        this.f27265e.queueInputBuffer(dVar.m11709d(), 0, 0, 0L, 4);
    }

    public final C9057a m12581t() {
        return (C9057a) this.f27266f.getValue();
    }

    public C8394a mo5860e() {
        return this.f27264d;
    }

    public final int m12579v() {
        return ((Number) this.f27269i.mo10582a(this, f27260l[0])).intValue();
    }

    public final int m12578w() {
        return ((Number) this.f27270j.mo10582a(this, f27260l[1])).intValue();
    }

    public void mo5856i(AbstractC8400b bVar) {
        C8298k.m12933e(bVar, "next");
        super.mo5856i(bVar);
        this.f27263c.m6267c("initialize()");
        this.f27265e.configure(this.f27271k, bVar.mo5857h(this.f27271k), (MediaCrypto) null, 0);
        this.f27265e.start();
    }

    public final void m12576y() {
    }

    public final void m12575z(int i) {
        this.f27269i.mo10581b(this, f27260l[0], Integer.valueOf(i));
    }
}
