package p230q3;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p020b5.C1186a;
import p020b5.C1216l0;
import p187n4.AbstractC7230t;
import p230q3.AbstractC8219w;

public interface AbstractC8219w {

    public static class C8220a {
        public final int f26589a;
        public final AbstractC7230t.C7231a f26590b;
        public final CopyOnWriteArrayList<C8221a> f26591c;

        public static final class C8221a {
            public Handler f26592a;
            public AbstractC8219w f26593b;

            public C8221a(Handler handler, AbstractC8219w wVar) {
                this.f26592a = handler;
                this.f26593b = wVar;
            }
        }

        public C8220a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void m13174n(AbstractC8219w wVar) {
            wVar.mo13189X(this.f26589a, this.f26590b);
        }

        public void m13173o(AbstractC8219w wVar) {
            wVar.mo13190T(this.f26589a, this.f26590b);
        }

        public void m13172p(AbstractC8219w wVar) {
            wVar.mo13193F(this.f26589a, this.f26590b);
        }

        public void m13171q(AbstractC8219w wVar, int i) {
            wVar.mo13188v(this.f26589a, this.f26590b);
            wVar.mo13191P(this.f26589a, this.f26590b, i);
        }

        public void m13170r(AbstractC8219w wVar, Exception exc) {
            wVar.mo13192O(this.f26589a, this.f26590b, exc);
        }

        public void m13169s(AbstractC8219w wVar) {
            wVar.mo13194D(this.f26589a, this.f26590b);
        }

        public void m13181g(Handler handler, AbstractC8219w wVar) {
            C1186a.m38188e(handler);
            C1186a.m38188e(wVar);
            this.f26591c.add(new C8221a(handler, wVar));
        }

        public void m13180h() {
            Iterator<C8221a> it = this.f26591c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26593b;
                C1216l0.m37944w0(next.f26592a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13174n(wVar);
                    }
                });
            }
        }

        public void m13179i() {
            Iterator<C8221a> it = this.f26591c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26593b;
                C1216l0.m37944w0(next.f26592a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13173o(wVar);
                    }
                });
            }
        }

        public void m13178j() {
            Iterator<C8221a> it = this.f26591c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26593b;
                C1216l0.m37944w0(next.f26592a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13172p(wVar);
                    }
                });
            }
        }

        public void m13177k(final int i) {
            Iterator<C8221a> it = this.f26591c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26593b;
                C1216l0.m37944w0(next.f26592a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13171q(wVar, i);
                    }
                });
            }
        }

        public void m13176l(final Exception exc) {
            Iterator<C8221a> it = this.f26591c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26593b;
                C1216l0.m37944w0(next.f26592a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13170r(wVar, exc);
                    }
                });
            }
        }

        public void m13175m() {
            Iterator<C8221a> it = this.f26591c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26593b;
                C1216l0.m37944w0(next.f26592a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13169s(wVar);
                    }
                });
            }
        }

        public void m13168t(AbstractC8219w wVar) {
            Iterator<C8221a> it = this.f26591c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                if (next.f26593b == wVar) {
                    this.f26591c.remove(next);
                }
            }
        }

        public C8220a m13167u(int i, AbstractC7230t.C7231a aVar) {
            return new C8220a(this.f26591c, i, aVar);
        }

        public C8220a(CopyOnWriteArrayList<C8221a> copyOnWriteArrayList, int i, AbstractC7230t.C7231a aVar) {
            this.f26591c = copyOnWriteArrayList;
            this.f26589a = i;
            this.f26590b = aVar;
        }
    }

    void mo13194D(int i, AbstractC7230t.C7231a aVar);

    void mo13193F(int i, AbstractC7230t.C7231a aVar);

    void mo13192O(int i, AbstractC7230t.C7231a aVar, Exception exc);

    void mo13191P(int i, AbstractC7230t.C7231a aVar, int i2);

    void mo13190T(int i, AbstractC7230t.C7231a aVar);

    void mo13189X(int i, AbstractC7230t.C7231a aVar);

    @Deprecated
    void mo13188v(int i, AbstractC7230t.C7231a aVar);
}
