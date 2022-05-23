package p9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import ia.d;
import ia.e;
import ia.f;
import ia.h;
import ja.n;
import java.util.Iterator;
import ra.k;
import x9.i;
import x9.l;

public final class b {
    public final i f20923a = new i("Codecs");
    public final l<h<MediaCodec, Surface>> f20924b = new a();
    public final l<Boolean> f20925c = new C0186b();
    public final l<Boolean> f20926d = new c();
    public final d f20927e;
    public final i f20928f;
    public final l<Integer> f20929g;

    public static final class a implements l<h<? extends MediaCodec, ? extends Surface>> {
        public final d f20930a = e.a(new C0184a());
        public final d f20931b = e.a(new C0185b());

        public static final class C0184a extends ra.l implements qa.a<h> {
            public C0184a() {
                super(0);
            }

            public final h b() {
                MediaFormat a10 = b.this.f20928f.c().a();
                String string = a10.getString("mime");
                k.c(string);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
                k.d(createEncoderByType, "MediaCodec.createEncoder…(MediaFormat.KEY_MIME)!!)");
                createEncoderByType.configure(a10, (Surface) null, (MediaCrypto) null, 1);
                return ia.l.a(createEncoderByType, null);
            }
        }

        public static final class C0185b extends ra.l implements qa.a<h<? extends MediaCodec, ? extends Surface>> {
            public C0185b() {
                super(0);
            }

            public final h<MediaCodec, Surface> b() {
                MediaFormat b10 = b.this.f20928f.c().b();
                String string = b10.getString("mime");
                k.c(string);
                MediaCodec createEncoderByType = MediaCodec.createEncoderByType(string);
                k.d(createEncoderByType, "MediaCodec.createEncoder…(MediaFormat.KEY_MIME)!!)");
                createEncoderByType.configure(b10, (Surface) null, (MediaCrypto) null, 1);
                return ia.l.a(createEncoderByType, createEncoderByType.createInputSurface());
            }
        }

        public a() {
        }

        public h<MediaCodec, Surface> k() {
            return (h) l.a.a(this);
        }

        public h<MediaCodec, Surface> n(o9.d dVar) {
            k.e(dVar, "type");
            int i10 = p9.a.f20922a[dVar.ordinal()];
            if (i10 == 1) {
                return r();
            }
            if (i10 == 2) {
                return s();
            }
            throw new f();
        }

        @Override
        public int getSize() {
            return l.a.f(this);
        }

        @Override
        public boolean i() {
            return l.a.c(this);
        }

        @Override
        public Iterator<h<MediaCodec, Surface>> iterator() {
            return l.a.h(this);
        }

        @Override
        public boolean l() {
            return l.a.d(this);
        }

        public h<MediaCodec, Surface> a() {
            return (h) l.a.b(this);
        }

        @Override
        public boolean q(o9.d dVar) {
            k.e(dVar, "type");
            return b.this.f20928f.b().n(dVar) == o9.c.COMPRESSING;
        }

        public final h r() {
            return (h) this.f20930a.getValue();
        }

        public final h<MediaCodec, Surface> s() {
            return (h) this.f20931b.getValue();
        }

        public h<MediaCodec, Surface> o(o9.d dVar) {
            k.e(dVar, "type");
            return (h) l.a.e(this, dVar);
        }

        public h<MediaCodec, Surface> b() {
            return (h) l.a.g(this);
        }

        public h<MediaCodec, Surface> j() {
            return (h) l.a.i(this);
        }
    }

    public static final class C0186b implements l<Boolean> {
        public C0186b() {
        }

        public Boolean k() {
            return (Boolean) l.a.a(this);
        }

        public Boolean n(o9.d dVar) {
            k.e(dVar, "type");
            return Boolean.valueOf(((Number) b.this.f20929g.n(dVar)).intValue() == 0);
        }

        @Override
        public int getSize() {
            return l.a.f(this);
        }

        @Override
        public boolean i() {
            return l.a.c(this);
        }

        @Override
        public Iterator<Boolean> iterator() {
            return l.a.h(this);
        }

        @Override
        public boolean l() {
            return l.a.d(this);
        }

        public Boolean a() {
            return (Boolean) l.a.b(this);
        }

        @Override
        public boolean q(o9.d dVar) {
            k.e(dVar, "type");
            return true;
        }

        public Boolean o(o9.d dVar) {
            k.e(dVar, "type");
            return (Boolean) l.a.e(this, dVar);
        }

        public Boolean b() {
            return (Boolean) l.a.g(this);
        }

        public Boolean j() {
            return (Boolean) l.a.i(this);
        }
    }

    public static final class c implements l<Boolean> {
        public c() {
        }

        public Boolean k() {
            return (Boolean) l.a.a(this);
        }

        public Boolean n(o9.d dVar) {
            k.e(dVar, "type");
            return Boolean.valueOf(((Number) b.this.f20929g.n(dVar)).intValue() == n.g(b.this.f20927e.n(dVar)));
        }

        @Override
        public int getSize() {
            return l.a.f(this);
        }

        @Override
        public boolean i() {
            return l.a.c(this);
        }

        @Override
        public Iterator<Boolean> iterator() {
            return l.a.h(this);
        }

        @Override
        public boolean l() {
            return l.a.d(this);
        }

        public Boolean a() {
            return (Boolean) l.a.b(this);
        }

        @Override
        public boolean q(o9.d dVar) {
            k.e(dVar, "type");
            return true;
        }

        public Boolean o(o9.d dVar) {
            k.e(dVar, "type");
            return (Boolean) l.a.e(this, dVar);
        }

        public Boolean b() {
            return (Boolean) l.a.g(this);
        }

        public Boolean j() {
            return (Boolean) l.a.i(this);
        }
    }

    public b(d dVar, i iVar, l<Integer> lVar) {
        k.e(dVar, "sources");
        k.e(iVar, "tracks");
        k.e(lVar, "current");
        this.f20927e = dVar;
        this.f20928f = iVar;
        this.f20929g = lVar;
    }

    public final l<h<MediaCodec, Surface>> d() {
        return this.f20924b;
    }

    public final l<Boolean> e() {
        return this.f20925c;
    }

    public final l<Boolean> f() {
        return this.f20926d;
    }

    public final void g() {
        for (h<MediaCodec, Surface> hVar : this.f20924b) {
            hVar.c().release();
        }
    }
}
