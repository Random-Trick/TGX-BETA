package r4;

import c5.l0;
import com.google.android.exoplayer2.decoder.a;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import q4.f;
import q4.g;
import q4.j;
import q4.k;
import r4.e;

public abstract class e implements g {
    public final ArrayDeque<b> f21729a = new ArrayDeque<>();
    public final ArrayDeque<k> f21730b;
    public final PriorityQueue<b> f21731c;
    public b f21732d;
    public long f21733e;
    public long f21734f;

    public static final class b extends j implements Comparable<b> {
        public long S;

        public b() {
        }

        public int compareTo(b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j10 = this.N - bVar.N;
            if (j10 == 0) {
                j10 = this.S - bVar.S;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    public static final class c extends k {
        public a.AbstractC0069a<c> f21735c;

        public c(a.AbstractC0069a<c> aVar) {
            this.f21735c = aVar;
        }

        @Override
        public final void release() {
            this.f21735c.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f21729a.add(new b());
        }
        this.f21730b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f21730b.add(new c(new a.AbstractC0069a() {
                @Override
                public final void a(a aVar) {
                    e.this.p((e.c) aVar);
                }
            }));
        }
        this.f21731c = new PriorityQueue<>();
    }

    @Override
    public void a() {
    }

    @Override
    public void c(long j10) {
        this.f21733e = j10;
    }

    @Override
    public void flush() {
        this.f21734f = 0L;
        this.f21733e = 0L;
        while (!this.f21731c.isEmpty()) {
            o((b) l0.j(this.f21731c.poll()));
        }
        b bVar = this.f21732d;
        if (bVar != null) {
            o(bVar);
            this.f21732d = null;
        }
    }

    public abstract f g();

    public abstract void h(j jVar);

    public j e() {
        c5.a.f(this.f21732d == null);
        if (this.f21729a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f21729a.pollFirst();
        this.f21732d = pollFirst;
        return pollFirst;
    }

    public k d() {
        if (this.f21730b.isEmpty()) {
            return null;
        }
        while (!this.f21731c.isEmpty() && ((b) l0.j(this.f21731c.peek())).N <= this.f21733e) {
            b bVar = (b) l0.j(this.f21731c.poll());
            if (bVar.isEndOfStream()) {
                k kVar = (k) l0.j(this.f21730b.pollFirst());
                kVar.addFlag(4);
                o(bVar);
                return kVar;
            }
            h(bVar);
            if (m()) {
                f g10 = g();
                k kVar2 = (k) l0.j(this.f21730b.pollFirst());
                kVar2.e(bVar.N, g10, Long.MAX_VALUE);
                o(bVar);
                return kVar2;
            }
            o(bVar);
        }
        return null;
    }

    public final k k() {
        return this.f21730b.pollFirst();
    }

    public final long l() {
        return this.f21733e;
    }

    public abstract boolean m();

    public void f(j jVar) {
        c5.a.a(jVar == this.f21732d);
        b bVar = (b) jVar;
        if (bVar.isDecodeOnly()) {
            o(bVar);
        } else {
            long j10 = this.f21734f;
            this.f21734f = 1 + j10;
            bVar.S = j10;
            this.f21731c.add(bVar);
        }
        this.f21732d = null;
    }

    public final void o(b bVar) {
        bVar.clear();
        this.f21729a.add(bVar);
    }

    public void p(k kVar) {
        kVar.clear();
        this.f21730b.add(kVar);
    }
}
