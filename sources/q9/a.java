package q9;

import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import qa.q;
import ra.g;
import ra.k;
import ra.l;
import s9.f;
import s9.i;
import v9.h;
import v9.i;

public final class a extends h<s9.c, s9.b, i, s9.h> implements s9.b {
    public final x9.i f21468c = new x9.i("AudioEngine(" + f21466l.getAndIncrement() + ')');
    public final a f21469d = this;
    public final e f21470e = new e();
    public MediaFormat f21471f;
    public q9.c f21472g;
    public r9.a f21473h;
    public final ea.a f21474i;
    public final z9.a f21475j;
    public final MediaFormat f21476k;
    public static final C0198a f21467m = new C0198a(null);
    public static final AtomicInteger f21466l = new AtomicInteger(0);

    public static final class C0198a {
        public C0198a() {
        }

        public C0198a(g gVar) {
            this();
        }
    }

    public static final class b extends l implements q<ShortBuffer, Long, Double, i.b<s9.i>> {
        public final ByteBuffer M;
        public final int N;
        public final ShortBuffer f21478c;

        public b(ShortBuffer shortBuffer, ByteBuffer byteBuffer, int i10) {
            super(3);
            this.f21478c = shortBuffer;
            this.M = byteBuffer;
            this.N = i10;
        }

        @Override
        public i.b<s9.i> c(ShortBuffer shortBuffer, Long l10, Double d10) {
            return f(shortBuffer, l10.longValue(), d10.doubleValue());
        }

        public final i.b<s9.i> f(ShortBuffer shortBuffer, long j10, double d10) {
            k.e(shortBuffer, "inBuffer");
            int remaining = this.f21478c.remaining();
            int remaining2 = shortBuffer.remaining();
            double d11 = remaining2;
            double ceil = Math.ceil(d11 * d10);
            a aVar = a.this;
            double b10 = a.q(a.this).b((int) ceil) * aVar.z(aVar.f21476k);
            a aVar2 = a.this;
            double ceil2 = Math.ceil(b10 / aVar2.z(a.p(aVar2)));
            double d12 = remaining;
            if (ceil2 > d12) {
                remaining2 = (int) Math.floor(d12 / (ceil2 / d11));
            }
            shortBuffer.limit(shortBuffer.position() + remaining2);
            int ceil3 = (int) Math.ceil(remaining2 * d10);
            ShortBuffer a10 = a.this.f21470e.a("stretch", ceil3);
            ea.a aVar3 = a.this.f21474i;
            a aVar4 = a.this;
            aVar3.a(shortBuffer, a10, aVar4.y(a.p(aVar4)));
            a10.flip();
            ShortBuffer a11 = a.this.f21470e.a("remix", a.q(a.this).b(ceil3));
            a.q(a.this).a(a10, a11);
            a11.flip();
            z9.a aVar5 = a.this.f21475j;
            a aVar6 = a.this;
            int z10 = aVar6.z(a.p(aVar6));
            ShortBuffer shortBuffer2 = this.f21478c;
            a aVar7 = a.this;
            int z11 = aVar7.z(aVar7.f21476k);
            a aVar8 = a.this;
            aVar5.a(a11, z10, shortBuffer2, z11, aVar8.y(aVar8.f21476k));
            this.f21478c.flip();
            this.M.clear();
            this.M.limit(this.f21478c.limit() * 2);
            this.M.position(this.f21478c.position() * 2);
            return new i.b<>(new s9.i(this.M, this.N, j10));
        }
    }

    public static final class c extends l implements qa.a<ia.q> {
        public final s9.c f21479b;

        public c(s9.c cVar) {
            super(0);
            this.f21479b = cVar;
        }

        @Override
        public ia.q b() {
            f();
            return ia.q.f14159a;
        }

        public final void f() {
            this.f21479b.b().a(Boolean.FALSE);
        }
    }

    public a(ea.a aVar, z9.a aVar2, MediaFormat mediaFormat) {
        k.e(aVar, "stretcher");
        k.e(aVar2, "resampler");
        k.e(mediaFormat, "targetFormat");
        this.f21474i = aVar;
        this.f21475j = aVar2;
        this.f21476k = mediaFormat;
    }

    public static final MediaFormat p(a aVar) {
        MediaFormat mediaFormat = aVar.f21471f;
        if (mediaFormat == null) {
            k.n("rawFormat");
        }
        return mediaFormat;
    }

    public static final r9.a q(a aVar) {
        r9.a aVar2 = aVar.f21473h;
        if (aVar2 == null) {
            k.n("remixer");
        }
        return aVar2;
    }

    @Override
    public void g(MediaFormat mediaFormat) {
        k.e(mediaFormat, "rawFormat");
        x9.i iVar = this.f21468c;
        iVar.c("handleRawFormat(" + mediaFormat + ')');
        this.f21471f = mediaFormat;
        this.f21473h = r9.a.f21798a.a(y(mediaFormat), y(this.f21476k));
        this.f21472g = new q9.c(z(mediaFormat), y(mediaFormat));
    }

    @Override
    public Surface h(MediaFormat mediaFormat) {
        k.e(mediaFormat, "sourceFormat");
        return null;
    }

    @Override
    public v9.i<s9.i> k() {
        q9.c cVar = this.f21472g;
        if (cVar == null) {
            k.n("chunks");
        }
        if (cVar.d()) {
            this.f21468c.c("drain(): no chunks, waiting...");
            return i.d.f24805a;
        }
        ia.h<ByteBuffer, Integer> c10 = ((s9.h) j()).c();
        if (c10 != null) {
            ByteBuffer a10 = c10.a();
            int intValue = c10.b().intValue();
            ShortBuffer asShortBuffer = a10.asShortBuffer();
            q9.c cVar2 = this.f21472g;
            if (cVar2 == null) {
                k.n("chunks");
            }
            return (v9.i) cVar2.a(new i.a(new s9.i(a10, intValue, 0L)), new b(asShortBuffer, a10, intValue));
        }
        this.f21468c.c("drain(): no next buffer, waiting...");
        return i.d.f24805a;
    }

    public void l(s9.c cVar) {
        k.e(cVar, "data");
        f fVar = (f) (!(cVar instanceof f) ? null : cVar);
        double d10 = fVar != null ? fVar.d() : 1.0d;
        q9.c cVar2 = this.f21472g;
        if (cVar2 == null) {
            k.n("chunks");
        }
        ShortBuffer asShortBuffer = cVar.a().asShortBuffer();
        k.d(asShortBuffer, "data.buffer.asShortBuffer()");
        cVar2.b(asShortBuffer, cVar.c(), d10, new c(cVar));
    }

    public void m(s9.c cVar) {
        k.e(cVar, "data");
        this.f21468c.c("enqueueEos()");
        cVar.b().a(Boolean.FALSE);
        q9.c cVar2 = this.f21472g;
        if (cVar2 == null) {
            k.n("chunks");
        }
        cVar2.c();
    }

    public a f() {
        return this.f21469d;
    }

    public final int y(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("channel-count");
    }

    public final int z(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("sample-rate");
    }
}
