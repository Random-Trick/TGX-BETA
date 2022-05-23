package e4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c5.a;
import c5.l0;
import java.util.ArrayDeque;

public final class g extends MediaCodec.Callback {
    public final HandlerThread f10480b;
    public Handler f10481c;
    public MediaFormat f10486h;
    public MediaFormat f10487i;
    public MediaCodec.CodecException f10488j;
    public long f10489k;
    public boolean f10490l;
    public IllegalStateException f10491m;
    public final Object f10479a = new Object();
    public final k f10482d = new k();
    public final k f10483e = new k();
    public final ArrayDeque<MediaCodec.BufferInfo> f10484f = new ArrayDeque<>();
    public final ArrayDeque<MediaFormat> f10485g = new ArrayDeque<>();

    public g(HandlerThread handlerThread) {
        this.f10480b = handlerThread;
    }

    public final void b(MediaFormat mediaFormat) {
        this.f10483e.a(-2);
        this.f10485g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.f10479a) {
            int i10 = -1;
            if (i()) {
                return -1;
            }
            k();
            if (!this.f10482d.d()) {
                i10 = this.f10482d.e();
            }
            return i10;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10479a) {
            if (i()) {
                return -1;
            }
            k();
            if (this.f10483e.d()) {
                return -1;
            }
            int e10 = this.f10483e.e();
            if (e10 >= 0) {
                a.h(this.f10486h);
                MediaCodec.BufferInfo remove = this.f10484f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e10 == -2) {
                this.f10486h = this.f10485g.remove();
            }
            return e10;
        }
    }

    public void e(final MediaCodec mediaCodec) {
        synchronized (this.f10479a) {
            this.f10489k++;
            ((Handler) l0.j(this.f10481c)).post(new Runnable() {
                @Override
                public final void run() {
                    g.this.j(mediaCodec);
                }
            });
        }
    }

    public final void f() {
        if (!this.f10485g.isEmpty()) {
            this.f10487i = this.f10485g.getLast();
        }
        this.f10482d.b();
        this.f10483e.b();
        this.f10484f.clear();
        this.f10485g.clear();
        this.f10488j = null;
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f10479a) {
            mediaFormat = this.f10486h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        a.f(this.f10481c == null);
        this.f10480b.start();
        Handler handler = new Handler(this.f10480b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f10481c = handler;
    }

    public final boolean i() {
        return this.f10489k > 0 || this.f10490l;
    }

    public final void k() {
        l();
        m();
    }

    public final void l() {
        IllegalStateException illegalStateException = this.f10491m;
        if (illegalStateException != null) {
            this.f10491m = null;
            throw illegalStateException;
        }
    }

    public final void m() {
        MediaCodec.CodecException codecException = this.f10488j;
        if (codecException != null) {
            this.f10488j = null;
            throw codecException;
        }
    }

    public final void j(MediaCodec mediaCodec) {
        synchronized (this.f10479a) {
            if (!this.f10490l) {
                long j10 = this.f10489k - 1;
                this.f10489k = j10;
                if (j10 <= 0) {
                    if (j10 < 0) {
                        o(new IllegalStateException());
                        return;
                    }
                    f();
                    if (mediaCodec != null) {
                        try {
                            mediaCodec.start();
                        } catch (IllegalStateException e10) {
                            o(e10);
                        } catch (Exception e11) {
                            o(new IllegalStateException(e11));
                        }
                    }
                }
            }
        }
    }

    public final void o(IllegalStateException illegalStateException) {
        synchronized (this.f10479a) {
            this.f10491m = illegalStateException;
        }
    }

    @Override
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10479a) {
            this.f10488j = codecException;
        }
    }

    @Override
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f10479a) {
            this.f10482d.a(i10);
        }
    }

    @Override
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f10479a) {
            MediaFormat mediaFormat = this.f10487i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f10487i = null;
            }
            this.f10483e.a(i10);
            this.f10484f.add(bufferInfo);
        }
    }

    @Override
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10479a) {
            b(mediaFormat);
            this.f10487i = null;
        }
    }

    public void p() {
        synchronized (this.f10479a) {
            this.f10490l = true;
            this.f10480b.quit();
            f();
        }
    }
}
