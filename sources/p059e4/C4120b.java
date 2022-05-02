package p059e4;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import p020b5.C1210j0;
import p059e4.AbstractC4134l;
import p059e4.C4120b;
import p216p3.C8020c;
import p343y6.AbstractC10444n;

public final class C4120b implements AbstractC4134l {
    public final MediaCodec f13885a;
    public final C4129g f13886b;
    public final C4125e f13887c;
    public final boolean f13888d;
    public final boolean f13889e;
    public boolean f13890f;
    public int f13891g;
    public Surface f13892h;

    public static final class C4122b implements AbstractC4134l.AbstractC4136b {
        public final AbstractC10444n<HandlerThread> f13893a;
        public final AbstractC10444n<HandlerThread> f13894b;
        public final boolean f13895c;
        public final boolean f13896d;

        public C4122b(final int i, boolean z, boolean z2) {
            this(new AbstractC10444n() {
                @Override
                public final Object get() {
                    HandlerThread e;
                    e = C4120b.C4122b.m28867e(i);
                    return e;
                }
            }, new AbstractC10444n() {
                @Override
                public final Object get() {
                    HandlerThread f;
                    f = C4120b.C4122b.m28866f(i);
                    return f;
                }
            }, z, z2);
        }

        public static HandlerThread m28867e(int i) {
            return new HandlerThread(C4120b.m28876t(i));
        }

        public static HandlerThread m28866f(int i) {
            return new HandlerThread(C4120b.m28875u(i));
        }

        public C4120b mo28649a(AbstractC4134l.C4135a aVar) {
            Exception e;
            MediaCodec mediaCodec;
            C4120b bVar;
            String str = aVar.f13943a.f13952a;
            C4120b bVar2 = null;
            try {
                String valueOf = String.valueOf(str);
                C1210j0.m38038a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    bVar = new C4120b(mediaCodec, this.f13893a.get(), this.f13894b.get(), this.f13895c, this.f13896d);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
            try {
                C1210j0.m38036c();
                bVar.m28873w(aVar.f13944b, aVar.f13946d, aVar.f13947e, aVar.f13948f, aVar.f13949g);
                return bVar;
            } catch (Exception e4) {
                e = e4;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.mo28668a();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        public C4122b(AbstractC10444n<HandlerThread> nVar, AbstractC10444n<HandlerThread> nVar2, boolean z, boolean z2) {
            this.f13893a = nVar;
            this.f13894b = nVar2;
            this.f13895c = z;
            this.f13896d = z2;
        }
    }

    public static String m28876t(int i) {
        return m28874v(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String m28875u(int i) {
        return m28874v(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String m28874v(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void m28872x(AbstractC4134l.AbstractC4137c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo28812a(this, j, j2);
    }

    @Override
    public void mo28668a() {
        try {
            if (this.f13891g == 1) {
                this.f13887c.m28850p();
                this.f13886b.m28831p();
            }
            this.f13891g = 2;
        } finally {
            Surface surface = this.f13892h;
            if (surface != null) {
                surface.release();
            }
            if (!this.f13890f) {
                this.f13885a.release();
                this.f13890f = true;
            }
        }
    }

    @Override
    public boolean mo28667b() {
        return false;
    }

    @Override
    public MediaFormat mo28666c() {
        return this.f13886b.m28840g();
    }

    @Override
    public void mo28665d(Bundle bundle) {
        m28871y();
        this.f13885a.setParameters(bundle);
    }

    @Override
    public void mo28664e(int i, long j) {
        this.f13885a.releaseOutputBuffer(i, j);
    }

    @Override
    public int mo28663f() {
        return this.f13886b.m28844c();
    }

    @Override
    public void flush() {
        this.f13887c.m28857i();
        this.f13885a.flush();
        if (this.f13889e) {
            this.f13886b.m28842e(null);
            this.f13885a.start();
            return;
        }
        this.f13886b.m28842e(this.f13885a);
    }

    @Override
    public int mo28662g(MediaCodec.BufferInfo bufferInfo) {
        return this.f13886b.m28843d(bufferInfo);
    }

    @Override
    public void mo28661h(int i, boolean z) {
        this.f13885a.releaseOutputBuffer(i, z);
    }

    @Override
    public void mo28660i(int i) {
        m28871y();
        this.f13885a.setVideoScalingMode(i);
    }

    @Override
    public void mo28659j(int i, int i2, C8020c cVar, long j, int i3) {
        this.f13887c.m28852n(i, i2, cVar, j, i3);
    }

    @Override
    public ByteBuffer mo28658k(int i) {
        return this.f13885a.getInputBuffer(i);
    }

    @Override
    public void mo28657l(Surface surface) {
        m28871y();
        this.f13885a.setOutputSurface(surface);
    }

    @Override
    public void mo28656m(int i, int i2, int i3, long j, int i4) {
        this.f13887c.m28853m(i, i2, i3, j, i4);
    }

    @Override
    public ByteBuffer mo28655n(int i) {
        return this.f13885a.getOutputBuffer(i);
    }

    @Override
    public void mo28654o(final AbstractC4134l.AbstractC4137c cVar, Handler handler) {
        m28871y();
        this.f13885a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() {
            @Override
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C4120b.this.m28872x(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    public final void m28873w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.f13886b.m28839h(this.f13885a);
        C1210j0.m38038a("configureCodec");
        this.f13885a.configure(mediaFormat, surface, mediaCrypto, i);
        C1210j0.m38036c();
        if (z) {
            this.f13892h = this.f13885a.createInputSurface();
        }
        this.f13887c.m28849q();
        C1210j0.m38038a("startCodec");
        this.f13885a.start();
        C1210j0.m38036c();
        this.f13891g = 1;
    }

    public final void m28871y() {
        if (this.f13888d) {
            try {
                this.f13887c.m28848r();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public C4120b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f13885a = mediaCodec;
        this.f13886b = new C4129g(handlerThread);
        this.f13887c = new C4125e(mediaCodec, handlerThread2);
        this.f13888d = z;
        this.f13889e = z2;
        this.f13891g = 0;
    }
}
