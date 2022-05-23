package e4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import c5.g;
import c5.l0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p3.c;

public class e {
    public static final ArrayDeque<b> f10462g = new ArrayDeque<>();
    public static final Object f10463h = new Object();
    public final MediaCodec f10464a;
    public final HandlerThread f10465b;
    public Handler f10466c;
    public final AtomicReference<RuntimeException> f10467d;
    public final g f10468e;
    public boolean f10469f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    public static class b {
        public int f10471a;
        public int f10472b;
        public int f10473c;
        public final MediaCodec.CryptoInfo f10474d = new MediaCodec.CryptoInfo();
        public long f10475e;
        public int f10476f;

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f10471a = i10;
            this.f10472b = i11;
            this.f10473c = i12;
            this.f10475e = j10;
            this.f10476f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new g());
    }

    public static void c(c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f20467f;
        cryptoInfo.numBytesOfClearData = e(cVar.f20465d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f20466e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) c5.a.e(d(cVar.f20463b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) c5.a.e(d(cVar.f20462a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f20464c;
        if (l0.f4841a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f20468g, cVar.f20469h));
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b k() {
        ArrayDeque<b> arrayDeque = f10462g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    public static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f10462g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public final void b() {
        this.f10468e.c();
        ((Handler) c5.a.e(this.f10466c)).obtainMessage(2).sendToTarget();
        this.f10468e.a();
    }

    public final void f(Message message) {
        int i10 = message.what;
        b bVar = null;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f10471a, bVar.f10472b, bVar.f10473c, bVar.f10475e, bVar.f10476f);
        } else if (i10 == 1) {
            bVar = (b) message.obj;
            h(bVar.f10471a, bVar.f10472b, bVar.f10474d, bVar.f10475e, bVar.f10476f);
        } else if (i10 != 2) {
            this.f10467d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f10468e.e();
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    public final void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f10464a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            this.f10467d.compareAndSet(null, e10);
        }
    }

    public final void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f10463h) {
                this.f10464a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            this.f10467d.compareAndSet(null, e10);
        }
    }

    public void i() {
        if (this.f10469f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void j() {
        ((Handler) c5.a.e(this.f10466c)).removeCallbacksAndMessages(null);
        b();
    }

    public final void l() {
        RuntimeException andSet = this.f10467d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) l0.j(this.f10466c)).obtainMessage(0, k10).sendToTarget();
    }

    public void n(int i10, int i11, c cVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(cVar, k10.f10474d);
        ((Handler) l0.j(this.f10466c)).obtainMessage(1, k10).sendToTarget();
    }

    public void p() {
        if (this.f10469f) {
            i();
            this.f10465b.quit();
        }
        this.f10469f = false;
    }

    public void q() {
        if (!this.f10469f) {
            this.f10465b.start();
            this.f10466c = new a(this.f10465b.getLooper());
            this.f10469f = true;
        }
    }

    public void r() {
        b();
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread, g gVar) {
        this.f10464a = mediaCodec;
        this.f10465b = handlerThread;
        this.f10468e = gVar;
        this.f10467d = new AtomicReference<>();
    }
}
