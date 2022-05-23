package q4;

import a7.q;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public final class d implements g {
    public final c f21399a = new c();
    public final j f21400b = new j();
    public final Deque<k> f21401c = new ArrayDeque();
    public int f21402d;
    public boolean f21403e;

    public class a extends k {
        public a() {
        }

        @Override
        public void release() {
            d.this.k(this);
        }
    }

    public static final class b implements f {
        public final long f21405a;
        public final q<q4.b> f21406b;

        public b(long j10, q<q4.b> qVar) {
            this.f21405a = j10;
            this.f21406b = qVar;
        }

        @Override
        public int a(long j10) {
            return this.f21405a > j10 ? 0 : -1;
        }

        @Override
        public long b(int i10) {
            c5.a.a(i10 == 0);
            return this.f21405a;
        }

        @Override
        public List<q4.b> c(long j10) {
            return j10 >= this.f21405a ? this.f21406b : q.D();
        }

        @Override
        public int d() {
            return 1;
        }
    }

    public d() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f21401c.addFirst(new a());
        }
        this.f21402d = 0;
    }

    @Override
    public void a() {
        this.f21403e = true;
    }

    @Override
    public String b() {
        return "ExoplayerCuesDecoder";
    }

    @Override
    public void c(long j10) {
    }

    @Override
    public void flush() {
        c5.a.f(!this.f21403e);
        this.f21400b.clear();
        this.f21402d = 0;
    }

    public j e() {
        c5.a.f(!this.f21403e);
        if (this.f21402d != 0) {
            return null;
        }
        this.f21402d = 1;
        return this.f21400b;
    }

    public k d() {
        c5.a.f(!this.f21403e);
        if (this.f21402d != 2 || this.f21401c.isEmpty()) {
            return null;
        }
        k removeFirst = this.f21401c.removeFirst();
        if (this.f21400b.isEndOfStream()) {
            removeFirst.addFlag(4);
        } else {
            j jVar = this.f21400b;
            removeFirst.e(this.f21400b.N, new b(jVar.N, this.f21399a.a(((ByteBuffer) c5.a.e(jVar.f20488c)).array())), 0L);
        }
        this.f21400b.clear();
        this.f21402d = 0;
        return removeFirst;
    }

    public void f(j jVar) {
        boolean z10 = true;
        c5.a.f(!this.f21403e);
        c5.a.f(this.f21402d == 1);
        if (this.f21400b != jVar) {
            z10 = false;
        }
        c5.a.a(z10);
        this.f21402d = 2;
    }

    public final void k(k kVar) {
        c5.a.f(this.f21401c.size() < 2);
        c5.a.a(!this.f21401c.contains(kVar));
        kVar.clear();
        this.f21401c.addFirst(kVar);
    }
}
