package e4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c5.j0;
import e4.b;
import e4.l;
import java.nio.ByteBuffer;
import p3.c;
import z6.o;

public final class b implements l {
    public final MediaCodec f10449a;
    public final g f10450b;
    public final e f10451c;
    public final boolean f10452d;
    public final boolean f10453e;
    public boolean f10454f;
    public int f10455g;

    public static final class C0094b implements l.b {
        public final o<HandlerThread> f10456a;
        public final o<HandlerThread> f10457b;
        public final boolean f10458c;
        public final boolean f10459d;

        public C0094b(final int i10, boolean z10, boolean z11) {
            this(new o() {
                @Override
                public final Object get() {
                    HandlerThread e10;
                    e10 = b.C0094b.e(i10);
                    return e10;
                }
            }, new o() {
                @Override
                public final Object get() {
                    HandlerThread f10;
                    f10 = b.C0094b.f(i10);
                    return f10;
                }
            }, z10, z11);
        }

        public static HandlerThread e(int i10) {
            return new HandlerThread(b.t(i10));
        }

        public static HandlerThread f(int i10) {
            return new HandlerThread(b.u(i10));
        }

        public b a(l.a aVar) {
            Exception e10;
            MediaCodec mediaCodec;
            String str = aVar.f10503a.f10511a;
            b bVar = null;
            try {
                String valueOf = String.valueOf(str);
                j0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    b bVar2 = new b(mediaCodec, this.f10456a.get(), this.f10457b.get(), this.f10458c, this.f10459d);
                    try {
                        j0.c();
                        bVar2.w(aVar.f10504b, aVar.f10506d, aVar.f10507e, aVar.f10508f);
                        return bVar2;
                    } catch (Exception e11) {
                        e10 = e11;
                        bVar = bVar2;
                        if (bVar != null) {
                            bVar.a();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e10;
                    }
                } catch (Exception e12) {
                    e10 = e12;
                }
            } catch (Exception e13) {
                e10 = e13;
                mediaCodec = null;
            }
        }

        public C0094b(o<HandlerThread> oVar, o<HandlerThread> oVar2, boolean z10, boolean z11) {
            this.f10456a = oVar;
            this.f10457b = oVar2;
            this.f10458c = z10;
            this.f10459d = z11;
        }
    }

    public static String t(int i10) {
        return v(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String u(int i10) {
        return v(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String v(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void x(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override
    public void a() {
        try {
            if (this.f10455g == 1) {
                this.f10451c.p();
                this.f10450b.p();
            }
            this.f10455g = 2;
        } finally {
            if (!this.f10454f) {
                this.f10449a.release();
                this.f10454f = true;
            }
        }
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public MediaFormat c() {
        return this.f10450b.g();
    }

    @Override
    public void d(Bundle bundle) {
        y();
        this.f10449a.setParameters(bundle);
    }

    @Override
    public void e(int i10, long j10) {
        this.f10449a.releaseOutputBuffer(i10, j10);
    }

    @Override
    public int f() {
        return this.f10450b.c();
    }

    @Override
    public void flush() {
        this.f10451c.i();
        this.f10449a.flush();
        if (this.f10453e) {
            this.f10450b.e(null);
            this.f10449a.start();
            return;
        }
        this.f10450b.e(this.f10449a);
    }

    @Override
    public int g(MediaCodec.BufferInfo bufferInfo) {
        return this.f10450b.d(bufferInfo);
    }

    @Override
    public void h(int i10, boolean z10) {
        this.f10449a.releaseOutputBuffer(i10, z10);
    }

    @Override
    public void i(int i10) {
        y();
        this.f10449a.setVideoScalingMode(i10);
    }

    @Override
    public void j(int i10, int i11, c cVar, long j10, int i12) {
        this.f10451c.n(i10, i11, cVar, j10, i12);
    }

    @Override
    public ByteBuffer k(int i10) {
        return this.f10449a.getInputBuffer(i10);
    }

    @Override
    public void l(Surface surface) {
        y();
        this.f10449a.setOutputSurface(surface);
    }

    @Override
    public void m(int i10, int i11, int i12, long j10, int i13) {
        this.f10451c.m(i10, i11, i12, j10, i13);
    }

    @Override
    public ByteBuffer n(int i10) {
        return this.f10449a.getOutputBuffer(i10);
    }

    @Override
    public void o(final l.c cVar, Handler handler) {
        y();
        this.f10449a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() {
            @Override
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.this.x(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    public final void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f10450b.h(this.f10449a);
        j0.a("configureCodec");
        this.f10449a.configure(mediaFormat, surface, mediaCrypto, i10);
        j0.c();
        this.f10451c.q();
        j0.a("startCodec");
        this.f10449a.start();
        j0.c();
        this.f10455g = 1;
    }

    public final void y() {
        if (this.f10452d) {
            try {
                this.f10451c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.f10449a = mediaCodec;
        this.f10450b = new g(handlerThread);
        this.f10451c = new e(mediaCodec, handlerThread2);
        this.f10452d = z10;
        this.f10453e = z11;
        this.f10455g = 0;
    }
}
