package p278tb;

import java.util.List;
import p123ia.C5304n;
import qa.C8294g;
import qa.C8298k;

public interface AbstractC9106p {
    public static final C9107a f29315b = new C9107a(null);
    public static final AbstractC9106p f29314a = new C9107a.C9108a();

    public static final class C9107a {

        public static final class C9108a implements AbstractC9106p {
            @Override
            public List<C9104o> mo10420a(C9125w wVar) {
                C8298k.m12933e(wVar, "url");
                return C5304n.m23367f();
            }

            @Override
            public void mo10419b(C9125w wVar, List<C9104o> list) {
                C8298k.m12933e(wVar, "url");
                C8298k.m12933e(list, "cookies");
            }
        }

        public C9107a() {
        }

        public C9107a(C8294g gVar) {
            this();
        }
    }

    List<C9104o> mo10420a(C9125w wVar);

    void mo10419b(C9125w wVar, List<C9104o> list);
}
