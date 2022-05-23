package t6;

import d.j;
import java.util.Objects;

public final class a0 implements c0, y {
    public static final Object f22936c = new Object();
    public volatile c0 f22937a;
    public volatile Object f22938b = f22936c;

    public a0(c0 c0Var) {
        this.f22937a = c0Var;
    }

    public static y a(c0 c0Var) {
        if (c0Var instanceof y) {
            return (y) c0Var;
        }
        Objects.requireNonNull(c0Var);
        return new a0(c0Var);
    }

    public static c0 b(c0 c0Var) {
        Objects.requireNonNull(c0Var);
        return c0Var instanceof a0 ? c0Var : new a0(c0Var);
    }

    @Override
    public final Object zza() {
        Object obj = this.f22938b;
        Object obj2 = f22936c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f22938b;
                if (obj == obj2) {
                    obj = this.f22937a.zza();
                    Object obj3 = this.f22938b;
                    if (!(obj3 == obj2 || obj3 == obj)) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + j.J0 + valueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(valueOf);
                        sb2.append(" & ");
                        sb2.append(valueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f22938b = obj;
                    this.f22937a = null;
                }
            }
        }
        return obj;
    }
}
