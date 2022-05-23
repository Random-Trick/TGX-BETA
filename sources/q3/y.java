package q3;

import android.os.Looper;
import m3.q1;
import n3.p1;
import q3.o;
import q3.w;

public interface y {
    public static final y f21372a;
    @Deprecated
    public static final y f21373b;

    public class a implements y {
        @Override
        public void a() {
            x.c(this);
        }

        @Override
        public void b() {
            x.b(this);
        }

        @Override
        public void c(Looper looper, p1 p1Var) {
        }

        @Override
        public int d(q1 q1Var) {
            return q1Var.X != null ? 1 : 0;
        }

        @Override
        public o e(w.a aVar, q1 q1Var) {
            if (q1Var.X == null) {
                return null;
            }
            return new e0(new o.a(new p0(1), 6001));
        }

        @Override
        public b f(w.a aVar, q1 q1Var) {
            return x.a(this, aVar, q1Var);
        }
    }

    public interface b {
        public static final b f21374a = z.f21375b;

        void a();
    }

    static {
        a aVar = new a();
        f21372a = aVar;
        f21373b = aVar;
    }

    void a();

    void b();

    void c(Looper looper, p1 p1Var);

    int d(q1 q1Var);

    o e(w.a aVar, q1 q1Var);

    b f(w.a aVar, q1 q1Var);
}
