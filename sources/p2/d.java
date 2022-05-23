package p2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.l;
import androidx.lifecycle.o;

public class d {

    public class a implements o<In> {
        public Out f20411a = null;
        public final r2.a f20412b;
        public final Object f20413c;
        public final n.a f20414d;
        public final l f20415e;

        public class RunnableC0182a implements Runnable {
            public final Object f20416a;

            public RunnableC0182a(Object obj) {
                this.f20416a = obj;
            }

            @Override
            public void run() {
                synchronized (a.this.f20413c) {
                    ?? apply = a.this.f20414d.apply(this.f20416a);
                    a aVar = a.this;
                    Out out = aVar.f20411a;
                    if (out == 0 && apply != 0) {
                        aVar.f20411a = apply;
                        aVar.f20415e.k(apply);
                    } else if (out != 0 && !out.equals(apply)) {
                        a aVar2 = a.this;
                        aVar2.f20411a = apply;
                        aVar2.f20415e.k(apply);
                    }
                }
            }
        }

        public a(r2.a aVar, Object obj, n.a aVar2, l lVar) {
            this.f20412b = aVar;
            this.f20413c = obj;
            this.f20414d = aVar2;
            this.f20415e = lVar;
        }

        @Override
        public void a(In in) {
            this.f20412b.b(new RunnableC0182a(in));
        }
    }

    public static <In, Out> LiveData<Out> a(LiveData<In> liveData, n.a<In, Out> aVar, r2.a aVar2) {
        Object obj = new Object();
        l lVar = new l();
        lVar.n(liveData, new a(aVar2, obj, aVar, lVar));
        return lVar;
    }
}
