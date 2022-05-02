package p216p3;

import com.google.android.exoplayer2.decoder.AbstractC3437a;
import java.util.ArrayDeque;
import p020b5.C1186a;
import p216p3.C8025f;
import p216p3.C8026g;

public abstract class AbstractC8029i<I extends C8026g, O extends AbstractC3437a, E extends C8025f> implements AbstractC8023d<I, O, E> {
    public final Thread f26143a;
    public final Object f26144b = new Object();
    public final ArrayDeque<I> f26145c = new ArrayDeque<>();
    public final ArrayDeque<O> f26146d = new ArrayDeque<>();
    public final I[] f26147e;
    public final O[] f26148f;
    public int f26149g;
    public int f26150h;
    public I f26151i;
    public E f26152j;
    public boolean f26153k;
    public boolean f26154l;
    public int f26155m;

    public class C8030a extends Thread {
        public C8030a(String str) {
            super(str);
        }

        @Override
        public void run() {
            AbstractC8029i.this.m13762v();
        }
    }

    public AbstractC8029i(I[] iArr, O[] oArr) {
        this.f26147e = iArr;
        this.f26149g = iArr.length;
        for (int i = 0; i < this.f26149g; i++) {
            this.f26147e[i] = mo13729i();
        }
        this.f26148f = oArr;
        this.f26150h = oArr.length;
        for (int i2 = 0; i2 < this.f26150h; i2++) {
            this.f26148f[i2] = mo13728j();
        }
        C8030a aVar = new C8030a("ExoPlayer:SimpleDecoder");
        this.f26143a = aVar;
        aVar.start();
    }

    @Override
    public void mo13074a() {
        synchronized (this.f26144b) {
            this.f26154l = true;
            this.f26144b.notify();
        }
        try {
            this.f26143a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public final void flush() {
        synchronized (this.f26144b) {
            this.f26153k = true;
            this.f26155m = 0;
            I i = this.f26151i;
            if (i != null) {
                m13765s(i);
                this.f26151i = null;
            }
            while (!this.f26145c.isEmpty()) {
                m13765s(this.f26145c.removeFirst());
            }
            while (!this.f26146d.isEmpty()) {
                this.f26146d.removeFirst().release();
            }
        }
    }

    public final boolean m13772h() {
        return !this.f26145c.isEmpty() && this.f26150h > 0;
    }

    public abstract I mo13729i();

    public abstract O mo13728j();

    public abstract E mo13727k(Throwable th);

    public abstract E mo13726l(I i, O o, boolean z);

    public final boolean m13771m() {
        E e;
        synchronized (this.f26144b) {
            while (!this.f26154l && !m13772h()) {
                this.f26144b.wait();
            }
            if (this.f26154l) {
                return false;
            }
            I removeFirst = this.f26145c.removeFirst();
            O[] oArr = this.f26148f;
            int i = this.f26150h - 1;
            this.f26150h = i;
            O o = oArr[i];
            boolean z = this.f26153k;
            this.f26153k = false;
            if (removeFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    o.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e = mo13726l(removeFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = mo13727k(e2);
                } catch (RuntimeException e3) {
                    e = mo13727k(e3);
                }
                if (e != null) {
                    synchronized (this.f26144b) {
                        this.f26152j = e;
                    }
                    return false;
                }
            }
            synchronized (this.f26144b) {
                if (this.f26153k) {
                    o.release();
                } else if (o.isDecodeOnly()) {
                    this.f26155m++;
                    o.release();
                } else {
                    o.skippedOutputBufferCount = this.f26155m;
                    this.f26155m = 0;
                    this.f26146d.addLast(o);
                }
                m13765s(removeFirst);
            }
            return true;
        }
    }

    public final I mo13071e() {
        I i;
        synchronized (this.f26144b) {
            m13767q();
            C1186a.m38187f(this.f26151i == null);
            int i2 = this.f26149g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f26147e;
                int i3 = i2 - 1;
                this.f26149g = i3;
                i = iArr[i3];
            }
            this.f26151i = i;
        }
        return i;
    }

    public final O mo13072d() {
        synchronized (this.f26144b) {
            m13767q();
            if (this.f26146d.isEmpty()) {
                return null;
            }
            return this.f26146d.removeFirst();
        }
    }

    public final void m13768p() {
        if (m13772h()) {
            this.f26144b.notify();
        }
    }

    public final void m13767q() {
        E e = this.f26152j;
        if (e != null) {
            throw e;
        }
    }

    public final void mo13070f(I i) {
        synchronized (this.f26144b) {
            m13767q();
            C1186a.m38192a(i == this.f26151i);
            this.f26145c.addLast(i);
            m13768p();
            this.f26151i = null;
        }
    }

    public final void m13765s(I i) {
        i.clear();
        I[] iArr = this.f26147e;
        int i2 = this.f26149g;
        this.f26149g = i2 + 1;
        iArr[i2] = i;
    }

    public void mo13764t(O o) {
        synchronized (this.f26144b) {
            m13763u(o);
            m13768p();
        }
    }

    public final void m13763u(O o) {
        o.clear();
        O[] oArr = this.f26148f;
        int i = this.f26150h;
        this.f26150h = i + 1;
        oArr[i] = o;
    }

    public final void m13762v() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m13771m());
    }

    public final void m13761w(int i) {
        C1186a.m38187f(this.f26149g == this.f26147e.length);
        for (I i2 : this.f26147e) {
            i2.m13778f(i);
        }
    }
}
