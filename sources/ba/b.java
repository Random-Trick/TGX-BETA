package ba;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import o9.c;
import o9.d;
import org.thunderdog.challegram.Log;
import x9.i;
import x9.j;
import x9.m;

public class b implements ba.a {
    public static final i f4070i = new i("DefaultDataSink");
    public boolean f4071a;
    public final MediaMuxer f4072b;
    public final List<C0057b> f4073c;
    public ByteBuffer f4074d;
    public final j<c> f4075e;
    public final j<MediaFormat> f4076f;
    public final j<Integer> f4077g;
    public final c f4078h;

    public static class C0057b {
        public final d f4079a;
        public final int f4080b;
        public final long f4081c;
        public final int f4082d;

        public C0057b(d dVar, MediaCodec.BufferInfo bufferInfo) {
            this.f4079a = dVar;
            this.f4080b = bufferInfo.size;
            this.f4081c = bufferInfo.presentationTimeUs;
            this.f4082d = bufferInfo.flags;
        }
    }

    public b(String str) {
        this(str, 0);
    }

    @Override
    public void a() {
        try {
            this.f4072b.release();
        } catch (Exception e10) {
            f4070i.k("Failed to release the muxer.", e10);
        }
    }

    @Override
    public void b(d dVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f4071a) {
            this.f4072b.writeSampleData(this.f4077g.n(dVar).intValue(), byteBuffer, bufferInfo);
        } else {
            h(dVar, byteBuffer, bufferInfo);
        }
    }

    @Override
    public void c(d dVar, c cVar) {
        this.f4075e.e(dVar, cVar);
    }

    @Override
    public void d(int i10) {
        this.f4072b.setOrientationHint(i10);
    }

    @Override
    public void e(d dVar, MediaFormat mediaFormat) {
        i iVar = f4070i;
        iVar.c("setTrackFormat(" + dVar + ") format=" + mediaFormat);
        if (this.f4075e.n(dVar) == c.COMPRESSING) {
            this.f4078h.b(dVar, mediaFormat);
        }
        this.f4076f.e(dVar, mediaFormat);
        i();
    }

    @Override
    public void f(double d10, double d11) {
        this.f4072b.setLocation((float) d10, (float) d11);
    }

    public final void g() {
        if (!this.f4073c.isEmpty()) {
            this.f4074d.flip();
            i iVar = f4070i;
            iVar.c("Output format determined, writing pending data into the muxer. samples:" + this.f4073c.size() + " bytes:" + this.f4074d.limit());
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int i10 = 0;
            for (C0057b bVar : this.f4073c) {
                bufferInfo.set(i10, bVar.f4080b, bVar.f4081c, bVar.f4082d);
                b(bVar.f4079a, this.f4074d, bufferInfo);
                i10 += bVar.f4080b;
            }
            this.f4073c.clear();
            this.f4074d = null;
        }
    }

    public final void h(d dVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f4074d == null) {
            this.f4074d = ByteBuffer.allocateDirect(Log.TAG_PAINT).order(ByteOrder.nativeOrder());
        }
        i iVar = f4070i;
        iVar.h("enqueue(" + dVar + "): offset=" + bufferInfo.offset + "\trealOffset=" + byteBuffer.position() + "\tsize=" + bufferInfo.size + "\trealSize=" + byteBuffer.remaining() + "\tavailable=" + this.f4074d.remaining() + "\ttotal=" + Log.TAG_PAINT);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        this.f4074d.put(byteBuffer);
        this.f4073c.add(new C0057b(dVar, bufferInfo));
    }

    public final void i() {
        if (!this.f4071a) {
            j<c> jVar = this.f4075e;
            d dVar = d.VIDEO;
            boolean a10 = jVar.n(dVar).a();
            j<c> jVar2 = this.f4075e;
            d dVar2 = d.AUDIO;
            boolean a11 = jVar2.n(dVar2).a();
            MediaFormat o10 = this.f4076f.o(dVar);
            MediaFormat o11 = this.f4076f.o(dVar2);
            boolean z10 = false;
            boolean z11 = o10 != null || !a10;
            if (o11 != null || !a11) {
                z10 = true;
            }
            if (z11 && z10) {
                if (a10) {
                    int addTrack = this.f4072b.addTrack(o10);
                    this.f4077g.p(Integer.valueOf(addTrack));
                    i iVar = f4070i;
                    iVar.h("Added track #" + addTrack + " with " + o10.getString("mime") + " to muxer");
                }
                if (a11) {
                    int addTrack2 = this.f4072b.addTrack(o11);
                    this.f4077g.h(Integer.valueOf(addTrack2));
                    i iVar2 = f4070i;
                    iVar2.h("Added track #" + addTrack2 + " with " + o11.getString("mime") + " to muxer");
                }
                this.f4072b.start();
                this.f4071a = true;
                g();
            }
        }
    }

    @Override
    public void stop() {
        this.f4072b.stop();
    }

    public b(String str, int i10) {
        this.f4071a = false;
        this.f4073c = new ArrayList();
        this.f4075e = m.a(null);
        this.f4076f = m.a(null);
        this.f4077g = m.a(null);
        this.f4078h = new c();
        try {
            this.f4072b = new MediaMuxer(str, i10);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
