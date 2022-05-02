package p168ld;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import nc.C7389v0;
import p108hb.C5063c;

public class C6509o {
    public final ArrayDeque<C6511b> f20300a;
    public final ArrayDeque<C6511b> f20301b;
    public int f20302c;
    public int f20303d;
    public int f20304e;
    public AbstractC6510a f20305f;
    public int f20306g;
    public final int f20307h;

    public interface AbstractC6510a {
        void mo20199a(long j);

        boolean mo20198b();

        void mo20197c();
    }

    public static class C6511b {
        public final Bitmap f20308a;
        public long f20309b;

        public C6511b(Bitmap bitmap) {
            this.f20308a = bitmap;
        }

        public int m20196a() {
            return this.f20308a.getHeight();
        }

        public int m20195b() {
            return this.f20308a.getWidth();
        }

        public boolean m20194c() {
            return this.f20308a.isRecycled();
        }

        public void m20193d() {
            this.f20308a.recycle();
        }
    }

    public interface AbstractC6512c {
        boolean mo20192a(C6511b bVar);
    }

    public C6509o(int i, int i2, int i3, AbstractC6510a aVar, int i4) {
        this.f20302c = i;
        this.f20303d = i2;
        this.f20304e = i3;
        this.f20300a = new ArrayDeque<>(i4);
        this.f20301b = new ArrayDeque<>(i4);
        this.f20307h = i4;
        this.f20305f = aVar;
    }

    public void m20220a(C6511b bVar) {
        synchronized (this.f20300a) {
            this.f20300a.offer(bVar);
        }
    }

    public void m20219b(C6511b bVar) {
        synchronized (this.f20300a) {
            this.f20301b.offer(bVar);
        }
    }

    public void m20218c() {
        synchronized (this.f20300a) {
            if ((this.f20306g & 1) != 0) {
                if (this.f20300a.size() > 1) {
                    if ((this.f20306g & 2) == 0 || this.f20301b.isEmpty()) {
                        C6511b poll = this.f20300a.poll();
                        if (poll != null) {
                            this.f20305f.mo20199a(poll.f20309b);
                        }
                        this.f20301b.offer(poll);
                    }
                    this.f20305f.mo20197c();
                }
                this.f20306g &= -2;
            }
        }
    }

    public void m20217d() {
        synchronized (this.f20300a) {
            while (this.f20300a.size() > 1) {
                this.f20301b.offer(this.f20300a.removeLast());
            }
        }
    }

    public Bitmap m20216e(boolean z) {
        C6511b g = m20214g();
        if (g == null) {
            return null;
        }
        if (z) {
            m20206o();
        }
        return g.f20308a;
    }

    public Queue<C6511b> m20215f() {
        return this.f20300a;
    }

    public C6511b m20214g() {
        return this.f20300a.peek();
    }

    public int m20213h() {
        return this.f20304e;
    }

    public boolean m20212i() {
        boolean z;
        synchronized (this.f20300a) {
            C6511b g = m20214g();
            z = g != null && C7389v0.m16756A1(g.f20308a);
        }
        return z;
    }

    public boolean m20211j() {
        return this.f20300a.size() > 1;
    }

    public int m20210k() {
        return this.f20303d;
    }

    public boolean m20209l(AbstractC6512c cVar, int i, Bitmap.Config config) {
        synchronized (this.f20300a) {
            for (int i2 = 0; i2 < this.f20307h; i2++) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f20302c, this.f20303d, config);
                if (createBitmap == null) {
                    return false;
                }
                C6511b bVar = new C6511b(createBitmap);
                if (i2 >= i) {
                    this.f20301b.offer(bVar);
                } else if (!cVar.mo20192a(bVar)) {
                    return false;
                } else {
                    this.f20300a.offer(bVar);
                }
            }
            return true;
        }
    }

    public boolean m20208m() {
        return (this.f20306g & 2) != 0;
    }

    public boolean m20207n() {
        int i = this.f20304e;
        return i == 90 || i == 270;
    }

    public void m20206o() {
        if (this.f20305f.mo20198b()) {
            synchronized (this.f20300a) {
                this.f20305f.mo20197c();
            }
        }
    }

    public void m20205p() {
        synchronized (this.f20300a) {
            m20204q();
        }
    }

    public final void m20204q() {
        Iterator<C6511b> it = this.f20300a.iterator();
        while (it.hasNext()) {
            C6511b next = it.next();
            if (next != null && !next.m20194c()) {
                next.m20193d();
            }
        }
        Iterator<C6511b> it2 = this.f20301b.iterator();
        while (it2.hasNext()) {
            C6511b next2 = it2.next();
            if (next2 != null && !next2.m20194c()) {
                next2.m20193d();
            }
        }
        this.f20300a.clear();
        this.f20301b.clear();
    }

    public void m20203r() {
        this.f20306g |= 1;
    }

    public void m20202s(boolean z) {
        synchronized (this.f20300a) {
            this.f20306g = C5063c.m24138h(this.f20306g, 2, z);
        }
    }

    public C6511b m20201t() {
        C6511b poll;
        synchronized (this.f20300a) {
            poll = this.f20301b.isEmpty() ? null : this.f20301b.poll();
        }
        return poll;
    }

    public int m20200u() {
        return this.f20302c;
    }
}
