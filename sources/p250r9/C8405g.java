package p250r9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import p107ha.AbstractC5044d;
import p107ha.C5045e;
import p107ha.C5048h;
import p107ha.C5054l;
import p107ha.C5060q;
import p192n9.EnumC7313d;
import p205o9.C7795b;
import p265s9.AbstractC8707g;
import p265s9.C8708h;
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
import qa.AbstractC8299l;
import qa.C8294g;
import qa.C8298k;
import qa.C8301n;
import qa.C8307t;

public final class C8405g extends AbstractC9474h<C8413i, AbstractC8412h, C8708h, AbstractC8707g> implements AbstractC8412h {
    public final EnumC7313d f27298c;
    public final C10007i f27299d;
    public final AbstractC9062c f27300e;
    public final AbstractC9062c f27301f;
    public final C8405g f27302g;
    public final AbstractC5044d f27303h;
    public MediaCodec.BufferInfo f27304i;
    public boolean f27305j;
    public final MediaCodec f27306k;
    public final Surface f27307l;
    public final boolean f27308m;
    public static final AbstractC10175g[] f27295n = {C8307t.m12917d(new C8301n(C8405g.class, "dequeuedInputs", "getDequeuedInputs()I", 0)), C8307t.m12917d(new C8301n(C8405g.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0))};
    public static final C8408c f27297p = new C8408c(null);
    public static final AbstractC10012l<AtomicInteger> f27296o = C10014m.m6221c(new AtomicInteger(0), new AtomicInteger(0));

    public static final class C8406a extends AbstractC9061b<Integer> {
        public final Object f27309b;
        public final C8405g f27310c;

        public C8406a(Object obj, Object obj2, C8405g gVar) {
            super(obj2);
            this.f27309b = obj;
            this.f27310c = gVar;
        }

        @Override
        public void mo10584c(AbstractC10175g<?> gVar, Integer num, Integer num2) {
            C8298k.m12933e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f27310c.m12554x();
        }
    }

    public static final class C8407b extends AbstractC9061b<Integer> {
        public final Object f27311b;
        public final C8405g f27312c;

        public C8407b(Object obj, Object obj2, C8405g gVar) {
            super(obj2);
            this.f27311b = obj;
            this.f27312c = gVar;
        }

        @Override
        public void mo10584c(AbstractC10175g<?> gVar, Integer num, Integer num2) {
            C8298k.m12933e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f27312c.m12554x();
        }
    }

    public static final class C8408c {
        public C8408c() {
        }

        public C8408c(C8294g gVar) {
            this();
        }
    }

    public static final class C8409d extends AbstractC8299l implements AbstractC8077a<C9057a> {
        public C8409d() {
            super(0);
        }

        public final C9057a mo4925b() {
            return new C9057a(C8405g.this.f27306k);
        }
    }

    public static final class C8410e extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public static final C8410e f27314b = new C8410e();

        public C8410e() {
            super(0);
        }

        @Override
        public C5060q mo4925b() {
            m12550f();
            return C5060q.f17066a;
        }

