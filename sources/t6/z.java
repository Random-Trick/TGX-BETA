package t6;

public final class z implements c0 {
    public c0 f22972a;

    public static void a(c0 c0Var, c0 c0Var2) {
        z zVar = (z) c0Var;
        if (zVar.f22972a == null) {
            zVar.f22972a = c0Var2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object zza() {
        c0 c0Var = this.f22972a;
        if (c0Var != null) {
            return c0Var.zza();
        }
        throw new IllegalStateException();
    }
}
