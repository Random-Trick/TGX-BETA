package p059e4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p020b5.C1186a;
import p020b5.C1216l0;

public final class C4129g extends MediaCodec.Callback {
    public final HandlerThread f13917b;
    public Handler f13918c;
    public MediaFormat f13923h;
    public MediaFormat f13924i;
    public MediaCodec.CodecException f13925j;
    public long f13926k;
    public boolean f13927l;
    public IllegalStateException f13928m;
    public final Object f13916a = new Object();
    public final C4133k f13919d = new C4133k();
    public final C4133k f13920e = new C4133k();
    public final ArrayDeque<MediaCodec.BufferInfo> f13921f = new ArrayDeque<>();
    public final ArrayDeque<MediaFormat> f13922g = new ArrayDeque<>();

    public C4129g(HandlerThread handlerThread) {
        this.f13917b = handlerThread;
    }

    public final void m28845b(MediaFormat mediaFormat) {
        this.f13920e.m28819a(-2);
        this.f13922g.add(mediaFormat);
    }

    public int m28844c() {
        synchronized (this.f13916a) {
            int i = -1;
            if (m28838i()) {
                return -1;
            }
            m28836k();
            if (!this.f13919d.m28816d()) {
                i = this.f13919d.m28815e();
            }
            return i;
        }
    }

    public int m28843d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13916a) {
            if (m28838i()) {
                return -1;
            }
            m28836k();
            if (this.f13920e.m28816d()) {
                return -1;
            }
            int e = this.f13920e.m28815e();
            if (e >= 0) {
                C1186a.m38185h(this.f13923h);
                MediaCodec.BufferInfo remove = this.f13921f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e == -2) {
                this.f13923h = this.f13922g.remove();
            }
            return e;
        }
    }

    public void m28842e(final MediaCodec mediaCodec) {
        synchronized (this.f13916a) {
            this.f13926k++;
            ((Handler) C1216l0.m37971j(this.f13918c)).post(new Runnable() {
                @Override
                public final void run() {
                    C4129g.this.m28837j(mediaCodec);
                }
            });
        }
    }

    public final void m28841f() {
        if (!this.f13922g.isEmpty()) {
            this.f13924i = this.f13922g.getLast();
        }
        this.f13919d.m28818b();
        this.f13920e.m28818b();
        this.f13921f.clear();
        this.f13922g.clear();
        this.f13925j = null;
    }

    public MediaFormat m28840g() {
        MediaFormat mediaFormat;
        synchronized (this.f13916a) {
            mediaFormat = this.f13923h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void m28839h(MediaCodec mediaCodec) {
        C1186a.m38187f(this.f13918c == null);
        this.f13917b.start();
        Handler handler = new Handler(this.f13917b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f13918c = handler;
    }

    public final boolean m28838i() {
        return this.f13926k > 0 || this.f13927l;
    }

    public final void m28836k() {
        m28835l();
        m28834m();
    }

    public final void m28835l() {
        IllegalStateException illegalStateException = this.f13928m;
        if (illegalStateException != null) {
            this.f13928m = null;
            throw illegalStateException;
        }
    }

    public final void m28834m() {
        MediaCodec.CodecException codecException = this.f13925j;
        if (codecException != null) {
            this.f13925j = null;
            throw codecException;
        }
    }

    public final void m28837j(MediaCodec mediaCodec) {
        synchronized (this.f13916a) {
            if (!this.f13927l) {
                long j = this.f13926k - 1;
                this.f13926k = j;
                if (j <= 0) {
                    if (j < 0) {
                        m28832o(new IllegalStateException());
                        return;
                    }
                    m28841f();
                    if (mediaCodec != null) {
                        try {
                            mediaCodec.start();
                        } catch (IllegalStateException e) {
                            m28832o(e);
                        } catch (Exception e2) {
                            m28832o(new IllegalStateException(e2));
                        }
                    }
                }
            }
        }
    }

    public final void m28832o(IllegalStateException illegalStateException) {
        synchronized (this.f13916a) {
            this.f13928m = illegalStateException;
        }
    }

    @Override
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f13916a) {
            this.f13925j = codecException;
        }
    }

    @Override
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f13916a) {
            this.f13919d.m28819a(i);
        }
    }

    @Override
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13916a) {
            MediaFormat mediaFormat = this.f13924i;
            if (mediaFormat != null) {
                m28845b(mediaFormat);
                this.f13924i = null;
            }
            this.f13920e.m28819a(i);
            this.f13921f.add(bufferInfo);
        }
    }

    @Override
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f13916a) {
            m28845b(mediaFormat);
            this.f13924i = null;
        }
    }

    public void m28831p() {
        synchronized (this.f13916a) {
            this.f13927l = true;
            this.f13917b.quit();
            m28841f();
        }
    }
}
