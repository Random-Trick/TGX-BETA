package s;

import r.a;
import y.j0;
import y.n0;
import y.n2;
import y.t1;

public class l0 implements j0.b {
    public static final l0 f22139a = new l0();

    @Override
    public void a(n2<?> n2Var, j0.a aVar) {
        j0 B = n2Var.B(null);
        n0 G = t1.G();
        int f10 = j0.a().f();
        if (B != null) {
            f10 = B.f();
            aVar.a(B.b());
            G = B.c();
        }
        aVar.n(G);
        a aVar2 = new a(n2Var);
        aVar.o(aVar2.J(f10));
        aVar.c(l1.d(aVar2.M(k0.c())));
        aVar.e(aVar2.H());
    }
}
