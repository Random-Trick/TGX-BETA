package t9;

import android.media.MediaFormat;
import ca.b;
import ia.h;
import ia.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ra.k;
import ra.l;
import v9.i;
import v9.j;
import x9.i;

public final class a implements j<d, c, h, g>, c {
    public final int f22996c;
    public final ByteBuffer f22997d;
    public final MediaFormat f22999f;
    public final i f22995b = new i("Bridge");
    public final a f22998e = this;

    public static final class C0216a extends l implements qa.a<q> {
        public static final C0216a f23000b = new C0216a();

        public C0216a() {
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

    public a(MediaFormat mediaFormat) {
        k.e(mediaFormat, "format");
        this.f22999f = mediaFormat;
        int integer = mediaFormat.getInteger("max-input-size");
        this.f22996c = integer;
        this.f22997d = ByteBuffer.allocateDirect(integer).order(ByteOrder.nativeOrder());
    }

    @Override
    public void a() {
        j.a.b(this);
    }

    @Override
    public h<ByteBuffer, Integer> c() {
        this.f22997d.clear();
        return ia.l.a(this.f22997d, 0);
    }

    @Override
    public v9.i<h> i(i.b<d> bVar, boolean z10) {
        k.e(bVar, "state");
        b.a a10 = bVar.a().a();
        boolean z11 = a10.f4999b;
        ByteBuffer byteBuffer = a10.f4998a;
        k.d(byteBuffer, "chunk.buffer");
        h hVar = new h(byteBuffer, a10.f5000c, z11 ? 1 : 0, C0216a.f23000b);
        return bVar instanceof i.a ? new i.a(hVar) : new i.b(hVar);
    }

    public a f() {
        return this.f22998e;
    }

    public void d(g gVar) {
        k.e(gVar, "next");
        x9.i iVar = this.f22995b;
        iVar.c("initialize(): format=" + this.f22999f);
        gVar.e(this.f22999f);
    }
}
