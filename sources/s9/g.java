package s9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import ia.q;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import ra.k;
import ra.n;
import ra.t;
import v9.h;
import v9.i;
import x9.i;
import x9.l;
import x9.m;

public final class g extends h<i, h, t9.h, t9.g> implements h {
    public final o9.d f22665c;
    public final i f22666d;
    public final ua.c f22667e;
    public final ua.c f22668f;
    public final g f22669g;
    public final ia.d f22670h;
    public MediaCodec.BufferInfo f22671i;
    public boolean f22672j;
    public final MediaCodec f22673k;
    public final Surface f22674l;
    public final boolean f22675m;
    public static final ya.g[] f22662n = {t.d(new n(g.class, "dequeuedInputs", "getDequeuedInputs()I", 0)), t.d(new n(g.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0))};
    public static final c f22664p = new c(null);
    public static final l<AtomicInteger> f22663o = m.c(new AtomicInteger(0), new AtomicInteger(0));

    public static final class a extends ua.b<Integer> {
        public final Object f22676b;
        public final g f22677c;

        public a(Object obj, Object obj2, g gVar) {
            super(obj2);
            this.f22676b = obj;
            this.f22677c = gVar;
        }

        @Override
        public void c(ya.g<?> gVar, Integer num, Integer num2) {
            k.e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f22677c.x();
        }
    }

    public static final class b extends ua.b<Integer> {
        public final Object f22678b;
        public final g f22679c;

        public b(Object obj, Object obj2, g gVar) {
            super(obj2);
            this.f22678b = obj;
            this.f22679c = gVar;
        }

        @Override
        public void c(ya.g<?> gVar, Integer num, Integer num2) {
            k.e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f22679c.x();
        }
    }

    public static final class c {
        public c() {
        }

        public c(ra.g gVar) {
            this();
        }
    }

    public static final class d extends ra.l implements qa.a<u9.a> {
        public d() {
            super(0);
        }

        public final u9.a b() {
            return new u9.a(g.this.f22673k);
        }
    }

    public static final class e extends ra.l implements qa.a<q> {
        public static final e f22681b = new e();

        public e() {
            super(0);
        }

        @Override
        public q b() {
            f();
            return q.f14159a;
        }

        public final void f() {
        }
    }

    public static final class f extends ra.l implements qa.a<q> {
        public final int f22683c;

        public f(int i10) {
            super(0);
            this.f22683c = i10;
        }

        @Override
        public q b() {
            f();
            return q.f14159a;
        }

        public final void f() {
            g.this.f22673k.releaseOutputBuffer(this.f22683c, false);
            g gVar = g.this;
            gVar.z(gVar.w() - 1);
        }
    }

    public g(MediaCodec mediaCodec, Surface surface, boolean z10, boolean z11) {
        k.e(mediaCodec, "codec");
        this.f22673k = mediaCodec;
        this.f22674l = surface;
        this.f22675m = z11;
        o9.d dVar = b() != null ? o9.d.VIDEO : o9.d.AUDIO;
        this.f22665c = dVar;
        i iVar = new i("Encoder(" + dVar + ',' + f22663o.n(dVar).getAndIncrement() + ')');
        this.f22666d = iVar;
        ua.a aVar = ua.a.f23718a;
        this.f22667e = new a(0, 0, this);
        this.f22668f = new b(0, 0, this);
        this.f22669g = this;
        this.f22670h = ia.e.a(new d());
        this.f22671i = new MediaCodec.BufferInfo();
        iVar.c("Encoder: ownsStart=" + z10 + " ownsStop=" + z11);
        if (z10) {
            mediaCodec.start();
        }
    }

    @Override
    public void a() {
        i iVar = this.f22666d;
        iVar.c("release(): ownsStop=" + this.f22675m + " dequeuedInputs=" + v() + " dequeuedOutputs=" + w());
        if (this.f22675m) {
            this.f22673k.stop();
        }
    }

    @Override
    public Surface b() {
        return this.f22674l;
    }

    @Override
    public ia.h<ByteBuffer, Integer> c() {
        int dequeueInputBuffer = this.f22673k.dequeueInputBuffer(0L);
        if (dequeueInputBuffer >= 0) {
            y(v() + 1);
            return ia.l.a(t().a(dequeueInputBuffer), Integer.valueOf(dequeueInputBuffer));
        }
        i iVar = this.f22666d;
        iVar.c("buffer() failed. dequeuedInputs=" + v() + " dequeuedOutputs=" + w());
        return null;
    }

