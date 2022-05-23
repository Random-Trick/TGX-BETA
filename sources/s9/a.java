package s9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import ca.b;
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
import ya.g;

public final class a extends h<t9.d, t9.c, s9.c, s9.b> implements t9.c {
    public final i f22630c;
    public final MediaCodec f22632e;
    public final s9.d f22635h;
    public final MediaFormat f22638k;
    public static final g[] f22627l = {t.d(new n(a.class, "dequeuedInputs", "getDequeuedInputs()I", 0)), t.d(new n(a.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0))};
    public static final c f22629n = new c(null);
    public static final l<AtomicInteger> f22628m = m.c(new AtomicInteger(0), new AtomicInteger(0));
    public final a f22631d = this;
    public final ia.d f22633f = ia.e.a(new d());
    public MediaCodec.BufferInfo f22634g = new MediaCodec.BufferInfo();
    public final ua.c f22636i = new C0213a(0, 0, this);
    public final ua.c f22637j = new b(0, 0, this);

    public static final class C0213a extends ua.b<Integer> {
        public final Object f22639b;
        public final a f22640c;

        public C0213a(Object obj, Object obj2, a aVar) {
            super(obj2);
            this.f22639b = obj;
            this.f22640c = aVar;
        }

        @Override
        public void c(g<?> gVar, Integer num, Integer num2) {
            k.e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f22640c.y();
        }
    }

    public static final class b extends ua.b<Integer> {
        public final Object f22641b;
        public final a f22642c;

        public b(Object obj, Object obj2, a aVar) {
            super(obj2);
            this.f22641b = obj;
            this.f22642c = aVar;
        }

        @Override
        public void c(g<?> gVar, Integer num, Integer num2) {
            k.e(gVar, "property");
            num2.intValue();
            num.intValue();
            this.f22642c.y();
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
            return new u9.a(a.this.f22632e);
        }
    }

    public static final class e extends ra.l implements qa.l<Boolean, q> {
        public final int f22645c;

        public e(int i10) {
            super(1);
            this.f22645c = i10;
        }

        @Override
        public q a(Boolean bool) {
            f(bool.booleanValue());
            return q.f14159a;
        }

        public final void f(boolean z10) {
            a.this.f22632e.releaseOutputBuffer(this.f22645c, z10);
            a aVar = a.this;
            aVar.A(aVar.w() - 1);
        }
    }

    public a(MediaFormat mediaFormat, boolean z10) {
        k.e(mediaFormat, "format");
        this.f22638k = mediaFormat;
        this.f22630c = new i("Decoder(" + o9.e.a(mediaFormat) + ',' + f22628m.n(o9.e.a(mediaFormat)).getAndIncrement() + ')');
        String string = mediaFormat.getString("mime");
        k.c(string);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
        k.d(createDecoderByType, "createDecoderByType(form…(MediaFormat.KEY_MIME)!!)");
        this.f22632e = createDecoderByType;
        this.f22635h = new s9.d(z10);
        ua.a aVar = ua.a.f23718a;
    }

    public final void A(int i10) {
        this.f22637j.a(this, f22627l[1], Integer.valueOf(i10));
    }

    @Override
    public void a() {
        i iVar = this.f22630c;
        iVar.c("release(): releasing codec. dequeuedInputs=" + v() + " dequeuedOutputs=" + w());
        this.f22632e.stop();
        this.f22632e.release();
    }

    @Override
    public ia.h<ByteBuffer, Integer> c() {
        int dequeueInputBuffer = this.f22632e.dequeueInputBuffer(0L);
        if (dequeueInputBuffer >= 0) {
            z(v() + 1);
            return ia.l.a(t().a(dequeueInputBuffer), Integer.valueOf(dequeueInputBuffer));
        }
        i iVar = this.f22630c;
        iVar.c("buffer() failed. dequeuedInputs=" + v() + " dequeuedOutputs=" + w());
        return null;
    }

    @Override
    public v9.i<s9.c> k() {
        v9.i<s9.c> iVar;
        int dequeueOutputBuffer = this.f22632e.dequeueOutputBuffer(this.f22634g, 0L);
        if (dequeueOutputBuffer == -3) {
            this.f22630c.c("drain(): got INFO_OUTPUT_BUFFERS_CHANGED, retrying.");
            t().c();
            return i.c.f24804a;
        } else if (dequeueOutputBuffer == -2) {
            x9.i iVar2 = this.f22630c;
            iVar2.c("drain(): got INFO_OUTPUT_FORMAT_CHANGED, handling format and retrying. format=" + this.f22632e.getOutputFormat());
            MediaFormat outputFormat = this.f22632e.getOutputFormat();
            k.d(outputFormat, "codec.outputFormat");
            ((s9.b) j()).g(outputFormat);
            return i.c.f24804a;
        } else if (dequeueOutputBuffer != -1) {
            MediaCodec.BufferInfo bufferInfo = this.f22634g;
            boolean z10 = (bufferInfo.flags & 4) != 0;
            Long d10 = z10 ? 0L : this.f22635h.d(bufferInfo.presentationTimeUs);
            if (d10 != null) {
                A(w() + 1);
                ByteBuffer b10 = t().b(dequeueOutputBuffer);
                k.d(b10, "buffers.getOutputBuffer(result)");
                s9.c cVar = new s9.c(b10, d10.longValue(), new e(dequeueOutputBuffer));
                iVar = z10 ? new i.a<>(cVar) : new i.b<>(cVar);
            } else {
                this.f22632e.releaseOutputBuffer(dequeueOutputBuffer, false);
                iVar = i.d.f24805a;
            }
            x9.i iVar3 = this.f22630c;
            iVar3.h("drain(): returning " + iVar);
            return iVar;
        } else {
            this.f22630c.c("drain(): got INFO_TRY_AGAIN_LATER, waiting.");
            return i.d.f24805a;
        }
    }

    public void l(t9.d dVar) {
        k.e(dVar, "data");
        z(v() - 1);
        b.a a10 = dVar.a();
        this.f22632e.queueInputBuffer(dVar.b(), a10.f4998a.position(), a10.f4998a.remaining(), a10.f5000c, a10.f4999b ? 1 : 0);
        this.f22635h.c(a10.f5000c, a10.f5001d);
    }

    public void m(t9.d dVar) {
        k.e(dVar, "data");
        this.f22630c.c("enqueueEos()!");
        z(v() - 1);
        this.f22632e.queueInputBuffer(dVar.d(), 0, 0, 0L, 4);
    }

    public final u9.a t() {
        return (u9.a) this.f22633f.getValue();
    }

    public a f() {
        return this.f22631d;
    }

    public final int v() {
        return ((Number) this.f22636i.b(this, f22627l[0])).intValue();
    }

    public final int w() {
        return ((Number) this.f22637j.b(this, f22627l[1])).intValue();
    }

    public void d(s9.b bVar) {
        k.e(bVar, "next");
        super.d(bVar);
        this.f22630c.c("initialize()");
        this.f22632e.configure(this.f22638k, bVar.h(this.f22638k), (MediaCrypto) null, 0);
        this.f22632e.start();
    }

    public final void y() {
    }

    public final void z(int i10) {
        this.f22636i.a(this, f22627l[0], Integer.valueOf(i10));
    }
}
