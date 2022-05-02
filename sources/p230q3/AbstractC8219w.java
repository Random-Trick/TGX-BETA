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
        public final int f26586a;
        public final AbstractC7230t.C7231a f26587b;
        public final CopyOnWriteArrayList<C8221a> f26588c;

        public static final class C8221a {
            public Handler f26589a;
            public AbstractC8219w f26590b;

            public C8221a(Handler handler, AbstractC8219w wVar) {
                this.f26589a = handler;
                this.f26590b = wVar;
            }
        }

        public C8220a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void m13175n(AbstractC8219w wVar) {
            wVar.mo13190X(this.f26586a, this.f26587b);
        }

        public void m13174o(AbstractC8219w wVar) {
            wVar.mo13191T(this.f26586a, this.f26587b);
        }

        public void m13173p(AbstractC8219w wVar) {
            wVar.mo13194F(this.f26586a, this.f26587b);
        }

        public void m13172q(AbstractC8219w wVar, int i) {
            wVar.mo13189v(this.f26586a, this.f26587b);
            wVar.mo13192P(this.f26586a, this.f26587b, i);
        }

        public void m13171r(AbstractC8219w wVar, Exception exc) {
            wVar.mo13193O(this.f26586a, this.f26587b, exc);
        }

        public void m13170s(AbstractC8219w wVar) {
            wVar.mo13195D(this.f26586a, this.f26587b);
        }

        public void m13182g(Handler handler, AbstractC8219w wVar) {
            C1186a.m38185e(handler);
            C1186a.m38185e(wVar);
            this.f26588c.add(new C8221a(handler, wVar));
        }

        public void m13181h() {
            Iterator<C8221a> it = this.f26588c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26590b;
                C1216l0.m37941w0(next.f26589a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13175n(wVar);
                    }
                });
            }
        }

        public void m13180i() {
            Iterator<C8221a> it = this.f26588c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26590b;
                C1216l0.m37941w0(next.f26589a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13174o(wVar);
                    }
                });
            }
        }

        public void m13179j() {
            Iterator<C8221a> it = this.f26588c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26590b;
                C1216l0.m37941w0(next.f26589a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13173p(wVar);
                    }
                });
            }
        }

        public void m13178k(final int i) {
            Iterator<C8221a> it = this.f26588c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26590b;
                C1216l0.m37941w0(next.f26589a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13172q(wVar, i);
                    }
                });
            }
        }

        public void m13177l(final Exception exc) {
            Iterator<C8221a> it = this.f26588c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26590b;
                C1216l0.m37941w0(next.f26589a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13171r(wVar, exc);
                    }
                });
            }
        }

        public void m13176m() {
            Iterator<C8221a> it = this.f26588c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                final AbstractC8219w wVar = next.f26590b;
                C1216l0.m37941w0(next.f26589a, new Runnable() {
                    @Override
                    public final void run() {
                        AbstractC8219w.C8220a.this.m13170s(wVar);
                    }
                });
            }
        }

        public void m13169t(AbstractC8219w wVar) {
            Iterator<C8221a> it = this.f26588c.iterator();
            while (it.hasNext()) {
                C8221a next = it.next();
                if (next.f26590b == wVar) {
                    this.f26588c.remove(next);
                }
            }
        }

        public C8220a m13168u(int i, AbstractC7230t.C7231a aVar) {
            return new C8220a(this.f26588c, i, aVar);
        }

        public C8220a(CopyOnWriteArrayList<C8221a> copyOnWriteArrayList, int i, AbstractC7230t.C7231a aVar) {
            this.f26588c = copyOnWriteArrayList;
            this.f26586a = i;
            this.f26587b = aVar;
        }
    }

    void mo13195D(int i, AbstractC7230t.C7231a aVar);

    void mo13194F(int i, AbstractC7230t.C7231a aVar);

    void mo13193O(int i, AbstractC7230t.C7231a aVar, Exception exc);

    void mo13192P(int i, AbstractC7230t.C7231a aVar, int i2);

    void mo13191T(int i, AbstractC7230t.C7231a aVar);

    void mo13190X(int i, AbstractC7230t.C7231a aVar);

    @Deprecated
    void mo13189v(int i, AbstractC7230t.C7231a aVar);
}
