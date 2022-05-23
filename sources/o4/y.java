package o4;

import android.os.Handler;
import c5.l0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.q1;
import o4.s;
import o4.y;

public interface y {

    public static class a {
        public final int f19194a;
        public final s.b f19195b;
        public final CopyOnWriteArrayList<C0167a> f19196c;
        public final long f19197d;

        public static final class C0167a {
            public Handler f19198a;
            public y f19199b;

            public C0167a(Handler handler, y yVar) {
                this.f19198a = handler;
                this.f19199b = yVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void j(y yVar, o oVar) {
            yVar.Z(this.f19194a, this.f19195b, oVar);
        }

        public void k(y yVar, k kVar, o oVar) {
            yVar.G(this.f19194a, this.f19195b, kVar, oVar);
        }

        public void l(y yVar, k kVar, o oVar) {
            yVar.A(this.f19194a, this.f19195b, kVar, oVar);
        }

        public void m(y yVar, k kVar, o oVar, IOException iOException, boolean z10) {
            yVar.a0(this.f19194a, this.f19195b, kVar, oVar, iOException, z10);
        }

        public void n(y yVar, k kVar, o oVar) {
            yVar.b0(this.f19194a, this.f19195b, kVar, oVar);
        }

        public void f(Handler handler, y yVar) {
            c5.a.e(handler);
            c5.a.e(yVar);
            this.f19196c.add(new C0167a(handler, yVar));
        }

        public final long g(long j10) {
            long I0 = l0.I0(j10);
            if (I0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f19197d + I0;
        }

        public void h(int i10, q1 q1Var, int i11, Object obj, long j10) {
            i(new o(1, i10, q1Var, i11, obj, g(j10), -9223372036854775807L));
        }

        public void i(final o oVar) {
            Iterator<C0167a> it = this.f19196c.iterator();
            while (it.hasNext()) {
                C0167a next = it.next();
                final y yVar = next.f19199b;
                l0.x0(next.f19198a, new Runnable() {
                    @Override
                    public final void run() {
                        y.a.this.j(yVar, oVar);
                    }
                });
            }
        }

        public void o(k kVar, int i10, int i11, q1 q1Var, int i12, Object obj, long j10, long j11) {
            p(kVar, new o(i10, i11, q1Var, i12, obj, g(j10), g(j11)));
        }

        public void p(final k kVar, final o oVar) {
            Iterator<C0167a> it = this.f19196c.iterator();
            while (it.hasNext()) {
                C0167a next = it.next();
                final y yVar = next.f19199b;
                l0.x0(next.f19198a, new Runnable() {
                    @Override
                    public final void run() {
                        y.a.this.k(yVar, kVar, oVar);
                    }
                });
            }
        }

        public void q(k kVar, int i10, int i11, q1 q1Var, int i12, Object obj, long j10, long j11) {
            r(kVar, new o(i10, i11, q1Var, i12, obj, g(j10), g(j11)));
        }

        public void r(final k kVar, final o oVar) {
            Iterator<C0167a> it = this.f19196c.iterator();
            while (it.hasNext()) {
                C0167a next = it.next();
                final y yVar = next.f19199b;
                l0.x0(next.f19198a, new Runnable() {
                    @Override
                    public final void run() {
                        y.a.this.l(yVar, kVar, oVar);
                    }
                });
            }
        }

        public void s(k kVar, int i10, int i11, q1 q1Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            t(kVar, new o(i10, i11, q1Var, i12, obj, g(j10), g(j11)), iOException, z10);
        }

        public void t(final k kVar, final o oVar, final IOException iOException, final boolean z10) {
            Iterator<C0167a> it = this.f19196c.iterator();
            while (it.hasNext()) {
                C0167a next = it.next();
                final y yVar = next.f19199b;
                l0.x0(next.f19198a, new Runnable() {
                    @Override
                    public final void run() {
                        y.a.this.m(yVar, kVar, oVar, iOException, z10);
                    }
                });
            }
        }

        public void u(k kVar, int i10, int i11, q1 q1Var, int i12, Object obj, long j10, long j11) {
            v(kVar, new o(i10, i11, q1Var, i12, obj, g(j10), g(j11)));
        }

        public void v(final k kVar, final o oVar) {
            Iterator<C0167a> it = this.f19196c.iterator();
            while (it.hasNext()) {
                C0167a next = it.next();
                final y yVar = next.f19199b;
                l0.x0(next.f19198a, new Runnable() {
                    @Override
                    public final void run() {
                        y.a.this.n(yVar, kVar, oVar);
                    }
                });
            }
        }

        public void w(y yVar) {
            Iterator<C0167a> it = this.f19196c.iterator();
            while (it.hasNext()) {
                C0167a next = it.next();
                if (next.f19199b == yVar) {
                    this.f19196c.remove(next);
                }
            }
        }

        public a x(int i10, s.b bVar, long j10) {
            return new a(this.f19196c, i10, bVar, j10);
        }

        public a(CopyOnWriteArrayList<C0167a> copyOnWriteArrayList, int i10, s.b bVar, long j10) {
            this.f19196c = copyOnWriteArrayList;
            this.f19194a = i10;
            this.f19195b = bVar;
            this.f19197d = j10;
        }
    }

    void A(int i10, s.b bVar, k kVar, o oVar);

    void G(int i10, s.b bVar, k kVar, o oVar);

    void Z(int i10, s.b bVar, o oVar);

    void a0(int i10, s.b bVar, k kVar, o oVar, IOException iOException, boolean z10);

    void b0(int i10, s.b bVar, k kVar, o oVar);
}
