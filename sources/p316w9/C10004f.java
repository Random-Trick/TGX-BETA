package p316w9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import p011aa.AbstractC0237a;
import p192n9.EnumC7311c;
import p192n9.EnumC7313d;
import pa.AbstractC8077a;
import qa.C8298k;

public final class C10004f implements AbstractC0237a {
    public final MediaCodec.BufferInfo f32610a = new MediaCodec.BufferInfo();
    public final AbstractC0237a f32611b;
    public final AbstractC8077a<Boolean> f32612c;

    public C10004f(AbstractC0237a aVar, AbstractC8077a<Boolean> aVar2) {
        C8298k.m12934e(aVar, "sink");
        C8298k.m12934e(aVar2, "ignore");
        this.f32611b = aVar;
        this.f32612c = aVar2;
    }

    @Override
    public void mo6278a() {
        this.f32611b.mo6278a();
    }

    @Override
    public void mo6277b(EnumC7313d dVar, MediaFormat mediaFormat) {
        C8298k.m12934e(dVar, "type");
        C8298k.m12934e(mediaFormat, "format");
        this.f32611b.mo6277b(dVar, mediaFormat);
    }

    @Override
    public void mo6276c(EnumC7313d dVar, EnumC7311c cVar) {
        C8298k.m12934e(dVar, "type");
        C8298k.m12934e(cVar, "status");
        this.f32611b.mo6276c(dVar, cVar);
    }

    @Override
    public void mo6275d(int i) {
        this.f32611b.mo6275d(i);
    }

    @Override
    public void mo6274e(EnumC7313d dVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        C8298k.m12934e(dVar, "type");
        C8298k.m12934e(byteBuffer, "byteBuffer");
        C8298k.m12934e(bufferInfo, "bufferInfo");
        if (this.f32612c.mo4925b().booleanValue()) {
            int i = bufferInfo.flags & (-5);
            int i2 = bufferInfo.size;
            if (i2 > 0 || i != 0) {
                this.f32610a.set(bufferInfo.offset, i2, bufferInfo.presentationTimeUs, i);
                this.f32611b.mo6274e(dVar, byteBuffer, this.f32610a);
                return;
            }
            return;
        }
        this.f32611b.mo6274e(dVar, byteBuffer, bufferInfo);
    }

    @Override
    public void mo6273f(double d, double d2) {
        this.f32611b.mo6273f(d, d2);
    }

    @Override
    public void stop() {
        this.f32611b.stop();
    }
}
