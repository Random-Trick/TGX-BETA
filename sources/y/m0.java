package y;

import y.n0;

public final class m0 {
    public static boolean a(n0.c cVar, n0.c cVar2) {
        n0.c cVar3 = n0.c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        n0.c cVar4 = n0.c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    public static n0 b(n0 n0Var, n0 n0Var2) {
        p1 p1Var;
        if (n0Var == null && n0Var2 == null) {
            return t1.G();
        }
        if (n0Var2 != null) {
            p1Var = p1.K(n0Var2);
        } else {
            p1Var = p1.J();
        }
        if (n0Var != null) {
            for (n0.a<?> aVar : n0Var.b()) {
                p1Var.y(aVar, n0Var.d(aVar), n0Var.c(aVar));
            }
        }
        return t1.H(p1Var);
    }
}
