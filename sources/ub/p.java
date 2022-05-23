package ub;

import ja.n;
import java.util.List;
import ra.g;
import ra.k;

public interface p {
    public static final a f23916b = new a(null);
    public static final p f23915a = new a.C0225a();

    public static final class a {

        public static final class C0225a implements p {
            @Override
            public List<o> a(w wVar) {
                k.e(wVar, "url");
                return n.f();
            }

            @Override
            public void b(w wVar, List<o> list) {
                k.e(wVar, "url");
                k.e(list, "cookies");
            }
        }

        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    List<o> a(w wVar);

    void b(w wVar, List<o> list);
}
