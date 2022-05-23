package m3;

import android.os.Looper;
import c5.d;
import java.util.concurrent.TimeoutException;

public final class w2 {
    public final b f17023a;
    public final a f17024b;
    public final d f17025c;
    public final o3 f17026d;
    public int f17027e;
    public Object f17028f;
    public Looper f17029g;
    public int f17030h;
    public long f17031i = -9223372036854775807L;
    public boolean f17032j = true;
    public boolean f17033k;
    public boolean f17034l;
    public boolean f17035m;
    public boolean f17036n;

    public interface a {
        void c(w2 w2Var);
    }

    public interface b {
        void t(int i10, Object obj);
    }

    public w2(a aVar, b bVar, o3 o3Var, int i10, d dVar, Looper looper) {
        this.f17024b = aVar;
        this.f17023a = bVar;
        this.f17026d = o3Var;
        this.f17029g = looper;
        this.f17025c = dVar;
        this.f17030h = i10;
    }

    public synchronized boolean a(long j10) {
        boolean z10;
        c5.a.f(this.f17033k);
        c5.a.f(this.f17029g.getThread() != Thread.currentThread());
        long d10 = this.f17025c.d() + j10;
        while (true) {
            z10 = this.f17035m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f17025c.c();
            wait(j10);
            j10 = d10 - this.f17025c.d();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f17034l;
    }

    public boolean b() {
        return this.f17032j;
    }

    public Looper c() {
        return this.f17029g;
    }

    public int d() {
        return this.f17030h;
    }

    public Object e() {
        return this.f17028f;
    }

    public long f() {
        return this.f17031i;
    }

    public b g() {
        return this.f17023a;
    }

    public o3 h() {
        return this.f17026d;
    }

    public int i() {
        return this.f17027e;
    }

    public synchronized boolean j() {
        return this.f17036n;
    }

    public synchronized void k(boolean z10) {
        this.f17034l = z10 | this.f17034l;
        this.f17035m = true;
        notifyAll();
    }

    public w2 l() {
        c5.a.f(!this.f17033k);
        if (this.f17031i == -9223372036854775807L) {
            c5.a.a(this.f17032j);
        }
        this.f17033k = true;
        this.f17024b.c(this);
        return this;
    }

    public w2 m(Object obj) {
        c5.a.f(!this.f17033k);
        this.f17028f = obj;
        return this;
    }

    public w2 n(int i10) {
        c5.a.f(!this.f17033k);
        this.f17027e = i10;
        return this;
    }
}
