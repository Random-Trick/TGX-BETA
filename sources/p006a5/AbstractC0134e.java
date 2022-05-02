package p006a5;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p006a5.AbstractC0134e;
import p020b5.C1186a;

public interface AbstractC0134e {

    public interface AbstractC0135a {

        public static final class C0136a {
            public final CopyOnWriteArrayList<C0137a> f501a = new CopyOnWriteArrayList<>();

            public static final class C0137a {
                public final Handler f502a;
                public final AbstractC0135a f503b;
                public boolean f504c;

                public C0137a(Handler handler, AbstractC0135a aVar) {
                    this.f502a = handler;
                    this.f503b = aVar;
                }

                public void m42226d() {
                    this.f504c = true;
                }
            }

            public static void m42231d(C0137a aVar, int i, long j, long j2) {
                aVar.f503b.mo17605x(i, j, j2);
            }

            public void m42233b(Handler handler, AbstractC0135a aVar) {
                C1186a.m38185e(handler);
                C1186a.m38185e(aVar);
                m42230e(aVar);
                this.f501a.add(new C0137a(handler, aVar));
            }

            public void m42232c(final int i, final long j, final long j2) {
                Iterator<C0137a> it = this.f501a.iterator();
                while (it.hasNext()) {
                    final C0137a next = it.next();
                    if (!next.f504c) {
                        next.f502a.post(new Runnable() {
                            @Override
                            public final void run() {
                                AbstractC0134e.AbstractC0135a.C0136a.m42231d(AbstractC0134e.AbstractC0135a.C0136a.C0137a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            public void m42230e(AbstractC0135a aVar) {
                Iterator<C0137a> it = this.f501a.iterator();
                while (it.hasNext()) {
                    C0137a next = it.next();
                    if (next.f503b == aVar) {
                        next.m42226d();
                        this.f501a.remove(next);
                    }
                }
            }
        }

        void mo17605x(int i, long j, long j2);
    }

    void mo42183a(Handler handler, AbstractC0135a aVar);

    AbstractC0150i0 mo42179e();

    void mo42177g(AbstractC0135a aVar);
}
