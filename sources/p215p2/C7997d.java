package p215p2;

import androidx.lifecycle.AbstractC0856o;
import androidx.lifecycle.C0852l;
import androidx.lifecycle.LiveData;
import p182n.AbstractC7094a;
import p243r2.AbstractC8354a;

public class C7997d {

    public class C7998a implements AbstractC0856o<In> {
        public Out f26046a = null;
        public final AbstractC8354a f26047b;
        public final Object f26048c;
        public final AbstractC7094a f26049d;
        public final C0852l f26050e;

        public class RunnableC7999a implements Runnable {
            public final Object f26051a;

            public RunnableC7999a(Object obj) {
                this.f26051a = obj;
            }

            @Override
            public void run() {
                synchronized (C7998a.this.f26048c) {
                    ?? apply = C7998a.this.f26049d.apply(this.f26051a);
                    C7998a aVar = C7998a.this;
                    Out out = aVar.f26046a;
                    if (out == 0 && apply != 0) {
                        aVar.f26046a = apply;
                        aVar.f26050e.mo39637k(apply);
                    } else if (out != 0 && !out.equals(apply)) {
                        C7998a aVar2 = C7998a.this;
                        aVar2.f26046a = apply;
                        aVar2.f26050e.mo39637k(apply);
                    }
                }
            }
        }

        public C7998a(AbstractC8354a aVar, Object obj, AbstractC7094a aVar2, C0852l lVar) {
            this.f26047b = aVar;
            this.f26048c = obj;
            this.f26049d = aVar2;
            this.f26050e = lVar;
        }

        @Override
        public void mo5597a(In in) {
            this.f26047b.mo12681b(new RunnableC7999a(in));
        }
    }

    public static <In, Out> LiveData<Out> m13804a(LiveData<In> liveData, AbstractC7094a<In, Out> aVar, AbstractC8354a aVar2) {
        Object obj = new Object();
        C0852l lVar = new C0852l();
        lVar.mo12250n(liveData, new C7998a(aVar2, obj, aVar, lVar));
        return lVar;
    }
}
