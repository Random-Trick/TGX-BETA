package b5;

import android.os.Handler;
import b5.e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface e {

    public interface a {

        public static final class C0054a {
            public final CopyOnWriteArrayList<C0055a> f3855a = new CopyOnWriteArrayList<>();

            public static final class C0055a {
                public final Handler f3856a;
                public final a f3857b;
                public boolean f3858c;

                public C0055a(Handler handler, a aVar) {
                    this.f3856a = handler;
                    this.f3857b = aVar;
                }

                public void d() {
                    this.f3858c = true;
                }
            }

            public static void d(C0055a aVar, int i10, long j10, long j11) {
                aVar.f3857b.O(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                c5.a.e(handler);
                c5.a.e(aVar);
                e(aVar);
                this.f3855a.add(new C0055a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                Iterator<C0055a> it = this.f3855a.iterator();
                while (it.hasNext()) {
                    final C0055a next = it.next();
                    if (!next.f3858c) {
                        next.f3856a.post(new Runnable() {
                            @Override
                            public final void run() {
                                e.a.C0054a.d(e.a.C0054a.C0055a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0055a> it = this.f3855a.iterator();
                while (it.hasNext()) {
                    C0055a next = it.next();
                    if (next.f3857b == aVar) {
                        next.d();
                        this.f3855a.remove(next);
                    }
                }
            }
        }

        void O(int i10, long j10, long j11);
    }

    void a(Handler handler, a aVar);

    void b(a aVar);

    i0 f();
}
