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
                    e = C4120b.C4122b.m28865e(i);
                    return e;
                }
            }, new AbstractC10444n() {
                @Override
                public final Object get() {
                    HandlerThread f;
                    f = C4120b.C4122b.m28864f(i);
                    return f;
                }
            }, z, z2);
        }

        public static HandlerThread m28865e(int i) {
            return new HandlerThread(C4120b.m28874t(i));
        }

        public static HandlerThread m28864f(int i) {
            return new HandlerThread(C4120b.m28873u(i));
        }

        public C4120b mo28647a(AbstractC4134l.C4135a aVar) {
            Exception e;
            MediaCodec mediaCodec;
            C4120b bVar;
            String str = aVar.f13943a.f13952a;
            C4120b bVar2 = null;
            try {
                String valueOf = String.valueOf(str);
                C1210j0.m38035a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
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
                C1210j0.m38033c();
                bVar.m28871w(aVar.f13944b, aVar.f13946d, aVar.f13947e, aVar.f13948f, aVar.f13949g);
                return bVar;
            } catch (Exception e4) {
                e = e4;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.mo28666a();
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

    public static String m28874t(int i) {
        return m28872v(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String m28873u(int i) {
        return m28872v(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String m28872v(int i, String str) {
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

    public void m28870x(AbstractC4134l.AbstractC4137c cVar, MediaCodec mediaCodec, long j, long j2) {
        cVar.mo28810a(this, j, j2);
    }

    @Override
    public void mo28666a() {
        try {
            if (this.f13891g == 1) {
                this.f13887c.m28848p();
                this.f13886b.m28829p();
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
    public boolean mo28665b() {
        return false;
    }

    @Override
    public MediaFormat mo28664c() {
        return this.f13886b.m28838g();
    }

    @Override
    public void mo28663d(Bundle bundle) {
        m28869y();
        this.f13885a.setParameters(bundle);
    }

    @Override
    public void mo28662e(int i, long j) {
        this.f13885a.releaseOutputBuffer(i, j);
    }

    @Override
    public int mo28661f() {
        return this.f13886b.m28842c();
    }

    @Override
    public void flush() {
        this.f13887c.m28855i();
        this.f13885a.flush();
        if (this.f13889e) {
            this.f13886b.m28840e(null);
            this.f13885a.start();
            return;
        }
        this.f13886b.m28840e(this.f13885a);
    }

    @Override
    public int mo28660g(MediaCodec.BufferInfo bufferInfo) {
        return this.f13886b.m28841d(bufferInfo);
    }

    @Override
    public void mo28659h(int i, boolean z) {
        this.f13885a.releaseOutputBuffer(i, z);
    }

    @Override
    public void mo28658i(int i) {
        m28869y();
        this.f13885a.setVideoScalingMode(i);
    }

    @Override
    public void mo28657j(int i, int i2, C8020c cVar, long j, int i3) {
        this.f13887c.m28850n(i, i2, cVar, j, i3);
    }

    @Override
    public ByteBuffer mo28656k(int i) {
        return this.f13885a.getInputBuffer(i);
    }

    @Override
    public void mo28655l(Surface surface) {
        m28869y();
        this.f13885a.setOutputSurface(surface);
    }

    @Override
    public void mo28654m(int i, int i2, int i3, long j, int i4) {
        this.f13887c.m28851m(i, i2, i3, j, i4);
    }

    @Override
    public ByteBuffer mo28653n(int i) {
        return this.f13885a.getOutputBuffer(i);
    }

    @Override
    public void mo28652o(final AbstractC4134l.AbstractC4137c cVar, Handler handler) {
        m28869y();
        this.f13885a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() {
            @Override
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                C4120b.this.m28870x(cVar, mediaCodec, j, j2);
            }
        }, handler);
    }

    public final void m28871w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.f13886b.m28837h(this.f13885a);
        C1210j0.m38035a("configureCodec");
        this.f13885a.configure(mediaFormat, surface, mediaCrypto, i);
        C1210j0.m38033c();
        if (z) {
            this.f13892h = this.f13885a.createInputSurface();
        }
        this.f13887c.m28847q();
        C1210j0.m38035a("startCodec");
        this.f13885a.start();
        C1210j0.m38033c();
        this.f13891g = 1;
    }

    public final void m28869y() {
        if (this.f13888d) {
            try {
                this.f13887c.m28846r();
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
