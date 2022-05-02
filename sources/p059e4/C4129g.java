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

    public final void m28843b(MediaFormat mediaFormat) {
        this.f13920e.m28817a(-2);
        this.f13922g.add(mediaFormat);
    }

    public int m28842c() {
        synchronized (this.f13916a) {
            int i = -1;
            if (m28836i()) {
                return -1;
            }
            m28834k();
            if (!this.f13919d.m28814d()) {
                i = this.f13919d.m28813e();
            }
            return i;
        }
    }

    public int m28841d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13916a) {
            if (m28836i()) {
                return -1;
            }
            m28834k();
            if (this.f13920e.m28814d()) {
                return -1;
            }
            int e = this.f13920e.m28813e();
            if (e >= 0) {
                C1186a.m38182h(this.f13923h);
                MediaCodec.BufferInfo remove = this.f13921f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e == -2) {
                this.f13923h = this.f13922g.remove();
            }
            return e;
        }
    }

    public void m28840e(final MediaCodec mediaCodec) {
        synchronized (this.f13916a) {
            this.f13926k++;
            ((Handler) C1216l0.m37968j(this.f13918c)).post(new Runnable() {
                @Override
                public final void run() {
                    C4129g.this.m28835j(mediaCodec);
                }
            });
        }
    }

    public final void m28839f() {
        if (!this.f13922g.isEmpty()) {
            this.f13924i = this.f13922g.getLast();
        }
        this.f13919d.m28816b();
        this.f13920e.m28816b();
        this.f13921f.clear();
        this.f13922g.clear();
        this.f13925j = null;
    }

    public MediaFormat m28838g() {
        MediaFormat mediaFormat;
        synchronized (this.f13916a) {
            mediaFormat = this.f13923h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void m28837h(MediaCodec mediaCodec) {
        C1186a.m38184f(this.f13918c == null);
        this.f13917b.start();
        Handler handler = new Handler(this.f13917b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f13918c = handler;
    }

    public final boolean m28836i() {
        return this.f13926k > 0 || this.f13927l;
    }

    public final void m28834k() {
        m28833l();
        m28832m();
    }

    public final void m28833l() {
        IllegalStateException illegalStateException = this.f13928m;
        if (illegalStateException != null) {
            this.f13928m = null;
            throw illegalStateException;
        }
    }

    public final void m28832m() {
        MediaCodec.CodecException codecException = this.f13925j;
        if (codecException != null) {
            this.f13925j = null;
            throw codecException;
        }
    }

    public final void m28835j(MediaCodec mediaCodec) {
        synchronized (this.f13916a) {
            if (!this.f13927l) {
                long j = this.f13926k - 1;
                this.f13926k = j;
                if (j <= 0) {
                    if (j < 0) {
                        m28830o(new IllegalStateException());
                        return;
                    }
                    m28839f();
                    if (mediaCodec != null) {
                        try {
                            mediaCodec.start();
                        } catch (IllegalStateException e) {
                            m28830o(e);
                        } catch (Exception e2) {
                            m28830o(new IllegalStateException(e2));
                        }
                    }
                }
            }
        }
    }

    public final void m28830o(IllegalStateException illegalStateException) {
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
            this.f13919d.m28817a(i);
        }
    }

    @Override
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13916a) {
            MediaFormat mediaFormat = this.f13924i;
            if (mediaFormat != null) {
                m28843b(mediaFormat);
                this.f13924i = null;
            }
            this.f13920e.m28817a(i);
            this.f13921f.add(bufferInfo);
        }
    }

    @Override
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f13916a) {
            m28843b(mediaFormat);
            this.f13924i = null;
        }
    }

    public void m28829p() {
        synchronized (this.f13916a) {
            this.f13927l = true;
            this.f13917b.quit();
            m28839f();
        }
    }
}
