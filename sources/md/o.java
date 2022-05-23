package md;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import oc.v0;

public class o {
    public final ArrayDeque<b> f17460a;
    public final ArrayDeque<b> f17461b;
    public int f17462c;
    public int f17463d;
    public int f17464e;
    public a f17465f;
    public int f17466g;
    public final int f17467h;

    public interface a {
        void a(long j10);

        boolean b();

        void c();
    }

    public static class b {
        public final Bitmap f17468a;
        public long f17469b;

        public b(Bitmap bitmap) {
            this.f17468a = bitmap;
        }

        public int a() {
            return this.f17468a.getHeight();
        }

        public int b() {
            return this.f17468a.getWidth();
        }

        public boolean c() {
            return this.f17468a.isRecycled();
        }

        public void d() {
            this.f17468a.recycle();
        }
    }

    public interface c {
        boolean a(b bVar);
    }

    public o(int i10, int i11, int i12, a aVar, int i13) {
        this.f17462c = i10;
        this.f17463d = i11;
        this.f17464e = i12;
        this.f17460a = new ArrayDeque<>(i13);
        this.f17461b = new ArrayDeque<>(i13);
        this.f17467h = i13;
        this.f17465f = aVar;
    }

    public void a(b bVar) {
        synchronized (this.f17460a) {
            this.f17460a.offer(bVar);
        }
    }

    public void b(b bVar) {
        synchronized (this.f17460a) {
            this.f17461b.offer(bVar);
        }
    }

    public void c() {
        synchronized (this.f17460a) {
            if ((this.f17466g & 1) != 0) {
                if (this.f17460a.size() > 1) {
                    if ((this.f17466g & 2) == 0 || this.f17461b.isEmpty()) {
                        b poll = this.f17460a.poll();
                        if (poll != null) {
                            this.f17465f.a(poll.f17469b);
                        }
                        this.f17461b.offer(poll);
                    }
                    this.f17465f.c();
                }
                this.f17466g &= -2;
            }
        }
    }

    public void d() {
        synchronized (this.f17460a) {
            while (this.f17460a.size() > 1) {
                this.f17461b.offer(this.f17460a.removeLast());
            }
        }
    }

    public Bitmap e(boolean z10) {
        b g10 = g();
        if (g10 == null) {
            return null;
        }
        if (z10) {
            o();
        }
        return g10.f17468a;
    }

    public Queue<b> f() {
        return this.f17460a;
    }

    public b g() {
        return this.f17460a.peek();
    }

    public int h() {
        return this.f17464e;
    }

    public boolean i() {
        boolean z10;
        synchronized (this.f17460a) {
            b g10 = g();
            z10 = g10 != null && v0.A1(g10.f17468a);
        }
        return z10;
    }

    public boolean j() {
        return this.f17460a.size() > 1;
    }

    public int k() {
        return this.f17463d;
    }

    public boolean l(c cVar, int i10, Bitmap.Config config) {
        synchronized (this.f17460a) {
            for (int i11 = 0; i11 < this.f17467h; i11++) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f17462c, this.f17463d, config);
                if (createBitmap == null) {
                    return false;
                }
                b bVar = new b(createBitmap);
                if (i11 >= i10) {
                    this.f17461b.offer(bVar);
                } else if (!cVar.a(bVar)) {
                    return false;
                } else {
                    this.f17460a.offer(bVar);
                }
            }
            return true;
        }
    }

    public boolean m() {
        return (this.f17466g & 2) != 0;
    }

    public boolean n() {
        int i10 = this.f17464e;
        return i10 == 90 || i10 == 270;
    }

    public void o() {
        if (this.f17465f.b()) {
            synchronized (this.f17460a) {
                this.f17465f.c();
            }
        }
    }

    public void p() {
        synchronized (this.f17460a) {
            q();
        }
    }

    public final void q() {
        Iterator<b> it = this.f17460a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next != null && !next.c()) {
                next.d();
            }
        }
        Iterator<b> it2 = this.f17461b.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (next2 != null && !next2.c()) {
                next2.d();
            }
        }
        this.f17460a.clear();
        this.f17461b.clear();
    }

    public void r() {
        this.f17466g |= 1;
    }

    public void s(boolean z10) {
        synchronized (this.f17460a) {
            this.f17466g = ib.c.h(this.f17466g, 2, z10);
        }
    }

    public b t() {
        b poll;
        synchronized (this.f17460a) {
            poll = this.f17461b.isEmpty() ? null : this.f17461b.poll();
        }
        return poll;
    }

    public int u() {
        return this.f17462c;
    }
}
