package o4;

import android.os.Handler;
import b5.i0;
import m3.o3;
import m3.y1;
import n3.p1;
import q3.w;

public interface s {

    public interface a {
    }

    public static final class b extends q {
        public b(Object obj) {
            super(obj);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(q qVar) {
            super(qVar);
        }
    }

    public interface c {
        void a(s sVar, o3 o3Var);
    }

    p a(b bVar, b5.b bVar2, long j10);

    void b(c cVar);

    void c(c cVar, i0 i0Var, p1 p1Var);

    void d(p pVar);

    void e(y yVar);

    void f(Handler handler, w wVar);

    y1 h();

    void i(w wVar);

    void j();

    void k(c cVar);

    boolean l();

    void m(c cVar);

    o3 n();

    void o(Handler handler, y yVar);
}