        public final void m12550f() {
        }
    }

    public static final class C8411f extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public final int f27316c;

        public C8411f(int i) {
            super(0);
            this.f27316c = i;
        }

        @Override
        public C5060q mo4925b() {
            m12549f();
            return C5060q.f17066a;
        }

        public final void m12549f() {
            C8405g.this.f27306k.releaseOutputBuffer(this.f27316c, false);
            C8405g gVar = C8405g.this;
            gVar.m12552z(gVar.m12555w() - 1);
        }
    }

    public C8405g(MediaCodec mediaCodec, Surface surface, boolean z, boolean z2) {
        C8298k.m12933e(mediaCodec, "codec");
        this.f27306k = mediaCodec;
        this.f27307l = surface;
        this.f27308m = z2;
        EnumC7313d dVar = mo12548b() != null ? EnumC7313d.VIDEO : EnumC7313d.AUDIO;
        this.f27298c = dVar;
        C10007i iVar = new C10007i("Encoder(" + dVar + ',' + f27296o.mo6239d(dVar).getAndIncrement() + ')');
        this.f27299d = iVar;
        C9060a aVar = C9060a.f29041a;
        this.f27300e = new C8406a(0, 0, this);
        this.f27301f = new C8407b(0, 0, this);
        this.f27302g = this;
        this.f27303h = C5045e.m24198a(new C8409d());
        this.f27304i = new MediaCodec.BufferInfo();
        iVar.m6267c("Encoder: ownsStart=" + z + " ownsStop=" + z2);
        if (z) {
            mediaCodec.start();
        }
    }

    @Override
    public void mo5861a() {
        C10007i iVar = this.f27299d;
        iVar.m6267c("release(): ownsStop=" + this.f27308m + " dequeuedInputs=" + m12556v() + " dequeuedOutputs=" + m12555w());
        if (this.f27308m) {
            this.f27306k.stop();
        }
    }

    @Override
    public Surface mo12548b() {
        return this.f27307l;
    }

    @Override
    public C5048h<ByteBuffer, Integer> mo12547c() {
        int dequeueInputBuffer = this.f27306k.dequeueInputBuffer(0L);
        if (dequeueInputBuffer >= 0) {
            m12553y(m12556v() + 1);
            return C5054l.m24189a(m12558t().m10595a(dequeueInputBuffer), Integer.valueOf(dequeueInputBuffer));
        }
        C10007i iVar = this.f27299d;
        iVar.m6267c("buffer() failed. dequeuedInputs=" + m12556v() + " dequeuedOutputs=" + m12555w());
        return null;
    }

    @Override
    public AbstractC9475i<C8708h> mo8561k() {
        int dequeueOutputBuffer = this.f27306k.dequeueOutputBuffer(this.f27304i, this.f27305j ? 5000L : 0L);
        if (dequeueOutputBuffer == -3) {
            m12558t().m10593c();
            return AbstractC9475i.C9478c.f30717a;
        } else if (dequeueOutputBuffer != -2) {
            boolean z = false;
            if (dequeueOutputBuffer != -1) {
                if ((this.f27304i.flags & 2) != 0) {
                    this.f27306k.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return AbstractC9475i.C9478c.f30717a;
                }
                m12552z(m12555w() + 1);
                int i = this.f27304i.flags;
                if ((i & 4) != 0) {
                    z = true;
                }
                int i2 = i & (-5);
                ByteBuffer b = m12558t().m10594b(dequeueOutputBuffer);
                C8298k.m12934d(b, "buffers.getOutputBuffer(result)");
                long j = this.f27304i.presentationTimeUs;
                b.clear();
                MediaCodec.BufferInfo bufferInfo = this.f27304i;
                b.limit(bufferInfo.offset + bufferInfo.size);
                b.position(this.f27304i.offset);
                C8708h hVar = new C8708h(b, j, i2, new C8411f(dequeueOutputBuffer));
                return z ? new AbstractC9475i.C9476a(hVar) : new AbstractC9475i.C9477b(hVar);
            } else if (this.f27305j) {
                C10007i iVar = this.f27299d;
                iVar.m6267c("Sending fake Eos. dequeuedInputs=" + m12556v() + " dequeuedOutputs=" + m12555w());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(0);
                C8298k.m12934d(allocateDirect, "buffer");
                return new AbstractC9475i.C9476a(new C8708h(allocateDirect, 0L, 0, C8410e.f27314b));
            } else {
                this.f27299d.m6267c("Can't dequeue output buffer: INFO_TRY_AGAIN_LATER");
                return AbstractC9475i.C9479d.f30718a;
            }
        } else {
            C10007i iVar2 = this.f27299d;
            iVar2.m6267c("INFO_OUTPUT_FORMAT_CHANGED! format=" + this.f27306k.getOutputFormat());
            MediaFormat outputFormat = this.f27306k.getOutputFormat();
            C8298k.m12934d(outputFormat, "codec.outputFormat");
            ((AbstractC8707g) m8580j()).mo11707d(outputFormat);
            return AbstractC9475i.C9478c.f30717a;
        }
    }

    public void mo8560l(C8413i iVar) {
        C8298k.m12933e(iVar, "data");
        if (mo12548b() == null) {
            ByteBuffer b = iVar.m12545b();
            if (b != null) {
                this.f27306k.queueInputBuffer(iVar.m12544c(), b.position(), b.remaining(), iVar.m12543d(), 0);
                m12553y(m12556v() - 1);
                return;
            }
            throw new IllegalArgumentException("Audio should always pass a buffer to Encoder.".toString());
        }
    }

    public void mo8559m(C8413i iVar) {
        C8298k.m12933e(iVar, "data");
        if (mo12548b() == null) {
            boolean z = this.f27308m;
            if (!z) {
                this.f27305j = true;
            }
            this.f27306k.queueInputBuffer(iVar.m12544c(), 0, 0, 0L, !z ? 0 : 4);
            m12553y(m12556v() - 1);
        } else if (!this.f27308m) {
            this.f27305j = true;
        } else {
            this.f27306k.signalEndOfInputStream();
        }
    }

    public final C9057a m12558t() {
        return (C9057a) this.f27303h.getValue();
    }

    public C8405g mo5860e() {
        return this.f27302g;
    }

    public final int m12556v() {
        return ((Number) this.f27300e.mo10582a(this, f27295n[0])).intValue();
    }

    public final int m12555w() {
        return ((Number) this.f27301f.mo10582a(this, f27295n[1])).intValue();
    }

    public final void m12554x() {
        C10007i iVar = this.f27299d;
        iVar.m6262h("dequeuedInputs=" + m12556v() + " dequeuedOutputs=" + m12555w());
    }

    public final void m12553y(int i) {
        this.f27300e.mo10581b(this, f27295n[0], Integer.valueOf(i));
    }

    public final void m12552z(int i) {
        this.f27301f.mo10581b(this, f27295n[1], Integer.valueOf(i));
    }

    public C8405g(C7795b bVar, EnumC7313d dVar) {
        this(bVar.m15073d().mo6239d(dVar).m24195c(), bVar.m15073d().mo6239d(dVar).m24194d(), bVar.m15072e().mo6239d(dVar).booleanValue(), bVar.m15071f().mo6239d(dVar).booleanValue());
        C8298k.m12933e(bVar, "codecs");
        C8298k.m12933e(dVar, "type");
    }
}
