package p230q3;

import android.os.Looper;
import p174m3.C6600g1;
import p230q3.AbstractC8208o;
import p230q3.AbstractC8219w;

public interface AbstractC8223y {
    public static final AbstractC8223y f26591a;
    @Deprecated
    public static final AbstractC8223y f26592b;

    public class C8224a implements AbstractC8223y {
        @Override
        public void mo13164a() {
            C8222x.m13165c(this);
        }

        @Override
        public void mo13163b() {
            C8222x.m13166b(this);
        }

        @Override
        public int mo13162c(C6600g1 g1Var) {
            return g1Var.f20578X != null ? 1 : 0;
        }

        @Override
        public AbstractC8208o mo13161d(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var) {
            if (g1Var.f20578X == null) {
                return null;
            }
            return new C8167e0(new AbstractC8208o.C8209a(new C8210o0(1), 6001));
        }

        @Override
        public AbstractC8225b mo13160e(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var) {
            return C8222x.m13167a(this, looper, aVar, g1Var);
        }
    }

    public interface AbstractC8225b {
        public static final AbstractC8225b f26593a = C8226z.f26594b;

        void mo13159a();
    }

    static {
        C8224a aVar = new C8224a();
        f26591a = aVar;
        f26592b = aVar;
    }

    void mo13164a();

    void mo13163b();

    int mo13162c(C6600g1 g1Var);

    AbstractC8208o mo13161d(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var);

    AbstractC8225b mo13160e(Looper looper, AbstractC8219w.C8220a aVar, C6600g1 g1Var);
}
