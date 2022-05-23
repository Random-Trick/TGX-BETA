package y9;

import android.media.MediaFormat;
import android.view.Surface;
import ia.d;
import ia.i;
import ra.g;
import ra.k;
import ra.l;
import s9.b;
import s9.c;
import v9.i;
import v9.j;
import x9.i;

public final class e implements j<c, b, Long, v9.b>, b {
    public final i f26670b;
    public final e f26671c;
    public final d f26672d;
    public b f26673e;
    public final int f26674f;
    public final int f26675g;
    public final MediaFormat f26676h;

    public static final class a extends l implements qa.a<y9.a> {
        public final boolean f26677b;

        public a(boolean z10) {
            super(0);
            this.f26677b = z10;
        }

        public final y9.a b() {
            y9.a aVar = new y9.a();
            aVar.j(this.f26677b);
            return aVar;
        }
    }

    public e(int i10, int i11, MediaFormat mediaFormat, boolean z10) {
        k.e(mediaFormat, "targetFormat");
        this.f26674f = i10;
        this.f26675g = i11;
        this.f26676h = mediaFormat;
        i iVar = new i("VideoRenderer");
        this.f26670b = iVar;
        this.f26671c = this;
        this.f26672d = ia.e.a(new a(z10));
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        boolean z11 = i11 % 180 != 0;
        iVar.a("FrameDrawerEncoder: size=" + integer + '-' + integer2 + ", flipping=" + z11);
        mediaFormat.setInteger("width", z11 ? integer2 : integer);
        mediaFormat.setInteger("height", !z11 ? integer2 : integer);
    }

    @Override
    public void a() {
        k().i();
    }

    @Override
    public void d(v9.b bVar) {
        k.e(bVar, "next");
        j.a.a(this, bVar);
    }

    @Override
    public void g(MediaFormat mediaFormat) {
        k.e(mediaFormat, "rawFormat");
    }

    @Override
    public Surface h(MediaFormat mediaFormat) {
        int i10;
        float f10;
        k.e(mediaFormat, "sourceFormat");
        i iVar = this.f26670b;
        iVar.c("handleSourceFormat(" + mediaFormat + ')');
        try {
            i.a aVar = ia.i.f14152a;
            i10 = ia.i.a(Integer.valueOf(mediaFormat.getInteger("rotation-degrees")));
        } catch (Throwable th) {
            i.a aVar2 = ia.i.f14152a;
            i10 = ia.i.a(ia.j.a(th));
        }
        boolean z10 = false;
        if (ia.i.b(i10) != null) {
            i10 = 0;
        }
        int intValue = ((Number) i10).intValue();
        if (intValue == this.f26674f) {
            mediaFormat.setInteger("rotation-degrees", 0);
            int i11 = (intValue + this.f26675g) % 360;
            k().k(i11);
            if (i11 % 180 != 0) {
                z10 = true;
            }
            float integer = mediaFormat.getInteger("width") / mediaFormat.getInteger("height");
            MediaFormat mediaFormat2 = this.f26676h;
            float integer2 = (z10 ? mediaFormat2.getInteger("height") : mediaFormat2.getInteger("width")) / (z10 ? this.f26676h.getInteger("width") : this.f26676h.getInteger("height"));
            float f11 = 1.0f;
            if (integer > integer2) {
                f11 = integer / integer2;
            } else if (integer < integer2) {
                f10 = integer2 / integer;
                k().l(f11, f10);
                this.f26673e = c.a(mediaFormat.getInteger("frame-rate"), this.f26676h.getInteger("frame-rate"));
                Surface h10 = k().h();
                k.d(h10, "frameDrawer.surface");
                return h10;
            }
            f10 = 1.0f;
            k().l(f11, f10);
            this.f26673e = c.a(mediaFormat.getInteger("frame-rate"), this.f26676h.getInteger("frame-rate"));
            Surface h102 = k().h();
            k.d(h102, "frameDrawer.surface");
            return h102;
        }
        throw new IllegalStateException(("Unexpected difference in rotation. DataSource=" + this.f26674f + ", MediaFormat=" + intValue).toString());
    }

    @Override
    public v9.i<Long> i(i.b<c> bVar, boolean z10) {
        k.e(bVar, "state");
        if (bVar instanceof i.a) {
            bVar.a().b().a(Boolean.FALSE);
            return new i.a(0L);
        }
        b bVar2 = this.f26673e;
        if (bVar2 == null) {
            k.n("frameDropper");
        }
        if (bVar2.a(bVar.a().c())) {
            bVar.a().b().a(Boolean.TRUE);
            k().f();
            return new i.b(Long.valueOf(bVar.a().c()));
        }
        bVar.a().b().a(Boolean.FALSE);
        return i.d.f24805a;
    }

    public e f() {
        return this.f26671c;
    }

    public final y9.a k() {
        return (y9.a) this.f26672d.getValue();
    }

    public e(int i10, int i11, MediaFormat mediaFormat, boolean z10, int i12, g gVar) {
        this(i10, i11, mediaFormat, (i12 & 8) != 0 ? false : z10);
    }
}