    @Override
    public v9.i<t9.h> k() {
        int dequeueOutputBuffer = this.f22673k.dequeueOutputBuffer(this.f22671i, this.f22672j ? 5000L : 0L);
        if (dequeueOutputBuffer == -3) {
            t().c();
            return i.c.f24804a;
        } else if (dequeueOutputBuffer != -2) {
            boolean z10 = false;
            if (dequeueOutputBuffer != -1) {
                if ((this.f22671i.flags & 2) != 0) {
                    this.f22673k.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return i.c.f24804a;
                }
                z(w() + 1);
                int i10 = this.f22671i.flags;
                if ((i10 & 4) != 0) {
                    z10 = true;
                }
                int i11 = i10 & (-5);
                ByteBuffer b10 = t().b(dequeueOutputBuffer);
                k.d(b10, "buffers.getOutputBuffer(result)");
                long j10 = this.f22671i.presentationTimeUs;
                b10.clear();
                MediaCodec.BufferInfo bufferInfo = this.f22671i;
                b10.limit(bufferInfo.offset + bufferInfo.size);
                b10.position(this.f22671i.offset);
                t9.h hVar = new t9.h(b10, j10, i11, new f(dequeueOutputBuffer));
                return z10 ? new i.a(hVar) : new i.b(hVar);
            } else if (this.f22672j) {
                x9.i iVar = this.f22666d;
                iVar.c("Sending fake Eos. dequeuedInputs=" + v() + " dequeuedOutputs=" + w());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(0);
                k.d(allocateDirect, "buffer");
                return new i.a(new t9.h(allocateDirect, 0L, 0, e.f22681b));
            } else {
                this.f22666d.c("Can't dequeue output buffer: INFO_TRY_AGAIN_LATER");
                return i.d.f24805a;
            }
        } else {
            x9.i iVar2 = this.f22666d;
            iVar2.c("INFO_OUTPUT_FORMAT_CHANGED! format=" + this.f22673k.getOutputFormat());
            MediaFormat outputFormat = this.f22673k.getOutputFormat();
            k.d(outputFormat, "codec.outputFormat");
            ((t9.g) j()).e(outputFormat);
            return i.c.f24804a;
        }
    }

    public void l(i iVar) {
        k.e(iVar, "data");
        if (b() == null) {
            ByteBuffer b10 = iVar.b();
            if (b10 != null) {
                this.f22673k.queueInputBuffer(iVar.c(), b10.position(), b10.remaining(), iVar.d(), 0);
                y(v() - 1);
                return;
            }
            throw new IllegalArgumentException("Audio should always pass a buffer to Encoder.".toString());
        }
    }

    public void m(i iVar) {
        k.e(iVar, "data");
        if (b() == null) {
            boolean z10 = this.f22675m;
            if (!z10) {
                this.f22672j = true;
            }
            this.f22673k.queueInputBuffer(iVar.c(), 0, 0, 0L, !z10 ? 0 : 4);
            y(v() - 1);
        } else if (!this.f22675m) {
            this.f22672j = true;
        } else {
            this.f22673k.signalEndOfInputStream();
        }
    }

    public final u9.a t() {
        return (u9.a) this.f22670h.getValue();
    }

    public g f() {
        return this.f22669g;
    }

    public final int v() {
        return ((Number) this.f22667e.b(this, f22662n[0])).intValue();
    }

    public final int w() {
        return ((Number) this.f22668f.b(this, f22662n[1])).intValue();
    }

    public final void x() {
        x9.i iVar = this.f22666d;
        iVar.h("dequeuedInputs=" + v() + " dequeuedOutputs=" + w());
    }

    public final void y(int i10) {
        this.f22667e.a(this, f22662n[0], Integer.valueOf(i10));
    }

    public final void z(int i10) {
        this.f22668f.a(this, f22662n[1], Integer.valueOf(i10));
    }

    public g(p9.b bVar, o9.d dVar) {
        this(bVar.d().n(dVar).c(), bVar.d().n(dVar).d(), bVar.e().n(dVar).booleanValue(), bVar.f().n(dVar).booleanValue());
        k.e(bVar, "codecs");
        k.e(dVar, "type");
    }
}
