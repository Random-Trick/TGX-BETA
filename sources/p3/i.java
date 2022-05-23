package p3;

import com.google.android.exoplayer2.decoder.a;
import java.util.ArrayDeque;
import p3.f;
import p3.g;

public abstract class i<I extends g, O extends com.google.android.exoplayer2.decoder.a, E extends f> implements d<I, O, E> {
    public final Thread f20496a;
    public final Object f20497b = new Object();
    public final ArrayDeque<I> f20498c = new ArrayDeque<>();
    public final ArrayDeque<O> f20499d = new ArrayDeque<>();
    public final I[] f20500e;
    public final O[] f20501f;
    public int f20502g;
    public int f20503h;
    public I f20504i;
    public E f20505j;
    public boolean f20506k;
    public boolean f20507l;
    public int f20508m;

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override
        public void run() {
            i.this.v();
        }
    }

    public i(I[] iArr, O[] oArr) {
        this.f20500e = iArr;
        this.f20502g = iArr.length;
        for (int i10 = 0; i10 < this.f20502g; i10++) {
            this.f20500e[i10] = i();
        }
        this.f20501f = oArr;
        this.f20503h = oArr.length;
        for (int i11 = 0; i11 < this.f20503h; i11++) {
            this.f20501f[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f20496a = aVar;
        aVar.start();
    }

    @Override
    public void a() {
        synchronized (this.f20497b) {
            this.f20507l = true;
            this.f20497b.notify();
        }
        try {
            this.f20496a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public final void flush() {
        synchronized (this.f20497b) {
            this.f20506k = true;
            this.f20508m = 0;
            I i10 = this.f20504i;
            if (i10 != null) {
                s(i10);
                this.f20504i = null;
            }
            while (!this.f20498c.isEmpty()) {
                s(this.f20498c.removeFirst());
            }
            while (!this.f20499d.isEmpty()) {
                this.f20499d.removeFirst().release();
            }
        }
    }

    public final boolean h() {
        return !this.f20498c.isEmpty() && this.f20503h > 0;
    }

    public abstract I i();

    public abstract O j();

    public abstract E k(Throwable th);

    public abstract E l(I i10, O o10, boolean z10);

    public final boolean m() {
        E e10;
        synchronized (this.f20497b) {
            while (!this.f20507l && !h()) {
                this.f20497b.wait();
            }
            if (this.f20507l) {
                return false;
            }
            I removeFirst = this.f20498c.removeFirst();
            O[] oArr = this.f20501f;
            int i10 = this.f20503h - 1;
            this.f20503h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f20506k;
            this.f20506k = false;
            if (removeFirst.isEndOfStream()) {
                o10.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    o10.addFlag(Integer.MIN_VALUE);
                }
                try {
                    e10 = l(removeFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = k(e11);
                } catch (RuntimeException e12) {
                    e10 = k(e12);
                }
                if (e10 != null) {
                    synchronized (this.f20497b) {
                        this.f20505j = e10;
                    }
                    return false;
                }
            }
            synchronized (this.f20497b) {
                if (this.f20506k) {
                    o10.release();
                } else if (o10.isDecodeOnly()) {
                    this.f20508m++;
                    o10.release();
                } else {
                    o10.skippedOutputBufferCount = this.f20508m;
                    this.f20508m = 0;
                    this.f20499d.addLast(o10);
                }
                s(removeFirst);
            }
            return true;
        }
    }

    public final I e() {
        I i10;
        synchronized (this.f20497b) {
            q();
            c5.a.f(this.f20504i == null);
            int i11 = this.f20502g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f20500e;
                int i12 = i11 - 1;
                this.f20502g = i12;
                i10 = iArr[i12];
            }
            this.f20504i = i10;
        }
        return i10;
    }

    public final O d() {
        synchronized (this.f20497b) {
            q();
            if (this.f20499d.isEmpty()) {
                return null;
            }
            return this.f20499d.removeFirst();
        }
    }

    public final void p() {
        if (h()) {
            this.f20497b.notify();
        }
    }

    public final void q() {
        E e10 = this.f20505j;
        if (e10 != null) {
            throw e10;
        }
    }

    public final void f(I i10) {
        synchronized (this.f20497b) {
            q();
            c5.a.a(i10 == this.f20504i);
            this.f20498c.addLast(i10);
            p();
            this.f20504i = null;
        }
    }

    public final void s(I i10) {
        i10.clear();
        I[] iArr = this.f20500e;
        int i11 = this.f20502g;
        this.f20502g = i11 + 1;
        iArr[i11] = i10;
    }

    public void t(O o10) {
        synchronized (this.f20497b) {
            u(o10);
            p();
        }
    }

    public final void u(O o10) {
        o10.clear();
        O[] oArr = this.f20501f;
        int i10 = this.f20503h;
        this.f20503h = i10 + 1;
        oArr[i10] = o10;
    }

    public final void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }

    public final void w(int i10) {
        c5.a.f(this.f20502g == this.f20500e.length);
        for (I i11 : this.f20500e) {
            i11.f(i10);
        }
    }
}
