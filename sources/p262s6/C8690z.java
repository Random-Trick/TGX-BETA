package p262s6;

public final class C8690z implements AbstractC8651c0 {
    public AbstractC8651c0 f28012a;

    public static void m11731a(AbstractC8651c0 c0Var, AbstractC8651c0 c0Var2) {
        C8690z zVar = (C8690z) c0Var;
        if (zVar.f28012a == null) {
            zVar.f28012a = c0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object zza() {
        AbstractC8651c0 c0Var = this.f28012a;
        if (c0Var != null) {
            return c0Var.zza();
        }
        throw new IllegalStateException();
    }
}
