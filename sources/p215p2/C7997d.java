package p215p2;

import androidx.lifecycle.AbstractC0856o;
import androidx.lifecycle.C0852l;
import androidx.lifecycle.LiveData;
import p182n.AbstractC7094a;
import p243r2.AbstractC8354a;

public class C7997d {

    public class C7998a implements AbstractC0856o<In> {
        public Out f26043a = null;
        public final AbstractC8354a f26044b;
        public final Object f26045c;
        public final AbstractC7094a f26046d;
        public final C0852l f26047e;

        public class RunnableC7999a implements Runnable {
            public final Object f26048a;

            public RunnableC7999a(Object obj) {
                this.f26048a = obj;
            }

            @Override
            public void run() {
                synchronized (C7998a.this.f26045c) {
                    ?? apply = C7998a.this.f26046d.apply(this.f26048a);
                    C7998a aVar = C7998a.this;
                    Out out = aVar.f26043a;
                    if (out == 0 && apply != 0) {
                        aVar.f26043a = apply;
                        aVar.f26047e.mo39634k(apply);
                    } else if (out != 0 && !out.equals(apply)) {
                        C7998a aVar2 = C7998a.this;
                        aVar2.f26043a = apply;
                        aVar2.f26047e.mo39634k(apply);
                    }
                }
            }
        }

        public C7998a(AbstractC8354a aVar, Object obj, AbstractC7094a aVar2, C0852l lVar) {
            this.f26044b = aVar;
            this.f26045c = obj;
            this.f26046d = aVar2;
            this.f26047e = lVar;
        }

        @Override
        public void mo5597a(In in) {
            this.f26044b.mo12682b(new RunnableC7999a(in));
        }
    }

    public static <In, Out> LiveData<Out> m13805a(LiveData<In> liveData, AbstractC7094a<In, Out> aVar, AbstractC8354a aVar2) {
        Object obj = new Object();
        C0852l lVar = new C0852l();
        lVar.mo12251n(liveData, new C7998a(aVar2, obj, aVar, lVar));
        return lVar;
    }
}
