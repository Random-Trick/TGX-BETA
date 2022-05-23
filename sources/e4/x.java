package e4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import c5.j0;
import c5.l0;
import e4.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import p3.c;

public final class x implements l {
    public final MediaCodec f10582a;
    public ByteBuffer[] f10583b;
    public ByteBuffer[] f10584c;

    public static class b implements l.b {
        @Override
        public l a(l.a aVar) {
            Throwable e10;
            MediaCodec b10;
            MediaCodec mediaCodec = null;
            try {
                b10 = b(aVar);
            } catch (IOException e11) {
                e10 = e11;
            } catch (RuntimeException e12) {
                e10 = e12;
            }
            try {
                j0.a("configureCodec");
                b10.configure(aVar.f10504b, aVar.f10506d, aVar.f10507e, aVar.f10508f);
                j0.c();
                j0.a("startCodec");
                b10.start();
                j0.c();
                return new x(b10);
            } catch (IOException | RuntimeException e13) {
                e10 = e13;
                mediaCodec = b10;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e10;
            }
        }

        public MediaCodec b(l.a aVar) {
            c5.a.e(aVar.f10503a);
            String str = aVar.f10503a.f10511a;
            String valueOf = String.valueOf(str);
            j0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            j0.c();
            return createByCodecName;
        }
    }

    public void q(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override
    public void a() {
        this.f10583b = null;
        this.f10584c = null;
        this.f10582a.release();
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public MediaFormat c() {
        return this.f10582a.getOutputFormat();
    }

    @Override
    public void d(Bundle bundle) {
        this.f10582a.setParameters(bundle);
    }

    @Override
    public void e(int i10, long j10) {
        this.f10582a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public int f() {
        return this.f10582a.dequeueInputBuffer(0L);
    }

    @Override
    public void flush() {
        this.f10582a.flush();
    }

    @Override
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f10582a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && l0.f4841a < 21) {
                this.f10584c = this.f10582a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public void h(int i10, boolean z10) {
        this.f10582a.releaseOutputBuffer(i10, z10);
    }

    @Override
    public void i(int i10) {
        this.f10582a.setVideoScalingMode(i10);
    }

    @Override
    public void j(int i10, int i11, c cVar, long j10, int i12) {
        this.f10582a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override
    public ByteBuffer k(int i10) {
        if (l0.f4841a >= 21) {
            return this.f10582a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) l0.j(this.f10583b))[i10];
    }

    @Override
    public void l(Surface surface) {
        this.f10582a.setOutputSurface(surface);
    }

    @Override
    public void m(int i10, int i11, int i12, long j10, int i13) {
        this.f10582a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override
    public ByteBuffer n(int i10) {
        if (l0.f4841a >= 21) {
            return this.f10582a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) l0.j(this.f10584c))[i10];
    }

    @Override
    public void o(final l.c cVar, Handler handler) {
        this.f10582a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() {
            @Override
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                x.this.q(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    public x(MediaCodec mediaCodec) {
        this.f10582a = mediaCodec;
        if (l0.f4841a < 21) {
            this.f10583b = mediaCodec.getInputBuffers();
            this.f10584c = mediaCodec.getOutputBuffers();
        }
    }
}
