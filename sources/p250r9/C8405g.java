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
    public final EnumC7313d f27295c;
    public final C10007i f27296d;
    public final AbstractC9062c f27297e;
    public final AbstractC9062c f27298f;
    public final C8405g f27299g;
    public final AbstractC5044d f27300h;
    public MediaCodec.BufferInfo f27301i;
    public boolean f27302j;
    public final MediaCodec f27303k;
    public final Surface f27304l;
    public final boolean f27305m;
    public static final AbstractC10175g[] f27292n = {C8307t.m12918d(new C8301n(C8405g.class, "dequeuedInputs", "getDequeuedInputs()I", 0)), C8307t.m12918d(new C8301n(C8405g.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0))};
    public static final C8408c f27294p = new C8408c(null);
    public static final AbstractC10012l<AtomicInteger> f27293o = C10014m.m6221c(new AtomicInteger(0), new AtomicInteger(0));

    public static final class C8406a extends AbstractC9061b<Integer> {
        public final Object f27306b;
        public final C8405g f27307c;

        public C8406a(Object obj, Object obj2, C8405g gVar) {
            super(obj2);
            this.f27306b = obj;
            this.f27307c = gVar;
        }

        @Override
        public void mo10585c(AbstractC10175g<?> gVar, Integer num, Integer num2) {
            C8298k.m12934e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f27307c.m12555x();
        }
    }

    public static final class C8407b extends AbstractC9061b<Integer> {
        public final Object f27308b;
        public final C8405g f27309c;

        public C8407b(Object obj, Object obj2, C8405g gVar) {
            super(obj2);
            this.f27308b = obj;
            this.f27309c = gVar;
        }

        @Override
        public void mo10585c(AbstractC10175g<?> gVar, Integer num, Integer num2) {
            C8298k.m12934e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f27309c.m12555x();
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
            return new C9057a(C8405g.this.f27303k);
        }
    }

    public static final class C8410e extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public static final C8410e f27311b = new C8410e();

        public C8410e() {
            super(0);
        }

        @Override
        public C5060q mo4925b() {
            m12551f();
            return C5060q.f17066a;
        }

        public final void m12551f() {
        }
    }

    public static final class C8411f extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public final int f27313c;

        public C8411f(int i) {
            super(0);
            this.f27313c = i;
        }

        @Override
        public C5060q mo4925b() {
            m12550f();
            return C5060q.f17066a;
        }

        public final void m12550f() {
            C8405g.this.f27303k.releaseOutputBuffer(this.f27313c, false);
            C8405g gVar = C8405g.this;
            gVar.m12553z(gVar.m12556w() - 1);
        }
    }

    public C8405g(MediaCodec mediaCodec, Surface surface, boolean z, boolean z2) {
        C8298k.m12934e(mediaCodec, "codec");
        this.f27303k = mediaCodec;
        this.f27304l = surface;
        this.f27305m = z2;
        EnumC7313d dVar = mo12549b() != null ? EnumC7313d.VIDEO : EnumC7313d.AUDIO;
        this.f27295c = dVar;
        C10007i iVar = new C10007i("Encoder(" + dVar + ',' + f27293o.mo6239d(dVar).getAndIncrement() + ')');
        this.f27296d = iVar;
        C9060a aVar = C9060a.f29038a;
        this.f27297e = new C8406a(0, 0, this);
        this.f27298f = new C8407b(0, 0, this);
        this.f27299g = this;
        this.f27300h = C5045e.m24197a(new C8409d());
        this.f27301i = new MediaCodec.BufferInfo();
        iVar.m6267c("Encoder: ownsStart=" + z + " ownsStop=" + z2);
        if (z) {
            mediaCodec.start();
        }
    }

    @Override
    public void mo5861a() {
        C10007i iVar = this.f27296d;
        iVar.m6267c("release(): ownsStop=" + this.f27305m + " dequeuedInputs=" + m12557v() + " dequeuedOutputs=" + m12556w());
        if (this.f27305m) {
            this.f27303k.stop();
        }
    }

    @Override
    public Surface mo12549b() {
        return this.f27304l;
    }

    @Override
    public C5048h<ByteBuffer, Integer> mo12548c() {
        int dequeueInputBuffer = this.f27303k.dequeueInputBuffer(0L);
        if (dequeueInputBuffer >= 0) {
            m12554y(m12557v() + 1);
            return C5054l.m24188a(m12559t().m10596a(dequeueInputBuffer), Integer.valueOf(dequeueInputBuffer));
        }
        C10007i iVar = this.f27296d;
        iVar.m6267c("buffer() failed. dequeuedInputs=" + m12557v() + " dequeuedOutputs=" + m12556w());
        return null;
    }

    @Override
    public AbstractC9475i<C8708h> mo8561k() {
        int dequeueOutputBuffer = this.f27303k.dequeueOutputBuffer(this.f27301i, this.f27302j ? 5000L : 0L);
        if (dequeueOutputBuffer == -3) {
            m12559t().m10594c();
            return AbstractC9475i.C9478c.f30714a;
        } else if (dequeueOutputBuffer != -2) {
            boolean z = false;
            if (dequeueOutputBuffer != -1) {
                if ((this.f27301i.flags & 2) != 0) {
                    this.f27303k.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return AbstractC9475i.C9478c.f30714a;
                }
                m12553z(m12556w() + 1);
                int i = this.f27301i.flags;
                if ((i & 4) != 0) {
                    z = true;
                }
                int i2 = i & (-5);
                ByteBuffer b = m12559t().m10595b(dequeueOutputBuffer);
                C8298k.m12935d(b, "buffers.getOutputBuffer(result)");
                long j = this.f27301i.presentationTimeUs;
                b.clear();
                MediaCodec.BufferInfo bufferInfo = this.f27301i;
                b.limit(bufferInfo.offset + bufferInfo.size);
                b.position(this.f27301i.offset);
                C8708h hVar = new C8708h(b, j, i2, new C8411f(dequeueOutputBuffer));
                return z ? new AbstractC9475i.C9476a(hVar) : new AbstractC9475i.C9477b(hVar);
            } else if (this.f27302j) {
                C10007i iVar = this.f27296d;
                iVar.m6267c("Sending fake Eos. dequeuedInputs=" + m12557v() + " dequeuedOutputs=" + m12556w());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(0);
                C8298k.m12935d(allocateDirect, "buffer");
                return new AbstractC9475i.C9476a(new C8708h(allocateDirect, 0L, 0, C8410e.f27311b));
            } else {
                this.f27296d.m6267c("Can't dequeue output buffer: INFO_TRY_AGAIN_LATER");
                return AbstractC9475i.C9479d.f30715a;
            }
        } else {
            C10007i iVar2 = this.f27296d;
            iVar2.m6267c("INFO_OUTPUT_FORMAT_CHANGED! format=" + this.f27303k.getOutputFormat());
            MediaFormat outputFormat = this.f27303k.getOutputFormat();
            C8298k.m12935d(outputFormat, "codec.outputFormat");
            ((AbstractC8707g) m8580j()).mo11708d(outputFormat);
            return AbstractC9475i.C9478c.f30714a;
        }
    }

    public void mo8560l(C8413i iVar) {
        C8298k.m12934e(iVar, "data");
        if (mo12549b() == null) {
            ByteBuffer b = iVar.m12546b();
            if (b != null) {
                this.f27303k.queueInputBuffer(iVar.m12545c(), b.position(), b.remaining(), iVar.m12544d(), 0);
                m12554y(m12557v() - 1);
                return;
            }
            throw new IllegalArgumentException("Audio should always pass a buffer to Encoder.".toString());
        }
    }

    public void mo8559m(C8413i iVar) {
        C8298k.m12934e(iVar, "data");
        if (mo12549b() == null) {
            boolean z = this.f27305m;
            if (!z) {
                this.f27302j = true;
            }
            this.f27303k.queueInputBuffer(iVar.m12545c(), 0, 0, 0L, !z ? 0 : 4);
            m12554y(m12557v() - 1);
        } else if (!this.f27305m) {
            this.f27302j = true;
        } else {
            this.f27303k.signalEndOfInputStream();
        }
    }

    public final C9057a m12559t() {
        return (C9057a) this.f27300h.getValue();
    }

    public C8405g mo5860e() {
        return this.f27299g;
    }

    public final int m12557v() {
        return ((Number) this.f27297e.mo10583a(this, f27292n[0])).intValue();
    }

    public final int m12556w() {
        return ((Number) this.f27298f.mo10583a(this, f27292n[1])).intValue();
    }

    public final void m12555x() {
        C10007i iVar = this.f27296d;
        iVar.m6262h("dequeuedInputs=" + m12557v() + " dequeuedOutputs=" + m12556w());
    }

    public final void m12554y(int i) {
        this.f27297e.mo10582b(this, f27292n[0], Integer.valueOf(i));
    }

    public final void m12553z(int i) {
        this.f27298f.mo10582b(this, f27292n[1], Integer.valueOf(i));
    }

    public C8405g(C7795b bVar, EnumC7313d dVar) {
        this(bVar.m15073d().mo6239d(dVar).m24194c(), bVar.m15073d().mo6239d(dVar).m24193d(), bVar.m15072e().mo6239d(dVar).booleanValue(), bVar.m15071f().mo6239d(dVar).booleanValue());
        C8298k.m12934e(bVar, "codecs");
        C8298k.m12934e(dVar, "type");
    }
}
