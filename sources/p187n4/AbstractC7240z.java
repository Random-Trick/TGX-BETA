package p187n4;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6600g1;
import p187n4.AbstractC7230t;
import p187n4.AbstractC7240z;

public interface AbstractC7240z {

    public static class C7241a {
        public final int f23054a;
        public final AbstractC7230t.C7231a f23055b;
        public final CopyOnWriteArrayList<C7242a> f23056c;
        public final long f23057d;

        public static final class C7242a {
            public Handler f23058a;
            public AbstractC7240z f23059b;

            public C7242a(Handler handler, AbstractC7240z zVar) {
                this.f23058a = handler;
                this.f23059b = zVar;
            }
        }

        public C7241a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void m17227j(AbstractC7240z zVar, C7221p pVar) {
            zVar.mo17238i(this.f23054a, this.f23055b, pVar);
        }

        public void m17226k(AbstractC7240z zVar, C7205l lVar, C7221p pVar) {
            zVar.mo17241G(this.f23054a, this.f23055b, lVar, pVar);
        }

        public void m17225l(AbstractC7240z zVar, C7205l lVar, C7221p pVar) {
            zVar.mo17239d0(this.f23054a, this.f23055b, lVar, pVar);
        }

        public void m17224m(AbstractC7240z zVar, C7205l lVar, C7221p pVar, IOException iOException, boolean z) {
            zVar.mo17237y(this.f23054a, this.f23055b, lVar, pVar, iOException, z);
        }

        public void m17223n(AbstractC7240z zVar, C7205l lVar, C7221p pVar) {
            zVar.mo17240U(this.f23054a, this.f23055b, lVar, pVar);
        }

        public void m17231f(Handler handler, AbstractC7240z zVar) {
            C1186a.m38185e(handler);
            C1186a.m38185e(zVar);
            this.f23056c.add(new C7242a(handler, zVar));
        }

        public final long m17230g(long j) {
            long H0 = C1216l0.m38006H0(j);
            if (H0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f23057d + H0;
        }

        public void m17229h(int i, C6600g1 g1Var, int i2, Object obj, long j) {
            m17228i(new C7221p(1, i, g1Var, i2, obj, m17230g(j), -9223372036854775807L));
        }

        public void m17228i(final C7221p pVar) {
            Iterator<C7242a> it = this.f23056c.iterator();
            while (it.hasNext()) {
                C7242a next = it.next();
                final AbstractC7240z zVar = next.f23059b;
                C1216l0.m37941w0(next.f23058a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7240z.C7241a.this.m17227j(zVar, pVar);
                    }
                });
            }
        }

        public void m17222o(C7205l lVar, int i, int i2, C6600g1 g1Var, int i3, Object obj, long j, long j2) {
            m17221p(lVar, new C7221p(i, i2, g1Var, i3, obj, m17230g(j), m17230g(j2)));
        }

        public void m17221p(final C7205l lVar, final C7221p pVar) {
            Iterator<C7242a> it = this.f23056c.iterator();
            while (it.hasNext()) {
                C7242a next = it.next();
                final AbstractC7240z zVar = next.f23059b;
                C1216l0.m37941w0(next.f23058a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7240z.C7241a.this.m17226k(zVar, lVar, pVar);
                    }
                });
            }
        }

        public void m17220q(C7205l lVar, int i, int i2, C6600g1 g1Var, int i3, Object obj, long j, long j2) {
            m17219r(lVar, new C7221p(i, i2, g1Var, i3, obj, m17230g(j), m17230g(j2)));
        }

        public void m17219r(final C7205l lVar, final C7221p pVar) {
            Iterator<C7242a> it = this.f23056c.iterator();
            while (it.hasNext()) {
                C7242a next = it.next();
                final AbstractC7240z zVar = next.f23059b;
                C1216l0.m37941w0(next.f23058a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7240z.C7241a.this.m17225l(zVar, lVar, pVar);
                    }
                });
            }
        }

        public void m17218s(C7205l lVar, int i, int i2, C6600g1 g1Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            m17217t(lVar, new C7221p(i, i2, g1Var, i3, obj, m17230g(j), m17230g(j2)), iOException, z);
        }

        public void m17217t(final C7205l lVar, final C7221p pVar, final IOException iOException, final boolean z) {
            Iterator<C7242a> it = this.f23056c.iterator();
            while (it.hasNext()) {
                C7242a next = it.next();
                final AbstractC7240z zVar = next.f23059b;
                C1216l0.m37941w0(next.f23058a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7240z.C7241a.this.m17224m(zVar, lVar, pVar, iOException, z);
                    }
                });
            }
        }

        public void m17216u(C7205l lVar, int i, int i2, C6600g1 g1Var, int i3, Object obj, long j, long j2) {
            m17215v(lVar, new C7221p(i, i2, g1Var, i3, obj, m17230g(j), m17230g(j2)));
        }

        public void m17215v(final C7205l lVar, final C7221p pVar) {
            Iterator<C7242a> it = this.f23056c.iterator();
            while (it.hasNext()) {
                C7242a next = it.next();
                final AbstractC7240z zVar = next.f23059b;
                C1216l0.m37941w0(next.f23058a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC7240z.C7241a.this.m17223n(zVar, lVar, pVar);
                    }
                });
            }
        }

        public void m17214w(AbstractC7240z zVar) {
            Iterator<C7242a> it = this.f23056c.iterator();
            while (it.hasNext()) {
                C7242a next = it.next();
                if (next.f23059b == zVar) {
                    this.f23056c.remove(next);
                }
            }
        }

        public C7241a m17213x(int i, AbstractC7230t.C7231a aVar, long j) {
            return new C7241a(this.f23056c, i, aVar, j);
        }

        public C7241a(CopyOnWriteArrayList<C7242a> copyOnWriteArrayList, int i, AbstractC7230t.C7231a aVar, long j) {
            this.f23056c = copyOnWriteArrayList;
            this.f23054a = i;
            this.f23055b = aVar;
            this.f23057d = j;
        }
    }

    void mo17241G(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar);

    void mo17240U(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar);

    void mo17239d0(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar);

    void mo17238i(int i, AbstractC7230t.C7231a aVar, C7221p pVar);

    void mo17237y(int i, AbstractC7230t.C7231a aVar, C7205l lVar, C7221p pVar, IOException iOException, boolean z);
}
