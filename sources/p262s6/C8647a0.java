package p262s6;

import java.util.Objects;
import p039d.C3563j;

public final class C8647a0 implements AbstractC8651c0, AbstractC8689y {
    public static final Object f27979c = new Object();
    public volatile AbstractC8651c0 f27980a;
    public volatile Object f27981b = f27979c;

    public C8647a0(AbstractC8651c0 c0Var) {
        this.f27980a = c0Var;
    }

    public static AbstractC8689y m11811a(AbstractC8651c0 c0Var) {
        if (c0Var instanceof AbstractC8689y) {
            return (AbstractC8689y) c0Var;
        }
        Objects.requireNonNull(c0Var);
        return new C8647a0(c0Var);
    }

    public static AbstractC8651c0 m11810b(AbstractC8651c0 c0Var) {
        Objects.requireNonNull(c0Var);
        return c0Var instanceof C8647a0 ? c0Var : new C8647a0(c0Var);
    }

    @Override
    public final Object zza() {
        Object obj = this.f27981b;
        Object obj2 = f27979c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f27981b;
                if (obj == obj2) {
                    obj = this.f27980a.zza();
                    Object obj3 = this.f27981b;
                    if (!(obj3 == obj2 || obj3 == obj)) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + C3563j.f11947J0 + valueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(valueOf);
                        sb2.append(" & ");
                        sb2.append(valueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f27981b = obj;
                    this.f27980a = null;
                }
            }
        }
        return obj;
    }
}
