package t9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import ba.a;
import ia.q;
import java.nio.ByteBuffer;
import o9.d;
import ra.k;
import v9.b;
import v9.i;
import v9.j;
import x9.i;

public final class f implements j<h, g, q, b>, g {
    public final f f23010b = this;
    public final i f23011c = new i("Writer");
    public final MediaCodec.BufferInfo f23012d = new MediaCodec.BufferInfo();
    public final a f23013e;
    public final d f23014f;

    public f(a aVar, d dVar) {
        k.e(aVar, "sink");
        k.e(dVar, "track");
        this.f23013e = aVar;
        this.f23014f = dVar;
    }

    @Override
    public void a() {
        j.a.b(this);
    }

    @Override
    public void d(b bVar) {
        k.e(bVar, "next");
        j.a.a(this, bVar);
    }

    @Override
    public void e(MediaFormat mediaFormat) {
        k.e(mediaFormat, "format");
        i iVar = this.f23011c;
        iVar.c("handleFormat(" + mediaFormat + ')');
        this.f23013e.e(this.f23014f, mediaFormat);
    }

    @Override
    public v9.i<q> i(i.b<h> bVar, boolean z10) {
        k.e(bVar, "state");
        h a10 = bVar.a();
        ByteBuffer a11 = a10.a();
        long b10 = a10.b();
        int c10 = a10.c();
        boolean z11 = bVar instanceof i.a;
        MediaCodec.BufferInfo bufferInfo = this.f23012d;
        int position = a11.position();
        int remaining = a11.remaining();
        if (z11) {
            c10 &= 4;
        }
        bufferInfo.set(position, remaining, b10, c10);
        this.f23013e.b(this.f23014f, a11, this.f23012d);
        bVar.a().d().b();
        return z11 ? new i.a(q.f14159a) : new i.b(q.f14159a);
    }

    public f f() {
        return this.f23010b;
    }
}
