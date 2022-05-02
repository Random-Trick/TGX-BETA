package p059e4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p020b5.C1186a;
import p020b5.C1198g;
import p020b5.C1216l0;
import p216p3.C8020c;

public class C4125e {
    public static final ArrayDeque<C4127b> f13899g = new ArrayDeque<>();
    public static final Object f13900h = new Object();
    public final MediaCodec f13901a;
    public final HandlerThread f13902b;
    public Handler f13903c;
    public final AtomicReference<RuntimeException> f13904d;
    public final C1198g f13905e;
    public boolean f13906f;

    public class HandlerC4126a extends Handler {
        public HandlerC4126a(Looper looper) {
            super(looper);
        }

        @Override
        public void handleMessage(Message message) {
            C4125e.this.m28858f(message);
        }
    }

    public static class C4127b {
        public int f13908a;
        public int f13909b;
        public int f13910c;
        public final MediaCodec.CryptoInfo f13911d = new MediaCodec.CryptoInfo();
        public long f13912e;
        public int f13913f;

        public void m28845a(int i, int i2, int i3, long j, int i4) {
            this.f13908a = i;
            this.f13909b = i2;
            this.f13910c = i3;
            this.f13912e = j;
            this.f13913f = i4;
        }
    }

    public C4125e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C1198g());
    }

    public static void m28861c(C8020c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f26107f;
        cryptoInfo.numBytesOfClearData = m28859e(cVar.f26105d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = m28859e(cVar.f26106e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C1186a.m38185e(m28860d(cVar.f26103b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C1186a.m38185e(m28860d(cVar.f26102a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f26104c;
        if (C1216l0.f4526a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f26108g, cVar.f26109h));
        }
    }

    public static byte[] m28860d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] m28859e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static C4127b m28853k() {
        ArrayDeque<C4127b> arrayDeque = f13899g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new C4127b();
            }
            return arrayDeque.removeFirst();
        }
    }

    public static void m28849o(C4127b bVar) {
        ArrayDeque<C4127b> arrayDeque = f13899g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public final void m28862b() {
        this.f13905e.m38078c();
        ((Handler) C1186a.m38185e(this.f13903c)).obtainMessage(2).sendToTarget();
        this.f13905e.m38080a();
    }

    public final void m28858f(Message message) {
        int i = message.what;
        C4127b bVar = null;
        if (i == 0) {
            bVar = (C4127b) message.obj;
            m28857g(bVar.f13908a, bVar.f13909b, bVar.f13910c, bVar.f13912e, bVar.f13913f);
        } else if (i == 1) {
            bVar = (C4127b) message.obj;
            m28856h(bVar.f13908a, bVar.f13909b, bVar.f13911d, bVar.f13912e, bVar.f13913f);
        } else if (i != 2) {
            this.f13904d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f13905e.m38076e();
        }
        if (bVar != null) {
            m28849o(bVar);
        }
    }

    public final void m28857g(int i, int i2, int i3, long j, int i4) {
        try {
            this.f13901a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            this.f13904d.compareAndSet(null, e);
        }
    }

    public final void m28856h(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (f13900h) {
                this.f13901a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            this.f13904d.compareAndSet(null, e);
        }
    }

    public void m28855i() {
        if (this.f13906f) {
            try {
                m28854j();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void m28854j() {
        ((Handler) C1186a.m38185e(this.f13903c)).removeCallbacksAndMessages(null);
        m28862b();
    }

    public final void m28852l() {
        RuntimeException andSet = this.f13904d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void m28851m(int i, int i2, int i3, long j, int i4) {
        m28852l();
        C4127b k = m28853k();
        k.m28845a(i, i2, i3, j, i4);
        ((Handler) C1216l0.m37968j(this.f13903c)).obtainMessage(0, k).sendToTarget();
    }

    public void m28850n(int i, int i2, C8020c cVar, long j, int i3) {
        m28852l();
        C4127b k = m28853k();
        k.m28845a(i, i2, 0, j, i3);
        m28861c(cVar, k.f13911d);
        ((Handler) C1216l0.m37968j(this.f13903c)).obtainMessage(1, k).sendToTarget();
    }

    public void m28848p() {
        if (this.f13906f) {
            m28855i();
            this.f13902b.quit();
        }
        this.f13906f = false;
    }

    public void m28847q() {
        if (!this.f13906f) {
            this.f13902b.start();
            this.f13903c = new HandlerC4126a(this.f13902b.getLooper());
            this.f13906f = true;
        }
    }

    public void m28846r() {
        m28862b();
    }

    public C4125e(MediaCodec mediaCodec, HandlerThread handlerThread, C1198g gVar) {
        this.f13901a = mediaCodec;
        this.f13902b = handlerThread;
        this.f13905e = gVar;
        this.f13904d = new AtomicReference<>();
    }
}
