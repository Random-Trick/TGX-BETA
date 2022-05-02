package p059e4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import p020b5.C1186a;
import p020b5.C1210j0;
import p020b5.C1216l0;
import p059e4.AbstractC4134l;
import p216p3.C8020c;

public class C4157x implements AbstractC4134l {
    public final MediaCodec f14055a;
    public final Surface f14056b;
    public ByteBuffer[] f14057c;
    public ByteBuffer[] f14058d;

    public static final class C4159b {
        public static Surface m28649a(MediaCodec mediaCodec) {
            return mediaCodec.createInputSurface();
        }

        public static void m28648b(MediaCodec mediaCodec) {
            mediaCodec.signalEndOfInputStream();
        }
    }

    public static class C4160c implements AbstractC4134l.AbstractC4136b {
        @Override
        public AbstractC4134l mo28647a(AbstractC4134l.C4135a aVar) {
            Throwable e;
            MediaCodec mediaCodec;
            Surface surface;
            Surface surface2 = null;
            try {
                mediaCodec = m28646b(aVar);
                try {
                    C1210j0.m38035a("configureCodec");
                    mediaCodec.configure(aVar.f13944b, aVar.f13946d, aVar.f13947e, aVar.f13948f);
                    C1210j0.m38033c();
                    if (!aVar.f13949g) {
                        surface = null;
                    } else if (C1216l0.f4526a >= 18) {
                        surface = C4159b.m28649a(mediaCodec);
                    } else {
                        throw new IllegalStateException("Encoding from a surface is only supported on API 18 and up.");
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (RuntimeException e3) {
                    e = e3;
                }
                try {
                    C1210j0.m38035a("startCodec");
                    mediaCodec.start();
                    C1210j0.m38033c();
                    return new C4157x(mediaCodec, surface);
                } catch (IOException | RuntimeException e4) {
                    e = e4;
                    surface2 = surface;
                    if (surface2 != null) {
                        surface2.release();
                    }
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException | RuntimeException e5) {
                e = e5;
                mediaCodec = null;
            }
        }

        public MediaCodec m28646b(AbstractC4134l.C4135a aVar) {
            C1186a.m38185e(aVar.f13943a);
            String str = aVar.f13943a.f13952a;
            String valueOf = String.valueOf(str);
            C1210j0.m38035a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C1210j0.m38033c();
            return createByCodecName;
        }
    }

    public void m28650q(AbstractC4134l.AbstractC4137c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo28810a(this, j, j2);
    }

    @Override
    public void mo28666a() {
        this.f14057c = null;
        this.f14058d = null;
        Surface surface = this.f14056b;
        if (surface != null) {
            surface.release();
        }
        this.f14055a.release();
    }

    @Override
    public boolean mo28665b() {
        return false;
    }

    @Override
    public MediaFormat mo28664c() {
        return this.f14055a.getOutputFormat();
    }

    @Override
    public void mo28663d(Bundle bundle) {
        this.f14055a.setParameters(bundle);
    }

    @Override
    public void mo28662e(int i, long j) {
        this.f14055a.releaseOutputBuffer(i, j);
    }

    @Override
    public int mo28661f() {
        return this.f14055a.dequeueInputBuffer(0L);
    }

    @Override
    public void flush() {
        this.f14055a.flush();
    }

    @Override
    public int mo28660g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f14055a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && C1216l0.f4526a < 21) {
                this.f14058d = this.f14055a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override
    public void mo28659h(int i, boolean z) {
        this.f14055a.releaseOutputBuffer(i, z);
    }

    @Override
    public void mo28658i(int i) {
        this.f14055a.setVideoScalingMode(i);
    }

    @Override
    public void mo28657j(int i, int i2, C8020c cVar, long j, int i3) {
        this.f14055a.queueSecureInputBuffer(i, i2, cVar.m13788a(), j, i3);
    }

    @Override
    public ByteBuffer mo28656k(int i) {
        if (C1216l0.f4526a >= 21) {
            return this.f14055a.getInputBuffer(i);
        }
        return ((ByteBuffer[]) C1216l0.m37968j(this.f14057c))[i];
    }

    @Override
    public void mo28655l(Surface surface) {
        this.f14055a.setOutputSurface(surface);
    }

    @Override
    public void mo28654m(int i, int i2, int i3, long j, int i4) {
        this.f14055a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override
    public ByteBuffer mo28653n(int i) {
        if (C1216l0.f4526a >= 21) {
            return this.f14055a.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) C1216l0.m37968j(this.f14058d))[i];
    }

    @Override
    public void mo28652o(final AbstractC4134l.AbstractC4137c cVar, Handler handler) {
        this.f14055a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() {
            @Override
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C4157x.this.m28650q(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    public C4157x(MediaCodec mediaCodec, Surface surface) {
        this.f14055a = mediaCodec;
        this.f14056b = surface;
        if (C1216l0.f4526a < 21) {
            this.f14057c = mediaCodec.getInputBuffers();
            this.f14058d = mediaCodec.getOutputBuffers();
        }
    }
}
