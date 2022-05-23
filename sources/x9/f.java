package x9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import ba.a;
import java.nio.ByteBuffer;
import o9.c;
import o9.d;
import ra.k;

public final class f implements a {
    public final MediaCodec.BufferInfo f26178a = new MediaCodec.BufferInfo();
    public final a f26179b;
    public final qa.a<Boolean> f26180c;

    public f(a aVar, qa.a<Boolean> aVar2) {
        k.e(aVar, "sink");
        k.e(aVar2, "ignore");
        this.f26179b = aVar;
        this.f26180c = aVar2;
    }

    @Override
    public void a() {
        this.f26179b.a();
    }

    @Override
    public void b(d dVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        k.e(dVar, "type");
        k.e(byteBuffer, "byteBuffer");
        k.e(bufferInfo, "bufferInfo");
        if (this.f26180c.b().booleanValue()) {
            int i10 = bufferInfo.flags & (-5);
            int i11 = bufferInfo.size;
            if (i11 > 0 || i10 != 0) {
                this.f26178a.set(bufferInfo.offset, i11, bufferInfo.presentationTimeUs, i10);
                this.f26179b.b(dVar, byteBuffer, this.f26178a);
                return;
            }
            return;
        }
        this.f26179b.b(dVar, byteBuffer, bufferInfo);
    }

    @Override
    public void c(d dVar, c cVar) {
        k.e(dVar, "type");
        k.e(cVar, "status");
        this.f26179b.c(dVar, cVar);
    }

    @Override
    public void d(int i10) {
        this.f26179b.d(i10);
    }

    @Override
    public void e(d dVar, MediaFormat mediaFormat) {
        k.e(dVar, "type");
        k.e(mediaFormat, "format");
        this.f26179b.e(dVar, mediaFormat);
    }

    @Override
    public void f(double d10, double d11) {
        this.f26179b.f(d10, d11);
    }

    @Override
    public void stop() {
        this.f26179b.stop();
    }
}
