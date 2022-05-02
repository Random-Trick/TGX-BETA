package p216p3;

import com.google.android.exoplayer2.decoder.AbstractC3437a;
import java.util.ArrayDeque;
import p020b5.C1186a;
import p216p3.C8025f;
import p216p3.C8026g;

public abstract class AbstractC8029i<I extends C8026g, O extends AbstractC3437a, E extends C8025f> implements AbstractC8023d<I, O, E> {
    public final Thread f26140a;
    public final Object f26141b = new Object();
    public final ArrayDeque<I> f26142c = new ArrayDeque<>();
    public final ArrayDeque<O> f26143d = new ArrayDeque<>();
    public final I[] f26144e;
    public final O[] f26145f;
    public int f26146g;
    public int f26147h;
    public I f26148i;
    public E f26149j;
    public boolean f26150k;
    public boolean f26151l;
    public int f26152m;

    public class C8030a extends Thread {
        public C8030a(String str) {
            super(str);
        }

        @Override
        public void run() {
            AbstractC8029i.this.m13763v();
        }
    }

    public AbstractC8029i(I[] iArr, O[] oArr) {
        this.f26144e = iArr;
        this.f26146g = iArr.length;
        for (int i = 0; i < this.f26146g; i++) {
            this.f26144e[i] = mo13730i();
        }
        this.f26145f = oArr;
        this.f26147h = oArr.length;
        for (int i2 = 0; i2 < this.f26147h; i2++) {
            this.f26145f[i2] = mo13729j();
        }
        C8030a aVar = new C8030a("ExoPlayer:SimpleDecoder");
        this.f26140a = aVar;
        aVar.start();
    }

    @Override
    public void mo13075a() {
        synchronized (this.f26141b) {
            this.f26151l = true;
            this.f26141b.notify();
        }
        try {
            this.f26140a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public final void flush() {
        synchronized (this.f26141b) {
            this.f26150k = true;
            this.f26152m = 0;
            I i = this.f26148i;
            if (i != null) {
                m13766s(i);
                this.f26148i = null;
            }
            while (!this.f26142c.isEmpty()) {
                m13766s(this.f26142c.removeFirst());
            }
            while (!this.f26143d.isEmpty()) {
                this.f26143d.removeFirst().release();
            }
        }
    }

    public final boolean m13773h() {
        return !this.f26142c.isEmpty() && this.f26147h > 0;
    }

    public abstract I mo13730i();

    public abstract O mo13729j();

    public abstract E mo13728k(Throwable th);

    public abstract E mo13727l(I i, O o, boolean z);

    public final boolean m13772m() {
        E e;
        synchronized (this.f26141b) {
            while (!this.f26151l && !m13773h()) {
                this.f26141b.wait();
            }
            if (this.f26151l) {
                return false;
            }
            I removeFirst = this.f26142c.removeFirst();
            O[] oArr = this.f26145f;
            int i = this.f26147h - 1;
            this.f26147h = i;
            O o = oArr[i];
            boolean z = this.f26150k;
            this.f26150k = false;
            if (removeFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    o.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e = mo13727l(removeFirst, o, z);
                } catch (OutOfMemoryError e2) {
                    e = mo13728k(e2);
                } catch (RuntimeException e3) {
                    e = mo13728k(e3);
                }
                if (e != null) {
                    synchronized (this.f26141b) {
                        this.f26149j = e;
                    }
                    return false;
                }
            }
            synchronized (this.f26141b) {
                if (this.f26150k) {
                    o.release();
                } else if (o.isDecodeOnly()) {
                    this.f26152m++;
                    o.release();
                } else {
                    o.skippedOutputBufferCount = this.f26152m;
                    this.f26152m = 0;
                    this.f26143d.addLast(o);
                }
                m13766s(removeFirst);
            }
            return true;
        }
    }

    public final I mo13072e() {
        I i;
        synchronized (this.f26141b) {
            m13768q();
            C1186a.m38184f(this.f26148i == null);
            int i2 = this.f26146g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f26144e;
                int i3 = i2 - 1;
                this.f26146g = i3;
                i = iArr[i3];
            }
            this.f26148i = i;
        }
        return i;
    }

    public final O mo13073d() {
        synchronized (this.f26141b) {
            m13768q();
            if (this.f26143d.isEmpty()) {
                return null;
            }
            return this.f26143d.removeFirst();
        }
    }

    public final void m13769p() {
        if (m13773h()) {
            this.f26141b.notify();
        }
    }

    public final void m13768q() {
        E e = this.f26149j;
        if (e != null) {
            throw e;
        }
    }

    public final void mo13071f(I i) {
        synchronized (this.f26141b) {
            m13768q();
            C1186a.m38189a(i == this.f26148i);
            this.f26142c.addLast(i);
            m13769p();
            this.f26148i = null;
        }
    }

    public final void m13766s(I i) {
        i.clear();
        I[] iArr = this.f26144e;
        int i2 = this.f26146g;
        this.f26146g = i2 + 1;
        iArr[i2] = i;
    }

    public void mo13765t(O o) {
        synchronized (this.f26141b) {
            m13764u(o);
            m13769p();
        }
    }

    public final void m13764u(O o) {
        o.clear();
        O[] oArr = this.f26145f;
        int i = this.f26147h;
        this.f26147h = i + 1;
        oArr[i] = o;
    }

    public final void m13763v() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m13772m());
    }

    public final void m13762w(int i) {
        C1186a.m38184f(this.f26146g == this.f26144e.length);
        for (I i2 : this.f26144e) {
            i2.m13779f(i);
        }
    }
}
