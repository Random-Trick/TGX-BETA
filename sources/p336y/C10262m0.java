package p336y;

import p336y.AbstractC10268n0;

public final class C10262m0 {
    public static boolean m5604a(AbstractC10268n0.EnumC10271c cVar, AbstractC10268n0.EnumC10271c cVar2) {
        AbstractC10268n0.EnumC10271c cVar3 = AbstractC10268n0.EnumC10271c.ALWAYS_OVERRIDE;
        if (cVar == cVar3 && cVar2 == cVar3) {
            return true;
        }
        AbstractC10268n0.EnumC10271c cVar4 = AbstractC10268n0.EnumC10271c.REQUIRED;
        return cVar == cVar4 && cVar2 == cVar4;
    }

    public static AbstractC10268n0 m5603b(AbstractC10268n0 n0Var, AbstractC10268n0 n0Var2) {
        C10284p1 p1Var;
        if (n0Var == null && n0Var2 == null) {
            return C10300t1.m5525G();
        }
        if (n0Var2 != null) {
            p1Var = C10284p1.m5568K(n0Var2);
        } else {
            p1Var = C10284p1.m5569J();
        }
        if (n0Var != null) {
            for (AbstractC10268n0.AbstractC10269a<?> aVar : n0Var.mo5425b()) {
                p1Var.mo5565y(aVar, n0Var.mo5423d(aVar), n0Var.mo5424c(aVar));
            }
        }
        return C10300t1.m5524H(p1Var);
    }
}
