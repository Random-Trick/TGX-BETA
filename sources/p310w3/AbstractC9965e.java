package p310w3;

import p020b5.C1189b0;
import p174m3.C6556a2;
import p270t3.AbstractC8974t;

public abstract class AbstractC9965e {
    public final AbstractC8974t f32383a;

    public static final class C9966a extends C6556a2 {
        public C9966a(String str) {
            super(str, null, false, 1);
        }
    }

    public AbstractC9965e(AbstractC8974t tVar) {
        this.f32383a = tVar;
    }

    public final boolean m6391a(C1189b0 b0Var, long j) {
        return mo6390b(b0Var) && mo6389c(b0Var, j);
    }

    public abstract boolean mo6390b(C1189b0 b0Var);

    public abstract boolean mo6389c(C1189b0 b0Var, long j);
}
